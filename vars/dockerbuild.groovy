def call(String userHub, String imageNme, String imageTag ){
    sh """
     docker build -t ${userHub}/${imageNme}.
     docker image tag ${userHub}/${imageNme} ${userHub}/${imageNme}:${imageTag}
     docker image tag ${userHub}/${imageNme} ${userHub}/${imageNme}:latest
    """
}