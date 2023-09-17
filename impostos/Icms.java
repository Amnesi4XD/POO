public class Icms extends Imposto
{
    double calcularImposto(OperacaoComerical operacaoComerical)
    {
        if (operacaoComerical.tipoOperacao == "produto")
        {
            return operacaoComerical.valorOperacao * 0.17;
        }

         return 0;

    }
}