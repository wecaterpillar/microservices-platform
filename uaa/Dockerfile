FROM openjdk:8u292

LABEL MAINTAINER=Andy
WORKDIR /apps
ADD target/ea-uaa.jar /apps/
CMD ["java","-jar","ea-uaa.jar"]
# docker run --name ea-uaa \
# -e spring_cloud_nacos_server_addr=10.0.0.12:8848 \
# -e ea_datasource_ip=10.0.0.12 \
# -e ea_datasource_username=root \
# -e ea_datasource_password=redhat \
# -e spring_redis_host=10.0.0.12 \
# -d ea-uaa:4.5
