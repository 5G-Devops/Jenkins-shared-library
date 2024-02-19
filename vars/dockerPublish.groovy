def call(String userHub, String imageNme, String imageTag ){
    withCredentials([usernamePassword(
        credentialsId: "dockerloginid", 
        passwordVariable: "PASS", 
        usernameVariable: "USER"
        )]) {
    sh "docker login -u '$USER' -p '$PASS'"
    sh "docker image push ${userHub}/${imageNme}:${imageTag}"
    sh "docker image push ${userHub}/${imageNme}:latest"
}
}