def call(String imageName, String tag, String harborUrl, String project) {
    echo "Pushing ${imageName}:${tag} to Harbor"
    
    withCredentials([usernamePassword(
        credentialsId: 'harbor-credentials',
        usernameVariable: 'HARBOR_USER',
        passwordVariable: 'HARBOR_PASS'
    )]) {
        sh """
            docker login ${harborUrl} \
              -u ${HARBOR_USER} \
              -p ${HARBOR_PASS}
            
            docker tag ${imageName}:${tag} \
              ${harborUrl}/${project}/${imageName}:${tag}
            
            docker push ${harborUrl}/${project}/${imageName}:${tag}
        """
    }
}
