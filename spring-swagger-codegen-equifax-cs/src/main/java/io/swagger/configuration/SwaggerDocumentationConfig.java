package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-08T10:55:31.099545300Z[Europe/London]")
@Configuration
public class SwaggerDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Consumer Credit Report")
            .description("# Introduction      Equifax’s Consumer Credit Report is the leading consumer credit resource enabling lenders to make faster, more informed credit-granting decisions, better manage their risk and maximize growth opportunities. The Consumer Credit Report unites the power of superior consumer data with best-in-class search and match logic capabilities to deliver higher match rates on more inquiries.    # Getting Started  1. **<a href=\"/user/applications\" target=\"_blank\">Create</a>** an application  2. **<a href=\"/user/applications\" target=\"_blank\">Subscribe</a>** to Consumer Credit Report API  3. **<a href=\"/products/consumer-credit-report\" target=\"_blank\">Explore</a>** the Sandbox environment  # Promoting to UAT  To successfully submit test transactions through your application in the UAT environment, a test member number is required.  You may use your existing Equifax test member number(s).  Please contact your Equifax Account Representative if a new test member number is needed. The steps below can be used to test in the UAT environment.  Transactions generated using a test member number do not return identical results as a sandbox transaction.  A sandbox transaction will reflect everything that is exposed in the API whereas a test member number is configured to align with the specifications of your contract. Please contact us to ensure your test member number is configured to your expectations.      1. **<a href=\"/user/applications\" target=\"_blank\">Promote</a>** application to test  2. **<a href=\"/documentation\" target=\"_blank\">Update</a>** requests details for UAT  3. **<a href=\"/documentation\" target=\"_blank\">Test</a>** scenarios in UAT environment   # For More Details    * **<a href=\"/contact\" target=\"_blank\">Contact Us</a>** - Equifax Developer Center Support Website   * **ACRO Migration Support**       * phone: 1-888-407-0359; Option 2 followed by Option 5         * email:  BT.Acro.tech@equifax.com        ")
            .license("")
            .licenseUrl("http://unlicense.org")
            .termsOfServiceUrl("")
            .version("1.0.0")
            .contact(new Contact("","", ""))
            .build();
    }

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("com.b4nkd.creditscore.equifax.api"))
                    .build()
                .directModelSubstitute(org.threeten.bp.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.threeten.bp.OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

}
