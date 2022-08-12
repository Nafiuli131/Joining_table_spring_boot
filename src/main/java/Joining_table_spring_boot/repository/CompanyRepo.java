package Joining_table_spring_boot.repository;

import Joining_table_spring_boot.model.Company;
import antlr.collections.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


public interface CompanyRepo extends JpaRepository<Company, Integer> {
//    @Query(value = "select c.c_name,p.p_name from  Company c inner join Project  p on c.c_name=p.p_name where c.c_name=?1")
//    public String getCompany(String name);
}
