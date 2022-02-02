package com.tim2.javnenabavke.repository;

import com.tim2.javnenabavke.entity.Ponuda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PonudaRepository extends JpaRepository<Ponuda, Long> {

}