package pilhas;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Pilhas minhasPilhas = new Pilhas();

        minhasPilhas.push(new Caixa( 1));
        minhasPilhas.push(new Caixa( 2));
        minhasPilhas.push(new Caixa( 3));
        minhasPilhas.push(new Caixa( 4));
        minhasPilhas.push(new Caixa( 5));
        minhasPilhas.push(new Caixa( 6));

        System.out.println(minhasPilhas);

        System.out.println(minhasPilhas.pop());
        System.out.println(minhasPilhas);

        minhasPilhas.push(new Caixa( 99));
        System.out.println(minhasPilhas);




    }
}
