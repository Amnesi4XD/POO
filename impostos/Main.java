import java.util.ArrayList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<OperacaoComerical> operacoes = new ArrayList<>();

        operacoes.add(new OperacaoComerical("servico", 120.50));
        operacoes.add(new OperacaoComerical("servico", 300.45));
        operacoes.add(new OperacaoComerical("produto", 40.99));
        operacoes.add(new OperacaoComerical("produto", 55.99));

        for (OperacaoComerical operacaoComerical : operacoes)
        {
            operacaoComerical.describe();
        }
    
    }
}
