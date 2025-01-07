class calc{

    // creating method 
    public int add(int n1, int n2)                                                  //m/d overlaoding mtlb add1  -- sare method ko ek naam de skte hai
                                                                                     // public void add1(bhe ho skta tha tb jb return ni krna hota )
    {
         int result= n1+n2;                                                          //result variable me save kr rhy 
         return result;                                                              // Return the result (which is an int)

    }
                                                                                      // adding 3 number -- craete a add2 method -- then add
    public int add(int n1, int n2, int n3)  //m/d overlaoding mtlb add2 ko {add} bolo
    {
         int resu1=n1+n2+n3; // resu1 alg method th alg name
         return resu1;
    }

    // method for double addition -- can give same add name in method overlaoding
    public double add(double n1, double n2, double n3)
    {
       double resu3 = n1+n2+n3;
       return resu3;
    }

}

public class Method_overloading {
    
    public static void main(String[] args) {
        // to use class calc
        calc obj = new calc();
                                                                                     // now calling calc to add 2 numbers ( without craeting add method in calc )
                                                                                     //  obj.add(4,3);  // error ( method add(int, int) is undefined for the type calc)
                                                                                     // to solve this above error define add method in calc class

        int result = obj.add(4,3);   
        // adding 3 numbers
        int resu1 = obj.add(1,2,3);
        // adding point value (double)
        // then have to create method for double type
        // in method overloading we can call by add name 
        double resu3 = obj.add(1.1,2.1,3.4);
        System.out.println(result);
        System.out.println(resu1);
        System.out.println(resu3);
    }
}

// method overlaoding mtlb ?
// {add1} ,{add2} method ko ek name de skte java me { eg:add} 
// aur call kr skte (int resu1 = obj.add(1,2,3); ek he name se {add }
// ab compilation time decide hoga koin sa add execute hoga ( input nu. ke hisaab se)

//Automatic Promotion to Overloading

