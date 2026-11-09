package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.adjust.sdk.Constants;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1uSDK extends AFi1cSDK {
    private final AFd1zSDK getRevenue;

    public AFj1uSDK(Runnable runnable, AFd1zSDK aFd1zSDK) {
        super("store", Constants.REFERRER_API_SAMSUNG, runnable);
        this.getRevenue = aFd1zSDK;
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getMediationNetwork(Context context) {
        AFb1vSDK<Map<String, Object>> aFb1vSDK = new AFb1vSDK<Map<String, Object>>(context, this.getRevenue.AFAdRevenueData(), "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFj1uSDK.4
            private static void D_(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j6 = cursor.getLong(columnIndex);
                if (j6 == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j6));
            }

            private static void E_(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.appsflyer.internal.AFb1vSDK
            /* JADX INFO: renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
            public Map<String, Object> getMediationNetwork() {
                String string;
                Cursor cursorQuery = null;
                try {
                    try {
                        ContentResolver contentResolver = this.getMonetizationNetwork.getContentResolver();
                        StringBuilder sb2 = new StringBuilder("content://");
                        sb2.append(this.getRevenue);
                        cursorQuery = contentResolver.query(Uri.parse(sb2.toString()), null, null, null, null);
                        if (cursorQuery == null) {
                            AFj1uSDK.this.AFAdRevenueData.put("response", "SERVICE_UNAVAILABLE");
                        } else if (cursorQuery.moveToFirst()) {
                            AFj1uSDK.this.AFAdRevenueData.put("response", "OK");
                            E_(Constants.REFERRER, AFj1uSDK.this.AFAdRevenueData, cursorQuery);
                            D_("click_ts", AFj1uSDK.this.AFAdRevenueData, cursorQuery);
                            D_("install_begin_ts", AFj1uSDK.this.AFAdRevenueData, cursorQuery);
                            D_("install_end_ts", AFj1uSDK.this.AFAdRevenueData, cursorQuery);
                            E_("organic_keywords", AFj1uSDK.this.AFAdRevenueData, cursorQuery);
                            E_("attr_type", AFj1uSDK.this.AFAdRevenueData, cursorQuery);
                            HashMap map = new HashMap();
                            int columnIndex = cursorQuery.getColumnIndex("instant");
                            if (columnIndex != -1 && (string = cursorQuery.getString(columnIndex)) != null) {
                                map.put("instant", Boolean.valueOf(Boolean.parseBoolean(string)));
                            }
                            D_("click_server_ts", map, cursorQuery);
                            D_("install_begin_server_ts", map, cursorQuery);
                            E_("install_version", map, cursorQuery);
                            if (!map.isEmpty()) {
                                AFj1uSDK.this.AFAdRevenueData.put("custom", map);
                            }
                        } else {
                            AFj1uSDK.this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (Exception e10) {
                        AFj1uSDK.this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.afErrorLog(e10.getMessage(), e10, false, true);
                        if (0 != 0) {
                        }
                    }
                    String str = ((PackageItemInfo) this.getMonetizationNetwork.getPackageManager().resolveContentProvider(this.getRevenue, 128)).packageName;
                    AFj1uSDK.this.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1gSDK.AFAdRevenueData(this.getMonetizationNetwork, str)));
                    AFj1uSDK.this.AFAdRevenueData.put("api_ver_name", AFj1gSDK.getMonetizationNetwork(this.getMonetizationNetwork, str));
                    AFj1uSDK.this.getMonetizationNetwork();
                    return AFj1uSDK.this.AFAdRevenueData;
                } catch (Throwable th) {
                    if (0 != 0) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            }
        };
        AFc1qSDK revenue = this.getRevenue.getRevenue();
        if (AFa1uSDK.getRevenue(revenue, false) > 0 || !aFb1vSDK.getRevenue()) {
            return;
        }
        aFb1vSDK.AFAdRevenueData.execute(aFb1vSDK.getMediationNetwork);
        this.component2 = System.currentTimeMillis();
        this.component1 = AFj1tSDK.AFa1uSDK.STARTED;
        addObserver(new AFj1tSDK.AnonymousClass3());
    }
}
