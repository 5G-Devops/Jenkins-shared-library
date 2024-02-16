
def call(MAP stageparams) {
      checkout([
         $class: 'GitSCM'
         branches: [[name: stageparams.branch]],
         userRemoteConfigs: [[url: stageparams.url]]
         ])
}
