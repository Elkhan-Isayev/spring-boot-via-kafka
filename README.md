# Welcome
This example will help you set up and emulate a system consisting of Producer, Consumer and [Apache Kafka](https://kafka.apache.org/)
## Setup
1. Make sure you have [Docker](https://www.docker.com/products/docker-desktop) installed on your computer
2. Download project to your computer
3. Open project in your Terminal
4. Run ```docker-compose up``` command
5. After the whole system is up, open [Postman](https://www.postman.com/downloads/)
6. Using [Postman](https://www.postman.com/downloads/) send a POST request to Producer.
7. Use url:
```
    localhost:8086/test/send
```
   body:
   ```
       {
            "title": "test title",
            "description": "test description"
       }
   ```
7. Going back to the terminal, you can see how your object was already received by the Consumer application and displayed in the terminal.

## Help & support
1. To integrate the project into your system, you need to modify the Consumer & Producer applications.
2. Open Consumer & Producer app in 2 terminals.
3. Run ```docker build -f Dockerfile -t YourDockerHubUsername/nameOfImage . ``` command to create image for Consumer & Producer apps.
4. Run ```docker push YourDockerHubUsername/nameOfImage``` command in both terminals to send your images to [DockerHub](https://hub.docker.com/)
5. Modify docker-compose.yaml file, change image path for Consumer & Producer.
6. Enjoy :)

## Can I contribute?
Yes you can!  Contributions are welcomed. Thank you for considering contributing to the project!