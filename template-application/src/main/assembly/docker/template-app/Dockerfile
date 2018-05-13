FROM centos:6.6
RUN yum install java -y
RUN yum install openssh-server -y
RUN yum install wget -y
RUN yum install vim -y
RUN mkdir -p /data
ADD template-application-*.jar /data/template-application.jar
ADD template.yml /data/template.yml
EXPOSE 8080
EXPOSE 8081

CMD java -jar /data/template-application.jar server /data/template.yml
