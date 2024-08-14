package pasa.cbentley.framework.core.framework.fx.ctx;

import pasa.cbentley.core.src4.ctx.ICtx;
import pasa.cbentley.core.src4.stator.IStatorFactory;
import pasa.cbentley.core.src4.stator.IStatorable;
import pasa.cbentley.core.src4.stator.StatorReader;
import pasa.cbentley.framework.core.framework.fx.wrapper.WrapperFxTopStageApp;
import pasa.cbentley.framework.core.ui.fx.ctx.CoreUiFxCtx;

public class StatorFactoryCoreFrameworkFx implements IStatorFactory, ITechStatorableCoreFrameworkFx {

   private CoreFrameworkFxCtx cfc;

   public StatorFactoryCoreFrameworkFx(CoreFrameworkFxCtx cfc) {
      this.cfc = cfc;
   }

   public Object[] createArray(int classID, int size) {
      switch (classID) {
         case CLASSID_1_WRAPPER_FX_TOP_STAGE_APP:
            return new WrapperFxTopStageApp[size];

         default:
            break;
      }
      return null;
   }

   public Object createObject(StatorReader reader, int classID) {
      switch (classID) {
         case CLASSID_1_WRAPPER_FX_TOP_STAGE_APP:
            CoreUiFxCtx cuc = cfc.getCoreUiFxCtx();
            WrapperFxTopStageApp wrapper;
            if (cuc.getCanvasesNum() == 0) {
               wrapper = new WrapperFxTopStageApp(cfc, cuc.getStagePrimary());
            } else {
               wrapper = new WrapperFxTopStageApp(cfc);
            }
            return wrapper;

         default:
            break;
      }
      return null;
   }

   public ICtx getCtx() {
      return cfc;
   }

   public boolean isSupported(IStatorable statorable) {
      int id = statorable.getStatorableClassID();
      switch (id) {
         case CLASSID_1_WRAPPER_FX_TOP_STAGE_APP:
            return true;
         default:
            break;
      }
      return false;
   }

}
