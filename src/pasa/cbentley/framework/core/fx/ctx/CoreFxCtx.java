package pasa.cbentley.framework.core.fx.ctx;

import pasa.cbentley.framework.core.fx.engine.CoordinatorFx;
import pasa.cbentley.framework.core.fx.engine.FxHost;
import pasa.cbentley.framework.core.fx.engine.FxTools;
import pasa.cbentley.framework.core.j2se.ctx.CoreFrameworkJ2seCtx;
import pasa.cbentley.framework.core.src4.interfaces.IHost;
import pasa.cbentley.framework.core.src4.interfaces.IHostUITools;
import pasa.cbentley.framework.core.src4.interfaces.ILauncherHost;
import pasa.cbentley.framework.coredata.src5.ctx.CoreData5Ctx;
import pasa.cbentley.framework.coredraw.fx.ctx.CoreDrawFxCtx;
import pasa.cbentley.framework.coreio.src5.ctx.CoreIO5Ctx;
import pasa.cbentley.framework.coreui.fx.ctx.CoreUiFxCtx;

public class CoreFxCtx extends CoreFrameworkJ2seCtx {

   protected final CoreUiFxCtx cuc;

   private static final int    CTX_ID = 551;

   private FxHost              host;

   private FxTools             tools;

   public CoreFxCtx(IConfigCoreFx config, CoreUiFxCtx cuc, CoreData5Ctx dac, CoreIO5Ctx ioc, ILauncherHost launcher) {
      super(config, cuc, dac, ioc, launcher);
      this.cuc = cuc;
      host = new FxHost(this);
      tools = new FxTools(this);

      if (this.getClass() == CoreFxCtx.class) {
         a_Init();
      }
   }

   public int getCtxID() {
      return CTX_ID;
   }

   /**
    * 
    * @return
    */
   public IHost getHost() {
      return host;
   }

   public IHostUITools getHostTools() {
      return tools;
   }

   public CoreUiFxCtx getCoreUiFxCtx() {
      return cuc;
   }

   public String getStringIDReal() {
      return "javafx";
   }

   public CoordinatorFx getCoordinatorFx() {
      return (CoordinatorFx) getCoordinator();
   }

   public CoreDrawFxCtx getCoreDrawFxCtx() {
      return cuc.getCoreDrawFxCtx();
   }

}
