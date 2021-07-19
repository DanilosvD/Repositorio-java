package banco;

public class Fila <T> {
    private Cliente <T> refClienteEntradaFila;

    public Fila() {
        this.refClienteEntradaFila = null;
    }

    public void enqueue(T object) {
        Cliente novoCliente = new Cliente(object);
        novoCliente.setRefCliente(refClienteEntradaFila);
        refClienteEntradaFila = novoCliente;
    }

    public T first() {
        if (!this.isEmpty()) {
            Cliente primeiroCliente = refClienteEntradaFila;
            while (true) {
                if (primeiroCliente.getRefCliente() != null) {
                    primeiroCliente = primeiroCliente.getRefCliente();
                } else {
                    break;
                }
            }
           return (T) primeiroCliente.getRefCliente();
        }
        return null;
    }

    public T dequeue() {
        if (!this.isEmpty()) {
            Cliente primeiroCliente = refClienteEntradaFila;
            Cliente clienteAuxiliar = refClienteEntradaFila;
            while (true) {
                if (primeiroCliente.getRefCliente() != null) {

                    clienteAuxiliar = primeiroCliente;
                    primeiroCliente = primeiroCliente.getRefCliente();
                } else {
                    clienteAuxiliar.setRefCliente(null);
                    break;
                }
            }
            return (T) primeiroCliente.getRefCliente();
        }
        return null;

    }

        public boolean isEmpty(){
            return refClienteEntradaFila == null ? true : false;
        }




    @Override
    public String toString() {
        String stringRetorno = "";
        Cliente clienteAuxiliar = refClienteEntradaFila;

        if (refClienteEntradaFila != null) {
            while (true) {
                stringRetorno += "[Cliente{objeto=" + clienteAuxiliar.getObject() + "}]----->";
                if (clienteAuxiliar.getRefCliente() != null) {
                    clienteAuxiliar = clienteAuxiliar.getRefCliente();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }


        return stringRetorno;
    }
}

