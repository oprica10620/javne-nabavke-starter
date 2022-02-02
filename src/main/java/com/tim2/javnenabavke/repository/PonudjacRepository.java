package com.tim2.javnenabavke.repository;

import com.tim2.javnenabavke.entity.Ponudjac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PonudjacRepository extends JpaRepository<Ponudjac, Long> {

}