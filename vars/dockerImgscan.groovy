def call(){
    sh """
     trivy image tag radhagowthamhub/javaapp radhagowthamhub/javaapp:latest > scan.txt
     cat scan.txt
    """
}