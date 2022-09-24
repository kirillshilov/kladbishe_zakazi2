package com.example.kladbishe_zakazi.repositories;


import com.example.kladbishe_zakazi.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OrderRepository extends JpaRepository <Order, Long> {
}
