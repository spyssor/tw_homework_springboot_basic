package com.thoughtworks.homework.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
public class Luckymoney {

    @Id
    @GeneratedValue
    private Integer id;

    private BigDecimal money;

    //红包发送方
    private String producer;

    //红包接送方
    private String consumer;

    public Luckymoney(){

    }
}
