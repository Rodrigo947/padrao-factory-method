public interface IApiPagamento {
    String enviarPagamento(String baseURL, String dadosCartao, double valor);
}
