package tests.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.List;

public class RunPrivateMethod {

  NewHireRecordSubmittalValidator validator;
  NewHireRecord record;

  // @Test
public void testDate () throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
  Class[] cArg = new Class[4];
  cArg[0] = NewHireRecord.class;
  cArg[1] = Boolean.TYPE;
  cArg[2] = Boolean.TYPE;
  cArg[3] = LocalDate.class;
  
  Method method = validator.getClass().getDeclaredMethod("validateStartDate", cArg );
  
  method.setAccessible(true);
  
//  System.out.println("employee start date: " + record.getEmploymentInfo().getStartDate());
  
  //  This one should fail b/c the employee start date is before company start date
  Object obj = method.invoke(validator, record,  false, false, LocalDate.now().plusDays(3) );
  
//  List<TriNetValidationErrorMetaData> errors = (List<TriNetValidationErrorMetaData>) obj;
  //validator.validateStartDate(record, false, false, LocalDate.now().plusDays(-10) );
  
//  for ( TriNetValidationErrorMetaData   i : errors ) {
//    System.out.println(i.getErrorCode() + "  " + i.getResourceName() + " " + i.getErrorMetaData() );
//  }
  
//  Assert.assertTrue("should have returned error - employee start date is before company's start date ", errors.size()>0);
  
}
}
