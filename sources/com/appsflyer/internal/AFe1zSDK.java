package com.appsflyer.internal;

import androidx.camera.camera2.internal.F;
import com.transsnet.palmpay.core.bean.bill.TransType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014"}, d2 = {"Lcom/appsflyer/internal/AFe1zSDK;", "", "", "p0", "p1", "Lcom/appsflyer/internal/AFe1rSDK;", TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/internal/AFe1rSDK;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AFAdRevenueData", "Lcom/appsflyer/internal/AFe1rSDK;", "getMediationNetwork", "Ljava/lang/String;", "getCurrencyIso4217Code", "getRevenue", "getMonetizationNetwork"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AFe1zSDK {

    @NotNull
    public final AFe1rSDK AFAdRevenueData;

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    @NotNull
    public final String getCurrencyIso4217Code;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    @Nullable
    public final String getMonetizationNetwork;

    public AFe1zSDK(@NotNull String str, @Nullable String str2, @NotNull AFe1rSDK aFe1rSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFe1rSDK, "");
        this.getCurrencyIso4217Code = str;
        this.getMonetizationNetwork = str2;
        this.AFAdRevenueData = aFe1rSDK;
    }

    public final boolean equals(@Nullable Object p3) {
        if (this == p3) {
            return true;
        }
        if (!(p3 instanceof AFe1zSDK)) {
            return false;
        }
        AFe1zSDK aFe1zSDK = (AFe1zSDK) p3;
        return Intrinsics.c(this.getCurrencyIso4217Code, aFe1zSDK.getCurrencyIso4217Code) && Intrinsics.c(this.getMonetizationNetwork, aFe1zSDK.getMonetizationNetwork) && this.AFAdRevenueData == aFe1zSDK.AFAdRevenueData;
    }

    public final int hashCode() {
        int iHashCode = this.getCurrencyIso4217Code.hashCode() * 31;
        String str = this.getMonetizationNetwork;
        return this.AFAdRevenueData.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.getCurrencyIso4217Code;
        String str2 = this.getMonetizationNetwork;
        AFe1rSDK aFe1rSDK = this.AFAdRevenueData;
        StringBuilder sbF = F.f("HostMeta(name=", str, ", prefix=", str2, ", method=");
        sbF.append(aFe1rSDK);
        sbF.append(")");
        return sbF.toString();
    }
}
