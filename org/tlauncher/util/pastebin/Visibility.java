/*    */ package org.tlauncher.util.pastebin;
/*    */ 
/*    */ public enum Visibility {
/*  4 */   PUBLIC(0),
/*  5 */   NOT_LISTED(1);
/*    */   
/*    */   private final int value;
/*    */   
/*    */   Visibility(int value) {
/* 10 */     this.value = value;
/*    */   }
/*    */   
/*    */   public int getValue() {
/* 14 */     return this.value;
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/util/pastebin/Visibility.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */