public class Financiamento {
    private double valorImovel;
    private int prazoFinanciamento; // em anos
    private double taxaJurosAnual; // taxa em percentual (ex: 5.0 para 5%)

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double calcularPagamentoMensal() {
        double taxaJurosMensal = taxaJurosAnual / 12 / 100; // taxa mensal
        int prazoTotalMeses = prazoFinanciamento * 12; // prazo total em meses

        double pagamentoMensal = (valorImovel / prazoTotalMeses) * (1 + taxaJurosMensal);
        return pagamentoMensal;
    }

    public double calcularTotalPagamento() {
        return calcularPagamentoMensal() * prazoFinanciamento * 12;
    }
}
