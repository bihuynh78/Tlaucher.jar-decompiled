package org.apache.http.conn;

import java.io.IOException;

public interface ConnectionReleaseTrigger {
  void releaseConnection() throws IOException;
  
  void abortConnection() throws IOException;
}


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/http/conn/ConnectionReleaseTrigger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */