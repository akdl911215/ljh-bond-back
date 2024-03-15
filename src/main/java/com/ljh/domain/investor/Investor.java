package com.ljh.domain.investor;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Investor {
    private String name;
    private String price;
    private String rate;
}
