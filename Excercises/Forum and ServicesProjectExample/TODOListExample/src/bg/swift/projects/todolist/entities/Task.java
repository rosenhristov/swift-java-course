package bg.swift.projects.todolist.entities;

import java.util.Date;

public class Task {
	private Integer id;
	private String task;
	private Date dueDate;
	private String status;

	private User owner;
	
	private Date createdAt;
	private Date updatedAt;

	public Task(Integer id, String task, Date dueDate, String status, User owner, Date createdAt, Date updatedAt) {
		this.id = id;
		this.task = task;
		this.dueDate = dueDate;
		this.status = status;
		this.owner = owner;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}
}
