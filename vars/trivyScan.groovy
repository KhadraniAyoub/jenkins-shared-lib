def call(String imageName, String tag) {
    echo "Scanning image for vulnerabilities: ${imageName}:${tag}"
    sh "trivy image --exit-code 0 --severity HIGH,CRITICAL ${imageName}:${tag}"
    // exit-code 0 for local testing (don't fail on vulns during demo)
    // in production: --exit-code 1
}
