public class Inheritance {
    
   public static void main(String[] args) {
       
       // Her iki sınıftanda nesne oluşturduk
       Arac arac = new Arac();
       Kamyon kamyon = new Kamyon();
       
       // yazdir metodunu çağırdık
       arac.yazdir();
       kamyon.kamyonYazdirMetodu();
       
   }
   
}

class Arac{
   
   public Arac(){
       
       System.out.println("Araç Sınıfı Oluştu");
       
   }
   
   void yazdir(){
       
       System.out.println("Araç Sınıfı Yazdir");
       
   }
   
}

class Kamyon extends Arac{
   
   public Kamyon(){
       
       // Bu sayede üst sınıfın yapıcı metodunu çağırdık
       super();
       
   }
   
   void kamyonYazdirMetodu(){
       
       // Bu sayede üst sınıfın yazdir metodunu çağrıdık
       super.yazdir();
       System.out.println("Kamyon Sınıfı");
       
   }
   
}