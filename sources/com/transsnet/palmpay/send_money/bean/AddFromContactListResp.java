package com.transsnet.palmpay.send_money.bean;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR\u001c\u0010 \u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\tR\u001c\u0010#\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\tR\u001a\u0010&\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010(\"\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/AddFromContactListResp;", "", "<init>", "()V", "recipientHeadImage", "", "getRecipientHeadImage", "()Ljava/lang/String;", "setRecipientHeadImage", "(Ljava/lang/String;)V", "recipientName", "getRecipientName", "setRecipientName", "recipientAccountNumber", "getRecipientAccountNumber", "setRecipientAccountNumber", "recipientBankCode", "getRecipientBankCode", "setRecipientBankCode", "recipientBankName", "getRecipientBankName", "setRecipientBankName", "accountType", "", "getAccountType", "()Ljava/lang/Integer;", "setAccountType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "recipientPhone", "getRecipientPhone", "setRecipientPhone", "recipientMemberId", "getRecipientMemberId", "setRecipientMemberId", "recipientPalmPayTag", "getRecipientPalmPayTag", "setRecipientPalmPayTag", "isSelect", "", "()Z", "setSelect", "(Z)V", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AddFromContactListResp {

    @Nullable
    private Integer accountType;
    private boolean isSelect;

    @Nullable
    private String recipientAccountNumber;

    @Nullable
    private String recipientBankCode;

    @Nullable
    private String recipientBankName;

    @Nullable
    private String recipientHeadImage;

    @Nullable
    private String recipientMemberId;

    @Nullable
    private String recipientName;

    @Nullable
    private String recipientPalmPayTag;

    @Nullable
    private String recipientPhone;

    @Nullable
    public final Integer getAccountType() {
        return this.accountType;
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
    public final String getRecipientMemberId() {
        return this.recipientMemberId;
    }

    @Nullable
    public final String getRecipientName() {
        return this.recipientName;
    }

    @Nullable
    public final String getRecipientPalmPayTag() {
        return this.recipientPalmPayTag;
    }

    @Nullable
    public final String getRecipientPhone() {
        return this.recipientPhone;
    }

    /* JADX INFO: renamed from: isSelect, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    public final void setAccountType(@Nullable Integer num) {
        this.accountType = num;
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

    public final void setRecipientMemberId(@Nullable String str) {
        this.recipientMemberId = str;
    }

    public final void setRecipientName(@Nullable String str) {
        this.recipientName = str;
    }

    public final void setRecipientPalmPayTag(@Nullable String str) {
        this.recipientPalmPayTag = str;
    }

    public final void setRecipientPhone(@Nullable String str) {
        this.recipientPhone = str;
    }

    public final void setSelect(boolean z3) {
        this.isSelect = z3;
    }
}
