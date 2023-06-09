import java.util.ArrayList;

public class Cavalo extends Peca {

    Cavalo(String cor){
        super(cor);
    }
    @Override
    public ArrayList<Posicao> possiveisMovimentos(Tabuleiro tabuleiro) {
        ArrayList<Posicao> possiveisMovimentos=new ArrayList<>();

        Posicao posicaoAtual=this.getPosicao();

        int posicaoNoTabuleiro=tabuleiro.getPosicoes().indexOf(posicaoAtual);

        for (Posicao posicao:
                tabuleiro.getPosicoes()) {
            int indice=tabuleiro.getPosicoes().indexOf(posicao);
            if (tabuleiro.getPosicoes().indexOf(posicao)== posicaoNoTabuleiro-17 ||
                    indice== posicaoNoTabuleiro-15 ||
                    indice== posicaoNoTabuleiro-10 ||
                    indice== posicaoNoTabuleiro-6 ||
                    indice== posicaoNoTabuleiro+6 ||
                    indice== posicaoNoTabuleiro+10 ||
                    indice== posicaoNoTabuleiro+15 ||
                    indice== posicaoNoTabuleiro+17 ){

                //                coluna H
                if (validaExtremidade(posicaoNoTabuleiro+1) && !(
                        indice==posicaoNoTabuleiro-15 ||
                                indice==posicaoNoTabuleiro-6 ||
                                indice==posicaoNoTabuleiro+10 ||
                                indice==posicaoNoTabuleiro+17
                        )){
                    verificaPeca(posicao,possiveisMovimentos);

                }
                //    coluna A
                else if (validaExtremidade(posicaoNoTabuleiro) && !(
                        indice==posicaoNoTabuleiro-17 ||
                                indice==posicaoNoTabuleiro-10 ||
                                indice==posicaoNoTabuleiro+6 ||
                                indice==posicaoNoTabuleiro+15
                        )){
                    verificaPeca(posicao,possiveisMovimentos);
                }
//                coluna B
                else if (validaExtremidade(posicaoNoTabuleiro-1) && !(
                                indice==posicaoNoTabuleiro-10 ||
                                indice==posicaoNoTabuleiro+6
                )){
                    verificaPeca(posicao,possiveisMovimentos);
                }
//                coluna G
                else if (validaExtremidade(posicaoNoTabuleiro-2) && !(
                        indice==posicaoNoTabuleiro-15 ||
                                indice==posicaoNoTabuleiro+17
                )){
                    verificaPeca(posicao,possiveisMovimentos);
                    possiveisMovimentos.add(posicao);
                }

            }
        }

        return possiveisMovimentos;
    }
    @Override
    public String toString() {
        return "Cavalo "+super.toString();
    }
}
