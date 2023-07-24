package com.brutus.abio.data.service;

import com.brutus.abio.data.entity.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ColorRepository extends JpaRepository<Color, Long>, JpaSpecificationExecutor<Color> {

}
