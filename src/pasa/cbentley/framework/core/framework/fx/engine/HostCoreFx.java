package pasa.cbentley.framework.core.framework.fx.engine;

import pasa.cbentley.core.fx.engine.ExecutorFx;
import pasa.cbentley.core.src4.interfaces.IExecutor;
import pasa.cbentley.core.src4.interfaces.IHost;
import pasa.cbentley.core.src4.interfaces.IHostData;
import pasa.cbentley.core.src4.interfaces.IHostFeature;
import pasa.cbentley.core.src4.interfaces.IHostService;
import pasa.cbentley.core.src4.logging.Dctx;
import pasa.cbentley.framework.core.framework.fx.ctx.CoreFrameworkFxCtx;
import pasa.cbentley.framework.core.j2se.engine.HostCoreJ2se;

public class HostCoreFx extends HostCoreJ2se implements IHost {

   private HostDataCoreFx    data;

   private ExecutorFx        executor;

   private HostFeatureCoreFx feature;

   private HostServiceCoreFx service;

   public HostCoreFx(CoreFrameworkFxCtx cfc, HostDataCoreFx data, HostFeatureCoreFx feature, HostServiceCoreFx service) {
      super(cfc);

      this.data = data;
      this.feature = feature;
      this.service = service;
      executor = cfc.getFCC().getExecutorFx();
   }

   public IExecutor getExecutor() {
      return executor;
   }

   public IHostData getHostData() {
      return data;
   }

   public IHostFeature getHostFeature() {
      return feature;
   }

   public IHostService getHostService() {
      return service;
   }

   //#mdebug
   public void toString(Dctx dc) {
      dc.root(this, HostCoreFx.class, 60);
      toStringPrivate(dc);
      super.toString(dc.sup());
   }

   public void toString1Line(Dctx dc) {
      dc.root1Line(this, HostCoreFx.class, 60);
      toStringPrivate(dc);
      super.toString1Line(dc.sup1Line());
   }

   private void toStringPrivate(Dctx dc) {

   }
   //#enddebug

}
