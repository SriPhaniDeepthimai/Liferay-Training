package com.studentobject.http.options.client.serdes.v1_0;

import com.studentobject.http.options.client.dto.v1_0.StudentsObject;
import com.studentobject.http.options.client.json.BaseJSONParser;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

/**
 * @author deepthimai.koppulu
 * @generated
 */
@Generated("")
public class StudentsObjectSerDes {

	public static StudentsObject toDTO(String json) {
		StudentsObjectJSONParser studentsObjectJSONParser =
			new StudentsObjectJSONParser();

		return studentsObjectJSONParser.parseToDTO(json);
	}

	public static StudentsObject[] toDTOs(String json) {
		StudentsObjectJSONParser studentsObjectJSONParser =
			new StudentsObjectJSONParser();

		return studentsObjectJSONParser.parseToDTOs(json);
	}

	public static String toJSON(StudentsObject studentsObject) {
		if (studentsObject == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (studentsObject.getDepartmentId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"departmentId\": ");

			sb.append(studentsObject.getDepartmentId());
		}

		if (studentsObject.getStudentId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"studentId\": ");

			sb.append(studentsObject.getStudentId());
		}

		if (studentsObject.getStudentName() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"studentName\": ");

			sb.append("\"");

			sb.append(_escape(studentsObject.getStudentName()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		StudentsObjectJSONParser studentsObjectJSONParser =
			new StudentsObjectJSONParser();

		return studentsObjectJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(StudentsObject studentsObject) {
		if (studentsObject == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (studentsObject.getDepartmentId() == null) {
			map.put("departmentId", null);
		}
		else {
			map.put(
				"departmentId",
				String.valueOf(studentsObject.getDepartmentId()));
		}

		if (studentsObject.getStudentId() == null) {
			map.put("studentId", null);
		}
		else {
			map.put("studentId", String.valueOf(studentsObject.getStudentId()));
		}

		if (studentsObject.getStudentName() == null) {
			map.put("studentName", null);
		}
		else {
			map.put(
				"studentName", String.valueOf(studentsObject.getStudentName()));
		}

		return map;
	}

	public static class StudentsObjectJSONParser
		extends BaseJSONParser<StudentsObject> {

		@Override
		protected StudentsObject createDTO() {
			return new StudentsObject();
		}

		@Override
		protected StudentsObject[] createDTOArray(int size) {
			return new StudentsObject[size];
		}

		@Override
		protected void setField(
			StudentsObject studentsObject, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "departmentId")) {
				if (jsonParserFieldValue != null) {
					studentsObject.setDepartmentId(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "studentId")) {
				if (jsonParserFieldValue != null) {
					studentsObject.setStudentId(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "studentName")) {
				if (jsonParserFieldValue != null) {
					studentsObject.setStudentName((String)jsonParserFieldValue);
				}
			}
		}

	}

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		for (String[] strings : BaseJSONParser.JSON_ESCAPE_STRINGS) {
			string = string.replace(strings[0], strings[1]);
		}

		return string;
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(entry.getKey());
			sb.append("\": ");

			Object value = entry.getValue();

			Class<?> valueClass = value.getClass();

			if (value instanceof Map) {
				sb.append(_toJSON((Map)value));
			}
			else if (valueClass.isArray()) {
				Object[] values = (Object[])value;

				sb.append("[");

				for (int i = 0; i < values.length; i++) {
					sb.append("\"");
					sb.append(_escape(values[i]));
					sb.append("\"");

					if ((i + 1) < values.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(entry.getValue()));
				sb.append("\"");
			}
			else {
				sb.append(String.valueOf(entry.getValue()));
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

}