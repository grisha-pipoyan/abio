package com.brutus.abio.data.service;

import com.brutus.abio.data.entity.ProductAdminDTO;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class ProductAdminDTOService {

    private final ProductAdminDTORepository repository;

    public ProductAdminDTOService(ProductAdminDTORepository repository) {
        this.repository = repository;
    }

    public Optional<ProductAdminDTO> get(Long id) {
        return repository.findById(id);
    }

    public ProductAdminDTO update(ProductAdminDTO entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Page<ProductAdminDTO> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<ProductAdminDTO> list(Pageable pageable, Specification<ProductAdminDTO> filter) {
        return repository.findAll(filter, pageable);
    }

    public int count() {
        return (int) repository.count();
    }

}
