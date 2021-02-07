#!/usr/bin/env bash

echo '=====开始更新博客镜像====='

echo '=====开始关闭运行的容器====='
sh kernShutdown.sh

echo '=====开始更新gateway====='
docker pull registry.cn-shenzhen.aliyuncs.com/blog/gateway

echo '=====开始更新admin====='
docker pull registry.cn-shenzhen.aliyuncs.com/blog/admin

echo '=====开始更新web====='
docker pull registry.cn-shenzhen.aliyuncs.com/blog/web

echo '=====开始更新sms====='
docker pull registry.cn-shenzhen.aliyuncs.com/blog/sms

echo '=====开始更新picture====='
docker pull registry.cn-shenzhen.aliyuncs.com/blog/picture

echo '=====开始更新vue_admin====='
docker pull registry.cn-shenzhen.aliyuncs.com/blog/vue_admin

echo '=====开始更新vue_web====='
docker pull registry.cn-shenzhen.aliyuncs.com/blog/vue_web

echo '=====删除docker标签为none的镜像====='
docker images | grep none | awk '{print $3}' | xargs docker rmi

echo '=====开始运行的一键部署脚本====='
sh kernStartup.sh
