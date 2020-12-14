package pasa.cbentley.framework.core.fx.wrapper;

import javafx.stage.Stage;
import pasa.cbentley.core.src4.ctx.UCtx;
import pasa.cbentley.core.src4.logging.Dctx;
import pasa.cbentley.framework.core.fx.ctx.CoreFxCtx;
import pasa.cbentley.framework.coreui.fx.wrapper.WrapperFxTopStage;

/**
 * Controls the Scene of JavaFX
 * @author Charles Bentley
 *
 */
public class WrapperFxTopStageApp extends WrapperFxTopStage {

   protected final CoreFxCtx cfc;

   public WrapperFxTopStageApp(CoreFxCtx cfc) {
      this(cfc, new Stage());
   }

   public WrapperFxTopStageApp(CoreFxCtx cfc, Stage stage) {
      super(cfc.getCoreUiFxCtx(), stage);
      this.cfc = cfc;
   }

   
   //#mdebug
   public void toString(Dctx dc) {
      dc.root(this, WrapperFxTopStageApp.class, "@line30");
      toStringPrivate(dc);
      super.toString(dc.sup());
   }

   private void toStringPrivate(Dctx dc) {
      
   }

   public void toString1Line(Dctx dc) {
      dc.root1Line(this, WrapperFxTopStageApp.class);
      toStringPrivate(dc);
      super.toString1Line(dc.sup1Line());
   }

   //#enddebug
   

}
