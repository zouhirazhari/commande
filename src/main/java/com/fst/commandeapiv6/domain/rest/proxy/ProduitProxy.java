/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fst.commandeapiv6.domain.rest.proxy;

import com.fst.commandeapiv6.domain.rest.vo.exchange.ProduitVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author ASUS
 */
@FeignClient(name = "microservice-produit-v6-api" , url = "localhost:8091")
public interface ProduitProxy {
    
    @GetMapping("produit-api/produits/reference/{reference}")
    public ProduitVo findByReference(@PathVariable("reference") String reference);
        
}
