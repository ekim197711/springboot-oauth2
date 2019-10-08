curl \
-X POST \
-u myapp1:myapp1password \
-H "Content-Type: application/x-www-form-urlencoded" \
-d  "username=mike&password=mikespassword&grant_type=password" \
"http://localhost:8081/oauth/token"

