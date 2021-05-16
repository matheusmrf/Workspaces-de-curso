public class Teste {
    public static void main(String[] args) {
        System.out.println("primeiro");
        segundo();
        System.out.println("termino do primeiro");
    }

    public static void segundo() {
        System.out.println("segundo");
        terceiro();
        System.out.println("termino do segundo");

    }
    public static void terceiro() {
        System.out.println("terceiro");
        for (int i=0; i<=5; i++){
            System.out.println(i);
        }
        System.out.println("fim do teceiro");

    }
}
