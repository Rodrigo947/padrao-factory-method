public class ApiPagamentoFactory {

    public static IApiPagamento obterApi(String nomeApi) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName(nomeApi);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("API inexistente");
        }
        if (!(objeto instanceof IApiPagamento)) {
            throw new IllegalArgumentException("API inválida");
        }
        return (IApiPagamento) objeto;
    }
}
