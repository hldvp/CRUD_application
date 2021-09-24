import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.config.WebConfig;
import web.service.UserService;

public class Tests {
    UserService userService;

    @Before
    public void setUp() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(WebConfig.class);
        userService = context.getBean(UserService.class);
    }

    @Test
    public void Test() {

    }
}
