/**
 * Write a description of class bodymass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class bmi
{
  
    public static void main(String[] args) throws IOException
    {
 String status=""; 
   double h;
    double w;
    double bm=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter height in centimetres");
        h=Double.parseDouble(br.readLine());
        System.out.println("Enter weight in kg");
        w=Double.parseDouble(br.readLine());
        {
      
   
        h=h/100;
        bm=w/(h*h);
        System.out.println("BMI="+bm);
        {
        if(bm<=18.5)
        {
            System.out.println("slim");
        }
            if(bm>18.5&&bm<=24.5)
            {
             System.out.println("fit");
        }
        if(bm>24.5&&bm<=29.5)
        {
         System.out.println("fat");
         }
   if(bm>29.5)
    {
    System.out.println("overweight");
    }
       
}
}
}
}

        
        
