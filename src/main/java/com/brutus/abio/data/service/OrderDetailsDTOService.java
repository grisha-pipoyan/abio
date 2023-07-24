package com.brutus.abio.data.service;

import com.brutus.abio.data.entity.OrderDetailsDTO;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailsDTOService {

    private final OrderDetailsDTORepository repository;

    public OrderDetailsDTOService(OrderDetailsDTORepository repository) {
        this.repository = repository;
    }

    public Optional<OrderDetailsDTO> get(Long id) {
        return repository.findById(id);
    }

    public OrderDetailsDTO update(OrderDetailsDTO entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Page<OrderDetailsDTO> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<OrderDetailsDTO> list(Pageable pageable, Specification<OrderDetailsDTO> filter) {
        return repository.findAll(filter, pageable);
    }

    public int count() {
        return (int) repository.count();
    }

}
