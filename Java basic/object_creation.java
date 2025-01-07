class Test{
    // creating values
    int a;      // a=0 default value in heap area
    String name;   //name = null --Default string in heap area
    
    public static void main (String []args)
    {
        int num = 3;   //declearing variable
       
        // to use created value creating method
       Test rect = new Test();
       System.out.println(num);  //printing local variable num
       System.out.println(rect.a);  //printing instance variable accesed by obj.

    
    }

}