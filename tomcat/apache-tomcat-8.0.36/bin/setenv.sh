# enable APR library
export CATALINA_OPTS="$CATALINA_OPTS -Djava.library.path=$PATH:/usr/local/apr/lib"

# performance config
export CATALINA_OPTS="$CATALINA_OPTS -Xms2048m"
export CATALINA_OPTS="$CATALINA_OPTS -Xmx2048m"

# Eparking add cdm to classpath
CLASSPATH=/projects/eparking/lib/eparking-cdm.jar
