package br.com.linstoque.estoque.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	private String name;
	private String fullName;
	private String phoneNumber;
	private String email;
	private String password;
	private String department;
	private String employeeBadge;
	private Integer typeAccess;
	
	public User() {
	}

	public User(Long userId, String name, String fullName, String phoneNumber, String email, String password,
			String department, String employeeBadge, Integer typeAccess) {
		super();
		this.userId = userId;
		this.name = name;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
		this.department = department;
		this.employeeBadge = employeeBadge;
		this.typeAccess = typeAccess;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmployeeBadge() {
		return employeeBadge;
	}

	public void setEmployeeBadge(String employeeBadge) {
		this.employeeBadge = employeeBadge;
	}

	public Integer getTypeAccess() {
		return typeAccess;
	}

	public void setTypeAccess(Integer typeAccess) {
		this.typeAccess = typeAccess;
	}

	@Override
	public int hashCode() {
		return Objects.hash(userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(userId, other.userId);
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + ", password=" + password + ", department=" + department + ", employeeBadge="
				+ employeeBadge + ", typeAccess=" + typeAccess + "]";
	}
}
