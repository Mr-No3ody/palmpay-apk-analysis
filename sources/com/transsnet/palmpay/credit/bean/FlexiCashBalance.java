package com.transsnet.palmpay.credit.bean;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rR\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/FlexiCashBalance;", "", "cardNo", "", "accountType", "", "accountStatus", "creditQuota", "", "availableBalance", "frozenType", "frozenPrompt", "<init>", "(Ljava/lang/String;IILjava/lang/Long;Ljava/lang/Long;ILjava/lang/String;)V", "Ljava/lang/Long;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiCashBalance {

    @JvmField
    public final int accountStatus;

    @JvmField
    public final int accountType;

    @JvmField
    @Nullable
    public final Long availableBalance;

    @JvmField
    @Nullable
    public final String cardNo;

    @JvmField
    @Nullable
    public final Long creditQuota;

    @JvmField
    @Nullable
    public final String frozenPrompt;

    @JvmField
    public final int frozenType;

    public FlexiCashBalance(@Nullable String str, int i7, int i10, @Nullable Long l5, @Nullable Long l6, int i11, @Nullable String str2) {
        this.cardNo = str;
        this.accountType = i7;
        this.accountStatus = i10;
        this.creditQuota = l5;
        this.availableBalance = l6;
        this.frozenType = i11;
        this.frozenPrompt = str2;
    }
}
