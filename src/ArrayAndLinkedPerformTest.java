
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ArrayAndLinkedPerformTest {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> linkedlist  = new LinkedList<Integer>();
        ArrayList<Integer> arraylist =  new ArrayList<Integer>();
        
        timeCalculate("LinkedList",linkedlist);
        timeCalculate("ArrayList",arraylist);
        
        
    }
    public static void timeCalculate(String veri,List<Integer> list) {
        
        // Listin sonuna deðer ekleme
        long start;
        long finish;
        
        start = System.currentTimeMillis();
        
        for (int i = 0 ; i< 100000; i++) {
            
            list.add(0,i);
  /* Bu halde LinkedList, ArrayList'e göre çok daha kýsa sürede iþlem görüyor.
   * 22 ms'ye 1092 ms gibi bir fark...
   
   * ArrayList rastgele bir eriþim yapar yani tüm liste boyunca yineleme 
     olmadan Array’de daha önce belirlenen elementi bulur. LinkedList ise 
     birinci elemandan aramaya baþlar ve aradýðý elementi bulana kadar birer 
     birer ilerler.        
     
   * Array ile List arasýndaki fark nedir?
   En belirgin iki farký vardýr. Ýlki Array homojen elementlerin toplamýyken List
   heterojen elementlerin toplamýdýr. Ýkincisi ise bellekte Array için ayrýlan alan
  sabit ve sürekliyken List için ayrýlan alan dinamik ve rastgeledir.   
    
            */
        }
        finish = System.currentTimeMillis();
        
        System.out.println(veri + " Ekleme Süresi " + (finish - start) + " ms");
        
        
        
        
    }
    
}
