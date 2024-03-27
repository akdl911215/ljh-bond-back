package com.ljh.domain.investor;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class InvestorDTO {
    private String name;
    private String price;
    private String rate;
}
