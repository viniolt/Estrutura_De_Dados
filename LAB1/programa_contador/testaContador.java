public class testaContador{
    public static void main(String[] args){
        contador c1 = new contador();
        c1.incrementar();
        System.out.println(c1.valor);
        c1.incrementar();
    }
}