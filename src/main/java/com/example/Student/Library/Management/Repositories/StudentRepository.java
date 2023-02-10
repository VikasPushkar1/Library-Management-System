package com.example.Student.Library.Management.Repositories;

import com.example.Student.Library.Management.Models.Card;
import com.example.Student.Library.Management.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
