package com.example.kladbishe_zakazi2.repositories;


import com.example.kladbishe_zakazi2.model.Order;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.Collection;


@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    // SQl request for searching by fields
    Collection<Order>
    findAllByListOfWorksContainingIgnoreCaseOrNumberOfDistrictContainingIgnoreCaseOrNameOfDeadManContainingIgnoreCase
    (String listOfWorks,

     String numberOfDistrict,

     String nameOfDeadMan);
}
