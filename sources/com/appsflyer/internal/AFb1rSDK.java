package com.appsflyer.internal;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1rSDK {
    @Nullable
    public static Uri k_(@Nullable Intent intent) {
        if (intent == null) {
            return null;
        }
        AFj1lSDK aFj1lSDK = new AFj1lSDK(intent);
        Uri uri = (Uri) aFj1lSDK.H_("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String currencyIso4217Code = aFj1lSDK.getCurrencyIso4217Code("android.intent.extra.REFERRER_NAME");
        if (currencyIso4217Code != null) {
            return Uri.parse(currencyIso4217Code);
        }
        return null;
    }
}
