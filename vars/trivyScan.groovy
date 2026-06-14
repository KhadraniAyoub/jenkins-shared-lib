def call(String imageName, String tag) {
    echo "Scanning ${imageName}:${tag} for vulnerabilities"
    sh """
        trivy image \
          --exit-code 0 \
          --severity HIGH,CRITICAL \
          --format table \
          ${imageName}:${tag}
    """
}
