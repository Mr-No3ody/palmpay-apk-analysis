package com.appsflyer.internal;

import androidx.annotation.NonNull;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public interface AFe1xSDK<ResponseType> {
    @NonNull
    ResponseType getCurrencyIso4217Code(String str) throws JSONException;
}
