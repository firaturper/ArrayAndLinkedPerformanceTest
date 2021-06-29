
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
        
        // Listin sonuna de�er ekleme
        long start;
        long finish;
        
        start = System.currentTimeMillis();
        
        for (int i = 0 ; i< 100000; i++) {
            
            list.add(0,i);
  /* Bu halde LinkedList, ArrayList'e g�re �ok daha k�sa s�rede i�lem g�r�yor.
   * 22 ms'ye 1092 ms gibi bir fark...
   
   * ArrayList rastgele bir eri�im yapar yani t�m liste boyunca yineleme 
     olmadan Array�de daha �nce belirlenen elementi bulur. LinkedList ise 
     birinci elemandan aramaya ba�lar ve arad��� elementi bulana kadar birer 
     birer ilerler.        
     
   * Array ile List aras�ndaki fark nedir?
   En belirgin iki fark� vard�r. �lki Array homojen elementlerin toplam�yken List
   heterojen elementlerin toplam�d�r. �kincisi ise bellekte Array i�in ayr�lan alan
  sabit ve s�rekliyken List i�in ayr�lan alan dinamik ve rastgeledir.   
    
            */
        }
        finish = System.currentTimeMillis();
        
        System.out.println(veri + " Ekleme S�resi " + (finish - start) + " ms");
        
        
        
        
    }
    
}
