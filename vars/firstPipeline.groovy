//pipeline+groovy
// importing calculator class

import com.i27academy.builds.Calculator;

def call(Map pipelineparams){

// An instance of class called Calculator is created

Calculator calculator = new Calculator(this)



pipeline{
    agent any
        environment{
            APP_NAME = ${pipelineparams.appName} //this value should be coming from microservices
        }
        stages{
            stage('AdditionStage'){
                steps{
                    script{
                        echo "Printing sum of 2 numbers"
                        println calculator.add(3,4)
                        echo "**** MicroService name is  ${APP_NAME}****"
                    }
                }
            }
        
        stage('Secondstage'){
            echo "executing the second stage"
        }
    }

}

