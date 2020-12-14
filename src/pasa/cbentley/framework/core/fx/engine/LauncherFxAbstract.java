package pasa.cbentley.framework.core.fx.engine;

import pasa.cbentley.byteobjects.src4.ctx.BOCtx;
import pasa.cbentley.core.fx.ctx.FxCtx;
import pasa.cbentley.core.j2se.ctx.J2seCtx;
import pasa.cbentley.core.src4.ctx.UCtx;
import pasa.cbentley.core.src5.ctx.C5Ctx;
import pasa.cbentley.framework.core.fx.ctx.CoreFxCtx;
import pasa.cbentley.framework.core.fx.ctx.IConfigCoreFx;
import pasa.cbentley.framework.core.j2se.engine.LaunchJ2SE;
import pasa.cbentley.framework.core.src4.ctx.CoreFrameworkCtx;
import pasa.cbentley.framework.core.src4.engine.CoordinatorAbstract;
import pasa.cbentley.framework.coredraw.fx.ctx.CoreDrawFxCtx;
import pasa.cbentley.framework.coredraw.fx.ctx.IConfigCoreDrawFx;
import pasa.cbentley.framework.coreio.src5.ctx.CoreIO5Ctx;
import pasa.cbentley.framework.coreui.fx.ctx.CoreUiFxCtx;
import pasa.cbentley.framework.coreui.j2se.ctx.IConfigCoreUiJ2se;
import pasa.cbentley.framework.coreui.src4.interfaces.ICanvasOwner;

/**
 * Hosts the SWT {@link Shell} and {@link Display} references.
 * <br>
 * @author Mordan
 *
 */
public abstract class LauncherFxAbstract extends LaunchJ2SE {

   protected CoreDrawFxCtx coreDrawSwt;

   protected CoreIO5Ctx    cio5c;

   protected CoreUiFxCtx   coreUiFxCtx;

   protected CoreFxCtx     coreFxCtx;

   protected CoordinatorFx coordinator;

   protected final FxCtx   fxc;

   public LauncherFxAbstract() {
      super();

      fxc = (FxCtx) j2c;

      IConfigCoreDrawFx configDraw = createConfigCoreDraw(uc);
      coreDrawSwt = new CoreDrawFxCtx(configDraw, fxc, boc);

      IConfigCoreUiJ2se config = createConfigCoreUi(uc);
      coreUiFxCtx = new CoreUiFxCtx(coreDrawSwt, cio5c, config);

      IConfigCoreFx configFx = createConfigCoreFx(fxc);
      coreFxCtx = new CoreFxCtx(configFx, coreUiFxCtx, coreDataCtx, cio5c, this);
      coordinator = new CoordinatorFx(coreFxCtx, this);

      ICanvasOwner wrapperManager = createWrapperManager(coreFxCtx);
      coreUiFxCtx.setWrapperManager(wrapperManager);

   }

   public abstract IConfigCoreDrawFx createConfigCoreDraw(UCtx uc);

   public abstract IConfigCoreUiJ2se createConfigCoreUi(UCtx uc);

   public abstract IConfigCoreFx createConfigCoreFx(FxCtx sc);

   public J2seCtx createJ2seCtx(UCtx uc, C5Ctx c5, BOCtx boc) {
      FxCtx fxc = new FxCtx(c5);
      //fxc.initializePlatform();
      return fxc;
   }

   public CoreFrameworkCtx getCFC() {
      return coreFxCtx;
   }

   public CoordinatorAbstract getCoordinator() {
      return coordinator;
   }

   /**
    * Decides which swing wrapper to use when creating canvases.
    * 
    * 
    * 
    * <li> {@link CanvasOwnerDefaultSwing}
    * 
    * @return {@link ICanvasOwner}
    */
   public abstract ICanvasOwner createWrapperManager(CoreFxCtx cfc);

}
