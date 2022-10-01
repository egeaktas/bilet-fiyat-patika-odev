import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double km, ilk_fiyat, ikinci_fiyat, son_fiyat;;
        int yas, secenek;

        km = input.nextDouble();
        yas = input.nextInt();
        secenek = input.nextInt();

        ilk_fiyat = km*0.1;

        if(   !((km> 0 && yas>=0) && (secenek>0 && secenek<3))   ){
            System.out.println("Hatalı veri girdiniz");
        }else{

            if(yas<12){
                ikinci_fiyat = ilk_fiyat - ilk_fiyat*0.5;
                if(secenek == 2){
                    son_fiyat = (ikinci_fiyat - ikinci_fiyat*0.2)*2;
                    System.out.println("fiyat: "+son_fiyat);
                }else {
                    son_fiyat = ikinci_fiyat;
                    System.out.println("fiyat: "+son_fiyat);
                }
            }else if(yas>=12 && yas <=24){
                ikinci_fiyat = ilk_fiyat - ilk_fiyat*0.5;
                if(secenek == 2){
                    son_fiyat = (ikinci_fiyat - ikinci_fiyat*0.2)*2;
                    System.out.println("fiyat: "+son_fiyat);
                }else {
                    son_fiyat = ikinci_fiyat;
                    System.out.println("fiyat: "+son_fiyat);
                }
            }else{
                ikinci_fiyat = ilk_fiyat - ilk_fiyat*0.5;
                if(secenek == 2){
                    son_fiyat = (ikinci_fiyat - ikinci_fiyat*0.2)*2;
                    System.out.println("fiyat: "+son_fiyat);
                }else {
                    son_fiyat = ikinci_fiyat;
                    System.out.println("fiyat: "+son_fiyat);
                }
            }

        }


    }
}