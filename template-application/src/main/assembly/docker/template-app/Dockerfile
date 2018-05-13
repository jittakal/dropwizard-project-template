FROM centos:6.6
RUN yum install java -y
RUN yum install openssh-server -y
RUN yum install wget -y
RUN yum install vim -y
RUN mkdir -p /data
ADD compose-customer-application-*.jar /data/compose-customer-application.jar
ADD customer.yml /data/customer.yml
EXPOSE 8080
EXPOSE 8081

CMD java -jar /data/compose-customer-application.jar server /data/customer.yml
