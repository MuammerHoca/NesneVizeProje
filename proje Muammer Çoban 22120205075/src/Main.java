import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner =new Scanner(System.in);
        int i=0,ek=1,gk=1;
        int ilkSecim,ikinciSecim;
        String[] elitÜyeler = new String[10];
        elitÜyeler[0]="ELİT ÜYELER";
        String[] genelÜyeler = new String[10];
        genelÜyeler[0]="\n\n#GENEL ÜYELER   #";
        //String[] elitÜyeler={"#ELİT ÜYELER    #"};
        while (i<1000){
            System.out.println("Yapacağınız işlemi seçiniz\n 1-Elit Üye Ekleme\n 2-Genel Üye Ekleme\n 3-Mail Gönderme\nÇıkmak için 0'a basınız\n\n");
            ilkSecim=scanner.nextInt();
            if(ilkSecim==1){
                i++;

                System.out.print("İsim Giriniz:");
                String bos=scanner.nextLine();
                String isim=scanner.nextLine();
                //if(isim.length()>0){break;}
                System.out.print("Soyisim:");
                String soyIsim=scanner.nextLine();
                System.out.print("E-Mail:");
                String email=scanner.nextLine();
                ElitKullanici elitKullanici=new ElitKullanici(isim,soyIsim,email);
                elitÜyeler[ek]=elitKullanici.getIsim()+"   "+elitKullanici.getAlani()+"  "+elitKullanici.getEmail();
                ek++;

                System.out.println("Yapacağınız işlemi seçiniz\n 1-Elit Üye Ekleme\n 2-Genel Üye Ekleme\n 3-Mail Gönderme\nÇıkmak için 0'a basınız");
            }else if(ilkSecim==2){
                i++;
                System.out.print("İsim Giriniz:");
                String bos=scanner.nextLine();
                System.out.print("İsim:");
                String isim=scanner.nextLine();
                System.out.print("Soyisim:");
                String soyIsim=scanner.nextLine();
                System.out.print("E-Mail:");
                String email=scanner.nextLine();
                GenelKullanici genelKullanici=new GenelKullanici(isim,soyIsim,email);
                genelÜyeler[gk]=genelKullanici.getIsim()+"   "+genelKullanici.getAlani()+"  "+genelKullanici.getEmail();
                gk++;

                System.out.println("Yapacağınız işlemi seçiniz\n 1-Elit Üye Ekleme\n 2-Genel Üye Ekleme\n 3-Mail Gönderme\nÇıkmak için 0'a basınız");
            }else if(ilkSecim==3){
                System.out.println("Lütfen 1-3 arasında seçim yapınız");
                System.out.println("Yapacağınız işlemi seçiniz\n 1-Elit Üyelere Mail\n 2-Genel Üyelere Mail\n 3-Tüm Üyelere Mail");
                ikinciSecim=scanner.nextInt();
                switch (ikinciSecim){
                    case 1:System.out.println("Elit Üyelere Mail Gönderildi\n");
                        break;
                    case 2:System.out.println("Genel Üyelere Mail Gönderildi\n");
                        break;
                    case 3:System.out.println("Tüm Üyelere Mail Gönderildi\n");
                        break;
                }
                    //System.out.println("Yapacağınız işlemi seçiniz\n 1-Elit Üye Ekleme\n 2-Genel Üye Ekleme\n 3-Mail Gönderme\nÇıkmak için 0'a basınız");




            }else if(ilkSecim==0){
                i=i+1000;
                break;

            }else{
                System.out.println("Yapacağınız işlemi seçiniz\n 1-Elit Üye Ekleme\n 2-Genel Üye Ekleme\n 3-Mail Gönderme\nÇıkmak için 0'a basınız");

            }

        }

        Kullanici k1 =new Kullanici("Muammer","Çoban","mehmett@gmail.com");


        DosyaYazdir dy=new DosyaYazdir();




        
        String yazilacakMetin = "#ELİT ÜYELER   #\n";
        for(int l=1;l<(ek+gk);l++){
            if(l<ek){
                yazilacakMetin=yazilacakMetin+""+elitÜyeler[l]+"\n";
            }

            else {

                yazilacakMetin=yazilacakMetin+""+genelÜyeler[l-ek]+"\n";
            }

        }
        System.out.println(yazilacakMetin);


        File f=new File("Kullanıcı2.txt");


        dy.dosyaolustur(f,yazilacakMetin);




    }
}