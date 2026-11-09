package com.appsflyer.internal;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AFf1rSDK extends AFe1eSDK<String> {
    private static final AFe1nSDK[] AFKeystoreWrapper = {AFe1nSDK.DLSDK, AFe1nSDK.ONELINK, AFe1nSDK.REGISTER};
    private final AFf1eSDK AFInAppEventParameterName;
    private final AFc1eSDK AFLogger;
    protected final AFc1qSDK component3;
    private final AFe1vSDK copy;
    private final AFh1qSDK copydefault;

    @NonNull
    private final AFc1pSDK equals;
    private final AFf1pSDK hashCode;
    protected final AFg1vSDK toString;

    public AFf1rSDK(@NonNull AFh1qSDK aFh1qSDK, @NonNull AFd1zSDK aFd1zSDK) {
        this(aFh1qSDK, aFd1zSDK, null);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0128  */
    /* JADX WARN: Code duplicated, block: B:66:0x012f  */
    /* JADX WARN: Code duplicated, block: B:71:0x014a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0161  */
    @Override // com.appsflyer.internal.AFe1eSDK
    public final AFd1hSDK<String> AFAdRevenueData(@NonNull String str) {
        double d2;
        JSONObject jSONObject;
        String string;
        String strReplaceAll;
        Exception exc;
        String str2;
        AFAdRevenueData(this.copydefault);
        if (this.copydefault.getMediationNetwork.containsKey(Constants.REFERRER_API_META)) {
            try {
                d2 = this.hashCode.getMonetizationNetwork.getMonetizationNetwork.getMediationNetwork.getMonetizationNetwork.getCurrencyIso4217Code;
            } catch (NullPointerException unused) {
                d2 = 1.0d;
            }
            if (AFh1qSDK.getMediationNetwork(d2)) {
                this.copydefault.getMediationNetwork.remove(Constants.REFERRER_API_META);
            }
        }
        AFd1hSDK<String> currencyIso4217Code = ((AFe1eSDK) this).component1.getCurrencyIso4217Code(this.copydefault, str, this.AFLogger);
        Map<String, Object> map = this.copydefault.getMediationNetwork;
        try {
            jSONObject = new JSONObject(map);
            try {
                string = jSONObject.toString();
                try {
                    if (string == null) {
                        throw new NullPointerException("JSON toString of eventParams map returns null");
                    }
                    strReplaceAll = string.replaceAll("\\p{C}", "*Non-printing character*");
                    str2 = string != null ? string : "";
                    if (strReplaceAll.equals(str2)) {
                        strReplaceAll = str2;
                    } else {
                        AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Payload contains non-printing characters");
                        try {
                            jSONObject = new JSONObject(strReplaceAll);
                        } catch (JSONException e10) {
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Couldn't parse the payload to a json object", e10);
                        }
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this);
                    sb2.append(": preparing data: ");
                    AFg1dSDK.getMediationNetwork(sb2.toString(), jSONObject);
                    ((AFe1eSDK) this).component4.getMonetizationNetwork(currencyIso4217Code != null ? currencyIso4217Code.getMediationNetwork.AFAdRevenueData : null, strReplaceAll);
                    return currencyIso4217Code;
                } catch (NullPointerException e11) {
                    e = e11;
                    AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "JSONObject return null String object. Trying to create AFJsonObject.", e);
                    try {
                        Object[] objArr = {map};
                        Map map2 = AFa1jSDK.unregisterClient;
                        Object method = map2.get(1924632697);
                        if (method == null) {
                            method = ((Class) AFa1jSDK.getMonetizationNetwork(35 - MotionEvent.axisFromString(""), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 199, (char) (15950 - (ViewConfiguration.getKeyRepeatDelay() >> 16)))).getMethod("getCurrencyIso4217Code", Map.class);
                            map2.put(1924632697, method);
                        }
                        String str3 = (String) ((Method) method).invoke(null, objArr);
                        try {
                            if (str3 == null) {
                                throw new NullPointerException("JSON toString of eventParams map returns null");
                            }
                            strReplaceAll = str3.replaceAll("\\p{C}", "*Non-printing character*");
                            string = str3;
                        } catch (NullPointerException e12) {
                            e = e12;
                            string = str3;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFJsonObject return null String object.", e);
                            strReplaceAll = "";
                        } catch (Exception e13) {
                            exc = e13;
                            string = str3;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", exc, false, false, true);
                            strReplaceAll = "";
                        } catch (Throwable th) {
                            th = th;
                            string = str3;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Unexpected error", th);
                            strReplaceAll = "";
                        }
                    } catch (Throwable th2) {
                        try {
                            Throwable cause = th2.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th2;
                        } catch (NullPointerException e14) {
                            e = e14;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFJsonObject return null String object.", e);
                            strReplaceAll = "";
                            if (string != null) {
                            }
                            if (strReplaceAll.equals(str2)) {
                                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Payload contains non-printing characters");
                                jSONObject = new JSONObject(strReplaceAll);
                            } else {
                                strReplaceAll = str2;
                            }
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this);
                            sb3.append(": preparing data: ");
                            AFg1dSDK.getMediationNetwork(sb3.toString(), jSONObject);
                            ((AFe1eSDK) this).component4.getMonetizationNetwork(currencyIso4217Code != null ? currencyIso4217Code.getMediationNetwork.AFAdRevenueData : null, strReplaceAll);
                            return currencyIso4217Code;
                        } catch (Exception e15) {
                            exc = e15;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", exc, false, false, true);
                            strReplaceAll = "";
                            if (string != null) {
                            }
                            if (strReplaceAll.equals(str2)) {
                                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Payload contains non-printing characters");
                                jSONObject = new JSONObject(strReplaceAll);
                            } else {
                                strReplaceAll = str2;
                            }
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(this);
                            sb4.append(": preparing data: ");
                            AFg1dSDK.getMediationNetwork(sb4.toString(), jSONObject);
                            ((AFe1eSDK) this).component4.getMonetizationNetwork(currencyIso4217Code != null ? currencyIso4217Code.getMediationNetwork.AFAdRevenueData : null, strReplaceAll);
                            return currencyIso4217Code;
                        } catch (Throwable th3) {
                            th = th3;
                            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Unexpected error", th);
                            strReplaceAll = "";
                            if (string != null) {
                            }
                            if (strReplaceAll.equals(str2)) {
                                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Payload contains non-printing characters");
                                jSONObject = new JSONObject(strReplaceAll);
                            } else {
                                strReplaceAll = str2;
                            }
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(this);
                            sb5.append(": preparing data: ");
                            AFg1dSDK.getMediationNetwork(sb5.toString(), jSONObject);
                            ((AFe1eSDK) this).component4.getMonetizationNetwork(currencyIso4217Code != null ? currencyIso4217Code.getMediationNetwork.AFAdRevenueData : null, strReplaceAll);
                            return currencyIso4217Code;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Unexpected error", th);
                    strReplaceAll = "";
                }
            } catch (NullPointerException e16) {
                e = e16;
                string = null;
            } catch (Throwable th5) {
                th = th5;
                string = null;
            }
        } catch (NullPointerException e17) {
            e = e17;
            jSONObject = null;
            string = null;
        } catch (Throwable th6) {
            th = th6;
            jSONObject = null;
            string = null;
        }
    }

    public void component1(AFh1qSDK aFh1qSDK) {
        this.toString.getCurrencyIso4217Code(aFh1qSDK);
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public boolean component3() {
        return true;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    @Nullable
    public final AppsFlyerRequestListener copydefault() {
        return this.copydefault.AFAdRevenueData;
    }

    public void getCurrencyIso4217Code(AFh1qSDK aFh1qSDK) {
        this.toString.AFAdRevenueData(aFh1qSDK);
    }

    public void getMediationNetwork(AFh1qSDK aFh1qSDK) {
        this.toString.getMediationNetwork(aFh1qSDK.getMediationNetwork);
    }

    public void getMonetizationNetwork(AFh1qSDK aFh1qSDK) {
        this.toString.getMonetizationNetwork(aFh1qSDK);
    }

    public void getRevenue(AFh1qSDK aFh1qSDK) {
        this.toString.getRevenue(aFh1qSDK);
    }

    public AFf1rSDK(@NonNull AFh1qSDK aFh1qSDK, @NonNull AFd1zSDK aFd1zSDK, String str) {
        super(aFh1qSDK.getCurrencyIso4217Code(), new AFe1nSDK[]{AFe1nSDK.RC_CDN, AFe1nSDK.FETCH_ADVERTISING_ID}, aFd1zSDK, str);
        this.copydefault = aFh1qSDK;
        this.copy = aFd1zSDK.AFKeystoreWrapper();
        this.component3 = aFd1zSDK.getRevenue();
        this.hashCode = aFd1zSDK.component4();
        this.AFLogger = aFd1zSDK.AFInAppEventParameterName();
        this.equals = aFd1zSDK.getMonetizationNetwork();
        this.toString = aFd1zSDK.component3();
        this.AFInAppEventParameterName = aFd1zSDK.afDebugLog();
        for (AFe1nSDK aFe1nSDK : AFKeystoreWrapper) {
            if (this.getMediationNetwork == aFe1nSDK) {
                return;
            }
        }
        int i7 = this.copydefault.areAllFieldsValid;
        AFe1nSDK aFe1nSDK2 = this.getMediationNetwork;
        if (i7 > 0) {
            this.getCurrencyIso4217Code.add(AFe1nSDK.CONVERSION);
        } else {
            AFe1nSDK aFe1nSDK3 = AFe1nSDK.CONVERSION;
            if (aFe1nSDK2 != aFe1nSDK3) {
                this.AFAdRevenueData.add(aFe1nSDK3);
            }
        }
    }

    @CallSuper
    public void AFAdRevenueData(AFh1qSDK aFh1qSDK) {
        AFe1rSDK aFe1rSDK;
        try {
            try {
                getRevenue(aFh1qSDK);
                getMediationNetwork(aFh1qSDK);
                getCurrencyIso4217Code(aFh1qSDK);
                getMonetizationNetwork(aFh1qSDK);
                component1(aFh1qSDK);
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFg1cSDK.QUEUE, "Error while collecting payload params", th, true, true, false);
            }
            if (aFh1qSDK.AFAdRevenueData()) {
                AFf1jSDK aFf1jSDK = ((AFe1eSDK) this).component2;
                aFh1qSDK.getCurrencyIso4217Code((Map<String, ?>) AFf1jSDK.getCurrencyIso4217Code(new Object[]{aFf1jSDK, aFh1qSDK.getMediationNetwork}, 216703728, -216703725, System.identityHashCode(aFf1jSDK)));
                aFh1qSDK.getCurrencyIso4217Code((Map<String, ?>) ((AFe1eSDK) this).component2.getMonetizationNetwork(aFh1qSDK.getMediationNetwork));
            }
            if (aFh1qSDK.component3()) {
                AFf1jSDK aFf1jSDK2 = ((AFe1eSDK) this).component2;
                aFh1qSDK.getCurrencyIso4217Code((Map<String, ?>) AFf1jSDK.getCurrencyIso4217Code(new Object[]{aFf1jSDK2}, -1942462603, 1942462605, System.identityHashCode(aFf1jSDK2)));
            }
            Set<AFe1nSDK> set = this.AFAdRevenueData;
            boolean z3 = set.contains(AFe1nSDK.LAUNCH) || set.contains(AFe1nSDK.CONVERSION);
            if (component1() && z3) {
                aFh1qSDK.getCurrencyIso4217Code(this.component3.getMonetizationNetwork("appsFlyerCount", 0));
            }
            if (aFh1qSDK.areAllFieldsValid()) {
                Map<String, Object> mediationNetwork = AFj1fSDK.getMediationNetwork(aFh1qSDK.getMediationNetwork);
                AFe1vSDK aFe1vSDK = this.copy;
                String strAFAdRevenueData = aFe1vSDK.AFAdRevenueData();
                String currencyIso4217Code = aFe1vSDK.getCurrencyIso4217Code();
                if (AFe1vSDK.getMediationNetwork()) {
                    aFe1rSDK = AFe1rSDK.DEFAULT;
                } else {
                    aFe1rSDK = AFe1rSDK.API;
                }
                AFe1zSDK aFe1zSDK = new AFe1zSDK(strAFAdRevenueData, currencyIso4217Code, aFe1rSDK);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", aFe1zSDK.getCurrencyIso4217Code);
                AFe1rSDK aFe1rSDK2 = aFe1zSDK.AFAdRevenueData;
                if (aFe1rSDK2 != AFe1rSDK.DEFAULT) {
                    jSONObject.put(FirebaseAnalytics.Param.METHOD, aFe1rSDK2.getCurrencyIso4217Code);
                }
                String str = aFe1zSDK.getMonetizationNetwork;
                if (str != null && !StringsKt.F(str)) {
                    jSONObject.put("prefix", aFe1zSDK.getMonetizationNetwork);
                }
                mediationNetwork.put("host", jSONObject);
            }
            if (this.equals.getMediationNetwork("AF_PREINSTALL_DISABLED")) {
                AFj1fSDK.getMediationNetwork(aFh1qSDK.getMediationNetwork).put("preinstall_disabled", Boolean.TRUE);
            }
            this.AFInAppEventParameterName.getMediationNetwork(aFh1qSDK.getMediationNetwork, aFh1qSDK.getCurrencyIso4217Code());
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.QUEUE, "Error while preparing to send event", th2, true, true, false);
        }
    }
}
