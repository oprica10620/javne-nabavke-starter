package com.tim2.javnenabavke.repository;

import com.tim2.javnenabavke.entity.Komisija;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface KomisijaRepository extends JpaRepository<Komisija, Long> {

}