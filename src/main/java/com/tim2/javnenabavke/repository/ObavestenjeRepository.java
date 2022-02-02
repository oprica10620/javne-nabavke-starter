package com.tim2.javnenabavke.repository;

import com.tim2.javnenabavke.entity.Obavestenje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ObavestenjeRepository extends JpaRepository<Obavestenje, Long> {

}