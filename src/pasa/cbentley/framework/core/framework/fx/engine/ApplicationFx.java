package pasa.cbentley.framework.core.framework.fx.engine;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Hack to deal with static methods in Application class.
 * 
 * 
 * 
 * @author Charles Bentley
 *
 */
public class ApplicationFx extends Application {
   
   public static void launchApp(IFxApp app, String... sArArgs) {
      ApplicationFx.app = app;
      ApplicationFx.launch(ApplicationFx.class, sArArgs);
   }

   static IFxApp app;

   public void start(Stage primaryStage) throws Exception {
      app.start(this, primaryStage);
   }

   public void init() throws Exception {
      app.init(this);
   }

   public void stop() throws Exception {
      app.stop(this);
   }
}
