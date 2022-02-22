package javascript_begin.test;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProjectsService {
		
		@Autowired
		private ProjectRepository projectRepository;

		private static final String template = "Hello, %s!";
		private final AtomicLong counter = new AtomicLong();
		
		@RequestMapping("/projects")
		public ProjectDAO getProjects(@RequestParam(value = "name", defaultValue = "World") String name) {
			return new ProjectDAO(counter.incrementAndGet(), String.format(template, name));
		}
		
		@CrossOrigin(origins = "http://localhost:4200")
		@GetMapping("/all")
		public Map<String, Object> getAllProjects() {
		   // This returns a JSON or XML with the users
			HashMap<String, Object> response = new HashMap<>();
			List<ProjectEntity> proyectos = projectRepository.findAll();
			response.put("projects", proyectos);
		   return response;
		}
}
