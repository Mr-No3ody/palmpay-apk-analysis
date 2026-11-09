package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.J;
import okhttp3.Y;
import okhttp3.e0;

/* JADX INFO: loaded from: classes2.dex */
public class InstrumentOkHttpEnqueueCallback implements Callback {
    private final Callback callback;
    private final NetworkRequestMetricBuilder networkMetricBuilder;
    private final long startTimeMicros;
    private final Timer timer;

    public InstrumentOkHttpEnqueueCallback(Callback callback, TransportManager transportManager, Timer timer, long j6) {
        this.callback = callback;
        this.networkMetricBuilder = NetworkRequestMetricBuilder.builder(transportManager);
        this.startTimeMicros = j6;
        this.timer = timer;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        Y yRequest = call.request();
        if (yRequest != null) {
            J j6 = yRequest.f40685a;
            if (j6 != null) {
                this.networkMetricBuilder.setUrl(j6.l().toString());
            }
            String str = yRequest.f40686b;
            if (str != null) {
                this.networkMetricBuilder.setHttpMethod(str);
            }
        }
        this.networkMetricBuilder.setRequestStartTimeMicros(this.startTimeMicros);
        this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
        NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
        this.callback.onFailure(call, iOException);
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, e0 e0Var) throws IOException {
        FirebasePerfOkHttpClient.sendNetworkMetric(e0Var, this.networkMetricBuilder, this.startTimeMicros, this.timer.getDurationMicros());
        this.callback.onResponse(call, e0Var);
    }
}
