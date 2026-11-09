package com.pp.faceguard.traffic;

import java.net.HttpURLConnection;
import okhttp3.X;

/* JADX INFO: loaded from: classes3.dex */
final class TrafficRequestHeaders {
    private TrafficRequestHeaders() {
    }

    public static void apply(HttpURLConnection httpURLConnection) {
        httpURLConnection.setRequestProperty("No-Token", "yes");
        httpURLConnection.setRequestProperty("Black-Code", "yes");
    }

    public static void apply(X x3) {
        x3.e("No-Token", "yes");
        x3.e("Black-Code", "yes");
    }
}
