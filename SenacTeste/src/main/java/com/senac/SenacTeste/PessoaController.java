package com.senac.SenacTeste;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@Controller

public class PessoaController {

    @GetMapping("/")
    public String inicial(Model model) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Mathias"));
        pessoas.add(new Pessoa("João"));
        pessoas.add(new Pessoa("Helena"));
        pessoas.add(new Pessoa("Joaquina"));
        pessoas.add(new Pessoa("Carlos"));

        model.addAttribute("pessoas", pessoas);
        return "index";
    }

//    public String adicionaPessoas(String nome){
//        if (nome !=null && !nome.equals("")){
//
//        }
//
//        return "";
};


