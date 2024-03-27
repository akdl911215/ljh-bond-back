package com.ljh.domain.product;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
@RequiredArgsConstructor
public class ProductDTO {

    @Positive
    private String id;
    @Positive
    private String auth_id; // 인증id
    @Positive
    private String investor_id; // 투자자id
    @Positive
    private String creditor_id; // 채권자id
    @NotNull
    private Date due_date; // 만기일

    private Integer total_price; // 총금액

    private Integer rest_price; // 잔여금액

    private Integer amount_paid; //납부금액

}
