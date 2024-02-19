def call(){
    withCredentials([usernamePassword(
        credentialsId: 'dockerloginid', 
        passwordVariable: 'PASS', 
        usernameVariable: 'USER'
        )]) {
    sh 'docker login -u'$USER' -p'$PASS''
    sh 'docker image push radhagowthamhub/javaapp:v1'
    sh 'docker image push radhagowthamhub/javaapp:latest'
}
}