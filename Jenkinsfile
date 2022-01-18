pipeline {
    agent { label "master" }

    libraries {
        lib('github.com/mrlandscape20/b5-share-lib@main')
    }
    stages {
        stage("Test"){
            steps {
                script {
                    def res = evenOrOdd(6)
                    print(res)
                }
            }
        }
    }
    
}
