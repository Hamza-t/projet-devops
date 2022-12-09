#!/usr/bin/env groovy

def gv 

pipeline {
	agent any
	stages {
		stage ('init') {
			steps {
				script{
					gv = load "pipeline.groovy"
				}
			}
		}
		stage ('clone') {
			steps {
				script{
					gv.clonegit()
				}
			} 
		}
		stage ('clean') {
			steps {
				script{
					gv.mmvn_clean()
				}
			} 
		}
		stage ('unit tests') {
			steps{
				script{
					gv.unit_test()
				}
			}
		}
		stage ('sonarqube') {
			steps{
				script{
					gv.sonar()
				}
			}
		}
	}
}

