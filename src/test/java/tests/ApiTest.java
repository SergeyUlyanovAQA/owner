package tests;

import config.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ApiTest {

    @Test
    public void testApi() {
        ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());
        assertThat(config.baseUrl()).isEqualTo("https://github.com");
        assertThat(config.token()).isEqualTo("1234567890");
    }
}
