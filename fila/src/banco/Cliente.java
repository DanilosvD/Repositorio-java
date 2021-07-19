package banco;

public class Cliente <T> {
    //O "T" quer dizer, que a classe é genérica.
    //Só pode utilizar um tipo de dado.
    private  T object;
    private Cliente<T> refCliente;


    public Cliente(){

    }



    public Cliente(T object){
        this.refCliente = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public Cliente getRefCliente() {
        return refCliente;
    }

    public void setRefCliente(Cliente refCliente) {
        this.refCliente = refCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "object=" + object +
                '}';
    }
}



