package pasa.cbentley.framework.core.framework.fx.engine;

import pasa.cbentley.framework.core.draw.fx.ctx.IConfigCoreDrawFx;
import pasa.cbentley.framework.core.framework.fx.ctx.IConfigCoreFrameworkFx;
import pasa.cbentley.framework.core.ui.fx.ctx.IConfigCoreUiFx;

public interface IConfigCoreFrameworkFxFlat {

   public IConfigCoreDrawFx getConfigCoreDrawFx();

   public IConfigCoreFrameworkFx getConfigCoreFrameworkFx();

   public IConfigCoreUiFx getConfigCoreUiFx();

}
