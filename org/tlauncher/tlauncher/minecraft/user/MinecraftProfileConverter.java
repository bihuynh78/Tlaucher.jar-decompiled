/*    */ package org.tlauncher.tlauncher.minecraft.user;
/*    */ 
/*    */ import org.tlauncher.tlauncher.minecraft.user.mcsauth.MinecraftServicesToken;
/*    */ import org.tlauncher.tlauncher.minecraft.user.preq.MinecraftOAuthProfile;
/*    */ 
/*    */ public class MinecraftProfileConverter
/*    */ {
/*    */   public MinecraftUser convertToMinecraftUser(MicrosoftOAuthToken microsoftToken, MinecraftServicesToken minecraftToken, MinecraftOAuthProfile profile) throws MinecraftProfileConversionException {
/*    */     try {
/* 10 */       return new MinecraftUser(profile, microsoftToken, minecraftToken);
/* 11 */     } catch (RuntimeException rE) {
/* 12 */       throw new MinecraftProfileConversionException(rE);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/minecraft/user/MinecraftProfileConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */