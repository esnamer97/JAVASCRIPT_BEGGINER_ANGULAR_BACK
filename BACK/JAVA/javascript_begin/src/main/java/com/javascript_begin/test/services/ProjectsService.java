package com.javascript_begin.test.services;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javascript_begin.test.DAOS.ProjectDAO;
import com.javascript_begin.test.entities.ProjectEntity;
import com.javascript_begin.test.repositorys.ProjectRepository;


@RestController
public class ProjectsService {
		
		@Autowired
		private ProjectRepository projectRepository;

		private static final String template = "Hello, %s!";
		private final AtomicLong counter = new AtomicLong();

		@GetMapping("/projects")
		public ProjectDAO getProjects(@RequestParam(value = "name", defaultValue = "World") String name) {
			return new ProjectDAO(counter.incrementAndGet(), String.format(template, name));
		}
		
		@GetMapping(path="/all")
		public @ResponseBody Iterable<ProjectRepository> getAllUsers() {
		   // This returns a JSON or XML with the users
		   return projectRepository.findAll();
		}
}
