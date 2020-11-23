package com.example.demo.service;
import com.example.demo.entity.TasaDeInteres;
import com.example.demo.repository.TasaDeInteresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.TasaDeInteres;

@Service //anotacion

public class TasaDeinteresServiceImpl implements TasaDeinteresService {
    @Autowired //inicializar variable, siempre va
    private TasaDeInteresRepository tasadeinteresrepository;

    public TasaDeInteres obtenerTasa(Long id)
    {
      return tasadeinteresrepository.findById(id).get();
    }

    public TasaDeInteres obtenerInteresCode(String interescode)
    {
        return tasadeinteresrepository.findByinteresCode(interescode);
    }

    public TasaDeInteres obtenerInteresMonto(Integer interesmonto)
    {
        return tasadeinteresrepository.findByinteresMonto(interesmonto);
    }

    public TasaDeInteres obtenerMultiplicacion(Integer interesmonto)
    {
        return tasadeinteresrepository.findOneByinteresMonto(interesmonto);
    }
}
