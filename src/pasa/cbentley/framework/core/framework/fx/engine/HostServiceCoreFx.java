package pasa.cbentley.framework.core.framework.fx.engine;

import pasa.cbentley.core.src4.interfaces.IHostService;
import pasa.cbentley.framework.core.framework.fx.ctx.CoreFrameworkFxCtx;
import pasa.cbentley.framework.core.j2se.engine.HostServiceCoreJ2se;

public class HostServiceCoreFx extends HostServiceCoreJ2se implements IHostService {

   public HostServiceCoreFx(CoreFrameworkFxCtx tfc) {
      super(tfc);
   }

   public boolean isHostServiceActive(int serviceID) {
      switch (serviceID) {
         default:
            return super.isHostServiceActive(serviceID);
      }
   }

   public boolean isHostServiceSupported(int serviceID) {
      switch (serviceID) {
         default:
            return super.isHostServiceSupported(serviceID);
      }
   }

   public boolean setHostServiceActive(int serviceID, boolean isActive) {
      switch (serviceID) {
         default:
            return super.setHostServiceActive(serviceID, isActive);
      }
   }



}
