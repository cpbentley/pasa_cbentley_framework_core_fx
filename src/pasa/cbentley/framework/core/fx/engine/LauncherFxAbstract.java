package pasa.cbentley.framework.core.fx.engine;

import pasa.cbentley.byteobjects.src4.ctx.BOCtx;
import pasa.cbentley.core.fx.ctx.FxCtx;
import pasa.cbentley.core.j2se.ctx.J2seCtx;
import pasa.cbentley.core.src4.ctx.UCtx;
import pasa.cbentley.core.src5.ctx.C5Ctx;
import pasa.cbentley.framework.core.fx.ctx.CoreFxCtx;
import pasa.cbentley.framework.core.fx.ctx.IConfigCoreFrameworkFx;
import pasa.cbentley.framework.core.fx.wrapper.CanvasOwnerFxStageApp;
import pasa.cbentley.framework.core.j2se.ctx.CoreFrameworkJ2seCtx;
import pasa.cbentley.framework.core.j2se.engine.CoordinatorJ2SE;
import pasa.cbentley.framework.core.j2se.engine.LaunchJ2SE;
import pasa.cbentley.framework.core.src4.ctx.CoreFrameworkCtx;
import pasa.cbentley.framework.core.src4.engine.CoordinatorAbstract;
import pasa.cbentley.framework.coredata.src5.ctx.CoreData5Ctx;
import pasa.cbentley.framework.coredraw.fx.ctx.CoreDrawFxCtx;
import pasa.cbentley.framework.coredraw.fx.ctx.IConfigCoreDrawFx;
import pasa.cbentley.framework.coredraw.j2se.ctx.CoreDrawJ2seCtx;
import pasa.cbentley.framework.coreio.src5.ctx.CoreIO5Ctx;
import pasa.cbentley.framework.coreui.fx.ctx.CoreUiFxCtx;
import pasa.cbentley.framework.coreui.fx.ctx.IConfigCoreUIFx;
import pasa.cbentley.framework.coreui.j2se.ctx.CoreUiJ2seCtx;
import pasa.cbentley.framework.coreui.j2se.ctx.IConfigCoreUiJ2se;
import pasa.cbentley.framework.coreui.src4.interfaces.IWrapperManager;

/**
 * Hosts the SWT {@link Shell} and {@link Display} references.
 * <br>
 * @author Mordan
 *
 */
public abstract class LauncherFxAbstract extends LaunchJ2SE {

   public LauncherFxAbstract() {
      super();

   }

   public CoordinatorJ2SE createCoodinator(CoreFrameworkJ2seCtx cfc) {
      return new CoordinatorFx((CoreFxCtx) cfc, this);
   }

   public CoreDrawJ2seCtx createCoreDrawJ2seCtx(J2seCtx j2c, BOCtx boc) {
      IConfigCoreDrawFx configDraw = createConfigCoreDraw(uc);
      return new CoreDrawFxCtx(configDraw, (FxCtx) j2c, boc);
   }

   public CoreUiJ2seCtx createCoreUiJ2seCtx(CoreDrawJ2seCtx cdc, CoreIO5Ctx cio5c) {
      IConfigCoreUIFx config = (IConfigCoreUIFx) createConfigCoreUi(uc);
      return new CoreUiFxCtx(config, (CoreDrawFxCtx) cdc, cio5c);
   }

   public CoreFrameworkJ2seCtx createCoreFrameworkJ2seCtx(CoreUiJ2seCtx cuc, CoreData5Ctx cdc, CoreIO5Ctx cio5c) {
      IConfigCoreFrameworkFx configFx = createConfigCoreFx(uc);
      return new CoreFxCtx(configFx, (CoreUiFxCtx) cuc, cdc, cio5c, this);
   }

   public abstract IConfigCoreDrawFx createConfigCoreDraw(UCtx uc);

   public abstract IConfigCoreUiJ2se createConfigCoreUi(UCtx uc);

   public abstract IConfigCoreFrameworkFx createConfigCoreFx(UCtx uc);

   public J2seCtx createJ2seCtx(UCtx uc, C5Ctx c5, BOCtx boc) {
      FxCtx fxc = new FxCtx(c5);
      //fxc.initializePlatform();
      return fxc;
   }

   public IWrapperManager createWrapperManager(CoreFrameworkJ2seCtx csc) {
      return new CanvasOwnerFxStageApp((CoreFxCtx) csc);
   }


}
