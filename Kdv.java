import java.util.*;

public class Kdv {
    public static void main(String[] args){


        /*KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.*/

        int net_fiyat;
        
        Scanner para=new Scanner(System.in);

        System.out.print("Urunun Net Fiyati=");
        net_fiyat=para.nextInt();

        double kdvli_fiyat;
        double kdv;
        
        if(net_fiyat<1000){
            kdv=0.18*net_fiyat;
        }
        else
        {
            kdv=0.08*net_fiyat;

        }
        
        kdvli_fiyat=net_fiyat+kdv;

        System.out.println(net_fiyat+"'li urun KDV eklendikten sonra " +kdvli_fiyat+" TL");

        

        




















    }

}
