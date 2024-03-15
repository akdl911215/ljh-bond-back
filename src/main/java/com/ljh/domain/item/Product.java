package com.ljh.domain.item;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
@RequiredArgsConstructor
public class Product {

    @Positive
    private String id;
    @Positive
    private String auth_id; // 인증id
    @Positive
    private String investor_id; // 투자자id
    @Positive
    private String creditor_id; // 채권자id
    @NotNull
    private Product_Priority productPriority; // 우선순위

    private Date dueDate; // 만기일

    private Integer totalPrice; // 총금액

    private Integer remain; // 잔여금액


}
