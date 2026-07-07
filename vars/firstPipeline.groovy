//pipeline+groovy
// importing calculator class

import com.i27academy.builds.Calculator;

// An instance of class called Calculator is created

Calculator calculator = new Calculator(this)



pipeline{
    agent any{
        stages{
            stage('AdditionStage'){
                steps{
                    script{
                        echo "Printing sum of 2 numbers"
                        println calculator.add(3,4)
                    }
                }
            }
        }
    }
}

