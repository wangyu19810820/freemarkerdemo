package com.wrap;

/**
 * Created by admin on 2017/9/5.
 */
public enum ProductTypeEnum {
    ANTIBIOTIC("抗生素"), CARDIOVASCULAR("心脑血管"), DIGESTIVE("消化系统");

    private String name;

    private ProductTypeEnum(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }
}
