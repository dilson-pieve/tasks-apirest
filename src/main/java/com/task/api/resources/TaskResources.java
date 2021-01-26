package com.task.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.api.model.Task;
import com.task.api.repository.TaskRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/*
 * Controller -> Answer requests
 */

@CrossOrigin(origins="*") // Allow every location to send requests

@RestController 
@RequestMapping(value="/api")

@Api(value="Task API") // Swagger - config

public class TaskResources {
	
	@Autowired // spring automatic injects
	private TaskRepository taskRepository;
	
	//POST - CREATE
	@ApiOperation(value="Create a new task")
	@PostMapping("/task") 	// create a new task
	public Task saveTask(@RequestBody Task task) { return taskRepository.save(task); }
	
	//GET - READ
	@ApiOperation(value="Get all tasks")
	@GetMapping("/tasks") 
	public List<Task> taskList() { return taskRepository.findAll(); }	
	
	//PUT - UPDATE
	@ApiOperation(value="Update a task")
	@PutMapping("/task") 
	public Task updateTask(@RequestBody Task task) { return taskRepository.save(task); }
	
	//DELETE
	@ApiOperation(value="Delete a task")
	@DeleteMapping("/task") 
	public void deleteTask(@RequestBody Task task) { taskRepository.delete(task);}
	
}
