package com;

import com.wrap.ProductTypeEnum;

import java.util.Date;

/**
 * Created by admin on 2017/9/5.
 */
public class ProductModel {

    private String id;
    private String name;
    private Date auditDate;
    private ProductTypeEnum type;

    public ProductModel(String id, String name, Date auditDate) {
        this.id = id;
        this.name = name;
        this.auditDate = auditDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public ProductTypeEnum getType() {
        return type;
    }

    public void setType(ProductTypeEnum type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", auditDate=" + auditDate +
                ", type=" + type +
                '}';
    }
}
