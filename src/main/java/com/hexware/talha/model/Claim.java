package com.hexware.talha.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "claims")
public class Claim {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="gender")
	private String gender;
	
	@Column (name="description")
	private String description;
	
	@Column(name="status")
	private String status;
	
	//@OneToMany(mappedBy="claim")
	//private List<ClaimDoc> docs;
	
	@Column(name="url")
	private String url;
	
	@CreationTimestamp
	private LocalDateTime createdDate;
	
	@UpdateTimestamp
	private LocalDateTime updateDate;

	public Claim() {
		
	}

	public Claim(String name, String gender, String description, String status, String url, LocalDateTime createdDate,
			LocalDateTime updateDate) {
		super();
		this.name = name;
		this.gender = gender;
		this.description = description;
		this.status = status;
		this.url = url;
		this.createdDate = createdDate;
		this.updateDate = updateDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "Claim [id=" + id + ", name=" + name + ", gender=" + gender + ", description=" + description
				+ ", status=" + status + ", url=" + url + ", createdDate=" + createdDate + ", updateDate=" + updateDate
				+ "]";
	}
	
	

}
