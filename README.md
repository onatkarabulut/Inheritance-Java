# Inheritance (Kalıtım)
En basit tanımıyla atadan oğula bırakılan mirastır. Nesne Tabanlı Programlama açısından bir sınıfın başka bir sınıftan özellikleri miras almasıdır. Java dilinde bir oğulun yalnızca bir ata sınıfı olabilir. Kalıtım ile mümkün olan miras alma sınırı birdir. Kalıtım, sınıfların birbirinden miras alarak ortak metot ve özellikleri kullanmasını sağlamak için kullanılır. Aşağıdaki şemadan görüldüğü üzere Araç sınıfının özelliklerinden 3 farklı sınıf faydalanabilmiş. Bu sayede kod yükü azalmış ve tekrar tekrar aynı şeyleri yazmaya gerek kalmamış.

![image](/table/inheritance_kalitim_diagram.jpg)

<br/>

## Inheritance (Kalıtım) Örneği
*Inheritance nasıl yapılır?*

Kalıtım yapabilmek için 2 farklı sınıfa ihtiyaç duyarız. İlk sınıf ana sınıfımız olsun ikinci sınıfta alt sınıfımız olsun. İlk sınıftan miras alabilmek için extends anahtar kelimesi kullanılır. Unutulmamalıdır ki kalıtım yaparken yalnızca bir sınıftan miras alınabilir. Sadece 1 hakkımız vardır. Aşağıdaki örneği inceleyelim.

```java

class Arac{
    
    
}

// Önce ana sınıfın adı girilir
// Daha sonra extends kelimesi
// Son olarak miras alınacak sınıf girilir

class Kamyon extends Arac{
     
    
}

class Otomobil extends Arac{
    
    
}

class Motorsiklet extends Arac{
      
    
}

```

<br/>

Aşağıdaki örnekte Araç sınıfını Kamyon sınıfı miras almıştır. Araç sınıfı içerisinde yer alan metodu her ikisinden oluşturulan nesnede çağırabilmektedir. Ayrıca Araç sınıfının tekerler özelliğine kamyon nesnesi erişebilmekte. Tüm bunları kalıtım sayesinde yapabilmekteyiz. Bu sayede defalarca aynı şeyleri yazmak yerine bağlantı kurarak temiz ve anlaşılır kod yazabiliyoruz.

```java
public class Inheritance {
    
    public static void main(String[] args) {
        
        // Her iki sınıftanda nesne oluşturduk
        Arac arac = new Arac();
        Kamyon kamyon = new Kamyon();
        
        // yazdir metodunu çağırdık
        arac.yazdir();
        kamyon.yazdir();
        
        // Araç sınıfının özelliğini kamyon için kullanabildik
        kamyon.tekerler = 5;
        System.out.println(kamyon.tekerler);
        
    }
    
}


class Arac{
    
    public int tekerler;
    
    void yazdir(){
        
        System.out.println("Araç Sınıfı");
        
    }
    
}

class Kamyon extends Arac{
    
}

```
---
## super() Method
Alt sınıfın üst sınıfa erişmesi gereken durumlarda super anahtar kelimesi kullanılır. Üst sınıfa ait nesne oluşturmak veya üst sınıfın öğelerine erişebilmek gibi 2 farklı kullanım amacına sahiptir. Aşağıdaki örnekte üst sınıfın yapıcı metodunu kullanmak ve üst sınıfın yazdir() metoduna erişebilmek için kullanılmıştır.
```java
public class Kalitim {
    
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
```