package banco;

public class Main {
    public static void main(String[] args) {
        Fila<String> minhaFila = new Fila <>();

        minhaFila.enqueue( "Primeiro");
        minhaFila.enqueue( "Segundo");
        minhaFila.enqueue( "Terceiro");
        minhaFila.enqueue( "Quarto");

        System.out.println(minhaFila);

        //Retira o primeiro da fila .
        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        //Adiciona a lista.
        minhaFila.enqueue( "Último");

        System.out.println(minhaFila);

        //Mostra o primeiro da fila.
        System.out.println(minhaFila.first());
    }
}
