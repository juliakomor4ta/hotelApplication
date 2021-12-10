package remote.config;

    @Configuration
    @EnableSwagger2
    public class SwaggerConfiguration {
        @Bean
        public Docket productApi() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("pl.julia.hotelsapplication"))
                    .build()
                    .useDefaultResponseMessages(false)
                    .ignoredParameterTypes()
                    .apiInfo(new ApiInfo("Hotel information", "","","",new Contact("","","")
                            ,"","", Collections.emptyList()));

        }
    }
