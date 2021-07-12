import java.util.*;
class WrapperDemo{
   pulblic static void main(String[] args){
  int i=10;
  Integer iob=new Integer(i);
  int j=iob.intValue();
  int k=Integer.parseInt("100");
System.out.println("i value using boxing"+i);
System.out.println("j value using unboxing"+j);
System.out.println("k value using passing"+k);
Integer iob2=new Integer(200);
System.out.println("iob2 value is"+iob2);
Integer iobwr2=Integer.valueOf("11011",2);