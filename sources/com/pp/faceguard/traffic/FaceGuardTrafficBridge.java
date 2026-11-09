package com.pp.faceguard.traffic;

import android.util.Log;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class FaceGuardTrafficBridge {
    private static final String TAG = "FaceGuardTraffic";

    private FaceGuardTrafficBridge() {
    }

    public static URLConnection openConnection(URL url) throws IOException {
        if (Log.isLoggable(TAG, 3)) {
            Objects.toString(url);
        }
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
        return (TrafficUploader.isBypassed() || !(uRLConnection instanceof HttpURLConnection)) ? uRLConnection : new CapturingHttpURLConnection((HttpURLConnection) uRLConnection, TrafficUploader.getInstance());
    }
}
