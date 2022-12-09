#!/usr/bin/env groovy

def gv 

pipeline {
	agent any
	stages {
		stage ('initialize') {
			steps {
				script{
					gv = load "pipeline.groovy"
				}
			}
		}
		stage ('clone_git') {
			steps {
				script{
					gv.clonegit()
				}
			} 
		}
		stage ('clean_mvn') {
			steps {
				script{
					gv.mmvn_clean()
				}
			} 
		}
		stage ('Unit testing') {
			steps{
				script{
					gv.unit_test()
				}
			}
		}
		stage ('Sonar') {
			steps{
				script{
					gv.sonar()
				}
			}
		}
	}
}

