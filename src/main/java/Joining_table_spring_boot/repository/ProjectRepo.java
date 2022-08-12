package Joining_table_spring_boot.repository;

import Joining_table_spring_boot.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ProjectRepo extends JpaRepository<Project, Integer> {
}
