package com.EvgeniyFedorchenko.eshoppingcart.entity;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Repository
@SessionScope
public class ECart {
    private final List<Integer> allIds;

    public ECart(List<Integer> allIds) {
        this.allIds = allIds;
    }

    public void addIdsToCart(List<Integer> ids) {
        allIds.addAll(ids);
    }
    public List<Integer> getAllIds() {
        return new ArrayList<>(allIds);
    }
}
