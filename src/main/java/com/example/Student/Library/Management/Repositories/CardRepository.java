package com.example.Student.Library.Management.Repositories;

import com.example.Student.Library.Management.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Integer> {
}
