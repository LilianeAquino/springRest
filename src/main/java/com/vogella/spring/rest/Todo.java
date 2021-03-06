package com.vogella.spring.rest;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String summary;

	private String description;

	private Boolean done;

	private Date dueDate;

	public Todo() {
	}

	public Todo(String summary) {
		this.summary = summary;
	}

	public void setId(long id) {

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", summary=" + summary + ", description=" + description + "]";
	}

	public Todo copy() {
		Todo todo = new Todo(summary);
		todo.setDone(getDone());
		todo.setDueDate(getDueDate());
		todo.setDescription(getDescription());

		return todo;
	}
}
