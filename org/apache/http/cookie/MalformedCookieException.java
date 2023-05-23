/*    */ package org.apache.http.cookie;
/*    */ 
/*    */ import org.apache.http.ProtocolException;
/*    */ import org.apache.http.annotation.Immutable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Immutable
/*    */ public class MalformedCookieException
/*    */   extends ProtocolException
/*    */ {
/*    */   private static final long serialVersionUID = -6695462944287282185L;
/*    */   
/*    */   public MalformedCookieException() {}
/*    */   
/*    */   public MalformedCookieException(String message) {
/* 58 */     super(message);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public MalformedCookieException(String message, Throwable cause) {
/* 69 */     super(message, cause);
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/http/cookie/MalformedCookieException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */