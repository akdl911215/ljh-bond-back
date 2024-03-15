package com.ljh.domain.creditor;

import com.ljh.domain.item.Product_Priority;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class creditor {
    private String creditor_id;
    private String name;
    private String price;
    private Product_Priority productPriority;
    private String phone;
    private String address;
    private String funds;

}
