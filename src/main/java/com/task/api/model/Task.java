package com.task.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * Model that defines what data should be stored
 */

@Entity
public class Task implements Serializable {
	
	private static final long serialVersionUID = 454597258411086704L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private long ID;
	
	private int duration;
	private String description;
	
	/*
	 * Getters and Setters
	 */
	
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
