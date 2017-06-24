public class Rettangolo
{
   private int latoA;
   private int latoB;
  public Rettangolo(int base,int altezza)
  {
    setLati(base,altezza);
  }
  public Rettangolo()
  {
    setLati(5,10);
  }
  public void setLati(int base,int altezza)
  {
    this.latoA=base;
    this.latoB=altezza;
  }
  public int getLatoA()
  {
     return this.latoA;
  }
  public int getLatoB()
  {
    return this.latoB;
  }


  public int getPerimetro()
  {
    int perimetro=2*(this.latoA + this.latoB);
    return perimetro;
  }
  public int getArea()
  {
    int area=this.latoA * this.latoB;
    return area;
  }
  public void draw()
  {
   System.out.println("Disegno del rettangolo:");
 /*System.out.println("**********");
   System.out.println("*        *");
   System.out.println("*        *");
   System.out.println("*        *");
   System.out.println("**********");*/
   for (int i=0;i<getLatoB() ;i++)
   {
     if (i ==0 || i == getLatoB()-1)
     {
      for (int j=0;j< getLatoA();j++ )
       {
         System.out.print("*");
       }
     }
     else
     {
      for (int j=0;j<getLatoA() ; j++)
      {
        if (j == 0 || j== getLatoA()-1)
        {
          System.out.print("*");
        }
        else
        {
          System.out.print(" ");
        }
      }

    }
     System.out.println();
   }



  }
  public String toString()
  {
  String casa ="Rettangolo di Base : "+ getLatoA() + " , "+" Altezza: "+ getLatoB() ;
  return casa;
  }







}
