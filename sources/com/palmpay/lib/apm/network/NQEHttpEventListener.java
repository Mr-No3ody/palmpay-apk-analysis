package com.palmpay.lib.apm.network;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.palmpay.lib.apm.network.bean.NQEMetrics;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.Objects;
import okhttp3.AbstractC1956y;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.D;
import okhttp3.W;
import okhttp3.Y;
import okhttp3.e0;

/* JADX INFO: loaded from: classes3.dex */
public class NQEHttpEventListener extends AbstractC1956y {
    private static final String TAG = "NQEHttpEventListener";
    private boolean debug = false;

    private void calculateMetrics(Call call) {
        NQEMetrics metric = getMetric(call);
        if (!metric.getIsNormalRequest()) {
            if (isDebug()) {
                call.request().f40685a.b();
            }
            NQEManager.INSTANCE.removeMetricsFromMap(call.hashCode());
            return;
        }
        long dnsEndTime = metric.getDnsEndTime() - metric.getDnsStartTime();
        long secureConnectEndTime = metric.getSecureConnectEndTime() - metric.getSecureConnectStartTime();
        long connectEndTime = metric.getConnectEndTime() - metric.getConnectStartTime();
        if (metric.getSecureConnectEndTime() != 0 && metric.getSecureConnectStartTime() != 0) {
            connectEndTime -= metric.getSecureConnectEndTime() - metric.getSecureConnectStartTime();
        }
        metric.setCalculateData(metric.getResponseBodyEnd(), Long.valueOf(metric.getResponseHeadersStartTime() - metric.getRequestHeadersStartTime()), Long.valueOf(connectEndTime), Long.valueOf(dnsEndTime), Long.valueOf(secureConnectEndTime), SystemClock.elapsedRealtime());
        NQEManager nQEManager = NQEManager.INSTANCE;
        nQEManager.addMetrics(metric);
        nQEManager.removeMetricsFromMap(call.hashCode());
    }

    private NQEMetrics getMetric(Call call) {
        NQEManager nQEManager = NQEManager.INSTANCE;
        NQEMetrics nQEMetrics = nQEManager.getMetricsMap().get(Integer.valueOf(call.hashCode()));
        if (nQEMetrics != null) {
            return nQEMetrics;
        }
        NQEMetrics nQEMetrics2 = new NQEMetrics();
        nQEManager.getMetricsMap().put(Integer.valueOf(call.hashCode()), nQEMetrics2);
        return nQEMetrics2;
    }

    @Override // okhttp3.AbstractC1956y
    public void callEnd(Call call) {
        super.callEnd(call);
        if (isDebug()) {
            call.request().f40685a.b();
            getMetric(call).getResponseBodyEnd();
        }
        calculateMetrics(call);
    }

    @Override // okhttp3.AbstractC1956y
    public void callFailed(@NonNull Call call, IOException iOException) {
        super.callFailed(call, iOException);
        if (isDebug()) {
            call.request().f40685a.b();
            iOException.getMessage();
        }
        calculateMetrics(call);
    }

    @Override // okhttp3.AbstractC1956y
    public void callStart(Call call) {
        super.callStart(call);
        if (isDebug()) {
            call.request().f40685a.b();
        }
    }

    @Override // okhttp3.AbstractC1956y
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, W w3) {
        super.connectEnd(call, inetSocketAddress, proxy, w3);
        getMetric(call).setConnectEndTime(SystemClock.elapsedRealtime());
        if (isDebug()) {
            Objects.toString(inetSocketAddress);
        }
    }

    @Override // okhttp3.AbstractC1956y
    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, W w3, IOException iOException) {
        super.connectFailed(call, inetSocketAddress, proxy, w3, iOException);
        if (isDebug()) {
            Objects.toString(inetSocketAddress);
        }
    }

    @Override // okhttp3.AbstractC1956y
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(call, inetSocketAddress, proxy);
        getMetric(call).setConnectStartTime(SystemClock.elapsedRealtime());
        if (isDebug()) {
            Objects.toString(inetSocketAddress);
        }
    }

    @Override // okhttp3.AbstractC1956y
    public void connectionAcquired(Call call, Connection connection) {
        super.connectionAcquired(call, connection);
        if (isDebug()) {
            Objects.toString(connection);
        }
    }

    @Override // okhttp3.AbstractC1956y
    public void connectionReleased(Call call, Connection connection) {
        super.connectionReleased(call, connection);
        try {
            getMetric(call).setProtocol(connection.protocol().f40679a);
        } catch (Exception unused) {
        }
    }

    @Override // okhttp3.AbstractC1956y
    public void dnsEnd(Call call, String str, List<InetAddress> list) {
        super.dnsEnd(call, str, list);
        getMetric(call).setDnsEndTime(SystemClock.elapsedRealtime());
        isDebug();
    }

    @Override // okhttp3.AbstractC1956y
    public void dnsStart(Call call, String str) {
        super.dnsStart(call, str);
        NQEMetrics metric = getMetric(call);
        metric.setDnsStartTime(SystemClock.elapsedRealtime());
        metric.setNormalRequest(true);
    }

    public boolean isDebug() {
        return this.debug;
    }

    @Override // okhttp3.AbstractC1956y
    public void requestBodyEnd(Call call, long j6) {
        super.requestBodyEnd(call, j6);
        getMetric(call).setRequestBodyEndTime(SystemClock.elapsedRealtime());
        if (isDebug()) {
            call.request().f40685a.b();
        }
    }

    @Override // okhttp3.AbstractC1956y
    public void requestBodyStart(Call call) {
        super.requestBodyStart(call);
        getMetric(call).setRequestBodyStartTime(SystemClock.elapsedRealtime());
        if (isDebug()) {
            call.request().f40685a.b();
        }
    }

    @Override // okhttp3.AbstractC1956y
    public void requestFailed(Call call, IOException iOException) {
        super.requestFailed(call, iOException);
        if (isDebug()) {
            call.request().f40685a.b();
        }
    }

    @Override // okhttp3.AbstractC1956y
    public void requestHeadersEnd(Call call, Y y8) {
        super.requestHeadersEnd(call, y8);
        if (isDebug()) {
            call.request().f40685a.b();
        }
    }

    @Override // okhttp3.AbstractC1956y
    public void requestHeadersStart(Call call) {
        super.requestHeadersStart(call);
        NQEMetrics metric = getMetric(call);
        metric.setRequestHeadersStartTime(SystemClock.elapsedRealtime());
        metric.setNormalRequest(true);
        if (isDebug()) {
            call.request().f40685a.b();
        }
    }

    @Override // okhttp3.AbstractC1956y
    public void responseBodyEnd(Call call, long j6) {
        super.responseBodyEnd(call, j6);
        getMetric(call).setResponseBodyEndTime(SystemClock.elapsedRealtime());
        getMetric(call).setResponseBodyEnd(true);
        if (isDebug()) {
            call.request().f40685a.b();
        }
    }

    @Override // okhttp3.AbstractC1956y
    public void responseBodyStart(Call call) {
        super.responseBodyStart(call);
        getMetric(call).setResponseBodyStartTime(SystemClock.elapsedRealtime());
        if (isDebug()) {
            call.request().f40685a.b();
        }
    }

    @Override // okhttp3.AbstractC1956y
    public void responseFailed(Call call, IOException iOException) {
        super.responseFailed(call, iOException);
        if (isDebug()) {
            call.request().f40685a.b();
            Objects.toString(iOException);
        }
    }

    @Override // okhttp3.AbstractC1956y
    public void responseHeadersEnd(Call call, e0 e0Var) {
        super.responseHeadersEnd(call, e0Var);
        getMetric(call).setResponseHeadersEndTime(SystemClock.elapsedRealtime());
        if (isDebug()) {
            call.request().f40685a.b();
        }
    }

    @Override // okhttp3.AbstractC1956y
    public void responseHeadersStart(Call call) {
        super.responseHeadersStart(call);
        getMetric(call).setResponseHeadersStartTime(SystemClock.elapsedRealtime());
        if (isDebug()) {
            call.request().f40685a.b();
        }
    }

    @Override // okhttp3.AbstractC1956y
    public void secureConnectEnd(Call call, D d2) {
        super.secureConnectEnd(call, d2);
        getMetric(call).setSecureConnectEndTime(SystemClock.elapsedRealtime());
    }

    @Override // okhttp3.AbstractC1956y
    public void secureConnectStart(Call call) {
        super.secureConnectStart(call);
        getMetric(call).setSecureConnectStartTime(SystemClock.elapsedRealtime());
        isDebug();
    }

    public void setDebug(boolean z3) {
        this.debug = z3;
    }
}
