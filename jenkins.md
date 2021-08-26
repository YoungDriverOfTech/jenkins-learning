# jenkins 使用方法
1. docker 拉取jenkins
```
docker pull jenkins/jenkins
```

2. 启动
```
docker run -p 8080:8080 -v ./jenkins-data:/var/jenkins_home jenkins/jenkins
```
记住给出的密码
```
216b62d65fa742af9bbcf5ef08ae8f70
```
然后访问localhost:8080
输入刚才的密码

3. travis ci

