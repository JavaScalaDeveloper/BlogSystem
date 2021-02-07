#!/usr/bin/env bash

echo '=====开始安装博客环境====='

echo '=====开始运行mysql====='
docker-compose -f ../yaml/mysql.yml up -d
echo '=====mysql正在进行初始化====='
./wait-for-it.sh http://localhost:3306 --timeout=60  -- echo "=====mysql已经准备就绪====="

echo '=====开始部署portainer可视化工具====='
#docker-compose -f ../yaml/portainer.yml up -d

echo '=====开始运行nacos====='
docker-compose -f ../yaml/nacos.yml up -d
echo '=====nacos正在进行初始化,请等待...====='
./wait-for-it.sh http://localhost:8848 --timeout=60  -- echo "=====nacos已经准备就绪====="

echo '=====开始运行rabbitmq====='
docker-compose -f ../yaml/rabbitmq.yml up -d

echo '=====开始运行redis====='
docker-compose -f ../yaml/redis.yml up -d

echo '=====开始部署data====='
docker-compose -f ../yaml/data.yml up -d


echo '======================'
echo '=====开始运行后台====='
echo '======================'

echo '=====开始运行gateway====='
docker-compose -f ../yaml/gateway.yml up -d

echo '=====开始运行admin====='
docker-compose -f ../yaml/admin.yml up -d

echo '=====开始运行picture====='
docker-compose -f ../yaml/picture.yml up -d

echo '=====开始运行sms====='
docker-compose -f ../yaml/sms.yml up -d

echo '=====开始运行web====='
docker-compose -f ../yaml/web.yml up -d

echo '执行完成 日志目录: ./log'


echo '======================'
echo '=====开始运行前台====='
echo '======================'

echo '=====开始运行vue_admin====='
docker-compose -f ../yaml/vue_admin.yml up -d


echo '=====开始运行vue_web====='
docker-compose -f ../yaml/vue_web.yml up -d

echo '================================================================='
echo '=====【微服务启动需要耗费一定时间，请到Nacos中查看启动情况】====='
echo '================================================================='
