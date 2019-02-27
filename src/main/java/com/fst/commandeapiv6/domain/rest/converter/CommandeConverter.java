/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fst.commandeapiv6.domain.rest.converter;

import com.fst.commandeapiv6.common.util.NumberUtil;
import com.fst.commandeapiv6.domain.bean.Commande;
import com.fst.commandeapiv6.domain.rest.vo.CommandeVo;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author ASUS
 */
@Component
public class CommandeConverter extends AbstractConverter<Commande, CommandeVo> {

    @Override
    public Commande toItem(CommandeVo vo) {
        if (vo == null) {
            return null;

        } else {
            Commande item = new Commande();
            item.setReference(vo.getReference());
            item.setId(vo.getId());
            item.setTotal(NumberUtil.toBigDecimal(vo.getTotal()));
            item.setCommandeItems(new CommandeItemConverter().toItem(vo.getCommandeItemVo()));
            
            return item;
        }
    }

    @Override
    public CommandeVo toVo(Commande item) {
        if(item==null){
        return null;
    }else{
            CommandeVo vo = new CommandeVo();
            vo.setReference(item.getReference());
            vo.setId(item.getId());
            vo.setTotal(NumberUtil.toString (item.getTotal()));
            vo.setCommandeItemVo(new CommandeItemConverter().toVo(item.getCommandeItems()));
            return vo;
        }

    }
}
