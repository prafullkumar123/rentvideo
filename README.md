# rentvideo
## For Costumer Registration
curl --location 'http://localhost:8080/api/auth/register' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=600EC6E07F0250632DFC147443C2878C' \
--data '{
"username": "admin",
"password": "admin",
"role": "ADMIN"
}'

## For Costumer Registration
curl --location 'http://localhost:8080/api/auth/register' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=F5095FBE24E377F9B5FFE8F7482D95BD' \
--data '{
"username": "customer1",
"password": "customer1"
}'

## For Adding Video
curl --location 'http://localhost:8080/api/admin/videos' \
--header 'Content-Type: application/json' \
--header 'Authorization: Basic YWRtaW46YWRtaW4=' \
--header 'Cookie: JSESSIONID=F5095FBE24E377F9B5FFE8F7482D95BD' \
--data '{
"title": "AAA",
"description": "Mind-bending Movie",
"available": true
}'

## For getting the Videos
curl --location 'http://localhost:8080/api/videos' \
--header 'Authorization: Basic Y3VzdG9tZXIxOnBhc3N3b3Jk' \
--header 'Cookie: JSESSIONID=F5095FBE24E377F9B5FFE8F7482D95BD'
