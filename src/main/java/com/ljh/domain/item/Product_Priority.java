package com.ljh.domain.item;

import jakarta.validation.constraints.NotNull;

public enum Product_Priority {

    First("선순위") , Middle("중순위") , Subordinate("후순위");

    private final String priority;

    @NotNull
    private String rate;
    private String charge;
    private String dueDate;

    Product_Priority(String priority, String rate, String charge, String dueDate) {
        this.priority = priority;
        this.rate = rate;
        this.charge = charge;
        this.dueDate = dueDate;
    }

    Product_Priority(String priority) {
        this.priority = priority;
    }

    public String getPriority() {
        return priority;
    }
}
