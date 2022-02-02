package com.tim2.javnenabavke.repository;

import com.tim2.javnenabavke.entity.Zalba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ZalbaRepository extends JpaRepository<Zalba, Long> {

}