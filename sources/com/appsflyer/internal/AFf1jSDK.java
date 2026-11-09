package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.telephony.TelephonyManager;
import android.text.AndroidCharacter;
import android.util.Base64;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.transsnet.palmpay.aidl.MsgEvent;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1jSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int areAllFieldsValid = 0;
    private static int component2 = 1;
    private static int component4 = 103677031;
    private volatile String AFAdRevenueData;

    @Nullable
    private volatile String component3;
    private long getCurrencyIso4217Code;
    Map<String, Object> getMediationNetwork;

    @NonNull
    private final AFc1eSDK getRevenue;
    private boolean getMonetizationNetwork = false;
    private volatile boolean component1 = false;

    public AFf1jSDK(@NonNull AFc1eSDK aFc1eSDK) {
        this.getRevenue = aFc1eSDK;
    }

    private static void a(int i7, int i10, boolean z3, int i11, String str, Object[] objArr) {
        char[] cArr;
        Object charArray = str;
        if (str != null) {
            $10 = ($11 + 63) % 128;
            charArray = str.toCharArray();
        }
        char[] cArr2 = (char[]) charArray;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        char[] cArr3 = new char[i7];
        aFk1oSDK.getCurrencyIso4217Code = 0;
        while (true) {
            int i12 = aFk1oSDK.getCurrencyIso4217Code;
            if (i12 >= i7) {
                break;
            }
            $10 = ($11 + 93) % 128;
            char c6 = cArr2[i12];
            aFk1oSDK.AFAdRevenueData = c6;
            char c10 = (char) (c6 + i11);
            cArr3[i12] = c10;
            cArr3[i12] = (char) (c10 - ((int) (((long) component4) ^ (-1047448725599945728L))));
            aFk1oSDK.getCurrencyIso4217Code = i12 + 1;
        }
        if (i10 > 0) {
            aFk1oSDK.getMonetizationNetwork = i10;
            char[] cArr4 = new char[i7];
            System.arraycopy(cArr3, 0, cArr4, 0, i7);
            int i13 = aFk1oSDK.getMonetizationNetwork;
            System.arraycopy(cArr4, 0, cArr3, i7 - i13, i13);
            int i14 = aFk1oSDK.getMonetizationNetwork;
            System.arraycopy(cArr4, i14, cArr3, 0, i7 - i14);
        }
        if (z3) {
            int i15 = $10 + 73;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                cArr = new char[i7];
                aFk1oSDK.getCurrencyIso4217Code = 1;
            } else {
                cArr = new char[i7];
                aFk1oSDK.getCurrencyIso4217Code = 0;
            }
            while (true) {
                int i16 = aFk1oSDK.getCurrencyIso4217Code;
                if (i16 >= i7) {
                    break;
                }
                int i17 = $11 + 75;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    cArr[i16] = cArr3[(i7 - i16) << 1];
                } else {
                    cArr[i16] = cArr3[(i7 - i16) - 1];
                    i16++;
                }
                aFk1oSDK.getCurrencyIso4217Code = i16;
            }
            cArr3 = cArr;
        }
        objArr[0] = new String(cArr3);
    }

    @NonNull
    @VisibleForTesting
    private static AFf1iSDK areAllFieldsValid() {
        AFf1iSDK aFf1iSDK = new AFf1iSDK();
        component2 = (areAllFieldsValid + 3) % 128;
        return aFf1iSDK;
    }

    @VisibleForTesting
    private long component3() {
        int i7 = areAllFieldsValid + 121;
        component2 = i7 % 128;
        if (i7 % 2 != 0) {
            return this.getCurrencyIso4217Code;
        }
        throw null;
    }

    private boolean component4() {
        int i7 = areAllFieldsValid + 27;
        component2 = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
        Map<String, Object> map = this.getMediationNetwork;
        if (map == null || map.isEmpty()) {
            component2 = (areAllFieldsValid + 105) % 128;
            return false;
        }
        areAllFieldsValid = (component2 + HomeDialogState.PRIORITY_HIGHEST_111) % 128;
        return true;
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i7, int i10, int i11) {
        int i12 = ((i7 | i11) * (-859)) + (i10 * (-858)) + (i7 * 860);
        int i13 = ~i11;
        int i14 = ~(i13 | i7);
        int i15 = ~i7;
        int i16 = ~i10;
        int i17 = (((~(i7 | i16)) | (~(i16 | i13))) * 859) + (((~(i11 | i15 | i16)) | i14) * 859) + i12;
        if (i17 == 1) {
            return getMediationNetwork(objArr);
        }
        if (i17 == 2) {
            return getMonetizationNetwork(objArr);
        }
        if (i17 != 3) {
            return AFAdRevenueData(objArr);
        }
        AFc1iSDK aFc1iSDK = new AFc1iSDK((Map) objArr[1], ((AFf1jSDK) objArr[0]).getRevenue.getRevenue);
        component2 = (areAllFieldsValid + 39) % 128;
        return aFc1iSDK;
    }

    public final void AFAdRevenueData(boolean z3) {
        int i7 = areAllFieldsValid + 25;
        component2 = i7 % 128;
        if (i7 % 2 != 0) {
            this.component1 = z3;
        } else {
            this.component1 = z3;
            throw null;
        }
    }

    public final void component2() {
        areAllFieldsValid = (component2 + 87) % 128;
        this.getMediationNetwork.put("ttr", Long.valueOf(System.currentTimeMillis() - this.getCurrencyIso4217Code));
        this.getMediationNetwork.put("lvl_timestamp", Long.valueOf(component3()));
        int i7 = areAllFieldsValid + 81;
        component2 = i7 % 128;
        if (i7 % 2 == 0) {
            int i10 = 6 / 0;
        }
    }

    public final void getMediationNetwork(String str) {
        areAllFieldsValid = (component2 + MsgEvent.MSG_EVENT_STOP_FOREGROUND) % 128;
        this.AFAdRevenueData = str;
        areAllFieldsValid = (component2 + 119) % 128;
    }

    public final void getMonetizationNetwork(@NonNull String str) {
        int i7 = areAllFieldsValid + 61;
        component2 = i7 % 128;
        if (i7 % 2 != 0) {
            this.component3 = str;
        } else {
            this.component3 = str;
            throw null;
        }
    }

    @Nullable
    public final String getRevenue() {
        areAllFieldsValid = (component2 + HomeDialogState.PRIORITY_HIGHEST_111) % 128;
        String str = this.AFAdRevenueData;
        int i7 = component2 + 25;
        areAllFieldsValid = i7 % 128;
        if (i7 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static boolean getRevenue(Context context) {
        areAllFieldsValid = (component2 + 85) % 128;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            return true;
        }
        int i7 = areAllFieldsValid + 93;
        component2 = i7 % 128;
        if (i7 % 2 == 0) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                return true;
            }
        } else if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            return true;
        }
        int i10 = component2 + 65;
        areAllFieldsValid = i10 % 128;
        if (i10 % 2 == 0) {
            return !AFa1uSDK.AFAdRevenueData(context);
        }
        AFa1uSDK.AFAdRevenueData(context);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003b A[PHI: r1
      0x003b: PHI (r1v12 android.content.Context) = (r1v11 android.content.Context), (r1v26 android.content.Context) binds: [B:12:0x0039, B:9:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0061  */
    /* JADX WARN: Code duplicated, block: B:18:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0065 A[Catch: Exception -> 0x0071, InvocationTargetException -> 0x0073, TRY_LEAVE, TryCatch #2 {InvocationTargetException -> 0x0073, Exception -> 0x0071, blocks: (B:15:0x0043, B:19:0x0065), top: B:51:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:51:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Nullable
    public final String AFAdRevenueData(AFc1qSDK aFc1qSDK) {
        String str;
        Context context;
        boolean z3 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, false);
        String currencyIso4217Code = aFc1qSDK.getCurrencyIso4217Code("imeiCached", (String) null);
        if (z3 && AFk1ySDK.getMediationNetwork(this.component3)) {
            int i7 = component2 + 41;
            areAllFieldsValid = i7 % 128;
            if (i7 % 2 != 0) {
                context = this.getRevenue.getRevenue;
                int i10 = 59 / 0;
                if (context != null) {
                    if (!(!getRevenue(context))) {
                        try {
                            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                            str = (String) telephonyManager.getClass().getMethod("getDeviceId", new Class[0]).invoke(telephonyManager, new Object[0]);
                            if (str == null) {
                                if (currencyIso4217Code != null) {
                                    AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(currencyIso4217Code)));
                                } else {
                                    currencyIso4217Code = null;
                                }
                                str = currencyIso4217Code;
                            }
                        } catch (InvocationTargetException e10) {
                            if (currencyIso4217Code != null) {
                                AFLogger.afDebugLog("use cached IMEI: ".concat(currencyIso4217Code));
                            } else {
                                currencyIso4217Code = null;
                            }
                            StringBuilder sb2 = new StringBuilder("WARNING: Can't collect IMEI because of missing permissions: ");
                            sb2.append(e10.getMessage());
                            AFLogger.afErrorLog(sb2.toString(), e10);
                        } catch (Exception e11) {
                            if (currencyIso4217Code != null) {
                                AFLogger.afDebugLog("use cached IMEI: ".concat(currencyIso4217Code));
                            } else {
                                currencyIso4217Code = null;
                            }
                            StringBuilder sb3 = new StringBuilder("WARNING: Can't collect IMEI: other reason: ");
                            sb3.append(e11.getMessage());
                            AFLogger.afErrorLog(sb3.toString(), e11);
                            str = currencyIso4217Code;
                            areAllFieldsValid = (component2 + 37) % 128;
                        }
                    }
                    areAllFieldsValid = (component2 + 37) % 128;
                }
            } else {
                context = this.getRevenue.getRevenue;
                if (context != null) {
                    if (!(!getRevenue(context))) {
                        TelephonyManager telephonyManager2 = (TelephonyManager) context.getSystemService("phone");
                        str = (String) telephonyManager2.getClass().getMethod("getDeviceId", new Class[0]).invoke(telephonyManager2, new Object[0]);
                        if (str == null) {
                            if (currencyIso4217Code != null) {
                                AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(currencyIso4217Code)));
                            } else {
                                currencyIso4217Code = null;
                            }
                            str = currencyIso4217Code;
                        }
                    }
                    areAllFieldsValid = (component2 + 37) % 128;
                }
            }
            str = null;
            areAllFieldsValid = (component2 + 37) % 128;
        } else {
            str = this.component3 != null ? this.component3 : null;
        }
        if (!AFk1ySDK.getMediationNetwork(str)) {
            int i11 = component2 + 57;
            areAllFieldsValid = i11 % 128;
            if (i11 % 2 != 0) {
                aFc1qSDK.getMonetizationNetwork("imeiCached", str);
                throw null;
            }
            aFc1qSDK.getMonetizationNetwork("imeiCached", str);
            return str;
        }
        AFLogger.afInfoLog("IMEI was not collected.");
        return null;
    }

    public final boolean getMediationNetwork() {
        areAllFieldsValid = (component2 + 3) % 128;
        boolean z3 = this.component1;
        areAllFieldsValid = (component2 + 69) % 128;
        return z3;
    }

    public final Map<String, Object> getMonetizationNetwork(Map<String, Object> map) {
        try {
            try {
                Object[] objArr = {map, this.getRevenue.getRevenue};
                Map map2 = AFa1jSDK.unregisterClient;
                Object declaredConstructor = map2.get(-1917118413);
                if (declaredConstructor == null) {
                    declaredConstructor = ((Class) AFa1jSDK.getMonetizationNetwork(37 - (ViewConfiguration.getKeyRepeatDelay() >> 16), ImageFormat.getBitsPerPixel(0) + 126, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getDeclaredConstructor(Map.class, Context.class);
                    map2.put(-1917118413, declaredConstructor);
                }
                Map<String, Object> map3 = (Map) ((Constructor) declaredConstructor).newInstance(objArr);
                int i7 = component2 + 115;
                areAllFieldsValid = i7 % 128;
                if (i7 % 2 == 0) {
                    return map3;
                }
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.ANTI_FRAUD, "AFCksmV3: reflection init failed", th2, false, false, true);
            return new HashMap();
        }
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFf1jSDK aFf1jSDK = (AFf1jSDK) objArr[0];
        areAllFieldsValid = (component2 + 85) % 128;
        String str = aFf1jSDK.component3;
        int i7 = areAllFieldsValid + 75;
        component2 = i7 % 128;
        if (i7 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static void getMediationNetwork(AFh1qSDK aFh1qSDK, byte[] bArr) {
        try {
            new AFb1sSDK(aFh1qSDK, bArr).afInfoLog();
            int i7 = areAllFieldsValid + 45;
            component2 = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
        } catch (Exception e10) {
            AFLogger.INSTANCE.e(AFg1cSDK.SECURITY, "native: reflection init failed", e10, false, false, true);
        }
    }

    public final void getCurrencyIso4217Code(AFc1pSDK aFc1pSDK) {
        this.getCurrencyIso4217Code = System.currentTimeMillis();
        this.getMonetizationNetwork = areAllFieldsValid().getCurrencyIso4217Code(getMediationNetwork(aFc1pSDK), this.getRevenue.getRevenue, new AFf1iSDK.AFa1vSDK() { // from class: com.appsflyer.internal.AFf1jSDK.5
            @Override // com.appsflyer.internal.AFf1iSDK.AFa1vSDK
            public final void AFAdRevenueData(String str, Exception exc) {
                AFf1jSDK.this.getMediationNetwork = new ConcurrentHashMap();
                String message = exc.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                AFf1jSDK.this.component2();
                AFf1jSDK.this.getMediationNetwork.put("error", message);
                AFLogger.afErrorLog(str, exc, true, true, false);
            }

            @Override // com.appsflyer.internal.AFf1iSDK.AFa1vSDK
            public final void getRevenue(@NonNull String str, @NonNull String str2) {
                AFf1jSDK.this.getMediationNetwork = new ConcurrentHashMap();
                AFf1jSDK.this.getMediationNetwork.put("signedData", str);
                AFf1jSDK.this.getMediationNetwork.put("signature", str2);
                AFf1jSDK.this.component2();
                AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
            }
        });
        component2 = (areAllFieldsValid + 1) % 128;
    }

    @VisibleForTesting
    private long getMediationNetwork(AFc1pSDK aFc1pSDK) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AFb1mSDK.getMonetizationNetwork(aFc1pSDK.AFAdRevenueData));
        sb2.append(component3());
        long currencyIso4217Code = AFj1dSDK.getCurrencyIso4217Code(AFj1dSDK.getCurrencyIso4217Code(sb2.toString()));
        component2 = (areAllFieldsValid + 91) % 128;
        return currencyIso4217Code;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFf1jSDK aFf1jSDK = (AFf1jSDK) objArr[0];
        HashMap map = new HashMap();
        if (aFf1jSDK.component4()) {
            int i7 = component2 + 115;
            areAllFieldsValid = i7 % 128;
            if (i7 % 2 != 0) {
                map.put("lvl", aFf1jSDK.getMediationNetwork);
                int i10 = 12 / 0;
            } else {
                map.put("lvl", aFf1jSDK.getMediationNetwork);
            }
        } else if (aFf1jSDK.getMonetizationNetwork) {
            aFf1jSDK.getMediationNetwork = new HashMap();
            aFf1jSDK.component2();
            aFf1jSDK.getMediationNetwork.put("error", "pending LVL response");
            map.put("lvl", aFf1jSDK.getMediationNetwork);
        }
        int i11 = component2 + 79;
        areAllFieldsValid = i11 % 128;
        if (i11 % 2 == 0) {
            return map;
        }
        throw null;
    }

    public final Map<String, Object> getCurrencyIso4217Code(Map<String, Object> map) {
        return (Map) getCurrencyIso4217Code(new Object[]{this, map}, 216703728, -216703725, System.identityHashCode(this));
    }

    @Nullable
    public final String getCurrencyIso4217Code() {
        return (String) getCurrencyIso4217Code(new Object[]{this}, 193238752, -193238751, System.identityHashCode(this));
    }

    public final boolean getMonetizationNetwork() {
        int i7 = areAllFieldsValid;
        int i10 = i7 + 31;
        component2 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (this.getMonetizationNetwork) {
            component2 = (i7 + 73) % 128;
            if (!component4()) {
                component2 = (areAllFieldsValid + 35) % 128;
                return true;
            }
        }
        int i11 = areAllFieldsValid + 121;
        component2 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 21 / 0;
        }
        return false;
    }

    public static boolean getMonetizationNetwork(AFh1qSDK aFh1qSDK, AFc1pSDK aFc1pSDK) {
        return ((Boolean) getCurrencyIso4217Code(new Object[]{aFh1qSDK, aFc1pSDK}, 94535307, -94535307, (int) System.currentTimeMillis())).booleanValue();
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        String str;
        int i7 = 0;
        AFh1qSDK aFh1qSDK = (AFh1qSDK) objArr[0];
        AFc1pSDK aFc1pSDK = (AFc1pSDK) objArr[1];
        areAllFieldsValid = (component2 + 63) % 128;
        if (!AFk1ySDK.getMediationNetwork(aFc1pSDK.getMediationNetwork)) {
            component2 = (areAllFieldsValid + 7) % 128;
            str = aFc1pSDK.getMediationNetwork;
        } else {
            String monetizationNetwork = aFc1pSDK.getMonetizationNetwork("com.appsflyer.security.uuid");
            if (AFk1ySDK.getMediationNetwork(monetizationNetwork)) {
                int i10 = component2 + 21;
                areAllFieldsValid = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
                str = null;
            } else {
                String strSubstring = monetizationNetwork.substring(0, 8);
                aFc1pSDK.getMediationNetwork = strSubstring;
                str = strSubstring;
            }
        }
        if (str != null) {
            int i11 = areAllFieldsValid + 21;
            component2 = i11 % 128;
            if (i11 % 2 == 0) {
                str.isEmpty();
                throw null;
            }
            if (!str.isEmpty()) {
                try {
                    Map<String, Object> map = aFh1qSDK.getMediationNetwork;
                    Object[] objArr2 = new Object[1];
                    a(AndroidCharacter.getMirror('0') - '$', 16777227 + Color.rgb(0, 0, 0), true, 209 - (ViewConfiguration.getWindowTouchSlop() >> 8), "\u0003\ufff7\n\t\ufffb\u0003\uffff\n\ufff5￼\ufff7\u0006", objArr2);
                    long j6 = Long.parseLong(String.valueOf(map.get(((String) objArr2[0]).intern())));
                    char[] charArray = str.toCharArray();
                    int i12 = ((int) (j6 % 94)) + 33;
                    while (i7 < charArray.length) {
                        charArray[i7] = (char) (charArray[i7] ^ i12);
                        i7++;
                        areAllFieldsValid = (component2 + 69) % 128;
                    }
                    aFh1qSDK.getMonetizationNetwork.put("af-sdk-sbid", Base64.encodeToString(new String(charArray).getBytes(Charset.defaultCharset()), 2));
                    areAllFieldsValid = (component2 + 87) % 128;
                    return Boolean.TRUE;
                } catch (Exception e10) {
                    AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception occurred while generating sbid ", e10);
                    return Boolean.FALSE;
                }
            }
        }
        return Boolean.FALSE;
    }

    @NonNull
    public final Map<String, Object> AFAdRevenueData() {
        return (Map) getCurrencyIso4217Code(new Object[]{this}, -1942462603, 1942462605, System.identityHashCode(this));
    }
}
