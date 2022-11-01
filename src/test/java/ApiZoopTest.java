import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ApiZoopTest extends TestCase {
    @Test
    void deveExecutarEnviarPagamento() {
        IApiPagamento servico = ApiPagamentoFactory.obterApi("ApiZoop");
        String resultado = servico.enviarPagamento("apiZoop", "123", 25.61);
        Assertions.assertEquals("apiZoop?cartao=123&valor=25.61", resultado);
    }

}