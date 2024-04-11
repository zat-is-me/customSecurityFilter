# Custom Spring Security Filter Chain spring Boot 3.2.4
1, Create a class which implement Filter interface from Jakarta package and override the addFilter method        

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
    throws IOException, ServletException {
        ... own filter logic ...
    }

2, Add to the securityFilterChain bean in the configuration class.  

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity httpSecurity) throws Exception {
    ...
    .addFilterBefore(new RequestValidationBeforeFilter(), BasicAuthenticationFilter.class)/* Before basic authentication */
    .addFilterAt(new AuthoritiesLoggingAtFilter(), BasicAuthenticationFilter.class)/* During basic authentication */
    .addFilterAfter(new CsrfCookieFilter(), BasicAuthenticationFilter.class)/* After basic authentication */
    .addFilterAfter(new AuthoritiesLoggingAtFilter(), BasicAuthenticationFilter.class)
    ...
    }
3, Finally if it does not work clone this project and run.

4, Follow me on https://www.linkedin.com/in/tatekahmed/ 