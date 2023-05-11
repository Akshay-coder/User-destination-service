#User-Destination Microservices Integration with Kafka
This project showcases the integration of user and destination microservices using Apache Kafka, allowing seamless communication and combining user and destination details into a meaningful output.

#Project Overview
The goal of this project is to create a fault-tolerant web application that consists of two microservices: the user-service and the destination-service. These microservices communicate through Kafka topics to exchange user and destination information. The objective is to combine the user and destination details and produce the resulting data to a third Kafka topic.

#Key Features
Utilizes Spring Boot for building the microservices
Implements Apache Kafka for inter-service communication
Kafka topics: user-service and destination-service
Combines user and destination information
Publishes the merged data to a third Kafka topic

#Setup Instructions
Clone the repository: git clone the repository
Install dependencies: Go to directory and run mvn install
Set up Kafka: Install and configure Apache Kafka on your system
Configure application properties: Update Kafka connection details in application.properties files of user-service and destination-service
Start the microservices: Run the main application classes of user-service and destination-service
Verify functionality: Monitor the Kafka topics and check if the merged user-destination data is being produced to the third topic
