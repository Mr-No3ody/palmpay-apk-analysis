package com.transsnet.palmpay.send_money.bean;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u001c\u0010 \u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\u001c\u0010#\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R\u001c\u0010&\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010\u0013¨\u0006)"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/FinanceGuidanceBean;", "", "<init>", "()V", "popUp", "", "getPopUp", "()Ljava/lang/Boolean;", "setPopUp", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "needAutoCashBox", "getNeedAutoCashBox", "setNeedAutoCashBox", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", FirebaseAnalytics.Param.CONTENT, "getContent", "setContent", "darkContent", "getDarkContent", "setDarkContent", "pic", "getPic", "setPic", "darkPic", "getDarkPic", "setDarkPic", "financialButtonContent", "getFinancialButtonContent", "setFinancialButtonContent", "financialButtonJumpUrl", "getFinancialButtonJumpUrl", "setFinancialButtonJumpUrl", "transferButtonContent", "getTransferButtonContent", "setTransferButtonContent", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FinanceGuidanceBean {

    @Nullable
    private String content;

    @Nullable
    private String darkContent;

    @Nullable
    private String darkPic;

    @Nullable
    private String financialButtonContent;

    @Nullable
    private String financialButtonJumpUrl;

    @Nullable
    private Boolean needAutoCashBox;

    @Nullable
    private String pic;

    @Nullable
    private Boolean popUp;

    @Nullable
    private String title;

    @Nullable
    private String transferButtonContent;

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getDarkContent() {
        return this.darkContent;
    }

    @Nullable
    public final String getDarkPic() {
        return this.darkPic;
    }

    @Nullable
    public final String getFinancialButtonContent() {
        return this.financialButtonContent;
    }

    @Nullable
    public final String getFinancialButtonJumpUrl() {
        return this.financialButtonJumpUrl;
    }

    @Nullable
    public final Boolean getNeedAutoCashBox() {
        return this.needAutoCashBox;
    }

    @Nullable
    public final String getPic() {
        return this.pic;
    }

    @Nullable
    public final Boolean getPopUp() {
        return this.popUp;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTransferButtonContent() {
        return this.transferButtonContent;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setDarkContent(@Nullable String str) {
        this.darkContent = str;
    }

    public final void setDarkPic(@Nullable String str) {
        this.darkPic = str;
    }

    public final void setFinancialButtonContent(@Nullable String str) {
        this.financialButtonContent = str;
    }

    public final void setFinancialButtonJumpUrl(@Nullable String str) {
        this.financialButtonJumpUrl = str;
    }

    public final void setNeedAutoCashBox(@Nullable Boolean bool) {
        this.needAutoCashBox = bool;
    }

    public final void setPic(@Nullable String str) {
        this.pic = str;
    }

    public final void setPopUp(@Nullable Boolean bool) {
        this.popUp = bool;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setTransferButtonContent(@Nullable String str) {
        this.transferButtonContent = str;
    }
}
