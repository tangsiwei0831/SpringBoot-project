# Run process
1. check if the app works

    `mvn clean compile`
2. open brower and go to link
    
    `localhost:8080/api/random`

3. refresh browser to make sure it generates random number

4. use command to create a `.jar` file in `target/` folder

    `mvn install`

5. run coomand to build docker image

    `docker build -t spring-random .`

6. run command to run ther container

    `docker run -p 8080:8080 spring-random .`