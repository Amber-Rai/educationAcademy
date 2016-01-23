package com.education.domain;

import javax.persistence.*;


/**
 * The persistent class for the PROJECT database table.
 * 
 */
@Entity
public class Project{

	@Id @GeneratedValue
	private Long projectId;

	@Override
    public String toString() {
        return "Project [projectId=" + projectId + ", content=" + content + ", contentFormat=" + contentFormat + ", projectName=" + projectName+"]";
    }

    private String content;

	private String contentFormat;

	private String projectName;

	public Project(String projectName) {
            this.projectName = projectName;
        }	
	
	public Project() {
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContentFormat() {
		return this.contentFormat;
	}

	public void setContentFormat(String contentFormat) {
		this.contentFormat = contentFormat;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	
}