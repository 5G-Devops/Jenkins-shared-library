def call(){
    sh """
     trivy radhagowthamhub/javaapp radhagowthamhub/javaapp:latest > scan.txt
     cat scan.txt
    """
}