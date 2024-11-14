#version: '3.8'
#services:
#  mysql:
#    image: mysql:8.0
#    container_name: mysql-container
#    environment:
#      MYSQL_ROOT_PASSWORD: your_password
#      MYSQL_DATABASE: your_database
#    ports:
#      - "3306:3306"
#
#  app:
#    image: openjdk:17-jdk-slim
#    container_name: spring-boot-app
#    depends_on:
#      - mysql
#    ports:
#      - "8080:8080"
#    volumes:
#      - ./:/usr/src/app
#    working_dir: /usr/src/app
#    command: ./mvnw spring-boot:run
