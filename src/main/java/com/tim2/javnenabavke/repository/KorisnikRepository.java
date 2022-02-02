package com.tim2.javnenabavke.repository;

import com.tim2.javnenabavke.entity.Korisnik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface KorisnikRepository extends JpaRepository<Korisnik, Long> {

}