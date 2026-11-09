package com.bumptech.glide.load.data;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes.dex */
public final class h implements HttpUrlFetcher$HttpUrlConnectionFactory {
    @Override // com.bumptech.glide.load.data.HttpUrlFetcher$HttpUrlConnectionFactory
    public final HttpURLConnection build(URL url) {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
    }
}
