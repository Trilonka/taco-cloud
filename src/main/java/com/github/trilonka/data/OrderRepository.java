package com.github.trilonka.data;

import com.github.trilonka.dto.TacoOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<TacoOrder, Long> {
}
