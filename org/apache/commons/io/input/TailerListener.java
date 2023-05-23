package org.apache.commons.io.input;

public interface TailerListener {
  void init(Tailer paramTailer);
  
  void fileNotFound();
  
  void fileRotated();
  
  void handle(String paramString);
  
  void handle(Exception paramException);
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/commons/io/input/TailerListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */