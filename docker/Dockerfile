FROM openjdk:20-ea-17-oraclelinux8

#会将宿主机的target/*.jar文件复制到 镜像的工作目录 /app/ 下
COPY springboot-jenkins-0.0.1-SNAPSHOT.jar /home/weixingyu/project

WORKDIR /home/weixingyu/project

CMD java -jar springboot-jenkins-0.0.1-SNAPSHOT.jar