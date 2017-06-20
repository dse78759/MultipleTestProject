  
# the wild card didn't work either with or without wrapping it in ticks

  565  export CLASSPATH=.:~/Downloads/velocity-1.7/velocity-1.7.jar:../../bin/*jar
  566  export CLASSPATH='.:~/Downloads/velocity-1.7/velocity-1.7.jar:../../bin/*jar'
  567  echo $CLASSPATH
  568  java Example example.vm 

# WORKED!
  569  export CLASSPATH=.:~/Downloads/velocity-1.7/velocity-1.7.jar:../../bin/commons-collections-3.2.1.jar:../../bin/commons-lang-2.4.jar 
  570  java Example example.vm 
  
 

  576  h > finally.made.it.work.sh
