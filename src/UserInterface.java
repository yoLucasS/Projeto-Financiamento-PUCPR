public class UserInterface {

    public double pedirValorImovel() {
        return Input.readDouble("Digite o valor do imóvel: ");
    }

    public int pedirPrazoFinanciamento() {
        return Input.readInt("Digite o prazo do financiamento em anos: ");
    }

    public double pedirTaxaJuros() {
        return Input.readDouble("Digite a taxa de juros anual (%): ");
    }
}
