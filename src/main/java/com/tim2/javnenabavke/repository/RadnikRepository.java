package com.tim2.javnenabavke.repository;

import com.tim2.javnenabavke.entity.Radnik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RadnikRepository extends JpaRepository<Radnik, Long> {

}