package com.appsflyer.internal;

import com.transsnet.palmpay.core.bean.bill.TransType;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000b8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b"}, d2 = {"Lcom/appsflyer/internal/AFh1sSDK;", "", "", "p0", "", "p1", TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW, "p3", TransType.TRANS_TYPE_SPLIT_BILL, TransType.TRANS_TYPE_BILLER_ONLINE_SHOPPING, TransType.TRANS_TYPE_BILLER_EVENT_TICKET, "", TransType.TRANS_TYPE_BILLER_DUES_AND_SERVICE_CHARGE, "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getMediationNetwork", "Ljava/lang/String;", "getMonetizationNetwork", "component2", "getCurrencyIso4217Code", "Ljava/lang/Boolean;", "AFAdRevenueData", "getRevenue", "component3", "component4", "Ljava/util/Map;", "component1"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AFh1sSDK {

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @Nullable
    public Boolean getMediationNetwork;

    /* JADX INFO: renamed from: component2, reason: from kotlin metadata */
    @Nullable
    public String getCurrencyIso4217Code;

    /* JADX INFO: renamed from: component3, reason: from kotlin metadata */
    @Nullable
    public Boolean component2;

    /* JADX INFO: renamed from: component4, reason: from kotlin metadata */
    @NotNull
    public Map<String, Object> component1;

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    @Nullable
    public Boolean component3;

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    @Nullable
    public String getMonetizationNetwork;

    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    @Nullable
    public Boolean AFAdRevenueData;

    @Nullable
    public Boolean getRevenue;

    private AFh1sSDK(@Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable String str2, @Nullable Boolean bool5, @NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.getMonetizationNetwork = str;
        this.component3 = bool;
        this.AFAdRevenueData = bool2;
        this.getRevenue = bool3;
        this.getMediationNetwork = bool4;
        this.getCurrencyIso4217Code = str2;
        this.component2 = bool5;
        this.component1 = map;
    }

    public final boolean equals(@Nullable Object p3) {
        if (this == p3) {
            return true;
        }
        if (!(p3 instanceof AFh1sSDK)) {
            return false;
        }
        AFh1sSDK aFh1sSDK = (AFh1sSDK) p3;
        return Intrinsics.c(this.getMonetizationNetwork, aFh1sSDK.getMonetizationNetwork) && Intrinsics.c(this.component3, aFh1sSDK.component3) && Intrinsics.c(this.AFAdRevenueData, aFh1sSDK.AFAdRevenueData) && Intrinsics.c(this.getRevenue, aFh1sSDK.getRevenue) && Intrinsics.c(this.getMediationNetwork, aFh1sSDK.getMediationNetwork) && Intrinsics.c(this.getCurrencyIso4217Code, aFh1sSDK.getCurrencyIso4217Code) && Intrinsics.c(this.component2, aFh1sSDK.component2) && Intrinsics.c(this.component1, aFh1sSDK.component1);
    }

    public final int hashCode() {
        String str = this.getMonetizationNetwork;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.component3;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.AFAdRevenueData;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.getRevenue;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.getMediationNetwork;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.getCurrencyIso4217Code;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool5 = this.component2;
        return this.component1.hashCode() + ((iHashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        return "AdvertisingIdData(advertisingId=" + this.getMonetizationNetwork + ", isLimited=" + this.component3 + ", isEnabled=" + this.AFAdRevenueData + ", isGaidWithGps=" + this.getRevenue + ", isGaidWithSamsungCloudDev=" + this.getMediationNetwork + ", gaidError=" + this.getCurrencyIso4217Code + ", retry=" + this.component2 + ", metadata=" + this.component1 + ")";
    }

    public /* synthetic */ AFh1sSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map map, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : bool, (i7 & 4) != 0 ? null : bool2, (i7 & 8) != 0 ? null : bool3, (i7 & 16) != 0 ? null : bool4, (i7 & 32) != 0 ? null : str2, (i7 & 64) != 0 ? null : bool5, (i7 & 128) != 0 ? new HashMap() : map);
    }

    public AFh1sSDK() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
