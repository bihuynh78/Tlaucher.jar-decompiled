package org.tlauncher.util.guice;

import com.google.inject.assistedinject.Assisted;
import org.tlauncher.tlauncher.ui.progress.ProgressFrame;

public interface CustomBarFactory {
  ProgressFrame create(@Assisted("info") String paramString1, @Assisted("bottomIcon") String paramString2, @Assisted("tlauncher") String paramString3);
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/util/guice/CustomBarFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */