package com.capg.demo;


import java.util.Arrays;
public class Lab3Ex2 {

public static void main(String[] args) {

String [] a = {"Srinidhi","Shresta","Lilly","Sowji","Akhila"};
//before sort
System.out.println("BEFORE SORTING");
for(int i = 0;i<a.length;i++)
{
 System.out.println(a[i]);
}
System.out.println("----");
Arrays.sort(a);
System.out.println("AFTER SORTING");
for(int i = 0;i<a.length;i++)
{
 System.out.println(a[i]);
}
System.out.println("--");
int lt=a.length;
lt=lt/2;
        int l;
if(lt/2!=2)
{
l=(lt+1);
}
else
{
l=lt;
}
System.out.println("captial ");
for(int i=0;i<l;i++)
{
a[i]=a[i].toUpperCase();

System.out.println(a[i]);
}
for(int i=0;i<l;i++)
{
a[i+l]=a[i+l].toLowerCase();
   System.out.println(a[i+l]);
}



}

}