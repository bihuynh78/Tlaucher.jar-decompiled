/*    */ package org.tlauncher.tlauncher.ui.converter.dummy;
/*    */ 
/*    */ public class DummyIntegerConverter
/*    */   extends DummyConverter<Integer>
/*    */ {
/*    */   public Integer fromDummyString(String from) throws RuntimeException {
/*  7 */     return Integer.valueOf(Integer.parseInt(from));
/*    */   }
/*    */ 
/*    */   
/*    */   public String toDummyValue(Integer value) throws RuntimeException {
/* 12 */     return value.toString();
/*    */   }
/*    */ 
/*    */   
/*    */   public Class<Integer> getObjectClass() {
/* 17 */     return Integer.class;
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/ui/converter/dummy/DummyIntegerConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */