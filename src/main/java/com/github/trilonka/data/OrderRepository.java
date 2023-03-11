package com.github.trilonka.data;

import com.github.trilonka.dto.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder tacoOrder);
}
