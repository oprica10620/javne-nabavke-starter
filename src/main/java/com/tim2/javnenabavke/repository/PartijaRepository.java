package com.tim2.javnenabavke.repository;

import com.tim2.javnenabavke.entity.Partija;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PartijaRepository extends JpaRepository<Partija, Long> {

}