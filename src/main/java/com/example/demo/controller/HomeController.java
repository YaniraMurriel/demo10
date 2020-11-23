package com.example.demo.controller;

import com.example.demo.entity.TasaDeInteres;
import com.example.demo.service.TasaDeinteresService;
import com.example.demo.entity.TasaDeInteres;
import com.example.demo.service.TasaDeinteresService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController

{
    @RequestMapping("/")
    public String Home()
    {
        return "Hola Mundo";
    }

    @RequestMapping("/obtenerSimulacion")
    public Map obtenerSimulacion()
    {
        Map result = new HashMap();
        result.put("meses",12);
        result.put("Tasa de Interest",1);
        return result;
    }

   @Autowired //inicializar variable, siempre va
    private TasaDeinteresService tasadeinteresservi;

    @RequestMapping("/obtenerTasaDeInteres/{id}")
    public TasaDeInteres obtenerTasaDeInteres (@PathVariable String id) throws Exception //pathvariable permite reciber el codigo del navegador
    {
        //TasaDeInteres tasa = tasadeinteresservi.obtenerTasa(Long.valueOf(id));
        return tasadeinteresservi.obtenerTasa(Long.valueOf(id));
        //return tasa;
    }

    @RequestMapping("/obtenerInteresCode/{interescode}")
    public TasaDeInteres obtenerTasaDeInteresCode (@PathVariable String interescode) throws Exception //pathvariable permite reciber el codigo del navegador
    {
        return tasadeinteresservi.obtenerInteresCode(interescode);
    }

    @RequestMapping("/obtenerInteresMonto/{interesmonto}")
    public TasaDeInteres obtenerTasaDeInteresMonto (@PathVariable Integer interesmonto) throws Exception //pathvariable permite reciber el codigo del navegador
    {
        return tasadeinteresservi.obtenerInteresMonto(interesmonto);
    }

    @RequestMapping("/obtenerMultiplicacion/{interesmonto}")
    public double obtenerMultiplicacion (@PathVariable Integer interesmonto) throws Exception //pathvariable permite reciber el codigo del navegador
    {
        return tasadeinteresservi.obtenerMultiplicacion(interesmonto).getInteresMonto()*2.4;
    }
}
