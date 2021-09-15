package io.agileintelligence.ppmt.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@Entity
public class Project {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String projectName;
	private String projectIdentifier;
	private String description;
	private Date start_date;
	private Date end_date;
		
	private Date created_AT;
	private Date updated_AT;
	
	
	public Project() {
	}

	@PrePersist
	protected void onCreate() {
		this.created_AT= new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updated_AT = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectIdentifier() {
		return projectIdentifier;
	}

	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public Date getCreated_AT() {
		return created_AT;
	}

	public void setCreated_AT(Date created_AT) {
		this.created_AT = created_AT;
	}

	public Date getUpdated_AT() {
		return updated_AT;
	}

	public void setUpdated_AT(Date updated_AT) {
		this.updated_AT = updated_AT;
	}
	
	
	

}
