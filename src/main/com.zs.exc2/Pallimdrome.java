package com.zs.exc2;

import java.util.Scanner;
class Pallimdrome
{
    static int number,copy,result=0,rem;

    public static void check()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        number=scan.nextInt();
        copy=number;
        while(number>0)
        {
            rem=number%10;
            result=result*10+rem;
            number=number/10;
        }
        number=copy;
        if(number==result)
            System.out.println("The given number is pallimdrome");
        else
            System.out.println("The given number is not pallimdrome");
    }
    public static void main(String[] args)
    {
        Pallimdrome pal=new Pallimdrome();
        pal.check();
    }
}