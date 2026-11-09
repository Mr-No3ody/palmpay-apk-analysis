package com.adjust.sdk.network;

import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes.dex */
public final class b implements UtilNetworking.IConnectionOptions {
    @Override // com.adjust.sdk.network.UtilNetworking.IConnectionOptions
    public final void applyConnectionOptions(HttpsURLConnection httpsURLConnection, String str, int i7) {
        httpsURLConnection.setRequestProperty("Client-SDK", str);
        httpsURLConnection.setConnectTimeout(i7);
        httpsURLConnection.setReadTimeout(i7);
    }
}
