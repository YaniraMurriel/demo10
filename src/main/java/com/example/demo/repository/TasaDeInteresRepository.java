package com.example.demo.repository;

import com.example.demo.entity.TasaDeInteres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TasaDeInteresRepository extends JpaRepository<TasaDeInteres,Long>
{ //Select * from tabla where interecode =
 public TasaDeInteres findByinteresCode(String interes_code);
 public TasaDeInteres findByinteresMonto(Integer interes_monto);
 public TasaDeInteres findOneByinteresMonto(Integer interes_monto);
}
