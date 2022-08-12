package Joining_table_spring_boot.service;

import Joining_table_spring_boot.model.Company;
import Joining_table_spring_boot.model.Project;
import Joining_table_spring_boot.repository.CompanyRepo;
import Joining_table_spring_boot.repository.EmployeeRepo;
import Joining_table_spring_boot.repository.ProjectRepo;
import antlr.collections.List;
import org.springframework.stereotype.Service;

@Service
public class allService {
    EmployeeRepo employeeRepo;
    CompanyRepo companyRepo;
    ProjectRepo projectRepo;

    public allService(EmployeeRepo employeeRepo, CompanyRepo companyRepo, ProjectRepo projectRepo) {
        this.employeeRepo = employeeRepo;
        this.companyRepo = companyRepo;
        this.projectRepo = projectRepo;
    }
    public Company saveCompanyInfo(Company company){
        return companyRepo.save(company);
    }
    public Project projectInfo(Project project){
        return projectRepo.save(project);
    }

}
