package com.transsnet.palmpay.send_money.bean;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(¨\u0006,"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/ScheduleTransferPaymentBean;", "", "<init>", "()V", "paymentIcon", "", "getPaymentIcon", "()Ljava/lang/String;", "setPaymentIcon", "(Ljava/lang/String;)V", "paymentAshIcon", "getPaymentAshIcon", "setPaymentAshIcon", "paymentTypeDesc", "getPaymentTypeDesc", "setPaymentTypeDesc", "paymentType", "", "getPaymentType", "()Ljava/lang/Integer;", "setPaymentType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "jumpUrl", "getJumpUrl", "setJumpUrl", "balanceDesc", "getBalanceDesc", "setBalanceDesc", "balance", "", "getBalance", "()J", "setBalance", "(J)V", "balanceEnough", "", "getBalanceEnough", "()Z", "setBalanceEnough", "(Z)V", "defaultOption", "getDefaultOption", "setDefaultOption", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScheduleTransferPaymentBean {
    private long balance;

    @Nullable
    private String balanceDesc;
    private boolean balanceEnough;
    private boolean defaultOption;

    @Nullable
    private String jumpUrl;

    @Nullable
    private String paymentAshIcon;

    @Nullable
    private String paymentIcon;

    @Nullable
    private Integer paymentType;

    @Nullable
    private String paymentTypeDesc;

    public final long getBalance() {
        return this.balance;
    }

    @Nullable
    public final String getBalanceDesc() {
        return this.balanceDesc;
    }

    public final boolean getBalanceEnough() {
        return this.balanceEnough;
    }

    public final boolean getDefaultOption() {
        return this.defaultOption;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    public final String getPaymentAshIcon() {
        return this.paymentAshIcon;
    }

    @Nullable
    public final String getPaymentIcon() {
        return this.paymentIcon;
    }

    @Nullable
    public final Integer getPaymentType() {
        return this.paymentType;
    }

    @Nullable
    public final String getPaymentTypeDesc() {
        return this.paymentTypeDesc;
    }

    public final void setBalance(long j6) {
        this.balance = j6;
    }

    public final void setBalanceDesc(@Nullable String str) {
        this.balanceDesc = str;
    }

    public final void setBalanceEnough(boolean z3) {
        this.balanceEnough = z3;
    }

    public final void setDefaultOption(boolean z3) {
        this.defaultOption = z3;
    }

    public final void setJumpUrl(@Nullable String str) {
        this.jumpUrl = str;
    }

    public final void setPaymentAshIcon(@Nullable String str) {
        this.paymentAshIcon = str;
    }

    public final void setPaymentIcon(@Nullable String str) {
        this.paymentIcon = str;
    }

    public final void setPaymentType(@Nullable Integer num) {
        this.paymentType = num;
    }

    public final void setPaymentTypeDesc(@Nullable String str) {
        this.paymentTypeDesc = str;
    }
}
