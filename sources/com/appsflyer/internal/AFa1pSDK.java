package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/appsflyer/internal/AFa1pSDK;", "", "", "p0", "Lcom/appsflyer/deeplink/DeepLink;", "p1", "<init>", "(ZLcom/appsflyer/deeplink/DeepLink;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getMediationNetwork", "Lcom/appsflyer/deeplink/DeepLink;", "getCurrencyIso4217Code", "getRevenue", "Z", "getMonetizationNetwork", "()Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AFa1pSDK {

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    @Nullable
    public final DeepLink getCurrencyIso4217Code;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    private final boolean getMonetizationNetwork;

    public AFa1pSDK(boolean z3, @Nullable DeepLink deepLink) {
        this.getMonetizationNetwork = z3;
        this.getCurrencyIso4217Code = deepLink;
    }

    public final boolean equals(@Nullable Object p3) {
        if (this == p3) {
            return true;
        }
        if (!(p3 instanceof AFa1pSDK)) {
            return false;
        }
        AFa1pSDK aFa1pSDK = (AFa1pSDK) p3;
        return this.getMonetizationNetwork == aFa1pSDK.getMonetizationNetwork && Intrinsics.c(this.getCurrencyIso4217Code, aFa1pSDK.getCurrencyIso4217Code);
    }

    @JvmName(name = "getMonetizationNetwork")
    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from getter */
    public final boolean getGetMonetizationNetwork() {
        return this.getMonetizationNetwork;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z3 = this.getMonetizationNetwork;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i7 = r3 * 31;
        DeepLink deepLink = this.getCurrencyIso4217Code;
        return i7 + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @NotNull
    public final String toString() {
        return "DdlResponse(secondPing=" + this.getMonetizationNetwork + ", deepLink=" + this.getCurrencyIso4217Code + ")";
    }

    public /* synthetic */ AFa1pSDK(boolean z3, DeepLink deepLink, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? true : z3, (i7 & 2) != 0 ? null : deepLink);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AFa1pSDK() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
