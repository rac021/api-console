FROM alpine

MAINTAINER R Yahiaoui "r.yahiaoui.21@gmail.com"

#
# install Node & Git
#
RUN apk add --update nodejs git \
		&& rm -rf /var/cache/apk/*

#
# install Bower & Grunt
#
RUN npm install -g bower grunt-cli

#
# define working directory.
#
WORKDIR /data

#
# download the specified (API_CONSOLE_VERSION) version of RAML api:Console
#

# ENV API_CONSOLE_VERSION chores/angular-1.5
# RUN git clone --depth 1 --branch $API_CONSOLE_VERSION https://github.com/mulesoft/api-console.git /data \

RUN git clone https://github.com/mulesoft/api-console.git /data \
        && rm -rf /data/dist/examples                           \
        && rm -rf /data/src                                     \
        && rm -rf /data/test                                    \
        && rm -rf /data/.git                                    \
        && mkdir  /data/dist/apis 

#
# install modules and dependencies with NPM and Bower
#
RUN npm install \
        && bower install --production --allow-root \
        && npm cache clean \
        && bower cache clean --allow-root


COPY simple.raml /data/dist/apis/

ONBUILD ADD . /data/dist/apis/

EXPOSE 9000
EXPOSE 35729

#
# start Node.js server with Grunt
#

ENTRYPOINT ["grunt", "connect:livereload", "watch"]


