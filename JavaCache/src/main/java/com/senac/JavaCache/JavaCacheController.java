package com.senac.JavaCache;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaCacheController {
    private final JavaCacheService javaCacheService ;
    public JavaCacheController() {
        javaCacheService = null;
    }
    
}

