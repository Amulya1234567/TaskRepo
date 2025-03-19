package com.ivoyant.oops.inheritance;

public class College extends Vtu {
    double fees=50000;
    void payFees()
    {
        double fees=20000;
        System.out.println("The VTU fees:"+super.fees);
        System.out.println("The college fees:"+this.fees);
        System.out.println("the maintenance fees:" + fees);//variable clashing
        double total=super.fees+this.fees+fees;
        System.out.println("the total fees:"+total);
    }
}
