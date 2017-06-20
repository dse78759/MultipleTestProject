import org.springframework.context.ApplicationContext;

//      String [] aliases = context.getAliases(arg0);
      
      sout ("\n\n\n\n");
      sout ("app name : " + context.getApplicationName() );
      sout ("num beans: " + context.getBeanDefinitionCount());
      sout ("display name: " + context.getDisplayName() );
      
      String[] beans = context.getBeanDefinitionNames();
      for ( String xx : beans) {
        sout (" bean names: " + xx );
      }
      sout ("\n\n\n\n");

      LOGGER.error("test err");
      LOGGER.info("test info");
      //        sout ("num beans: " + context.getBeanDefinitionCount());
//      sout ("num beans: " + context.getBeanDefinitionCount());
    }
    