package com.transsnet.palmpay.core.bean;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0010\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/core/bean/LastPayerDataBean;", "", "authenType", "", "auth", "", "amount", "", "businessType", "orderId", "", "senderHeadImage", "senderNickname", "recipientNickname", "recipientPhone", "<init>", "(IZLjava/lang/Long;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Long;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LastPayerDataBean {

    @JvmField
    @Nullable
    public final Long amount;

    @JvmField
    public final boolean auth;

    @JvmField
    public final int authenType;

    @JvmField
    public final int businessType;

    @JvmField
    @NotNull
    public final String orderId;

    @JvmField
    @NotNull
    public final String recipientNickname;

    @JvmField
    @NotNull
    public final String recipientPhone;

    @JvmField
    @NotNull
    public final String senderHeadImage;

    @JvmField
    @NotNull
    public final String senderNickname;

    public LastPayerDataBean(int i7, boolean z3, @Nullable Long l5, int i10, @NotNull String orderId, @NotNull String senderHeadImage, @NotNull String senderNickname, @NotNull String recipientNickname, @NotNull String recipientPhone) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(senderHeadImage, "senderHeadImage");
        Intrinsics.checkNotNullParameter(senderNickname, "senderNickname");
        Intrinsics.checkNotNullParameter(recipientNickname, "recipientNickname");
        Intrinsics.checkNotNullParameter(recipientPhone, "recipientPhone");
        this.authenType = i7;
        this.auth = z3;
        this.amount = l5;
        this.businessType = i10;
        this.orderId = orderId;
        this.senderHeadImage = senderHeadImage;
        this.senderNickname = senderNickname;
        this.recipientNickname = recipientNickname;
        this.recipientPhone = recipientPhone;
    }
}
