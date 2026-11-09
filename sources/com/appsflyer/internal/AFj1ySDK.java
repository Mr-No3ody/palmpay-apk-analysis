package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.adjust.sdk.Constants;
import com.appsflyer.AFLogger;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nMetaReferrer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetaReferrer.kt\ncom/appsflyer/internal/referrer/MetaReferrer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,295:1\n1#2:296\n*E\n"})
public final class AFj1ySDK extends AFi1dSDK {

    @NotNull
    private final AFj1zSDK areAllFieldsValid;

    @NotNull
    private final Runnable component3;

    @Nullable
    private String copy;

    @NotNull
    private final ExecutorService getMonetizationNetwork;

    @NotNull
    private final AFc1pSDK getRevenue;

    public /* synthetic */ class AFa1zSDK {
        public static final /* synthetic */ int[] getMediationNetwork;

        static {
            int[] iArr = new int[AFj1zSDK.values().length];
            try {
                iArr[AFj1zSDK.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFj1zSDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFj1zSDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getMediationNetwork = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AFj1ySDK(@NotNull AFc1pSDK aFc1pSDK, @NotNull ExecutorService executorService, @NotNull AFj1zSDK aFj1zSDK, @NotNull Runnable runnable, @NotNull Runnable runnable2) {
        String str;
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFj1zSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(runnable2, "");
        int i7 = AFj1xSDK.AFa1zSDK.AFAdRevenueData[aFj1zSDK.ordinal()];
        if (i7 == 1) {
            str = "facebook";
        } else if (i7 == 2) {
            str = "instagram";
        } else {
            if (i7 != 3) {
                throw new p355xf.l();
            }
            str = "facebook_lite";
        }
        super("app", str, aFc1pSDK, runnable);
        this.getRevenue = aFc1pSDK;
        this.getMonetizationNetwork = executorService;
        this.areAllFieldsValid = aFj1zSDK;
        this.component3 = runnable2;
    }

    private static boolean AFAdRevenueData(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    private static boolean component2(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    private static boolean getCurrencyIso4217Code(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }

    private final boolean getMonetizationNetwork(Context context) {
        int i7 = AFa1zSDK.getMediationNetwork[this.areAllFieldsValid.ordinal()];
        if (i7 == 1) {
            return getCurrencyIso4217Code(context);
        }
        if (i7 == 2) {
            return AFAdRevenueData(context);
        }
        if (i7 == 3) {
            return component2(context);
        }
        throw new p355xf.l();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008d A[PHI: r0
      0x008d: PHI (r0v7 java.lang.String) = (r0v6 java.lang.String), (r0v13 java.lang.String), (r0v19 java.lang.String) binds: [B:14:0x003c, B:23:0x0063, B:32:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    private final boolean getRevenue(Context context) {
        String str;
        if (!AFAdRevenueData()) {
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        String monetizationNetwork = this.getRevenue.getMonetizationNetwork("com.facebook.sdk.ApplicationId");
        String strI = monetizationNetwork != null ? StringsKt.I(monetizationNetwork, "fb") : null;
        if (strI == null || strI.length() == 0) {
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id Manifest metadata is not found.", false, 4, null);
            strI = null;
        }
        if (strI == null) {
            String currencyIso4217Code = this.getRevenue.getCurrencyIso4217Code("facebook_application_id");
            strI = currencyIso4217Code != null ? StringsKt.I(currencyIso4217Code, "fb") : null;
            if (strI == null || strI.length() == 0) {
                AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook app id string resource is not found.", false, 4, null);
                strI = null;
            }
            if (strI == null) {
                String monetizationNetwork2 = this.getRevenue.getMonetizationNetwork("com.appsflyer.FacebookApplicationId");
                strI = monetizationNetwork2 != null ? StringsKt.I(monetizationNetwork2, "fb") : null;
                if (strI == null || strI.length() == 0) {
                    AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "AF Facebook app id Manifest metadata is not found.", false, 4, null);
                    strI = null;
                }
                str = strI != null ? strI : null;
            }
        }
        this.copy = str;
        if (str == null) {
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing Facebook app id.", false, 4, null);
            return false;
        }
        if (getMonetizationNetwork(context)) {
            return true;
        }
        AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Referrer collection disallowed by missing content providers.", false, 4, null);
        return false;
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    @SuppressLint({"NewApi"})
    public final void getMediationNetwork(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (getRevenue(context)) {
            this.getMonetizationNetwork.execute(new f(6, this, context));
        } else {
            this.component3.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:72:0x0210 A[PHI: r25
      0x0210: PHI (r25v2 android.content.ContentProviderClient) = 
      (r25v1 android.content.ContentProviderClient)
      (r25v3 android.content.ContentProviderClient)
      (r25v3 android.content.ContentProviderClient)
     binds: [B:83:0x0257, B:71:0x020e, B:76:0x0225] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x0222  */
    /* JADX WARN: Code duplicated, block: B:82:0x0254  */
    public static final void getCurrencyIso4217Code(AFj1ySDK aFj1ySDK, Context context) {
        String str;
        Throwable th;
        Cursor cursor;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        Uri uri;
        String string;
        String str2;
        Intrinsics.checkNotNullParameter(aFj1ySDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFj1ySDK.component2 = System.currentTimeMillis();
        aFj1ySDK.component1 = AFj1tSDK.AFa1uSDK.STARTED;
        aFj1ySDK.addObserver(new AFj1tSDK.AnonymousClass3());
        String str3 = aFj1ySDK.copy;
        Intrinsics.e(str3);
        try {
            AFj1zSDK aFj1zSDK = aFj1ySDK.areAllFieldsValid;
            int[] iArr = AFa1zSDK.getMediationNetwork;
            int i7 = iArr[aFj1zSDK.ordinal()];
            str = "Error while collecting Meta Install Referrer for ";
            try {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            throw new p355xf.l();
                        }
                        if (component2(context)) {
                            AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook Lite content provider", false, 4, null);
                            uri = Uri.parse("content://com.facebook.lite.provider.InstallReferrerProvider/".concat(str3));
                        } else {
                            AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook Lite content provider not found", false, 4, null);
                            uri = null;
                        }
                    } else if (AFAdRevenueData(context)) {
                        AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Instagram content provider", false, 4, null);
                        uri = Uri.parse("content://com.instagram.contentprovider.InstallReferrerProvider/".concat(str3));
                    } else {
                        AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Instagram content provider not found", false, 4, null);
                        uri = null;
                    }
                } else if (getCurrencyIso4217Code(context)) {
                    AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Found Facebook content provider", false, 4, null);
                    uri = Uri.parse("content://com.facebook.katana.provider.InstallReferrerProvider/".concat(str3));
                } else {
                    AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Facebook content provider not found", false, 4, null);
                    uri = null;
                }
                if (uri != null) {
                    contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient != null ? contentProviderClientAcquireUnstableContentProviderClient.query(uri, new String[]{Constants.INSTALL_REFERRER, "is_ct", "actual_timestamp"}, null, null, null) : null;
                        if (cursorQuery != null) {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    int columnIndex = cursorQuery.getColumnIndex(Constants.INSTALL_REFERRER);
                                    if (columnIndex != -1) {
                                        string = cursorQuery.getString(columnIndex);
                                    } else {
                                        AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "No such column, " + aFj1ySDK.areAllFieldsValid + " provider", false, 4, null);
                                        string = null;
                                    }
                                    if (string != null) {
                                        AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Collected " + aFj1ySDK.areAllFieldsValid + " attribution data.", false, 4, null);
                                        Map<String, Object> map = aFj1ySDK.AFAdRevenueData;
                                        Intrinsics.checkNotNullExpressionValue(map, "");
                                        map.put("response", "OK");
                                        Map<String, Object> map2 = aFj1ySDK.AFAdRevenueData;
                                        Intrinsics.checkNotNullExpressionValue(map2, "");
                                        map2.put(Constants.REFERRER, string);
                                        int columnIndex2 = cursorQuery.getColumnIndex("actual_timestamp");
                                        Long lValueOf = columnIndex2 != -1 ? Long.valueOf(cursorQuery.getLong(columnIndex2)) : null;
                                        if (lValueOf != null) {
                                            aFj1ySDK.AFAdRevenueData.put("click_ts", Long.valueOf(lValueOf.longValue()));
                                        }
                                        int columnIndex3 = cursorQuery.getColumnIndex("is_ct");
                                        Integer numValueOf = columnIndex3 != -1 ? Integer.valueOf(cursorQuery.getInt(columnIndex3)) : null;
                                        if (numValueOf != null) {
                                            aFj1ySDK.AFAdRevenueData.put("meta_custom", G.h(new Pair("is_ct", Integer.valueOf(numValueOf.intValue()))));
                                        }
                                        int i10 = iArr[aFj1ySDK.areAllFieldsValid.ordinal()];
                                        if (i10 == 1) {
                                            str2 = "com.facebook.katana";
                                        } else if (i10 == 2) {
                                            str2 = "com.instagram.android";
                                        } else {
                                            if (i10 != 3) {
                                                throw new p355xf.l();
                                            }
                                            str2 = "com.facebook.lite";
                                        }
                                        Map<String, Object> map3 = aFj1ySDK.AFAdRevenueData;
                                        Intrinsics.checkNotNullExpressionValue(map3, "");
                                        map3.put("api_ver", Long.valueOf(AFj1gSDK.AFAdRevenueData(context, str2)));
                                        Map<String, Object> map4 = aFj1ySDK.AFAdRevenueData;
                                        Intrinsics.checkNotNullExpressionValue(map4, "");
                                        map4.put("api_ver_name", AFj1gSDK.getMonetizationNetwork(context, str2));
                                    }
                                    cursorQuery.close();
                                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                        contentProviderClientAcquireUnstableContentProviderClient.close();
                                    }
                                } else {
                                    AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                        contentProviderClientAcquireUnstableContentProviderClient.close();
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                cursor = cursorQuery;
                                try {
                                    AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, str + aFj1ySDK.areAllFieldsValid.name() + " provider", th, false, false, false, false, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP, null);
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                        contentProviderClientAcquireUnstableContentProviderClient.close();
                                    }
                                } catch (Throwable th3) {
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                        contentProviderClientAcquireUnstableContentProviderClient.close();
                                    }
                                    throw th3;
                                }
                            }
                        } else {
                            AFg1gSDK.d$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, "Content provider returned no data", false, 4, null);
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                                contentProviderClientAcquireUnstableContentProviderClient.close();
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        cursor = null;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                th = th;
                cursor = null;
                contentProviderClientAcquireUnstableContentProviderClient = null;
                AFg1gSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.META_REFERRER, str + aFj1ySDK.areAllFieldsValid.name() + " provider", th, false, false, false, false, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP, null);
                if (cursor != null) {
                    cursor.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                aFj1ySDK.getMonetizationNetwork();
                aFj1ySDK.component3.run();
            }
        } catch (Throwable th6) {
            th = th6;
            str = "Error while collecting Meta Install Referrer for ";
        }
        aFj1ySDK.getMonetizationNetwork();
        aFj1ySDK.component3.run();
    }
}
