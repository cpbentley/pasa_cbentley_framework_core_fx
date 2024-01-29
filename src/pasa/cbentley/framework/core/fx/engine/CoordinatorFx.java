package pasa.cbentley.framework.core.fx.engine;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import pasa.cbentley.byteobjects.src4.core.ByteObject;
import pasa.cbentley.framework.core.fx.ctx.CoreFxCtx;
import pasa.cbentley.framework.core.fx.wrapper.WrapperFxTopStageApp;
import pasa.cbentley.framework.core.j2se.engine.CoordinatorJ2SE;
import pasa.cbentley.framework.core.src4.interfaces.ILauncherHost;
import pasa.cbentley.framework.coreui.fx.ctx.CoreUiFxCtx;
import pasa.cbentley.framework.coreui.fx.wrapper.WrapperAbstractFx;
import pasa.cbentley.framework.coreui.src4.tech.IBOCanvasHost;

/**
 * Coordinates the {@link ILauncherHost}
 * @author Charles Bentley
 *
 */
public class CoordinatorFx extends CoordinatorJ2SE implements IFxApp {

   protected final CoreFxCtx scc;

   protected CoordinatorFx(CoreFxCtx scc, ILauncherHost launcherHost) {
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
