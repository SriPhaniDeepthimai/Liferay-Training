package com.details.rest.builder.resource.v1_0.test;

import com.details.rest.builder.client.dto.v1_0.DetailsObject;
import com.details.rest.builder.client.http.HttpInvoker;
import com.details.rest.builder.client.pagination.Page;
import com.details.rest.builder.client.pagination.Pagination;
import com.details.rest.builder.client.resource.v1_0.DetailsObjectResource;
import com.details.rest.builder.client.serdes.v1_0.DetailsObjectSerDes;

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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.odata.entity.EntityField;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.test.rule.Inject;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.vulcan.resource.EntityModelResource;

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
public abstract class BaseDetailsObjectResourceTestCase {

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

		_detailsObjectResource.setContextCompany(testCompany);

		DetailsObjectResource.Builder builder = DetailsObjectResource.builder();

		detailsObjectResource = builder.authentication(
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

		DetailsObject detailsObject1 = randomDetailsObject();

		String json = objectMapper.writeValueAsString(detailsObject1);

		DetailsObject detailsObject2 = DetailsObjectSerDes.toDTO(json);

		Assert.assertTrue(equals(detailsObject1, detailsObject2));
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

		DetailsObject detailsObject = randomDetailsObject();

		String json1 = objectMapper.writeValueAsString(detailsObject);
		String json2 = DetailsObjectSerDes.toJSON(detailsObject);

		Assert.assertEquals(
			objectMapper.readTree(json1), objectMapper.readTree(json2));
	}

	@Test
	public void testEscapeRegexInStringFields() throws Exception {
		String regex = "^[0-9]+(\\.[0-9]{1,2})\"?";

		DetailsObject detailsObject = randomDetailsObject();

		detailsObject.setStudentName(regex);

		String json = DetailsObjectSerDes.toJSON(detailsObject);

		Assert.assertFalse(json.contains(regex));

		detailsObject = DetailsObjectSerDes.toDTO(json);

		Assert.assertEquals(regex, detailsObject.getStudentName());
	}

	@Test
	public void testCreateStudent() throws Exception {
		DetailsObject randomDetailsObject = randomDetailsObject();

		DetailsObject postDetailsObject = testCreateStudent_addDetailsObject(
			randomDetailsObject);

		assertEquals(randomDetailsObject, postDetailsObject);
		assertValid(postDetailsObject);
	}

	protected DetailsObject testCreateStudent_addDetailsObject(
			DetailsObject detailsObject)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testGetStudentByDepartmentId() throws Exception {
		Integer departmentId = testGetStudentByDepartmentId_getDepartmentId();
		Integer irrelevantDepartmentId =
			testGetStudentByDepartmentId_getIrrelevantDepartmentId();

		Page<DetailsObject> page =
			detailsObjectResource.getStudentByDepartmentId(departmentId);

		Assert.assertEquals(0, page.getTotalCount());

		if (irrelevantDepartmentId != null) {
			DetailsObject irrelevantDetailsObject =
				testGetStudentByDepartmentId_addDetailsObject(
					irrelevantDepartmentId, randomIrrelevantDetailsObject());

			page = detailsObjectResource.getStudentByDepartmentId(
				irrelevantDepartmentId);

			Assert.assertEquals(1, page.getTotalCount());

			assertEquals(
				Arrays.asList(irrelevantDetailsObject),
				(List<DetailsObject>)page.getItems());
			assertValid(page);
		}

		DetailsObject detailsObject1 =
			testGetStudentByDepartmentId_addDetailsObject(
				departmentId, randomDetailsObject());

		DetailsObject detailsObject2 =
			testGetStudentByDepartmentId_addDetailsObject(
				departmentId, randomDetailsObject());

		page = detailsObjectResource.getStudentByDepartmentId(departmentId);

		Assert.assertEquals(2, page.getTotalCount());

		assertEqualsIgnoringOrder(
			Arrays.asList(detailsObject1, detailsObject2),
			(List<DetailsObject>)page.getItems());
		assertValid(page);
	}

	protected DetailsObject testGetStudentByDepartmentId_addDetailsObject(
			Integer departmentId, DetailsObject detailsObject)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected Integer testGetStudentByDepartmentId_getDepartmentId()
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	protected Integer testGetStudentByDepartmentId_getIrrelevantDepartmentId()
		throws Exception {

		return null;
	}

	@Test
	public void testGetStudents() throws Exception {
		Page<DetailsObject> page = detailsObjectResource.getStudents(
			Pagination.of(1, 10));

		long totalCount = page.getTotalCount();

		DetailsObject detailsObject1 = testGetStudents_addDetailsObject(
			randomDetailsObject());

		DetailsObject detailsObject2 = testGetStudents_addDetailsObject(
			randomDetailsObject());

		page = detailsObjectResource.getStudents(Pagination.of(1, 10));

		Assert.assertEquals(totalCount + 2, page.getTotalCount());

		assertContains(detailsObject1, (List<DetailsObject>)page.getItems());
		assertContains(detailsObject2, (List<DetailsObject>)page.getItems());
		assertValid(page);
	}

	@Test
	public void testGetStudentsWithPagination() throws Exception {
		Page<DetailsObject> totalPage = detailsObjectResource.getStudents(null);

		int totalCount = GetterUtil.getInteger(totalPage.getTotalCount());

		DetailsObject detailsObject1 = testGetStudents_addDetailsObject(
			randomDetailsObject());

		DetailsObject detailsObject2 = testGetStudents_addDetailsObject(
			randomDetailsObject());

		DetailsObject detailsObject3 = testGetStudents_addDetailsObject(
			randomDetailsObject());

		Page<DetailsObject> page1 = detailsObjectResource.getStudents(
			Pagination.of(1, totalCount + 2));

		List<DetailsObject> detailsObjects1 =
			(List<DetailsObject>)page1.getItems();

		Assert.assertEquals(
			detailsObjects1.toString(), totalCount + 2, detailsObjects1.size());

		Page<DetailsObject> page2 = detailsObjectResource.getStudents(
			Pagination.of(2, totalCount + 2));

		Assert.assertEquals(totalCount + 3, page2.getTotalCount());

		List<DetailsObject> detailsObjects2 =
			(List<DetailsObject>)page2.getItems();

		Assert.assertEquals(
			detailsObjects2.toString(), 1, detailsObjects2.size());

		Page<DetailsObject> page3 = detailsObjectResource.getStudents(
			Pagination.of(1, totalCount + 3));

		assertContains(detailsObject1, (List<DetailsObject>)page3.getItems());
		assertContains(detailsObject2, (List<DetailsObject>)page3.getItems());
		assertContains(detailsObject3, (List<DetailsObject>)page3.getItems());
	}

	protected DetailsObject testGetStudents_addDetailsObject(
			DetailsObject detailsObject)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testUpdateStudent() throws Exception {
		DetailsObject randomDetailsObject = randomDetailsObject();

		DetailsObject postDetailsObject = testUpdateStudent_addDetailsObject(
			randomDetailsObject);

		assertEquals(randomDetailsObject, postDetailsObject);
		assertValid(postDetailsObject);
	}

	protected DetailsObject testUpdateStudent_addDetailsObject(
			DetailsObject detailsObject)
		throws Exception {

		throw new UnsupportedOperationException(
			"This method needs to be implemented");
	}

	@Test
	public void testDeleteStudentByStudentId() throws Exception {
		Assert.assertTrue(false);
	}

	protected void assertContains(
		DetailsObject detailsObject, List<DetailsObject> detailsObjects) {

		boolean contains = false;

		for (DetailsObject item : detailsObjects) {
			if (equals(detailsObject, item)) {
				contains = true;

				break;
			}
		}

		Assert.assertTrue(
			detailsObjects + " does not contain " + detailsObject, contains);
	}

	protected void assertHttpResponseStatusCode(
		int expectedHttpResponseStatusCode,
		HttpInvoker.HttpResponse actualHttpResponse) {

		Assert.assertEquals(
			expectedHttpResponseStatusCode, actualHttpResponse.getStatusCode());
	}

	protected void assertEquals(
		DetailsObject detailsObject1, DetailsObject detailsObject2) {

		Assert.assertTrue(
			detailsObject1 + " does not equal " + detailsObject2,
			equals(detailsObject1, detailsObject2));
	}

	protected void assertEquals(
		List<DetailsObject> detailsObjects1,
		List<DetailsObject> detailsObjects2) {

		Assert.assertEquals(detailsObjects1.size(), detailsObjects2.size());

		for (int i = 0; i < detailsObjects1.size(); i++) {
			DetailsObject detailsObject1 = detailsObjects1.get(i);
			DetailsObject detailsObject2 = detailsObjects2.get(i);

			assertEquals(detailsObject1, detailsObject2);
		}
	}

	protected void assertEqualsIgnoringOrder(
		List<DetailsObject> detailsObjects1,
		List<DetailsObject> detailsObjects2) {

		Assert.assertEquals(detailsObjects1.size(), detailsObjects2.size());

		for (DetailsObject detailsObject1 : detailsObjects1) {
			boolean contains = false;

			for (DetailsObject detailsObject2 : detailsObjects2) {
				if (equals(detailsObject1, detailsObject2)) {
					contains = true;

					break;
				}
			}

			Assert.assertTrue(
				detailsObjects2 + " does not contain " + detailsObject1,
				contains);
		}
	}

	protected void assertValid(DetailsObject detailsObject) throws Exception {
		boolean valid = true;

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("departmentId", additionalAssertFieldName)) {
				if (detailsObject.getDepartmentId() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("studentId", additionalAssertFieldName)) {
				if (detailsObject.getStudentId() == null) {
					valid = false;
				}

				continue;
			}

			if (Objects.equals("studentName", additionalAssertFieldName)) {
				if (detailsObject.getStudentName() == null) {
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

	protected void assertValid(Page<DetailsObject> page) {
		boolean valid = false;

		java.util.Collection<DetailsObject> detailsObjects = page.getItems();

		int size = detailsObjects.size();

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
					com.details.rest.builder.dto.v1_0.DetailsObject.class)) {

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
		DetailsObject detailsObject1, DetailsObject detailsObject2) {

		if (detailsObject1 == detailsObject2) {
			return true;
		}

		for (String additionalAssertFieldName :
				getAdditionalAssertFieldNames()) {

			if (Objects.equals("departmentId", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						detailsObject1.getDepartmentId(),
						detailsObject2.getDepartmentId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("studentId", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						detailsObject1.getStudentId(),
						detailsObject2.getStudentId())) {

					return false;
				}

				continue;
			}

			if (Objects.equals("studentName", additionalAssertFieldName)) {
				if (!Objects.deepEquals(
						detailsObject1.getStudentName(),
						detailsObject2.getStudentName())) {

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

		if (!(_detailsObjectResource instanceof EntityModelResource)) {
			throw new UnsupportedOperationException(
				"Resource is not an instance of EntityModelResource");
		}

		EntityModelResource entityModelResource =
			(EntityModelResource)_detailsObjectResource;

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
		EntityField entityField, String operator, DetailsObject detailsObject) {

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
			sb.append(String.valueOf(detailsObject.getStudentName()));
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

	protected DetailsObject randomDetailsObject() throws Exception {
		return new DetailsObject() {
			{
				departmentId = RandomTestUtil.randomInt();
				studentId = RandomTestUtil.randomInt();
				studentName = StringUtil.toLowerCase(
					RandomTestUtil.randomString());
			}
		};
	}

	protected DetailsObject randomIrrelevantDetailsObject() throws Exception {
		DetailsObject randomIrrelevantDetailsObject = randomDetailsObject();

		return randomIrrelevantDetailsObject;
	}

	protected DetailsObject randomPatchDetailsObject() throws Exception {
		return randomDetailsObject();
	}

	protected DetailsObjectResource detailsObjectResource;
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
		LogFactoryUtil.getLog(BaseDetailsObjectResourceTestCase.class);

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
	private com.details.rest.builder.resource.v1_0.DetailsObjectResource
		_detailsObjectResource;

}