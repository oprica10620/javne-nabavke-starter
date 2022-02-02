package com.tim2.javnenabavke.repository;

import com.tim2.javnenabavke.entity.Preduzece;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PreduzeceRepository extends JpaRepository<Preduzece, Long> {

}