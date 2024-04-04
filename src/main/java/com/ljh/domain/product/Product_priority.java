package com.ljh.domain.product;

import jakarta.validation.constraints.NotNull;

public enum Product_priority {

    First("선순위") , Middle("중순위") , Subordinate("후순위");

    private final String priority;

    @NotNull
    private String rate;
    private String charge;
    private String due_date;

    Product_priority(String priority, String rate, String charge, String dueDate) {
        this.priority = priority;
        this.rate = rate;
        this.charge = charge;
        this.due_date = dueDate;
    }

    Product_priority(String priority) {
        this.priority = priority;
    }

    public String getPriority() {
        return priority;
    }
}
