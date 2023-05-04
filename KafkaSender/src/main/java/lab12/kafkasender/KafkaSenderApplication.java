package lab12.kafkasender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
@EnableKafka
public class KafkaSenderApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSenderApplication.class, args);
	}

	@Autowired
	private Sender sender;

	@Override
	public void run(String... args) throws Exception {
		sender.sendMessage("Hello world!");
		sender.sendMessage("Msg 1!");
		sender.sendMessage("Hello!");
		sender.sendMessage2("Hello world! from topic-A2");
	}
}
