/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fst.commandeapiv6.domain.model.service;

import com.fst.commandeapiv6.domain.bean.Commande;
import com.fst.commandeapiv6.domain.bean.CommandeItem;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface CommandeItemService {

    public int saveCommandeItems(Commande commande, List<CommandeItem> commandeItems);

    public List<CommandeItem> findByCommande(Commande commande);

}
