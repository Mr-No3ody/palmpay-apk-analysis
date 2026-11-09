package com.google.net.cronet.okhttptransport;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.concurrent.Executor;
import okhttp3.F;
import okhttp3.Y;
import okhttp3.c0;
import okhttp3.e0;
import org.chromium.net.CronetEngine;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes3.dex */
final class RequestResponseConverter {
    private static final String CONTENT_LENGTH_HEADER_NAME = "Content-Length";
    private static final String CONTENT_TYPE_HEADER_DEFAULT_VALUE = "application/octet-stream";
    private static final String CONTENT_TYPE_HEADER_NAME = "Content-Type";
    private final CronetEngine cronetEngine;
    private final RedirectStrategy redirectStrategy;
    private final RequestBodyConverter requestBodyConverter;
    private final ResponseConverter responseConverter;
    private final Executor uploadDataProviderExecutor;

    public static final class CronetRequestAndOkHttpResponse {
        private final UrlRequest request;
        private final ResponseSupplier responseSupplier;

        public CronetRequestAndOkHttpResponse(UrlRequest urlRequest, ResponseSupplier responseSupplier) {
            this.request = urlRequest;
            this.responseSupplier = responseSupplier;
        }

        public UrlRequest getRequest() {
            return this.request;
        }

        public e0 getResponse() throws IOException {
            return this.responseSupplier.getResponse();
        }

        public ListenableFuture<e0> getResponseAsync() {
            return this.responseSupplier.getResponseFuture();
        }
    }

    public interface ResponseSupplier {
        e0 getResponse() throws IOException;

        ListenableFuture<e0> getResponseFuture();
    }

    public RequestResponseConverter(CronetEngine cronetEngine, Executor executor, RequestBodyConverter requestBodyConverter, ResponseConverter responseConverter, RedirectStrategy redirectStrategy) {
        this.cronetEngine = cronetEngine;
        this.uploadDataProviderExecutor = executor;
        this.requestBodyConverter = requestBodyConverter;
        this.responseConverter = responseConverter;
        this.redirectStrategy = redirectStrategy;
    }

    private ResponseSupplier createResponseSupplier(final Y y8, final OkHttpBridgeRequestCallback okHttpBridgeRequestCallback) {
        return new ResponseSupplier() { // from class: com.google.net.cronet.okhttptransport.RequestResponseConverter.1
            @Override // com.google.net.cronet.okhttptransport.RequestResponseConverter.ResponseSupplier
            public e0 getResponse() throws IOException {
                return RequestResponseConverter.this.responseConverter.lambda$toResponseAsync$0(y8, okHttpBridgeRequestCallback);
            }

            @Override // com.google.net.cronet.okhttptransport.RequestResponseConverter.ResponseSupplier
            public ListenableFuture<e0> getResponseFuture() {
                return RequestResponseConverter.this.responseConverter.toResponseAsync(y8, okHttpBridgeRequestCallback);
            }
        };
    }

    public void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.cronetEngine.addRequestFinishedListener(listener);
    }

    public CronetRequestAndOkHttpResponse convert(Y y8, int i7, int i10) throws IOException {
        OkHttpBridgeRequestCallback okHttpBridgeRequestCallback = new OkHttpBridgeRequestCallback(i7, this.redirectStrategy);
        UrlRequest.Builder builderAllowDirectExecutor = this.cronetEngine.newUrlRequestBuilder(y8.f40685a.f40587i, okHttpBridgeRequestCallback, MoreExecutors.directExecutor()).allowDirectExecutor();
        builderAllowDirectExecutor.setHttpMethod(y8.f40686b);
        int i11 = 0;
        while (true) {
            F f10 = y8.f40687c;
            if (i11 >= f10.size()) {
                break;
            }
            builderAllowDirectExecutor.addHeader(f10.b(i11), f10.f(i11));
            i11++;
        }
        c0 c0Var = y8.f40688d;
        if (c0Var != null) {
            if (y8.a("Content-Length") == null && c0Var.contentLength() != -1) {
                builderAllowDirectExecutor.addHeader("Content-Length", String.valueOf(c0Var.contentLength()));
            }
            if (c0Var.contentLength() != 0) {
                if (c0Var.contentType() != null) {
                    builderAllowDirectExecutor.addHeader("Content-Type", c0Var.contentType().f40592a);
                } else if (y8.a("Content-Type") == null) {
                    builderAllowDirectExecutor.addHeader("Content-Type", CONTENT_TYPE_HEADER_DEFAULT_VALUE);
                }
                builderAllowDirectExecutor.setUploadDataProvider(this.requestBodyConverter.convertRequestBody(c0Var, i10), this.uploadDataProviderExecutor);
            }
        }
        return new CronetRequestAndOkHttpResponse(builderAllowDirectExecutor.build(), createResponseSupplier(y8, okHttpBridgeRequestCallback));
    }

    public void startNetLogToDisk(String str, boolean z3, int i7) {
        CronetEngine cronetEngine = this.cronetEngine;
        if (cronetEngine != null) {
            cronetEngine.startNetLogToDisk(str, z3, i7);
        }
    }

    public void stopNetLog() {
        CronetEngine cronetEngine = this.cronetEngine;
        if (cronetEngine != null) {
            cronetEngine.stopNetLog();
        }
    }
}
