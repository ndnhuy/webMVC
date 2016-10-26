//
// Copyright (c) 2015 KMS Technology.
//
package vn.kms.launch.basicwebapp.model;

import java.io.Serializable;
import java.math.BigDecimal;

import vn.kms.launch.basicwebapp.annotation.Table;

//TODO Move this into DB and update the Product Model to use ProductCategory object 
//public enum ProductCategory {
//    CATEGORY_1,
//    CATEGORY_2,
//    CATEGORY_3,
//    CATEGORY_4
//}
@Table(name = "PRODUCT_CATEGORY")
public class ProductCategory implements Serializable {

    private static final long serialVersionUID = -3680691625392544789L;

    private Long categoryId;

    private String categoryName;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

}


