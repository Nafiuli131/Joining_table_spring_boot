package Joining_table_spring_boot.controller;

import Joining_table_spring_boot.model.Company;
import Joining_table_spring_boot.model.Project;
import Joining_table_spring_boot.repository.CompanyRepo;
import Joining_table_spring_boot.repository.ProjectRepo;
import Joining_table_spring_boot.service.allService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    Joining_table_spring_boot.service.allService allService;
    @Autowired
    CompanyRepo companyRepo;
    @Autowired
    ProjectRepo projectRepo;
    @PostMapping("/saveCompany")
    public Company saveCompany(@RequestBody Company company){
        return allService.saveCompanyInfo(company);
    }
    @PostMapping("/saveProject")
    public Project saveProject(@RequestBody Project project){
        return allService.projectInfo(project);
    }
    @GetMapping("/allCompany")
    public List<Company> getAllCompany(){
        return companyRepo.findAll();
    } @GetMapping("/allProject")
    public List<Project> getAllProject(){
        return projectRepo.findAll();
    }
}
