import com.rhythm.spring.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class MainTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        print(applicationContext.getBeanDefinitionNames());
    }


    private static void print(String[] data){
        for (String name:data) {
            System.out.println(name);
        }
    }

}
