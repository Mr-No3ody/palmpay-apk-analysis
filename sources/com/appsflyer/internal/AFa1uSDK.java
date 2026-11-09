package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.camera.camera2.internal.F;
import com.adjust.sdk.Constants;
import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFe1tSDK.AnonymousClass5;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.didiglobal.booster.instrument.ShadowThread;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.maps.android.BuildConfig;
import com.transsnet.palmpay.aidl.MsgEvent;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1uSDK extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final String AFAdRevenueData;
    private static int AFInAppEventParameterName = 1;
    private static long AFInAppEventType;
    private static int AFLogger;

    @VisibleForTesting
    private static AFa1uSDK component1;
    public static final String getMonetizationNetwork;
    static AppsFlyerInAppPurchaseValidatorListener getRevenue;
    Application component3;
    private Map<Long, String> copy;
    private AFf1tSDK equals;
    private volatile SharedPreferences hashCode;
    private boolean toString;
    public volatile AppsFlyerConversionListener getCurrencyIso4217Code = null;
    private long areAllFieldsValid = -1;
    long getMediationNetwork = -1;
    private long component4 = TimeUnit.SECONDS.toMillis(5);
    boolean component2 = false;

    @NonNull
    private final AFc1dSDK copydefault = new AFc1dSDK();

    /* JADX INFO: renamed from: com.appsflyer.internal.AFa1uSDK$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            getRevenue = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getRevenue[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public class AFa1zSDK implements AFe1uSDK {
        public AFa1zSDK() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit AFAdRevenueData() {
            AFa1uSDK.this.getMediationNetwork(new AFh1rSDK());
            return Unit.f38893a;
        }

        private boolean getRevenue() {
            return AFa1uSDK.this.getCurrencyIso4217Code != null;
        }

        @Override // com.appsflyer.internal.AFe1uSDK
        public final void getMediationNetwork(AFe1sSDK<?> aFe1sSDK) {
        }

        @Override // com.appsflyer.internal.AFe1uSDK
        public final void getMonetizationNetwork(AFe1sSDK<?> aFe1sSDK, AFe1qSDK aFe1qSDK) {
            JSONObject revenue;
            AFf1aSDK monetizationNetwork;
            if (!(aFe1sSDK instanceof AFf1rSDK)) {
                if (!(aFe1sSDK instanceof AFg1nSDK) || aFe1qSDK == AFe1qSDK.SUCCESS) {
                    return;
                }
                AFg1pSDK aFg1pSDK = new AFg1pSDK(AFa1uSDK.this.getRevenue());
                AFe1tSDK aFe1tSDKCopydefault = AFa1uSDK.this.getRevenue().copydefault();
                aFe1tSDKCopydefault.getRevenue.execute(aFe1tSDKCopydefault.new AnonymousClass5(aFg1pSDK));
                return;
            }
            AFf1rSDK aFf1rSDK = (AFf1rSDK) aFe1sSDK;
            boolean z3 = aFe1sSDK instanceof AFf1uSDK;
            if (z3 && getRevenue()) {
                AFf1uSDK aFf1uSDK = (AFf1uSDK) aFe1sSDK;
                if (aFf1uSDK.getMonetizationNetwork == AFe1qSDK.SUCCESS || aFf1uSDK.getRevenue == 1) {
                    AFg1nSDK aFg1nSDK = new AFg1nSDK(aFf1uSDK, AFa1uSDK.this.getRevenue().getRevenue());
                    AFe1tSDK aFe1tSDKCopydefault2 = AFa1uSDK.this.getRevenue().copydefault();
                    aFe1tSDKCopydefault2.getRevenue.execute(aFe1tSDKCopydefault2.new AnonymousClass5(aFg1nSDK));
                }
            }
            AFh1uSDK aFh1uSDKAfErrorLogForExcManagerOnly = AFa1uSDK.this.getRevenue().afErrorLogForExcManagerOnly();
            if (aFh1uSDKAfErrorLogForExcManagerOnly != null && z3) {
                aFh1uSDKAfErrorLogForExcManagerOnly.AFAdRevenueData((AFf1uSDK) aFe1sSDK, new d(this, 0));
            }
            if (aFe1qSDK == AFe1qSDK.SUCCESS) {
                AFa1uSDK aFa1uSDK = AFa1uSDK.this;
                aFa1uSDK.getCurrencyIso4217Code(aFa1uSDK.component3).getMonetizationNetwork("sentSuccessfully", "true");
                if (!(aFe1sSDK instanceof AFf1vSDK) && (monetizationNetwork = new AFg1ySDK(AFa1uSDK.this.component3).getMonetizationNetwork()) != null && monetizationNetwork.getCurrencyIso4217Code) {
                    String str = monetizationNetwork.getRevenue;
                    AFLogger.INSTANCE.d(AFg1cSDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                    AFd1zSDK revenue2 = ((AFa1uSDK) AFa1uSDK.getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis())).getRevenue();
                    AFf1vSDK aFf1vSDK = new AFf1vSDK(str, revenue2);
                    AFe1tSDK aFe1tSDKCopydefault3 = revenue2.copydefault();
                    aFe1tSDKCopydefault3.getRevenue.execute(aFe1tSDKCopydefault3.new AnonymousClass5(aFf1vSDK));
                }
                ResponseNetwork responseNetwork = aFf1rSDK.areAllFieldsValid;
                if (responseNetwork != null && (revenue = AFa1oSDK.getRevenue((String) responseNetwork.getBody())) != null) {
                    AFa1uSDK.this.component2 = revenue.optBoolean("send_background", false);
                }
                if (z3) {
                    AFa1uSDK.this.getMediationNetwork = System.currentTimeMillis();
                }
            }
        }
    }

    static {
        component4();
        getMonetizationNetwork = "383";
        AFAdRevenueData = "6.18";
        getRevenue = null;
        component1 = new AFa1uSDK();
        int i7 = AFInAppEventParameterName + 9;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @VisibleForTesting
    public AFa1uSDK() {
        getRevenue().afErrorLog().getMediationNetwork();
        getRevenue().afErrorLog().getRevenue();
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        Boolean bool = (Boolean) objArr[1];
        boolean zBooleanValue = bool.booleanValue();
        int i7 = AFLogger + 119;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 != 0) {
            AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(zBooleanValue)));
            getRevenue(new Object[]{AppsFlyerProperties.DISABLE_NETWORK_DATA, bool}, 631714243, -631714232, (int) System.currentTimeMillis());
            return null;
        }
        AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(zBooleanValue)));
        getRevenue(new Object[]{AppsFlyerProperties.DISABLE_NETWORK_DATA, bool}, 631714243, -631714232, (int) System.currentTimeMillis());
        throw null;
    }

    private static /* synthetic */ Object AFInAppEventType(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        String[] strArr = (String[]) objArr[1];
        AFInAppEventParameterName = (AFLogger + 79) % 128;
        aFa1uSDK.getRevenue().copy().getMonetizationNetwork("setUserEmails", strArr);
        aFa1uSDK.setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        int i7 = AFLogger + 101;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object AFKeystoreWrapper(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        String[] strArr = (String[]) objArr[1];
        aFa1uSDK.getRevenue().i().getCurrencyIso4217Code = new AFb1tSDK(strArr);
        int i7 = AFLogger + 53;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (r8.toString().isEmpty() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if (r2 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r8 = r1.getRevenue().e();
        r0 = new java.lang.StringBuilder("Context is \"");
        r0.append(r2);
        r0.append("\"");
        r8.getRevenue(r0.toString(), com.appsflyer.deeplink.DeepLinkResult.Error.NETWORK);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        r1.getMediationNetwork(r2);
        r1.getRevenue().e().g_(com.appsflyer.internal.AFa1gSDK.getCurrencyIso4217Code(r1.getRevenue().afInfoLog()), android.net.Uri.parse(r8.toString()));
        r8 = com.appsflyer.internal.AFa1uSDK.AFInAppEventParameterName + 109;
        com.appsflyer.internal.AFa1uSDK.AFLogger = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008a, code lost:
    
        if ((r8 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r8.toString().isEmpty() != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object areAllFieldsValid(java.lang.Object[] r8) {
        /*
            r0 = 0
            r1 = r8[r0]
            com.appsflyer.internal.AFa1uSDK r1 = (com.appsflyer.internal.AFa1uSDK) r1
            r2 = 1
            r2 = r8[r2]
            android.content.Context r2 = (android.content.Context) r2
            r3 = 2
            r8 = r8[r3]
            java.net.URI r8 = (java.net.URI) r8
            int r4 = com.appsflyer.internal.AFa1uSDK.AFInAppEventParameterName
            int r5 = r4 + 49
            int r5 = r5 % 128
            com.appsflyer.internal.AFa1uSDK.AFLogger = r5
            java.lang.String r5 = "\""
            r6 = 0
            if (r8 == 0) goto L8e
            int r4 = r4 + 31
            int r7 = r4 % 128
            com.appsflyer.internal.AFa1uSDK.AFLogger = r7
            int r4 = r4 % r3
            if (r4 == 0) goto L33
            java.lang.String r4 = r8.toString()
            boolean r4 = r4.isEmpty()
            r7 = 13
            int r7 = r7 / r0
            if (r4 == 0) goto L3e
            goto L8e
        L33:
            java.lang.String r0 = r8.toString()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3e
            goto L8e
        L3e:
            if (r2 != 0) goto L5f
            com.appsflyer.internal.AFd1zSDK r8 = r1.getRevenue()
            com.appsflyer.internal.AFa1mSDK r8 = r8.e()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Context is \""
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.appsflyer.deeplink.DeepLinkResult$Error r1 = com.appsflyer.deeplink.DeepLinkResult.Error.NETWORK
            r8.getRevenue(r0, r1)
            return r6
        L5f:
            r1.getMediationNetwork(r2)
            com.appsflyer.internal.AFd1zSDK r0 = r1.getRevenue()
            com.appsflyer.internal.AFa1mSDK r0 = r0.e()
            com.appsflyer.internal.AFd1zSDK r1 = r1.getRevenue()
            com.appsflyer.internal.AFa1hSDK r1 = r1.afInfoLog()
            com.appsflyer.internal.AFa1gSDK r1 = com.appsflyer.internal.AFa1gSDK.getCurrencyIso4217Code(r1)
            java.lang.String r8 = r8.toString()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            r0.g_(r1, r8)
            int r8 = com.appsflyer.internal.AFa1uSDK.AFInAppEventParameterName
            int r8 = r8 + 109
            int r0 = r8 % 128
            com.appsflyer.internal.AFa1uSDK.AFLogger = r0
            int r8 = r8 % r3
            if (r8 != 0) goto L8d
            return r6
        L8d:
            throw r6
        L8e:
            com.appsflyer.internal.AFd1zSDK r0 = r1.getRevenue()
            com.appsflyer.internal.AFa1mSDK r0 = r0.e()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Link is \""
            r1.<init>(r2)
            r1.append(r8)
            r1.append(r5)
            java.lang.String r8 = r1.toString()
            com.appsflyer.deeplink.DeepLinkResult$Error r1 = com.appsflyer.deeplink.DeepLinkResult.Error.NETWORK
            r0.getRevenue(r8, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1uSDK.areAllFieldsValid(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r3.getResources().getIdentifier("appsflyer_data_extraction_rules", "xml", r3.getPackageName()) != 0) goto L18;
     */
    @android.annotation.SuppressLint({"DiscouragedApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c_(android.content.Context r3, android.content.pm.PackageInfo r4) {
        /*
            android.content.pm.ApplicationInfo r4 = r4.applicationInfo     // Catch: java.lang.Throwable -> L8e
            if (r4 == 0) goto L8d
            int r0 = com.appsflyer.internal.AFa1uSDK.AFLogger
            int r0 = r0 + 71
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1uSDK.AFInAppEventParameterName = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L89
            int r4 = r4.flags     // Catch: java.lang.Throwable -> L8e
            r0 = 32768(0x8000, float:4.5918E-41)
            r4 = r4 & r0
            if (r4 == 0) goto L8d
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L8e
            r0 = 31
            java.lang.String r1 = "xml"
            r2 = 1
            if (r4 < r0) goto L65
            int r4 = com.appsflyer.internal.AFa1uSDK.AFInAppEventParameterName
            int r4 = r4 + 29
            int r0 = r4 % 128
            com.appsflyer.internal.AFa1uSDK.AFLogger = r0
            int r4 = r4 % 2
            java.lang.String r0 = "appsflyer_data_extraction_rules"
            if (r4 == 0) goto L43
            android.content.res.Resources r4 = r3.getResources()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L8e
            int r3 = r4.getIdentifier(r0, r1, r3)     // Catch: java.lang.Throwable -> L8e
            r4 = 76
            int r4 = r4 / 0
            if (r3 == 0) goto L5b
            goto L51
        L43:
            android.content.res.Resources r4 = r3.getResources()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L8e
            int r3 = r4.getIdentifier(r0, r1, r3)     // Catch: java.lang.Throwable -> L8e
            if (r3 == 0) goto L5b
        L51:
            com.appsflyer.AFLogger r3 = com.appsflyer.AFLogger.INSTANCE     // Catch: java.lang.Throwable -> L8e
            com.appsflyer.internal.AFg1cSDK r4 = com.appsflyer.internal.AFg1cSDK.GENERAL     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data"
            r3.i(r4, r0, r2)     // Catch: java.lang.Throwable -> L8e
            return
        L5b:
            com.appsflyer.AFLogger r3 = com.appsflyer.AFLogger.INSTANCE     // Catch: java.lang.Throwable -> L8e
            com.appsflyer.internal.AFg1cSDK r4 = com.appsflyer.internal.AFg1cSDK.GENERAL     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = "'allowBackup' is set to true; appsflyer_data_extraction_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <data-extraction-rules> both in <device-transfer> and <cloud-backup>.\nIf Appsflyer's Purchase Connector is in use then you also must add to <device-transfer> and <cloud-backup> the following excludes: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>"
            r3.w(r4, r0, r2)     // Catch: java.lang.Throwable -> L8e
            return
        L65:
            android.content.res.Resources r4 = r3.getResources()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = "appsflyer_backup_rules"
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L8e
            int r3 = r4.getIdentifier(r0, r1, r3)     // Catch: java.lang.Throwable -> L8e
            if (r3 == 0) goto L7f
            com.appsflyer.AFLogger r3 = com.appsflyer.AFLogger.INSTANCE     // Catch: java.lang.Throwable -> L8e
            com.appsflyer.internal.AFg1cSDK r4 = com.appsflyer.internal.AFg1cSDK.GENERAL     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data"
            r3.i(r4, r0, r2)     // Catch: java.lang.Throwable -> L8e
            return
        L7f:
            com.appsflyer.AFLogger r3 = com.appsflyer.AFLogger.INSTANCE     // Catch: java.lang.Throwable -> L8e
            com.appsflyer.internal.AFg1cSDK r4 = com.appsflyer.internal.AFg1cSDK.GENERAL     // Catch: java.lang.Throwable -> L8e
            java.lang.String r0 = "'allowBackup' is set to true; appsflyer_backup_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules.\nIf Appsflyer's Purchase Connector is in use then you also must add the following to your rules: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>"
            r3.w(r4, r0, r2)     // Catch: java.lang.Throwable -> L8e
            return
        L89:
            int r3 = r4.flags     // Catch: java.lang.Throwable -> L8e
            r3 = 0
            throw r3     // Catch: java.lang.Throwable -> L8e
        L8d:
            return
        L8e:
            r3 = move-exception
            com.appsflyer.AFLogger r4 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r0 = com.appsflyer.internal.AFg1cSDK.GENERAL
            java.lang.String r1 = "Exception while checking BackupRules: "
            r4.e(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1uSDK.c_(android.content.Context, android.content.pm.PackageInfo):void");
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        Intent intent = (Intent) objArr[1];
        Context context = (Context) objArr[2];
        int i7 = AFInAppEventParameterName;
        int i10 = (i7 + 59) % 128;
        AFLogger = i10;
        if (intent == null) {
            AFInAppEventParameterName = (i10 + 101) % 128;
            aFa1uSDK.getRevenue().e().getRevenue("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
            return null;
        }
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            aFa1uSDK.getMediationNetwork(applicationContext);
            aFa1uSDK.getRevenue().AFAdRevenueData().execute(new androidx.emoji2.text.j(aFa1uSDK, 5, applicationContext, intent));
            return null;
        }
        int i11 = i7 + 31;
        AFLogger = i11 % 128;
        if (i11 % 2 == 0) {
            aFa1uSDK.getRevenue().e().getRevenue("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
            return null;
        }
        aFa1uSDK.getRevenue().e().getRevenue("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public void component2() {
        try {
            Context context = getRevenue().AFInAppEventParameterName().getRevenue;
            if (!(!AFi1hSDK.getMonetizationNetwork(context))) {
                AFLogger = (AFInAppEventParameterName + 105) % 128;
                final AFi1nSDK aFi1nSDKV = getRevenue().v();
                if (aFi1nSDKV != null) {
                    AFLogger = (AFInAppEventParameterName + 27) % 128;
                    aFi1nSDKV.getRevenue(new AFi1gSDK() { // from class: com.appsflyer.internal.a
                        @Override // com.appsflyer.internal.AFi1gSDK
                        public final void onRequestFinished() {
                            this.f20403a.AFAdRevenueData(aFi1nSDKV);
                        }
                    });
                    AFInAppEventParameterName = (AFLogger + 89) % 128;
                    return;
                }
                return;
            }
            if (!AFi1hSDK.getRevenue(context)) {
                int i7 = AFLogger + 23;
                AFInAppEventParameterName = i7 % 128;
                if (i7 % 2 == 0) {
                    getRevenue().v();
                    throw null;
                }
                AFi1nSDK aFi1nSDKV2 = getRevenue().v();
                if (aFi1nSDKV2 != null) {
                    getRevenue(aFi1nSDKV2);
                    AFInAppEventParameterName = (AFLogger + 7) % 128;
                }
            }
            AFInAppEventParameterName = (AFLogger + 31) % 128;
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("Error at attempt to request PIA token", th);
            AFLogger.afRDLog("Get PIA token failed with exception:".concat(String.valueOf(th)));
        }
    }

    private static /* synthetic */ Object component3(Object[] objArr) {
        String strConcat;
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        String str = (String) objArr[1];
        Map map = (Map) objArr[2];
        AFLogger = (AFInAppEventParameterName + 21) % 128;
        AFc1fSDK aFc1fSDKI = aFa1uSDK.getRevenue().i();
        if (aFc1fSDKI.getMonetizationNetwork == null) {
            aFc1fSDKI.getMonetizationNetwork = new AFb1uSDK();
        }
        AFb1uSDK aFb1uSDK = aFc1fSDKI.getMonetizationNetwork;
        if (str == null || str.isEmpty()) {
            AFLogger.afWarnLog("Partner ID is missing or `null`");
            return null;
        }
        if (map == null || map.isEmpty()) {
            if (aFb1uSDK.getRevenue.remove(str) == null) {
                int i7 = AFInAppEventParameterName + 41;
                AFLogger = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
                strConcat = "Partner data is missing or `null`";
            } else {
                strConcat = "Cleared partner data for ".concat(str);
            }
            AFLogger.afWarnLog(strConcat);
            int i10 = AFInAppEventParameterName + 69;
            AFLogger = i10 % 128;
            if (i10 % 2 == 0) {
                return null;
            }
            throw null;
        }
        StringBuilder sb2 = new StringBuilder("Setting partner data for ");
        sb2.append(str);
        sb2.append(": ");
        sb2.append(map);
        AFLogger.afDebugLog(sb2.toString());
        int length = new JSONObject(map).toString().length();
        if (length <= 1000) {
            aFb1uSDK.getRevenue.put(str, map);
            aFb1uSDK.getCurrencyIso4217Code.remove(str);
            return null;
        }
        AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
        HashMap map2 = new HashMap();
        map2.put("error", "limit exceeded: ".concat(String.valueOf(length)));
        aFb1uSDK.getCurrencyIso4217Code.put(str, map2);
        return null;
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        AFh1qSDK aFh1qSDK = (AFh1qSDK) objArr[0];
        AFh1pSDK aFh1pSDK = (AFh1pSDK) objArr[1];
        int i7 = AFLogger;
        int i10 = i7 + 39;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (aFh1pSDK != null) {
            aFh1qSDK.getRevenue = aFh1pSDK.getRevenue;
            aFh1qSDK.equals = aFh1pSDK.getMediationNetwork;
        }
        int i11 = i7 + 21;
        AFInAppEventParameterName = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 61 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object copy(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        AFf1mSDK aFf1mSDK = (AFf1mSDK) objArr[1];
        AFLogger = (AFInAppEventParameterName + 85) % 128;
        AFd1zSDK revenue = aFa1uSDK.getRevenue();
        if (aFf1mSDK == AFf1mSDK.SUCCESS) {
            revenue.afLogForce().getMonetizationNetwork();
        }
        if (revenue.copy().AFAdRevenueData()) {
            revenue.afErrorLog().getMediationNetwork();
            AFLogger = (AFInAppEventParameterName + 49) % 128;
            return null;
        }
        int i7 = AFLogger + 75;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 != 0) {
            revenue.afErrorLog().getCurrencyIso4217Code();
            return null;
        }
        revenue.afErrorLog().getCurrencyIso4217Code();
        throw null;
    }

    private static /* synthetic */ Object copydefault(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        AFLogger = (AFInAppEventParameterName + 85) % 128;
        aFa1uSDK.getRevenue().copy().getMonetizationNetwork("setIsUpdate", String.valueOf(zBooleanValue));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, zBooleanValue);
        int i7 = AFLogger + 57;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static SharedPreferences d_(Context context) {
        AFInAppEventParameterName = (AFLogger + 105) % 128;
        if (((AFa1uSDK) getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis())).hashCode == null) {
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                ((AFa1uSDK) getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis())).hashCode = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                AFInAppEventParameterName = (AFLogger + 19) % 128;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th;
            }
        }
        return ((AFa1uSDK) getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis())).hashCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    public /* synthetic */ void e_(Context context, Intent intent) {
        Uri data;
        boolean z3;
        getMediationNetwork(context);
        AFa1mSDK aFa1mSDKE = getRevenue().e();
        AFc1qSDK revenue = getRevenue().getRevenue();
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) {
            data = null;
        } else {
            data = intent.getData();
            AFInAppEventParameterName = (AFLogger + HomeDialogState.PRIORITY_HIGHEST_111) % 128;
        }
        if (data != null) {
            int i7 = AFLogger + 3;
            AFInAppEventParameterName = i7 % 128;
            if (i7 % 2 == 0) {
                data.toString().isEmpty();
                throw null;
            }
            if (data.toString().isEmpty()) {
                z3 = false;
            } else {
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (revenue.getMonetizationNetwork("ddl_sent") && (!z3)) {
            aFa1mSDKE.getRevenue("No direct deep link", null);
        } else {
            aFa1mSDKE.f_(AFa1gSDK.getCurrencyIso4217Code(aFa1mSDKE.component2.afInfoLog()), intent, context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void equals() {
        getMediationNetwork(new AFh1rSDK());
        int i7 = AFInAppEventParameterName + 109;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            int i10 = 20 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getCurrencyIso4217Code(AFd1zSDK aFd1zSDK) {
        int i7 = AFInAppEventParameterName + 63;
        AFLogger = i7 % 128;
        int i10 = i7 % 2;
        aFd1zSDK.AFLogger().AFAdRevenueData();
        if (i10 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0172, code lost:
    
        if (r4 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0182, code lost:
    
        if (r4 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0184, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0185, code lost:
    
        r5.getMediationNetwork(r4);
        r4 = com.appsflyer.internal.AFb1mSDK.getMonetizationNetwork(r5.getRevenue().getMonetizationNetwork().AFAdRevenueData);
        com.appsflyer.internal.AFa1uSDK.AFLogger = (com.appsflyer.internal.AFa1uSDK.AFInAppEventParameterName + 123) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x019e, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object getRevenue(java.lang.Object[] r4, int r5, int r6, int r7) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1uSDK.getRevenue(java.lang.Object[], int, int, int):java.lang.Object");
    }

    private static /* synthetic */ Object hashCode(Object[] objArr) {
        int i7 = AFInAppEventParameterName + 47;
        AFLogger = i7 % 128;
        if (i7 % 2 == 0) {
            return component1;
        }
        throw null;
    }

    private static /* synthetic */ Object registerClient(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        int i7 = AFLogger + 37;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 == 0) {
            aFa1uSDK.getRevenue().afWarnLog().getCurrencyIso4217Code();
            throw null;
        }
        if (aFa1uSDK.getRevenue().afWarnLog().getCurrencyIso4217Code()) {
            aFa1uSDK.getRevenue().afWarnLog().getMonetizationNetwork();
        }
        AFi1wSDK aFi1wSDKW = aFa1uSDK.getRevenue().w();
        aFi1wSDKW.getRevenue = Build.VERSION.SDK_INT >= 31 ? new AFi1qSDK(aFi1wSDKW.getCurrencyIso4217Code) : new AFi1tSDK(aFi1wSDKW.getCurrencyIso4217Code);
        aFa1uSDK.getRevenue().AFInAppEventType().getCurrencyIso4217Code(aFa1uSDK.getRevenue().getMonetizationNetwork());
        AFh1wSDK aFh1wSDKComponent2 = aFa1uSDK.getRevenue().component2();
        aFh1wSDKComponent2.component2 = System.currentTimeMillis();
        int monetizationNetwork = aFh1wSDKComponent2.getRevenue.AFAdRevenueData.getMonetizationNetwork("appsFlyerCount", 0);
        if (monetizationNetwork == 1) {
            int i10 = AFInAppEventParameterName + 11;
            AFLogger = i10 % 128;
            if (i10 % 2 != 0) {
                aFh1wSDKComponent2.AFAdRevenueData.AFAdRevenueData("first_launch");
                throw null;
            }
            if (aFh1wSDKComponent2.AFAdRevenueData.AFAdRevenueData("first_launch")) {
                aFh1wSDKComponent2.getCurrencyIso4217Code.putAll(aFh1wSDKComponent2.getMediationNetwork("first_launch"));
            }
        }
        if (monetizationNetwork > 0) {
            int i11 = AFLogger + 93;
            AFInAppEventParameterName = i11 % 128;
            if (i11 % 2 == 0) {
                aFh1wSDKComponent2.AFAdRevenueData.AFAdRevenueData("gcd");
                throw null;
            }
            if (aFh1wSDKComponent2.AFAdRevenueData.AFAdRevenueData("gcd")) {
                int i12 = AFInAppEventParameterName + 63;
                AFLogger = i12 % 128;
                if (i12 % 2 != 0) {
                    aFh1wSDKComponent2.getMonetizationNetwork.putAll(aFh1wSDKComponent2.getMediationNetwork("gcd"));
                    throw null;
                }
                aFh1wSDKComponent2.getMonetizationNetwork.putAll(aFh1wSDKComponent2.getMediationNetwork("gcd"));
            }
        }
        aFh1wSDKComponent2.copydefault = aFh1wSDKComponent2.AFAdRevenueData.getRevenue("prev_session_dur", 0L);
        aFa1uSDK.getRevenue().component4().getMonetizationNetwork(aFa1uSDK.getMediationNetwork());
        aFa1uSDK.getRevenue().AFLogger().getMediationNetwork();
        return null;
    }

    private static /* synthetic */ Object toString(Object[] objArr) {
        String str = (String) objArr[0];
        try {
            if (!new JSONObject(str).has("pid")) {
                AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                AFInAppEventParameterName = (AFLogger + 113) % 128;
                return null;
            }
            int i7 = AFLogger + 73;
            AFInAppEventParameterName = i7 % 128;
            if (i7 % 2 != 0) {
                getMediationNetwork("preInstallName", str);
                return null;
            }
            getMediationNetwork("preInstallName", str);
            throw null;
        } catch (JSONException e10) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e10);
            return null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        AFInAppEventParameterName = (AFLogger + 7) % 128;
        List<String> listAsList = Arrays.asList(strArr);
        List<List<String>> list = getRevenue().e().getMediationNetwork;
        if (list.contains(listAsList)) {
            return;
        }
        int i7 = AFInAppEventParameterName + 35;
        AFLogger = i7 % 128;
        if (i7 % 2 == 0) {
            list.add(listAsList);
        } else {
            list.add(listAsList);
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z3) {
        int i7 = AFInAppEventParameterName + 107;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            getRevenue().copy().getMonetizationNetwork("anonymizeUser", String.valueOf(z3));
        } else {
            getRevenue().copy().getMonetizationNetwork("anonymizeUser", String.valueOf(z3));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z3);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        AFInAppEventParameterName = (AFLogger + 123) % 128;
        AFa1mSDK aFa1mSDKE = getRevenue().e();
        aFa1mSDKE.getMonetizationNetwork = str;
        aFa1mSDKE.getRevenue = map;
        int i7 = AFLogger + 99;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public final void b_(Context context, Intent intent) {
        AFj1lSDK aFj1lSDK = new AFj1lSDK(intent);
        if (aFj1lSDK.getCurrencyIso4217Code("appsflyer_preinstall") != null) {
            AFLogger = (AFInAppEventParameterName + 49) % 128;
            getRevenue(new Object[]{aFj1lSDK.getCurrencyIso4217Code("appsflyer_preinstall")}, -851629931, 851629949, (int) System.currentTimeMillis());
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String currencyIso4217Code = aFj1lSDK.getCurrencyIso4217Code(Constants.REFERRER);
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(currencyIso4217Code)));
        if (currencyIso4217Code != null) {
            getCurrencyIso4217Code(context).getMonetizationNetwork(Constants.REFERRER, currencyIso4217Code);
            AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
            appsFlyerProperties.set("AF_REFERRER", currencyIso4217Code);
            appsFlyerProperties.getMonetizationNetwork = currencyIso4217Code;
            if (AppsFlyerProperties.getInstance().getCurrencyIso4217Code()) {
                AFInAppEventParameterName = (AFLogger + 91) % 128;
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                getRevenue(new Object[]{this, context, AFh1xSDK.onReceive}, 712451552, -712451552, System.identityHashCode(this));
                getRevenue(currencyIso4217Code);
                AFLogger = (AFInAppEventParameterName + 69) % 128;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void disableAppSetId() {
        AFLogger = (AFInAppEventParameterName + 101) % 128;
        getRevenue().i().component1 = true;
        AFLogger = (AFInAppEventParameterName + 89) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z3) {
        int i7 = AFLogger + 21;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 == 0) {
            getRevenue().unregisterClient().getRevenue(z3);
            throw null;
        }
        getRevenue().unregisterClient().getRevenue(z3);
        int i10 = AFInAppEventParameterName + 93;
        AFLogger = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableTCFDataCollection(boolean z3) {
        AFLogger = (AFInAppEventParameterName + 83) % 128;
        getMediationNetwork(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z3));
        int i7 = AFInAppEventParameterName + 105;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            int i10 = 40 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Nullable
    public final String getAppsFlyerUID(@NonNull Context context) {
        return (String) getRevenue(new Object[]{this, context}, -116015840, 116015849, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        int i7 = AFInAppEventParameterName + 93;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            getMediationNetwork(context);
            getRevenue().getMonetizationNetwork().getMonetizationNetwork(context);
            throw null;
        }
        getMediationNetwork(context);
        String monetizationNetwork = getRevenue().getMonetizationNetwork().getMonetizationNetwork(context);
        AFLogger = (AFInAppEventParameterName + 27) % 128;
        return monetizationNetwork;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        int i7 = AFInAppEventParameterName + 11;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            getRevenue().AFKeystoreWrapper().AFAdRevenueData();
            throw null;
        }
        String strAFAdRevenueData = getRevenue().AFKeystoreWrapper().AFAdRevenueData();
        int i10 = AFInAppEventParameterName + 43;
        AFLogger = i10 % 128;
        if (i10 % 2 == 0) {
            return strAFAdRevenueData;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        return (String) getRevenue(new Object[]{this}, -886536560, 886536570, System.identityHashCode(this));
    }

    public final void getMediationNetwork(@NonNull Context context) {
        AFc1dSDK aFc1dSDK = this.copydefault;
        if (context != null) {
            int i7 = AFInAppEventParameterName + 109;
            AFLogger = i7 % 128;
            if (i7 % 2 != 0) {
                AFc1eSDK aFc1eSDK = aFc1dSDK.AFAdRevenueData;
                throw null;
            }
            AFc1eSDK aFc1eSDK2 = aFc1dSDK.AFAdRevenueData;
            if (context != null) {
                aFc1eSDK2.getRevenue = context.getApplicationContext();
            }
        }
        int i10 = AFLogger + 19;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 79 / 0;
        }
    }

    public final void getMonetizationNetwork(Context context, String str) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        AFInAppEventParameterName = (AFLogger + 107) % 128;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String currencyIso4217Code = getCurrencyIso4217Code(context).getCurrencyIso4217Code("extraReferrers", (String) null);
                if (currencyIso4217Code == null) {
                    jSONObject = new JSONObject();
                    jSONArray = new JSONArray();
                    AFLogger = (AFInAppEventParameterName + 15) % 128;
                } else {
                    JSONObject jSONObject2 = new JSONObject(currencyIso4217Code);
                    jSONArray = jSONObject2.has(str) ? new JSONArray((String) jSONObject2.get(str)) : new JSONArray();
                    jSONObject = jSONObject2;
                }
                if (jSONArray.length() < 5) {
                    jSONArray.put(jCurrentTimeMillis);
                }
                if (jSONObject.length() >= 4) {
                    int i7 = AFInAppEventParameterName + 45;
                    AFLogger = i7 % 128;
                    if (i7 % 2 != 0) {
                        getMediationNetwork(jSONObject);
                        throw null;
                    }
                    getMediationNetwork(jSONObject);
                }
                jSONObject.put(str, jSONArray.toString());
                getCurrencyIso4217Code(context).getMonetizationNetwork("extraReferrers", jSONObject.toString());
            } catch (Throwable th) {
                StringBuilder sb2 = new StringBuilder("Couldn't save referrer - ");
                sb2.append(str);
                sb2.append(": ");
                AFLogger.afErrorLog(sb2.toString(), th);
            }
        } catch (JSONException e10) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e10);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string != null) {
            int i7 = (AFLogger + 83) % 128;
            AFInAppEventParameterName = i7;
            AFLogger = (i7 + 125) % 128;
            return string;
        }
        String str = (String) getRevenue(new Object[]{this, context, "AF_STORE"}, 1863481346, -1863481322, System.identityHashCode(this));
        if (str == null) {
            AFLogger.afInfoLog("No out-of-store value set");
            return null;
        }
        int i10 = AFInAppEventParameterName + 99;
        AFLogger = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 16 / 0;
        }
        return str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        AFInAppEventParameterName = (AFLogger + 65) % 128;
        getRevenue().copy().getMonetizationNetwork("getSdkVersion", new String[0]);
        String strComponent4 = AFc1pSDK.component4();
        AFInAppEventParameterName = (AFLogger + 89) % 128;
        return strComponent4;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(@NonNull String str, AppsFlyerConversionListener appsFlyerConversionListener, @NonNull Context context) {
        String str2;
        if (!this.toString) {
            this.toString = true;
            getRevenue().AFInAppEventType().getMediationNetwork(str);
            if (context != null) {
                getMediationNetwork(context);
                Application applicationO_ = AFj1gSDK.O_(context);
                if (applicationO_ != null) {
                    this.component3 = applicationO_;
                    final int i7 = 0;
                    getRevenue().AFAdRevenueData().execute(new Runnable(this) { // from class: com.appsflyer.internal.c

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ AFa1uSDK f20407b;

                        {
                            this.f20407b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i7) {
                                case 0:
                                    this.f20407b.copy();
                                    break;
                                case 1:
                                    this.f20407b.component2();
                                    break;
                                default:
                                    this.f20407b.equals();
                                    break;
                            }
                        }
                    });
                    if (AFi1hSDK.getMediationNetwork(getRevenue().getMonetizationNetwork(), getRevenue().AFInAppEventType())) {
                        final int i10 = 1;
                        getRevenue().AFAdRevenueData().execute(new Runnable(this) { // from class: com.appsflyer.internal.c

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ AFa1uSDK f20407b;

                            {
                                this.f20407b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        this.f20407b.copy();
                                        break;
                                    case 1:
                                        this.f20407b.component2();
                                        break;
                                    default:
                                        this.f20407b.equals();
                                        break;
                                }
                            }
                        });
                    }
                    getRevenue().copydefault().getMediationNetwork.add(new AFa1zSDK());
                    AFe1tSDK aFe1tSDKCopydefault = getRevenue().copydefault();
                    aFe1tSDKCopydefault.getRevenue.execute(aFe1tSDKCopydefault.new AnonymousClass5(new AFe1jSDK(getRevenue())));
                    getRevenue().afLogForce().getMediationNetwork(new b(this));
                    AFj1rSDK aFj1rSDKEquals = getRevenue().equals();
                    final int i11 = 2;
                    Runnable runnable = new Runnable(this) { // from class: com.appsflyer.internal.c

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ AFa1uSDK f20407b;

                        {
                            this.f20407b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    this.f20407b.copy();
                                    break;
                                case 1:
                                    this.f20407b.component2();
                                    break;
                                default:
                                    this.f20407b.equals();
                                    break;
                            }
                        }
                    };
                    AFi1aSDK mediationNetwork = aFj1rSDKEquals.getMediationNetwork(runnable);
                    Runnable mediationNetwork2 = aFj1rSDKEquals.getMediationNetwork(mediationNetwork, runnable);
                    aFj1rSDKEquals.AFAdRevenueData.add(mediationNetwork);
                    aFj1rSDKEquals.AFAdRevenueData.add(new AFj1qSDK(aFj1rSDKEquals.getCurrencyIso4217Code.getMonetizationNetwork(), mediationNetwork2));
                    aFj1rSDKEquals.AFAdRevenueData.add(new AFj1wSDK(mediationNetwork2, aFj1rSDKEquals.getCurrencyIso4217Code, new AFi1bSDK()));
                    aFj1rSDKEquals.AFAdRevenueData.add(new AFj1uSDK(mediationNetwork2, aFj1rSDKEquals.getCurrencyIso4217Code));
                    aFj1rSDKEquals.AFAdRevenueData.add(new AFj1sSDK(aFj1rSDKEquals.getCurrencyIso4217Code.AFAdRevenueData(), aFj1rSDKEquals.getCurrencyIso4217Code.getMonetizationNetwork(), mediationNetwork2));
                    aFj1rSDKEquals.getMonetizationNetwork(mediationNetwork2);
                    for (AFj1tSDK aFj1tSDK : (AFj1tSDK[]) aFj1rSDKEquals.AFAdRevenueData.toArray(new AFj1tSDK[0])) {
                        aFj1tSDK.getMediationNetwork(aFj1rSDKEquals.getCurrencyIso4217Code.AFInAppEventParameterName().getRevenue);
                    }
                    if (!aFj1rSDKEquals.getMonetizationNetwork()) {
                        aFj1rSDKEquals.getMediationNetwork(aFj1rSDKEquals.getCurrencyIso4217Code.AFInAppEventParameterName().getRevenue, mediationNetwork2, aFj1rSDKEquals.getCurrencyIso4217Code);
                    }
                }
            } else {
                AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
            }
            AFd1oSDK aFd1oSDKCopy = getRevenue().copy();
            if (appsFlyerConversionListener == null) {
                AFLogger = (AFInAppEventParameterName + 73) % 128;
                str2 = BuildConfig.TRAVIS;
            } else {
                AFLogger = (AFInAppEventParameterName + 33) % 128;
                str2 = "conversionDataListener";
            }
            aFd1oSDKCopy.getMonetizationNetwork("init", str, str2);
            AFLogger.INSTANCE.force(AFg1cSDK.GENERAL, "Initializing AppsFlyer SDK: (v6.18.1." + getMonetizationNetwork + ")");
            this.getCurrencyIso4217Code = appsFlyerConversionListener;
            return this;
        }
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        AFInAppEventParameterName = (AFLogger + MsgEvent.MSG_EVENT_STOP_FOREGROUND) % 128;
        getMediationNetwork(context);
        boolean currencyIso4217Code = getRevenue().getMonetizationNetwork().getCurrencyIso4217Code(context);
        AFLogger = (AFInAppEventParameterName + 33) % 128;
        return currencyIso4217Code;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        AFLogger = (AFInAppEventParameterName + 65) % 128;
        boolean mediationNetwork = getRevenue().AFInAppEventType().getMediationNetwork();
        AFLogger = (AFInAppEventParameterName + 7) % 128;
        return mediationNetwork;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logAdRevenue(@NonNull AFAdRevenueData aFAdRevenueData, @Nullable Map<String, Object> map) {
        if (!this.toString) {
            int i7 = AFLogger + 97;
            AFInAppEventParameterName = i7 % 128;
            if (i7 % 2 == 0) {
                getMonetizationNetwork("logAdRevenue");
                throw null;
            }
            getMonetizationNetwork("logAdRevenue");
            int i10 = AFInAppEventParameterName + 53;
            AFLogger = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            return;
        }
        if (!aFAdRevenueData.areAllFieldsValid()) {
            AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "Invalid ad revenue parameters provided");
            return;
        }
        if (!getRevenue().AFInAppEventType().getMediationNetwork()) {
            if (!AFk1ySDK.getMediationNetwork(getRevenue().AFInAppEventType().getRevenue())) {
                getMonetizationNetwork(new AFh1oSDK(aFAdRevenueData, map));
                return;
            } else {
                AFInAppEventParameterName = (AFLogger + 107) % 128;
                copydefault();
                return;
            }
        }
        int i11 = AFInAppEventParameterName + 47;
        AFLogger = i11 % 128;
        if (i11 % 2 == 0) {
            AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "SDK is stopped");
        } else {
            AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "SDK is stopped");
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        AFInAppEventParameterName = (AFLogger + 113) % 128;
        logEvent(context, str, map, null);
        AFInAppEventParameterName = (AFLogger + 27) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d2, double d10) {
        getRevenue().copy().getMonetizationNetwork("logLocation", String.valueOf(d2), String.valueOf(d10));
        HashMap map = new HashMap();
        map.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d10));
        map.put(AFInAppEventParameterName.LATITUDE, Double.toString(d2));
        AFAdRevenueData(context, AFInAppEventType.LOCATION_COORDINATES, map);
        int i7 = AFLogger + 75;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        AFInAppEventParameterName = (AFLogger + 71) % 128;
        getRevenue().copy().getMonetizationNetwork("logSession", new String[0]);
        getRevenue().copy().getMediationNetwork();
        getRevenue(new Object[]{this, context, AFh1xSDK.logSession}, 712451552, -712451552, System.identityHashCode(this));
        AFAdRevenueData(context, null, null);
        AFLogger = (AFInAppEventParameterName + 41) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        AFLogger = (AFInAppEventParameterName + 31) % 128;
        getRevenue().force().AFAdRevenueData();
        AFLogger = (AFInAppEventParameterName + 63) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void performOnAppAttribution(@NonNull Context context, @NonNull URI uri) {
        getRevenue(new Object[]{this, context, uri}, -638329021, 638329035, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(@NonNull Intent intent, @NonNull Context context) {
        getRevenue(new Object[]{this, intent, context}, -1125578390, 1125578395, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        int i7 = AFLogger + 39;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 == 0) {
            getRevenue().copy().getMonetizationNetwork("registerConversionListener", new String[1]);
        } else {
            getRevenue().copy().getMonetizationNetwork("registerConversionListener", new String[0]);
        }
        getMediationNetwork(appsFlyerConversionListener);
        AFLogger = (AFInAppEventParameterName + 81) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
    
        if ((r4 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        com.appsflyer.internal.AFa1uSDK.getRevenue = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r5 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        com.appsflyer.internal.AFa1uSDK.AFLogger = (com.appsflyer.internal.AFa1uSDK.AFInAppEventParameterName + 25) % 128;
        com.appsflyer.AFLogger.afDebugLog("registerValidatorListener null listener");
        r4 = com.appsflyer.internal.AFa1uSDK.AFInAppEventParameterName + com.transsnet.palmpay.aidl.MsgEvent.MSG_EVENT_STOP_FOREGROUND;
        com.appsflyer.internal.AFa1uSDK.AFLogger = r4 % 128;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void registerValidatorListener(android.content.Context r4, com.appsflyer.AppsFlyerInAppPurchaseValidatorListener r5) {
        /*
            r3 = this;
            int r4 = com.appsflyer.internal.AFa1uSDK.AFInAppEventParameterName
            int r4 = r4 + 29
            int r0 = r4 % 128
            com.appsflyer.internal.AFa1uSDK.AFLogger = r0
            int r4 = r4 % 2
            java.lang.String r0 = "registerValidatorListener called"
            java.lang.String r1 = "registerValidatorListener"
            if (r4 == 0) goto L24
            com.appsflyer.internal.AFd1zSDK r4 = r3.getRevenue()
            com.appsflyer.internal.AFd1oSDK r4 = r4.copy()
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r4.getMonetizationNetwork(r1, r2)
            com.appsflyer.AFLogger.afDebugLog(r0)
            if (r5 != 0) goto L53
            goto L37
        L24:
            com.appsflyer.internal.AFd1zSDK r4 = r3.getRevenue()
            com.appsflyer.internal.AFd1oSDK r4 = r4.copy()
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            r4.getMonetizationNetwork(r1, r2)
            com.appsflyer.AFLogger.afDebugLog(r0)
            if (r5 != 0) goto L53
        L37:
            int r4 = com.appsflyer.internal.AFa1uSDK.AFInAppEventParameterName
            int r4 = r4 + 25
            int r4 = r4 % 128
            com.appsflyer.internal.AFa1uSDK.AFLogger = r4
            java.lang.String r4 = "registerValidatorListener null listener"
            com.appsflyer.AFLogger.afDebugLog(r4)
            int r4 = com.appsflyer.internal.AFa1uSDK.AFInAppEventParameterName
            int r4 = r4 + 103
            int r5 = r4 % 128
            com.appsflyer.internal.AFa1uSDK.AFLogger = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L51
            return
        L51:
            r4 = 0
            throw r4
        L53:
            com.appsflyer.internal.AFa1uSDK.getRevenue = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1uSDK.registerValidatorListener(android.content.Context, com.appsflyer.AppsFlyerInAppPurchaseValidatorListener):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        PurchaseHandler purchaseHandlerAreAllFieldsValid;
        int i7 = AFLogger + 99;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 == 0) {
            getMediationNetwork(context);
            purchaseHandlerAreAllFieldsValid = getRevenue().areAllFieldsValid();
            String[] strArr = new String[0];
            strArr[0] = "purchases";
            if (!purchaseHandlerAreAllFieldsValid.getCurrencyIso4217Code(map, purchaseValidationCallback, strArr)) {
                return;
            }
        } else {
            getMediationNetwork(context);
            purchaseHandlerAreAllFieldsValid = getRevenue().areAllFieldsValid();
            if (!purchaseHandlerAreAllFieldsValid.getCurrencyIso4217Code(map, purchaseValidationCallback, "purchases")) {
                return;
            }
        }
        AFe1cSDK aFe1cSDK = new AFe1cSDK(map, purchaseValidationCallback, purchaseHandlerAreAllFieldsValid.AFAdRevenueData);
        AFe1tSDK aFe1tSDK = purchaseHandlerAreAllFieldsValid.getMonetizationNetwork;
        aFe1tSDK.getRevenue.execute(aFe1tSDK.new AnonymousClass5(aFe1cSDK));
        AFLogger = (AFInAppEventParameterName + 49) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        PurchaseHandler purchaseHandlerAreAllFieldsValid;
        int i7 = AFLogger + 77;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 == 0) {
            getMediationNetwork(context);
            purchaseHandlerAreAllFieldsValid = getRevenue().areAllFieldsValid();
            String[] strArr = new String[0];
            strArr[1] = "subscriptions";
            if (!purchaseHandlerAreAllFieldsValid.getCurrencyIso4217Code(map, purchaseValidationCallback, strArr)) {
                return;
            }
        } else {
            getMediationNetwork(context);
            purchaseHandlerAreAllFieldsValid = getRevenue().areAllFieldsValid();
            if (!purchaseHandlerAreAllFieldsValid.getCurrencyIso4217Code(map, purchaseValidationCallback, "subscriptions")) {
                return;
            }
        }
        AFe1oSDK aFe1oSDK = new AFe1oSDK(map, purchaseValidationCallback, purchaseHandlerAreAllFieldsValid.AFAdRevenueData);
        AFe1tSDK aFe1tSDK = purchaseHandlerAreAllFieldsValid.getMonetizationNetwork;
        aFe1tSDK.getRevenue.execute(aFe1tSDK.new AnonymousClass5(aFe1oSDK));
        AFInAppEventParameterName = (AFLogger + 23) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01a0  */
    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPushNotificationData(@Nullable Activity activity) {
        int i7;
        long jLongValue;
        if (activity != null && activity.getIntent() != null) {
            AFd1oSDK aFd1oSDKCopy = getRevenue().copy();
            String localClassName = activity.getLocalClassName();
            StringBuilder sb2 = new StringBuilder("activity_intent_");
            sb2.append(activity.getIntent().toString());
            aFd1oSDKCopy.getMonetizationNetwork("sendPushNotificationData", localClassName, sb2.toString());
        } else if (activity != null) {
            getRevenue().copy().getMonetizationNetwork("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
        } else {
            getRevenue().copy().getMonetizationNetwork("sendPushNotificationData", "activity_null");
        }
        AFc1fSDK aFc1fSDKI = getRevenue().i();
        String currencyIso4217Code = getCurrencyIso4217Code(activity);
        aFc1fSDKI.AFAdRevenueData = currencyIso4217Code;
        if (currencyIso4217Code != null) {
            int i10 = AFLogger + 71;
            AFInAppEventParameterName = i10 % 128;
            int i11 = 2;
            if (i10 % 2 == 0) {
                System.currentTimeMillis();
                throw null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.copy == null) {
                AFLogger.afInfoLog("pushes: initializing pushes history..");
                this.copy = new ConcurrentHashMap();
                i7 = 2;
                jLongValue = jCurrentTimeMillis;
            } else {
                try {
                    long j6 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000L);
                    Iterator<Long> it = this.copy.keySet().iterator();
                    AFInAppEventParameterName = (AFLogger + 91) % 128;
                    jLongValue = jCurrentTimeMillis;
                    while (it.hasNext()) {
                        try {
                            Long next = it.next();
                            i7 = i11;
                            try {
                                JSONObject jSONObject = new JSONObject(aFc1fSDKI.AFAdRevenueData);
                                JSONObject jSONObject2 = new JSONObject(this.copy.get(next));
                                Iterator<Long> it2 = it;
                                if (jSONObject.opt("pid").equals(jSONObject2.opt("pid"))) {
                                    AFLogger = (AFInAppEventParameterName + 47) % 128;
                                    if (jSONObject.opt("c").equals(jSONObject2.opt("c"))) {
                                        StringBuilder sb3 = new StringBuilder("PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: ");
                                        sb3.append(jSONObject2);
                                        sb3.append(", new: ");
                                        sb3.append(jSONObject);
                                        sb3.append(")");
                                        AFLogger.afInfoLog(sb3.toString());
                                        aFc1fSDKI.AFAdRevenueData = null;
                                        return;
                                    }
                                }
                                if (jCurrentTimeMillis - next.longValue() > j6) {
                                    int i12 = AFLogger + 13;
                                    AFInAppEventParameterName = i12 % 128;
                                    if (i12 % 2 == 0) {
                                        this.copy.remove(next);
                                        int i13 = 42 / 0;
                                    } else {
                                        this.copy.remove(next);
                                    }
                                }
                                if (next.longValue() <= jLongValue) {
                                    int i14 = AFInAppEventParameterName + 87;
                                    AFLogger = i14 % 128;
                                    if (i14 % 2 != 0) {
                                        next.longValue();
                                        throw null;
                                    }
                                    jLongValue = next.longValue();
                                }
                                i11 = i7;
                                it = it2;
                            } catch (Throwable th) {
                                th = th;
                                AFLogger.afErrorLog("Error while handling push notification measurement: ".concat(th.getClass().getSimpleName()), th);
                                if (this.copy.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", i7)) {
                                    StringBuilder sb4 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                                    sb4.append(jLongValue);
                                    sb4.append(")");
                                    AFLogger.afInfoLog(sb4.toString());
                                    this.copy.remove(Long.valueOf(jLongValue));
                                }
                                this.copy.put(Long.valueOf(jCurrentTimeMillis), aFc1fSDKI.AFAdRevenueData);
                                start(activity);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            i7 = i11;
                        }
                    }
                    i7 = i11;
                } catch (Throwable th3) {
                    th = th3;
                    i7 = 2;
                    jLongValue = jCurrentTimeMillis;
                }
            }
            if (this.copy.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", i7)) {
                StringBuilder sb5 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                sb5.append(jLongValue);
                sb5.append(")");
                AFLogger.afInfoLog(sb5.toString());
                this.copy.remove(Long.valueOf(jLongValue));
            }
            this.copy.put(Long.valueOf(jCurrentTimeMillis), aFc1fSDKI.AFAdRevenueData);
            start(activity);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        AFLogger = (AFInAppEventParameterName + 67) % 128;
        if (map != null) {
            getRevenue().copy().getMonetizationNetwork("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
        }
        AFInAppEventParameterName = (AFLogger + 5) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        int i7 = AFInAppEventParameterName + 49;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            AFd1oSDK aFd1oSDKCopy = getRevenue().copy();
            String[] strArr = new String[1];
            strArr[1] = str;
            aFd1oSDKCopy.getMonetizationNetwork("setAndroidIdData", strArr);
        } else {
            getRevenue().copy().getMonetizationNetwork("setAndroidIdData", str);
        }
        getRevenue().i().getMediationNetwork = str;
        int i10 = AFInAppEventParameterName + 55;
        AFLogger = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 64 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        int i7 = AFLogger + 79;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 == 0) {
            AFd1oSDK aFd1oSDKCopy = getRevenue().copy();
            String[] strArr = new String[1];
            strArr[1] = str;
            aFd1oSDKCopy.getMonetizationNetwork("setAppId", strArr);
        } else {
            getRevenue().copy().getMonetizationNetwork("setAppId", str);
        }
        getMediationNetwork(AppsFlyerProperties.APP_ID, str);
        AFInAppEventParameterName = (AFLogger + 115) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x004e  */
    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppInviteOneLink(String str) {
        int i7 = AFLogger + 19;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 != 0) {
            getRevenue().copy().getMonetizationNetwork("setAppInviteOneLink", str);
            AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
            if (str != null) {
                AFInAppEventParameterName = (AFLogger + 85) % 128;
                if (!str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
                }
            }
            getMediationNetwork(AppsFlyerProperties.ONELINK_ID, str);
            AFLogger = (AFInAppEventParameterName + 109) % 128;
        }
        AFd1oSDK aFd1oSDKCopy = getRevenue().copy();
        String[] strArr = new String[1];
        strArr[1] = str;
        aFd1oSDKCopy.getMonetizationNetwork("setAppInviteOneLink", strArr);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str != null) {
            AFInAppEventParameterName = (AFLogger + 85) % 128;
            if (!str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
            }
        }
        getMediationNetwork(AppsFlyerProperties.ONELINK_ID, str);
        AFLogger = (AFInAppEventParameterName + 109) % 128;
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_VERSION);
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
        getMediationNetwork(AppsFlyerProperties.ONELINK_ID, str);
        AFLogger = (AFInAppEventParameterName + 109) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z3) {
        AFLogger = (AFInAppEventParameterName + 53) % 128;
        getRevenue().copy().getMonetizationNetwork("setCollectAndroidID", String.valueOf(z3));
        getMediationNetwork(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z3));
        getMediationNetwork(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z3));
        AFLogger = (AFInAppEventParameterName + 41) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z3) {
        int i7 = AFLogger + 85;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 == 0) {
            AFd1oSDK aFd1oSDKCopy = getRevenue().copy();
            String[] strArr = new String[0];
            strArr[0] = String.valueOf(z3);
            aFd1oSDKCopy.getMonetizationNetwork("setCollectIMEI", strArr);
        } else {
            getRevenue().copy().getMonetizationNetwork("setCollectIMEI", String.valueOf(z3));
        }
        getMediationNetwork(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z3));
        getMediationNetwork(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z3));
        int i10 = AFLogger + 107;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z3) {
        AFInAppEventParameterName = (AFLogger + 7) % 128;
        getRevenue().copy().getMonetizationNetwork("setCollectOaid", String.valueOf(z3));
        getMediationNetwork(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z3));
        AFLogger = (AFInAppEventParameterName + 77) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(@NonNull AppsFlyerConsent appsFlyerConsent) {
        getRevenue(new Object[]{this, appsFlyerConsent}, -562846720, 562846722, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        int i7 = AFInAppEventParameterName + 9;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            AFd1oSDK aFd1oSDKCopy = getRevenue().copy();
            String[] strArr = new String[0];
            strArr[0] = str;
            aFd1oSDKCopy.getMonetizationNetwork("setCurrencyCode", strArr);
        } else {
            getRevenue().copy().getMonetizationNetwork("setCurrencyCode", str);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        setCustomerUserId(r5);
        r0 = new java.lang.StringBuilder("CustomerUserId set: ");
        r0.append(r5);
        r0.append(" - Initializing AppsFlyer Tacking");
        com.appsflyer.AFLogger.afInfoLog(r0.toString(), true);
        r5 = com.appsflyer.AppsFlyerProperties.getInstance().getReferrer(getRevenue().getRevenue());
        getRevenue(new java.lang.Object[]{r4, r6, com.appsflyer.internal.AFh1xSDK.setCustomerIdAndLogSession}, 712451552, -712451552, java.lang.System.identityHashCode(r4));
        getRevenue().AFInAppEventType().getRevenue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
    
        if (r5 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        if ((r6 instanceof android.app.Activity) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
    
        com.appsflyer.internal.AFa1uSDK.AFInAppEventParameterName = (com.appsflyer.internal.AFa1uSDK.AFLogger + 69) % 128;
        ((android.app.Activity) r6).getIntent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
    
        getMediationNetwork(r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
    
        setCustomerUserId(r5);
        com.appsflyer.AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(java.lang.String.valueOf(r5)), true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (getCurrencyIso4217Code() != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (getCurrencyIso4217Code() != false) goto L10;
     */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setCustomerIdAndLogSession(java.lang.String r5, @androidx.annotation.NonNull android.content.Context r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L92
            int r0 = com.appsflyer.internal.AFa1uSDK.AFLogger
            int r0 = r0 + 25
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1uSDK.AFInAppEventParameterName = r1
            int r0 = r0 % 2
            r1 = 1
            if (r0 != 0) goto L1a
            boolean r0 = r4.getCurrencyIso4217Code()
            r2 = 89
            int r2 = r2 / 0
            if (r0 == 0) goto L81
            goto L20
        L1a:
            boolean r0 = r4.getCurrencyIso4217Code()
            if (r0 == 0) goto L81
        L20:
            r4.setCustomerUserId(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "CustomerUserId set: "
            r0.<init>(r2)
            r0.append(r5)
            java.lang.String r5 = " - Initializing AppsFlyer Tacking"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            com.appsflyer.AFLogger.afInfoLog(r5, r1)
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()
            com.appsflyer.internal.AFd1zSDK r0 = r4.getRevenue()
            com.appsflyer.internal.AFc1qSDK r0 = r0.getRevenue()
            java.lang.String r5 = r5.getReferrer(r0)
            com.appsflyer.internal.AFh1xSDK r0 = com.appsflyer.internal.AFh1xSDK.setCustomerIdAndLogSession
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r6, r0}
            int r1 = java.lang.System.identityHashCode(r4)
            r2 = 712451552(0x2a7725e0, float:2.1951147E-13)
            r3 = -712451552(0xffffffffd588da20, float:-1.8808803E13)
            getRevenue(r0, r2, r3, r1)
            com.appsflyer.internal.AFd1zSDK r0 = r4.getRevenue()
            com.appsflyer.internal.AFf1jSDK r0 = r0.AFInAppEventType()
            r0.getRevenue()
            if (r5 != 0) goto L6b
            java.lang.String r5 = ""
        L6b:
            boolean r0 = r6 instanceof android.app.Activity
            if (r0 == 0) goto L7d
            int r0 = com.appsflyer.internal.AFa1uSDK.AFLogger
            int r0 = r0 + 69
            int r0 = r0 % 128
            com.appsflyer.internal.AFa1uSDK.AFInAppEventParameterName = r0
            r0 = r6
            android.app.Activity r0 = (android.app.Activity) r0
            r0.getIntent()
        L7d:
            r4.getMediationNetwork(r6, r5)
            return
        L81:
            r4.setCustomerUserId(r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "waitForCustomerUserId is false; setting CustomerUserID: "
            java.lang.String r5 = r6.concat(r5)
            com.appsflyer.AFLogger.afInfoLog(r5, r1)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1uSDK.setCustomerIdAndLogSession(java.lang.String, android.content.Context):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        AFInAppEventParameterName = (AFLogger + 77) % 128;
        getRevenue().copy().getMonetizationNetwork("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        getMediationNetwork(AppsFlyerProperties.APP_USER_ID, str);
        getRevenue(new Object[]{AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, Boolean.FALSE}, 631714243, -631714232, (int) System.currentTimeMillis());
        AFLogger = (AFInAppEventParameterName + 25) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z3) {
        AFLogger.LogLevel logLevel;
        int i7 = AFLogger + 73;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
        if (!(!z3)) {
            logLevel = AFLogger.LogLevel.DEBUG;
        } else {
            logLevel = AFLogger.LogLevel.NONE;
            AFLogger = (AFInAppEventParameterName + 31) % 128;
        }
        setLogLevel(logLevel);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z3) {
        getRevenue(new Object[]{this, Boolean.valueOf(z3)}, -409399123, 409399143, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z3) {
        getRevenue(new Object[]{this, Boolean.valueOf(z3)}, -931320455, 931320458, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        int i7 = AFLogger + 49;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 == 0) {
            getRevenue().copy().getMonetizationNetwork("setExtension", str);
        } else {
            getRevenue().copy().getMonetizationNetwork("setExtension", str);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        int i10 = AFInAppEventParameterName + 17;
        AFLogger = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(@Nullable String str, @NonNull String str2) {
        String strTrim;
        if (AFk1ySDK.AFAdRevenueData(str2)) {
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            return;
        }
        int i7 = (AFLogger + 97) % 128;
        AFInAppEventParameterName = i7;
        if (str != null) {
            AFLogger = (i7 + 61) % 128;
            strTrim = str.trim();
            AFInAppEventParameterName = (AFLogger + 19) % 128;
        } else {
            strTrim = "";
        }
        AFe1vSDK.AFAdRevenueData(new AFe1ySDK(strTrim, str2.trim()));
        int i10 = AFLogger + 13;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 5 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        int i7 = AFInAppEventParameterName + 113;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            AFd1oSDK aFd1oSDKCopy = getRevenue().copy();
            String[] strArr = new String[0];
            strArr[1] = str;
            aFd1oSDKCopy.getMonetizationNetwork("setImeiData", strArr);
        } else {
            getRevenue().copy().getMonetizationNetwork("setImeiData", str);
        }
        getRevenue().AFInAppEventType().getMonetizationNetwork(str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setInstallId(@NonNull String str) {
        getRevenue().copy().getMonetizationNetwork("setInstallId", new String[0]);
        if (!this.toString) {
            AFLogger = (AFInAppEventParameterName + 15) % 128;
            AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "AppsFlyerLib.init() method should be called first");
            return;
        }
        if (!getRevenue().getMonetizationNetwork().getMediationNetwork("APPSFLYER_ALLOW_CUSTOM_INSTALL_ID")) {
            AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID Manifest flag should be set to true first");
            return;
        }
        if (str != null) {
            AFb1mSDK.getMediationNetwork(str, getRevenue().getRevenue());
            return;
        }
        AFLogger = (AFInAppEventParameterName + 105) % 128;
        AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "AppsFlyer installId can't be null");
        int i7 = AFInAppEventParameterName + 31;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z3) {
        getRevenue(new Object[]{this, Boolean.valueOf(z3)}, -1563571191, 1563571206, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(@NonNull AFLogger.LogLevel logLevel) {
        boolean z3;
        int i7 = AFInAppEventParameterName + 25;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            int i10 = 88 / 0;
            if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            z3 = true;
        } else {
            z3 = false;
        }
        getRevenue().copy().getMonetizationNetwork("log", String.valueOf(z3));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        if (z3) {
            getRevenue().afErrorLog().component2();
            return;
        }
        int i11 = AFInAppEventParameterName + 11;
        AFLogger = i11 % 128;
        if (i11 % 2 == 0) {
            getRevenue().afErrorLog().getRevenue();
        } else {
            getRevenue().afErrorLog().getRevenue();
            int i12 = 71 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i7) {
        getRevenue(new Object[]{this, Integer.valueOf(i7)}, 56359563, -56359550, i7);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        AFInAppEventParameterName = (AFLogger + 85) % 128;
        getRevenue().copy().getMonetizationNetwork("setOaidData", str);
        AFb1iSDK.getRevenue = str;
        int i7 = AFLogger + 53;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        AFInAppEventParameterName = (AFLogger + 119) % 128;
        AFLogger.afDebugLog("setOneLinkCustomDomain " + Arrays.toString(strArr));
        getRevenue().e().component1 = strArr;
        int i7 = AFInAppEventParameterName + 71;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        if (str == null) {
            AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
            return;
        }
        AFLogger = (AFInAppEventParameterName + 61) % 128;
        String lowerCase = str.toLowerCase(Locale.getDefault());
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
        AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
        int i7 = AFLogger + 77;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(@NonNull String str, Map<String, Object> map) {
        getRevenue(new Object[]{this, str, map}, 926846991, -926846984, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        AFInAppEventParameterName = (AFLogger + 15) % 128;
        getRevenue().i().getRevenue = AFj1dSDK.AFAdRevenueData(str);
        int i7 = AFLogger + 99;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 == 0) {
            int i10 = 98 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(@NonNull PluginInfo pluginInfo) {
        getRevenue(new Object[]{this, pluginInfo}, 1707800115, -1707800096, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        try {
            if (str != null) {
                int i7 = AFLogger + 69;
                AFInAppEventParameterName = i7 % 128;
                if (i7 % 2 == 0) {
                    jSONObject.put("pid", str);
                    throw null;
                }
                jSONObject.put("pid", str);
            }
            if (str2 != null) {
                int i10 = AFLogger + 99;
                AFInAppEventParameterName = i10 % 128;
                if (i10 % 2 == 0) {
                    jSONObject.put("c", str2);
                    throw null;
                }
                jSONObject.put("c", str2);
            }
            if (str3 != null) {
                jSONObject.put("af_siteid", str3);
            }
        } catch (JSONException e10) {
            AFLogger.afErrorLog(e10.getMessage(), e10);
        }
        if (!jSONObject.has("pid")) {
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            return;
        }
        int i11 = AFInAppEventParameterName + 101;
        AFLogger = i11 % 128;
        if (i11 % 2 == 0) {
            getMediationNetwork("preInstallName", jSONObject.toString());
        } else {
            getMediationNetwork("preInstallName", jSONObject.toString());
            int i12 = 37 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        AFLogger = (AFInAppEventParameterName + 67) % 128;
        AFLogger.afDebugLog("setResolveDeepLinkURLs " + Arrays.toString(strArr));
        AFa1mSDK aFa1mSDKE = getRevenue().e();
        aFa1mSDKE.areAllFieldsValid.clear();
        aFa1mSDKE.areAllFieldsValid.addAll(Arrays.asList(strArr));
        AFLogger = (AFInAppEventParameterName + 27) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(@NonNull String... strArr) {
        AFLogger = (AFInAppEventParameterName + 29) % 128;
        setSharingFilterForPartners(strArr);
        AFLogger = (AFInAppEventParameterName + 11) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        getRevenue(new Object[]{this}, -526979451, 526979457, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        getRevenue(new Object[]{this, strArr}, -1033985279, 1033985302, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        getRevenue().copy().getMonetizationNetwork("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        int length = strArr.length;
        String str = null;
        for (int i7 = 0; i7 < length; i7++) {
            int i10 = AFLogger + 23;
            AFInAppEventParameterName = i10 % 128;
            if (i10 % 2 == 0) {
                String str2 = strArr[i7];
                int i11 = AnonymousClass3.getRevenue[emailsCryptType.ordinal()];
                throw null;
            }
            String str3 = strArr[i7];
            if (AnonymousClass3.getRevenue[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFj1dSDK.AFAdRevenueData(str3));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str3);
                AFLogger = (AFInAppEventParameterName + 15) % 128;
                str = "plain_el_arr";
            }
        }
        map.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(map).toString());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context) {
        int i7 = AFInAppEventParameterName + 23;
        AFLogger = i7 % 128;
        if (i7 % 2 == 0) {
            start(context, null);
        } else {
            start(context, null);
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z3, Context context) {
        AFInAppEventParameterName = (AFLogger + 25) % 128;
        getMediationNetwork(context);
        AFd1zSDK revenue = getRevenue();
        revenue.AFInAppEventType().AFAdRevenueData(z3);
        revenue.AFAdRevenueData().submit(new g(revenue, 1));
        if (z3) {
            revenue.getRevenue().AFAdRevenueData("is_stop_tracking_used", true);
            AFLogger = (AFInAppEventParameterName + 31) % 128;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener) {
        int i7 = AFInAppEventParameterName + 29;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
            throw null;
        }
        subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
        AFLogger = (AFInAppEventParameterName + 55) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        AFInAppEventParameterName = (AFLogger + 85) % 128;
        getRevenue().copy().getMonetizationNetwork("unregisterConversionListener", new String[0]);
        this.getCurrencyIso4217Code = null;
        int i7 = AFLogger + 93;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 == 0) {
            int i10 = 48 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        getMediationNetwork(context);
        AFg1ySDK aFg1ySDK = new AFg1ySDK(context);
        if (str == null || str.trim().isEmpty()) {
            AFLogger.INSTANCE.w(AFg1cSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.INSTANCE.i(AFg1cSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(str));
        AFf1aSDK monetizationNetwork = aFg1ySDK.getMonetizationNetwork();
        if (monetizationNetwork == null || !str.equals(monetizationNetwork.getRevenue)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z3 = monetizationNetwork == null || jCurrentTimeMillis - monetizationNetwork.AFAdRevenueData > TimeUnit.SECONDS.toMillis(2L);
            AFf1aSDK aFf1aSDK = new AFf1aSDK(str, jCurrentTimeMillis, !z3);
            aFg1ySDK.getRevenue.getMonetizationNetwork("afUninstallToken", aFf1aSDK.getRevenue);
            aFg1ySDK.getRevenue.getMonetizationNetwork("afUninstallToken_received_time", aFf1aSDK.AFAdRevenueData);
            aFg1ySDK.getRevenue.AFAdRevenueData("afUninstallToken_queued", aFf1aSDK.getCurrencyIso4217Code);
            if (z3) {
                AFd1zSDK revenue = ((AFa1uSDK) getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis())).getRevenue();
                AFf1vSDK aFf1vSDK = new AFf1vSDK(str, revenue);
                AFe1tSDK aFe1tSDKCopydefault = revenue.copydefault();
                aFe1tSDKCopydefault.getRevenue.execute(aFe1tSDKCopydefault.new AnonymousClass5(aFf1vSDK));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener;
        int i7;
        getRevenue().copy().getMonetizationNetwork("validateAndTrackInAppPurchase", str, str2, str3, str4, str5, map == null ? "" : map.toString());
        if (!getRevenue().AFInAppEventType().getMediationNetwork()) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.PURCHASE_VALIDATION;
            StringBuilder sbF = F.f("Validate in app called with parameters: ", str3, " ", str4, " ");
            sbF.append(str5);
            aFLogger.i(aFg1cSDK, sbF.toString());
        }
        if (str == null || str4 == null) {
            appsFlyerInAppPurchaseValidatorListener = getRevenue;
            if (appsFlyerInAppPurchaseValidatorListener != null) {
                i7 = AFInAppEventParameterName + 101;
                AFLogger = i7 % 128;
                if (i7 % 2 == 0) {
                    appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                    return;
                } else {
                    appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                    throw null;
                }
            }
        } else {
            int i10 = AFLogger + 49;
            int i11 = i10 % 128;
            AFInAppEventParameterName = i11;
            if (i10 % 2 == 0) {
                throw null;
            }
            if (str2 == null || str5 == null) {
                appsFlyerInAppPurchaseValidatorListener = getRevenue;
                if (appsFlyerInAppPurchaseValidatorListener != null) {
                    i7 = AFInAppEventParameterName + 101;
                    AFLogger = i7 % 128;
                    if (i7 % 2 == 0) {
                        appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                        return;
                    } else {
                        appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                        throw null;
                    }
                }
            } else {
                int i12 = i11 + 125;
                AFLogger = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 97 / 0;
                    if (str3 == null) {
                        appsFlyerInAppPurchaseValidatorListener = getRevenue;
                        if (appsFlyerInAppPurchaseValidatorListener != null) {
                            i7 = AFInAppEventParameterName + 101;
                            AFLogger = i7 % 128;
                            if (i7 % 2 == 0) {
                                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                                return;
                            } else {
                                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                                throw null;
                            }
                        }
                    } else {
                        ShadowThread.setThreadName(new ShadowThread(new AFa1vSDK(context.getApplicationContext(), getRevenue().AFInAppEventType().getRevenue(), str, str2, str3, str4, str5, map), "\u200bcom.appsflyer.internal.AFa1uSDK"), "\u200bcom.appsflyer.internal.AFa1uSDK").start();
                    }
                } else if (str3 == null) {
                    appsFlyerInAppPurchaseValidatorListener = getRevenue;
                    if (appsFlyerInAppPurchaseValidatorListener != null) {
                        i7 = AFInAppEventParameterName + 101;
                        AFLogger = i7 % 128;
                        if (i7 % 2 == 0) {
                            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                            return;
                        } else {
                            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                            throw null;
                        }
                    }
                } else {
                    ShadowThread.setThreadName(new ShadowThread(new AFa1vSDK(context.getApplicationContext(), getRevenue().AFInAppEventType().getRevenue(), str, str2, str3, str4, str5, map), "\u200bcom.appsflyer.internal.AFa1uSDK"), "\u200bcom.appsflyer.internal.AFa1uSDK").start();
                }
            }
        }
        AFLogger = (AFInAppEventParameterName + 55) % 128;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z3) {
        AFInAppEventParameterName = (AFLogger + 41) % 128;
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z3)), true);
        getRevenue(new Object[]{AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, Boolean.valueOf(z3)}, 631714243, -631714232, (int) System.currentTimeMillis());
        AFLogger = (AFInAppEventParameterName + 69) % 128;
    }

    private static void a(String str, int i7, Object[] objArr) {
        Object charArray = str;
        if (str != null) {
            int i10 = $10 + 9;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        }
        AFk1kSDK aFk1kSDK = new AFk1kSDK();
        char[] cArrAFAdRevenueData = AFk1kSDK.AFAdRevenueData(AFInAppEventType ^ 6093989826573700728L, (char[]) charArray, i7);
        aFk1kSDK.getRevenue = 4;
        $11 = ($10 + 117) % 128;
        while (true) {
            int i11 = aFk1kSDK.getRevenue;
            if (i11 >= cArrAFAdRevenueData.length) {
                objArr[0] = new String(cArrAFAdRevenueData, 4, cArrAFAdRevenueData.length - 4);
                return;
            }
            int i12 = i11 - 4;
            aFk1kSDK.AFAdRevenueData = i12;
            cArrAFAdRevenueData[i11] = (char) (((long) (cArrAFAdRevenueData[i11] ^ cArrAFAdRevenueData[i11 % 4])) ^ (((long) i12) * (AFInAppEventType ^ 6093989826573700728L)));
            aFk1kSDK.getRevenue = i11 + 1;
        }
    }

    private static /* synthetic */ Object equals(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        PluginInfo pluginInfo = (PluginInfo) objArr[1];
        AFLogger = (AFInAppEventParameterName + 121) % 128;
        Objects.requireNonNull(pluginInfo);
        aFa1uSDK.getRevenue().registerClient().getRevenue(pluginInfo);
        int i7 = AFLogger + 5;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static String getCurrencyIso4217Code(String str) {
        AFInAppEventParameterName = (AFLogger + 63) % 128;
        String string = AppsFlyerProperties.getInstance().getString(str);
        AFInAppEventParameterName = (AFLogger + 25) % 128;
        return string;
    }

    public final boolean getCurrencyIso4217Code() {
        if (!AFAdRevenueData(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID)) {
            return false;
        }
        AFLogger = (AFInAppEventParameterName + 95) % 128;
        if (AFAdRevenueData() != null) {
            return false;
        }
        AFLogger = (AFInAppEventParameterName + 91) % 128;
        return true;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        AFh1qSDK aFh1qSDK = (AFh1qSDK) objArr[1];
        int i7 = AFLogger + HomeDialogState.PRIORITY_HIGHEST_111;
        AFInAppEventParameterName = i7 % 128;
        int i10 = i7 % 2;
        aFa1uSDK.getMediationNetwork(aFh1qSDK);
        if (i10 != 0) {
            return null;
        }
        int i11 = 94 / 0;
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(@NonNull Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap map2 = map == null ? null : new HashMap(map);
        getMediationNetwork(context);
        AFh1nSDK aFh1nSDK = new AFh1nSDK();
        aFh1nSDK.component1 = str;
        aFh1nSDK.AFAdRevenueData = appsFlyerRequestListener;
        if (map2 != null && map2.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap map3 = new HashMap();
            Object obj = map2.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap map4 = new HashMap();
                map4.put("x", Float.valueOf(motionEvent.getX()));
                map4.put("y", Float.valueOf(motionEvent.getY()));
                map3.put("loc", map4);
                map3.put("pf", Float.valueOf(motionEvent.getPressure()));
                map3.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                map3.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.INSTANCE.w(AFg1cSDK.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.", true);
            }
            Map<String, ?> mapSingletonMap = Collections.singletonMap("tch_data", map3);
            map2.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFh1nSDK.getCurrencyIso4217Code(mapSingletonMap);
        }
        aFh1nSDK.getCurrencyIso4217Code = map2;
        AFd1oSDK aFd1oSDKCopy = getRevenue().copy();
        Map map5 = aFh1nSDK.getCurrencyIso4217Code;
        if (map5 == null) {
            map5 = new HashMap();
        }
        aFd1oSDKCopy.getMonetizationNetwork("logEvent", str, new JSONObject(map5).toString());
        if (str == null) {
            getRevenue(new Object[]{this, context, AFh1xSDK.logEvent}, 712451552, -712451552, System.identityHashCode(this));
        }
        AFAdRevenueData(aFh1nSDK, getRevenue(context));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str) {
        AFInAppEventParameterName = (AFLogger + 107) % 128;
        start(context, str, null);
        AFLogger = (AFInAppEventParameterName + 97) % 128;
    }

    private static void copydefault() {
        int i7 = AFInAppEventParameterName + 117;
        AFLogger = i7 % 128;
        if (i7 % 2 == 0) {
            AFLogger.INSTANCE.w(AFg1cSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
            AFInAppEventParameterName = (AFLogger + 49) % 128;
        } else {
            AFLogger.INSTANCE.w(AFg1cSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
            throw null;
        }
    }

    private void getCurrencyIso4217Code(Map<String, Object> map) {
        int i7 = AFLogger + 27;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 == 0) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
                return;
            }
        } else if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            return;
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) || map.get("advertiserId") == null) {
            return;
        }
        try {
            if (AFk1ySDK.getMediationNetwork(getRevenue().i().getMediationNetwork) && map.remove("android_id") != null) {
                int i10 = AFLogger + 51;
                AFInAppEventParameterName = i10 % 128;
                if (i10 % 2 != 0) {
                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                } else {
                    AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                    try {
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            AFf1jSDK aFf1jSDKAFInAppEventType = getRevenue().AFInAppEventType();
            if (!(!AFk1ySDK.getMediationNetwork((String) AFf1jSDK.getCurrencyIso4217Code(new Object[]{aFf1jSDKAFInAppEventType}, 193238752, -193238751, System.identityHashCode(aFf1jSDKAFInAppEventType))))) {
                int i11 = AFInAppEventParameterName + 21;
                AFLogger = i11 % 128;
                if (i11 % 2 == 0) {
                    if (map.remove("imei") != null) {
                        AFInAppEventParameterName = (AFLogger + 95) % 128;
                        AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                        return;
                    }
                    return;
                }
                map.remove("imei");
                try {
                    throw null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e10) {
            AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e10);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener, long j6) {
        AFInAppEventParameterName = (AFLogger + 77) % 128;
        getRevenue().e().getCurrencyIso4217Code = deepLinkListener;
        getRevenue().e().component4 = j6;
        AFInAppEventParameterName = (AFLogger + 99) % 128;
    }

    private static boolean AFAdRevenueData(String str) {
        AppsFlyerProperties appsFlyerProperties;
        boolean z3;
        int i7 = AFLogger + 115;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 == 0) {
            appsFlyerProperties = AppsFlyerProperties.getInstance();
            z3 = true;
        } else {
            appsFlyerProperties = AppsFlyerProperties.getInstance();
            z3 = false;
        }
        return appsFlyerProperties.getBoolean(str, z3);
    }

    private static void component4(Context context) {
        try {
            List listAsList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
            if (!listAsList.contains("android.permission.INTERNET")) {
                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
            }
            if (!listAsList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
            }
            if (Build.VERSION.SDK_INT > 32) {
                int i7 = AFInAppEventParameterName + 81;
                AFLogger = i7 % 128;
                if (i7 % 2 == 0) {
                    if (listAsList.contains("com.google.android.gms.permission.AD_ID")) {
                        return;
                    }
                    AFLogger = (AFInAppEventParameterName + MsgEvent.MSG_EVENT_STOP_FOREGROUND) % 128;
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
                    AFInAppEventParameterName = (AFLogger + 25) % 128;
                    return;
                }
                listAsList.contains("com.google.android.gms.permission.AD_ID");
                try {
                    throw null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e10) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception while validation permissions. ", e10);
        }
    }

    public final synchronized AFf1tSDK getMediationNetwork() {
        try {
            int i7 = AFInAppEventParameterName;
            AFLogger = (i7 + 11) % 128;
            if (this.equals == null) {
                int i10 = i7 + 45;
                AFLogger = i10 % 128;
                if (i10 % 2 != 0) {
                    this.equals = new b(this);
                    int i11 = 86 / 0;
                } else {
                    this.equals = new b(this);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.equals;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        Application applicationO_;
        if (getRevenue().force().getCurrencyIso4217Code()) {
            return;
        }
        if (!this.toString) {
            AFInAppEventParameterName = (AFLogger + 79) % 128;
            getMonetizationNetwork(ViewProps.START);
            if (str == null) {
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                    return;
                }
                return;
            }
        }
        getMediationNetwork(context);
        final AFh1wSDK aFh1wSDKComponent2 = getRevenue().component2();
        aFh1wSDKComponent2.getRevenue(AFg1bSDK.getMediationNetwork(context));
        if (this.component3 == null) {
            int i7 = AFLogger + 23;
            AFInAppEventParameterName = i7 % 128;
            if (i7 % 2 == 0) {
                applicationO_ = AFj1gSDK.O_(context);
                int i10 = 40 / 0;
                if (applicationO_ == null) {
                    return;
                }
            } else {
                applicationO_ = AFj1gSDK.O_(context);
                if (applicationO_ == null) {
                    return;
                }
            }
            AFLogger = (AFInAppEventParameterName + 113) % 128;
            this.component3 = applicationO_;
        }
        getRevenue().copy().getMonetizationNetwork(ViewProps.START, str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
        String str2 = getMonetizationNetwork;
        aFLogger.i(aFg1cSDK, "Starting AppsFlyer: (v6.18.1." + str2 + ")");
        StringBuilder sb2 = new StringBuilder("Build Number: ");
        sb2.append(str2);
        aFLogger.i(aFg1cSDK, sb2.toString());
        AppsFlyerProperties.getInstance().loadProperties(getRevenue().getRevenue());
        if (!TextUtils.isEmpty(str)) {
            int i11 = AFLogger + 95;
            AFInAppEventParameterName = i11 % 128;
            if (i11 % 2 == 0) {
                getRevenue().AFInAppEventType().getMediationNetwork(str);
                throw null;
            }
            getRevenue().AFInAppEventType().getMediationNetwork(str);
        } else if (TextUtils.isEmpty(getRevenue().AFInAppEventType().getRevenue())) {
            copydefault();
            if (appsFlyerRequestListener != null) {
                AFInAppEventParameterName = (AFLogger + 67) % 128;
                appsFlyerRequestListener.onError(41, "No dev key");
                return;
            }
            return;
        }
        getRevenue().component4().getMonetizationNetwork(getMediationNetwork());
        getRevenue(new Object[]{this}, 88231034, -88231030, System.identityHashCode(this));
        c_(this.component3.getBaseContext(), this.copydefault.getMonetizationNetwork().n_());
        getRevenue().unregisterClient().getMediationNetwork();
        this.copydefault.force().AFAdRevenueData(context, new AFb1aSDK.AFa1uSDK() { // from class: com.appsflyer.internal.AFa1uSDK.4
            @Override // com.appsflyer.internal.AFb1aSDK.AFa1uSDK
            public final void getMediationNetwork(@NonNull AFh1pSDK aFh1pSDK) {
                Intent intent;
                aFh1wSDKComponent2.AFAdRevenueData();
                AFd1zSDK revenue = AFa1uSDK.this.getRevenue();
                revenue.component4().getMonetizationNetwork(AFa1uSDK.this.getMediationNetwork());
                AFa1uSDK aFa1uSDK = AFa1uSDK.this;
                AFa1uSDK.getRevenue(new Object[]{aFa1uSDK}, 88231034, -88231030, System.identityHashCode(aFa1uSDK));
                int monetizationNetwork = revenue.getMonetizationNetwork().AFAdRevenueData.getMonetizationNetwork("appsFlyerCount", 0);
                AFLogger.afInfoLog("onBecameForeground");
                if (monetizationNetwork < 2) {
                    AFa1uSDK.this.getRevenue().component1().getMonetizationNetwork();
                }
                AFh1lSDK aFh1lSDK = new AFh1lSDK();
                if (aFh1pSDK != null) {
                    AFa1uSDK.this.getRevenue().e().f_(AFa1gSDK.getMonetizationNetwork(aFh1lSDK), aFh1pSDK.getMonetizationNetwork, revenue.AFInAppEventParameterName().getRevenue);
                    AFh1uSDK aFh1uSDKAfErrorLogForExcManagerOnly = revenue.afErrorLogForExcManagerOnly();
                    if (aFh1uSDKAfErrorLogForExcManagerOnly != null && (intent = aFh1pSDK.getMonetizationNetwork) != null) {
                        aFh1uSDKAfErrorLogForExcManagerOnly.u_(intent, AFa1uSDK.this.getRevenue().e());
                    }
                }
                AFa1uSDK aFa1uSDK2 = AFa1uSDK.this;
                aFh1lSDK.AFAdRevenueData = appsFlyerRequestListener;
                aFa1uSDK2.AFAdRevenueData(aFh1lSDK, aFh1pSDK);
            }

            @Override // com.appsflyer.internal.AFb1aSDK.AFa1uSDK
            public final void getMonetizationNetwork() {
                Context context2 = AFa1uSDK.this.getRevenue().AFInAppEventParameterName().getRevenue;
                AFLogger.afInfoLog("onBecameBackground");
                AFh1wSDK aFh1wSDK = aFh1wSDKComponent2;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j6 = aFh1wSDK.areAllFieldsValid;
                if (j6 != 0) {
                    long j10 = jCurrentTimeMillis - j6;
                    if (j10 > 0 && j10 < 1000) {
                        j10 = 1000;
                    }
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(j10);
                    aFh1wSDK.copydefault = seconds;
                    aFh1wSDK.AFAdRevenueData.getMonetizationNetwork("prev_session_dur", seconds);
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
                AFLogger.afInfoLog("callStatsBackground background call");
                AFa1uSDK.this.getRevenue().afLogForce().getCurrencyIso4217Code();
                AFd1oSDK aFd1oSDKCopy = AFa1uSDK.this.getRevenue().copy();
                if (aFd1oSDKCopy.component4()) {
                    aFd1oSDKCopy.getCurrencyIso4217Code();
                    if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                        aFd1oSDKCopy.q_(context2.getPackageName(), context2.getPackageManager());
                    }
                    aFd1oSDKCopy.getRevenue();
                } else {
                    AFLogger.afDebugLog("RD status is OFF");
                }
                AFa1uSDK.this.getRevenue().component1().getMediationNetwork();
                AFa1uSDK.this.getRevenue().afInfoLog().getRevenue();
                AFh1uSDK aFh1uSDKAfErrorLogForExcManagerOnly = AFa1uSDK.this.getRevenue().afErrorLogForExcManagerOnly();
                if (aFh1uSDKAfErrorLogForExcManagerOnly != null) {
                    aFh1uSDKAfErrorLogForExcManagerOnly.AFAdRevenueData();
                }
            }
        });
    }

    public static String AFAdRevenueData() {
        AFLogger = (AFInAppEventParameterName + 17) % 128;
        String currencyIso4217Code = getCurrencyIso4217Code(AppsFlyerProperties.APP_USER_ID);
        int i7 = AFLogger + 37;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 != 0) {
            return currencyIso4217Code;
        }
        throw null;
    }

    private void AFAdRevenueData(Context context, String str, Map<String, Object> map) {
        AFh1nSDK aFh1nSDK = new AFh1nSDK();
        aFh1nSDK.component1 = str;
        aFh1nSDK.getCurrencyIso4217Code = map;
        AFAdRevenueData(aFh1nSDK, getRevenue(context));
        int i7 = AFInAppEventParameterName + 95;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    @NonNull
    private AFj1tSDK[] component1() {
        Object[] array;
        int i7 = AFInAppEventParameterName + 97;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            array = getRevenue().equals().AFAdRevenueData.toArray(new AFj1tSDK[0]);
        } else {
            array = getRevenue().equals().AFAdRevenueData.toArray(new AFj1tSDK[0]);
        }
        return (AFj1tSDK[]) array;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void copy() {
        getRevenue(new Object[]{this}, 658116678, -658116657, System.identityHashCode(this));
    }

    public final void areAllFieldsValid() {
        getRevenue(new Object[]{this}, 88231034, -88231030, System.identityHashCode(this));
    }

    private static void getMediationNetwork(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        while (true) {
            if (!itKeys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(itKeys.next()));
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i7)));
                }
            } catch (JSONException e10) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e10);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> itKeys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (true) {
                if (!itKeys2.hasNext()) {
                    break loop2;
                }
                AFInAppEventParameterName = (AFLogger + 75) % 128;
                if (str != null) {
                    break loop2;
                }
                String next = itKeys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i10 = 0;
                    while (i10 < jSONArray2.length()) {
                        if (jSONArray2.getLong(i10) == ((Long) arrayList.get(0)).longValue()) {
                            break;
                        }
                        AFInAppEventParameterName = (AFLogger + 21) % 128;
                        if (jSONArray2.getLong(i10) == ((Long) arrayList.get(1)).longValue() || jSONArray2.getLong(i10) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                            break;
                        }
                        i10++;
                        str = next;
                    }
                } catch (JSONException e11) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e11);
                }
            }
            AFLogger = (AFInAppEventParameterName + 115) % 128;
        }
        if (str != null) {
            int i11 = AFLogger + 115;
            AFInAppEventParameterName = i11 % 128;
            if (i11 % 2 != 0) {
                jSONObject.remove(str);
            } else {
                jSONObject.remove(str);
                throw null;
            }
        }
    }

    @VisibleForTesting
    public final void AFAdRevenueData(@NonNull AFh1qSDK aFh1qSDK, @Nullable AFh1pSDK aFh1pSDK) {
        int i7 = AFLogger + 81;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 != 0) {
            getRevenue(new Object[]{aFh1qSDK, aFh1pSDK}, -248258671, 248258679, (int) System.currentTimeMillis());
            if (getRevenue().AFInAppEventType().getRevenue() == null) {
                AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
                AppsFlyerRequestListener appsFlyerRequestListener = aFh1qSDK.AFAdRevenueData;
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                    return;
                }
                return;
            }
            String referrer = AppsFlyerProperties.getInstance().getReferrer(getRevenue().getRevenue());
            if (referrer == null) {
                AFLogger = (AFInAppEventParameterName + 117) % 128;
                referrer = "";
            }
            aFh1qSDK.component2 = referrer;
            getMonetizationNetwork(aFh1qSDK);
            return;
        }
        getRevenue(new Object[]{aFh1qSDK, aFh1pSDK}, -248258671, 248258679, (int) System.currentTimeMillis());
        getRevenue().AFInAppEventType().getRevenue();
        throw null;
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        int i7 = AFLogger + 43;
        AFInAppEventParameterName = i7 % 128;
        int i10 = i7 % 2;
        String currencyIso4217Code = aFa1uSDK.getRevenue().AFKeystoreWrapper().getCurrencyIso4217Code();
        if (i10 == 0) {
            int i11 = 67 / 0;
        }
        return currencyIso4217Code;
    }

    public static void component4() {
        AFInAppEventType = -5072644020869130264L;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        Context context = (Context) objArr[1];
        AFh1xSDK aFh1xSDK = (AFh1xSDK) objArr[2];
        aFa1uSDK.getMediationNetwork(context);
        AFh1wSDK aFh1wSDKComponent2 = aFa1uSDK.getRevenue().component2();
        AFg1bSDK mediationNetwork = AFg1bSDK.getMediationNetwork(context);
        if (aFh1wSDKComponent2.getCurrencyIso4217Code()) {
            aFh1wSDKComponent2.getCurrencyIso4217Code.put("api_name", aFh1xSDK.toString());
            aFh1wSDKComponent2.getRevenue(mediationNetwork);
            AFLogger = (AFInAppEventParameterName + 117) % 128;
        }
        aFh1wSDKComponent2.AFAdRevenueData();
        int i7 = AFLogger + 35;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        getRevenue(new Object[]{this, strArr}, 1723469905, -1723469883, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(@NonNull AFPurchaseDetails aFPurchaseDetails, @Nullable Map<String, String> map, @Nullable AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        AFe1tSDK aFe1tSDKCopydefault = this.copydefault.copydefault();
        aFe1tSDKCopydefault.getRevenue.execute(aFe1tSDKCopydefault.new AnonymousClass5(new AFe1bSDK(this.copydefault, AppsFlyerProperties.getInstance(), aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
        int i7 = AFInAppEventParameterName + 3;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            int i10 = 73 / 0;
        }
    }

    private boolean component3() {
        String string;
        if (this.areAllFieldsValid > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.areAllFieldsValid;
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
            String revenue = getRevenue(simpleDateFormat, this.areAllFieldsValid);
            String revenue2 = getRevenue(simpleDateFormat, this.getMediationNetwork);
            if (jCurrentTimeMillis < this.component4) {
                AFInAppEventParameterName = (AFLogger + 71) % 128;
                if (!isStopped()) {
                    long j6 = this.component4;
                    StringBuilder sbF = F.f("Last Launch attempt: ", revenue, ";\nLast successful Launch event: ", revenue2, ";\nThis launch is blocked: ");
                    sbF.append(jCurrentTimeMillis);
                    sbF.append(" ms < ");
                    sbF.append(j6);
                    sbF.append(" ms");
                    AFLogger.afInfoLog(sbF.toString());
                    return true;
                }
            }
            if (!isStopped()) {
                int i7 = AFLogger + 85;
                AFInAppEventParameterName = i7 % 128;
                if (i7 % 2 == 0) {
                    Object[] objArr = new Object[2];
                    objArr[0] = revenue;
                    objArr[0] = revenue2;
                    objArr[3] = Long.valueOf(jCurrentTimeMillis);
                    string = String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", objArr);
                } else {
                    StringBuilder sbF2 = F.f("Last Launch attempt: ", revenue, ";\nLast successful Launch event: ", revenue2, ";\nSending launch (+");
                    sbF2.append(jCurrentTimeMillis);
                    sbF2.append(" ms)");
                    string = sbF2.toString();
                }
                AFLogger.afInfoLog(string);
            }
        } else if (!isStopped()) {
            AFLogger.afInfoLog("Sending first launch for this session!");
            AFInAppEventParameterName = (AFLogger + 105) % 128;
        }
        return false;
    }

    @NonNull
    @WorkerThread
    public final Map<String, Object> AFAdRevenueData(AFh1qSDK aFh1qSDK) {
        String str;
        Context context = getRevenue().AFInAppEventParameterName().getRevenue;
        AFc1qSDK currencyIso4217Code = getCurrencyIso4217Code(context);
        AFg1vSDK aFg1vSDKComponent3 = getRevenue().component3();
        boolean mediationNetwork = getRevenue().AFInAppEventType().getMediationNetwork();
        boolean monetizationNetwork = aFh1qSDK.getMonetizationNetwork();
        Map<String, Object> map = aFh1qSDK.getMediationNetwork;
        long time = new Date().getTime();
        Object[] objArr = new Object[1];
        a("\uf296\ueb82༝趛\uf2f7\uf274㱢셟钿鐿阘㼘㹢ෳ\uf0d0铛", View.MeasureSpec.getMode(0), objArr);
        map.put(((String) objArr[0]).intern(), Long.toString(time));
        try {
            if (mediationNetwork) {
                AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyer SDK Reporting has been stopped", true);
            } else {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
                StringBuilder sb2 = new StringBuilder("******* sendTrackingWithEvent: ");
                if (monetizationNetwork) {
                    str = "Launch";
                    AFLogger = (AFInAppEventParameterName + 85) % 128;
                } else {
                    str = aFh1qSDK.component1;
                }
                sb2.append(str);
                aFLogger.i(aFg1cSDK, sb2.toString(), true);
            }
            component4(context);
            int revenue = getRevenue(currencyIso4217Code, monetizationNetwork);
            int monetizationNetwork2 = getMonetizationNetwork(currencyIso4217Code, aFh1qSDK.component1 != null);
            if (monetizationNetwork && revenue == 1) {
                AppsFlyerProperties.getInstance().getRevenue = true;
            }
            aFg1vSDKComponent3.getMonetizationNetwork(map, revenue, monetizationNetwork2);
            AFInAppEventParameterName = (AFLogger + HomeDialogState.PRIORITY_HIGHEST_111) % 128;
            return map;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Error while preparing to send event", th, true, true, true);
            return map;
        }
    }

    private static String getCurrencyIso4217Code(Activity activity) {
        int i7 = AFInAppEventParameterName + HomeDialogState.PRIORITY_HIGHEST_111;
        int i10 = i7 % 128;
        AFLogger = i10;
        String string = null;
        if (i7 % 2 != 0) {
            throw null;
        }
        if (activity == null) {
            return null;
        }
        int i11 = i10 + 91;
        AFInAppEventParameterName = i11 % 128;
        if (i11 % 2 != 0) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                try {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        string = extras.getString("af");
                        if (string == null) {
                            return string;
                        }
                        AFLogger.INSTANCE.w(AFg1cSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(string));
                        extras.remove("af");
                        activity.setIntent(intent.putExtras(extras));
                        AFInAppEventParameterName = (AFLogger + 93) % 128;
                        return string;
                    }
                } catch (Throwable th) {
                    AFLogger.INSTANCE.e(AFg1cSDK.ENGAGEMENT, th.getMessage(), th);
                }
            }
            return string;
        }
        activity.getIntent();
        throw null;
    }

    @Deprecated
    public static Map<String, Object> getMonetizationNetwork(Map<String, Object> map) {
        if (!(!map.containsKey(Constants.REFERRER_API_META))) {
            AFLogger = (AFInAppEventParameterName + 45) % 128;
            return (Map) map.get(Constants.REFERRER_API_META);
        }
        HashMap map2 = new HashMap();
        map.put(Constants.REFERRER_API_META, map2);
        AFInAppEventParameterName = (AFLogger + 5) % 128;
        return map2;
    }

    private static int getMonetizationNetwork(AFc1qSDK aFc1qSDK, boolean z3) {
        int i7 = AFInAppEventParameterName + 81;
        AFLogger = i7 % 128;
        if (i7 % 2 == 0) {
            return getCurrencyIso4217Code(aFc1qSDK, "appsFlyerInAppEventCount", z3);
        }
        getCurrencyIso4217Code(aFc1qSDK, "appsFlyerInAppEventCount", z3);
        throw null;
    }

    private static void getMonetizationNetwork(String str) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.SDK_LIFECYCLE;
        StringBuilder sb2 = new StringBuilder("ERROR: AppsFlyer SDK is not initialized! The API call '");
        sb2.append(str);
        sb2.append("()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        aFLogger.w(aFg1cSDK, sb2.toString());
        int i7 = AFLogger + 91;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    private static void getMediationNetwork(String str, String str2) {
        AFLogger = (AFInAppEventParameterName + 7) % 128;
        AppsFlyerProperties.getInstance().set(str, str2);
        AFInAppEventParameterName = (AFLogger + 63) % 128;
    }

    private void getMonetizationNetwork(AFh1qSDK aFh1qSDK) {
        boolean z3;
        if (aFh1qSDK.component1 == null) {
            AFLogger = (AFInAppEventParameterName + 15) % 128;
            z3 = true;
        } else {
            z3 = false;
        }
        if (getCurrencyIso4217Code()) {
            AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
            return;
        }
        if (z3) {
            AFLogger = (AFInAppEventParameterName + 59) % 128;
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                AFLogger = (AFInAppEventParameterName + 123) % 128;
                if (component3()) {
                    AppsFlyerRequestListener appsFlyerRequestListener = aFh1qSDK.AFAdRevenueData;
                    if (appsFlyerRequestListener != null) {
                        AFInAppEventParameterName = (AFLogger + 57) % 128;
                        appsFlyerRequestListener.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                        return;
                    }
                    return;
                }
            } else {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            }
            this.areAllFieldsValid = System.currentTimeMillis();
        }
        getMediationNetwork(aFh1qSDK);
        int i7 = AFInAppEventParameterName + 97;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public final AFd1zSDK getRevenue() {
        int i7 = (AFLogger + 17) % 128;
        AFInAppEventParameterName = i7;
        AFc1dSDK aFc1dSDK = this.copydefault;
        AFLogger = (i7 + 123) % 128;
        return aFc1dSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getRevenue(boolean z3) {
        int i7 = (AFInAppEventParameterName + 79) % 128;
        AFLogger = i7;
        if (z3) {
            AFInAppEventParameterName = (i7 + 11) % 128;
            getRevenue().afErrorLog().getMonetizationNetwork();
        } else {
            getRevenue().afErrorLog().AFAdRevenueData();
        }
    }

    private void getMediationNetwork(AppsFlyerConversionListener appsFlyerConversionListener) {
        int i7 = (AFInAppEventParameterName + 57) % 128;
        AFLogger = i7;
        if (appsFlyerConversionListener != null) {
            this.getCurrencyIso4217Code = appsFlyerConversionListener;
            return;
        }
        int i10 = i7 + 15;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 94 / 0;
        }
    }

    @VisibleForTesting
    private void getMediationNetwork(Context context, String str) {
        AFh1lSDK aFh1lSDK = new AFh1lSDK();
        getMediationNetwork(context);
        aFh1lSDK.component1 = null;
        aFh1lSDK.getCurrencyIso4217Code = null;
        aFh1lSDK.component2 = str;
        aFh1lSDK.getRevenue = null;
        getMonetizationNetwork(aFh1lSDK);
        AFLogger = (AFInAppEventParameterName + 119) % 128;
    }

    private void getRevenue(AFi1nSDK aFi1nSDK) {
        AFe1dSDK aFe1dSDK = new AFe1dSDK(aFi1nSDK, getRevenue().getMonetizationNetwork(), getRevenue(), getRevenue().component3(), getRevenue().AFInAppEventParameterName());
        AFe1tSDK aFe1tSDKCopydefault = getRevenue().copydefault();
        aFe1tSDKCopydefault.getRevenue.execute(aFe1tSDKCopydefault.new AnonymousClass5(aFe1dSDK));
        AFInAppEventParameterName = (AFLogger + 7) % 128;
    }

    public final AFc1qSDK getCurrencyIso4217Code(Context context) {
        int i7 = AFLogger + 59;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 != 0) {
            getMediationNetwork(context);
            AFc1qSDK revenue = getRevenue().getRevenue();
            AFInAppEventParameterName = (AFLogger + 87) % 128;
            return revenue;
        }
        getMediationNetwork(context);
        getRevenue().getRevenue();
        throw null;
    }

    private static int getCurrencyIso4217Code(AFc1qSDK aFc1qSDK, String str, boolean z3) {
        AFInAppEventParameterName = (AFLogger + 17) % 128;
        int monetizationNetwork = aFc1qSDK.getMonetizationNetwork(str, 0);
        if (z3) {
            AFLogger = (AFInAppEventParameterName + 57) % 128;
            monetizationNetwork++;
            aFc1qSDK.getCurrencyIso4217Code(str, monetizationNetwork);
        }
        AFInAppEventParameterName = (AFLogger + 53) % 128;
        return monetizationNetwork;
    }

    @Nullable
    private AFh1pSDK getRevenue(Context context) {
        int i7 = AFLogger + 91;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 == 0) {
            int i10 = 24 / 0;
            if (!(context instanceof Activity)) {
                return null;
            }
        } else if (!(context instanceof Activity)) {
            return null;
        }
        AFh1pSDK aFh1pSDK = new AFh1pSDK((Activity) context, getRevenue().d());
        int i11 = AFLogger + 79;
        AFInAppEventParameterName = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 92 / 0;
        }
        return aFh1pSDK;
    }

    public final void getMediationNetwork(AFh1qSDK aFh1qSDK) {
        long j6;
        Context context = getRevenue().AFInAppEventParameterName().getRevenue;
        boolean z3 = true;
        if (context == null) {
            int i7 = AFInAppEventParameterName + 87;
            AFLogger = i7 % 128;
            if (i7 % 2 != 0) {
                AFLogger.INSTANCE.d(AFg1cSDK.ATTRIBUTION, "sendWithEvent - got null context. skipping event/launch.", true);
                return;
            } else {
                AFLogger.INSTANCE.d(AFg1cSDK.ATTRIBUTION, "sendWithEvent - got null context. skipping event/launch.", true);
                return;
            }
        }
        String revenue = getRevenue().AFInAppEventType().getRevenue();
        AppsFlyerRequestListener appsFlyerRequestListener = aFh1qSDK.AFAdRevenueData;
        if (revenue != null && revenue.length() != 0) {
            AFc1qSDK currencyIso4217Code = getCurrencyIso4217Code(context);
            AppsFlyerProperties.getInstance().saveProperties(currencyIso4217Code);
            if (!getRevenue().AFInAppEventType().getMediationNetwork()) {
                AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "sendWithEvent from activity: ".concat(context.getClass().getName()), true);
            }
            boolean monetizationNetwork = aFh1qSDK.getMonetizationNetwork();
            Map<String, ?> mapAFAdRevenueData = AFAdRevenueData(aFh1qSDK);
            if (getRevenue().AFInAppEventType().getMediationNetwork()) {
                AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyerLib.sendWithEvent");
            }
            int revenue2 = getRevenue(currencyIso4217Code, false);
            getCurrencyIso4217Code(mapAFAdRevenueData);
            com.appsflyer.internal.AFa1zSDK aFa1zSDK = new com.appsflyer.internal.AFa1zSDK(getRevenue(), aFh1qSDK.getCurrencyIso4217Code(mapAFAdRevenueData).getCurrencyIso4217Code(revenue2), getRevenue().unregisterClient().getMonetizationNetwork());
            if (monetizationNetwork) {
                AFLogger = (AFInAppEventParameterName + 61) % 128;
                boolean z8 = false;
                for (AFj1tSDK aFj1tSDK : component1()) {
                    if (aFj1tSDK.component1 == AFj1tSDK.AFa1uSDK.STARTED) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.REFERRER;
                        StringBuilder sb2 = new StringBuilder("Failed to get ");
                        sb2.append(aFj1tSDK.getMediationNetwork);
                        sb2.append(" referrer, wait ...");
                        aFLogger.d(aFg1cSDK, sb2.toString());
                        z8 = true;
                    }
                }
                if (getRevenue().unregisterClient().getCurrencyIso4217Code()) {
                    AFLogger = (AFInAppEventParameterName + 3) % 128;
                    AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "fetching Facebook deferred AppLink data, wait ...");
                    z8 = true;
                }
                if (!getRevenue().AFInAppEventType().getMonetizationNetwork()) {
                    z3 = z8;
                }
            } else {
                z3 = false;
            }
            ScheduledExecutorService mediationNetwork = getRevenue().getMediationNetwork();
            if (z3) {
                int i10 = AFLogger + 13;
                AFInAppEventParameterName = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 97 / 0;
                }
                j6 = 500;
            } else {
                AFInAppEventParameterName = (AFLogger + 27) % 128;
                j6 = 0;
            }
            AFj1fSDK.getRevenue(mediationNetwork, aFa1zSDK, j6, TimeUnit.MILLISECONDS);
            return;
        }
        AFLogger aFLogger2 = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK2 = AFg1cSDK.GENERAL;
        aFLogger2.i(aFg1cSDK2, "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ", true);
        aFLogger2.i(aFg1cSDK2, "AppsFlyer will not track this event.", true);
        if (appsFlyerRequestListener != null) {
            appsFlyerRequestListener.onError(41, "No dev key");
        }
    }

    public static boolean AFAdRevenueData(Context context) {
        int i7 = AFLogger + 123;
        AFInAppEventParameterName = i7 % 128;
        try {
            if (i7 % 2 != 0) {
                if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                    AFInAppEventParameterName = (AFLogger + 105) % 128;
                    return true;
                }
                try {
                    context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                    AFInAppEventParameterName = (AFLogger + 31) % 128;
                    return true;
                } catch (PackageManager.NameNotFoundException e10) {
                    AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "WARNING:  Google Play Services is unavailable. ", e10);
                    return false;
                }
            }
            GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
            throw null;
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(AFh1qSDK aFh1qSDK) {
        getRevenue(new Object[]{this, aFh1qSDK}, 1838802261, -1838802260, System.identityHashCode(this));
    }

    private static void getMonetizationNetwork(@NonNull AFh1qSDK aFh1qSDK, @Nullable AFh1pSDK aFh1pSDK) {
        getRevenue(new Object[]{aFh1qSDK, aFh1pSDK}, -248258671, 248258679, (int) System.currentTimeMillis());
    }

    private void getMonetizationNetwork(Context context, AFh1xSDK aFh1xSDK) {
        getRevenue(new Object[]{this, context, aFh1xSDK}, 712451552, -712451552, System.identityHashCode(this));
    }

    public static String getRevenue(SimpleDateFormat simpleDateFormat, long j6) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(new Date(j6));
        int i7 = AFInAppEventParameterName + 59;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            int i10 = 52 / 0;
        }
        return str;
    }

    public static AFa1uSDK getMonetizationNetwork() {
        return (AFa1uSDK) getRevenue(new Object[0], 1795555804, -1795555788, (int) System.currentTimeMillis());
    }

    private void getRevenue(String str) {
        AFh1qSDK currencyIso4217Code = new AFh1jSDK().getCurrencyIso4217Code(getRevenue().getMonetizationNetwork().AFAdRevenueData.getMonetizationNetwork("appsFlyerCount", 0));
        currencyIso4217Code.component2 = str;
        if (str != null) {
            AFInAppEventParameterName = (AFLogger + 57) % 128;
            if (str.length() <= 5 || !getRevenue().equals().AFAdRevenueData(currencyIso4217Code)) {
                return;
            }
            AFInAppEventParameterName = (AFLogger + 61) % 128;
            AFj1fSDK.getRevenue(getRevenue().getMediationNetwork(), new f(1, this, currencyIso4217Code), 5L, TimeUnit.MILLISECONDS);
        }
    }

    public static String AFAdRevenueData(AFc1qSDK aFc1qSDK, String str) {
        AFInAppEventParameterName = (AFLogger + 69) % 128;
        String currencyIso4217Code = aFc1qSDK.getCurrencyIso4217Code("CACHED_CHANNEL", (String) null);
        if (currencyIso4217Code != null) {
            return currencyIso4217Code;
        }
        aFc1qSDK.getMonetizationNetwork("CACHED_CHANNEL", str);
        AFInAppEventParameterName = (AFLogger + 23) % 128;
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFAdRevenueData(AFf1mSDK aFf1mSDK) {
        getRevenue(new Object[]{this, aFf1mSDK}, 1651056899, -1651056882, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFAdRevenueData(AFi1nSDK aFi1nSDK) {
        getRevenue(new Object[]{this, aFi1nSDK}, 2039163194, -2039163182, System.identityHashCode(this));
    }

    public static int getRevenue(AFc1qSDK aFc1qSDK, boolean z3) {
        int i7 = AFLogger + 19;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 == 0) {
            getCurrencyIso4217Code(aFc1qSDK, "appsFlyerCount", z3);
            throw null;
        }
        int currencyIso4217Code = getCurrencyIso4217Code(aFc1qSDK, "appsFlyerCount", z3);
        int i10 = AFLogger + 123;
        AFInAppEventParameterName = i10 % 128;
        if (i10 % 2 != 0) {
            return currencyIso4217Code;
        }
        throw null;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        AppsFlyerConsent appsFlyerConsent = (AppsFlyerConsent) objArr[1];
        AFInAppEventParameterName = (AFLogger + 11) % 128;
        Objects.requireNonNull(appsFlyerConsent);
        aFa1uSDK.getRevenue().i().component2 = appsFlyerConsent;
        int i7 = AFLogger + 37;
        AFInAppEventParameterName = i7 % 128;
        if (i7 % 2 == 0) {
            int i10 = 48 / 0;
        }
        return null;
    }

    @Nullable
    @VisibleForTesting
    private String getRevenue(Context context, String str) {
        return (String) getRevenue(new Object[]{this, context, str}, 1863481346, -1863481322, System.identityHashCode(this));
    }

    private static void getRevenue(String str, boolean z3) {
        getRevenue(new Object[]{str, Boolean.valueOf(z3)}, 631714243, -631714232, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFa1uSDK aFa1uSDK = (AFa1uSDK) objArr[0];
        AFInAppEventParameterName = (AFLogger + 33) % 128;
        if (AFe1fSDK.component2()) {
            return null;
        }
        AFd1zSDK revenue = aFa1uSDK.getRevenue();
        AFe1tSDK aFe1tSDKCopydefault = revenue.copydefault();
        aFe1tSDKCopydefault.getRevenue.execute(aFe1tSDKCopydefault.new AnonymousClass5(new AFe1fSDK(revenue)));
        int i7 = AFInAppEventParameterName + 51;
        AFLogger = i7 % 128;
        if (i7 % 2 != 0) {
            int i10 = 52 / 0;
        }
        return null;
    }

    private static void getMediationNetwork(String str) {
        getRevenue(new Object[]{str}, -851629931, 851629949, (int) System.currentTimeMillis());
    }
}
