package com.google.net.cronet.okhttptransport;

import Pg.C0559f;
import Pg.F;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Y;
import okhttp3.d0;
import okhttp3.e0;
import org.chromium.net.CronetEngine;

/* JADX INFO: loaded from: classes3.dex */
public final class CronetCallFactory implements Call.Factory {
    private static final String TAG = "CronetCallFactory";
    private final int callTimeoutMillis;
    private final RequestResponseConverter converter;
    private final int readTimeoutMillis;
    private final ExecutorService responseCallbackExecutor;
    private final int writeTimeoutMillis;

    public static final class Builder extends RequestResponseConverterBasedBuilder<Builder, CronetCallFactory> {
        private static final int DEFAULT_READ_WRITE_TIMEOUT_MILLIS = 10000;
        private int callTimeoutMillis;
        private ExecutorService callbackExecutorService;
        private int readTimeoutMillis;
        private int writeTimeoutMillis;

        public Builder(CronetEngine cronetEngine) {
            super(cronetEngine, Builder.class);
            this.readTimeoutMillis = 10000;
            this.writeTimeoutMillis = 10000;
            this.callTimeoutMillis = 0;
            this.callbackExecutorService = null;
        }

        public Builder setCallTimeoutMillis(int i7) {
            Preconditions.checkArgument(i7 >= 0, "Call timeout mustn't be negative!");
            this.callTimeoutMillis = i7;
            return this;
        }

        public Builder setCallbackExecutorService(ExecutorService executorService) {
            Preconditions.checkNotNull(executorService);
            this.callbackExecutorService = executorService;
            return this;
        }

        public Builder setReadTimeoutMillis(int i7) {
            Preconditions.checkArgument(i7 >= 0, "Read timeout mustn't be negative!");
            this.readTimeoutMillis = i7;
            return this;
        }

        public Builder setWriteTimeoutMillis(int i7) {
            Preconditions.checkArgument(i7 >= 0, "Write timeout mustn't be negative!");
            this.writeTimeoutMillis = i7;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.net.cronet.okhttptransport.RequestResponseConverterBasedBuilder
        public CronetCallFactory build(RequestResponseConverter requestResponseConverter) {
            ExecutorService executorServiceNewOptimizedCachedThreadPool = this.callbackExecutorService;
            if (executorServiceNewOptimizedCachedThreadPool == null) {
                executorServiceNewOptimizedCachedThreadPool = ShadowExecutors.newOptimizedCachedThreadPool("\u200bcom.google.net.cronet.okhttptransport.CronetCallFactory$Builder");
            }
            return new CronetCallFactory(requestResponseConverter, executorServiceNewOptimizedCachedThreadPool, this.readTimeoutMillis, this.writeTimeoutMillis, this.callTimeoutMillis);
        }
    }

    public static class CronetCall implements Call {
        private final AtomicBoolean canceled;
        private final AtomicReference<RequestResponseConverter.CronetRequestAndOkHttpResponse> convertedRequestAndResponse;
        private final RequestResponseConverter converter;
        private final AtomicBoolean executed;
        private final CronetCallFactory motherFactory;
        private final Y okHttpRequest;
        private final ExecutorService responseCallbackExecutor;
        private final C0559f timeout;

        private void evaluateExecutionPreconditions() throws IOException {
            if (this.canceled.get()) {
                throw new IOException("Can't execute canceled requests");
            }
            Preconditions.checkState(!this.executed.getAndSet(true), "Already Executed");
        }

        private void startRequestIfNotCanceled() {
            RequestResponseConverter.CronetRequestAndOkHttpResponse cronetRequestAndOkHttpResponse = this.convertedRequestAndResponse.get();
            Preconditions.checkState(cronetRequestAndOkHttpResponse != null, "convertedRequestAndResponse must be set!");
            if (this.canceled.get()) {
                cronetRequestAndOkHttpResponse.getRequest().cancel();
            } else {
                cronetRequestAndOkHttpResponse.getRequest().start();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String toLoggableString() {
            return "call to " + request().f40685a.i();
        }

        @Override // okhttp3.Call
        public void cancel() {
            RequestResponseConverter.CronetRequestAndOkHttpResponse cronetRequestAndOkHttpResponse;
            if (this.canceled.getAndSet(true) || (cronetRequestAndOkHttpResponse = this.convertedRequestAndResponse.get()) == null) {
                return;
            }
            cronetRequestAndOkHttpResponse.getRequest().cancel();
        }

        @Override // okhttp3.Call
        public void enqueue(final Callback callback) {
            try {
                this.timeout.enter();
                evaluateExecutionPreconditions();
                RequestResponseConverter.CronetRequestAndOkHttpResponse cronetRequestAndOkHttpResponseConvert = this.converter.convert(request(), this.motherFactory.readTimeoutMillis, this.motherFactory.writeTimeoutMillis);
                this.convertedRequestAndResponse.set(cronetRequestAndOkHttpResponseConvert);
                Futures.addCallback(cronetRequestAndOkHttpResponseConvert.getResponseAsync(), new FutureCallback<e0>() { // from class: com.google.net.cronet.okhttptransport.CronetCallFactory.CronetCall.2
                    @Override // com.google.common.util.concurrent.FutureCallback
                    public void onFailure(Throwable th) {
                        if (th instanceof IOException) {
                            callback.onFailure(this, (IOException) th);
                        } else {
                            callback.onFailure(this, new IOException(th));
                        }
                    }

                    @Override // com.google.common.util.concurrent.FutureCallback
                    public void onSuccess(e0 e0Var) {
                        try {
                            Callback callback2 = callback;
                            CronetCall cronetCall = this;
                            callback2.onResponse(cronetCall, CronetCallFactory.toCronetCallFactoryResponse(cronetCall, e0Var));
                        } catch (IOException unused) {
                            CronetCall.this.toLoggableString();
                        }
                    }
                }, this.responseCallbackExecutor);
                startRequestIfNotCanceled();
            } catch (IOException e10) {
                this.timeout.exit();
                callback.onFailure(this, e10);
            }
        }

        @Override // okhttp3.Call
        public e0 execute() throws IOException {
            evaluateExecutionPreconditions();
            try {
                this.timeout.enter();
                RequestResponseConverter.CronetRequestAndOkHttpResponse cronetRequestAndOkHttpResponseConvert = this.converter.convert(request(), this.motherFactory.readTimeoutMillis, this.motherFactory.writeTimeoutMillis);
                this.convertedRequestAndResponse.set(cronetRequestAndOkHttpResponseConvert);
                startRequestIfNotCanceled();
                return CronetCallFactory.toCronetCallFactoryResponse(this, cronetRequestAndOkHttpResponseConvert.getResponse());
            } catch (IOException | RuntimeException e10) {
                this.timeout.exit();
                throw e10;
            }
        }

        @Override // okhttp3.Call
        public boolean isCanceled() {
            return this.canceled.get();
        }

        @Override // okhttp3.Call
        public boolean isExecuted() {
            return this.executed.get();
        }

        @Override // okhttp3.Call
        public Y request() {
            return this.okHttpRequest;
        }

        @Override // okhttp3.Call
        public F timeout() {
            return this.timeout;
        }

        private CronetCall(Y y8, CronetCallFactory cronetCallFactory, RequestResponseConverter requestResponseConverter, ExecutorService executorService) {
            this.executed = new AtomicBoolean();
            this.canceled = new AtomicBoolean();
            this.convertedRequestAndResponse = new AtomicReference<>();
            this.okHttpRequest = y8;
            this.motherFactory = cronetCallFactory;
            this.converter = requestResponseConverter;
            this.responseCallbackExecutor = executorService;
            C0559f c0559f = new C0559f() { // from class: com.google.net.cronet.okhttptransport.CronetCallFactory.CronetCall.1
                @Override // Pg.C0559f
                public void timedOut() {
                    CronetCall.this.cancel();
                }
            };
            this.timeout = c0559f;
            c0559f.timeout(cronetCallFactory.callTimeoutMillis, TimeUnit.MILLISECONDS);
        }

        @Override // okhttp3.Call
        public Call clone() {
            return this.motherFactory.newCall(request());
        }
    }

    public static Builder newBuilder(CronetEngine cronetEngine) {
        return new Builder(cronetEngine);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static e0 toCronetCallFactoryResponse(final CronetCall cronetCall, e0 e0Var) {
        Preconditions.checkNotNull(e0Var.f40734g);
        d0 d0VarC = e0Var.c();
        d0VarC.f40721g = new CronetTransportResponseBody(e0Var.f40734g) { // from class: com.google.net.cronet.okhttptransport.CronetCallFactory.1
            @Override // com.google.net.cronet.okhttptransport.CronetTransportResponseBody
            public void customCloseHook() {
                cronetCall.timeout.exit();
            }
        };
        return d0VarC.a();
    }

    @Override // okhttp3.Call.Factory
    public Call newCall(Y y8) {
        return new CronetCall(y8, this, this.converter, this.responseCallbackExecutor);
    }

    private CronetCallFactory(RequestResponseConverter requestResponseConverter, ExecutorService executorService, int i7, int i10, int i11) {
        Preconditions.checkArgument(i7 >= 0, "Read timeout mustn't be negative!");
        Preconditions.checkArgument(i10 >= 0, "Write timeout mustn't be negative!");
        Preconditions.checkArgument(i11 >= 0, "Call timeout mustn't be negative!");
        this.converter = requestResponseConverter;
        this.responseCallbackExecutor = executorService;
        this.readTimeoutMillis = i7;
        this.writeTimeoutMillis = i10;
        this.callTimeoutMillis = i11;
    }
}
