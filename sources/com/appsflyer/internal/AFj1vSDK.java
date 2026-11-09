package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.adjust.sdk.Constants;
import com.appsflyer.AFLogger;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1vSDK extends AFj1tSDK {
    final ProviderInfo getMonetizationNetwork;
    private final AFd1zSDK getRevenue;

    public AFj1vSDK(ProviderInfo providerInfo, Runnable runnable, AFd1zSDK aFd1zSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.getRevenue = aFd1zSDK;
        this.getMonetizationNetwork = providerInfo;
    }

    @Nullable
    @VisibleForTesting
    public static ContentProviderClient B_(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e10) {
            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e10, false, true, false);
            return null;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th, false, true, false);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getMediationNetwork(final Context context) {
        this.getRevenue.AFAdRevenueData().execute(new Runnable() { // from class: com.appsflyer.internal.AFj1vSDK.3
            @Override // java.lang.Runnable
            public final void run() {
                Cursor cursorQuery;
                AFj1vSDK aFj1vSDK = AFj1vSDK.this;
                aFj1vSDK.component2 = System.currentTimeMillis();
                aFj1vSDK.component1 = AFj1tSDK.AFa1uSDK.STARTED;
                aFj1vSDK.addObserver(new AFj1tSDK.AnonymousClass3());
                StringBuilder sb2 = new StringBuilder("content://");
                sb2.append(AFj1vSDK.this.getMonetizationNetwork.authority);
                sb2.append("/transaction_id");
                Uri uri = Uri.parse(sb2.toString());
                ContentProviderClient contentProviderClientB_ = AFj1vSDK.B_(context, uri);
                try {
                    if (contentProviderClientB_ != null) {
                        StringBuilder sb3 = new StringBuilder("app_id=");
                        sb3.append(context.getPackageName());
                        cursorQuery = contentProviderClientB_.query(uri, null, sb3.toString(), null, null);
                    } else {
                        cursorQuery = null;
                    }
                } catch (RemoteException e10) {
                    AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to query unstable content providerClient", e10, false, true, false);
                    cursorQuery = null;
                } catch (DeadObjectException e11) {
                    AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Failed to acquire unstable content providerClient", e11, false, true, false);
                    cursorQuery = null;
                } catch (Throwable th) {
                    AFLogger.INSTANCE.e(AFg1cSDK.PREINSTALL, "Error to get data from providerClient ", th, false, true, false);
                    cursorQuery = null;
                } finally {
                    contentProviderClientB_.close();
                }
                if (cursorQuery != null) {
                    int columnIndex = cursorQuery.getColumnIndex(FirebaseAnalytics.Param.TRANSACTION_ID);
                    if (columnIndex == -1) {
                        AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, "Wrong column name");
                        AFj1vSDK.this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
                    } else {
                        AFj1vSDK.this.AFAdRevenueData.put("response", "OK");
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(columnIndex);
                            cursorQuery.close();
                            if (string != null && !string.isEmpty()) {
                                AFj1vSDK.this.AFAdRevenueData.put(Constants.REFERRER, string);
                            }
                        }
                    }
                    cursorQuery.close();
                } else {
                    AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, "ContentProvider query failed, got null Cursor");
                    AFj1vSDK.this.AFAdRevenueData.put("response", "SERVICE_UNAVAILABLE");
                }
                AFj1vSDK aFj1vSDK2 = AFj1vSDK.this;
                aFj1vSDK2.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1gSDK.AFAdRevenueData(context, ((PackageItemInfo) aFj1vSDK2.getMonetizationNetwork).packageName)));
                AFj1vSDK aFj1vSDK3 = AFj1vSDK.this;
                aFj1vSDK3.AFAdRevenueData.put("api_ver_name", AFj1gSDK.getMonetizationNetwork(context, ((PackageItemInfo) aFj1vSDK3.getMonetizationNetwork).packageName));
                AFj1vSDK.this.getMonetizationNetwork();
            }
        });
    }
}
