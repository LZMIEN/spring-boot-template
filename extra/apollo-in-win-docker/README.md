# Startup Apollo configuration server in local windows docker

* Only for test
* Reference: https://github.com/ctripcorp/apollo/wiki/Apollo-Quick-Start-Docker%E9%83%A8%E7%BD%B2

# Deploy

* Install docker in local windows
* Execute `docker-compose up -d` in this directory

# Add application in apollo

* Console: `http://host.docker.internal:8070`, username: `apollo`, password: `admin`
* Add an application `web-demo` on apollo

# Startup springboot application

* Add dependency `com.ctrip.framework.apollo:apollo-client:$version_apollo` in build.gradle
* Enable apollo in `application.properties`
* Add JVM args `-Denv=dev`
* Startup app

# Undeploy, optional

* Execute `docker-compose down` in this directory
