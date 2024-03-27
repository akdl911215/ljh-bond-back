package com.ljh.domain.debtor;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class DebtorDTO {

    private String id;
    private String creditor_id;
    private String name;
    private String price;
    private String job;
    private String funds;
    private String account;
    private String address;
    private String phone;


}
