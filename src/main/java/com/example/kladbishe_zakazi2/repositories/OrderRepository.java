package com.example.kladbishe_zakazi2.repositories;


import com.example.kladbishe_zakazi2.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OrderRepository extends JpaRepository <Order, Long> {
}
