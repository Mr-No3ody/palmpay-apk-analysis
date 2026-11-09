package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.imageutils.JfifUtil;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.aidl.MsgEvent;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.cashier.FlexiOneClickOpenReq;
import face.security.device.api.FaceSecCode;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1kSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    public static String AFAdRevenueData = null;
    private static char[] areAllFieldsValid = null;
    private static int component4 = 0;
    private static int copydefault = 1;

    @VisibleForTesting
    private static String getMonetizationNetwork;
    private final AFf1jSDK component1;
    private final AFe1vSDK component2;
    private final AFj1iSDK component3;
    private final AFd1lSDK getCurrencyIso4217Code;
    private final AFc1pSDK getMediationNetwork;
    private final AppsFlyerProperties getRevenue;

    static {
        AFAdRevenueData();
        AFAdRevenueData = "https://%sgcdsdk.%s/install_data/v5.0/";
        getMonetizationNetwork = "https://%sonelink.%s/shortlink-sdk/v2";
        copydefault = (component4 + 73) % 128;
    }

    public AFd1kSDK(AFd1lSDK aFd1lSDK, AFc1pSDK aFc1pSDK, AppsFlyerProperties appsFlyerProperties, AFe1vSDK aFe1vSDK, AFj1iSDK aFj1iSDK, AFf1jSDK aFf1jSDK) {
        this.getCurrencyIso4217Code = aFd1lSDK;
        this.getMediationNetwork = aFc1pSDK;
        this.getRevenue = appsFlyerProperties;
        this.component2 = aFe1vSDK;
        this.component3 = aFj1iSDK;
        this.component1 = aFf1jSDK;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    private static void a(boolean z3, int[] iArr, String str, Object[] objArr) throws UnsupportedEncodingException {
        int length;
        char[] cArr;
        String str2 = str;
        int i7 = $10 + 25;
        $11 = i7 % 128;
        Object bytes = str2;
        if (i7 % 2 == 0) {
            int i10 = 66 / 0;
            if (str2 != null) {
                bytes = str2;
                bytes = str2.getBytes("ISO-8859-1");
            }
        } else if (str2 != null) {
            bytes = str2;
            bytes = str2.getBytes("ISO-8859-1");
        }
        bytes = str2;
        byte[] bArr = (byte[]) bytes;
        AFk1lSDK aFk1lSDK = new AFk1lSDK();
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        char[] cArr2 = areAllFieldsValid;
        if (cArr2 != null) {
            int i15 = $10 + 59;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            for (int i16 = 0; i16 < length; i16++) {
                cArr[i16] = (char) (((long) cArr2[i16]) ^ (-6320700084807177384L));
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i12];
        System.arraycopy(cArr2, i11, cArr3, 0, i12);
        if (bArr != null) {
            char[] cArr4 = new char[i12];
            aFk1lSDK.getCurrencyIso4217Code = 0;
            char c6 = 0;
            while (true) {
                int i17 = aFk1lSDK.getCurrencyIso4217Code;
                if (i17 >= i12) {
                    break;
                }
                $10 = ($11 + 53) % 128;
                if (bArr[i17] == 1) {
                    cArr4[i17] = (char) (((cArr3[i17] * 2) + 1) - c6);
                } else {
                    cArr4[i17] = (char) ((cArr3[i17] * 2) - c6);
                }
                c6 = cArr4[i17];
                aFk1lSDK.getCurrencyIso4217Code = i17 + 1;
            }
            cArr3 = cArr4;
        }
        if (i14 > 0) {
            $11 = ($10 + 7) % 128;
            char[] cArr5 = new char[i12];
            System.arraycopy(cArr3, 0, cArr5, 0, i12);
            int i18 = i12 - i14;
            System.arraycopy(cArr5, 0, cArr3, i18, i14);
            System.arraycopy(cArr5, i14, cArr3, 0, i18);
        }
        if (z3) {
            char[] cArr6 = new char[i12];
            aFk1lSDK.getCurrencyIso4217Code = 0;
            while (true) {
                int i19 = aFk1lSDK.getCurrencyIso4217Code;
                if (i19 >= i12) {
                    break;
                }
                cArr6[i19] = cArr3[(i12 - i19) - 1];
                aFk1lSDK.getCurrencyIso4217Code = i19 + 1;
            }
            cArr3 = cArr6;
        }
        if (i13 > 0) {
            $10 = ($11 + 55) % 128;
            aFk1lSDK.getCurrencyIso4217Code = 0;
            while (true) {
                int i20 = aFk1lSDK.getCurrencyIso4217Code;
                if (i20 >= i12) {
                    break;
                }
                $11 = ($10 + 69) % 128;
                cArr3[i20] = (char) (cArr3[i20] - iArr[2]);
                aFk1lSDK.getCurrencyIso4217Code = i20 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i7, int i10, int i11) {
        int i12 = (i10 * JfifUtil.MARKER_SOFn) + (i7 * (-381));
        int i13 = ~i7;
        int i14 = (((~(i10 | (~i11))) | (~(i13 | i10))) * 191) + ((i7 | (~(i10 | i11))) * 191) + (i13 * (-191)) + i12;
        if (i14 == 1) {
            return getRevenue(objArr);
        }
        if (i14 == 2) {
            return getCurrencyIso4217Code(objArr);
        }
        AFd1kSDK aFd1kSDK = (AFd1kSDK) objArr[0];
        component4 = (copydefault + 19) % 128;
        if (aFd1kSDK.getRevenue.getBoolean(AppsFlyerProperties.HTTP_CACHE, true)) {
            return Boolean.FALSE;
        }
        copydefault = (component4 + 65) % 128;
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007c  */
    @Nullable
    public final AFd1hSDK<String> AFAdRevenueData(Map<String, Object> map, String str, @Nullable String str2) {
        String strAFAdRevenueData;
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1jSDK.unregisterClient;
            Object method = map2.get(2107132520);
            if (method == null) {
                method = ((Class) AFa1jSDK.getMonetizationNetwork(36 - (ViewConfiguration.getFadingEdgeLength() >> 16), 199 - Color.alpha(0), (char) (Color.red(0) + 15950))).getMethod("getMediationNetwork", Map.class, String.class);
                map2.put(2107132520, method);
            }
            byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
            int i7 = copydefault + 45;
            int i10 = i7 % 128;
            component4 = i10;
            if (i7 % 2 != 0) {
                throw null;
            }
            AFj1iSDK aFj1iSDK = this.component3;
            if (str2 != null) {
                int i11 = i10 + 67;
                copydefault = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 17 / 0;
                    if (str2.length() != 0) {
                        if (new Regex("4.?(\\d+)?.?(\\d+)").b(str2) && !new Regex("3.?(\\d+)?.?(\\d+)").b(str2)) {
                            component4 = (copydefault + 37) % 128;
                            strAFAdRevenueData = aFj1iSDK.getMonetizationNetwork.AFAdRevenueData("https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=");
                            component4 = (copydefault + 77) % 128;
                        }
                    }
                } else if (str2.length() != 0) {
                    if (new Regex("4.?(\\d+)?.?(\\d+)").b(str2)) {
                    }
                }
                strAFAdRevenueData = aFj1iSDK.getMonetizationNetwork.AFAdRevenueData("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
            } else {
                strAFAdRevenueData = aFj1iSDK.getMonetizationNetwork.AFAdRevenueData("https://%sars.%s/api/v2/android/validate_subscription?app_id=");
            }
            return AFAdRevenueData(new AFd1aSDK(aFj1iSDK.getMonetizationNetwork(aFj1iSDK.AFAdRevenueData(strAFAdRevenueData), false), bArr, "POST", Collections.EMPTY_MAP, true), new AFd1cSDK());
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th2, false, false);
                return null;
            }
        }
    }

    @Nullable
    public final AFd1hSDK<String> getCurrencyIso4217Code(Map<String, Object> map, String str) {
        byte[] bArr;
        int i7 = component4 + 19;
        copydefault = i7 % 128;
        try {
            if (i7 % 2 == 0) {
                try {
                    Object[] objArr = {map, str};
                    Map map2 = AFa1jSDK.unregisterClient;
                    Object method = map2.get(2107132520);
                    if (method == null) {
                        method = ((Class) AFa1jSDK.getMonetizationNetwork(AndroidCharacter.getMirror('0') - '\f', (ViewConfiguration.getPressedStateDuration() >> 16) + 199, (char) (15951 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))).getMethod("getMediationNetwork", Map.class, String.class);
                        map2.put(2107132520, method);
                    }
                    bArr = (byte[]) ((Method) method).invoke(null, objArr);
                    int i10 = 5 / 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                try {
                    Object[] objArr2 = {map, str};
                    Map map3 = AFa1jSDK.unregisterClient;
                    Object method2 = map3.get(2107132520);
                    if (method2 == null) {
                        method2 = ((Class) AFa1jSDK.getMonetizationNetwork(36 - View.combineMeasuredStates(0, 0), 198 - MotionEvent.axisFromString(""), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 15950))).getMethod("getMediationNetwork", Map.class, String.class);
                        map3.put(2107132520, method2);
                    }
                    bArr = (byte[]) ((Method) method2).invoke(null, objArr2);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            byte[] bArr2 = bArr;
            AFj1iSDK aFj1iSDK = this.component3;
            return AFAdRevenueData(new AFd1aSDK(aFj1iSDK.AFAdRevenueData(aFj1iSDK.getMonetizationNetwork.AFAdRevenueData("https://%svalidate-and-log.%s/api/v4.0/android/one_time_purchase/validateAndLog?app_id=")), bArr2, "POST", Collections.EMPTY_MAP, true), new AFd1cSDK());
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th3, false, false);
            return null;
        }
    }

    @Nullable
    public final AFd1hSDK<String> getMediationNetwork(Map<String, Object> map, String str, @Nullable String str2) {
        try {
            Object[] objArr = {map, str};
            boolean z3 = false;
            Map map2 = AFa1jSDK.unregisterClient;
            Object method = map2.get(2107132520);
            if (method == null) {
                method = ((Class) AFa1jSDK.getMonetizationNetwork(36 - Gravity.getAbsoluteGravity(0, 0), TextUtils.indexOf("", "", 0) + 199, (char) (TextUtils.getOffsetBefore("", 0) + 15950))).getMethod("getMediationNetwork", Map.class, String.class);
                map2.put(2107132520, method);
            }
            byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
            copydefault = (component4 + 97) % 128;
            AFj1iSDK aFj1iSDK = this.component3;
            if (str2 == null || str2.length() == 0 || new Regex("4.?(\\d+)?.?(\\d+)").b(str2) || new Regex("3.?(\\d+)?.?(\\d+)").b(str2)) {
                copydefault = (component4 + 99) % 128;
                z3 = true;
            } else {
                copydefault = (component4 + 107) % 128;
            }
            return AFAdRevenueData(new AFd1aSDK(aFj1iSDK.getMonetizationNetwork(aFj1iSDK.AFAdRevenueData(!z3 ? aFj1iSDK.getMonetizationNetwork.AFAdRevenueData("https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=") : aFj1iSDK.getMonetizationNetwork.AFAdRevenueData("https://%sviap.%s/api/v1/android/validate_purchase?app_id=")), false), bArr, "POST", Collections.EMPTY_MAP, true), new AFd1cSDK());
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(AFg1cSDK.ENGAGEMENT, "AFFinalizer: reflection init failed.", th2, false, false);
                return null;
            }
        }
    }

    @Nullable
    public final AFd1hSDK<String> getMonetizationNetwork(Map<String, Object> map, String str) {
        byte[] bArr;
        int i7 = component4 + 99;
        copydefault = i7 % 128;
        try {
            if (i7 % 2 == 0) {
                try {
                    Object[] objArr = {map, str};
                    Map map2 = AFa1jSDK.unregisterClient;
                    Object method = map2.get(2107132520);
                    if (method == null) {
                        method = ((Class) AFa1jSDK.getMonetizationNetwork(36 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 200, (char) (15950 - (Process.myTid() >> 22)))).getMethod("getMediationNetwork", Map.class, String.class);
                        map2.put(2107132520, method);
                    }
                    bArr = (byte[]) ((Method) method).invoke(null, objArr);
                    int i10 = 35 / 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                try {
                    Object[] objArr2 = {map, str};
                    Map map3 = AFa1jSDK.unregisterClient;
                    Object method2 = map3.get(2107132520);
                    if (method2 == null) {
                        method2 = ((Class) AFa1jSDK.getMonetizationNetwork((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 36, 198 - Process.getGidForName(""), (char) (15950 - View.MeasureSpec.getMode(0)))).getMethod("getMediationNetwork", Map.class, String.class);
                        map3.put(2107132520, method2);
                    }
                    bArr = (byte[]) ((Method) method2).invoke(null, objArr2);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            byte[] bArr2 = bArr;
            AFj1iSDK aFj1iSDK = this.component3;
            AFd1hSDK<String> aFd1hSDKAFAdRevenueData = AFAdRevenueData(new AFd1aSDK(aFj1iSDK.AFAdRevenueData(aFj1iSDK.getMonetizationNetwork.AFAdRevenueData("https://%svalidate-and-log.%s/api/v4.0/android/subscription/validateAndLog?app_id=")), bArr2, "POST", Collections.EMPTY_MAP, true), new AFd1cSDK());
            int i11 = copydefault + HomeDialogState.PRIORITY_HIGHEST_111;
            component4 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 20 / 0;
            }
            return aFd1hSDKAFAdRevenueData;
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th3, false, false);
            return null;
        }
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFd1kSDK aFd1kSDK = (AFd1kSDK) objArr[0];
        Map map = (Map) objArr[1];
        String str = (String) objArr[2];
        copydefault = (component4 + 85) % 128;
        try {
            try {
                Object[] objArr2 = {map, str};
                Map map2 = AFa1jSDK.unregisterClient;
                Object method = map2.get(2107132520);
                if (method == null) {
                    method = ((Class) AFa1jSDK.getMonetizationNetwork(TextUtils.indexOf("", "", 0, 0) + 36, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 199, (char) (15949 - TextUtils.lastIndexOf("", '0')))).getMethod("getMediationNetwork", Map.class, String.class);
                    map2.put(2107132520, method);
                }
                byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr2);
                if (bArr == null) {
                    AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: failed to create bytes.", new IllegalArgumentException("Failed to create bytes from proxyData, bytes are null"), false, false);
                    return null;
                }
                AFd1nSDK aFd1nSDK = new AFd1nSDK(aFd1kSDK.getMediationNetwork, bArr);
                component4 = (copydefault + 109) % 128;
                return aFd1nSDK;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", th2, false, false);
            return null;
        }
    }

    @NonNull
    public final AFd1hSDK<AFa1pSDK> getRevenue(AFa1qSDK aFa1qSDK) {
        AFd1hSDK<AFa1pSDK> aFd1hSDKAFAdRevenueData = AFAdRevenueData(new AFd1aSDK(aFa1qSDK.component4, AFg1mSDK.getMediationNetwork((Map<String, ?>) aFa1qSDK.getMediationNetwork).toString().getBytes(Charset.defaultCharset()), "POST", Collections.EMPTY_MAP, aFa1qSDK.getMediationNetwork()), new AFa1rSDK());
        copydefault = (component4 + 47) % 128;
        return aFd1hSDKAFAdRevenueData;
    }

    @NonNull
    public final AFd1hSDK<AFi1zSDK> getCurrencyIso4217Code(boolean z3, boolean z8, @NonNull String str, int i7) {
        String str2;
        component4 = (copydefault + 79) % 128;
        AFe1vSDK aFe1vSDK = this.component2;
        Intrinsics.checkNotNullParameter(str, "");
        String str3 = !z3 ? AFe1vSDK.getRevenue : AFe1vSDK.getCurrencyIso4217Code;
        if (!z8) {
            component4 = (copydefault + MsgEvent.MSG_EVENT_STOP_FOREGROUND) % 128;
            str2 = "";
        } else {
            str2 = "stg";
        }
        AFd1aSDK aFd1aSDK = new AFd1aSDK(com.airbnb.lottie.model.layer.d.n(new Object[]{AFe1vSDK.getMediationNetwork() ? (String) aFe1vSDK.getCurrencyIso4217Code.getValue() : "", str2, aFe1vSDK.AFAdRevenueData(), str}, 4, str3, ""), "GET");
        aFd1aSDK.component1 = 1500;
        return AFAdRevenueData(aFd1aSDK, new AFd1dSDK());
    }

    public final AFd1hSDK<String> getMonetizationNetwork(@NonNull String str) {
        AFd1aSDK aFd1aSDK = new AFd1aSDK(str, null, "GET", Collections.EMPTY_MAP, false);
        aFd1aSDK.component1 = FaceSecCode.SC_SUCCESS;
        aFd1aSDK.getMediationNetwork = false;
        AFd1hSDK<String> aFd1hSDKAFAdRevenueData = AFAdRevenueData(aFd1aSDK, new AFd1cSDK());
        copydefault = (component4 + 63) % 128;
        return aFd1hSDKAFAdRevenueData;
    }

    private boolean getRevenue() {
        return ((Boolean) getRevenue(new Object[]{this}, 976105, -976105, System.identityHashCode(this))).booleanValue();
    }

    public final AFd1hSDK<Map<String, Object>> AFAdRevenueData(String str, String str2) {
        AFd1hSDK<Map<String, Object>> aFd1hSDKAFAdRevenueData = AFAdRevenueData(AFd1gSDK.getRevenue(this.getMediationNetwork.getCurrencyIso4217Code.getRevenue.getPackageName(), AFb1mSDK.getMonetizationNetwork(this.getMediationNetwork.AFAdRevenueData), str, str2), new AFd1jSDK());
        component4 = (copydefault + 59) % 128;
        return aFd1hSDKAFAdRevenueData;
    }

    public final AFd1hSDK<Map<String, String>> getMonetizationNetwork(@NonNull String str, @NonNull String str2, @NonNull UUID uuid, @NonNull String str3) {
        return (AFd1hSDK) getRevenue(new Object[]{this, str, str2, uuid, str3}, 1355965567, -1355965565, System.identityHashCode(this));
    }

    public final AFd1hSDK<String> AFAdRevenueData(AFh1kSDK aFh1kSDK) {
        AFd1hSDK<String> aFd1hSDKAFAdRevenueData = AFAdRevenueData(new AFd1aSDK(aFh1kSDK.component4, aFh1kSDK.getRevenue(), "POST", aFh1kSDK.getMonetizationNetwork, true), new AFd1cSDK());
        int i7 = component4 + 61;
        copydefault = i7 % 128;
        if (i7 % 2 == 0) {
            int i10 = 37 / 0;
        }
        return aFd1hSDKAFAdRevenueData;
    }

    public final AFd1hSDK<String> AFAdRevenueData(@NonNull String str, @NonNull Map<String, String> map, @Nullable String str2, @NonNull UUID uuid, @NonNull String str3) throws UnsupportedEncodingException {
        String string = uuid.toString();
        HashMap map2 = new HashMap();
        map2.put("ttl", FlexiOneClickOpenReq.Device.DEFAULT_STRING_VALUE);
        map2.put("uuid", string);
        map2.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, map);
        map2.put(com.adjust.sdk.Constants.REFERRER_API_META, getCurrencyIso4217Code());
        if (str2 != null) {
            component4 = (copydefault + 101) % 128;
            map2.put("brand_domain", str2);
        }
        String string2 = AFg1mSDK.getMediationNetwork(map2).toString();
        HashMap map3 = new HashMap();
        Object[] objArr = new Object[1];
        a(true, new int[]{0, 12, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", objArr);
        map3.put(((String) objArr[0]).intern(), AFAdRevenueData(str3, string, "POST", string2));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(getMonetizationNetwork, AppsFlyerLib.getInstance().getHostPrefix(), AFa1uSDK.getMonetizationNetwork().getHostName()));
        sb2.append("/");
        sb2.append(str);
        AFd1hSDK<String> currencyIso4217Code = getCurrencyIso4217Code(new AFd1aSDK(sb2.toString(), string2.getBytes(Charset.defaultCharset()), "POST", map3, false), (AFe1xSDK) new AFd1cSDK(), true);
        int i7 = component4 + 55;
        copydefault = i7 % 128;
        if (i7 % 2 == 0) {
            int i10 = 69 / 0;
        }
        return currencyIso4217Code;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f1  */
    @Nullable
    public final AFd1hSDK<String> getCurrencyIso4217Code(AFh1qSDK aFh1qSDK, String str, AFc1eSDK aFc1eSDK) {
        String strAFAdRevenueData;
        String strAFAdRevenueData2;
        try {
            try {
                Object[] objArr = {aFh1qSDK, str, aFc1eSDK};
                Map map = AFa1jSDK.unregisterClient;
                Object method = map.get(-1752798292);
                if (method == null) {
                    method = ((Class) AFa1jSDK.getMonetizationNetwork((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 35, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 199, (char) (TextUtils.indexOf("", "", 0, 0) + 15950))).getMethod("getMediationNetwork", AFh1qSDK.class, String.class, AFc1eSDK.class);
                    map.put(-1752798292, method);
                }
                byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
                AFAdRevenueData(aFh1qSDK, bArr);
                copydefault = (component4 + 53) % 128;
                AFj1iSDK aFj1iSDK = this.component3;
                Intrinsics.checkNotNullParameter(aFh1qSDK, "");
                boolean monetizationNetwork = aFh1qSDK.getMonetizationNetwork();
                boolean z3 = aFh1qSDK instanceof AFh1oSDK;
                boolean z8 = aFh1qSDK instanceof AFh1jSDK;
                boolean z10 = aFh1qSDK instanceof AFh1rSDK;
                boolean z11 = aFh1qSDK instanceof AFh1hSDK;
                boolean z12 = aFh1qSDK instanceof AFh1gSDK;
                boolean z13 = aFh1qSDK instanceof AFf1bSDK;
                if (aFh1qSDK instanceof AFh1eSDK) {
                    strAFAdRevenueData = aFj1iSDK.getMonetizationNetwork.AFAdRevenueData("https://%spia.%s/api/v1.0/pia-android-event?app_id=");
                } else {
                    if (!z10) {
                        int i7 = component4 + 19;
                        int i10 = i7 % 128;
                        copydefault = i10;
                        if (i7 % 2 == 0) {
                            throw null;
                        }
                        if (z8) {
                            strAFAdRevenueData = aFj1iSDK.getMonetizationNetwork.AFAdRevenueData(AFj1iSDK.getMediationNetwork);
                        } else if (z3) {
                            strAFAdRevenueData = aFj1iSDK.getMonetizationNetwork.AFAdRevenueData(AFj1iSDK.AFAdRevenueData);
                        } else if (z11) {
                            strAFAdRevenueData = aFj1iSDK.getMonetizationNetwork.AFAdRevenueData(AFj1iSDK.component3);
                        } else if (z12) {
                            strAFAdRevenueData2 = aFj1iSDK.getMonetizationNetwork.AFAdRevenueData("https://%ssdk-services.%s/validate-android-signature");
                        } else if (z13) {
                            component4 = (i10 + 85) % 128;
                            strAFAdRevenueData = aFj1iSDK.getMonetizationNetwork.AFAdRevenueData(AFj1iSDK.component2);
                        } else if (monetizationNetwork) {
                            if (aFh1qSDK.areAllFieldsValid < 2) {
                                strAFAdRevenueData = aFj1iSDK.getMonetizationNetwork.AFAdRevenueData(AFj1iSDK.getRevenue);
                            } else {
                                strAFAdRevenueData = aFj1iSDK.getMonetizationNetwork.AFAdRevenueData(AFj1iSDK.areAllFieldsValid);
                            }
                        } else {
                            strAFAdRevenueData = aFj1iSDK.getMonetizationNetwork.AFAdRevenueData(AFj1iSDK.component4);
                        }
                    } else {
                        strAFAdRevenueData = aFj1iSDK.getMonetizationNetwork.AFAdRevenueData(AFj1iSDK.getMediationNetwork);
                    }
                    return AFAdRevenueData(new AFd1aSDK(strAFAdRevenueData2, bArr, "POST", aFh1qSDK.getMonetizationNetwork, aFh1qSDK.getMediationNetwork()), new AFd1cSDK());
                }
                strAFAdRevenueData2 = aFj1iSDK.getMonetizationNetwork(AFj1iSDK.getRevenue(aFj1iSDK.AFAdRevenueData(strAFAdRevenueData), z3), z13);
                return AFAdRevenueData(new AFd1aSDK(strAFAdRevenueData2, bArr, "POST", aFh1qSDK.getMonetizationNetwork, aFh1qSDK.getMediationNetwork()), new AFd1cSDK());
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", th2, false, false);
            return null;
        }
    }

    private <T> AFd1hSDK<T> AFAdRevenueData(AFd1aSDK aFd1aSDK, AFe1xSDK<T> aFe1xSDK) {
        copydefault = (component4 + 123) % 128;
        AFd1hSDK<T> currencyIso4217Code = getCurrencyIso4217Code(aFd1aSDK, aFe1xSDK, getRevenue());
        int i7 = component4 + 41;
        copydefault = i7 % 128;
        if (i7 % 2 != 0) {
            return currencyIso4217Code;
        }
        throw null;
    }

    private static String AFAdRevenueData(String str, String str2, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, TransType.TRANS_TYPE_SPEND_SAVE_DEPOSIT);
        String strJoin = TextUtils.join("\u2063", (String[]) arrayList.toArray(new String[0]));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        sb2.append(TransType.TRANS_TYPE_SPEND_SAVE_DEPOSIT);
        String revenue = AFj1dSDK.getRevenue(strJoin, sb2.toString());
        int i7 = copydefault + 11;
        component4 = i7 % 128;
        if (i7 % 2 == 0) {
            return revenue;
        }
        throw null;
    }

    private void AFAdRevenueData(AFh1qSDK aFh1qSDK, byte[] bArr) {
        int i7 = copydefault + 1;
        component4 = i7 % 128;
        if (i7 % 2 == 0) {
            boolean mediationNetwork = this.getMediationNetwork.getMediationNetwork("com.appsflyer.security.enable");
            if (aFh1qSDK.AFAdRevenueData()) {
                component4 = (copydefault + 117) % 128;
                if (mediationNetwork && AFf1jSDK.getMonetizationNetwork(aFh1qSDK, this.getMediationNetwork)) {
                    int i10 = copydefault + 81;
                    component4 = i10 % 128;
                    if (i10 % 2 != 0) {
                        AFf1jSDK.getMediationNetwork(aFh1qSDK, bArr);
                        int i11 = 48 / 0;
                        return;
                    } else {
                        AFf1jSDK.getMediationNetwork(aFh1qSDK, bArr);
                        return;
                    }
                }
                return;
            }
            return;
        }
        this.getMediationNetwork.getMediationNetwork("com.appsflyer.security.enable");
        aFh1qSDK.AFAdRevenueData();
        throw null;
    }

    public static void AFAdRevenueData() {
        areAllFieldsValid = new char[]{27498, 27443, 27435, 27436, 27442, 27455, 27442, 27440, 27398, 27416, 27409, 27403, 27497, 27451, 27441, 27455, 27441};
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) throws UnsupportedEncodingException {
        AFd1kSDK aFd1kSDK = (AFd1kSDK) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        UUID uuid = (UUID) objArr[3];
        String str3 = (String) objArr[4];
        String string = uuid.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(getMonetizationNetwork, AppsFlyerLib.getInstance().getHostPrefix(), ((AFa1uSDK) AFa1uSDK.getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis())).getHostName()));
        sb2.append("/");
        sb2.append(str);
        sb2.append("?id=");
        sb2.append(str2);
        String string2 = sb2.toString();
        Map<String, Object> currencyIso4217Code = aFd1kSDK.getCurrencyIso4217Code();
        String strValueOf = String.valueOf(currencyIso4217Code.get("build_number"));
        HashMap map = new HashMap();
        map.put("Af-UUID", uuid.toString());
        map.put("Af-Meta-Sdk-Ver", strValueOf);
        map.put("Af-Meta-Counter", String.valueOf(currencyIso4217Code.get("counter")));
        map.put("Af-Meta-Model", String.valueOf(currencyIso4217Code.get("model")));
        map.put("Af-Meta-Platform", String.valueOf(currencyIso4217Code.get("platformextension")));
        map.put("Af-Meta-System-Version", String.valueOf(currencyIso4217Code.get("sdk")));
        Object[] objArr2 = new Object[1];
        a(true, new int[]{0, 12, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", objArr2);
        map.put(((String) objArr2[0]).intern(), AFAdRevenueData(str3, string, "GET", string, str, str2, strValueOf));
        AFd1hSDK aFd1hSDKAFAdRevenueData = aFd1kSDK.AFAdRevenueData(new AFd1aSDK(string2, null, "GET", map, false), new AFd1eSDK());
        int i7 = component4 + 1;
        copydefault = i7 % 128;
        if (i7 % 2 != 0) {
            return aFd1hSDKAFAdRevenueData;
        }
        throw null;
    }

    @Nullable
    public final AFd1nSDK AFAdRevenueData(Map<String, Object> map, String str) {
        return (AFd1nSDK) getRevenue(new Object[]{this, map, str}, -1515957273, 1515957274, System.identityHashCode(this));
    }

    @VisibleForTesting
    private Map<String, Object> getCurrencyIso4217Code() throws UnsupportedEncodingException {
        HashMap map = new HashMap();
        map.put("build_number", "6.18.1");
        map.put("counter", Integer.valueOf(this.getMediationNetwork.AFAdRevenueData.getMonetizationNetwork("appsFlyerCount", 0)));
        map.put("model", Build.MODEL);
        Object[] objArr = new Object[1];
        a(true, new int[]{12, 5, 0, 1}, "\u0000\u0000\u0000\u0001\u0001", objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        map.put("app_version_name", this.getMediationNetwork.n_().versionName);
        map.put("app_id", this.getMediationNetwork.getCurrencyIso4217Code.getRevenue.getPackageName());
        map.put("platformextension", new AFa1tSDK().AFAdRevenueData());
        int i7 = component4 + 1;
        copydefault = i7 % 128;
        if (i7 % 2 != 0) {
            return map;
        }
        throw null;
    }

    private <T> AFd1hSDK<T> getCurrencyIso4217Code(AFd1aSDK aFd1aSDK, AFe1xSDK<T> aFe1xSDK, boolean z3) {
        aFd1aSDK.getRevenue = z3;
        AFd1lSDK aFd1lSDK = this.getCurrencyIso4217Code;
        AFd1hSDK<T> aFd1hSDK = new AFd1hSDK<>(aFd1aSDK, aFd1lSDK.getMonetizationNetwork, aFd1lSDK.getMediationNetwork, aFe1xSDK);
        int i7 = component4 + 39;
        copydefault = i7 % 128;
        if (i7 % 2 != 0) {
            return aFd1hSDK;
        }
        throw null;
    }
}
