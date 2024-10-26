package pasa.cbentley.framework.core.framework.fx.wrapper;

import pasa.cbentley.byteobjects.src4.core.ByteObject;
import pasa.cbentley.core.src4.ctx.UCtx;
import pasa.cbentley.core.src4.logging.Dctx;
import pasa.cbentley.core.src4.logging.IDLog;
import pasa.cbentley.framework.core.framework.fx.ctx.CoreFrameworkFxCtx;
import pasa.cbentley.framework.core.ui.fx.ctx.CoreUiFxCtx;
import pasa.cbentley.framework.core.ui.src4.engine.CanvasHostAbstract;
import pasa.cbentley.framework.core.ui.src4.interfaces.IWrapperManager;
import pasa.cbentley.framework.core.ui.src4.tech.IBOCanvasHost;
import pasa.cbentley.framework.core.ui.src4.tech.ITechWrapper;
import pasa.cbentley.framework.core.ui.src4.wrapper.WrapperAbstract;

/**
 * Canvas owner creates {@link WrapperSwingTopFrame}.
 * 
 * He is unaware of life cycle.
 * 
 * @author Charles Bentley
 *
 */
public class CanvasOwnerFxStageApp implements IWrapperManager {

   protected final CoreFrameworkFxCtx cfc;

   public CanvasOwnerFxStageApp(CoreFrameworkFxCtx cfc) {
      this.cfc = cfc;
   }

   public WrapperAbstract createNewWrapper(ByteObject tech) {
      //find our wrapper
      int wrapperType = tech.get1(IBOCanvasHost.CANVAS_HOST_OFFSET_10_WRAPPER_TYPE1);
      WrapperAbstract wrapper = null;
      if (wrapperType == ITechWrapper.WRAPPER_TYPE_0_DEFAULT) {
         //in a controlled env.. the wrapper is a panel and all new windows must be inside the 
         //semi multi. a new component is drawn over the old one.. like in android. screen size is fixed.
      } else if (wrapperType == ITechWrapper.WRAPPER_TYPE_1_FRAME) {

      } else if (wrapperType == ITechWrapper.WRAPPER_TYPE_2_CONTROLLED) {

      }
      CoreUiFxCtx cuc = cfc.getCoreUiFxCtx();
      if (cuc.getCanvasesNum() == 0) {
         wrapper = new WrapperFxTopStageApp(cfc, cuc.getStagePrimary());
      } else {
         wrapper = new WrapperFxTopStageApp(cfc);
      }
      return wrapper;
   }

   public boolean setPosition(WrapperAbstract wrapper, int x, int y) {
      return false;
   }

   public boolean setSize(WrapperAbstract wrapper, int w, int h) {
      return false;
   }

   public void setTitle(WrapperAbstract wrapper, String title) {

   }

   //#mdebug
   public IDLog toDLog() {
      return toStringGetUCtx().toDLog();
   }

   public String toString() {
      return Dctx.toString(this);
   }

   public void toString(Dctx dc) {
      dc.root(this, "WrapperManagerDefaultSwing");
      toStringPrivate(dc);
   }

   public String toString1Line() {
      return Dctx.toString1Line(this);
   }

   private void toStringPrivate(Dctx dc) {

   }

   public void toString1Line(Dctx dc) {
      dc.root1Line(this, "WrapperManagerDefaultSwing");
      toStringPrivate(dc);
   }

   public UCtx toStringGetUCtx() {
      return cfc.getUC();
   }

   public CanvasHostAbstract createCanvasHost(WrapperAbstract wrapper, ByteObject canvasTech) {
      // TODO Auto-generated method stub
      return null;
   }

   //#enddebug

}
