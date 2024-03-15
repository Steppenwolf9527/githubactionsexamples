# 使用 openjdk:17 作为基础镜像
FROM openjdk:17

# 将 target 目录下的所有 jar 文件复制到 /home/githubactions.jar
COPY ./target/*.jar /home/githubactions.jar

# 设置 /home/githubactions.jar 为镜像的入口点
ENTRYPOINT java, -jar, /home/githubactions.jar

