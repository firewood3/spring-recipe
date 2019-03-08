package com.firewood;

import lombok.Data;
import lombok.Setter;
import lombok.ToString;

public class Business extends Person {

    @Setter
    private String companyName;

    public Business() { super(); }

    public Business(String name, int age) { super(name, age); }

    public String toString() { return super.toString() + " And CompanyName : " + this.companyName; }
}
