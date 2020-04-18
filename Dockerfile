FROM pbeniwal/tomcat

COPY helloedureka.war /opt/tomcat/webapps/

CMD ["/opt/tomcat/bin/catalina.sh", "run"]
