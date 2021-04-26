package bg.swift.projects.todolist.entities;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import bg.swift.projects.todolist.dal.DBManager;
import bg.swift.projects.todolist.dal.TableRow;
import bg.swift.projects.todolist.dao.TasksDAO;

public class User {

	private Integer id;
	private String username;
	private String password;
	
	private List<Task> tasks = new ArrayList<>();
 	
	private Date createdAt;
	private Date updatedAt;

	public User() {
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public User(int id, String username, String password, List<Task> tasks, Date createdAt, Date updatedAt) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.tasks = tasks;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	
	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public void updateTasks() {
		TasksDAO tasksDAO = new TasksDAO();
		List<Task> tasksList = tasksDAO.findTasksByUser(this);
		this.setTasks(tasksList);
	}
}
