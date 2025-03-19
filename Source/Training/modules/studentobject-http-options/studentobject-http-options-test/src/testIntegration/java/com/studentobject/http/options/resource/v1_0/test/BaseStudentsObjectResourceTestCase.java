package com.studentobject.http.options.resource.v1_0.test;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;

import com.liferay.petra.reflect.ReflectionUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.json.JSONUtil;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.odata.entity.EntityField;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.vulcan.resource.EntityModelResource;

import com.studentobject.http.options.client.dto.v1_0.StudentsObject;
import com.studentobject.http.options.client.http.HttpInvoker;
import com.studentobject.http.options.client.pagination.Page;
import com.studentobject.http.options.client.resource.v1_0.StudentsObjectResource;
import com.studentobject.http.options.client.serdes.v1_0.StudentsObjectSerDes;

import java.lang.reflect.InvocationTargetException;

import java.text.DateFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.Generated;

import javax.ws.rs.core.MultivaluedHashMap;

import org.apache.commons.beanutils.BeanUtilsBean;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author deepthimai.koppulu
 * @generated
 */
@Generated("")
public abstract class BaseStudentsObjectResourceTestCase {

	@ClassRule
	@Rule
	public static final LiferayIntegrationTestRule liferayIntegrationTestRule =
		new LiferayIntegrationTestRule();

	@BeforeClass
	public static void setUpClass() throws Exception {
		_dateFormat = DateFormatFactoryUtil.getSimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");
	}

	@Before
	public void setUp() throws Exception {
		irrelevantGroup = GroupTestUtil.addGroup();
		testGroup = GroupTestUtil.addGroup();

		testCompany = CompanyLocalServiceUtil.getCompany(
			testGroup.getCompanyId());

		_studentsObjectResource.setContextCompany(testCompany);

		StudentsObjectResource.Builder builder =
			StudentsObjectResource.builder();

		studentsObjectResource = builder.authentication(
			"test@liferay.com", "test"
		).locale(
			LocaleUtil.getDefault()
		).build();
	}

	@After
	public void tearDown() throws Exception {
		GroupTestUtil.deleteGroup(irrelevantGroup);
		GroupTestUtil.deleteGroup(testGroup);
	}

	@Test
	public void testClientSerDesToDTO() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper() {
			{
				configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
				configure(
					SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
				enable(SerializationFeature.INDENT_OUTPUT);
				setDateFormat(new ISO8601DateFormat());
				setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
				setSerializationInclusion(JsonInclude.Include.NON_NULL);
				setVisibility(
					PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
				setVisibility(
					PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE);
			}
		};

		StudentsObject studentsObject1 = randomStudentsObject();

		String json = objectMapper.writeValueAsString(studentsObject1);

		StudentsObject studentsObject2 = StudentsObjectSerDes.toDTO(json);

		Assert.assertTrue(equals(studentsObject1, studentsObject2));
	}

	@Test
	public void testClientSerDesToJSON() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper() {
			{
				configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
				configure(
					SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
				setDateFormat(new ISO8601DateFormat());
				setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
				setSerializationInclusion(JsonInclude.Include.NON_NULL);
				setVisibility(
					PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
				setVisibility(
					PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE);
			}
		};

		StudentsObject studentsObject = randomStudentsObject();

		String json1 = objectMapper.writeValueAsString(studentsObject);
		String json2 = StudentsObjectSerDes.toJSON(studentsObject);

		Assert.assertEquals(
			objectMapper.readTree(json1), objectMapper.readTree(json2));
	}

	@Test
	public void testEscapeRegexInStringFields() throws Exception {
		String regex = "^[0-9]+(\\.[0-9]{1,2})\"?";

		StudentsObject studentsObject = randomStudentsObject();

		studentsObject.setStudentName(regex);

		String json = StudentsObjectSerDes.toJSON(studentsObject);

		Assert.assertFalse(json.contains(regex));

		studentsObject = StudentsObjectSerDes.toDTO(json);

		Assert.assertEquals(regex, studentsObject.getStudentName());
	}

	@Test
	public void testCreateStudentObject() throws Exception {
		StudentsObject randomStudentsObject = randomStudentsObject();

		StudentsObject postStudentsObject =
			testCreateStudentObject_addStudentsObject(randomStudentsObject);

		assertEquals(randomStudentsObject, postStudentsObject);
		assertValid(postStudentsObject);
	}

	protected StudentsObject testCreateStudentObject_addStudentsObject(
			StudentsObject studentsObject)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGetStudentObjects() throws Exception {
		Page<StudentsObject> page = studentsObjectResource.getStudentObjects();

		long totalCount = page.getTotalCount();

		StudentsObject studentsObject1 =
			testGetStudentObjects_addStudentsObject(randomStudentsObject());

		StudentsObject studentsObject2 =
			testGetStudentObjects_addStudentsObject(randomStudentsObject());

		page = studentsObjectResource.getStudentObjects();

		Assert.assertEquals(totalCount + 2, page.getTotalCount());

		assertContains(studentsObject1, (List<StudentsObject>)page.getItems());
		assertContains(studentsObject2, (List<StudentsObject>)page.getItems());
		assertValid(page);
	}

	protected StudentsObject testGetStudentObjects_addStudentsObject(
			StudentsObject studentsObject)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testUpdateStudent() throws Exception {
		StudentsObject randomStudentsObject = randomStudentsObject();

		StudentsObject postStudentsObject = testUpdateStudent_addStudentsObject(
			randomStudentsObject);

		assertEquals(randomStudentsObject, postStudentsObject);
		assertValid(postStudentsObject);
	}

	protected StudentsObject testUpdateStudent_addStudentsObject(
			StudentsObject studentsObject)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testDeleteStudentObject() throws Exception {
		Assert.assertTrue(false);
	}

	@Test
	public void testGraphQLDeleteStudentObject() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGraphQLDeleteStudentObjectNotFound() throws Exception {
		Assert.assertTrue(true);
	}

	protected void assertContains(
		StudentsObject studentsObject, List<StudentsObject> studentsObjects) {

		boolean contains = false;

		for (StudentsObject item : studentsObjects) {
			if (equals(studentsObject, item)) {
				contains = true;

				break;
			}
		}

		Assert.assertTrue(
			studentsObjects + " does not contain " + studentsObject, contains);
	}

	protected void assertHttpResponseStatusCode(
		int expectedHttpResponseStatusCode,
		HttpInvoker.HttpResponse actualHttpResponse) {

		Assert.assertEquals(
			expectedHttpResponseStatusCode, actualHttpResponse.getStatusCode());
	}

	protected void assertEquals(
		StudentsObject studentsObject1, StudentsObject studentsObject2) {

		Assert.assertTrue(
			studentsObject1 + " does not equal " + studentsObject2,
			equals(studentsObject1, studentsObject2));
	}

	protected void assertEquals(
		List<StudentsObject> studentsObjects1,
		List<StudentsObject> studentsObjects2) {

		Assert.assertEquals(studentsObjects1.size(), studentsObjects2.size());

		for (int i = 0; i < studentsObjects1.size(); i++) {
			StudentsObject studentsObject1 = studentsObjects1.get(i);
			StudentsObject studentsObject2 = studentsObjects2.get(i);

			assertEquals(studentsObject1, studentsObject2);
		}
	}

	protected void assertEqualsIgnoringOrder(
		List<StudentsObject> studentsObjects1,
		List<StudentsObject> studentsObjects2) {

		Assert.assertEquals(studentsObjects1.size(), studentsObjects2.size());

		for (StudentsObject studentsObject1 : studentsObjects1) {
			boolean contains = false;

			for (StudentsObject studentsObject2 : studentsObjects2) {
				if (equals(studentsObject1, studentsObject2)) {
					contains = true;

					break;
				}
			}

			Assert.assertTrue(
				studentsObjects2 + " does not contain " + studentsObject1,
				contains);
		}
	}

	protected void assertValid(StudentsObject studentsObject) throws Exception {
		boolean valid = true;

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("departmentId", additionalAssertFieldName)) {
				if (studentsObject.getDepartmentId() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("studentId", additionalAssertFieldName)) {
				if (studentsObject.getStudentId() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("studentName", additionalAssertFieldName)) {
				if (studentsObject.getStudentName() == null) {
					valid = false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		Assert.assertTrue(valid);
	}

	protected void assertValid(Page<StudentsObject> page) {
		boolean valid = false;

		java.util.Collection<StudentsObject> studentsObjects = page.getItems();

		int size = studentsObjects.size();

		if ((page.getLastPage() > 0) && (page.getPage() > 0) &&
			(page.getPageSize() > 0) && (page.getTotalCount() > 0) &&
			(size > 0)) {

			valid = true;
		}

		Assert.assertTrue(valid);
	}

	protected String[] getAdditionalAssertFieldNames() {
		return new String[0];
	}

	protected List<GraphQLField> getGraphQLFields() throws Exception {
		List<GraphQLField> graphQLFields = new ArrayList<>();

		for (java.lang.reflect.Field field :
				getDeclaredFields(
					com.studentobject.http.options.dto.v1_0.StudentsObject.
						class)) {

			if (!ArrayUtil.contains(
					getAdditionalAssertFieldNames(), field.getName())) {

				continue;
			}

			graphQLFields.addAll(getGraphQLFields(field));
		}

		return graphQLFields;
	}

	protected List<GraphQLField> getGraphQLFields(
			java.lang.reflect.Field... fields)
		throws Exception {

		List<GraphQLField> graphQLFields = new ArrayList<>();

		for (java.lang.reflect.Field field : fields) {
			com.liferay.portal.vulcan.graphql.annotation.GraphQLField
				vulcanGraphQLField = field.getAnnotation(
					com.liferay.portal.vulcan.graphql.annotation.GraphQLField.
						class);

			if (vulcanGraphQLField != null) {
				Class<?> clazz = field.getType();

				if (clazz.isArray()) {
					clazz = clazz.getComponentType();
				}

				List<GraphQLField> childrenGraphQLFields = getGraphQLFields(
					getDeclaredFields(clazz));

				graphQLFields.add(
					new GraphQLField(field.getName(), childrenGraphQLFields));
			}
		}

		return graphQLFields;
	}

	protected String[] getIgnoredEntityFieldNames() {
		return new String[0];
	}

	protected boolean equals(
		StudentsObject studentsObject1, StudentsObject studentsObject2) {

		if (studentsObject1 == studentsObject2) {
			return true;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("departmentId", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						studentsObject1.getDepartmentId(),
						studentsObject2.getDepartmentId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("studentId", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						studentsObject1.getStudentId(),
						studentsObject2.getStudentId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("studentName", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						studentsObject1.getStudentName(),
						studentsObject2.getStudentName())) {

					return false;
				}

				continue;
			}

			throw new IllegalArgumentException(
				"Invalid additional assert field name " +
					additionalAssertFieldName);
		}

		return true;
	}

	protected boolean equals(
		Map<String, Object> map1, Map<String, Object> map2) {

		if (Objects.equals(map1.keySet(), map2.keySet())) {
			for (Map.Entry<String, Object> entry : map1.entrySet()) {
				if (entry.getValue() instanceof Map) {
					if (!equals(
							(Map)entry.getValue(),
							(Map)map2.get(entry.getKey()))) {

						return false;
					}
				}
				else if (!Objects.deepEquals(
							entry.getValue(), map2.get(entry.getKey()))) {

					return false;
				}
			}

			return true;
		}

		return false;
	}

	protected java.lang.reflect.Field[] getDeclaredFields(Class clazz)
		throws Exception {

		Stream<java.lang.reflect.Field> stream = Stream.of(
			ReflectionUtil.getDeclaredFields(clazz));

		return stream.filter(
			field -> !field.isSynthetic()
		).toArray(
			java.lang.reflect.Field[]::new
		);
	}

	protected java.util.Collection<EntityField> getEntityFields()
		throws Exception {

		if (!(_studentsObjectResource instanceof EntityModelResource)) {
			throw new UnsupportedOperationException(
				"Resource is not an instance of EntityModelResource");
		}

		EntityModelResource entityModelResource =
			(EntityModelResource)_studentsObjectResource;

		EntityModel entityModel = entityModelResource.getEntityModel(
			new MultivaluedHashMap());

		Map<String, EntityField> entityFieldsMap =
			entityModel.getEntityFieldsMap();

		return entityFieldsMap.values();
	}

	protected List<EntityField> getEntityFields(EntityField.Type type)
		throws Exception {

		java.util.Collection<EntityField> entityFields = getEntityFields();

		Stream<EntityField> stream = entityFields.stream();

		return stream.filter(
			entityField ->
				Objects.equals(entityField.getType(), type) &&
				!ArrayUtil.contains(
					getIgnoredEntityFieldNames(), entityField.getName())
		).collect(
			Collectors.toList()
		);
	}

	protected String getFilterString(
		EntityField entityField, String operator,
		StudentsObject studentsObject) {

		StringBundler sb = new StringBundler();

		String entityFieldName = entityField.getName();

		sb.append(entityFieldName);

		sb.append(" ");
		sb.append(operator);
		sb.append(" ");

		if (entityFieldName.equals("departmentId")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("studentId")) {
			throw new IllegalArgumentException(
				"Invalid entity field " + entityFieldName);
		}

		if (entityFieldName.equals("studentName")) {
			sb.append("'");
			sb.append(String.valueOf(studentsObject.getStudentName()));
			sb.append("'");

			return sb.toString();
		}

		throw new IllegalArgumentException(
			"Invalid entity field " + entityFieldName);
	}

	protected String invoke(String query) throws Exception {
		HttpInvoker httpInvoker = HttpInvoker.newHttpInvoker();

		httpInvoker.body(
			JSONUtil.put(
				"query", query
			).toString(),
			"application/json");
		httpInvoker.httpMethod(HttpInvoker.HttpMethod.POST);
		httpInvoker.path("http://localhost:8080/o/graphql");
		httpInvoker.userNameAndPassword("test@liferay.com:test");

		HttpInvoker.HttpResponse httpResponse = httpInvoker.invoke();

		return httpResponse.getContent();
	}

	protected JSONObject invokeGraphQLMutation(GraphQLField graphQLField)
		throws Exception {

		GraphQLField mutationGraphQLField = new GraphQLField(
			"mutation", graphQLField);

		return JSONFactoryUtil.createJSONObject(
			invoke(mutationGraphQLField.toString()));
	}

	protected JSONObject invokeGraphQLQuery(GraphQLField graphQLField)
		throws Exception {

		GraphQLField queryGraphQLField = new GraphQLField(
			"query", graphQLField);

		return JSONFactoryUtil.createJSONObject(
			invoke(queryGraphQLField.toString()));
	}

	protected StudentsObject randomStudentsObject() throws Exception {
		return new StudentsObject() {
			{
				departmentId = RandomTestUtil.randomInt();
				studentId = RandomTestUtil.randomInt();
				studentName = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
			}
		};
	}

	protected StudentsObject randomIrrelevantStudentsObject() throws Exception {
		StudentsObject randomIrrelevantStudentsObject = randomStudentsObject();

		return randomIrrelevantStudentsObject;
	}

	protected StudentsObject randomPatchStudentsObject() throws Exception {
		return randomStudentsObject();
	}

	protected StudentsObjectResource studentsObjectResource;
	protected Group irrelevantGroup;
	protected Company testCompany;
	protected Group testGroup;

	protected class GraphQLField {

		public GraphQLField(String key, GraphQLField... graphQLFields) {
			this(key, new HashMap<>(), graphQLFields);
		}

		public GraphQLField(String key, List<GraphQLField> graphQLFields) {
			this(key, new HashMap<>(), graphQLFields);
		}

		public GraphQLField(
			String key, Map<String, Object> parameterMap,
			GraphQLField... graphQLFields) {

			_key = key;
			_parameterMap = parameterMap;
			_graphQLFields = Arrays.asList(graphQLFields);
		}

		public GraphQLField(
			String key, Map<String, Object> parameterMap,
			List<GraphQLField> graphQLFields) {

			_key = key;
			_parameterMap = parameterMap;
			_graphQLFields = graphQLFields;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder(_key);

			if (!_parameterMap.isEmpty()) {
				sb.append("(");

				for (Map.Entry<String, Object> entry :
						_parameterMap.entrySet()) {

					sb.append(entry.getKey());
					sb.append(": ");
					sb.append(entry.getValue());
					sb.append(", ");
				}

				sb.setLength(sb.length() - 2);

				sb.append(")");
			}

			if (!_graphQLFields.isEmpty()) {
				sb.append("{");

				for (GraphQLField graphQLField : _graphQLFields) {
					sb.append(graphQLField.toString());
					sb.append(", ");
				}

				sb.setLength(sb.length() - 2);

				sb.append("}");
			}

			return sb.toString();
		}

		private final List<GraphQLField> _graphQLFields;
		private final String _key;
		private final Map<String, Object> _parameterMap;

	}

	private static final com.liferay.portal.kernel.log.Log _log =
		LogFactoryUtil.getLog(BaseStudentsObjectResourceTestCase.class);

	private static BeanUtilsBean _beanUtilsBean = new BeanUtilsBean() {

		@Override
		public void copyProperty(Object bean, String name, Object value)
			throws IllegalAccessException, InvocationTargetException {

			if (value != null) {
				super.copyProperty(bean, name, value);
			}
		}

	};
	private static DateFormat _dateFormat;

	@Inject
	private com.studentobject.http.options.resource.v1_0.StudentsObjectResource
		_studentsObjectResource;

}