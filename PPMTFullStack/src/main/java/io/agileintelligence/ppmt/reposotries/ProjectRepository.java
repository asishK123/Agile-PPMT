package io.agileintelligence.ppmt.reposotries;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.agileintelligence.ppmt.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{
	@Override
	default Iterable<Project> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}
}
