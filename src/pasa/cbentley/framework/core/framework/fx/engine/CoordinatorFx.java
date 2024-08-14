package pasa.cbentley.framework.core.framework.fx.engine;

import javafx.application.Application;
import javafx.stage.Stage;
import pasa.cbentley.framework.core.framework.fx.ctx.CoreFrameworkFxCtx;
import pasa.cbentley.framework.core.framework.src4.interfaces.ILauncherHost;
import pasa.cbentley.framework.core.j2se.engine.CoordinatorJ2se;

/**
 * Coordinates the {@link ILauncherHost}
 * @author Charles Bentley
 *
 */
public class CoordinatorFx extends CoordinatorJ2se implements IFxApp {

   protected final CoreFrameworkFxCtx scc;

   protected CoordinatorFx(CoreFrameworkFxCtx scc, ILauncherHost launcherHost) {
      super(scc, launcherHost);
      this.scc = scc;
   }

   protected void startUIThread() {
      ApplicationFx.launchApp(this, new String[] {});
   }

   public boolean subLoadLastState() {
      // TODO Auto-generated method stub
      return false;
   }

   protected void subExitJ2SE() {
   }

   protected void subResumeJ2SE() {
   }

   protected void subPauseJ2SE() {
   }

   public void start(Application app, Stage stage) throws Exception {
      //#debug
      toDLog().pBridge1("start FX Application", null, CoordinatorFx.class, "start");

      try {
         scc.getCoreUiFxCtx().setPrimaryState(stage);

         initUIThreadInside();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   public void init(Application app) throws Exception {
      //#debug
      toDLog().pBridge1("init FX Application", null, CoordinatorFx.class, "init");

   }

   public void stop(Application app) throws Exception {
      //#debug
      toDLog().pBridge1("stop FX Application", null, CoordinatorFx.class, "stop");

      try {
         //do swing specific exit routine
         this.frameworkExit();
      } catch (Exception ex) {
         ex.printStackTrace();
      }
      scc.getCoordinator().appliWantBeDestroyed();
   }

}
