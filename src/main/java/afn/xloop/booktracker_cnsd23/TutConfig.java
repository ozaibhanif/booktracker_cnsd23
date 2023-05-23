package afn.xloop.booktracker_cnsd23;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


// @Profile({"tut1","hello-world"})
@Configuration
public class TutConfig {
    
    @Bean
    public Queue hello(){
        return new Queue("hello");
    }

}
