# test-cdek-backend
This is a backend part of the cdek test app.

# How to build
1. You need Maven and Docker for this.
   1. If you have problems with Docker you can skip tests and run the build as follows.
2. You can run build via `mvn verify`.

# How to run
1. You need to Postgres DB to run to the port of 5433
    1. Docker can help you in this way. Run DockerfilePostgres with an exposed port.
2. After the build, you have a jar-file that you can run. Type `java -jar target/test-cdek-backend-1.0-SNAPSHOT.jar`
3. If everything is ok you can see this type of message:
```

2019-08-05 20:57:18.811  INFO 9202 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
```

# How to run if you have an IDEA
I've prepared to run configurations:
1. PostgresCDEK - to run DB via Docker
2. App - to run the app.
