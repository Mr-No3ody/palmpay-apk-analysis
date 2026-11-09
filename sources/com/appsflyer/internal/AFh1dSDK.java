package com.appsflyer.internal;

import com.transsnet.palmpay.core.bean.bill.TransType;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010 "}, d2 = {"Lcom/appsflyer/internal/AFh1dSDK;", "", "", "p0", "", "p1", "", "", TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW, "", "p3", TransType.TRANS_TYPE_SPLIT_BILL, TransType.TRANS_TYPE_BILLER_ONLINE_SHOPPING, "<init>", "(JFLjava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getRevenue", "()Z", "AFAdRevenueData", "Ljava/lang/String;", "getMediationNetwork", "getMonetizationNetwork", "I", "F", "component4", "getCurrencyIso4217Code", "Ljava/util/List;", "component2", "J", "component1"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFh1dSDK {

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @NotNull
    public final String getMediationNetwork;

    /* JADX INFO: renamed from: component4, reason: from kotlin metadata */
    @NotNull
    public final String getCurrencyIso4217Code;

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    public long component1;

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    @NotNull
    public List<String> component2;
    public final int getMonetizationNetwork;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    public final float AFAdRevenueData;

    @JvmOverloads
    public AFh1dSDK(long j6, float f10, @NotNull List<String> list, int i7, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component1 = j6;
        this.AFAdRevenueData = f10;
        this.component2 = list;
        this.getMonetizationNetwork = i7;
        this.getMediationNetwork = str;
        this.getCurrencyIso4217Code = str2;
    }

    public final boolean equals(@Nullable Object p3) {
        if (this == p3) {
            return true;
        }
        if (!AFh1dSDK.class.equals(p3 != null ? p3.getClass() : null)) {
            return false;
        }
        Intrinsics.f(p3, "");
        AFh1dSDK aFh1dSDK = (AFh1dSDK) p3;
        return this.component1 == aFh1dSDK.component1 && this.AFAdRevenueData == aFh1dSDK.AFAdRevenueData && Intrinsics.c(this.component2, aFh1dSDK.component2) && this.getMonetizationNetwork == aFh1dSDK.getMonetizationNetwork && Intrinsics.c(this.getMediationNetwork, aFh1dSDK.getMediationNetwork) && Intrinsics.c(this.getCurrencyIso4217Code, aFh1dSDK.getCurrencyIso4217Code);
    }

    @JvmName(name = "getRevenue")
    public final boolean getRevenue() {
        return TimeUnit.SECONDS.toMillis(this.component1) > ((AFa1uSDK) AFa1uSDK.getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis())).getRevenue().component3().getCurrencyIso4217Code();
    }

    public final int hashCode() {
        return this.getCurrencyIso4217Code.hashCode() + ((this.getMediationNetwork.hashCode() + ((((this.component2.hashCode() + ((Float.hashCode(this.AFAdRevenueData) + (Long.hashCode(this.component1) * 31)) * 31)) * 31) + this.getMonetizationNetwork) * 31)) * 31);
    }
}
