public class TypeCasting_Truncation
{
   public static void main(String []args)
   // Implicit Type casting
    {
     int a=5;
     double b;

     b=a;                       //implicit type casting int (a) to double (b)
     System.out.println(b);     //5.0
    

   // Explicit Type Casting

   
      double a1=45.5;
      int b1;

      b1=(int)a1;                 //explicit casting double c to int (d)
      System.out.println(b1);    //45

   // Truncation
      
      int a2=12;
      int b2=5;

      float resul=a2/b2;          // int/int=int val here stroing resul value in float type 
      System.out.println(resul);  //truncated (.4) here ans=2.0
    }
}