package com.transsnet.palmpay.cash_in.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/cash_in/bean/SubTaxItem;", "", "fee", "", "feeName", "", "feeDesc", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getFee", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFeeName", "()Ljava/lang/String;", "getFeeDesc", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SubTaxItem {

    @Nullable
    private final Long fee;

    @Nullable
    private final String feeDesc;

    @Nullable
    private final String feeName;

    public SubTaxItem() {
        this(null, null, null, 7, null);
    }

    @Nullable
    public final Long getFee() {
        return this.fee;
    }

    @Nullable
    public final String getFeeDesc() {
        return this.feeDesc;
    }

    @Nullable
    public final String getFeeName() {
        return this.feeName;
    }

    public SubTaxItem(@Nullable Long l5, @Nullable String str, @Nullable String str2) {
        this.fee = l5;
        this.feeName = str;
        this.feeDesc = str2;
    }

    public /* synthetic */ SubTaxItem(Long l5, String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : l5, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : str2);
    }
}
