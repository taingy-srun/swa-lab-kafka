package lab12.kafkareceiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaReceiverApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaReceiverApplication.class, args);
    }

}
