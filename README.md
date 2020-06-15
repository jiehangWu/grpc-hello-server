# grpc-hello-server
This is a simple example of gRpc client/server communication for my future reference.
## How to build using Maven
To compile proto: ```mvn -DskipTests package ```<br>
To build server: ```mvn -DskipTests package exec:java -Dexec.mainClass=com.example.grpc.App```<br>
To build client: ```mvn -DskipTests package exec:java -Dexec.mainClass=com.example.grpc.Client```
