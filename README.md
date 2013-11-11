spring-mybatis-command
======================

Spring 3.2 + MyBatis 3.2 command line app.

use socket to stop program.

------------
mvn dependency:copy-dependencies -DoutputDirectory=target/lib


to one jar
mvn clean compile assembly:single

zip project
mvn clean assembly:assembly


------------------
run
on windows 
startup.bat

on linux
chmod +x startup.sh
./startup.sh

shutdown
on windows
shutdown.bat

on linux
chmod +x shutdown.sh
shutdown.sh

ps -ef | grep com.berry
kill -s 9 NNNN

rm -rf FFFF
