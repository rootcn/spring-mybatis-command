spring-mybatis-command
======================

Spring 3.2 + MyBatis 3.2 command line app.


------------
mvn dependency:copy-dependencies -DoutputDirectory=target/lib


to one jar
mvn clean compile assembly:single

zip project
mvn clean assembly:assembly


------------------
run on windows 
smc.bat

run on linux
chmod +x smc.sh
./smc.sh

ps -ef | grep com.berry
kill -s 9 NNNN

rm -rf FFFF
