package pasa.cbentley.framework.core.framework.fx.ctx;

import pasa.cbentley.core.fx.ctx.FxCoreCtx;
import pasa.cbentley.core.src4.interfaces.IHost;
import pasa.cbentley.core.src4.stator.IStatorFactory;
import pasa.cbentley.framework.core.data.src5.ctx.CoreData5Ctx;
import pasa.cbentley.framework.core.draw.fx.ctx.CoreDrawFxCtx;
import pasa.cbentley.framework.core.framework.fx.engine.CoordinatorFx;
import pasa.cbentley.framework.core.framework.fx.engine.FxTools;
import pasa.cbentley.framework.core.framework.fx.engine.HostCoreFx;
import pasa.cbentley.framework.core.framework.fx.engine.HostDataCoreFx;
import pasa.cbentley.framework.core.framework.fx.engine.HostFeatureCoreFx;
import pasa.cbentley.framework.core.framework.fx.engine.HostServiceCoreFx;
import pasa.cbentley.framework.core.framework.src4.interfaces.IHostCoreTools;
import pasa.cbentley.framework.core.framework.src4.interfaces.ILauncherHost;
import pasa.cbentley.framework.core.io.src5.ctx.CoreIO5Ctx;
import pasa.cbentley.framework.core.j2se.ctx.CoreFrameworkJ2seCtx;
import pasa.cbentley.framework.core.ui.fx.ctx.CoreUiFxCtx;
import pasa.cbentley.framework.core.ui.fx.ctx.StatorFactoryCoreUiFx;

public class CoreFrameworkFxCtx extends CoreFrameworkJ2seCtx {

   private static final int             CTX_ID = 551;

   protected final CoreUiFxCtx          cuc;

   private HostDataCoreFx               hostDataCoreFx;

   private HostFeatureCoreFx            hostFeatureCoreFx;

   private HostServiceCoreFx            hostServiceCoreFx;

   private FxTools                      tools;

   private StatorFactoryCoreFrameworkFx statorFactory;

   public CoreFrameworkFxCtx(IConfigCoreFrameworkFx config, CoreUiFxCtx cuc, CoreData5Ctx dac, CoreIO5Ctx ioc, ILauncherHost launcher) {
      super(config, cuc, dac, ioc, launcher);
      this.cuc = cuc;
      tools = new FxTools(this);

      hostDataCoreFx = new HostDataCoreFx(this);
      hostFeatureCoreFx = new HostFeatureCoreFx(this);
      hostServiceCoreFx = new HostServiceCoreFx(this);

      if (this.getClass() == CoreFrameworkFxCtx.class) {
         a_Init();
      }
   }

   public IStatorFactory getStatorFactory() {
      if (statorFactory == null) {
         statorFactory = new StatorFactoryCoreFrameworkFx(this);
      }
      return statorFactory;
   }

   public IHost createHost() {
      HostCoreFx host = new HostCoreFx(this, hostDataCoreFx, hostFeatureCoreFx, hostServiceCoreFx);
      return host;
   }

   public FxCoreCtx getFCC() {
      return cuc.getFCC();
   }

   public CoordinatorFx getCoordinatorFx() {
      return (CoordinatorFx) getCoordinator();
   }

   public CoreDrawFxCtx getCoreDrawFxCtx() {
      return cuc.getCoreDrawFxCtx();
   }

   public CoreUiFxCtx getCoreUiFxCtx() {
      return cuc;
   }

   public int getCtxID() {
      return CTX_ID;
   }

   public IHostCoreTools getHostTools() {
      return tools;
   }

   public String getStringIDReal() {
      return "javafx";
   }

}
