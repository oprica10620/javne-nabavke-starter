package com.tim2.javnenabavke.repository;

import com.tim2.javnenabavke.entity.Lokacija;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LokacijaRepository extends JpaRepository<Lokacija, Long> {

}