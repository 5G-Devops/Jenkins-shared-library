def call(String userHub, String imageNme, String imageTag ){
    sh """
     trivy image ${userHub}/${imageNme}:latest > scan.txt
     cat scan.txt
    """
}