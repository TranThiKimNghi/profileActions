FROM nginx:alpine

# xóa web mặc định của nginx
RUN rm -rf /usr/share/nginx/html/*

# copy toàn bộ file frontend vào nginx
COPY . /usr/share/nginx/html

# mở port 80 trong container
EXPOSE 80

# chạy nginx
CMD ["nginx", "-g", "daemon off;"]