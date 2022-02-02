package com.tim2.javnenabavke.repository;

import com.tim2.javnenabavke.entity.Ugovor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UgovorRepository extends JpaRepository<Ugovor, Long> {

}