/*    */ package org.tlauncher.tlauncher.minecraft.user.oauth.exchange;
/*    */ import org.apache.http.client.fluent.Form;
/*    */ import org.apache.http.client.fluent.Request;
/*    */ import org.tlauncher.tlauncher.minecraft.user.GsonParser;
/*    */ import org.tlauncher.tlauncher.minecraft.user.HttpClientRequester;
/*    */ import org.tlauncher.tlauncher.minecraft.user.MicrosoftOAuthExchangeCode;
/*    */ import org.tlauncher.tlauncher.minecraft.user.MicrosoftOAuthToken;
/*    */ import org.tlauncher.tlauncher.minecraft.user.Parser;
/*    */ import org.tlauncher.tlauncher.minecraft.user.Requester;
/*    */ 
/*    */ public class MicrosoftOAuthCodeExchangerImpl extends MicrosoftOAuthCodeExchanger {
/* 12 */   private static final Logger LOGGER = LogManager.getLogger(MicrosoftOAuthCodeExchangerImpl.class);
/*    */   
/*    */   public MicrosoftOAuthCodeExchangerImpl(String clientId, String url) {
/* 15 */     super((Requester<MicrosoftOAuthExchangeCode>)new HttpClientRequester(code -> Request.Post(url).bodyForm(Form.form().add("client_id", clientId).add("code", code.getCode()).add("grant_type", "authorization_code").add("redirect_uri", code.getRedirectUrl().getUrl().toString()).build())), 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 24 */         (Parser<MicrosoftOAuthToken>)GsonParser.lowerCaseWithUnderscores(MicrosoftOAuthToken.class));
/*    */   }
/*    */ }


/* Location:              /home/khang/Downloads/tlaucher/Tlaucher.jar-decompiled/!/org/tlauncher/tlauncher/minecraft/user/oauth/exchange/MicrosoftOAuthCodeExchangerImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */