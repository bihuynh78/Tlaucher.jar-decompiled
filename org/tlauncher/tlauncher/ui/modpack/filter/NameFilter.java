/*    */ package org.tlauncher.tlauncher.ui.modpack.filter;
/*    */ 
/*    */ import org.tlauncher.modpack.domain.client.GameEntityDTO;
/*    */ 
/*    */ public class NameFilter implements GameEntityFilter {
/*    */   public NameFilter(String name) {
/*  7 */     this.name = name;
/*    */   }
/*    */ 
/*    */   
/*    */   private String name;
/*    */   
/*    */   public boolean isProper(GameEntityDTO gameEntity) {
/* 14 */     return gameEntity.getName().toLowerCase().contains(this.name.toLowerCase());
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/ui/modpack/filter/NameFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */