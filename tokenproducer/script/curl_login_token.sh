curl \
-X POST \
-u mike:mike1234 \
-H "Content-Type: application/x-www-form-urlencoded" \
-d  "client_id=myclient&client_secret=myclientsecret&grant_type=password" \
"http://localhost:8081/oauth/token"