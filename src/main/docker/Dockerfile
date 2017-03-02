FROM vixns/java8
WORKDIR .
COPY build/libs/restapitest-0.0.1.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
EXPOSE 8080
CMD java $JAVA_OPTS -jar /app.jar
