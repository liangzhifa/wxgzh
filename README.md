# wxgzh
个人开发的微信公众号项目
cd /usr/local/software/wxgzh/
sleep 2
mvn clean install package -Dmaven.test.skip=true

sleep 2

docker stop wxgzh

sleep 2

docker rm wxgzh

sleep 2

docker rmi wxgzh:v1

sleep 2

docker build -t wxgzh:v1 . 

sleep 2

docker run -itd --name wxgzh -p 80:80 wxgzh:v1

