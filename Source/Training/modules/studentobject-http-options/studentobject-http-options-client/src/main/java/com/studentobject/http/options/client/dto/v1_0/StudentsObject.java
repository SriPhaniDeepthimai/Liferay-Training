package com.studentobject.http.options.client.dto.v1_0;

import com.studentobject.http.options.client.function.UnsafeSupplier;
import com.studentobject.http.options.client.serdes.v1_0.StudentsObjectSerDes;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author deepthimai.koppulu
 * @generated
 */
@Generated("")
public class StudentsObject implements Cloneable, Serializable {

	public static StudentsObject toDTO(String json) {
		return StudentsObjectSerDes.toDTO(json);
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
	public StudentsObject clone() throws CloneNotSupportedException {
		return (StudentsObject)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof StudentsObject)) {
			return false;
		}

		StudentsObject studentsObject = (StudentsObject)object;

		return Objects.equals(toString(), studentsObject.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return StudentsObjectSerDes.toJSON(this);
	}

}