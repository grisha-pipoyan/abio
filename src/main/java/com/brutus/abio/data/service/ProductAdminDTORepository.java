package com.brutus.abio.data.service;

import com.brutus.abio.data.entity.ProductAdminDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductAdminDTORepository
        extends
            JpaRepository<ProductAdminDTO, Long>,
            JpaSpecificationExecutor<ProductAdminDTO> {

}
