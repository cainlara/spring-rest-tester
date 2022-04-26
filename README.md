# Build
`mvn clean package`

# Execute
`java -jar target/spring-rest-tester-jar-with-dependencies.jar`

# cURL examples
* curl --request POST \
  --url http://localhost:8080/v1/test \
  --header 'Content-Type: application/json' \
  --data '{
  "productType" : "refily",
  "field1" : "Campo 1",
  "field2" : "Campo 2"
}'

* curl --request POST \
  --url http://localhost:8080/v1/test \
  --header 'Content-Type: application/json' \
  --data '{
  "productType" : "msql",
  "field3" : 12,
  "field4" : 45
}'

* curl --request POST \
  --url http://localhost:8080/v1/test \
  --header 'Content-Type: application/json' \
  --data '{
  "productType" : "other",
  "field1" : true,
  "field2" : false
}'