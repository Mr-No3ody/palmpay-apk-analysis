package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.adjust.sdk.Constants;
import com.appsflyer.AFLogger;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1wSDK extends AFi1dSDK {
    private final AFd1zSDK getMonetizationNetwork;
    private final AFi1eSDK getRevenue;

    public AFj1wSDK(Runnable runnable, AFd1zSDK aFd1zSDK, AFi1eSDK aFi1eSDK) {
        super("store", "huawei", aFd1zSDK.getMonetizationNetwork(), runnable);
        this.getMonetizationNetwork = aFd1zSDK;
        this.getRevenue = aFi1eSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(Context context) {
        this.component2 = System.currentTimeMillis();
        this.component1 = AFj1tSDK.AFa1uSDK.STARTED;
        addObserver(new AFj1tSDK.AnonymousClass3());
        String str = ((PackageItemInfo) context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 128)).packageName;
        this.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1gSDK.AFAdRevenueData(context, str)));
        this.AFAdRevenueData.put("api_ver_name", AFj1gSDK.getMonetizationNetwork(context, str));
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(Uri.parse("content://com.huawei.appmarket.commondata/item/5"), null, null, new String[]{context.getPackageName()}, null);
            if (cursorQuery == null) {
                this.AFAdRevenueData.put("response", "SERVICE_UNAVAILABLE");
            } else if (cursorQuery.moveToFirst()) {
                this.AFAdRevenueData.put("response", "OK");
                this.AFAdRevenueData.put(Constants.REFERRER, cursorQuery.getString(0));
                this.AFAdRevenueData.put("click_ts", Long.valueOf(cursorQuery.getLong(1)));
                this.AFAdRevenueData.put("install_end_ts", Long.valueOf(cursorQuery.getLong(2)));
                if (cursorQuery.getColumnCount() > 3) {
                    this.AFAdRevenueData.put("install_begin_ts", Long.valueOf(cursorQuery.getLong(3)));
                    HashMap map = new HashMap();
                    String string = cursorQuery.getString(4);
                    if (string != null) {
                        map.put("track_id", string);
                    }
                    map.put("referrer_ex", cursorQuery.getString(5));
                    this.AFAdRevenueData.put("huawei_custom", map);
                }
            } else {
                this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Throwable th) {
            try {
                this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
                AFLogger.INSTANCE.e(AFg1cSDK.REFERRER, th.getMessage() != null ? th.getMessage() : "", th, false, true);
                if (0 != 0) {
                }
            } catch (Throwable th2) {
                if (0 == 0) {
                    throw th2;
                }
                cursorQuery.close();
                throw th2;
            }
        }
        getMonetizationNetwork();
    }

    private boolean getRevenue(Context context) {
        if (!AFAdRevenueData()) {
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by counter.");
            return false;
        }
        if (!this.getRevenue.getCurrencyIso4217Code(context)) {
            AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by missing content provider.");
            return false;
        }
        if (this.getRevenue.getMediationNetwork(context)) {
            return true;
        }
        AFLogger.INSTANCE.d(AFg1cSDK.REFERRER, "Huawei referrer collection disallowed by invalid content provider.");
        return false;
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getMediationNetwork(Context context) {
        if (getRevenue(context)) {
            this.getMonetizationNetwork.AFAdRevenueData().execute(new f(5, this, context));
        }
    }
}
