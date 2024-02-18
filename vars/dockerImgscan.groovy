def call(){
    sh """
     trivy radhagowthamhub/javaapp:v1 > scan.txt
     cat scan.txt
    """
}