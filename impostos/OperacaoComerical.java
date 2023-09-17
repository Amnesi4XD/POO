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
    public void describe()
    {
        Icms icms = new Icms();
        Ipi ipi = new Ipi();
        Iss iss = new Iss();
        this.valorImposto = icms.calcularImposto(this);
        this.valorImposto += ipi.calcularImposto(this);
        this.valorImposto += iss.calcularImposto(this);

        this.valorOperacao = this.valorImposto + this.valorItem;

        System.out.println("Tipo de operação: " + this.tipoOperacao);
        System.out.println("Valor da operação: " + this.valorOperacao);
        System.out.println("Valor do item: " + this.valorItem);
        System.out.println("Valor do imposto: " + this.valorImposto);
        System.out.println("\n");
    }
}
