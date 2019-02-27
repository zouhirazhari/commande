/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fst.commandeapiv6.domain.rest.vo;

import com.fst.commandeapiv6.domain.bean.CommandeItem;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.OneToMany;

/**
 *
 * @author ASUS
 */
public class CommandeVo {

    private Long id;
    private String reference;
    private String total;
    @OneToMany(mappedBy = "commande")
    private List<CommandeItemVo> commandeItemVo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<CommandeItemVo> getCommandeItemVo() {
        return commandeItemVo;
    }

    public void setCommandeItemVo(List<CommandeItemVo> commandeItemVo) {
        this.commandeItemVo = commandeItemVo;
    }

}
