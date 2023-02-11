package com.example.Student.Library.Management.Repositories;

import com.example.Student.Library.Management.Models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
