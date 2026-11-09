package com.transsnet.palmpay.credit.bean.resp.mobile_Installment;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/AboutRepaymentCardData;", "", "<init>", "()V", "itemStyle", "", "getItemStyle", "()Ljava/lang/String;", "setItemStyle", "(Ljava/lang/String;)V", "title", "getTitle", "setTitle", "myAccount", "Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/MyAccountData;", "getMyAccount", "()Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/MyAccountData;", "setMyAccount", "(Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/MyAccountData;)V", "addBankCard", "Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/JumpDetailData;", "getAddBankCard", "()Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/JumpDetailData;", "setAddBankCard", "(Lcom/transsnet/palmpay/credit/bean/resp/mobile_Installment/JumpDetailData;)V", "aboutPhoneLock", "getAboutPhoneLock", "setAboutPhoneLock", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AboutRepaymentCardData {

    @Nullable
    private JumpDetailData aboutPhoneLock;

    @Nullable
    private JumpDetailData addBankCard;

    @Nullable
    private String itemStyle;

    @Nullable
    private MyAccountData myAccount;

    @Nullable
    private String title;

    @Nullable
    public final JumpDetailData getAboutPhoneLock() {
        return this.aboutPhoneLock;
    }

    @Nullable
    public final JumpDetailData getAddBankCard() {
        return this.addBankCard;
    }

    @Nullable
    public final String getItemStyle() {
        return this.itemStyle;
    }

    @Nullable
    public final MyAccountData getMyAccount() {
        return this.myAccount;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setAboutPhoneLock(@Nullable JumpDetailData jumpDetailData) {
        this.aboutPhoneLock = jumpDetailData;
    }

    public final void setAddBankCard(@Nullable JumpDetailData jumpDetailData) {
        this.addBankCard = jumpDetailData;
    }

    public final void setItemStyle(@Nullable String str) {
        this.itemStyle = str;
    }

    public final void setMyAccount(@Nullable MyAccountData myAccountData) {
        this.myAccount = myAccountData;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
