package com.ljh.domain.creditor;

import com.ljh.domain.product.Product_priority;
import lombok.Data;

@Data
public class creditorDTO {
    private String creditor_id;
    private String name;
    private String price;
    private Product_priority product_priority;
    private String phone;
    private String address;
    private String funds;

}
