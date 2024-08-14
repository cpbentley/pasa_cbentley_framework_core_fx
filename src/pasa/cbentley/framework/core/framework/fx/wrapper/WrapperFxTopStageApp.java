package pasa.cbentley.framework.core.framework.fx.wrapper;

import javafx.stage.Stage;
import pasa.cbentley.core.src4.ctx.ICtx;
import pasa.cbentley.core.src4.ctx.UCtx;
import pasa.cbentley.core.src4.logging.Dctx;
import pasa.cbentley.framework.core.framework.fx.ctx.CoreFrameworkFxCtx;
import pasa.cbentley.framework.core.framework.fx.ctx.ITechStatorableCoreFrameworkFx;
import pasa.cbentley.framework.core.ui.fx.ctx.ITechStatorableCoreUiFx;
import pasa.cbentley.framework.core.ui.fx.wrapper.WrapperFxTopStage;

/**
 * Controls the Scene of JavaFX
 * @author Charles Bentley
 *
 */
public class WrapperFxTopStageApp extends WrapperFxTopStage {

   protected final CoreFrameworkFxCtx cfc;

   public WrapperFxTopStageApp(CoreFrameworkFxCtx cfc) {
      this(cfc, new Stage());
   }

   public WrapperFxTopStageApp(CoreFrameworkFxCtx cfc, Stage stage) {
      super(cfc.getCoreUiFxCtx(), stage);
      this.cfc = cfc;
   }
   
   public ICtx getCtxOwner() {
      return cfc;
   }

   public int getStatorableClassID() {
      return ITechStatorableCoreFrameworkFx.CLASSID_1_WRAPPER_FX_TOP_STAGE_APP;
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
