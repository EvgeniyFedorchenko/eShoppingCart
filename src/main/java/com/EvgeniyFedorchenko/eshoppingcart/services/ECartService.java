package com.EvgeniyFedorchenko.eshoppingcart.services;

import java.util.List;

public interface ECartService {

    String add(List<Integer> ids);

    List<Integer> get();
}
