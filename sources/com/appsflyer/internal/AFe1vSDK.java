package com.appsflyer.internal;

import android.util.Base64;
import com.alibaba.android.arouter.utils.Consts;
import com.appsflyer.AFLogger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.o;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0015\u0010\u000b\u001a\u00020\b8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0015\u0010\r\u001a\u00020\b8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0011\u0010\f\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0011\u0010\u000e\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFe1vSDK;", "", "Lcom/appsflyer/internal/AFc1pSDK;", "p0", "Lcom/appsflyer/internal/AFc1qSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFc1pSDK;Lcom/appsflyer/internal/AFc1qSDK;)V", "", "component1", "Lkotlin/Lazy;", "getMediationNetwork", "getMonetizationNetwork", "getCurrencyIso4217Code", "AFAdRevenueData", "()Ljava/lang/String;", "Lcom/appsflyer/internal/AFc1pSDK;", "getRevenue", "", "()Z", "Lcom/appsflyer/internal/AFc1qSDK;", "areAllFieldsValid", "component4", "AFa1uSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFe1vSDK {

    @Nullable
    private static AFe1ySDK areAllFieldsValid;

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    @NotNull
    private final AFc1pSDK getRevenue;

    /* JADX INFO: renamed from: component1, reason: from kotlin metadata */
    @NotNull
    private final Lazy getMediationNetwork;

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    @NotNull
    private final AFc1qSDK areAllFieldsValid;

    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    @NotNull
    public final Lazy getCurrencyIso4217Code;

    /* JADX INFO: renamed from: AFa1uSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static String getRevenue = "https://%scdn-%ssettings.%s/android/v2/%s/settings";

    @NotNull
    public static String getCurrencyIso4217Code = "https://%scdn-%stestsettings.%s/android/v2/%s/settings";

    @NotNull
    private static final List<String> component2 = C1850q.h("googleplay", "playstore", "googleplaystore");

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1vSDK$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getRevenue", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nUrlProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UrlProvider.kt\ncom/appsflyer/internal/components/network/provider/UrlProvider$channel$2\n+ 2 StringExtensions.kt\ncom/appsflyer/internal/util/StringExtensionsKt\n*L\n1#1,158:1\n39#2:159\n*S KotlinDebug\n*F\n+ 1 UrlProvider.kt\ncom/appsflyer/internal/components/network/provider/UrlProvider$channel$2\n*L\n83#1:159\n*E\n"})
    public static final class AnonymousClass1 extends o implements Function0<String> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String strAFAdRevenueData = AFa1uSDK.AFAdRevenueData(AFe1vSDK.this.areAllFieldsValid, AFe1vSDK.this.getRevenue.component2());
            if (strAFAdRevenueData != null && !StringsKt.F(strAFAdRevenueData)) {
                String string = StringsKt.V(strAFAdRevenueData).toString();
                List<String> currencyIso4217Code = Companion.getCurrencyIso4217Code();
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                String lowerCase = string.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (currencyIso4217Code.contains(lowerCase)) {
                    String str = String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{string}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    AFLogger.afWarnLog(str);
                    strAFAdRevenueData = "";
                } else {
                    strAFAdRevenueData = "-".concat(string);
                }
            }
            return StringsKt.V(strAFAdRevenueData != null ? strAFAdRevenueData : "").toString();
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1vSDK$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getRevenue", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass5 extends o implements Function0<String> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String packageName = AFe1vSDK.this.getRevenue.getCurrencyIso4217Code.getRevenue.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "");
            return AFe1vSDK.getCurrencyIso4217Code(packageName, AFe1vSDK.AFAdRevenueData(AFe1vSDK.this));
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1vSDK$AFa1uSDK, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u001e\u0010\b\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\"\u0004\b\f\u0010\u0011"}, d2 = {"Lcom/appsflyer/internal/AFe1vSDK$AFa1uSDK;", "", "<init>", "()V", "", "", "component2", "Ljava/util/List;", "getCurrencyIso4217Code", "()Ljava/util/List;", "getRevenue", "Ljava/lang/String;", "getMonetizationNetwork", "getMediationNetwork", "Lcom/appsflyer/internal/AFe1ySDK;", "areAllFieldsValid", "Lcom/appsflyer/internal/AFe1ySDK;", "(Lcom/appsflyer/internal/AFe1ySDK;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmName(name = "getCurrencyIso4217Code")
        @NotNull
        public static List<String> getCurrencyIso4217Code() {
            return AFe1vSDK.component2;
        }

        @JvmName(name = "getMonetizationNetwork")
        public static void getMonetizationNetwork(@Nullable AFe1ySDK aFe1ySDK) {
            AFe1vSDK.areAllFieldsValid = aFe1ySDK;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] getMediationNetwork;

        static {
            int[] iArr = new int[AFe1rSDK.values().length];
            try {
                iArr[AFe1rSDK.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1rSDK.API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFe1rSDK.RC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getMediationNetwork = iArr;
        }
    }

    public AFe1vSDK(@NotNull AFc1pSDK aFc1pSDK, @NotNull AFc1qSDK aFc1qSDK) {
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        this.getRevenue = aFc1pSDK;
        this.areAllFieldsValid = aFc1qSDK;
        this.getMediationNetwork = C2131j.b(new AnonymousClass1());
        this.getCurrencyIso4217Code = C2131j.b(new AnonymousClass5());
    }

    @JvmName(name = "AFAdRevenueData")
    @NotNull
    public final String AFAdRevenueData() {
        int i7 = AFa1vSDK.getMediationNetwork[(getMediationNetwork() ? AFe1rSDK.DEFAULT : AFe1rSDK.API).ordinal()];
        if (i7 == 1) {
            return "appsflyersdk.com";
        }
        if (i7 != 2) {
            if (i7 == 3) {
                return "";
            }
            throw new p355xf.l();
        }
        AFe1ySDK aFe1ySDK = areAllFieldsValid;
        String str = aFe1ySDK != null ? aFe1ySDK.getCurrencyIso4217Code : null;
        return str == null ? "" : str;
    }

    @JvmName(name = "getCurrencyIso4217Code")
    @NotNull
    public final String getCurrencyIso4217Code() {
        int i7 = AFa1vSDK.getMediationNetwork[(getMediationNetwork() ? AFe1rSDK.DEFAULT : AFe1rSDK.API).ordinal()];
        if (i7 == 1) {
            return (String) this.getCurrencyIso4217Code.getValue();
        }
        if (i7 != 2) {
            if (i7 == 3) {
                return "";
            }
            throw new p355xf.l();
        }
        AFe1ySDK aFe1ySDK = areAllFieldsValid;
        String str = aFe1ySDK != null ? aFe1ySDK.AFAdRevenueData : null;
        return str == null ? "" : str;
    }

    @JvmName(name = "getMediationNetwork")
    public static boolean getMediationNetwork() {
        return areAllFieldsValid == null;
    }

    public static final /* synthetic */ String AFAdRevenueData(AFe1vSDK aFe1vSDK) {
        return (String) aFe1vSDK.getMediationNetwork.getValue();
    }

    public static final /* synthetic */ String getCurrencyIso4217Code(String str, String str2) throws NoSuchAlgorithmException {
        String str3 = str + str2;
        Intrinsics.checkNotNullParameter(str3, "");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str3.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        String strEncodeToString = Base64.encodeToString(bArrDigest, 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        String lowerCase = strEncodeToString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String strSubstring = new Regex("[^\\w]+").replace(lowerCase, "").substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring + Consts.DOT;
    }

    public static final void AFAdRevenueData(@Nullable AFe1ySDK aFe1ySDK) {
        Companion.getMonetizationNetwork(aFe1ySDK);
    }
}
