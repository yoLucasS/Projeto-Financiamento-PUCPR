public class Main {
    public static void main(String[] args) {
        UserInterface UserInterface = new UserInterface();

        // Pedir dados ao usuário utilizando Input
        double valorImovel = UserInterface.pedirValorImovel();
        int prazoFinanciamento = UserInterface.pedirPrazoFinanciamento();
        double taxaJurosAnual = UserInterface.pedirTaxaJuros();

        // Criar objeto Financiamento
        Financiamento financiamento = new Financiamento(valorImovel, prazoFinanciamento, taxaJurosAnual);

        // Calcular e exibir resultados
        double pagamentoMensal = financiamento.calcularPagamentoMensal();
        double totalPagamento = financiamento.calcularTotalPagamento();

        System.out.println("\nResumo do Financiamento:");
        System.out.printf("Pagamento mensal: R$ %.2f\n", pagamentoMensal);
        System.out.printf("Total do pagamento: R$ %.2f\n", totalPagamento);
    }
}
