package com.brutus.abio.data.service;

import com.brutus.abio.data.entity.OrderDetailsDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderDetailsDTORepository
        extends
            JpaRepository<OrderDetailsDTO, Long>,
            JpaSpecificationExecutor<OrderDetailsDTO> {

}
