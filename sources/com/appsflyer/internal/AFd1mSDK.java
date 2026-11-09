package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.aidl.MsgEvent;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1mSDK implements AFd1oSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long component1 = 0;
    private static int copydefault = 1;
    private static final int getMediationNetwork;
    private static int toString;
    private final AFd1zSDK component4;
    private List<String> getRevenue = new ArrayList();
    private boolean AFAdRevenueData = true;

    @NonNull
    private final Map<String, Object> getMonetizationNetwork = new HashMap();
    private SecureRandom areAllFieldsValid = new SecureRandom();
    private boolean component3 = true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int getCurrencyIso4217Code = 0;
    private boolean component2 = false;

    static {
        component1();
        getMediationNetwork = 98166;
        int i7 = toString + 23;
        copydefault = i7 % 128;
        if (i7 % 2 == 0) {
            int i10 = 3 / 0;
        }
    }

    public AFd1mSDK(AFd1zSDK aFd1zSDK) {
        this.component4 = aFd1zSDK;
    }

    private void AFInAppEventParameterName() {
        toString = (copydefault + 89) % 128;
        this.component4.getRevenue().getMediationNetwork("participantInProxy");
        copydefault = (toString + 97) % 128;
    }

    private boolean AFInAppEventType() {
        int i7 = toString + 75;
        copydefault = i7 % 128;
        if (i7 % 2 != 0) {
            return this.component4.getRevenue().getMonetizationNetwork("participantInProxy");
        }
        this.component4.getRevenue().getMonetizationNetwork("participantInProxy");
        throw null;
    }

    private static void a(String str, int i7, Object[] objArr) {
        int i10;
        Object charArray = str;
        if (str != null) {
            int i11 = $11 + 29;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        AFk1nSDK aFk1nSDK = new AFk1nSDK();
        aFk1nSDK.AFAdRevenueData = i7;
        int length = cArr.length;
        long[] jArr = new long[length];
        aFk1nSDK.getRevenue = 0;
        while (true) {
            int i12 = aFk1nSDK.getRevenue;
            if (i12 >= cArr.length) {
                break;
            }
            int i13 = $11 + 97;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                jArr[i12] = (((long) cArr[i12]) / (((long) i12) * ((long) aFk1nSDK.AFAdRevenueData))) ^ (component1 - 7806791664571486981L);
                i10 = i12 << 1;
            } else {
                jArr[i12] = (component1 ^ 7806791664571486981L) ^ (((long) cArr[i12]) ^ (((long) i12) * ((long) aFk1nSDK.AFAdRevenueData)));
                i10 = i12 + 1;
            }
            aFk1nSDK.getRevenue = i10;
        }
        char[] cArr2 = new char[length];
        aFk1nSDK.getRevenue = 0;
        while (true) {
            int i14 = aFk1nSDK.getRevenue;
            if (i14 >= cArr.length) {
                objArr[0] = new String(cArr2);
                return;
            }
            int i15 = $11 + 53;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                cArr2[i14] = (char) jArr[i14];
            } else {
                cArr2[i14] = (char) jArr[i14];
            }
            aFk1nSDK.getRevenue = i14 + 1;
        }
    }

    private synchronized void areAllFieldsValid() {
        toString = (copydefault + 61) % 128;
        if (this.component2) {
            return;
        }
        this.component2 = true;
        try {
            getMediationNetwork("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            copydefault = (toString + 63) % 128;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.PROXY, "Error while starting remote debugger", th, true, true, true);
        }
    }

    public static void component1() {
        component1 = -778493939819511172L;
    }

    @VisibleForTesting
    private static String component2() {
        int i7 = (copydefault + 61) % 128;
        toString = i7;
        int i10 = i7 + 85;
        copydefault = i10 % 128;
        if (i10 % 2 != 0) {
            return "6.18.1";
        }
        throw null;
    }

    @VisibleForTesting
    private float component3() {
        int i7 = toString + 125;
        copydefault = i7 % 128;
        if (i7 % 2 != 0) {
            return this.areAllFieldsValid.nextFloat();
        }
        this.areAllFieldsValid.nextFloat();
        throw null;
    }

    @NonNull
    private synchronized Map<String, Object> copy() {
        int i7 = toString + 85;
        copydefault = i7 % 128;
        if (i7 % 2 == 0) {
            this.getMonetizationNetwork.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.getRevenue);
            equals();
            throw null;
        }
        this.getMonetizationNetwork.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.getRevenue);
        equals();
        return this.getMonetizationNetwork;
    }

    private boolean copydefault() {
        if (this.component3) {
            if (this.AFAdRevenueData) {
                return true;
            }
            int i7 = toString + 79;
            copydefault = i7 % 128;
            if (i7 % 2 == 0) {
                int i10 = 91 / 0;
                if (this.component2) {
                    return true;
                }
            } else if (this.component2) {
                return true;
            }
        }
        int i11 = toString + 81;
        copydefault = i11 % 128;
        if (i11 % 2 != 0) {
            return false;
        }
        throw null;
    }

    private synchronized void equals() {
        this.getRevenue = new ArrayList();
        this.getCurrencyIso4217Code = 0;
        toString = (copydefault + 115) % 128;
    }

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i7, int i10, int i11) {
        int i12 = (i10 * 591) + (i7 * (-589));
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = (~(i13 | i7)) | (~(i13 | i14)) | (~(i14 | i7));
        int i16 = ~i7;
        int i17 = (((~(i11 | i16 | i10)) | i15) * 590) + i12;
        int i18 = (((~(i16 | i14)) | (~(i10 | i14))) * 590) + (i15 * (-1180)) + i17;
        if (i18 == 1) {
            AFd1mSDK aFd1mSDK = (AFd1mSDK) objArr[0];
            String str = (String) objArr[1];
            String str2 = (String) objArr[2];
            int i19 = toString + 85;
            copydefault = i19 % 128;
            if (i19 % 2 == 0) {
                String[] strArr = new String[0];
                strArr[1] = str2;
                aFd1mSDK.getMediationNetwork((String) null, str, strArr);
            } else {
                aFd1mSDK.getMediationNetwork((String) null, str, str2);
            }
            copydefault = (toString + 31) % 128;
            return null;
        }
        if (i18 == 2) {
            return getMonetizationNetwork(objArr);
        }
        if (i18 != 3) {
            return getMediationNetwork(objArr);
        }
        AFd1mSDK aFd1mSDK2 = (AFd1mSDK) objArr[0];
        String str3 = (String) objArr[1];
        String str4 = (String) objArr[2];
        int i20 = toString + 43;
        copydefault = i20 % 128;
        if (i20 % 2 == 0) {
            String[] strArr2 = new String[1];
            strArr2[1] = str4;
            aFd1mSDK2.getMediationNetwork("server_request", str3, strArr2);
        } else {
            aFd1mSDK2.getMediationNetwork("server_request", str3, str4);
        }
        copydefault = (toString + 83) % 128;
        return null;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final boolean AFAdRevenueData() {
        boolean mediationNetwork = getMediationNetwork(getMonetizationNetwork(this.component4.component4().getMonetizationNetwork.getMonetizationNetwork), getMonetizationNetwork(this.component4.component4().getMonetizationNetwork.AFAdRevenueData));
        if (!mediationNetwork) {
            getMonetizationNetwork();
            getCurrencyIso4217Code();
            return mediationNetwork;
        }
        copydefault = (toString + 73) % 128;
        areAllFieldsValid();
        toString = (copydefault + 5) % 128;
        return mediationNetwork;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final boolean component4() {
        int i7 = copydefault;
        boolean z3 = this.component2;
        toString = (i7 + 63) % 128;
        return z3;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final synchronized void getCurrencyIso4217Code() {
        toString = (copydefault + 67) % 128;
        if (this.component2 || this.AFAdRevenueData) {
            this.component2 = false;
            this.AFAdRevenueData = false;
            try {
                getMediationNetwork("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
                int i7 = toString + 19;
                copydefault = i7 % 128;
                if (i7 % 2 != 0) {
                } else {
                    throw null;
                }
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFg1cSDK.PROXY, "Error while stopping remote debugger", th, true, true, true);
            }
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void getMonetizationNetwork(String str, String... strArr) {
        int i7 = copydefault + 33;
        toString = i7 % 128;
        if (i7 % 2 == 0) {
            getMediationNetwork("public_api_call", str, strArr);
        } else {
            getMediationNetwork("public_api_call", str, strArr);
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final synchronized void getRevenue() {
        toString = (copydefault + 47) % 128;
        this.getMonetizationNetwork.clear();
        this.getRevenue.clear();
        this.getCurrencyIso4217Code = 0;
        toString = (copydefault + 81) % 128;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void q_(String str, PackageManager packageManager) {
        getMediationNetwork(new Object[]{this, str, packageManager}, -752559118, 752559118, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFd1mSDK aFd1mSDK = (AFd1mSDK) objArr[0];
        String str = (String) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        String str2 = (String) objArr[3];
        int i7 = toString + 47;
        copydefault = i7 % 128;
        if (i7 % 2 == 0) {
            String[] strArr = new String[3];
            strArr[1] = String.valueOf(iIntValue);
            strArr[1] = str2;
            aFd1mSDK.getMediationNetwork("server_response", str, strArr);
        } else {
            aFd1mSDK.getMediationNetwork("server_response", str, String.valueOf(iIntValue), str2);
        }
        int i10 = toString + 67;
        copydefault = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 80 / 0;
        }
        return null;
    }

    @VisibleForTesting
    private Map<String, Object> getRevenue(String str) {
        int i7 = copydefault + 7;
        toString = i7 % 128;
        if (i7 % 2 == 0) {
            getMediationNetwork(str, this.component4.AFInAppEventType(), this.component4.i());
            Map<String, Object> mapCopy = copy();
            toString = (copydefault + 77) % 128;
            return mapCopy;
        }
        getMediationNetwork(str, this.component4.AFInAppEventType(), this.component4.i());
        copy();
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final synchronized void getMonetizationNetwork() {
        try {
            int i7 = toString + 79;
            copydefault = i7 % 128;
            if (i7 % 2 == 0) {
                this.AFAdRevenueData = true;
                getRevenue();
            } else {
                this.AFAdRevenueData = false;
                getRevenue();
            }
            equals();
            int i10 = toString + 73;
            copydefault = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 70 / 0;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFd1mSDK aFd1mSDK = (AFd1mSDK) objArr[0];
        String str = (String) objArr[1];
        int i7 = toString + 119;
        copydefault = i7 % 128;
        try {
            if (i7 % 2 != 0) {
                Map<String, Object> revenue = aFd1mSDK.getRevenue(str);
                String revenue2 = aFd1mSDK.component4.AFInAppEventType().getRevenue();
                AFd1kSDK currencyIso4217Code = aFd1mSDK.component4.getCurrencyIso4217Code();
                AFd1nSDK aFd1nSDK = (AFd1nSDK) AFd1kSDK.getRevenue(new Object[]{currencyIso4217Code, revenue, revenue2}, -1515957273, 1515957274, System.identityHashCode(currencyIso4217Code));
                if (aFd1nSDK == null) {
                    AFLogger.afErrorLogForExcManagerOnly("could not send null proxy data", new NullPointerException("request was null"));
                    copydefault = (toString + 109) % 128;
                    return null;
                }
                aFd1mSDK.component4.AFAdRevenueData().execute(new g(aFd1nSDK, 2));
                return null;
            }
            Map<String, Object> revenue3 = aFd1mSDK.getRevenue(str);
            String revenue4 = aFd1mSDK.component4.AFInAppEventType().getRevenue();
            AFd1kSDK currencyIso4217Code2 = aFd1mSDK.component4.getCurrencyIso4217Code();
            throw null;
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void getCurrencyIso4217Code(Throwable th) {
        String message;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        if (cause == null) {
            toString = (copydefault + 79) % 128;
            message = th.getMessage();
            toString = (copydefault + 43) % 128;
        } else {
            message = cause.getMessage();
        }
        getMediationNetwork("exception", simpleName, getCurrencyIso4217Code(message, cause == null ? th.getStackTrace() : cause.getStackTrace()));
    }

    private boolean getRevenue(@NonNull AFh1dSDK aFh1dSDK, @Nullable AFh1dSDK aFh1dSDK2) {
        int i7 = copydefault + 3;
        toString = i7 % 128;
        if (i7 % 2 == 0) {
            if (aFh1dSDK.equals(aFh1dSDK2)) {
                boolean zAFInAppEventType = AFInAppEventType();
                copydefault = (toString + 23) % 128;
                return zAFInAppEventType;
            }
            boolean mediationNetwork = getMediationNetwork(aFh1dSDK.AFAdRevenueData);
            getRevenue(mediationNetwork);
            return mediationNetwork;
        }
        aFh1dSDK.equals(aFh1dSDK2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c A[Catch: all -> 0x003c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:12:0x002c, B:18:0x0040), top: B:35:0x0001 }] */
    private synchronized void getMonetizationNetwork(String str, String str2, String str3, String str4) {
        int i7 = toString + 23;
        copydefault = i7 % 128;
        try {
            if (i7 % 2 == 0) {
                this.getMonetizationNetwork.put("sdk_version", str);
                int i10 = 54 / 0;
                if (str2 != null) {
                    if (str2.length() > 0) {
                        toString = (copydefault + 57) % 128;
                        this.getMonetizationNetwork.put("devkey", str2);
                    }
                }
            } else {
                this.getMonetizationNetwork.put("sdk_version", str);
                if (str2 != null) {
                    if (str2.length() > 0) {
                        toString = (copydefault + 57) % 128;
                        this.getMonetizationNetwork.put("devkey", str2);
                    }
                }
            }
            if (str3 != null) {
                int i11 = copydefault + 39;
                toString = i11 % 128;
                if (i11 % 2 == 0) {
                    if (str3.length() > 0) {
                        this.getMonetizationNetwork.put("originalAppsFlyerId", str3);
                    }
                } else {
                    throw null;
                }
            }
            if (str4 != null && str4.length() > 0) {
                this.getMonetizationNetwork.put("uid", str4);
            }
        } catch (Throwable unused) {
        }
    }

    private synchronized void getCurrencyIso4217Code(String str, String str2, String str3) {
        try {
            Map<String, Object> map = this.getMonetizationNetwork;
            Object[] objArr = new Object[1];
            a("ᄛ㦊䀚梔댙", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10368, objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.getMonetizationNetwork.put("model", Build.MODEL);
            this.getMonetizationNetwork.put("platform", "Android");
            this.getMonetizationNetwork.put("platform_version", Build.VERSION.RELEASE);
            if (str != null) {
                try {
                    toString = (copydefault + 43) % 128;
                    if (str.length() > 0) {
                        this.getMonetizationNetwork.put("advertiserId", str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (str2 != null && str2.length() > 0) {
                copydefault = (toString + 15) % 128;
                this.getMonetizationNetwork.put("imei", str2);
            }
            if (str3 != null) {
                int i7 = toString + 19;
                copydefault = i7 % 128;
                if (i7 % 2 == 0) {
                    int i10 = 18 / 0;
                    if (str3.length() > 0) {
                        this.getMonetizationNetwork.put("android_id", str3);
                    }
                } else if (str3.length() > 0) {
                    this.getMonetizationNetwork.put("android_id", str3);
                }
            }
            toString = (copydefault + 107) % 128;
        } catch (Throwable unused) {
        }
    }

    private void getRevenue(boolean z3) {
        toString = (copydefault + 43) % 128;
        this.component4.getRevenue().AFAdRevenueData("participantInProxy", z3);
        copydefault = (toString + MsgEvent.MSG_EVENT_STOP_FOREGROUND) % 128;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void getRevenue(String str, String str2) {
        getMediationNetwork(new Object[]{this, str, str2}, 1332367871, -1332367870, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void getMediationNetwork() {
        int i7 = copydefault + 123;
        toString = i7 % 128;
        this.component3 = i7 % 2 != 0;
    }

    private synchronized void getMediationNetwork(String str, String str2, String str3, String str4) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    this.getMonetizationNetwork.put("app_id", str);
                    try {
                        toString = (copydefault + 105) % 128;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str2 != null) {
            int i7 = toString + 25;
            copydefault = i7 % 128;
            if (i7 % 2 != 0) {
                if (str2.length() > 0) {
                    this.getMonetizationNetwork.put("app_version", str2);
                }
            } else {
                throw null;
            }
        }
        if (str3 != null && str3.length() > 0) {
            copydefault = (toString + 57) % 128;
            this.getMonetizationNetwork.put(AppsFlyerProperties.CHANNEL, str3);
        }
        if (str4 != null && str4.length() > 0) {
            this.getMonetizationNetwork.put("preInstall", str4);
        }
    }

    @Nullable
    private static AFh1dSDK getMonetizationNetwork(@Nullable AFi1zSDK aFi1zSDK) {
        AFh1bSDK aFh1bSDK;
        int i7 = toString + HomeDialogState.PRIORITY_HIGHEST_111;
        int i10 = i7 % 128;
        copydefault = i10;
        if (i7 % 2 == 0) {
            throw null;
        }
        if (aFi1zSDK == null || (aFh1bSDK = aFi1zSDK.getMediationNetwork) == null) {
            return null;
        }
        int i11 = i10 + 9;
        toString = i11 % 128;
        if (i11 % 2 == 0) {
            return aFh1bSDK.getCurrencyIso4217Code;
        }
        AFh1dSDK aFh1dSDK = aFh1bSDK.getCurrencyIso4217Code;
        throw null;
    }

    private static String[] getCurrencyIso4217Code(String str, StackTraceElement[] stackTraceElementArr) {
        int i7 = (copydefault + 91) % 128;
        toString = i7;
        if (stackTraceElementArr == null) {
            int i10 = i7 + 23;
            copydefault = i10 % 128;
            if (i10 % 2 != 0) {
                return new String[]{str};
            }
            String[] strArr = new String[0];
            strArr[0] = str;
            return strArr;
        }
        int i11 = 1;
        String[] strArr2 = new String[stackTraceElementArr.length + 1];
        strArr2[0] = str;
        while (i11 < stackTraceElementArr.length) {
            strArr2[i11] = stackTraceElementArr[i11].toString();
            i11++;
            toString = (copydefault + 23) % 128;
        }
        return strArr2;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void getMonetizationNetwork(String str, String str2) {
        getMediationNetwork(new Object[]{this, str, str2}, 434648460, -434648457, System.identityHashCode(this));
    }

    private synchronized void getMediationNetwork(String str, String str2, String... strArr) {
        String string;
        toString = (copydefault + 43) % 128;
        if (copydefault()) {
            toString = (copydefault + 65) % 128;
            if (this.getCurrencyIso4217Code < 98304) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strJoin = TextUtils.join(", ", strArr);
                    if (str != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(jCurrentTimeMillis);
                        sb2.append(" ");
                        sb2.append(Thread.currentThread().getId());
                        sb2.append(" _/AppsFlyer_6.18.1 [");
                        sb2.append(str);
                        sb2.append("] ");
                        sb2.append(str2);
                        sb2.append(" ");
                        sb2.append(strJoin);
                        string = sb2.toString();
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(jCurrentTimeMillis);
                        sb3.append(" ");
                        sb3.append(Thread.currentThread().getId());
                        sb3.append(" ");
                        sb3.append(str2);
                        sb3.append("/AppsFlyer_6.18.1 ");
                        sb3.append(strJoin);
                        string = sb3.toString();
                    }
                    int length = this.getCurrencyIso4217Code + (string.length() << 1);
                    int i7 = getMediationNetwork;
                    boolean z3 = false;
                    if (length > i7) {
                        string = string.substring(0, (i7 - this.getCurrencyIso4217Code) / 2);
                        toString = (copydefault + 9) % 128;
                        z3 = true;
                    }
                    this.getRevenue.add(string);
                    this.getCurrencyIso4217Code += string.length() << 1;
                    if (z3) {
                        this.getRevenue.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                        this.getCurrencyIso4217Code += 138;
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    private static boolean getCurrencyIso4217Code(String str) {
        int i7 = toString + 91;
        copydefault = i7 % 128;
        if (i7 % 2 == 0) {
            int i10 = 92 / 0;
            if (AFk1ySDK.AFAdRevenueData(str)) {
                return true;
            }
        } else if (AFk1ySDK.AFAdRevenueData(str)) {
            return true;
        }
        new AFd1tSDK();
        boolean zAFAdRevenueData = AFd1tSDK.AFAdRevenueData(component2(), str);
        copydefault = (toString + 27) % 128;
        return zAFAdRevenueData;
    }

    private synchronized void getMediationNetwork(String str, AFf1jSDK aFf1jSDK, AFc1fSDK aFc1fSDK) {
        copydefault = (toString + 9) % 128;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String string = appsFlyerProperties.getString("remote_debug_static_data");
        this.getMonetizationNetwork.clear();
        if (string != null) {
            try {
                this.getMonetizationNetwork.putAll(AFg1mSDK.getMonetizationNetwork(new JSONObject(string)));
            } catch (Throwable unused) {
            }
        } else {
            getCurrencyIso4217Code(this.component4.getMonetizationNetwork().getMediationNetwork(), (String) AFf1jSDK.getCurrencyIso4217Code(new Object[]{aFf1jSDK}, 193238752, -193238751, System.identityHashCode(aFf1jSDK)), aFc1fSDK.getMediationNetwork);
            StringBuilder sb2 = new StringBuilder("6.18.1.");
            sb2.append(AFa1uSDK.getMonetizationNetwork);
            getMonetizationNetwork(sb2.toString(), this.component4.AFInAppEventType().getRevenue(), appsFlyerProperties.getString("KSAppsFlyerId"), AFb1mSDK.getMonetizationNetwork(this.component4.getMonetizationNetwork().AFAdRevenueData));
            try {
                int i7 = this.component4.getMonetizationNetwork().n_().versionCode;
                getMediationNetwork(str, String.valueOf(i7), appsFlyerProperties.getString(AppsFlyerProperties.CHANNEL), appsFlyerProperties.getString("preInstallName"));
            } catch (Throwable unused2) {
            }
            appsFlyerProperties.set("remote_debug_static_data", new JSONObject(this.getMonetizationNetwork).toString());
            toString = (copydefault + 69) % 128;
        }
        this.getMonetizationNetwork.put("launch_counter", String.valueOf(this.component4.getMonetizationNetwork().AFAdRevenueData.getMonetizationNetwork("appsFlyerCount", 0)));
    }

    private synchronized boolean getMediationNetwork(@Nullable AFh1dSDK aFh1dSDK, @Nullable AFh1dSDK aFh1dSDK2) {
        try {
            if (aFh1dSDK == null) {
                AFInAppEventParameterName();
                int i7 = toString + 29;
                copydefault = i7 % 128;
                if (i7 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            if (!aFh1dSDK.getRevenue()) {
                return false;
            }
            if (this.component4.getMonetizationNetwork().AFAdRevenueData.getMonetizationNetwork("appsFlyerCount", 0) > aFh1dSDK.getMonetizationNetwork) {
                return false;
            }
            if (!getRevenue(aFh1dSDK, aFh1dSDK2)) {
                return false;
            }
            if (!getMediationNetwork(aFh1dSDK.getMediationNetwork)) {
                return false;
            }
            if (getCurrencyIso4217Code(aFh1dSDK.getCurrencyIso4217Code)) {
                return true;
            }
            int i10 = copydefault + 93;
            toString = i10 % 128;
            return i10 % 2 != 0 ? false : false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private boolean getMediationNetwork(String str) {
        toString = (copydefault + 121) % 128;
        if (AFk1ySDK.AFAdRevenueData(str)) {
            toString = (copydefault + MsgEvent.MSG_EVENT_STOP_FOREGROUND) % 128;
            return true;
        }
        return str.equals(this.component4.getMonetizationNetwork().n_().versionName);
    }

    private boolean getMediationNetwork(float f10) {
        double d2 = f10;
        if (d2 >= 1.0d) {
            return true;
        }
        if (d2 <= 0.0d) {
            copydefault = (toString + 117) % 128;
            return false;
        }
        if (component3() > f10) {
            return false;
        }
        toString = (copydefault + 7) % 128;
        return true;
    }

    @Override // com.appsflyer.internal.AFd1oSDK
    public final void getMediationNetwork(String str, int i7, String str2) {
        getMediationNetwork(new Object[]{this, str, Integer.valueOf(i7), str2}, 980213098, -980213096, i7);
    }
}
