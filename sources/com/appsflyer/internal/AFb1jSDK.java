package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1jSDK extends AFb1vSDK<String> {
    public AFb1jSDK(Context context, Executor executor) {
        super(context, executor, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFb1vSDK
    /* JADX INFO: renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
    public String getMediationNetwork() throws Throwable {
        Cursor cursor = null;
        try {
            ContentResolver contentResolver = this.getMonetizationNetwork.getContentResolver();
            StringBuilder sb2 = new StringBuilder("content://");
            sb2.append(this.getRevenue);
            Cursor cursorQuery = contentResolver.query(Uri.parse(sb2.toString()), new String[]{"aid"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("aid"));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Nullable
    public final String AFAdRevenueData() {
        this.AFAdRevenueData.execute(this.getMediationNetwork);
        return (String) super.getCurrencyIso4217Code();
    }

    @Override // com.appsflyer.internal.AFb1vSDK
    @Nullable
    public final /* synthetic */ String getCurrencyIso4217Code() {
        this.AFAdRevenueData.execute(this.getMediationNetwork);
        return (String) super.getCurrencyIso4217Code();
    }
}
