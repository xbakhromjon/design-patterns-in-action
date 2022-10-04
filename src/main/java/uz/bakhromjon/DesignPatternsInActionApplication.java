package uz.bakhromjon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import uz.bakhromjon.prototype.ProtoFalse;
import uz.bakhromjon.prototype.ProtoTrue;

@SpringBootApplication
public class DesignPatternsInActionApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsInActionApplication.class, args);
    }

    @Bean
    public ProtoFalse protoFalse() {
        return new ProtoFalse();
    }


    @Bean
    @Scope("prototype")
    public ProtoTrue protoTrue() {
        return new ProtoTrue();
    }
}
