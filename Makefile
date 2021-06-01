.SHELLFLAGS = -e -c

.ONESHELL:

all: compile tests

compile:
	javac src/*.java
	javac -classpath src test/*.java

tests:
	cd test
	for c in $$(ls *Test.class | gsed s/.class//); do
		java -enableassertions -classpath .:../src $${c}
	done
	echo 'The build is CLEAN!'
