package capitulo_2;

public class Operacao_Alfanumericos {

    public static void main(String[] args) {

        System.out.println("Porto".length());
        System.out.println("Lisboa "+ "é a capital de Portugal");
        System.out.println("Coimbra".toUpperCase());
        System.out.println("Maria Adelaide Carvalho".substring(6, 14));
        System.out.println("Porto pentacampeao".indexOf ("penta"));
        System.out.println("Porto".equals("Lisboa"));
        System.out.println("ABCD".compareTo("CDEF"));
        System.out.println(" Porto ".trim()+" e Lisboa");}
}
