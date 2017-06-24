public class OperazioniRettangolo
{
   public static void main(String[] args)
   {
     Rettangolo rettangoloA= new Rettangolo();
     Rettangolo rettangoloB= new Rettangolo(10,25);
     /*rettangoloA.setLati(14,32);
     rettangoloA.getLatoA();
     rettangoloA.getLatoB();
     System.out.println(rettangoloA.toString());
     rettangoloA.getPerimetro();
     rettangoloA.getArea();
     System.out.println("Il perimetro del rettangolo e': " + rettangoloA.getPerimetro());
     System.out.println("L'area del rettangolo e': " + rettangoloA.getArea());
     */
     rettangoloA.draw();
     rettangoloB.draw();

   }





}
