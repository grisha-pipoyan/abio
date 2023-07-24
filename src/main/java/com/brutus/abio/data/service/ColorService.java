package com.brutus.abio.data.service;

import com.brutus.abio.data.entity.Color;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class ColorService {

    private final ColorRepository repository;

    public ColorService(ColorRepository repository) {
        this.repository = repository;
    }

    public Optional<Color> get(Long id) {
        return repository.findById(id);
    }

    public Color update(Color entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Page<Color> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<Color> list(Pageable pageable, Specification<Color> filter) {
        return repository.findAll(filter, pageable);
    }

    public int count() {
        return (int) repository.count();
    }

}
