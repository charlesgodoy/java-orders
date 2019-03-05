package com.lambdaschool.javaorders.repository;

import com.lambdaschool.javaorders.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Long> {
}
