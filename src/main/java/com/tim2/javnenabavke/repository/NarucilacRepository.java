package com.tim2.javnenabavke.repository;

import com.tim2.javnenabavke.entity.Narucilac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface NarucilacRepository extends JpaRepository<Narucilac, Long> {

}