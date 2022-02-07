import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        MessageRenderer messageRenderer = ctx.getBean("messageRenderer", MessageRenderer.class);

        messageRenderer.renderer();
    }
}
