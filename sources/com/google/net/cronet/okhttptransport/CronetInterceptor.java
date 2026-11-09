package com.google.net.cronet.okhttptransport;

import android.text.TextUtils;
import android.util.Log;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.didiglobal.booster.instrument.ShadowScheduledThreadPoolExecutor;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.H;
import okhttp3.Interceptor;
import okhttp3.J;
import okhttp3.X;
import okhttp3.Y;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.h0;
import org.chromium.net.CronetEngine;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class CronetInterceptor implements Interceptor, AutoCloseable {
    private static final int CANCELLATION_CHECK_INTERVAL_MILLIS = 500;
    private static final int DEFAULT_TIMEOUT = 30000;
    private static final String KEY_TRACE_TIME = "tTaCeTiMe";
    private static final String TAG = "CronetInterceptor";
    private final Map<Call, UrlRequestWrap> activeCalls;
    private final RequestResponseConverter converter;
    private final ScheduledExecutorService scheduledExecutor;
    private int timeoutInMs;

    public static final class Builder extends RequestResponseConverterBasedBuilder<Builder, CronetInterceptor> {
        private CronetLogHelper.OnMetricCallback metricCallback;
        private int timeoutInMs;
        private String traceName;

        public Builder(CronetEngine cronetEngine) {
            super(cronetEngine, Builder.class);
            this.metricCallback = null;
        }

        public Builder setMetricCallBack(CronetLogHelper.OnMetricCallback onMetricCallback) {
            this.metricCallback = onMetricCallback;
            return this;
        }

        public Builder setTimeout(int i7) {
            this.timeoutInMs = i7;
            return this;
        }

        public Builder setTraceName(String str) {
            this.traceName = str;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.net.cronet.okhttptransport.RequestResponseConverterBasedBuilder
        public CronetInterceptor build(RequestResponseConverter requestResponseConverter) {
            CronetLogHelper.OnMetricCallback onMetricCallback = this.metricCallback;
            if (onMetricCallback != null) {
                CronetLogHelper.INSTANCE.setOnMetricCallback(onMetricCallback);
            }
            return new CronetInterceptor(requestResponseConverter, this.traceName, this.timeoutInMs);
        }
    }

    public class CronetInterceptorResponseBody extends CronetTransportResponseBody {
        private final Call call;

        @Override // com.google.net.cronet.okhttptransport.CronetTransportResponseBody
        public void customCloseHook() {
            Objects.toString(this.call);
            CronetInterceptor.this.activeCalls.remove(this.call);
        }

        private CronetInterceptorResponseBody(h0 h0Var, Call call) {
            super(h0Var);
            this.call = call;
        }
    }

    public static class UrlRequestWrap {
        private UrlRequest request;
        private String timeStamp;

        public UrlRequestWrap(UrlRequest urlRequest, String str) {
            this.request = urlRequest;
            this.timeStamp = str;
        }

        public void cancel() {
            UrlRequest urlRequest = this.request;
            if (urlRequest != null) {
                urlRequest.cancel();
            }
        }

        public String getTime() {
            return this.timeStamp;
        }

        public boolean isTimeout(int i7) {
            if (!TextUtils.isEmpty(this.timeStamp) && i7 > 0) {
                try {
                    if (System.currentTimeMillis() - Long.parseLong(this.timeStamp) > i7) {
                        return true;
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        Iterator<Map.Entry<Call, UrlRequestWrap>> it = this.activeCalls.entrySet().iterator();
        while (it.hasNext()) {
            try {
                Map.Entry<Call, UrlRequestWrap> next = it.next();
                boolean zIsCanceled = next.getKey().isCanceled();
                if (zIsCanceled || next.getValue().isTimeout(this.timeoutInMs)) {
                    if (!zIsCanceled) {
                        next.getKey().cancel();
                    }
                    it.remove();
                    next.getValue().cancel();
                }
            } catch (Exception unused) {
            }
        }
    }

    public static Builder newBuilder(CronetEngine cronetEngine) {
        return new Builder(cronetEngine);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String parseStartTime(String str) {
        if (str != null) {
            try {
                if (str.matches("(tTaCeTiMe=)([^&]*)")) {
                    String strReplaceAll = str.replaceAll("(tTaCeTiMe=)([^&]*)", "$2");
                    if (TextUtils.isEmpty(strReplaceAll)) {
                        return null;
                    }
                    return strReplaceAll;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private e0 toInterceptorResponse(e0 e0Var, Call call) {
        Preconditions.checkNotNull(e0Var.f40734g);
        h0 h0Var = e0Var.f40734g;
        if (h0Var instanceof CronetInterceptorResponseBody) {
            return e0Var;
        }
        d0 d0VarC = e0Var.c();
        d0VarC.f40721g = new CronetInterceptorResponseBody(h0Var, call);
        return d0VarC.a();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.scheduledExecutor.shutdown();
    }

    @Override // okhttp3.Interceptor
    public e0 intercept(Interceptor.Chain chain) throws IOException {
        if (chain.call().isCanceled()) {
            throw new IOException("Canceled");
        }
        Y yRequest = chain.request();
        J j6 = yRequest.f40685a;
        H hF = j6.f();
        String strH = j6.h(KEY_TRACE_TIME);
        if (TextUtils.isEmpty(strH)) {
            strH = String.valueOf(System.currentTimeMillis());
            hF.a(KEY_TRACE_TIME, strH);
        }
        J url = hF.b();
        X xB = yRequest.b();
        Intrinsics.checkNotNullParameter(url, "url");
        xB.f40680a = url;
        Y yB = xB.b();
        String str = yB.f40685a.f40587i;
        RequestResponseConverter.CronetRequestAndOkHttpResponse cronetRequestAndOkHttpResponseConvert = this.converter.convert(yB, chain.readTimeoutMillis(), chain.writeTimeoutMillis());
        Call call = chain.call();
        this.activeCalls.put(call, new UrlRequestWrap(cronetRequestAndOkHttpResponseConvert.getRequest(), strH));
        try {
            cronetRequestAndOkHttpResponseConvert.getRequest().start();
            return toInterceptorResponse(cronetRequestAndOkHttpResponseConvert.getResponse(), call);
        } catch (IOException e10) {
            e = e10;
            this.activeCalls.remove(call);
            throw e;
        } catch (RuntimeException e11) {
            e = e11;
            this.activeCalls.remove(call);
            throw e;
        }
    }

    public void startNetLogToDisk(String str, boolean z3, int i7) {
        RequestResponseConverter requestResponseConverter = this.converter;
        if (requestResponseConverter != null) {
            requestResponseConverter.startNetLogToDisk(str, z3, i7);
        }
    }

    public void stopNetLog() {
        RequestResponseConverter requestResponseConverter = this.converter;
        if (requestResponseConverter != null) {
            requestResponseConverter.stopNetLog();
        }
    }

    private CronetInterceptor(RequestResponseConverter requestResponseConverter, final String str, int i7) {
        this.activeCalls = new ConcurrentHashMap();
        ShadowScheduledThreadPoolExecutor shadowScheduledThreadPoolExecutor = new ShadowScheduledThreadPoolExecutor(1, "\u200bcom.google.net.cronet.okhttptransport.CronetInterceptor", true);
        this.scheduledExecutor = shadowScheduledThreadPoolExecutor;
        this.timeoutInMs = i7 <= 0 ? 30000 : i7;
        RequestResponseConverter requestResponseConverter2 = (RequestResponseConverter) Preconditions.checkNotNull(requestResponseConverter);
        this.converter = requestResponseConverter2;
        requestResponseConverter2.addRequestFinishedListener(new RequestFinishedInfo.Listener(ShadowExecutors.newOptimizedSingleThreadExecutor("\u200bcom.google.net.cronet.okhttptransport.CronetInterceptor")) { // from class: com.google.net.cronet.okhttptransport.CronetInterceptor.1
            @Override // org.chromium.net.RequestFinishedInfo.Listener
            public void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
                String path;
                String startTime;
                Y y8;
                String time;
                Call call = null;
                try {
                    URL url = new URL(requestFinishedInfo.getUrl().toString());
                    path = url.getPath();
                    try {
                        startTime = CronetInterceptor.this.parseStartTime(url.getQuery());
                        loop0: while (true) {
                            y8 = null;
                            for (Call call2 : CronetInterceptor.this.activeCalls.keySet()) {
                                Y yRequest = call2.request();
                                if (!TextUtils.isEmpty(path) && path.equals(yRequest.f40685a.b())) {
                                    UrlRequestWrap urlRequestWrap = (UrlRequestWrap) CronetInterceptor.this.activeCalls.get(call2);
                                    if (urlRequestWrap != null && (time = urlRequestWrap.getTime()) != null && time.equals(startTime)) {
                                        call = call2;
                                        y8 = yRequest;
                                        break loop0;
                                    }
                                    y8 = yRequest;
                                }
                            }
                            break loop0;
                        }
                    } catch (Exception unused) {
                        startTime = null;
                    }
                } catch (Exception unused2) {
                    path = null;
                }
                if (call != null) {
                    CronetInterceptor.this.activeCalls.remove(call);
                }
                try {
                    CronetLogHelper.INSTANCE.logMatrix(requestFinishedInfo, str, y8);
                } catch (Exception e10) {
                    Log.e(CronetInterceptor.TAG, "onRequestFinished: ", e10);
                }
            }
        });
        shadowScheduledThreadPoolExecutor.scheduleWithFixedDelay(new Runnable() { // from class: com.google.net.cronet.okhttptransport.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f23095a.lambda$new$0();
            }
        }, 500L, 500L, TimeUnit.MILLISECONDS);
    }
}
