package com.adjust.sdk.network;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes.dex */
public final class c implements UtilNetworking.IHttpsURLConnectionProvider {
    @Override // com.adjust.sdk.network.UtilNetworking.IHttpsURLConnectionProvider
    public final HttpsURLConnection generateHttpsURLConnection(URL url) {
        return (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
    }
}
