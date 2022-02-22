package javascript_begin.test;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<ProjectEntity, Integer>{
	
	List<ProjectEntity> findAll();
}
