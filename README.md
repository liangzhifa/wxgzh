# wxgzh
个人开发的微信公众号项目
cd /usr/local/software/wxgzh/
git pull
mvn clean
mvn install package -Dmaven.test.skip=true
docker stop wxgzh
docker rm wxgzh
docker rmi wxgzh:v1
docker build -t wxgzh:v1 . 
docker run -itd --name wxgzh -p 80:80 wxgzh:v1
docker ps -a
docker logs -f wxgzh


docker run -d -it -p 8000:8000 -e MYSQL_USER=root -e MYSQL_ADDR=47.100.45.101:3306 -e MYSQL_PASSWORD=zhifa123 -e MYSQL_DB=wxgzh test/yearning



