docker run \
    --rm \
    -e SONAR_HOST_URL="http://localhost:9000" \
    -e SONAR_SCANNER_OPTS="-Dsonar.projectKey=go-sonar" \
    -e SONAR_TOKEN="sqp_453f6bbe7bf32dc410826d79f2eba2b0262d6cd5" \
    -v "$(pwd):/usr/src" --network="host" \
    sonarsource/sonar-scanner-cli





** OR **

sonar-scanner \
  -Dsonar.projectKey=go-sonar \
  -Dsonar.sources=. \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.token=sqp_453f6bbe7bf32dc410826d79f2eba2b0262d6cd5