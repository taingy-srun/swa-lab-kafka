package lab12.kafkasender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Sender {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${app.topic.topic-a}")
    private String topic;

    @Value("${app.topic.topic-a2}")
    private String topicA2;

    public void sendMessage(String msg) {
        kafkaTemplate.send(topic, msg);
    }

    public void sendMessage2(String msg) {
        kafkaTemplate.send(topicA2, msg);
    }

}
