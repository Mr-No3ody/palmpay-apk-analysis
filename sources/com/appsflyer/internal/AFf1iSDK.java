package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.lvl.AppsFlyerLVL;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1iSDK {

    public interface AFa1vSDK {
        void AFAdRevenueData(String str, Exception exc);

        void getRevenue(@NonNull String str, @NonNull String str2);
    }

    public final boolean getCurrencyIso4217Code(long j6, @NonNull Context context, @NonNull final AFa1vSDK aFa1vSDK) {
        try {
            AppsFlyerLVL.checkLicense(j6, context, new AppsFlyerLVL.resultListener() { // from class: com.appsflyer.internal.AFf1iSDK.1
                public final void onLvlFailure(Exception exc) {
                    aFa1vSDK.AFAdRevenueData("onLvlFailure with exception", exc);
                }

                public final void onLvlResult(String str, String str2) {
                    if (str != null && str2 != null) {
                        aFa1vSDK.getRevenue(str, str2);
                    } else if (str2 == null) {
                        aFa1vSDK.AFAdRevenueData("onLvlResult with error", new Exception("AFLVL Invalid signature"));
                    } else {
                        aFa1vSDK.AFAdRevenueData("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
                    }
                }
            });
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
