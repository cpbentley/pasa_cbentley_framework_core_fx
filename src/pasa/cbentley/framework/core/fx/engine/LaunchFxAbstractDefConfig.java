package pasa.cbentley.framework.core.fx.engine;

import pasa.cbentley.core.fx.ctx.FxCtx;
import pasa.cbentley.core.src4.ctx.UCtx;
import pasa.cbentley.core.src4.i8n.IStringProducer;
import pasa.cbentley.framework.core.fx.ctx.ConfigCoreFxDefault;
import pasa.cbentley.framework.core.fx.ctx.CoreFxCtx;
import pasa.cbentley.framework.core.fx.ctx.IConfigCoreFx;
import pasa.cbentley.framework.core.fx.wrapper.CanvasOwnerFxStageApp;
import pasa.cbentley.framework.core.src4.ctx.CoreFrameworkCtx;
import pasa.cbentley.framework.core.src4.i8n.StringProducerBasic;
import pasa.cbentley.framework.core.src4.interfaces.ILauncherAppli;
import pasa.cbentley.framework.coredata.src5.ctx.ConfigCoreData5Default;
import pasa.cbentley.framework.coredata.src5.ctx.IConfigCoreData5;
import pasa.cbentley.framework.coredraw.fx.ctx.ConfigCoreDrawFxDef;
import pasa.cbentley.framework.coredraw.fx.ctx.IConfigCoreDrawFx;
import pasa.cbentley.framework.coreio.src5.ctx.ConfigIO5Def;
import pasa.cbentley.framework.coreio.src5.ctx.IConfigCoreIO5;
import pasa.cbentley.framework.coreui.fx.ctx.ConfigCoreUIFxDefault;
import pasa.cbentley.framework.coreui.j2se.ctx.IConfigCoreUiJ2se;
import pasa.cbentley.framework.coreui.src4.interfaces.ICanvasOwner;

/**
 * 
 * Launch an {@link ILauncherAppli} with the default SWT host configuration {@link ConfigCoreSwtDefault}
 * 
 * Sub class provides the {@link ILauncherAppli}. This launcher provides the SWT configuration.
 * 
 * @author Charles Bentley
 *
 */
public abstract class LaunchFxAbstractDefConfig extends LauncherFxAbstract {

   public LaunchFxAbstractDefConfig() {
      super();
   }

   public IStringProducer createStringProducer(CoreFrameworkCtx cfc) {
      return new StringProducerBasic(cfc);
   }

   public IConfigCoreFx createConfigCoreSwt(FxCtx fxc) {
      return new ConfigCoreFxDefault(fxc);
   }

   public ICanvasOwner createWrapperManager(CoreFxCtx csc) {
      return new CanvasOwnerFxStageApp(csc);
   }

   public IConfigCoreUiJ2se createConfigCoreUi(UCtx uc) {
      return new ConfigCoreUIFxDefault(uc);
   }

   public IConfigCoreDrawFx createConfigCoreDraw(UCtx uc) {
      return new ConfigCoreDrawFxDef(uc);
   }

   public IConfigCoreFx createConfigCoreFx(FxCtx sc) {
      return new ConfigCoreFxDefault(sc);
   }

   public IConfigCoreData5 createConfigCoreData5(UCtx uc) {
      return new ConfigCoreData5Default(uc);
   }

   public IConfigCoreIO5 createConfigCoreIO(UCtx uc) {
      return new ConfigIO5Def(c5);
   }

}
