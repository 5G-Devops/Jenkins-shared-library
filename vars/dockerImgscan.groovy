def call(){
    sh """
     trivy image radhagowthamhub/javaapp:latest > scan.txt
     cat scan.txt
    """
}