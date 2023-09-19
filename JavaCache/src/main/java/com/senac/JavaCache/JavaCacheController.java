package com.senac.JavaCache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


public class JavaCacheController {
    private final JavaCacheService javaCacheService;

    @Autowired
    public JavaCacheController(JavaCacheService javaCacheService){
        this.javaCacheService = javaCacheService;
    }
    @GetMapping("/getCacheValue")
    public String getCacheValue(@RequestParam String key){
        return javaCacheService.getValor(key);
    }
    @PostMapping("/cleanCache")
    public void cleanCache(){
        javaCacheService.limparCache();
    }

}

