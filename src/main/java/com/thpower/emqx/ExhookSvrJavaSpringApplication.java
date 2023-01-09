package com.thpower.emqx;

import com.thpower.emqx.service.ExServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author thpower
 */
@SpringBootApplication
public class ExhookSvrJavaSpringApplication {

    public static void main(String[] args) {
//        SpringApplication.run(ExhookSvrJavaSpringApplication.class, args);

        try {
            final ExServer server = new ExServer();
            server.start();
            server.blockUntilShutdown();
        }catch (Exception e){

        }

    }

}
