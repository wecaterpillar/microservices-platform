FROM nginx:1.21.0

LABEL MAINTAINER=Andy
RUN rm -rf /usr/share/nginx/html/*
COPY src/main/resources/static/ /usr/share/nginx/html/

# docker run --name ea-web \
# -v /host/path/apiUrl.js:/usr/share/nginx/html/module/apiUrl.js:ro
# -d ea-web:4.5
