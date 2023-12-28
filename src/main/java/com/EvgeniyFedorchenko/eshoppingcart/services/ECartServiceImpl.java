package com.EvgeniyFedorchenko.eshoppingcart.services;

import com.EvgeniyFedorchenko.eshoppingcart.entity.ECart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ECartServiceImpl implements ECartService {

    private final ECart eCart;

    public ECartServiceImpl(ECart eCart) {
        this.eCart = eCart;
    }

    @Override
    public String add(List<Integer> ids) {

        eCart.addIdsToCart(ids);

        StringBuilder sb = new StringBuilder("product successfully added: ");
        ids.forEach(id -> sb.append(id).append(", "));
        return sb.delete(sb.length() - 2, sb.length()).toString();
    }

    @Override
    public List<Integer> get() {
        return eCart.getAllIds();
    }
}
