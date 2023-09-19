package com.senac.JavaCache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class JavaCacheService {
    @Cacheable(value = "teste", key = "#key")
    public String getValor(String key){
     return "Retorno é: "+ key;
    }
    @CacheEvict(value = "teste", allEntries = true)
    public void limparCache(){

    }
}
