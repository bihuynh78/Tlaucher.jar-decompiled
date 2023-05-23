/*    */ package org.apache.log4j.pattern;
/*    */ 
/*    */ import org.apache.log4j.helpers.PatternConverter;
/*    */ import org.apache.log4j.helpers.PatternParser;
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
/*    */ public final class BridgePatternParser
/*    */   extends PatternParser
/*    */ {
/*    */   public BridgePatternParser(String conversionPattern) {
/* 38 */     super(conversionPattern);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public PatternConverter parse() {
/* 46 */     return new BridgePatternConverter(this.pattern);
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/apache/log4j/pattern/BridgePatternParser.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */