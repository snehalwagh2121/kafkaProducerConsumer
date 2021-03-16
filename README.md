# kafkaProducerConsumer


This Project will give basic understaning of how the Kafka set up is done, and how the messages are sent in Kafka Topic and received by the Consumer.

to understand more about this please go through the following article.
https://bitstobytes821.medium.com/guide-for-kafka-with-spring-boot-aa8d9020f717

Kafka commands:

start zookeeper:
bin/zookeeper-server-start.sh config/zookeeper.properties

start kafka broker:
bin/kafka-server-start.sh config/server.properties

Create a topic:
bin/kafka-topics.sh --create --topic DEMO_PRODUCER_TOPIC --bootstrap-server localhost:9092

to see messages in topic in PRODUCER mode:
bin/kafka-console-producer.sh --topic DEMO_PRODUCER_TOPIC --bootstrap-server localhost:9092

to see messages in tpoic in CONSUMER mode:
bin/kafka-console-consumer.sh --topic DEMO_CONSUMER_TOPIC --from-beginning --bootstrap-server localhost:9092

