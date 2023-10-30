package exercises;

import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import exercises.extensions.AddUuidHeaderTransformer;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static io.restassured.RestAssured.given;

public class WireMockExercises6dot4Test {

    private static RequestSpecification requestSpec;

    @RegisterExtension
    static WireMockExtension wiremock = WireMockExtension.newInstance().
            options(wireMockConfig().
                    port(9876).
                    extensions(new AddUuidHeaderTransformer())
            ).build();

    @BeforeAll
    public static void createRequestSpec() {

        requestSpec = new RequestSpecBuilder().
            setBaseUri("http://localhost").
            setPort(9876).
            build();
    }

    public void stubForResponseDefinitionTransformer() {

        wiremock.stubFor(post(urlEqualTo("/requestLoan"))
            .willReturn(aResponse()
                .withTransformerParameter("uuidHeaderName", "uuid")
                .withStatus(200)
            ));
    }

    @Test
    public void getResponse_checkHeaders_shouldIncludeThoseAddedbyResponseDefinitionTransformer() {

        /***
         * Use this test to test your implementation of the response definition transformer
         */

        stubForResponseDefinitionTransformer();

        given().
            spec(requestSpec).
        when().
            get("/response-definition-transformer").
        then().
            assertThat().
            statusCode(200).
        and().
            header("uuid", org.hamcrest.Matchers.matchesPattern("[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}"));
    }
}
