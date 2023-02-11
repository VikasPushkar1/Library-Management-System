package com.example.Student.Library.Management.Repositories;

import com.example.Student.Library.Management.Models.Card;
import com.example.Student.Library.Management.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
