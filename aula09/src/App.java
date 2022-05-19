public class App {
    public static void main(String[] args) throws Exception {
       
        Endereco end = new Endereco("21","setor oeste",1374,7776000);
        Cliente c1 =new Cliente("Elaine",end);

        c1.imprimiIformacoes();
    }
}
