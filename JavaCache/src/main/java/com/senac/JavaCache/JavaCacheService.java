package com.senac.JavaCache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class JavaCacheService {
    @Cacheable(value = "teste", key = "#key")
    public String getValor(String valor){
     return "Retorno é: "+ valor;
    }
    @CacheEvict(value = "teste", allEntries = true)
    public void limparCache(){

    }
}
