import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        //Tipo primitivo
        int numero1 = 10;
        System.out.println(numero1);

        //Tipo Wrapper
        Integer numero2 = numero1;
        System.out.println(numero2);

        //Tipo primitivo
        float numero3 = 10.00F;
        System.out.println(numero3);

        //Tipo Wrapper
        Float numero4 = numero3;
        System.out.println(numero4);

        System.out.println("#################");

        //Casting implícito
        int teste = 50;
        long teste2 = teste;
        System.out.println(teste2);

        //Casting Explícito
        long teste3 = 500;
        int teste4 = (int) teste3;
        System.out.println(teste4);

        //Casting implícito
        byte teste5 = 1;
        int teste6 = teste5;
        System.out.println(teste6);

        //Casting Explícito
        long teste7 = 100;
        byte teste8 = (byte) teste7;
        System.out.println(teste8);



    }
}