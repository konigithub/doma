package  com.example.actor.config;

import java.util.List;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.data.domain.Page;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.PageRequest;
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.example.actor.web" })
public class WebConfig extends WebMvcConfigurerAdapter {

  @Override
  public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
      PageableHandlerMethodArgumentResolver resolver = new PageableHandlerMethodArgumentResolver();
      resolver.setFallbackPageable(new PageRequest(0, 5));
      argumentResolvers.add(resolver);
      super.addArgumentResolvers(argumentResolvers);
  }

}