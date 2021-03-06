import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class HelloWorldConfig {

    @Bean
    public MessageProvider provider(){
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer messageRenderer(){
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
