package com.ljh.domain.creditor;

import lombok.Data;


@Data
public class creditorDTO {
    private String creditor_id;
    private String name;
    private String price;
    private com.ljh.domain.item.Product_priority product_priority;
    private String phone;
    private String address;
    private String funds;

}
