def call(String releaseName, String namespace) {
    echo "Deploying ${releaseName} to namespace ${namespace}"
    // In real setup: sh "helm upgrade --install ${releaseName} ./helm -n ${namespace} --atomic"
    echo "Helm deploy simulated for local environment"
}
