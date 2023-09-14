public class Ipi extends Imposto
{
    double calcularImposto(OperacaoComerical operacaoComerical)
    {
        if (operacaoComerical.tipoOperacao == "produto")
        {
            return operacaoComerical.valorOperacao * 0.25;
        }

        return -1;
    }
}