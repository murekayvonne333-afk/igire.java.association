package com.igire.javaassociation.comparator;

import com.igire.javaassociation.model.Product;

import java.util.Comparator;

public class ProductComparator {

    public static Comparator<Product> categoryThenPrice =
            Comparator.comparing(Product::getCategory)
                    .thenComparing(Product::getPrice, Comparator.reverseOrder());

}