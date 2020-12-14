package pasa.cbentley.framework.core.fx.engine;

import pasa.cbentley.byteobjects.src4.core.ByteObject;
import pasa.cbentley.framework.core.fx.ctx.CoreFxCtx;
import pasa.cbentley.framework.core.j2se.engine.CoreJ2SEHost;
import pasa.cbentley.framework.core.src4.interfaces.ITechDataHost;

public class FxHost extends CoreJ2SEHost {

   public FxHost(CoreFxCtx csc) {
      super(csc);
   }

   public int getHostInt(int dataID) {
      switch (dataID) {
         default:
            return super.getHostInt(dataID);
      }
   }
   
   public String getHostString(int dataID) {
      switch (dataID) {
         case ITechDataHost.DATA_ID_STR_04_PLATFORM:
            return "swing";
         default:
            return super.getHostString(dataID);
      }
   }

   public ByteObject getTechHost() {
      // TODO Auto-generated method stub
      return null;
   }

   public ByteObject getScreenConfig() {
      // TODO Auto-generated method stub
      return null;
   }
}
