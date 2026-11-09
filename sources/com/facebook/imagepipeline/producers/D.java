package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class D extends AbstractC1339d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f21469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RealtimeSinceBootClock f21470c;

    public D(int i7) {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.get();
        this.f21469b = ShadowExecutors.newOptimizedFixedThreadPool(3, "\u200bcom.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher");
        this.f21470c = realtimeSinceBootClock;
        this.f21468a = i7;
    }

    public final HttpURLConnection a(Uri uri, int i7) throws IOException {
        URL url;
        String str;
        Uri uri2 = p333w2.a.f43254a;
        if (uri == null) {
            url = null;
        } else {
            try {
                url = new URL(uri.toString());
            } catch (MalformedURLException e10) {
                throw new RuntimeException(e10);
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setConnectTimeout(this.f21468a);
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode >= 200 && responseCode < 300) {
            return httpURLConnection;
        }
        if (responseCode != 307 && responseCode != 308) {
            switch (responseCode) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    httpURLConnection.disconnect();
                    throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
            }
        }
        String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
        httpURLConnection.disconnect();
        Uri uri3 = headerField != null ? Uri.parse(headerField) : null;
        String scheme = uri.getScheme();
        if (i7 > 0 && uri3 != null && !p213o2.e.h(uri3.getScheme(), scheme)) {
            return a(uri3, i7 - 1);
        }
        if (i7 == 0) {
            String string = uri.toString();
            Locale.getDefault();
            str = "URL " + string + " follows too many redirects";
        } else {
            str = String.format(Locale.getDefault(), "URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode));
        }
        throw new IOException(str);
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public final AbstractC1360z createFetchState(Consumer consumer, ProducerContext producerContext) {
        return new C(consumer, producerContext);
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public final void fetch(AbstractC1360z abstractC1360z, NetworkFetcher.Callback callback) {
        C c6 = (C) abstractC1360z;
        c6.f21465f = this.f21470c.now();
        c6.f21651b.addCallbacks(new B(this.f21469b.submit(new A(this, c6, callback)), callback));
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public final Map getExtraMap(AbstractC1360z abstractC1360z, int i7) {
        C c6 = (C) abstractC1360z;
        HashMap map = new HashMap(4);
        map.put("queue_time", Long.toString(c6.f21466g - c6.f21465f));
        map.put("fetch_time", Long.toString(c6.f21467h - c6.f21466g));
        map.put("total_time", Long.toString(c6.f21467h - c6.f21465f));
        map.put("image_size", Integer.toString(i7));
        return map;
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public final void onFetchCompletion(AbstractC1360z abstractC1360z, int i7) {
        ((C) abstractC1360z).f21467h = this.f21470c.now();
    }
}
