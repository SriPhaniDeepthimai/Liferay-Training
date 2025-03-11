package com.details.rest.builder.client.dto.v1_0;

import com.details.rest.builder.client.function.UnsafeSupplier;
import com.details.rest.builder.client.serdes.v1_0.DetailsObjectSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author deepthimai.koppulu
 * @generated
 */
@Generated("")
public class DetailsObject implements Cloneable, Serializable {

	public static DetailsObject toDTO(String json) {
		return DetailsObjectSerDes.toDTO(json);
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public void setDepartmentId(
		UnsafeSupplier<Integer, Exception> departmentIdUnsafeSupplier) {

		try {
			departmentId = departmentIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer departmentId;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public void setStudentId(
		UnsafeSupplier<Integer, Exception> studentIdUnsafeSupplier) {

		try {
			studentId = studentIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer studentId;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentName(
		UnsafeSupplier<String, Exception> studentNameUnsafeSupplier) {

		try {
			studentName = studentNameUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String studentName;

	@Override
	public DetailsObject clone() throws CloneNotSupportedException {
		return (DetailsObject)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DetailsObject)) {
			return false;
		}

		DetailsObject detailsObject = (DetailsObject)object;

		return Objects.equals(toString(), detailsObject.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return DetailsObjectSerDes.toJSON(this);
	}

}