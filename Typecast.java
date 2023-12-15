public class Typecast{
   public static void main(String[] args){
      double d = 234.04;
      long l = (long)d;   //explicit type casting
      int i = (int)l;     // explicit type casting
      System.out.println("double value :"+d);
      System.out.println("long value :"+l);
      System.out.println("int value :"+i);

      int a = 300;
      long b = a;       //no explicit type casting
      float f = l;     //no explicit type casting
      System.out.println("int value :"+a);
      System.out.println("long value :"+b);
      System.out.println("float value :"+f);

   }
}