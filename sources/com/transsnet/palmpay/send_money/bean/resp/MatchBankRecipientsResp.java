package com.transsnet.palmpay.send_money.bean.resp;

import Pa.r0;
import com.transsnet.palmpay.send_money.impl.MatchRecipientsImpl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010 \u001a\u0004\u0018\u00010\u0005H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006!"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/MatchBankRecipientsResp;", "Lcom/transsnet/palmpay/send_money/impl/MatchRecipientsImpl;", "<init>", "()V", "recipientHeadImage", "", "getRecipientHeadImage", "()Ljava/lang/String;", "setRecipientHeadImage", "(Ljava/lang/String;)V", "recipientNickname", "getRecipientNickname", "setRecipientNickname", "recipientAccountNumber", "getRecipientAccountNumber", "setRecipientAccountNumber", "recipientBankName", "getRecipientBankName", "setRecipientBankName", "recipientBankCode", "getRecipientBankCode", "setRecipientBankCode", "accountType", "", "getAccountType", "()I", "setAccountType", "(I)V", "getIcon", "getName", "getAccount", "getBankName", "getAccountMask", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MatchBankRecipientsResp implements MatchRecipientsImpl {
    private int accountType;

    @Nullable
    private String recipientAccountNumber;

    @Nullable
    private String recipientBankCode;

    @Nullable
    private String recipientBankName;

    @Nullable
    private String recipientHeadImage;

    @Nullable
    private String recipientNickname;

    @Override // com.transsnet.palmpay.send_money.impl.MatchRecipientsImpl
    @NotNull
    public String getAccount() {
        String strW;
        String str = this.recipientAccountNumber;
        return (str == null || (strW = r0.w(str)) == null) ? "" : strW;
    }

    @Override // com.transsnet.palmpay.send_money.impl.MatchRecipientsImpl
    @Nullable
    public String getAccountMask() {
        return null;
    }

    public final int getAccountType() {
        return this.accountType;
    }

    @Override // com.transsnet.palmpay.send_money.impl.MatchRecipientsImpl
    @Nullable
    /* JADX INFO: renamed from: getBankName, reason: from getter */
    public String getRecipientBankName() {
        return this.recipientBankName;
    }

    @Override // com.transsnet.palmpay.send_money.impl.MatchRecipientsImpl
    @Nullable
    /* JADX INFO: renamed from: getIcon, reason: from getter */
    public String getRecipientHeadImage() {
        return this.recipientHeadImage;
    }

    @Override // com.transsnet.palmpay.send_money.impl.MatchRecipientsImpl
    @Nullable
    /* JADX INFO: renamed from: getName, reason: from getter */
    public String getRecipientNickname() {
        return this.recipientNickname;
    }

    @Nullable
    public final String getRecipientAccountNumber() {
        return this.recipientAccountNumber;
    }

    @Nullable
    public final String getRecipientBankCode() {
        return this.recipientBankCode;
    }

    @Nullable
    public final String getRecipientBankName() {
        return this.recipientBankName;
    }

    @Nullable
    public final String getRecipientHeadImage() {
        return this.recipientHeadImage;
    }

    @Nullable
    public final String getRecipientNickname() {
        return this.recipientNickname;
    }

    public final void setAccountType(int i7) {
        this.accountType = i7;
    }

    public final void setRecipientAccountNumber(@Nullable String str) {
        this.recipientAccountNumber = str;
    }

    public final void setRecipientBankCode(@Nullable String str) {
        this.recipientBankCode = str;
    }

    public final void setRecipientBankName(@Nullable String str) {
        this.recipientBankName = str;
    }

    public final void setRecipientHeadImage(@Nullable String str) {
        this.recipientHeadImage = str;
    }

    public final void setRecipientNickname(@Nullable String str) {
        this.recipientNickname = str;
    }
}
