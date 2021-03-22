import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld oneMoreWorld = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean.equals(oneMoreWorld));

        Cat catBean = applicationContext.getBean("cat", Cat.class);
        Cat oneMoreCat = applicationContext.getBean("cat", Cat.class);
        System.out.println(catBean.equals(oneMoreCat));
    }
}