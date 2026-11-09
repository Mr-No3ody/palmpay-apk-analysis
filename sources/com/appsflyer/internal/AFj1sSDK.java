package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.adjust.sdk.Constants;
import com.appsflyer.AFLogger;
import com.appsflyer.AdRevenueScheme;
import com.google.android.gms.maps.model.FeatureType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1sSDK extends AFi1dSDK {

    @NotNull
    private final ExecutorService getRevenue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFj1sSDK(@NotNull ExecutorService executorService, @NotNull AFc1pSDK aFc1pSDK, @NotNull Runnable runnable) {
        super("preload", Constants.REFERRER_API_SAMSUNG, aFc1pSDK, runnable);
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        this.getRevenue = executorService;
    }

    private static boolean C_(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("RESULT");
        if (columnIndex != -1) {
            return Boolean.parseBoolean(cursor.getString(columnIndex));
        }
        AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "No such column", false, 4, null);
        return false;
    }

    private final boolean getMonetizationNetwork(Context context) {
        if (!AFAdRevenueData()) {
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        if (getRevenue(context)) {
            return true;
        }
        AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by missing content provider.", false, 4, null);
        return false;
    }

    private static boolean getRevenue(Context context) {
        return context.getPackageManager().resolveContentProvider(Constants.SAMSUNG_PREINSTALL_CONTENT_URI_AUTHORITY, 0) != null;
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void getCurrencyIso4217Code() {
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    @SuppressLint({"NewApi"})
    public final void getMediationNetwork(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (getMonetizationNetwork(context)) {
            this.getRevenue.execute(new f(4, this, context));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x010a  */
    /* JADX WARN: Code duplicated, block: B:48:0x011c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0135  */
    /* JADX WARN: Code duplicated, block: B:57:0x013a  */
    public static final void getMediationNetwork(AFj1sSDK aFj1sSDK, Context context) {
        Throwable th;
        ContentProviderClient contentProviderClient;
        Cursor cursorQuery;
        Date currencyIso4217Code;
        Intrinsics.checkNotNullParameter(aFj1sSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFj1sSDK.component2 = System.currentTimeMillis();
        aFj1sSDK.component1 = AFj1tSDK.AFa1uSDK.STARTED;
        aFj1sSDK.addObserver(new AFj1tSDK.AnonymousClass3());
        Cursor cursor = null;
        lValueOf = null;
        Long lValueOf = null;
        cursor = null;
        try {
            Uri uri = Uri.parse("content://com.samsung.android.mapsagent.providers.apptracking/info");
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                try {
                    cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, context.getPackageName(), new String[]{"appsflyer001"}, null);
                } catch (Throwable th2) {
                    th = th2;
                    contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                    try {
                        AFLogger.INSTANCE.e(AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Error while collecting referrer data", th, false, false, true, true);
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (contentProviderClient != null) {
                            contentProviderClient.close();
                        }
                        aFj1sSDK.getMonetizationNetwork();
                    } catch (Throwable th3) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (contentProviderClient != null) {
                            contentProviderClient.close();
                            throw th3;
                        }
                        throw th3;
                    }
                }
            } else {
                cursorQuery = null;
            }
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        if (C_(cursorQuery)) {
                            String strP_ = AFj1kSDK.P_(cursorQuery, "INSTALLED_TIME_TEXT");
                            if (strP_ != null && (currencyIso4217Code = AFj1mSDK.getCurrencyIso4217Code(strP_, "yy:MM:dd:hh:mm")) != null) {
                                lValueOf = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(currencyIso4217Code.getTime()));
                            }
                            if (lValueOf != null) {
                                long jLongValue = lValueOf.longValue();
                                Map<String, Object> map = aFj1sSDK.AFAdRevenueData;
                                Intrinsics.checkNotNullExpressionValue(map, "");
                                map.put("install_begin_ts", Long.valueOf(jLongValue));
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            String strP_2 = AFj1kSDK.P_(cursorQuery, "MAPS_ID");
                            if (strP_2 != null) {
                                linkedHashMap.put("maps_id", strP_2);
                            }
                            String strP_3 = AFj1kSDK.P_(cursorQuery, "DEVICE_NAME");
                            if (strP_3 != null) {
                                linkedHashMap.put("device_model", strP_3);
                            }
                            String strP_4 = AFj1kSDK.P_(cursorQuery, FeatureType.COUNTRY);
                            if (strP_4 != null) {
                                linkedHashMap.put(AdRevenueScheme.COUNTRY, strP_4);
                            }
                            String strP_5 = AFj1kSDK.P_(cursorQuery, "CAMPAIGN_ID");
                            if (strP_5 != null) {
                                linkedHashMap.put(FirebaseAnalytics.Param.CAMPAIGN_ID, strP_5);
                            }
                            if (!linkedHashMap.isEmpty()) {
                                Map<String, Object> map2 = aFj1sSDK.AFAdRevenueData;
                                Intrinsics.checkNotNullExpressionValue(map2, "");
                                map2.put("samsung_custom", linkedHashMap);
                            }
                            Map<String, Object> map3 = aFj1sSDK.AFAdRevenueData;
                            Intrinsics.checkNotNullExpressionValue(map3, "");
                            map3.put("api_ver", Long.valueOf(AFj1gSDK.AFAdRevenueData(context, "com.samsung.android.mapsagent")));
                            Map<String, Object> map4 = aFj1sSDK.AFAdRevenueData;
                            Intrinsics.checkNotNullExpressionValue(map4, "");
                            map4.put("api_ver_name", AFj1gSDK.getMonetizationNetwork(context, "com.samsung.android.mapsagent"));
                        } else {
                            AFg1gSDK.i$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "App was not installed via Samsung MAPS.", false, 4, null);
                        }
                        cursorQuery.close();
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                    } else {
                        AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Content provider returned no data", false, 4, null);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    cursor = cursorQuery;
                    contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                    AFLogger.INSTANCE.e(AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Error while collecting referrer data", th, false, false, true, true);
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (contentProviderClient != null) {
                        contentProviderClient.close();
                    }
                }
            } else {
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Content provider returned no data", false, 4, null);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
            }
        } catch (Throwable th5) {
            th = th5;
            contentProviderClient = null;
        }
        aFj1sSDK.getMonetizationNetwork();
    }
}
