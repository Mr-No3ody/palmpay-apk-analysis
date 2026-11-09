package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.J;
import okhttp3.L;
import okhttp3.Y;
import okhttp3.c0;
import okhttp3.e0;
import okhttp3.h0;

/* JADX INFO: loaded from: classes2.dex */
public class FirebasePerfOkHttpClient {
    private FirebasePerfOkHttpClient() {
    }

    @Keep
    public static void enqueue(Call call, Callback callback) {
        Timer timer = new Timer();
        call.enqueue(new InstrumentOkHttpEnqueueCallback(callback, TransportManager.getInstance(), timer, timer.getMicros()));
    }

    @Keep
    public static e0 execute(Call call) throws IOException {
        NetworkRequestMetricBuilder networkRequestMetricBuilderBuilder = NetworkRequestMetricBuilder.builder(TransportManager.getInstance());
        Timer timer = new Timer();
        long micros = timer.getMicros();
        try {
            e0 e0VarExecute = call.execute();
            sendNetworkMetric(e0VarExecute, networkRequestMetricBuilderBuilder, micros, timer.getDurationMicros());
            return e0VarExecute;
        } catch (IOException e10) {
            Y yRequest = call.request();
            if (yRequest != null) {
                J j6 = yRequest.f40685a;
                if (j6 != null) {
                    networkRequestMetricBuilderBuilder.setUrl(j6.l().toString());
                }
                String str = yRequest.f40686b;
                if (str != null) {
                    networkRequestMetricBuilderBuilder.setHttpMethod(str);
                }
            }
            networkRequestMetricBuilderBuilder.setRequestStartTimeMicros(micros);
            networkRequestMetricBuilderBuilder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(networkRequestMetricBuilderBuilder);
            throw e10;
        }
    }

    public static void sendNetworkMetric(e0 e0Var, NetworkRequestMetricBuilder networkRequestMetricBuilder, long j6, long j10) throws IOException {
        Y y8 = e0Var.f40728a;
        if (y8 == null) {
            return;
        }
        networkRequestMetricBuilder.setUrl(y8.f40685a.l().toString());
        networkRequestMetricBuilder.setHttpMethod(y8.f40686b);
        c0 c0Var = y8.f40688d;
        if (c0Var != null) {
            long jContentLength = c0Var.contentLength();
            if (jContentLength != -1) {
                networkRequestMetricBuilder.setRequestPayloadBytes(jContentLength);
            }
        }
        h0 h0Var = e0Var.f40734g;
        if (h0Var != null) {
            long jContentLength2 = h0Var.contentLength();
            if (jContentLength2 != -1) {
                networkRequestMetricBuilder.setResponsePayloadBytes(jContentLength2);
            }
            L lContentType = h0Var.contentType();
            if (lContentType != null) {
                networkRequestMetricBuilder.setResponseContentType(lContentType.f40592a);
            }
        }
        networkRequestMetricBuilder.setHttpResponseCode(e0Var.f40731d);
        networkRequestMetricBuilder.setRequestStartTimeMicros(j6);
        networkRequestMetricBuilder.setTimeToResponseCompletedMicros(j10);
        networkRequestMetricBuilder.build();
    }
}
