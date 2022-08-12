package Joining_table_spring_boot.repository;

import Joining_table_spring_boot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
