def call(){
    sh """
     trivy image radhagowthamhub/javaapp radhagowthamhub/javaapp:latest > scan.txt
     cat scan.txt
    """
}