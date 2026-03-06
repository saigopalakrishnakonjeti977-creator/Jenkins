FROM ubuntu:latest
LABEL authors="sai"

ENTRYPOINT ["top", "-b"]