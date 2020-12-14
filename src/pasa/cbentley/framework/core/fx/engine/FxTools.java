package pasa.cbentley.framework.core.fx.engine;

import java.awt.Component;
import java.awt.Dimension;
import java.io.File;

import javax.swing.JFileChooser;

import pasa.cbentley.byteobjects.src4.core.ByteObject;
import pasa.cbentley.framework.core.fx.ctx.CoreFxCtx;
import pasa.cbentley.framework.core.j2se.engine.CoreToolsJ2SE;
import pasa.cbentley.framework.coreio.src4.file.IFileConnection;
import pasa.cbentley.framework.coreio.src5.engine.FileConnectionSrc5;
import pasa.cbentley.framework.coreui.fx.engine.CanvasFx;
import pasa.cbentley.framework.coreui.src4.interfaces.ICanvasHost;

public class FxTools extends CoreToolsJ2SE {

   protected final CoreFxCtx csc;

   public FxTools(CoreFxCtx csc) {
      super(csc);
      this.csc = csc;
   }

   public void flashLightToggle() {
      
   }
   /**
    * What about parameters? Do we want preview? of what?
    * fc.setPreferredSize(new Dimension(800,800));
      
      fc.setCurrentDirectory(null);
    */
   public IFileConnection getFileChooser(ICanvasHost context) {
      JFileChooser fc = new JFileChooser();
      //center current screen with 80% of area covered , flag for preview
      Dimension d = new Dimension(800, 700);
      fc.setPreferredSize(d);
      fc.setDialogTitle("");
      Component compo = null;
      if(context instanceof CanvasFx) {
         CanvasFx cs = (CanvasFx) context;
      }
      int r = fc.showOpenDialog(compo);
      if (r == JFileChooser.APPROVE_OPTION) {
         File f = fc.getSelectedFile();
         FileConnectionSrc5 fci = new FileConnectionSrc5(csc.getCoreIO5Ctx(), f);
         return fci;
      } 
      return null;
   }

   public IFileConnection getFileChooser(ICanvasHost context, ByteObject fcTech) {
      // TODO Auto-generated method stub
      return null;
   }


  
}
