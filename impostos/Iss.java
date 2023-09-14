public class Iss extends Imposto
{
    double calcularImposto(OperacaoComerical operacaoComerical)
    {
        if (operacaoComerical.tipoOperacao == "servico")
        {
           return operacaoComerical.valorOperacao * 0.046;
        }

        return -1;
    }
}