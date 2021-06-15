.SHELLFLAGS = -e -c

# Running under Windows ?
ifeq ($(OS), Windows_NT)
SEP = ;
else
SEP = :
endif

.ONESHELL:

all: compile tests

compile:
	javac -encoding UTF8 src/*.java
	javac -encoding UTF8 -classpath src test/*.java

tests:
	java -ea -cp "$(realpath test)$(SEP)$(realpath src)" $(notdir $(basename $(wildcard test/*Test.class)))
	$(system echo The build is CLEAN!)
