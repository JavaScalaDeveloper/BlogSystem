#!/usr/bin/env bash

echo '=====开始结束运行博客服务====='

echo '=====结束运行portainer可视化工具====='
docker-compose -f ../yaml/portainer.yml down

echo '=====结束运行mysql====='
docker-compose -f ../yaml/mysql.yml down

echo '=====结束运行nacos====='
docker-compose -f ../yaml/nacos.yml down

echo '=====结束运行rabbitmq====='
docker-compose -f ../yaml/rabbitmq.yml down

echo '=====结束运行redis====='
docker-compose -f ../yaml/redis.yml down

echo '=====开始部署data====='
docker-compose -f ../yaml/data.yml down

echo '=========================='
echo '=====结束后台服务运行====='
echo '=========================='

echo '=====结束运行gateway====='
docker-compose -f ../yaml/gateway.yml down

echo '=====结束运行admin====='
docker-compose -f ../yaml/admin.yml down

echo '=====结束运行picture====='
docker-compose -f ../yaml/picture.yml down

echo '=====结束运行sms====='
docker-compose -f ../yaml/sms.yml down

echo '=====结束运行web====='
docker-compose -f ../yaml/web.yml down


echo '=========================='
echo '=====结束前台服务运行====='
echo '=========================='

echo '=====结束运行vue_admin====='
docker-compose -f ../yaml/vue_admin.yml down


echo '=====结束运行vue_web====='
docker-compose -f ../yaml/vue_web.yml down

echo '=============================='
echo '=====所有服务已经结束运行====='
echo '=============================='
