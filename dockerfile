FROM ubuntu:latest
RUN apt-get update

# Install software
RUN apt-get install -y java-11
RUN apt-get install -y git
RUN mkdir app
RUN cd app
RUN git clone https://github.com/randanesilva/onecatalog-adminapi.git