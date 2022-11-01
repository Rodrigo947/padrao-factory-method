public class ApiMercadoPago {
    public String enviarPagamento(String baseURL, String dadosCartao, double valor) {
       return baseURL + "?cartao=" + dadosCartao + "&valor=" + valor;
    }
}
