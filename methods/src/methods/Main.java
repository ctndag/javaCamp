package methods;

public class Main {

    public static void main(String[] args) {
        sayiBulmaca();

    }
    public static void sayiBulmaca() {
        int [] sayilar = new int [] {1,2,3,5,7,9,0};
        int aranacak = 6;
        boolean varMi=true;
        for (int sayi : sayilar) {
            if(sayi==aranacak) {
                varMi=true;
                break;
            }
        }
        String mesaj="";
        if(varMi) {
            mesaj="Sayi Mevcuttur:"+aranacak;
            mesajVer(mesaj);
        }
        else {
            System.out.println("sayi mevcut degildir:"+aranacak);
        }
    }
    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }

}