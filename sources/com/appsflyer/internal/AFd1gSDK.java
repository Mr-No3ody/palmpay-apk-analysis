package com.appsflyer.internal;

import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.camera.video.u;
import com.appsflyer.AppsFlyerLib;
import com.transsnet.palmpay.core.bean.bill.TransType;
import face.security.device.api.FaceSecCode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rBE\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/appsflyer/internal/AFd1gSDK;", "Lcom/appsflyer/internal/AFd1aSDK;", "", "p0", "", "p1", "", TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW, "p3", "", TransType.TRANS_TYPE_SPLIT_BILL, "<init>", "(Ljava/lang/String;Ljava/util/Map;[BLjava/lang/String;Z)V", "AFa1zSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFd1gSDK extends AFd1aSDK {

    /* JADX INFO: renamed from: AFa1zSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1gSDK$AFa1zSDK, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\n\u001a\u0006*\u00020\u00040\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/appsflyer/internal/AFd1gSDK$AFa1zSDK;", "", "<init>", "()V", "", "p0", "p1", TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW, "p3", TransType.TRANS_TYPE_SPLIT_BILL, "getRevenue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getMediationNetwork", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static String getMediationNetwork(String p3, String p10, String p11) {
            return u.n(String.format(AFd1kSDK.AFAdRevenueData, AppsFlyerLib.getInstance().getHostPrefix(), ((AFa1uSDK) AFa1uSDK.getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis())).getHostName()), p3, p11, "?device_id=", p10);
        }

        @VisibleForTesting
        public static String getRevenue(@NotNull String p3, @NotNull String p10, @Nullable String p11, @NotNull String p12, @NotNull String p13) {
            Intrinsics.checkNotNullParameter(p3, "");
            Intrinsics.checkNotNullParameter(p10, "");
            Intrinsics.checkNotNullParameter(p12, "");
            Intrinsics.checkNotNullParameter(p13, "");
            return AFj1dSDK.getRevenue(TextUtils.join("\u2063", new String[]{p13, p11, p3 + p10}), p12);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AFd1gSDK(String str, Map map, byte[] bArr, String str2, boolean z3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i7 & 4) != 0 ? null : bArr, (i7 & 8) != 0 ? "GET" : str2, (i7 & 16) != 0 ? false : z3);
    }

    @JvmStatic
    @NotNull
    public static final AFd1gSDK getRevenue(@NotNull String str, @Nullable String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        String mediationNetwork = Companion.getMediationNetwork(str, str2, str3);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        AFd1gSDK aFd1gSDK = new AFd1gSDK(mediationNetwork, G.g(new Pair("Connection", "close"), new Pair("af_request_epoch_ms", strValueOf), new Pair("af_sig", Companion.getRevenue(str, str3, str2, str4, strValueOf))), null, null, false, 28, null);
        aFd1gSDK.component1 = FaceSecCode.SC_SUCCESS;
        return aFd1gSDK;
    }

    private AFd1gSDK(String str, Map<String, String> map, byte[] bArr, String str2, boolean z3) {
        super(str, bArr, str2, map, z3);
    }
}
