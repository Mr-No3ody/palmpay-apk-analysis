package com.bumptech.glide.load.data;

import C0.G;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i implements DataFetcher {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f20539f = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.model.l f20540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HttpURLConnection f20542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InputStream f20543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f20544e;

    public i(com.bumptech.glide.load.model.l lVar, int i7) {
        this.f20540a = lVar;
        this.f20541b = i7;
    }

    public final InputStream a(URL url, int i7, URL url2, Map map) throws Kf.d {
        int responseCode;
        int responseCode2 = -1;
        if (i7 >= 5) {
            throw new Kf.d("Too many (> 5) redirects!", -1, (IOException) null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new Kf.d("In re-direct loop", -1, (IOException) null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnectionBuild = f20539f.build(url);
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnectionBuild.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int i10 = this.f20541b;
            httpURLConnectionBuild.setConnectTimeout(i10);
            httpURLConnectionBuild.setReadTimeout(i10);
            httpURLConnectionBuild.setUseCaches(false);
            httpURLConnectionBuild.setDoInput(true);
            httpURLConnectionBuild.setInstanceFollowRedirects(false);
            this.f20542c = httpURLConnectionBuild;
            try {
                httpURLConnectionBuild.connect();
                this.f20543d = this.f20542c.getInputStream();
                if (this.f20544e) {
                    return null;
                }
                try {
                    responseCode = this.f20542c.getResponseCode();
                } catch (IOException unused2) {
                    responseCode = -1;
                }
                int i11 = responseCode / 100;
                if (i11 == 2) {
                    HttpURLConnection httpURLConnection = this.f20542c;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                            this.f20543d = new J1.e(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                httpURLConnection.getContentEncoding();
                            }
                            this.f20543d = httpURLConnection.getInputStream();
                        }
                        return this.f20543d;
                    } catch (IOException e10) {
                        try {
                            responseCode2 = httpURLConnection.getResponseCode();
                        } catch (IOException unused3) {
                        }
                        throw new Kf.d("Failed to obtain InputStream", responseCode2, e10);
                    }
                }
                if (i11 != 3) {
                    if (responseCode == -1) {
                        throw new Kf.d("Http request failed", responseCode, (IOException) null);
                    }
                    try {
                        throw new Kf.d(this.f20542c.getResponseMessage(), responseCode, (IOException) null);
                    } catch (IOException e11) {
                        throw new Kf.d("Failed to get a response message", responseCode, e11);
                    }
                }
                String headerField = this.f20542c.getHeaderField(HttpHeaders.LOCATION);
                if (TextUtils.isEmpty(headerField)) {
                    throw new Kf.d("Received empty or null redirect url", responseCode, (IOException) null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    cleanup();
                    return a(url3, i7 + 1, url, map);
                } catch (MalformedURLException e12) {
                    throw new Kf.d(G.o("Bad redirect url: ", headerField), responseCode, e12);
                }
            } catch (IOException e13) {
                try {
                    responseCode2 = this.f20542c.getResponseCode();
                } catch (IOException unused4) {
                }
                throw new Kf.d("Failed to connect or obtain data", responseCode2, e13);
            }
        } catch (IOException e14) {
            throw new Kf.d("URL.openConnection threw", 0, e14);
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cancel() {
        this.f20544e = true;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void cleanup() {
        InputStream inputStream = this.f20543d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f20542c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f20542c = null;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final Class getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final com.bumptech.glide.load.a getDataSource() {
        return com.bumptech.glide.load.a.f20509b;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void loadData(com.bumptech.glide.g gVar, DataFetcher.DataCallback dataCallback) {
        com.bumptech.glide.load.model.l lVar = this.f20540a;
        int i7 = J1.i.f4465a;
        SystemClock.elapsedRealtimeNanos();
        try {
            if (lVar.f20849f == null) {
                lVar.f20849f = new URL(lVar.b());
            }
            dataCallback.onDataReady(a(lVar.f20849f, 0, null, lVar.f20845b.getHeaders()));
        } catch (IOException e10) {
            dataCallback.onLoadFailed(e10);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }
}
