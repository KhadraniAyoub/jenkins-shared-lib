def call() {
    echo "Running SonarQube analysis"
    // In real setup: withSonarQubeEnv('sonar-server') { sh "mvn sonar:sonar" }
    // waitForQualityGate abortPipeline: true
    echo "SonarQube scan simulated for local environment"
}
