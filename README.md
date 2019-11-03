# kafka-commands

- Start Zookeeper <br>
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

- Start Kafka <br>
.\bin\windows\kafka-server-start.bat .\config\server.properties

- Create Topic <br>
.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic narendra-topic

- Create Producer <br>
.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic narendra-topic
Hello World Javainuse

- Create Consumer <br>
.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic narendra-topic --from-beginning
