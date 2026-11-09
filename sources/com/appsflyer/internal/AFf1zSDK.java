package com.appsflyer.internal;

import android.graphics.Color;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1zSDK extends AFe1eSDK<Map<String, String>> {

    @Nullable
    public AFa1uSDK component3;
    private String copy;
    private String copydefault;
    private final AFd1kSDK equals;
    private String hashCode;
    private final UUID registerClient;
    private final boolean toString;

    public interface AFa1uSDK {
        void getRevenue(String str);

        void getRevenue(Map<String, String> map);
    }

    public AFf1zSDK(@NonNull AFd1zSDK aFd1zSDK, @NonNull UUID uuid, @NonNull Uri uri) throws Throwable {
        super(AFe1nSDK.ONELINK, new AFe1nSDK[]{AFe1nSDK.RC_CDN}, aFd1zSDK, uuid.toString());
        this.equals = aFd1zSDK.getCurrencyIso4217Code();
        this.registerClient = uuid;
        boolean zBooleanValue = false;
        try {
            if (!AFk1ySDK.getMediationNetwork(uri.getHost()) && !AFk1ySDK.getMediationNetwork(uri.getPath())) {
                try {
                    Object[] objArr = {uri, aFd1zSDK.e()};
                    Map map = AFa1jSDK.unregisterClient;
                    Object declaredConstructor = map.get(1376270842);
                    if (declaredConstructor == null) {
                        declaredConstructor = ((Class) AFa1jSDK.getMonetizationNetwork(37 - View.resolveSize(0, 0), ViewConfiguration.getMinimumFlingVelocity() >> 16, (char) (ViewConfiguration.getJumpTapTimeout() >> 16))).getDeclaredConstructor(Uri.class, AFa1mSDK.class);
                        map.put(1376270842, declaredConstructor);
                    }
                    Object objNewInstance = ((Constructor) declaredConstructor).newInstance(objArr);
                    try {
                        Object method = map.get(361466375);
                        if (method == null) {
                            method = ((Class) AFa1jSDK.getMonetizationNetwork((ViewConfiguration.getJumpTapTimeout() >> 16) + 37, Process.myPid() >> 22, (char) Color.green(0))).getMethod("getMediationNetwork", null);
                            map.put(361466375, method);
                        }
                        Object objInvoke = ((Method) method).invoke(objNewInstance, null);
                        try {
                            Object method2 = map.get(-1068271674);
                            if (method2 == null) {
                                method2 = ((Class) AFa1jSDK.getMonetizationNetwork(TextUtils.indexOf("", "", 0, 0) + 51, 38 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (22660 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)))).getMethod("getMediationNetwork", null);
                                map.put(-1068271674, method2);
                            }
                            boolean zBooleanValue2 = ((Boolean) ((Method) method2).invoke(objInvoke, null)).booleanValue();
                            try {
                                Object method3 = map.get(-322127632);
                                if (method3 == null) {
                                    method3 = ((Class) AFa1jSDK.getMonetizationNetwork(51 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getJumpTapTimeout() >> 16) + 37, (char) (22660 - (ViewConfiguration.getEdgeSlop() >> 16)))).getMethod("getRevenue", null);
                                    map.put(-322127632, method3);
                                }
                                zBooleanValue = ((Boolean) ((Method) method3).invoke(objInvoke, null)).booleanValue();
                                String[] strArrSplit = uri.getPath().split("/");
                                if (zBooleanValue2 && strArrSplit.length == 3) {
                                    this.hashCode = strArrSplit[1];
                                    this.copydefault = strArrSplit[2];
                                    this.copy = uri.toString();
                                }
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("OneLinkValidator: reflection init failed", e10);
        }
        this.toString = zBooleanValue;
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1sSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean component3() {
        return false;
    }

    public final boolean copy() {
        return this.toString;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    @Nullable
    public final AppsFlyerRequestListener copydefault() {
        return null;
    }

    public final boolean equals() {
        return (TextUtils.isEmpty(this.hashCode) || TextUtils.isEmpty(this.copydefault) || this.hashCode.equals("app")) ? false : true;
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1sSDK
    public final void getMediationNetwork() {
        ResponseNetwork responseNetwork;
        super.getMediationNetwork();
        AFa1uSDK aFa1uSDK = this.component3;
        if (aFa1uSDK != null) {
            if (this.getMonetizationNetwork == AFe1qSDK.SUCCESS && (responseNetwork = this.areAllFieldsValid) != null) {
                aFa1uSDK.getRevenue((Map<String, String>) responseNetwork.getBody());
                return;
            }
            Throwable thComponent4 = component4();
            if (!(thComponent4 instanceof ParsingException)) {
                String str = this.copy;
                aFa1uSDK.getRevenue(str != null ? str : "Can't get OneLink data");
            } else if (((ParsingException) thComponent4).getRawResponse().isSuccessful()) {
                aFa1uSDK.getRevenue("Can't parse one link data");
            } else {
                String str2 = this.copy;
                aFa1uSDK.getRevenue(str2 != null ? str2 : "Can't get OneLink data");
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1sSDK
    public final long getRevenue() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final AFd1hSDK<Map<String, String>> AFAdRevenueData(@NonNull String str) {
        AFd1kSDK aFd1kSDK = this.equals;
        return (AFd1hSDK) AFd1kSDK.getRevenue(new Object[]{aFd1kSDK, this.hashCode, this.copydefault, this.registerClient, str}, 1355965567, -1355965565, System.identityHashCode(aFd1kSDK));
    }
}
