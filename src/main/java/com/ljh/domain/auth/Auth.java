package com.ljh.domain.auth;


import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
public class Auth {
    private String auth_id;
    private String creditor_id;
    private String tax_history;
    private String card_history;
    private String sales;
    private String salary;
    private String credit_score;
}
