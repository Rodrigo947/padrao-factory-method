public class ApiZoop implements IApiPagamento {
    public String enviarPagamento(String baseURL, String dadosCartao, double valor) {
        return baseURL + "?cartao=" + dadosCartao + "&valor=" + valor;
    }
}
