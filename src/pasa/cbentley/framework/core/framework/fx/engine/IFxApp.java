package pasa.cbentley.framework.core.framework.fx.engine;

import javafx.application.Application;
import javafx.stage.Stage;

public interface IFxApp {
   /**
    * 
    * @param app
    * @throws Exception
    */
   public void start(Application app, Stage stage) throws Exception;

   /**
    * 
    * @param app
    * @throws Exception
    */
   public void init(Application app) throws Exception;

   /**
    * 
    * @param app
    * @throws Exception
    */
   public void stop(Application app) throws Exception;
}
