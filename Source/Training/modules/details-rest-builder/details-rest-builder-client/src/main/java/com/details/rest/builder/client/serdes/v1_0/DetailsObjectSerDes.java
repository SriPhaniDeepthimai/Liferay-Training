package com.details.rest.builder.client.serdes.v1_0;

import com.details.rest.builder.client.dto.v1_0.DetailsObject;
import com.details.rest.builder.client.json.BaseJSONParser;

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
public class DetailsObjectSerDes {

	public static DetailsObject toDTO(String json) {
		DetailsObjectJSONParser detailsObjectJSONParser =
			new DetailsObjectJSONParser();

		return detailsObjectJSONParser.parseToDTO(json);
	}

	public static DetailsObject[] toDTOs(String json) {
		DetailsObjectJSONParser detailsObjectJSONParser =
			new DetailsObjectJSONParser();

		return detailsObjectJSONParser.parseToDTOs(json);
	}

	public static String toJSON(DetailsObject detailsObject) {
		if (detailsObject == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (detailsObject.getDepartmentId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"departmentId\": ");

			sb.append(detailsObject.getDepartmentId());
		}

		if (detailsObject.getStudentId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"studentId\": ");

			sb.append(detailsObject.getStudentId());
		}

		if (detailsObject.getStudentName() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"studentName\": ");

			sb.append("\"");

			sb.append(_escape(detailsObject.getStudentName()));

			sb.append("\"");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		DetailsObjectJSONParser detailsObjectJSONParser =
			new DetailsObjectJSONParser();

		return detailsObjectJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(DetailsObject detailsObject) {
		if (detailsObject == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (detailsObject.getDepartmentId() == null) {
			map.put("departmentId", null);
		}
		else {
			map.put(
				"departmentId",
				String.valueOf(detailsObject.getDepartmentId()));
		}

		if (detailsObject.getStudentId() == null) {
			map.put("studentId", null);
		}
		else {
			map.put("studentId", String.valueOf(detailsObject.getStudentId()));
		}

		if (detailsObject.getStudentName() == null) {
			map.put("studentName", null);
		}
		else {
			map.put(
				"studentName", String.valueOf(detailsObject.getStudentName()));
		}

		return map;
	}

	public static class DetailsObjectJSONParser
		extends BaseJSONParser<DetailsObject> {

		@Override
		protected DetailsObject createDTO() {
			return new DetailsObject();
		}

		@Override
		protected DetailsObject[] createDTOArray(int size) {
			return new DetailsObject[size];
		}

		@Override
		protected void setField(
			DetailsObject detailsObject, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "departmentId")) {
				if (jsonParserFieldValue != null) {
					detailsObject.setDepartmentId(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "studentId")) {
				if (jsonParserFieldValue != null) {
					detailsObject.setStudentId(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "studentName")) {
				if (jsonParserFieldValue != null) {
					detailsObject.setStudentName((String)jsonParserFieldValue);
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