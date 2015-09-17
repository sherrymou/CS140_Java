.PHONY: all
all:
	javac -d . -cp .:junit.jar:hamcrest.jar `find . | grep -i \.java | grep -v "~"`
	java -cp .:junit.jar:hamcrest.jar org.junit.runner.JUnitCore assignment03.Tester
