# wxgzh
个人开发的微信公众号项目
cd /usr/local/software/wxgzh/
mvn clean
mvn install package -Dmaven.test.skip=true
docker stop wxgzh
docker rm wxgzh
docker rmi wxgzh:v1
docker build -t wxgzh:v1 . 
docker run -itd --name wxgzh -p 80:80 wxgzh:v1
docker ps -a
docker logs -f wxgzh


