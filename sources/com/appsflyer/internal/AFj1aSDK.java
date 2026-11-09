package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1aSDK {
    public final WeakReference<Context> getCurrencyIso4217Code;
    public String getMonetizationNetwork;

    public AFj1aSDK(@NonNull Context context) {
        this.getCurrencyIso4217Code = new WeakReference<>(context);
    }
}
