/*    */ package org.apache.commons.compress.harmony.unpack200.bytecode;
/*    */ 
/*    */ import java.util.List;
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
/*    */ public class CPField
/*    */   extends CPMember
/*    */ {
/*    */   public CPField(CPUTF8 name, CPUTF8 descriptor, long flags, List<Attribute> attributes) {
/* 27 */     super(name, descriptor, flags, attributes);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 32 */     return "Field: " + this.name + "(" + this.descriptor + ")";
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/commons/compress/harmony/unpack200/bytecode/CPField.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */