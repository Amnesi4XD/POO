public class OperacaoComerical {
    public String tipoOperacao;
    public double valorOperacao;
    public double valorItem;
    public double valorImposto;

    public OperacaoComerical(String tipoOperacao, double valorOperacao)
    {
        this.tipoOperacao = tipoOperacao;
        this.valorItem = valorOperacao;
    };

    double calcularImposto()
}
