/**
 * Created by fillipecordeiro on 05/07/16.
 */
public class Carro extends Automovel {

    private static int quantidadeDeCarros;

    private boolean ehConversivel;

    @Override
    public void acelera(double velocidade) {
        double novaVelocidade = this.velocidadeAtual + velocidade;

        if(ehConversivel) {
            novaVelocidade = novaVelocidade / 2;
        }

        if (verificaVelocidadeMáxima(novaVelocidade)) {
            this.velocidadeAtual = novaVelocidade;
        } else {
            this.velocidadeAtual = this.velocidadeMaxima;
        }
    }

    public void setEhConversivel(boolean ehConversivel) {
        this.ehConversivel = ehConversivel;
    }

    public boolean isEhConversivel() {
        return this.ehConversivel;
    }

    public static int getQuantidadeDeCarros() {
        return Carro.quantidadeDeCarros;
    }
}
