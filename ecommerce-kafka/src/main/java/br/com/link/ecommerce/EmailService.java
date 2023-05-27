package br.com.link.ecommerce;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;
import java.util.UUID;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

public class EmailService {

	public static void main(String[] args) {
		var consumer = new KafkaConsumer<String, String>(properties());
		consumer.subscribe(Collections.singletonList("ECOMMERCE_SEND_EMAIL"));
		while (true) {
			var records = consumer.poll(Duration.ofMillis(100));
			if (!records.isEmpty()) {
				for (var record : records) {
					System.out.println("----------------------------------");
					System.out.println("Send email");
					System.out.println("KEY: " + record.key());
					System.out.println("VALUE: " + record.value());
					System.out.println("PARTITION: " + record.partition());
					System.out.println("OFFSET: " + record.offset());
					System.out.println("----------------------------------");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Email sent");
				}
			}
		}
	}

	private static Properties properties() {
		var properties = new Properties();
		properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
		properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
		properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
		properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, EmailService.class.getSimpleName());
		properties.setProperty(ConsumerConfig.CLIENT_ID_CONFIG,
				EmailService.class.getSimpleName() + "-" + UUID.randomUUID().toString());
		return properties;
	}
}
