// import java.util.Scanner;

public class latihan {
    public static void main(String[] args){

        System.out.println("Hello World");
        int x = 10;
        int y = 40;
        System.out.println("hasil pertambahan " + x + " + " + y + " = " + (x + y));

        if(x + y >= 50){
            System.out.println("Hasil tercapai");
        }else {
            System.out.println("Hasil tidak tercapai");
        }

        String name = "razel";

        switch(name){
            case "razel":
            System.out.println("hi admin");
            break;

            default:
            System.out.println("pergi kau");
            break;
        }

        for(int i = 1; i < 11; i+= 3){
            System.out.print(i + " ");
        }

        System.out.println();

        String[] data = {"lelouch", "lamperouge"};
        System.out.println(data[0] + " " +data[1]);

    }
}