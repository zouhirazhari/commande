/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fst.commandeapiv6.domain.model.service.impl;

import com.fst.commandeapiv6.domain.model.dao.CommandeItemDao;
import com.fst.commandeapiv6.domain.bean.Commande;
import com.fst.commandeapiv6.domain.bean.CommandeItem;
import com.fst.commandeapiv6.domain.model.service.CommandeItemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service
public class CommandeItemServiceImpl implements CommandeItemService {

    @Autowired
    private CommandeItemDao commandeItemDao;

    @Override
    public int saveCommandeItems(Commande commande, List<CommandeItem> commandeItems) {
        if (commandeItems == null || commandeItems.isEmpty()) {
            return -1;
        } else {
            for (CommandeItem commandeItem : commandeItems) {
                commandeItem.setCommande(commande);
                commandeItemDao.save(commandeItem);
            }
            return 1;
        }
    }

    @Override
    public List<CommandeItem> findByCommande(Commande commande) {
        return commandeItemDao.findByCommande(commande);
    }

    public CommandeItemDao getCommandeItemDao() {
        return commandeItemDao;
    }

    public void setCommandeItemDao(CommandeItemDao commandeItemDao) {
        this.commandeItemDao = commandeItemDao;
    }

}
