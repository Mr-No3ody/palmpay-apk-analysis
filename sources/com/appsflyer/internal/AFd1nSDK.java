package com.appsflyer.internal;

import com.google.firebase.perf.util.Constants;
import com.transsnet.palmpay.core.bean.bill.TransType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0007*\u00020\u0007H\u0017¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00178\u0017X\u0097D¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0014\u0010\u0012\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/appsflyer/internal/AFd1nSDK;", "Lcom/appsflyer/internal/AFc1aSDK;", "Lcom/appsflyer/internal/AFc1pSDK;", "p0", "", "p1", "", "", TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW, "", "p3", "<init>", "(Lcom/appsflyer/internal/AFc1pSDK;[BLjava/util/Map;I)V", "getMediationNetwork", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFd1fSDK;", "component1", "Lcom/appsflyer/internal/AFd1fSDK;", "getRevenue", "()Lcom/appsflyer/internal/AFd1fSDK;", "getMonetizationNetwork", "Lcom/appsflyer/internal/AFc1pSDK;", "AFAdRevenueData", "", "Z", "()Z", "getCurrencyIso4217Code", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFd1nSDK extends AFc1aSDK {

    /* JADX INFO: renamed from: component1, reason: from kotlin metadata */
    @NotNull
    private final AFd1fSDK getMonetizationNetwork;

    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    private final boolean getCurrencyIso4217Code;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    @NotNull
    public AFc1pSDK AFAdRevenueData;

    public /* synthetic */ AFd1nSDK(AFc1pSDK aFc1pSDK, byte[] bArr, Map map, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1pSDK, bArr, (i10 & 4) != 0 ? null : map, (i10 & 8) != 0 ? Constants.MAX_URL_LENGTH : i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.appsflyer.internal.AFc1aSDK
    @JvmName(name = "getCurrencyIso4217Code")
    @NotNull
    public final String getCurrencyIso4217Code() {
        AFj1iSDK aFj1iSDK = new AFj1iSDK(this.AFAdRevenueData, null, 2, 0 == true ? 1 : 0);
        return aFj1iSDK.AFAdRevenueData(aFj1iSDK.getMonetizationNetwork.AFAdRevenueData(AFj1iSDK.component1));
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @NotNull
    public final String getMediationNetwork(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[RD]: " + str;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @JvmName(name = "getMonetizationNetwork")
    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from getter */
    public final boolean getGetCurrencyIso4217Code() {
        return this.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFc1aSDK
    @JvmName(name = "getRevenue")
    @NotNull
    /* JADX INFO: renamed from: getRevenue, reason: from getter */
    public final AFd1fSDK getGetMonetizationNetwork() {
        return this.getMonetizationNetwork;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    private AFd1nSDK(@NotNull AFc1pSDK aFc1pSDK, @NotNull byte[] bArr, @Nullable Map<String, String> map, int i7) {
        super(bArr, map, i7);
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.AFAdRevenueData = aFc1pSDK;
        this.getMonetizationNetwork = AFd1fSDK.OCTET_STREAM;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AFd1nSDK(@NotNull AFc1pSDK aFc1pSDK, @NotNull byte[] bArr) {
        this(aFc1pSDK, bArr, null, 0, 12, null);
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
    }
}
