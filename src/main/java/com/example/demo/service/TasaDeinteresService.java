package com.example.demo.service;

import com.example.demo.entity.TasaDeInteres;
import javax.persistence.Id;

public interface TasaDeinteresService
{
    public TasaDeInteres obtenerTasa(Long id); //declaro metodos vacios que luego van a implementare en la clse implement
    public TasaDeInteres obtenerInteresCode(String interescode);
    public TasaDeInteres obtenerInteresMonto(Integer interesmonto);
    public TasaDeInteres obtenerMultiplicacion(Integer interesmonto);
}
