import java.util.ArrayList;

public class Peao extends Peca{
    private boolean primeiroMovimento= true;

    Peao(String cor){
        super(cor);
    }

    @Override
    public ArrayList<Posicao> possiveisMovimentos(Tabuleiro tabuleiro) {
        ArrayList<Posicao> possiveisMovimentos=new ArrayList<>();

        Posicao posicaoAtual=this.getPosicao();
        int posicaoNoTabuleiro=tabuleiro.getPosicoes().indexOf(posicaoAtual);
        ArrayList<Posicao> posicoesTabuleiro=tabuleiro.getPosicoes();

        if(this.getCor().equals("Preto")){
            if (posicoesTabuleiro.get(posicaoNoTabuleiro+8)==null){
            possiveisMovimentos.add(posicoesTabuleiro
                    .get(posicaoNoTabuleiro+8));
            }
            if (this.primeiroMovimento){
                if (posicoesTabuleiro.get(posicaoNoTabuleiro+16)==null){
                    possiveisMovimentos.add(posicoesTabuleiro
                            .get(posicaoNoTabuleiro+16));
                }
            }
            if (posicoesTabuleiro.get(posicaoNoTabuleiro+9)
                    .getPeca().getCor().equals("Branco")
                    && !validaExtremidade(posicaoNoTabuleiro+1)){
                possiveisMovimentos.add(posicoesTabuleiro
                        .get(posicaoNoTabuleiro+9));
            }
            if (posicoesTabuleiro.get(posicaoNoTabuleiro+7)
                    .getPeca().getCor().equals("Branco")
                    && !validaExtremidade(posicaoNoTabuleiro)){
                possiveisMovimentos.add(posicoesTabuleiro
                        .get(posicaoNoTabuleiro+7));
            }

        }else{
            if (posicoesTabuleiro.get(posicaoNoTabuleiro-8)==null){
                possiveisMovimentos.add(tabuleiro.getPosicoes()
                        .get(posicaoNoTabuleiro-8));
            }
                if (this.primeiroMovimento){
                    if (tabuleiro.getPosicoes().get(posicaoNoTabuleiro-16)==null){
                        possiveisMovimentos.add(posicoesTabuleiro
                                .get(posicaoNoTabuleiro-16));
                    }
                }
            if (posicoesTabuleiro.get(posicaoNoTabuleiro-9)
                    .getPeca().getCor().equals("Preto")
                    && !validaExtremidade(posicaoNoTabuleiro+1)){
                possiveisMovimentos.add(posicoesTabuleiro
                        .get(posicaoNoTabuleiro-9));
            }
            if (posicoesTabuleiro.get(posicaoNoTabuleiro-7)
                    .getPeca().getCor().equals("Preto")
                    && !validaExtremidade(posicaoNoTabuleiro)){
                possiveisMovimentos.add(posicoesTabuleiro
                        .get(posicaoNoTabuleiro-7));
            }
        }

        return possiveisMovimentos;
    }
    @Override
    public String toString() {
        return "Peão "+super.toString();
    }
}
