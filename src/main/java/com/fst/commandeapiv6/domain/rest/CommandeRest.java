/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fst.commandeapiv6.domain.rest;

import com.fst.commandeapiv6.domain.bean.Commande;
import com.fst.commandeapiv6.domain.model.service.CommandeService;
import com.fst.commandeapiv6.domain.rest.converter.CommandeConverter;
import com.fst.commandeapiv6.domain.rest.vo.CommandeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS
 */
@RestController
@RequestMapping("/commande-api/commandes")
public class CommandeRest {

    @Autowired
    CommandeService commandeService;

    @PostMapping("/")
    public CommandeVo saveCommandeWithCommandeItems(@RequestBody CommandeVo commandeVo) {
        CommandeConverter commandeConverter = new CommandeConverter();
        Commande myCommande = commandeConverter.toItem(commandeVo);
        Commande commande = commandeService.saveCommandeWithCommandeItems(myCommande);
        return commandeConverter.toVo(commande);
    }

    @GetMapping("/reference/{reference}")
    public CommandeVo findByReference(@PathVariable String reference) {
        return new CommandeConverter().toVo(commandeService.findByReference(reference));
    }

    public CommandeService getCommandeService() {
        return commandeService;
    }

    public void setCommandeService(CommandeService commandeService) {
        this.commandeService = commandeService;
    }
}
