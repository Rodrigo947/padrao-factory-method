import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class ApiPagamentoFactoryTest extends TestCase {
    @Test
    void deveRetornarExcecaoParaApiInexistente() {
        try {
            IApiPagamento api = ApiPagamentoFactory.obterApi("ApiPagSeguro");
            Assertions.fail();
        } catch (IllegalArgumentException erro) {
            Assertions.assertEquals("API inexistente", erro.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaApiInvalido() {
        try {
            IApiPagamento api = ApiPagamentoFactory.obterApi("ApiMercadoPago");
            Assertions.fail();
        } catch (IllegalArgumentException erro) {
            Assertions.assertEquals("API inválida", erro.getMessage());
        }
    }
}