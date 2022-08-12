package Joining_table_spring_boot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue
            @Column(name = "employee_id")
    int id;
    @Column(name = "employee_name")
    String Emp_name;
    @Column(name = "employee_position")
    String Emp_position;
    @Column(name = "employee_salary")
    String Emp_salary;
    @Column(name = "employee_enrolled_project_name")
    String Emp_project;

}
