package com.appsflyer.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B+\b\u0002\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/appsflyer/internal/AFa1gSDK;", "", "", "", "p0", "Lcom/appsflyer/internal/AFa1hSDK;", "p1", "<init>", "(Ljava/util/Map;Lcom/appsflyer/internal/AFa1hSDK;)V", "", "getMonetizationNetwork", "(Ljava/lang/String;)Z", "", "AFAdRevenueData", "(Ljava/lang/String;Ljava/lang/Object;)V", "getMediationNetwork", "Ljava/util/Map;", "getCurrencyIso4217Code", "Lcom/appsflyer/internal/AFa1hSDK;", "getRevenue", "AFa1zSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFa1gSDK {

    /* JADX INFO: renamed from: AFa1zSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    @Nullable
    final AFa1hSDK getRevenue;

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    @NotNull
    final Map<String, Object> getCurrencyIso4217Code;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFa1gSDK$AFa1zSDK, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\n"}, d2 = {"Lcom/appsflyer/internal/AFa1gSDK$AFa1zSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFh1qSDK;", "p0", "Lcom/appsflyer/internal/AFa1gSDK;", "getMonetizationNetwork", "(Lcom/appsflyer/internal/AFh1qSDK;)Lcom/appsflyer/internal/AFa1gSDK;", "Lcom/appsflyer/internal/AFa1hSDK;", "(Lcom/appsflyer/internal/AFa1hSDK;)Lcom/appsflyer/internal/AFa1gSDK;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        @NotNull
        public static AFa1gSDK getMonetizationNetwork(@NotNull AFh1qSDK p3) {
            Intrinsics.checkNotNullParameter(p3, "");
            Map<String, Object> map = p3.getMediationNetwork;
            Intrinsics.checkNotNullExpressionValue(map, "");
            return new AFa1gSDK(map, null, 2, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public static AFa1gSDK getMonetizationNetwork(@NotNull AFa1hSDK p3) {
            Intrinsics.checkNotNullParameter(p3, "");
            return new AFa1gSDK(new LinkedHashMap(), p3, null);
        }
    }

    private AFa1gSDK(Map<String, Object> map, AFa1hSDK aFa1hSDK) {
        this.getCurrencyIso4217Code = map;
        this.getRevenue = aFa1hSDK;
    }

    @JvmStatic
    @NotNull
    public static final AFa1gSDK getCurrencyIso4217Code(@NotNull AFa1hSDK aFa1hSDK) {
        return Companion.getMonetizationNetwork(aFa1hSDK);
    }

    public final void AFAdRevenueData(@NotNull String p3, @Nullable Object p10) {
        Intrinsics.checkNotNullParameter(p3, "");
        this.getCurrencyIso4217Code.put(p3, p10);
        AFa1hSDK aFa1hSDK = this.getRevenue;
        if (aFa1hSDK != null) {
            aFa1hSDK.getRevenue(this.getCurrencyIso4217Code);
        }
    }

    public final boolean getMonetizationNetwork(@NotNull String p3) {
        Intrinsics.checkNotNullParameter(p3, "");
        return this.getCurrencyIso4217Code.containsKey(p3);
    }

    @JvmStatic
    @NotNull
    public static final AFa1gSDK getMonetizationNetwork(@NotNull AFh1qSDK aFh1qSDK) {
        return Companion.getMonetizationNetwork(aFh1qSDK);
    }

    public /* synthetic */ AFa1gSDK(Map map, AFa1hSDK aFa1hSDK, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i7 & 2) != 0 ? null : aFa1hSDK);
    }

    public /* synthetic */ AFa1gSDK(Map map, AFa1hSDK aFa1hSDK, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, aFa1hSDK);
    }
}
