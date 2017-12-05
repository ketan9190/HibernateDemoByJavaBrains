package com.ketan.dto;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.SelectBeforeUpdate;

@Entity(name = "userdetails")
@NamedQuery(name = "Users.byId", query = "select userId,userName from userdetails where userId= :asd")
@NamedNativeQuery(name = "Users.byName", query = "select * from users where userName=:username", resultClass = Users.class)
@Table(name = "users")
@SelectBeforeUpdate
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Users {
	@Id
	@SequenceGenerator(name = "EMP_SEQS", sequenceName = "emp_seqs", allocationSize = 1)

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMP_SEQS")
	private int userId;

	private String userName;
	@Transient
	private String userType;

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + "]";
	}

}
