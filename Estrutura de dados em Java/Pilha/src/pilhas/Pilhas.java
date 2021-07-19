package pilhas;

public class Pilhas {


    private Caixa refCaixaEntradaPilhas;

    public Pilhas() {
        this.refCaixaEntradaPilhas = null;
    }
    public void push(Caixa novaCaixa){
        Caixa refAuxiliar = refCaixaEntradaPilhas;
        refCaixaEntradaPilhas = novaCaixa;
        refCaixaEntradaPilhas.setRefCaixa(refAuxiliar);
    }

    public Caixa pop() {
        if (!this.isEmpty()) {
            Caixa caixaPoped = refCaixaEntradaPilhas;
            refCaixaEntradaPilhas = refCaixaEntradaPilhas.getRefCaixa();
            return caixaPoped;
        }

        return null;
    }
    public Caixa top(){
        return refCaixaEntradaPilhas;
    }

    public boolean isEmpty(){
     // if(reCaixaEntradaPilhas == null){
    //      return true;
    //}
     //   return false;
      return refCaixaEntradaPilhas == null ? true : false;

    }

    @Override
    public String toString(){

        String stringRetorno = "------------------\n";
        stringRetorno += "      pilhas\n";
        stringRetorno += "----------------\n";
        Caixa caixaAuxiliar = refCaixaEntradaPilhas;

        while (true){
            if (caixaAuxiliar != null){
                stringRetorno += "[Caixa{dado=" +caixaAuxiliar.getDado() +"}]\n";
                caixaAuxiliar = caixaAuxiliar.getRefCaixa();

            }else {
                break;
            }
        }
        stringRetorno += "==================\n";
       return stringRetorno;
    }
}
