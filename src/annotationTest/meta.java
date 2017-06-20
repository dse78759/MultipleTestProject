package annotationTest;

import java.lang.annotation.*; 
import java.lang.reflect.*; 
 
// An annotation type declaration. 
@Retention(RetentionPolicy.SOURCE)  
@interface MyAnno { 
  String str(); 
  int val(); 
} 
 
class Meta { 
 
  // Annotate a method. 
  @MyAnno(str = "string-thing", val = 100) 
  public static void myMeth() { 
    Meta ob = new Meta(); 
 
    // Obtain the annotation for this method 
    // and display the values of the members. 
    try { 
      // First, get a Class object that represents 
      // this class. 
      Class c = ob.getClass(); 
 
      System.out.println(c.getCanonicalName() + " "+ c.getSimpleName()); 
        // Now, get a Method object that represents 
      // this method. 
      Method m = c.getMethod("myMeth"); 
      System.out.println("method = "+m.getName() );
 
      // Next, get the annotation for this class. 
      MyAnno anno = m.getAnnotation(MyAnno.class); 
  
      if ( anno!=null ) {
	      // Finally, display the values. 
	      System.out.println(anno.annotationType().getName() + " " +  anno.str() + " " + anno.val()); 
	      System.out.println(anno.toString() + " ");
	//      System.out.println(anno.)
      }
      else {
          System.err.println("annotation Not Found."); 
    	  
      }
    } catch (NoSuchMethodException exc) { 
       System.out.println("Method Not Found."); 
    } 
  } 
 
 // thanks
  public static void main(String args[]) { 
    myMeth(); 
    System.out.println("done");
  } 
}
