package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import androidx.annotation.VisibleForTesting;
import com.adjust.sdk.Constants;
import com.appsflyer.AFLogger;
import com.appsflyer.AdRevenueScheme;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.aidl.MsgEvent;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.collections.F;
import kotlin.collections.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p355xf.C2131j;
import p355xf.q;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nEventDataCollectorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventDataCollectorImpl.kt\ncom/appsflyer/internal/event_data/EventDataCollectorImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,924:1\n1#2:925\n*E\n"})
public final class AFg1tSDK implements AFg1vSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] AFInAppEventParameterName = {27400, 27641, 27647, 27636, 27637, 27586, 27592, 27645, 27635, 27642, 27591, 27592, 27604, 27644, 27646, 27497, 27442, 27441, 27455, 27441};
    private static int AFKeystoreWrapper = 0;
    private static int AFLogger = 1;

    @NotNull
    private final AFj1pSDK AFAdRevenueData;

    @NotNull
    private final AFg1wSDK areAllFieldsValid;

    @NotNull
    private final AFh1wSDK component1;

    @NotNull
    private final AFc1pSDK component2;

    @NotNull
    private final AFc1qSDK component3;

    @NotNull
    private final AFi1wSDK component4;

    @NotNull
    private final AFc1eSDK copy;

    @NotNull
    private final AFc1fSDK copydefault;

    @NotNull
    private final AFg1zSDK equals;

    @NotNull
    private final AFi1lSDK getCurrencyIso4217Code;

    @NotNull
    private final String getMediationNetwork;

    @NotNull
    private final Context getMonetizationNetwork;

    @NotNull
    private final AFg1xSDK getRevenue;

    @NotNull
    private final Lazy hashCode;

    @NotNull
    private final Lazy registerClient;

    @NotNull
    private final AFf1jSDK toString;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFg1tSDK$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/text/SimpleDateFormat;", "getRevenue", "()Ljava/text/SimpleDateFormat;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass2 extends o implements Function0<SimpleDateFormat> {
        public static final AnonymousClass2 getCurrencyIso4217Code = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFg1tSDK$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/AppsFlyerProperties;", "getCurrencyIso4217Code", "()Lcom/appsflyer/AppsFlyerProperties;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass5 extends o implements Function0<AppsFlyerProperties> {
        public static final AnonymousClass5 getMonetizationNetwork = new AnonymousClass5();

        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final AppsFlyerProperties invoke() {
            return AppsFlyerProperties.getInstance();
        }
    }

    public AFg1tSDK(@NotNull String str, @NotNull Context context, @NotNull AFi1lSDK aFi1lSDK, @NotNull AFg1xSDK aFg1xSDK, @NotNull AFj1pSDK aFj1pSDK, @NotNull AFg1wSDK aFg1wSDK, @NotNull AFh1wSDK aFh1wSDK, @NotNull AFc1qSDK aFc1qSDK, @NotNull AFc1pSDK aFc1pSDK, @NotNull AFi1wSDK aFi1wSDK, @NotNull AFf1jSDK aFf1jSDK, @NotNull AFc1eSDK aFc1eSDK, @NotNull AFg1zSDK aFg1zSDK, @NotNull AFc1fSDK aFc1fSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFi1lSDK, "");
        Intrinsics.checkNotNullParameter(aFg1xSDK, "");
        Intrinsics.checkNotNullParameter(aFj1pSDK, "");
        Intrinsics.checkNotNullParameter(aFg1wSDK, "");
        Intrinsics.checkNotNullParameter(aFh1wSDK, "");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(aFi1wSDK, "");
        Intrinsics.checkNotNullParameter(aFf1jSDK, "");
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        Intrinsics.checkNotNullParameter(aFg1zSDK, "");
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
        this.getMediationNetwork = str;
        this.getMonetizationNetwork = context;
        this.getCurrencyIso4217Code = aFi1lSDK;
        this.getRevenue = aFg1xSDK;
        this.AFAdRevenueData = aFj1pSDK;
        this.areAllFieldsValid = aFg1wSDK;
        this.component1 = aFh1wSDK;
        this.component3 = aFc1qSDK;
        this.component2 = aFc1pSDK;
        this.component4 = aFi1wSDK;
        this.toString = aFf1jSDK;
        this.copy = aFc1eSDK;
        this.equals = aFg1zSDK;
        this.copydefault = aFc1fSDK;
        this.hashCode = C2131j.b(AnonymousClass5.getMonetizationNetwork);
        this.registerClient = C2131j.b(AnonymousClass2.getCurrencyIso4217Code);
    }

    private final AppsFlyerProperties AFAdRevenueData() {
        AFKeystoreWrapper = (AFLogger + 101) % 128;
        AppsFlyerProperties appsFlyerProperties = (AppsFlyerProperties) this.hashCode.getValue();
        int i7 = AFLogger + HomeDialogState.PRIORITY_HIGHEST_111;
        AFKeystoreWrapper = i7 % 128;
        if (i7 % 2 == 0) {
            return appsFlyerProperties;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x0022 A[PHI: r0
      0x0022: PHI (r0v6 java.lang.String) = (r0v4 java.lang.String), (r0v10 java.lang.String) binds: [B:8:0x002f, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    private void AFInAppEventParameterName(@NotNull Map<String, Object> map) {
        String string;
        String str;
        int i7 = AFKeystoreWrapper + 45;
        AFLogger = i7 % 128;
        boolean z3 = false;
        if (i7 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            string = AFAdRevenueData().getString(AppsFlyerProperties.EXTENSION);
            if (string != null) {
                str = string;
                if (string.length() == 0) {
                    string = str;
                }
            }
            if (z3) {
            }
            map.put(AppsFlyerProperties.EXTENSION, str);
        }
        Intrinsics.checkNotNullParameter(map, "");
        string = AFAdRevenueData().getString(AppsFlyerProperties.EXTENSION);
        int i10 = 12 / 0;
        if (string != null) {
            str = string;
            if (string.length() == 0) {
                string = str;
            }
        }
        if (z3) {
            map.put(AppsFlyerProperties.EXTENSION, str);
        }
        AFLogger = (AFKeystoreWrapper + 43) % 128;
        z3 = true;
        str = string;
        if (z3) {
            map.put(AppsFlyerProperties.EXTENSION, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0036  */
    private void AFInAppEventType(@NotNull Map<String, Object> map) {
        boolean z3;
        int i7;
        Intrinsics.checkNotNullParameter(map, "");
        String strComponent2 = this.component2.component2();
        String str = (String) getRevenue(new Object[]{this.component3, strComponent2}, -1931286689, 1931286700, (int) System.currentTimeMillis());
        if (str != null) {
            AFKeystoreWrapper = (AFLogger + 73) % 128;
            if (str.equals(strComponent2)) {
                z3 = false;
            } else {
                z3 = true;
            }
        } else {
            z3 = false;
        }
        boolean z8 = str == null && strComponent2 != null;
        if (z3) {
            map.put("af_latestchannel", strComponent2);
            AFKeystoreWrapper = (AFLogger + 115) % 128;
        } else {
            int i10 = AFKeystoreWrapper + 73;
            AFLogger = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 62 / 0;
                if (z8) {
                    map.put("af_latestchannel", strComponent2);
                    AFKeystoreWrapper = (AFLogger + 115) % 128;
                }
            } else if (z8) {
                map.put("af_latestchannel", strComponent2);
                AFKeystoreWrapper = (AFLogger + 115) % 128;
            }
        }
        String str2 = (String) getRevenue(new Object[]{this}, 1736525094, -1736525086, System.identityHashCode(this));
        if (str2 != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String lowerCase = str2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            map.put("af_installstore", lowerCase);
            i7 = AFKeystoreWrapper + 125;
        } else {
            i7 = AFKeystoreWrapper + 1;
        }
        AFLogger = i7 % 128;
        String str3 = (String) getRevenue(new Object[]{this}, -2084865543, 2084865555, System.identityHashCode(this));
        if (str3 != null) {
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            String lowerCase2 = str3.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            map.put("af_preinstall_name", lowerCase2);
        }
        String str4 = (String) getRevenue(new Object[]{this}, 886343772, -886343772, System.identityHashCode(this));
        if (str4 != null) {
            Locale locale3 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale3, "");
            String lowerCase3 = str4.toLowerCase(locale3);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
            map.put("af_currentstore", lowerCase3);
        }
    }

    private void AFKeystoreWrapper(@NotNull Map<String, Object> map) {
        AFLogger = (AFKeystoreWrapper + MsgEvent.MSG_EVENT_STOP_FOREGROUND) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        long j6 = this.component1.copydefault;
        if (j6 != 0) {
            int i7 = AFKeystoreWrapper + 65;
            AFLogger = i7 % 128;
            if (i7 % 2 == 0) {
                map.put("prev_session_dur", Long.valueOf(j6));
                throw null;
            }
            map.put("prev_session_dur", Long.valueOf(j6));
            AFLogger = (AFKeystoreWrapper + 125) % 128;
        }
    }

    private void AFLogger(@NotNull Map<String, Object> map) {
        int i7 = AFKeystoreWrapper + 101;
        AFLogger = i7 % 128;
        if (i7 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.putAll(this.equals.getRevenue());
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.putAll(this.equals.getRevenue());
        int i10 = AFLogger + 115;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    private static void a(boolean z3, int[] iArr, String str, Object[] objArr) throws UnsupportedEncodingException {
        int i7;
        int length;
        char[] cArr;
        String str2 = str;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        AFk1lSDK aFk1lSDK = new AFk1lSDK();
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        char[] cArr2 = AFInAppEventParameterName;
        if (cArr2 != null) {
            int i14 = $11 + 125;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i15 = 0;
            while (i15 < length) {
                cArr[i15] = (char) (((long) cArr2[i15]) ^ (-6320700084807177384L));
                i15++;
                $11 = ($10 + 119) % 128;
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i11];
        System.arraycopy(cArr2, i10, cArr3, 0, i11);
        if (bArr != null) {
            $10 = ($11 + HomeDialogState.PRIORITY_HIGHEST_111) % 128;
            char[] cArr4 = new char[i11];
            aFk1lSDK.getCurrencyIso4217Code = 0;
            char c6 = 0;
            while (true) {
                int i16 = aFk1lSDK.getCurrencyIso4217Code;
                if (i16 >= i11) {
                    break;
                }
                if (bArr[i16] == 1) {
                    cArr4[i16] = (char) (((cArr3[i16] * 2) + 1) - c6);
                } else {
                    cArr4[i16] = (char) ((cArr3[i16] * 2) - c6);
                }
                c6 = cArr4[i16];
                aFk1lSDK.getCurrencyIso4217Code = i16 + 1;
            }
            cArr3 = cArr4;
        }
        if (i13 > 0) {
            char[] cArr5 = new char[i11];
            System.arraycopy(cArr3, 0, cArr5, 0, i11);
            int i17 = i11 - i13;
            System.arraycopy(cArr5, 0, cArr3, i17, i13);
            System.arraycopy(cArr5, i13, cArr3, 0, i17);
        }
        if (z3) {
            char[] cArr6 = new char[i11];
            aFk1lSDK.getCurrencyIso4217Code = 0;
            while (true) {
                int i18 = aFk1lSDK.getCurrencyIso4217Code;
                if (i18 >= i11) {
                    break;
                }
                cArr6[i18] = cArr3[(i11 - i18) - 1];
                aFk1lSDK.getCurrencyIso4217Code = i18 + 1;
            }
            cArr3 = cArr6;
        }
        if (i12 > 0) {
            aFk1lSDK.getCurrencyIso4217Code = 0;
            while (true) {
                int i19 = aFk1lSDK.getCurrencyIso4217Code;
                if (i19 >= i11) {
                    break;
                }
                int i20 = $10 + 89;
                $11 = i20 % 128;
                if (i20 % 2 == 0) {
                    cArr3[i19] = (char) (cArr3[i19] >>> iArr[2]);
                    i7 = i19 << 1;
                } else {
                    cArr3[i19] = (char) (cArr3[i19] - iArr[2]);
                    i7 = i19 + 1;
                }
                aFk1lSDK.getCurrencyIso4217Code = i7;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private void afErrorLog(@NotNull Map<String, Object> map) {
        String monetizationNetwork;
        Intrinsics.checkNotNullParameter(map, "");
        if (AFAdRevenueData().getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
            AFKeystoreWrapper = (AFLogger + 83) % 128;
            try {
                this.getMonetizationNetwork.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                monetizationNetwork = this.component2.getMonetizationNetwork(this.getMonetizationNetwork);
                AFKeystoreWrapper = (AFLogger + 119) % 128;
            } catch (Throwable unused) {
                monetizationNetwork = null;
            }
            if (monetizationNetwork != null) {
                AFKeystoreWrapper = (AFLogger + 85) % 128;
                map.put("fb", monetizationNetwork);
            }
        }
    }

    private void afInfoLog(@NotNull Map<String, Object> map) {
        AFKeystoreWrapper = (AFLogger + 87) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        String revenue = this.toString.getRevenue();
        if (revenue != null) {
            int i7 = AFKeystoreWrapper + 71;
            AFLogger = i7 % 128;
            if (i7 % 2 == 0) {
                revenue.length();
                throw null;
            }
            if (revenue.length() != 0) {
                AFKeystoreWrapper = (AFLogger + 29) % 128;
                map.put("appsflyerKey", revenue);
                return;
            }
        }
        AFKeystoreWrapper = (AFLogger + 39) % 128;
    }

    private void areAllFieldsValid(@NotNull Map<String, Object> map) {
        AFLogger = (AFKeystoreWrapper + 71) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        String string = AFAdRevenueData().getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = AFAdRevenueData().getString(AppsFlyerProperties.ONELINK_VERSION);
        if (string != null) {
            AFKeystoreWrapper = (AFLogger + 7) % 128;
            map.put("onelink_id", string);
        }
        if (string2 != null) {
            map.put("onelink_ver", string2);
            AFLogger = (AFKeystoreWrapper + 33) % 128;
        }
        AFKeystoreWrapper = (AFLogger + 59) % 128;
    }

    private void component1(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFh1wSDK aFh1wSDK = this.component1;
        HashMap map2 = new HashMap(aFh1wSDK.getMonetizationNetwork);
        aFh1wSDK.getMonetizationNetwork.clear();
        aFh1wSDK.AFAdRevenueData.getMediationNetwork("gcd");
        Intrinsics.checkNotNullExpressionValue(map2, "");
        if (map2.isEmpty()) {
            return;
        }
        int i7 = AFKeystoreWrapper;
        int i10 = i7 + 13;
        AFLogger = i10 % 128;
        if (i10 % 2 == 0) {
            return;
        }
        AFLogger = (i7 + 47) % 128;
        Map<String, Object> monetizationNetwork = AFa1uSDK.getMonetizationNetwork(map);
        Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
        monetizationNetwork.put("gcd", map2);
        AFKeystoreWrapper = (AFLogger + 33) % 128;
    }

    private final void component2(Map<String, Object> map) {
        int i7 = AFLogger + 123;
        AFKeystoreWrapper = i7 % 128;
        if (i7 % 2 != 0) {
            map.put("btl", String.valueOf(this.getRevenue.getRevenue(this.getMonetizationNetwork).getRevenue));
            throw null;
        }
        AFg1xSDK.AFa1uSDK revenue = this.getRevenue.getRevenue(this.getMonetizationNetwork);
        float f10 = revenue.getRevenue;
        String str = revenue.getCurrencyIso4217Code;
        map.put("btl", String.valueOf(f10));
        if (str != null) {
            map.put("btch", str);
        }
        AFLogger = (AFKeystoreWrapper + 123) % 128;
    }

    private static /* synthetic */ Object component3(Object[] objArr) {
        AFg1tSDK aFg1tSDK = (AFg1tSDK) objArr[0];
        AFh1qSDK aFh1qSDK = (AFh1qSDK) objArr[1];
        int i7 = AFKeystoreWrapper + 29;
        AFLogger = i7 % 128;
        if (i7 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFh1qSDK, "");
            Map<String, Object> map = aFh1qSDK.getMediationNetwork;
            aFh1qSDK.getMonetizationNetwork();
            throw null;
        }
        Intrinsics.checkNotNullParameter(aFh1qSDK, "");
        Map<String, Object> map2 = aFh1qSDK.getMediationNetwork;
        if (!(!aFh1qSDK.getMonetizationNetwork())) {
            String str = aFh1qSDK.component2;
            AFc1fSDK aFc1fSDK = aFg1tSDK.copydefault;
            aFg1tSDK.getMediationNetwork(aFh1qSDK, str, aFc1fSDK.getRevenue, aFc1fSDK.getMonetizationNetwork);
        } else if (!(aFh1qSDK instanceof AFh1iSDK)) {
            Intrinsics.checkNotNullExpressionValue(map2, "");
            String str2 = aFh1qSDK.component1;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            aFg1tSDK.getMonetizationNetwork(map2, str2);
        }
        AFe1nSDK aFe1nSDK = AFe1nSDK.CONVERSION;
        AFe1nSDK aFe1nSDK2 = AFe1nSDK.LAUNCH;
        if (C1850q.h(aFe1nSDK, aFe1nSDK2, AFe1nSDK.INAPP).contains(aFh1qSDK.getCurrencyIso4217Code())) {
            int i10 = AFLogger + 85;
            AFKeystoreWrapper = i10 % 128;
            if (i10 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(map2, "");
                aFg1tSDK.equals(map2);
                throw null;
            }
            Intrinsics.checkNotNullExpressionValue(map2, "");
            aFg1tSDK.equals(map2);
        }
        if (C1850q.h(aFe1nSDK, aFe1nSDK2, AFe1nSDK.ATTR).contains(aFh1qSDK.getCurrencyIso4217Code())) {
            Intrinsics.checkNotNullExpressionValue(map2, "");
            aFg1tSDK.copy(map2);
        }
        Intrinsics.checkNotNullExpressionValue(map2, "");
        aFg1tSDK.afInfoLog(map2);
        registerClient(map2);
        aFg1tSDK.AFLogger(map2);
        aFg1tSDK.AFInAppEventParameterName(map2);
        getRevenue(new Object[]{aFg1tSDK, map2}, 1099148651, -1099148644, System.identityHashCode(aFg1tSDK));
        aFg1tSDK.getRevenue(map2, aFh1qSDK.getMonetizationNetwork());
        aFg1tSDK.w(map2);
        aFg1tSDK.i(map2);
        getCurrencyIso4217Code(map2, aFh1qSDK);
        map2.put("af_events_api", "1");
        return null;
    }

    private final void component4(Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, -1295054298, 1295054307, System.identityHashCode(this));
    }

    private final void copy(Map<String, Object> map) {
        int i7 = AFKeystoreWrapper;
        int i10 = i7 + 31;
        AFLogger = i10 % 128;
        if (i10 % 2 == 0) {
            String str = this.copydefault.copy;
            throw null;
        }
        String str2 = this.copydefault.copy;
        if (str2 != null) {
            int i11 = i7 + 101;
            AFLogger = i11 % 128;
            if (i11 % 2 != 0) {
                map.put("net_token", str2);
            } else {
                map.put("net_token", str2);
                throw null;
            }
        }
    }

    private final void copydefault(Map<String, Object> map) {
        AFKeystoreWrapper = (AFLogger + 107) % 128;
        if (AFg1oSDK.getRevenue(this.getMonetizationNetwork)) {
            int i7 = AFLogger + 101;
            AFKeystoreWrapper = i7 % 128;
            if (i7 % 2 == 0) {
                map.put("inst_app", Boolean.TRUE);
            } else {
                map.put("inst_app", Boolean.TRUE);
                throw null;
            }
        }
    }

    private void d(@NotNull Map<String, Object> map) {
        AFKeystoreWrapper = (AFLogger + 115) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("af_preinstalled", String.valueOf(this.component2.getCurrencyIso4217Code(this.getMonetizationNetwork)));
        int i7 = AFLogger + 61;
        AFKeystoreWrapper = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    private static void e(@NotNull Map<String, Object> map) {
        int i7 = AFKeystoreWrapper + 73;
        AFLogger = i7 % 128;
        try {
            if (i7 % 2 == 0) {
                Intrinsics.checkNotNullParameter(map, "");
                map.put("lang", Locale.getDefault().getDisplayLanguage());
                int i10 = 43 / 0;
            } else {
                Intrinsics.checkNotNullParameter(map, "");
                map.put("lang", Locale.getDefault().getDisplayLanguage());
            }
            AFLogger = (AFKeystoreWrapper + 69) % 128;
        } catch (Exception e10) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e10);
        }
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
        } catch (Exception e11) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e11);
        }
        try {
            map.put(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
        } catch (Exception e12) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e12);
        }
    }

    private void equals(@NotNull Map<String, Object> map) {
        AFKeystoreWrapper = (AFLogger + 89) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("is_pc", Boolean.valueOf(this.getMonetizationNetwork.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        AFKeystoreWrapper = (AFLogger + 85) % 128;
    }

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i7, int i10, int i11) {
        int i12 = (((~i7) | i10) * 160) + (i10 * (-159)) + (i7 * (-159));
        int i13 = ~i11;
        switch (((i7 | (~((~i10) | i13))) * 160) + (((~(i13 | i7)) | (~(i7 | i10))) * (-160)) + i12) {
            case 1:
                File file = (File) objArr[0];
                AFLogger = (AFKeystoreWrapper + 13) % 128;
                if (file == null || !file.exists()) {
                    return Boolean.TRUE;
                }
                AFLogger = (AFKeystoreWrapper + 41) % 128;
                return Boolean.FALSE;
            case 2:
                return getRevenue(objArr);
            case 3:
                return getCurrencyIso4217Code(objArr);
            case 4:
                return AFAdRevenueData(objArr);
            case 5:
                AFg1tSDK aFg1tSDK = (AFg1tSDK) objArr[0];
                AFLogger = (AFKeystoreWrapper + 105) % 128;
                Long lValueOf = Long.valueOf(aFg1tSDK.component2.n_().firstInstallTime);
                AFLogger = (AFKeystoreWrapper + 81) % 128;
                return lValueOf;
            case 6:
                AFKeystoreWrapper = (AFLogger + 49) % 128;
                long jCurrentTimeMillis = System.currentTimeMillis();
                AFLogger = (AFKeystoreWrapper + 9) % 128;
                return Long.valueOf(jCurrentTimeMillis);
            case 7:
                return getMediationNetwork(objArr);
            case 8:
                return getMonetizationNetwork(objArr);
            case 9:
                return areAllFieldsValid(objArr);
            case 10:
                return component3(objArr);
            case 11:
                return component1(objArr);
            case 12:
                return component2(objArr);
            default:
                AFg1tSDK aFg1tSDK2 = (AFg1tSDK) objArr[0];
                AFKeystoreWrapper = (AFLogger + 39) % 128;
                String string = aFg1tSDK2.AFAdRevenueData().getString(AppsFlyerProperties.AF_STORE_FROM_API);
                if (string != null) {
                    return string;
                }
                AFKeystoreWrapper = (AFLogger + 123) % 128;
                return (String) getRevenue(new Object[]{aFg1tSDK2, "AF_STORE"}, -538552495, 538552497, System.identityHashCode(aFg1tSDK2));
        }
    }

    private final void hashCode(Map<String, Object> map) {
        AFLogger = (AFKeystoreWrapper + 5) % 128;
        UiModeManager uiModeManager = (UiModeManager) this.getMonetizationNetwork.getSystemService(UiModeManager.class);
        if (uiModeManager != null) {
            int i7 = AFLogger + 83;
            AFKeystoreWrapper = i7 % 128;
            if (i7 % 2 != 0) {
                if (uiModeManager.getCurrentModeType() != 4) {
                    return;
                }
            } else if (uiModeManager.getCurrentModeType() != 4) {
                return;
            }
            map.put("tv", Boolean.TRUE);
        }
    }

    private void i(@NotNull Map<String, Object> map) {
        AFKeystoreWrapper = (AFLogger + 117) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        if (this.component3.AFAdRevenueData("is_stop_tracking_used")) {
            map.put("istu", String.valueOf(this.component3.getMonetizationNetwork("is_stop_tracking_used")));
        }
        int i7 = AFKeystoreWrapper + 51;
        AFLogger = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    private static void registerClient(@NotNull Map<String, Object> map) {
        Object currencyIso4217Code;
        String revenue;
        int i7 = AFLogger + 37;
        AFKeystoreWrapper = i7 % 128;
        if (i7 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            currencyIso4217Code = AFa1ySDK.getCurrencyIso4217Code();
            revenue = AFa1ySDK.getRevenue();
            int i10 = 44 / 0;
            if (currencyIso4217Code == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            currencyIso4217Code = AFa1ySDK.getCurrencyIso4217Code();
            revenue = AFa1ySDK.getRevenue();
            if (currencyIso4217Code == null) {
                return;
            }
        }
        AFKeystoreWrapper = (AFLogger + 27) % 128;
        if (revenue == null || Integer.parseInt(revenue) <= 0) {
            return;
        }
        map.put("reinstallCounter", revenue);
        map.put("originalAppsflyerId", currencyIso4217Code);
        AFLogger = (AFKeystoreWrapper + 51) % 128;
    }

    private void toString(@NotNull Map<String, Object> map) {
        long seconds;
        AFLogger = (AFKeystoreWrapper + 23) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        long revenue = this.component3.getRevenue("AppsFlyerTimePassedSincePrevLaunch", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.component3.getMonetizationNetwork("AppsFlyerTimePassedSincePrevLaunch", jCurrentTimeMillis);
        if (revenue > 0) {
            AFLogger = (AFKeystoreWrapper + 71) % 128;
            seconds = TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - revenue);
            AFKeystoreWrapper = (AFLogger + 41) % 128;
        } else {
            seconds = -1;
        }
        map.put("timepassedsincelastlaunch", String.valueOf(seconds));
    }

    private void unregisterClient(@NotNull Map<String, Object> map) {
        int i7 = AFKeystoreWrapper + 19;
        AFLogger = i7 % 128;
        if (i7 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            AFb1iSDK.l_(this.getMonetizationNetwork.getContentResolver());
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        AFb1lSDK aFb1lSDKL_ = AFb1iSDK.l_(this.getMonetizationNetwork.getContentResolver());
        if (aFb1lSDKL_ != null) {
            AFKeystoreWrapper = (AFLogger + 95) % 128;
            map.put("amazon_aid", aFb1lSDKL_.getRevenue);
            map.put("amazon_aid_limit", String.valueOf(aFb1lSDKL_.getMediationNetwork));
        }
    }

    private void w(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        boolean revenue = AFg1ySDK.getRevenue(this.getMonetizationNetwork);
        AFLogger.afDebugLog("didConfigureTokenRefreshService=" + revenue);
        if (!revenue) {
            int i7 = AFKeystoreWrapper + 3;
            AFLogger = i7 % 128;
            if (i7 % 2 == 0) {
                map.put("tokenRefreshConfigured", Boolean.FALSE);
                throw null;
            }
            map.put("tokenRefreshConfigured", Boolean.FALSE);
        }
        map.put("registeredUninstall", Boolean.valueOf(AFg1ySDK.getRevenue(this.component3)));
        int i10 = AFLogger + MsgEvent.MSG_EVENT_STOP_FOREGROUND;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 46 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getCurrencyIso4217Code(@NotNull AFh1qSDK aFh1qSDK) {
        boolean zC;
        AFd1bSDK aFd1bSDK;
        AFKeystoreWrapper = (AFLogger + 119) % 128;
        Intrinsics.checkNotNullParameter(aFh1qSDK, "");
        if (this.component2.getMonetizationNetwork()) {
            AFh1sSDK aFh1sSDK = this.component2.getRevenue.areAllFieldsValid;
            if (aFh1sSDK == null) {
                return;
            }
            String str = aFh1sSDK.getCurrencyIso4217Code;
            if (str != null && str.length() != 0) {
                int i7 = AFLogger + 15;
                AFKeystoreWrapper = i7 % 128;
                if (i7 % 2 != 0) {
                    aFh1qSDK.getMediationNetwork("gaidError", aFh1sSDK.getCurrencyIso4217Code);
                    throw null;
                }
                aFh1qSDK.getMediationNetwork("gaidError", aFh1sSDK.getCurrencyIso4217Code);
                AFKeystoreWrapper = (AFLogger + 69) % 128;
            }
            String str2 = aFh1sSDK.getMonetizationNetwork;
            if (str2 != null && aFh1sSDK.AFAdRevenueData != null) {
                aFh1qSDK.getMediationNetwork("advertiserId", str2);
                aFh1qSDK.getMediationNetwork("advertiserIdEnabled", String.valueOf(aFh1sSDK.AFAdRevenueData));
                aFh1qSDK.getMediationNetwork("isGaidWithGps", String.valueOf(aFh1sSDK.getRevenue));
            }
        } else {
            Map<String, Object> monetizationNetwork = AFa1uSDK.getMonetizationNetwork(aFh1qSDK.getMediationNetwork);
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            monetizationNetwork.put("ad_ids_disabled", Boolean.TRUE);
        }
        AFh1sSDK aFh1sSDK2 = this.component2.getRevenue.areAllFieldsValid;
        if (aFh1sSDK2 != null) {
            AFLogger = (AFKeystoreWrapper + 25) % 128;
            zC = Intrinsics.c(aFh1sSDK2.component2, Boolean.TRUE);
        } else {
            AFLogger = (AFKeystoreWrapper + 51) % 128;
            zC = false;
        }
        aFh1qSDK.getMediationNetwork("GAID_retry", String.valueOf(zC));
        if ((!C1850q.h(AFe1nSDK.CONVERSION, AFe1nSDK.LAUNCH).contains(aFh1qSDK.getCurrencyIso4217Code())) || (aFd1bSDK = this.copydefault.component4) == null) {
            return;
        }
        int i10 = AFKeystoreWrapper + 57;
        AFLogger = i10 % 128;
        if (i10 % 2 != 0) {
            Map<String, Object> monetizationNetwork2 = AFa1uSDK.getMonetizationNetwork(aFh1qSDK.getMediationNetwork);
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork2, "");
            monetizationNetwork2.put("fetchAdIdLatency", Long.valueOf(aFd1bSDK.getCurrencyIso4217Code));
        } else {
            Map<String, Object> monetizationNetwork3 = AFa1uSDK.getMonetizationNetwork(aFh1qSDK.getMediationNetwork);
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork3, "");
            monetizationNetwork3.put("fetchAdIdLatency", Long.valueOf(aFd1bSDK.getCurrencyIso4217Code));
            int i11 = 88 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getMediationNetwork(@NotNull Map<String, Object> map) {
        String[] strArr;
        Intrinsics.checkNotNullParameter(map, "");
        String string = AFAdRevenueData().getString(AppsFlyerProperties.APP_ID);
        if (string != null) {
            map.put(AppsFlyerProperties.APP_ID, string);
        }
        String string2 = AFAdRevenueData().getString(AppsFlyerProperties.CURRENCY_CODE);
        if (string2 != null) {
            if (string2.length() != 3) {
                StringBuilder sb2 = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                sb2.append(string2);
                sb2.append("' is not a legal value.");
                String string3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "");
                AFLogger.afWarnLog(string3);
            }
            map.put(FirebaseAnalytics.Param.CURRENCY, string2);
        }
        String string4 = AFAdRevenueData().getString(AppsFlyerProperties.IS_UPDATE);
        if (string4 != null) {
            map.put("isUpdate", string4);
            AFLogger = (AFKeystoreWrapper + 29) % 128;
        }
        String string5 = AFAdRevenueData().getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string5 != null) {
            int i7 = AFLogger + 75;
            AFKeystoreWrapper = i7 % 128;
            if (i7 % 2 != 0) {
                map.put("customData", string5);
                int i10 = 3 / 0;
            } else {
                map.put("customData", string5);
            }
        }
        String string6 = AFAdRevenueData().getString(AppsFlyerProperties.APP_USER_ID);
        if (string6 != null) {
            AFKeystoreWrapper = (AFLogger + 1) % 128;
            map.put("appUserId", string6);
        }
        String string7 = AFAdRevenueData().getString(AppsFlyerProperties.USER_EMAILS);
        if (string7 != null) {
            map.put("user_emails", string7);
        }
        AFb1tSDK aFb1tSDK = this.copydefault.getCurrencyIso4217Code;
        if (aFb1tSDK != null) {
            int i11 = AFLogger + 59;
            AFKeystoreWrapper = i11 % 128;
            if (i11 % 2 != 0) {
                strArr = aFb1tSDK.getCurrencyIso4217Code;
                int i12 = 1 / 0;
                if (strArr == null) {
                    return;
                }
            } else {
                strArr = aFb1tSDK.getCurrencyIso4217Code;
                if (strArr == null) {
                    return;
                }
            }
            map.put("sharing_filter", strArr);
        }
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getMonetizationNetwork(@NotNull AFh1qSDK aFh1qSDK) throws UnsupportedEncodingException {
        AFLogger = (AFKeystoreWrapper + 13) % 128;
        Intrinsics.checkNotNullParameter(aFh1qSDK, "");
        Map<String, Object> map = aFh1qSDK.getMediationNetwork;
        Intrinsics.checkNotNullExpressionValue(map, "");
        getMonetizationNetwork(map, aFh1qSDK.getMonetizationNetwork());
        component3(map);
        e(map);
        AFAdRevenueData(map);
        getCurrencyIso4217Code(map, this.copydefault.getMediationNetwork);
        unregisterClient(map);
        map.put("cell", G.g(new Pair("mcc", Integer.valueOf(this.getMonetizationNetwork.getResources().getConfiguration().mcc)), new Pair("mnc", Integer.valueOf(this.getMonetizationNetwork.getResources().getConfiguration().mnc))));
        map.put("sig", getMonetizationNetwork());
        map.put("last_boot_time", Long.valueOf(component3()));
        map.put("disk", (String) getRevenue(new Object[0], -410248620, 410248623, (int) System.currentTimeMillis()));
        AFKeystoreWrapper = (AFLogger + 81) % 128;
    }

    private final void AFAdRevenueData(Map<String, Object> map, int i7) {
        int i10 = AFKeystoreWrapper + 89;
        AFLogger = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                if (this.component2.n_().versionCode > this.component3.getMonetizationNetwork("versionCode", 0)) {
                    AFKeystoreWrapper = (AFLogger + 29) % 128;
                    this.component3.getCurrencyIso4217Code("versionCode", this.component2.n_().versionCode);
                }
            } else {
                if (this.component2.n_().versionCode > this.component3.getMonetizationNetwork("versionCode", 0)) {
                    AFKeystoreWrapper = (AFLogger + 29) % 128;
                    this.component3.getCurrencyIso4217Code("versionCode", this.component2.n_().versionCode);
                }
            }
            map.put("app_version_code", String.valueOf(this.component2.n_().versionCode));
            map.put("app_version_name", this.component2.n_().versionName);
            map.put("targetSDKver", Integer.valueOf(this.component2.getCurrencyIso4217Code.getRevenue.getApplicationInfo().targetSdkVersion));
            map.put("date1", getRevenue().format(new Date(((Long) getRevenue(new Object[]{this}, -218394523, 218394528, System.identityHashCode(this))).longValue())));
            map.put("date2", getRevenue().format(new Date(this.component2.n_().lastUpdateTime)));
            Object[] objArr = new Object[1];
            a(false, new int[]{0, 15, 58, 0}, "\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", objArr);
            String strIntern = ((String) objArr[0]).intern();
            SimpleDateFormat revenue = getRevenue();
            Intrinsics.checkNotNullExpressionValue(revenue, "");
            map.put(strIntern, getRevenue(revenue, i7));
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
        }
    }

    @NotNull
    private static String component4() {
        return (String) getRevenue(new Object[0], -410248620, 410248623, (int) System.currentTimeMillis());
    }

    @SuppressLint({"HardwareIds"})
    private final String copydefault() {
        return (String) getRevenue(new Object[]{this}, 1038436923, -1038436919, System.identityHashCode(this));
    }

    @Nullable
    private String copy() {
        return (String) getRevenue(new Object[]{this}, -2084865543, 2084865555, System.identityHashCode(this));
    }

    private final boolean AFInAppEventParameterName() {
        if (!AFAdRevenueData().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            AFLogger = (AFKeystoreWrapper + 49) % 128;
            if (!AFAdRevenueData().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                AFKeystoreWrapper = (AFLogger + 85) % 128;
                if (AFa1uSDK.AFAdRevenueData(this.getMonetizationNetwork)) {
                    return false;
                }
            }
        }
        int i7 = AFLogger + 85;
        AFKeystoreWrapper = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        throw null;
    }

    private static List<AFe1nSDK> equals() {
        AFKeystoreWrapper = (AFLogger + 69) % 128;
        List<AFe1nSDK> listH = C1850q.h(AFe1nSDK.CONVERSION, AFe1nSDK.LAUNCH, AFe1nSDK.INAPP, AFe1nSDK.MANUAL_PURCHASE_VALIDATION, AFe1nSDK.ARS_VALIDATE, AFe1nSDK.PURCHASE_VALIDATE, AFe1nSDK.ADREVENUE);
        int i7 = AFKeystoreWrapper + 29;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            return listH;
        }
        throw null;
    }

    private boolean areAllFieldsValid() {
        int i7 = AFKeystoreWrapper + 79;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            return Boolean.parseBoolean(this.component3.getCurrencyIso4217Code("sentSuccessfully", (String) null));
        }
        Boolean.parseBoolean(this.component3.getCurrencyIso4217Code("sentSuccessfully", (String) null));
        throw null;
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        AFg1tSDK aFg1tSDK = (AFg1tSDK) objArr[0];
        Map map = (Map) objArr[1];
        if (!aFg1tSDK.AFAdRevenueData().isOtherSdkStringDisabled()) {
            int i7 = AFKeystoreWrapper + 75;
            AFLogger = i7 % 128;
            if (i7 % 2 != 0) {
                map.put("batteryLevel", String.valueOf(aFg1tSDK.getRevenue.getRevenue(aFg1tSDK.getMonetizationNetwork).getRevenue));
            } else {
                map.put("batteryLevel", String.valueOf(aFg1tSDK.getRevenue.getRevenue(aFg1tSDK.getMonetizationNetwork).getRevenue));
                throw null;
            }
        }
        AFLogger = (AFKeystoreWrapper + 59) % 128;
        return null;
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        AFc1qSDK aFc1qSDK = (AFc1qSDK) objArr[0];
        String str = (String) objArr[1];
        int i7 = AFKeystoreWrapper + 107;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            String currencyIso4217Code = aFc1qSDK.getCurrencyIso4217Code("CACHED_CHANNEL", (String) null);
            if (currencyIso4217Code != null) {
                AFLogger = (AFKeystoreWrapper + 59) % 128;
                return currencyIso4217Code;
            }
            aFc1qSDK.getMonetizationNetwork("CACHED_CHANNEL", str);
            return str;
        }
        aFc1qSDK.getCurrencyIso4217Code("CACHED_CHANNEL", (String) null);
        throw null;
    }

    private final SimpleDateFormat getRevenue() {
        int i7 = AFLogger + 61;
        AFKeystoreWrapper = i7 % 128;
        if (i7 % 2 == 0) {
            return (SimpleDateFormat) this.registerClient.getValue();
        }
        int i10 = 99 / 0;
        return (SimpleDateFormat) this.registerClient.getValue();
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        AFg1tSDK aFg1tSDK = (AFg1tSDK) objArr[0];
        String string = aFg1tSDK.AFAdRevenueData().getString("preInstallName");
        if (string != null) {
            int i7 = AFKeystoreWrapper + 1;
            AFLogger = i7 % 128;
            if (i7 % 2 == 0) {
                int i10 = 32 / 0;
            }
            return string;
        }
        String currencyIso4217Code = aFg1tSDK.component3.getCurrencyIso4217Code("preInstallName", (String) null);
        if (currencyIso4217Code != null) {
            aFg1tSDK.AFAdRevenueData().set("preInstallName", currencyIso4217Code);
            return currencyIso4217Code;
        }
        String strAFInAppEventType = aFg1tSDK.AFInAppEventType();
        if (strAFInAppEventType == null) {
            int i11 = AFKeystoreWrapper + 71;
            AFLogger = i11 % 128;
            if (i11 % 2 != 0) {
                strAFInAppEventType = (String) getRevenue(new Object[]{aFg1tSDK, "AF_PRE_INSTALL_NAME"}, -538552495, 538552497, System.identityHashCode(aFg1tSDK));
            } else {
                throw null;
            }
        }
        if (strAFInAppEventType != null) {
            AFKeystoreWrapper = (AFLogger + 29) % 128;
            aFg1tSDK.component3.getMonetizationNetwork("preInstallName", strAFInAppEventType);
            aFg1tSDK.AFAdRevenueData().set("preInstallName", strAFInAppEventType);
        }
        return strAFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getRevenue(@NotNull AFh1qSDK aFh1qSDK) {
        AFLogger = (AFKeystoreWrapper + 51) % 128;
        Intrinsics.checkNotNullParameter(aFh1qSDK, "");
        Map<String, Object> map = aFh1qSDK.getMediationNetwork;
        Intrinsics.checkNotNullExpressionValue(map, "");
        getRevenue(map);
        Map<String, Object> map2 = aFh1qSDK.getMediationNetwork;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        AFAdRevenueData(map2, aFh1qSDK.areAllFieldsValid);
        Map<String, Object> map3 = aFh1qSDK.getMediationNetwork;
        Intrinsics.checkNotNullExpressionValue(map3, "");
        AFInAppEventType(map3);
        Map<String, Object> map4 = aFh1qSDK.getMediationNetwork;
        Intrinsics.checkNotNullExpressionValue(map4, "");
        d(map4);
        Map<String, Object> map5 = aFh1qSDK.getMediationNetwork;
        Intrinsics.checkNotNullExpressionValue(map5, "");
        afErrorLog(map5);
        Map<String, Object> map6 = aFh1qSDK.getMediationNetwork;
        Intrinsics.checkNotNullExpressionValue(map6, "");
        AFe1nSDK currencyIso4217Code = aFh1qSDK.getCurrencyIso4217Code();
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        getRevenue(map6, currencyIso4217Code);
        AFKeystoreWrapper = (AFLogger + 125) % 128;
    }

    private final String AFInAppEventType() {
        File monetizationNetwork = getMonetizationNetwork(getMediationNetwork("ro.appsflyer.preinstall.path"));
        if (getMediationNetwork(monetizationNetwork)) {
            monetizationNetwork = getMonetizationNetwork((String) getRevenue(new Object[]{this, "AF_PRE_INSTALL_PATH"}, -538552495, 538552497, System.identityHashCode(this)));
        }
        if (getMediationNetwork(monetizationNetwork)) {
            monetizationNetwork = getMonetizationNetwork("/data/local/tmp/pre_install.appsflyer");
            AFKeystoreWrapper = (AFLogger + 51) % 128;
        }
        if (getMediationNetwork(monetizationNetwork)) {
            AFLogger = (AFKeystoreWrapper + 27) % 128;
            monetizationNetwork = getMonetizationNetwork("/etc/pre_install.appsflyer");
        }
        if (!getMediationNetwork(monetizationNetwork)) {
            String packageName = this.getMonetizationNetwork.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "");
            return getCurrencyIso4217Code(monetizationNetwork, packageName);
        }
        int i7 = AFKeystoreWrapper + 57;
        AFLogger = i7 % 128;
        if (i7 % 2 == 0) {
            int i10 = 91 / 0;
        }
        return null;
    }

    @Nullable
    private String component1() {
        return (String) getRevenue(new Object[]{this}, 1736525094, -1736525086, System.identityHashCode(this));
    }

    @Nullable
    private String getMonetizationNetwork() throws NoSuchAlgorithmException, PackageManager.NameNotFoundException, CertificateException {
        int i7 = AFLogger + 109;
        AFKeystoreWrapper = i7 % 128;
        if (i7 % 2 == 0) {
            return AFj1gSDK.N_(this.getMonetizationNetwork.getApplicationContext().getPackageManager(), this.getMonetizationNetwork.getApplicationContext().getPackageName());
        }
        AFj1gSDK.N_(this.getMonetizationNetwork.getApplicationContext().getPackageManager(), this.getMonetizationNetwork.getApplicationContext().getPackageName());
        throw null;
    }

    @Nullable
    private String component2() {
        return (String) getRevenue(new Object[]{this}, 886343772, -886343772, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0066  */
    private void getMonetizationNetwork(@NotNull Map<String, Object> map, boolean z3) {
        Intrinsics.checkNotNullParameter(map, "");
        HashMap map2 = new HashMap();
        map2.put("cpu_abi", getMediationNetwork("ro.product.cpu.abi"));
        map2.put("cpu_abi2", getMediationNetwork("ro.product.cpu.abi2"));
        map2.put("arch", getMediationNetwork("os.arch"));
        map2.put("build_display_id", getMediationNetwork("ro.build.display.id"));
        if (z3) {
            int i7 = AFKeystoreWrapper + 71;
            AFLogger = i7 % 128;
            if (i7 % 2 == 0) {
                component2(map2);
                if (this.component2.AFAdRevenueData.getMonetizationNetwork("appsFlyerCount", 1) <= 2) {
                    map2.putAll(this.AFAdRevenueData.AFAdRevenueData());
                    AFKeystoreWrapper = (AFLogger + 71) % 128;
                }
            } else {
                component2(map2);
                if (this.component2.AFAdRevenueData.getMonetizationNetwork("appsFlyerCount", 0) <= 2) {
                    map2.putAll(this.AFAdRevenueData.AFAdRevenueData());
                    AFKeystoreWrapper = (AFLogger + 71) % 128;
                }
            }
        }
        map2.put("dim", this.areAllFieldsValid.getMediationNetwork(this.getMonetizationNetwork));
        map.put("deviceData", map2);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006d  */
    /* JADX WARN: Code duplicated, block: B:17:0x007a  */
    /* JADX WARN: Code duplicated, block: B:20:0x007f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0083  */
    /* JADX WARN: Code duplicated, block: B:23:0x0085  */
    /* JADX WARN: Code duplicated, block: B:25:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // com.appsflyer.internal.AFg1vSDK
    public final void AFAdRevenueData(@NotNull Map<String, Object> map) {
        AFi1vSDK revenue;
        int i7;
        boolean z3;
        String str;
        boolean z8;
        String str2;
        int i10;
        Intrinsics.checkNotNullParameter(map, "");
        AFi1sSDK aFi1sSDK = this.component4.getRevenue;
        if (aFi1sSDK != null) {
            AFKeystoreWrapper = (AFLogger + 57) % 128;
            revenue = aFi1sSDK.getRevenue();
            AFLogger = (AFKeystoreWrapper + 33) % 128;
        } else {
            revenue = null;
        }
        if (revenue != null) {
            int i11 = AFKeystoreWrapper + 5;
            AFLogger = i11 % 128;
            if (i11 % 2 == 0) {
                map.put("network", revenue.AFAdRevenueData);
                map.put("ivc", Boolean.valueOf(revenue.getMediationNetwork()));
                if (!AFAdRevenueData().getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
                    i7 = AFLogger + 85;
                    AFKeystoreWrapper = i7 % 128;
                    if (i7 % 2 != 0) {
                        z3 = true;
                    }
                }
                if (z3) {
                    str = revenue.getRevenue;
                    if (str != null) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    if (!z8) {
                        map.put("operator", str);
                    }
                    str2 = revenue.getMonetizationNetwork;
                    if (str2 == null) {
                        return;
                    }
                    i10 = AFLogger + 45;
                    AFKeystoreWrapper = i10 % 128;
                    if (i10 % 2 == 0) {
                        map.put("carrier", str2);
                    } else {
                        map.put("carrier", str2);
                        throw null;
                    }
                }
            }
            map.put("network", revenue.AFAdRevenueData);
            map.put("ivc", Boolean.valueOf(revenue.getMediationNetwork()));
            if (!AFAdRevenueData().getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
                i7 = AFLogger + 85;
                AFKeystoreWrapper = i7 % 128;
                if (i7 % 2 != 0) {
                    z3 = true;
                }
            }
            if (z3) {
                str = revenue.getRevenue;
                if (str != null) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (!z8) {
                    map.put("operator", str);
                }
                str2 = revenue.getMonetizationNetwork;
                if (str2 == null) {
                    return;
                }
                i10 = AFLogger + 45;
                AFKeystoreWrapper = i10 % 128;
                if (i10 % 2 == 0) {
                    map.put("carrier", str2);
                } else {
                    map.put("carrier", str2);
                    throw null;
                }
            }
            z3 = false;
            if (z3) {
                str = revenue.getRevenue;
                if (str != null) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (!z8) {
                    map.put("operator", str);
                }
                str2 = revenue.getMonetizationNetwork;
                if (str2 == null) {
                    return;
                }
                i10 = AFLogger + 45;
                AFKeystoreWrapper = i10 % 128;
                if (i10 % 2 == 0) {
                    map.put("carrier", str2);
                } else {
                    map.put("carrier", str2);
                    throw null;
                }
            }
        }
    }

    private final void getRevenue(Map<String, Object> map) {
        try {
            long jLongValue = ((Long) getRevenue(new Object[]{this}, -218394523, 218394528, System.identityHashCode(this))).longValue();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(jLongValue)));
            int i7 = AFKeystoreWrapper + HomeDialogState.PRIORITY_HIGHEST_111;
            AFLogger = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
        } catch (Exception e10) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e10);
        }
    }

    private void getMediationNetwork(@NotNull AFh1qSDK aFh1qSDK, @Nullable String str, @Nullable String str2, @Nullable AFb1uSDK aFb1uSDK) {
        AFKeystoreWrapper = (AFLogger + 45) % 128;
        Intrinsics.checkNotNullParameter(aFh1qSDK, "");
        Map<String, Object> map = aFh1qSDK.getMediationNetwork;
        if (aFh1qSDK.getCurrencyIso4217Code() == AFe1nSDK.CONVERSION) {
            AFKeystoreWrapper = (AFLogger + 33) % 128;
            Intrinsics.checkNotNullExpressionValue(map, "");
            getRevenue(new Object[]{this, map}, -1295054298, 1295054307, System.identityHashCode(this));
            hashCode(map);
            copydefault(map);
            AFa1ySDK.getMonetizationNetwork(this.copy, this.component2);
        }
        Intrinsics.checkNotNullExpressionValue(map, "");
        toString(map);
        areAllFieldsValid(map);
        component1((Map<String, ? extends Object>) map);
        AFAdRevenueData(map, str2);
        getRevenue(map, str);
        AFKeystoreWrapper(map);
        if (aFb1uSDK != null) {
            aFb1uSDK.getCurrencyIso4217Code(map);
            AFKeystoreWrapper = (AFLogger + 5) % 128;
        }
    }

    private static long component3() {
        int i7 = AFLogger + 37;
        AFKeystoreWrapper = i7 % 128;
        long jCurrentTimeMillis = i7 % 2 != 0 ? System.currentTimeMillis() & SystemClock.elapsedRealtime() : System.currentTimeMillis() - SystemClock.elapsedRealtime();
        int i10 = AFKeystoreWrapper + 65;
        AFLogger = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 34 / 0;
        }
        return jCurrentTimeMillis;
    }

    private static void component3(@NotNull Map<String, Object> map) throws UnsupportedEncodingException {
        AFKeystoreWrapper = (AFLogger + 123) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = new Object[1];
        a(false, new int[]{15, 5, 0, 0}, "\u0000\u0000\u0001\u0001\u0000", objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("device", Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        AFKeystoreWrapper = (AFLogger + 69) % 128;
    }

    private void getRevenue(@NotNull Map<String, Object> map, boolean z3) {
        AFLogger = (AFKeystoreWrapper + 125) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("platformextension", this.getMediationNetwork);
        if (!z3) {
            return;
        }
        int i7 = AFLogger + 37;
        AFKeystoreWrapper = i7 % 128;
        if (i7 % 2 != 0) {
            map.put("platform_extension_v2", this.getCurrencyIso4217Code.getCurrencyIso4217Code());
            int i10 = 62 / 0;
        } else {
            map.put("platform_extension_v2", this.getCurrencyIso4217Code.getCurrencyIso4217Code());
        }
        AFLogger = (AFKeystoreWrapper + 31) % 128;
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getMonetizationNetwork(@NotNull Map<String, Object> map, int i7, int i10) {
        boolean z3;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("counter", String.valueOf(i7));
        map.put("iaecounter", String.valueOf(i10));
        if (areAllFieldsValid()) {
            z3 = false;
        } else {
            AFKeystoreWrapper = (AFLogger + 109) % 128;
            z3 = true;
        }
        map.put("isFirstCall", String.valueOf(z3));
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double dPow = Math.pow(2.0d, 20.0d);
        String str = ((long) (availableBlocksLong / dPow)) + "/" + ((long) (blockCountLong / dPow));
        int i7 = AFKeystoreWrapper + 57;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @NotNull
    private String getRevenue(@NotNull SimpleDateFormat simpleDateFormat, int i7) {
        AFLogger = (AFKeystoreWrapper + 117) % 128;
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        String currencyIso4217Code = this.component3.getCurrencyIso4217Code("appsFlyerFirstInstall", (String) null);
        if (currencyIso4217Code == null) {
            if (i7 > 1) {
                currencyIso4217Code = "";
            } else {
                AFLogger.afDebugLog("AppsFlyer: first launch detected");
                currencyIso4217Code = simpleDateFormat.format(new Date());
            }
            this.component3.getMonetizationNetwork("appsFlyerFirstInstall", currencyIso4217Code);
        }
        AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, C0.G.o("AppsFlyer: first launch date: ", currencyIso4217Code), false, 4, null);
        Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
        int i10 = AFLogger + 61;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 == 0) {
            return currencyIso4217Code;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getMonetizationNetwork(@NotNull Map<String, Object> map) {
        Object objF;
        Intrinsics.checkNotNullParameter(map, "");
        String str = this.copydefault.AFAdRevenueData;
        if (str != null) {
            int i7 = AFLogger + 85;
            AFKeystoreWrapper = i7 % 128;
            if (i7 % 2 == 0) {
                if (map.get("af_deeplink") != null) {
                    AFKeystoreWrapper = (AFLogger + 23) % 128;
                    AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
                } else {
                    try {
                        p355xf.o oVar = q.f43977a;
                        JSONObject jSONObject = new JSONObject(str);
                        jSONObject.put("isPush", "true");
                        map.put("af_deeplink", jSONObject.toString());
                        objF = Unit.f38893a;
                    } catch (Throwable th) {
                        p355xf.o oVar2 = q.f43977a;
                        objF = androidx.camera.core.impl.utils.executor.g.f(th);
                    }
                    Throwable thA = q.a(objF);
                    if (thA != null) {
                        AFKeystoreWrapper = (AFLogger + 31) % 128;
                        AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.GENERAL, "Exception while trying to create JSONObject from pushPayload", thA, false, false, false, false, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP, null);
                    }
                }
            } else {
                map.get("af_deeplink");
                throw null;
            }
        } else {
            AFLogger = (AFKeystoreWrapper + 81) % 128;
        }
        this.copydefault.AFAdRevenueData = null;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFg1tSDK aFg1tSDK = (AFg1tSDK) objArr[0];
        Map map = (Map) objArr[1];
        AFKeystoreWrapper = (AFLogger + 87) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        String monetizationNetwork = AFb1mSDK.getMonetizationNetwork(aFg1tSDK.component2.AFAdRevenueData);
        if (monetizationNetwork == null) {
            int i7 = AFKeystoreWrapper + 53;
            AFLogger = i7 % 128;
            if (i7 % 2 != 0) {
                return null;
            }
            throw null;
        }
        AFKeystoreWrapper = (AFLogger + 13) % 128;
        map.put("uid", monetizationNetwork);
        boolean monetizationNetwork2 = aFg1tSDK.component2.AFAdRevenueData.getMonetizationNetwork("CUSTOM_INSTALL_ID_APPLIED");
        Intrinsics.checkNotNullExpressionValue(Boolean.valueOf(monetizationNetwork2), "");
        if (monetizationNetwork2) {
            map.put("custom_install_id", Boolean.TRUE);
        }
        int i10 = AFLogger + 7;
        AFKeystoreWrapper = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 42 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFg1tSDK aFg1tSDK = (AFg1tSDK) objArr[0];
        AFKeystoreWrapper = (AFLogger + 87) % 128;
        String currencyIso4217Code = aFg1tSDK.component3.getCurrencyIso4217Code("androidIdCached", (String) null);
        try {
            String string = Settings.Secure.getString(aFg1tSDK.getMonetizationNetwork.getContentResolver(), "android_id");
            if (string != null) {
                return string;
            }
        } catch (Exception e10) {
            AFLogger.afErrorLog(e10.getMessage(), e10);
        }
        if (currencyIso4217Code == null) {
            return null;
        }
        int i7 = AFLogger + 93;
        AFKeystoreWrapper = i7 % 128;
        if (i7 % 2 != 0) {
            AFLogger.afDebugLog("use cached AndroidId: " + currencyIso4217Code);
            int i10 = 85 / 0;
        } else {
            AFLogger.afDebugLog("use cached AndroidId: " + currencyIso4217Code);
        }
        return currencyIso4217Code;
    }

    private void getCurrencyIso4217Code(@NotNull Map<String, Object> map, @Nullable String str) {
        AFLogger = (AFKeystoreWrapper + 71) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        if (!AFAdRevenueData().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            String strAFAdRevenueData = this.toString.AFAdRevenueData(this.component3);
            if (strAFAdRevenueData != null && strAFAdRevenueData.length() != 0) {
                map.put("imei", strAFAdRevenueData);
            }
            String currencyIso4217Code = getCurrencyIso4217Code(str);
            if (currencyIso4217Code != null) {
                this.component3.getMonetizationNetwork("androidIdCached", currencyIso4217Code);
                map.put("android_id", currencyIso4217Code);
            } else {
                AFLogger.afInfoLog("Android ID was not collected.");
            }
            AFb1lSDK currencyIso4217Code2 = AFb1iSDK.getCurrencyIso4217Code(this.getMonetizationNetwork);
            if (currencyIso4217Code2 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Boolean bool = currencyIso4217Code2.getCurrencyIso4217Code;
                Intrinsics.checkNotNullExpressionValue(bool, "");
                linkedHashMap.put("isManual", bool);
                String str2 = currencyIso4217Code2.getRevenue;
                Intrinsics.checkNotNullExpressionValue(str2, "");
                linkedHashMap.put("val", str2);
                Boolean bool2 = currencyIso4217Code2.getMediationNetwork;
                if (bool2 != null) {
                    int i7 = AFLogger + 57;
                    AFKeystoreWrapper = i7 % 128;
                    if (i7 % 2 != 0) {
                        linkedHashMap.put("isLat", bool2);
                        int i10 = 78 / 0;
                    } else {
                        linkedHashMap.put("isLat", bool2);
                    }
                }
                map.put("oaid", linkedHashMap);
                return;
            }
            return;
        }
        map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
    }

    private static void AFAdRevenueData(@NotNull Map<String, Object> map, @Nullable String str) {
        int i7 = AFLogger + 73;
        AFKeystoreWrapper = i7 % 128;
        if (i7 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            if (str != null) {
                int i10 = AFLogger + HomeDialogState.PRIORITY_HIGHEST_111;
                AFKeystoreWrapper = i10 % 128;
                if (i10 % 2 == 0) {
                    map.put("phone", str);
                    return;
                } else {
                    map.put("phone", str);
                    throw null;
                }
            }
            return;
        }
        Intrinsics.checkNotNullParameter(map, "");
        throw null;
    }

    @SuppressLint({"PrivateApi"})
    @VisibleForTesting
    @Nullable
    private static String getMediationNetwork(@Nullable String str) {
        AFLogger = (AFKeystoreWrapper + 57) % 128;
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            Intrinsics.f(objInvoke, "");
            String str2 = (String) objInvoke;
            int i7 = AFLogger + 107;
            AFKeystoreWrapper = i7 % 128;
            if (i7 % 2 != 0) {
                int i10 = 71 / 0;
            }
            return str2;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    private void getRevenue(@NotNull Map<String, Object> map, @Nullable String str) {
        int i7 = AFKeystoreWrapper + 31;
        AFLogger = i7 % 128;
        if (i7 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            int i10 = 57 / 0;
            if (str != null) {
                if (str.length() != 0) {
                    AFLogger = (AFKeystoreWrapper + 115) % 128;
                    map.put(Constants.REFERRER, str);
                    AFLogger = (AFKeystoreWrapper + 5) % 128;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            if (str != null) {
                if (str.length() != 0) {
                    AFLogger = (AFKeystoreWrapper + 115) % 128;
                    map.put(Constants.REFERRER, str);
                    AFLogger = (AFKeystoreWrapper + 5) % 128;
                }
            }
        }
        String currencyIso4217Code = this.component3.getCurrencyIso4217Code("extraReferrers", (String) null);
        if (currencyIso4217Code != null) {
            AFKeystoreWrapper = (AFLogger + 57) % 128;
            map.put("extraReferrers", currencyIso4217Code);
        }
        String referrer = AFAdRevenueData().getReferrer(this.component3);
        if (!(referrer == null || referrer.length() == 0)) {
            AFLogger = (AFKeystoreWrapper + 9) % 128;
            if (map.get(Constants.REFERRER) == null) {
                map.put(Constants.REFERRER, referrer);
            }
        }
        AFLogger = (AFKeystoreWrapper + 51) % 128;
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void AFAdRevenueData(@NotNull AFh1qSDK aFh1qSDK) {
        getRevenue(new Object[]{this, aFh1qSDK}, -1062743321, 1062743331, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038 A[Catch: Exception -> 0x0028, PHI: r0
      0x0038: PHI (r0v5 java.lang.String) = (r0v4 java.lang.String), (r0v9 java.lang.String) binds: [B:16:0x0036, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {Exception -> 0x0028, blocks: (B:5:0x0019, B:7:0x0021, B:19:0x0058, B:17:0x0038, B:15:0x0030), top: B:25:0x0011 }] */
    private void getMonetizationNetwork(@NotNull Map<String, Object> map, @NotNull String str) {
        String currencyIso4217Code;
        int i7 = AFKeystoreWrapper + 95;
        AFLogger = i7 % 128;
        try {
            if (i7 % 2 == 0) {
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(str, "");
                currencyIso4217Code = this.component3.getCurrencyIso4217Code("prev_event_name", (String) null);
                int i10 = 22 / 0;
                if (currencyIso4217Code != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("prev_event_timestamp", this.component3.getRevenue("prev_event_timestamp", -1L));
                    jSONObject.put("prev_event_name", currencyIso4217Code);
                    map.put("prev_event", jSONObject);
                    AFKeystoreWrapper = (AFLogger + HomeDialogState.PRIORITY_HIGHEST_111) % 128;
                }
            } else {
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(str, "");
                currencyIso4217Code = this.component3.getCurrencyIso4217Code("prev_event_name", (String) null);
                if (currencyIso4217Code != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("prev_event_timestamp", this.component3.getRevenue("prev_event_timestamp", -1L));
                    jSONObject2.put("prev_event_name", currencyIso4217Code);
                    map.put("prev_event", jSONObject2);
                    AFKeystoreWrapper = (AFLogger + HomeDialogState.PRIORITY_HIGHEST_111) % 128;
                }
            }
            this.component3.getMonetizationNetwork("prev_event_name", str);
            this.component3.getMonetizationNetwork("prev_event_timestamp", System.currentTimeMillis());
        } catch (Exception e10) {
            AFLogger.afErrorLog("Error while processing previous event.", e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getMediationNetwork(@NotNull AFh1qSDK aFh1qSDK) {
        boolean z3;
        Intrinsics.checkNotNullParameter(aFh1qSDK, "");
        Map<String, Object> map = aFh1qSDK.getMediationNetwork;
        Intrinsics.checkNotNullExpressionValue(map, "");
        map.put("open_referrer", aFh1qSDK.getRevenue);
        String str = aFh1qSDK.equals;
        if (str != null) {
            AFKeystoreWrapper = (AFLogger + 63) % 128;
            if (StringsKt.F(str)) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = true;
        }
        if (!(!z3)) {
            return;
        }
        int i7 = AFKeystoreWrapper + 107;
        AFLogger = i7 % 128;
        if (i7 % 2 == 0) {
            map.put("af_web_referrer", aFh1qSDK.equals);
            int i10 = 60 / 0;
        } else {
            map.put("af_web_referrer", aFh1qSDK.equals);
        }
    }

    private final String getCurrencyIso4217Code(String str) {
        AFKeystoreWrapper = (AFLogger + 123) % 128;
        if (AFAdRevenueData().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false)) {
            AFKeystoreWrapper = (AFLogger + 121) % 128;
            if (str != null && str.length() != 0) {
                AFLogger = (AFKeystoreWrapper + 17) % 128;
            } else {
                if (!(!AFInAppEventParameterName())) {
                    return (String) getRevenue(new Object[]{this}, 1038436923, -1038436919, System.identityHashCode(this));
                }
                return null;
            }
        }
        if (str == null) {
            return null;
        }
        AFLogger = (AFKeystoreWrapper + 119) % 128;
        return str;
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getRevenue(@NotNull Map<String, Object> map, @NotNull AFe1nSDK aFe1nSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFe1nSDK, "");
        if (!equals().contains(aFe1nSDK)) {
            int i7 = AFKeystoreWrapper + 45;
            AFLogger = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (this.copydefault.getMonetizationNetwork()) {
            AFKeystoreWrapper = (AFLogger + 119) % 128;
            map.put("app_set_id", F.b(new Pair("app_set_id_disabled", Boolean.TRUE)));
            if (this.copydefault.toString != null) {
                AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set Id was collected, but will not be included in the payload.To prevent collection entirely, call disableAppSetId() before initializing the SDK.", false, 4, null);
                return;
            } else {
                AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "App Set ID collection is disabled. Skipping inclusion in the event payload.", false, 4, null);
                return;
            }
        }
        AFb1hSDK aFb1hSDK = this.copydefault.toString;
        if (aFb1hSDK != null) {
            map.put("app_set_id", G.g(new Pair("scope", Integer.valueOf(aFb1hSDK.AFAdRevenueData)), new Pair("id", aFb1hSDK.getMonetizationNetwork)));
        }
    }

    private static boolean getMediationNetwork(File file) {
        return ((Boolean) getRevenue(new Object[]{file}, 286991539, -286991538, (int) System.currentTimeMillis())).booleanValue();
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFg1tSDK aFg1tSDK = (AFg1tSDK) objArr[0];
        String currencyIso4217Code = aFg1tSDK.component3.getCurrencyIso4217Code("INSTALL_STORE", (String) null);
        if (currencyIso4217Code != null) {
            int i7 = AFKeystoreWrapper + 41;
            AFLogger = i7 % 128;
            if (i7 % 2 != 0) {
                return currencyIso4217Code;
            }
            throw null;
        }
        String str = (String) getRevenue(new Object[]{aFg1tSDK}, 886343772, -886343772, System.identityHashCode(aFg1tSDK));
        if (str != null) {
            int i10 = AFKeystoreWrapper + 125;
            AFLogger = i10 % 128;
            if (i10 % 2 != 0) {
                aFg1tSDK.component3.getMonetizationNetwork("INSTALL_STORE", str);
            } else {
                aFg1tSDK.component3.getMonetizationNetwork("INSTALL_STORE", str);
                throw null;
            }
        }
        AFKeystoreWrapper = (AFLogger + 31) % 128;
        return str;
    }

    private static String getMediationNetwork(AFc1qSDK aFc1qSDK, String str) {
        return (String) getRevenue(new Object[]{aFc1qSDK, str}, -1931286689, 1931286700, (int) System.currentTimeMillis());
    }

    @NotNull
    private Long getMediationNetwork() {
        return (Long) getRevenue(new Object[]{this}, -218394523, 218394528, System.identityHashCode(this));
    }

    private static String getCurrencyIso4217Code(File file, String str) {
        InputStreamReader inputStreamReader;
        int i7;
        try {
            try {
                if (file == null) {
                    AFLogger = (AFKeystoreWrapper + 79) % 128;
                    return null;
                }
                try {
                    Properties properties = new Properties();
                    inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
                    try {
                        properties.load(inputStreamReader);
                        AFLogger.afInfoLog("Found PreInstall property!");
                        String property = properties.getProperty(str);
                        try {
                            inputStreamReader.close();
                            AFKeystoreWrapper = (AFLogger + 49) % 128;
                            return property;
                        } catch (Throwable th) {
                            AFLogger.afErrorLog(th.getMessage(), th);
                            return property;
                        }
                    } catch (FileNotFoundException unused) {
                        AFLogger.afDebugLog("PreInstall file wasn't found: " + file.getAbsolutePath());
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                            return null;
                        }
                        i7 = AFKeystoreWrapper + 117;
                        AFLogger = i7 % 128;
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        AFLogger.afErrorLog(th.getMessage(), th);
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                            return null;
                        }
                        i7 = AFKeystoreWrapper + 113;
                        AFLogger = i7 % 128;
                        return null;
                    }
                } catch (FileNotFoundException unused2) {
                    inputStreamReader = null;
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamReader = null;
                }
            } catch (Throwable th4) {
                AFLogger.afErrorLog(th4.getMessage(), th4);
            }
        } catch (Throwable th5) {
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th6) {
                    AFLogger.afErrorLog(th6.getMessage(), th6);
                }
            }
            throw th5;
        }
        return null;
    }

    private static File getMonetizationNetwork(String str) {
        int i7 = (AFLogger + 39) % 128;
        AFKeystoreWrapper = i7;
        if (str == null) {
            return null;
        }
        AFLogger = (i7 + 45) % 128;
        try {
            boolean z3 = false;
            if (StringsKt.V(str).toString().length() > 0) {
                int i10 = AFLogger + 55;
                AFKeystoreWrapper = i10 % 128;
                if (i10 % 2 == 0) {
                    z3 = true;
                }
            }
            if (z3) {
                return new File(StringsKt.V(str).toString());
            }
            return null;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        String monetizationNetwork;
        AFg1tSDK aFg1tSDK = (AFg1tSDK) objArr[0];
        String str = (String) objArr[1];
        int i7 = AFLogger + 3;
        AFKeystoreWrapper = i7 % 128;
        if (i7 % 2 != 0) {
            monetizationNetwork = aFg1tSDK.component2.getMonetizationNetwork(str);
            int i10 = 77 / 0;
        } else {
            monetizationNetwork = aFg1tSDK.component2.getMonetizationNetwork(str);
        }
        int i11 = AFLogger + 99;
        AFKeystoreWrapper = i11 % 128;
        if (i11 % 2 == 0) {
            return monetizationNetwork;
        }
        throw null;
    }

    private static void getCurrencyIso4217Code(@NotNull Map<String, Object> map, @NotNull AFh1qSDK aFh1qSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFh1qSDK, "");
        String str = aFh1qSDK.component1;
        if (str != null) {
            map.put("eventName", str);
            Map map2 = aFh1qSDK.getCurrencyIso4217Code;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put("eventValue", new JSONObject(map2).toString());
        }
    }

    private final String getRevenue(String str) {
        return (String) getRevenue(new Object[]{this, str}, -538552495, 538552497, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final void getCurrencyIso4217Code(@NotNull Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, 1099148651, -1099148644, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1vSDK
    public final long getCurrencyIso4217Code() {
        return ((Long) getRevenue(new Object[]{this}, 1390365507, -1390365501, System.identityHashCode(this))).longValue();
    }
}
