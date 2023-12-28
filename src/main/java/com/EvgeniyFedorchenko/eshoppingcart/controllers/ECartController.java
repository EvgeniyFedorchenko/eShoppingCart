package com.EvgeniyFedorchenko.eshoppingcart.controllers;

import com.EvgeniyFedorchenko.eshoppingcart.services.ECartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/order")
public class ECartController {
    private final ECartService eCartService;

    public ECartController(ECartService eCartService) {
        this.eCartService = eCartService;
    }

    @GetMapping(path = "/add")
    public String add(@RequestParam(value = "ids") List<Integer> ids) {
        return eCartService.add(ids);
    }

    @GetMapping(path = "/get")
    public List<Integer> ids() {
        return eCartService.get();
    }
}
