FROM centos:7

MAINTAINER "Dmitry Buzdin" <dmitry.d.buzdin@ericsson.com>

USER root

RUN yum -y update

ENV example_home /opt/docker-example
ENV example_port 8080

RUN yum -y install python \
  && yum clean all

RUN mkdir ${example_home}

COPY index.html ${example_home}/index.html

WORKDIR ${example_home}

EXPOSE ${example_port}

ENTRYPOINT python -m SimpleHTTPServer ${example_port}
