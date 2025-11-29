package org.sree.azurespringbootsree;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeInterface extends JpaRepository<Employee, Integer> {

    
}
