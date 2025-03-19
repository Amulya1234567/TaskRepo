package com.ivoyant.main.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Product implements Comparable<Product>{
    int pid;

    String pname;

    public Product (int pid, String pname) {

        this.pid = pid;

        this.pname = pname;
    }
    @Override
    public String toString() {
        return this.pid+" "+this.pname;
    }

    @Override
    public int compareTo(Product o) {
        if(this.pid>o.pid){
            return 1;
        }else if(this.pid<o.pid){
            return -1;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Product p1=new Product(118,"cloth");
        Product p2=new Product(113,"shoes");
        Product p3=new Product(115,"watch");
        List<Product> col=new ArrayList<>();
        col.add(p1);
        col.add(p2);
        col.add(p3);
        Collections.sort(col);
        System.out.println(col);
    }
}


