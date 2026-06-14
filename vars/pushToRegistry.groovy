def call(String imageName, String tag) {
    echo "Pushing image to registry: ${imageName}:${tag}"
    // In real setup: withCredentials([...]) { sh "docker push ..." }
    echo "Push simulated for local environment"
}
