package pasa.cbentley.framework.core.framework.fx.engine;

import pasa.cbentley.core.src4.ctx.UCtx;
import pasa.cbentley.framework.core.draw.fx.ctx.IConfigCoreDrawFx;
import pasa.cbentley.framework.core.framework.fx.ctx.CoreFrameworkFxCtx;
import pasa.cbentley.framework.core.framework.fx.ctx.IConfigCoreFrameworkFx;
import pasa.cbentley.framework.core.j2se.ctx.CoreFrameworkJ2seCtx;
import pasa.cbentley.framework.core.j2se.engine.CoordinatorJ2se;
import pasa.cbentley.framework.core.ui.fx.ctx.IConfigCoreUiFx;

public abstract class LauncherFxAbstractFlat extends LauncherFxAbstract {

   private IConfigCoreFrameworkFxFlat config;

   public IConfigCoreDrawFx createConfigCoreDraw(UCtx uc) {
      return getConfig().getConfigCoreDrawFx();
   }

   public IConfigCoreFrameworkFx createConfigCoreFx(UCtx uc) {
      return getConfig().getConfigCoreFrameworkFx();
   }

   public IConfigCoreUiFx createConfigCoreUi(UCtx uc) {
      return getConfig().getConfigCoreUiFx();
   }

   public abstract IConfigCoreFrameworkFxFlat createConfigFxFlat(UCtx uc);

   public CoordinatorJ2se createCoodinator(CoreFrameworkJ2seCtx cfc) {
      return new CoordinatorFx((CoreFrameworkFxCtx) cfc, this);
   }

   public IConfigCoreFrameworkFxFlat getConfig() {
      if (config == null) {
         config = createConfigFxFlat(uc);
      }
      return config;
   }

}
