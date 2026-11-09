package com.google.net.cronet.okhttptransport;

import Pg.F;
import Pg.k;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;
import okio.Source;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: classes3.dex */
class OkHttpBridgeRequestCallback extends UrlRequest.Callback {
    private static final int CRONET_BYTE_BUFFER_CAPACITY = 32768;
    private final long readTimeoutMillis;
    private final RedirectStrategy redirectStrategy;
    private volatile UrlRequest request;
    private final SettableFuture<Source> bodySourceFuture = SettableFuture.create();
    private final AtomicBoolean finished = new AtomicBoolean(false);
    private final AtomicBoolean canceled = new AtomicBoolean(false);
    private final BlockingQueue<CallbackResult> callbackResults = new ArrayBlockingQueue(2);
    private final SettableFuture<UrlResponseInfo> headersFuture = SettableFuture.create();
    private final List<UrlResponseInfo> urlResponseInfoChain = new ArrayList();

    /* JADX INFO: renamed from: com.google.net.cronet.okhttptransport.OkHttpBridgeRequestCallback$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$net$cronet$okhttptransport$OkHttpBridgeRequestCallback$CallbackStep;

        static {
            int[] iArr = new int[CallbackStep.values().length];
            $SwitchMap$com$google$net$cronet$okhttptransport$OkHttpBridgeRequestCallback$CallbackStep = iArr;
            try {
                iArr[CallbackStep.ON_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$net$cronet$okhttptransport$OkHttpBridgeRequestCallback$CallbackStep[CallbackStep.ON_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$net$cronet$okhttptransport$OkHttpBridgeRequestCallback$CallbackStep[CallbackStep.ON_CANCELED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$net$cronet$okhttptransport$OkHttpBridgeRequestCallback$CallbackStep[CallbackStep.ON_READ_COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class CallbackResult {

        @Nullable
        private final ByteBuffer buffer;
        private final CallbackStep callbackStep;

        @Nullable
        private final CronetException exception;

        public /* synthetic */ CallbackResult(CallbackStep callbackStep, ByteBuffer byteBuffer, CronetException cronetException, AnonymousClass1 anonymousClass1) {
            this(callbackStep, byteBuffer, cronetException);
        }

        private CallbackResult(CallbackStep callbackStep, @Nullable ByteBuffer byteBuffer, @Nullable CronetException cronetException) {
            this.callbackStep = callbackStep;
            this.buffer = byteBuffer;
            this.exception = cronetException;
        }
    }

    public enum CallbackStep {
        ON_READ_COMPLETED,
        ON_SUCCESS,
        ON_FAILED,
        ON_CANCELED
    }

    public OkHttpBridgeRequestCallback(long j6, RedirectStrategy redirectStrategy) {
        Preconditions.checkArgument(j6 >= 0);
        if (j6 == 0) {
            this.readTimeoutMillis = 2147483647L;
        } else {
            this.readTimeoutMillis = j6;
        }
        this.redirectStrategy = redirectStrategy;
    }

    public ListenableFuture<Source> getBodySource() {
        return this.bodySourceFuture;
    }

    public ListenableFuture<UrlResponseInfo> getUrlResponseInfo() {
        return this.headersFuture;
    }

    public List<UrlResponseInfo> getUrlResponseInfoChain() {
        return Collections.unmodifiableList(this.urlResponseInfoChain);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.chromium.net.UrlRequest.Callback
    public void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.canceled.set(true);
        this.callbackResults.add(new CallbackResult(CallbackStep.ON_CANCELED, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0));
        IOException iOException = new IOException("The request was canceled!");
        this.headersFuture.setException(iOException);
        this.bodySourceFuture.setException(iOException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.chromium.net.UrlRequest.Callback
    public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        if (this.headersFuture.setException(cronetException) && this.bodySourceFuture.setException(cronetException)) {
            return;
        }
        this.callbackResults.add(new CallbackResult(CallbackStep.ON_FAILED, null, cronetException, 0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.chromium.net.UrlRequest.Callback
    public void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.callbackResults.add(new CallbackResult(CallbackStep.ON_READ_COMPLETED, byteBuffer, null, 0 == true ? 1 : 0));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        if (!this.redirectStrategy.followRedirects()) {
            Preconditions.checkState(this.headersFuture.set(urlResponseInfo));
            Preconditions.checkState(this.bodySourceFuture.set(new k()));
            urlRequest.cancel();
            return;
        }
        this.urlResponseInfoChain.add(urlResponseInfo);
        if (urlResponseInfo.getUrlChain().size() <= this.redirectStrategy.numberOfRedirectsToFollow()) {
            urlRequest.followRedirect();
            return;
        }
        urlRequest.cancel();
        ProtocolException protocolException = new ProtocolException("Too many follow-up requests: " + (this.redirectStrategy.numberOfRedirectsToFollow() + 1));
        this.headersFuture.setException(protocolException);
        this.bodySourceFuture.setException(protocolException);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.request = urlRequest;
        Preconditions.checkState(this.headersFuture.set(urlResponseInfo));
        Preconditions.checkState(this.bodySourceFuture.set(new CronetBodySource(this, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.chromium.net.UrlRequest.Callback
    public void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.callbackResults.add(new CallbackResult(CallbackStep.ON_SUCCESS, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0));
    }

    public class CronetBodySource implements Source {
        private ByteBuffer buffer;
        private volatile boolean closed;

        private CronetBodySource() {
            this.buffer = ByteBuffer.allocateDirect(OkHttpBridgeRequestCallback.CRONET_BYTE_BUFFER_CAPACITY);
            this.closed = false;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            if (OkHttpBridgeRequestCallback.this.finished.get()) {
                return;
            }
            OkHttpBridgeRequestCallback.this.request.cancel();
        }

        @Override // okio.Source
        public long read(k kVar, long j6) throws IOException {
            CallbackResult callbackResult;
            if (OkHttpBridgeRequestCallback.this.canceled.get()) {
                throw new IOException("The request was canceled!");
            }
            Preconditions.checkArgument(kVar != null, "sink == null");
            Preconditions.checkArgument(j6 >= 0, "byteCount < 0: %s", j6);
            Preconditions.checkState(!this.closed, "closed");
            if (OkHttpBridgeRequestCallback.this.finished.get()) {
                return -1L;
            }
            if (j6 < this.buffer.limit()) {
                this.buffer.limit((int) j6);
            }
            OkHttpBridgeRequestCallback.this.request.read(this.buffer);
            try {
                callbackResult = (CallbackResult) OkHttpBridgeRequestCallback.this.callbackResults.poll(OkHttpBridgeRequestCallback.this.readTimeoutMillis, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                callbackResult = null;
            }
            if (callbackResult == null) {
                OkHttpBridgeRequestCallback.this.request.cancel();
                throw new CronetTimeoutException();
            }
            int i7 = AnonymousClass1.$SwitchMap$com$google$net$cronet$okhttptransport$OkHttpBridgeRequestCallback$CallbackStep[callbackResult.callbackStep.ordinal()];
            if (i7 == 1) {
                OkHttpBridgeRequestCallback.this.finished.set(true);
                this.buffer = null;
                throw new IOException(callbackResult.exception);
            }
            if (i7 == 2) {
                OkHttpBridgeRequestCallback.this.finished.set(true);
                this.buffer = null;
                return -1L;
            }
            if (i7 == 3) {
                this.buffer = null;
                throw new IOException("The request was canceled!");
            }
            if (i7 != 4) {
                throw new AssertionError("The switch block above is exhaustive!");
            }
            callbackResult.buffer.flip();
            int iWrite = kVar.write(callbackResult.buffer);
            callbackResult.buffer.clear();
            return iWrite;
        }

        @Override // okio.Source
        public F timeout() {
            return F.NONE;
        }

        public /* synthetic */ CronetBodySource(OkHttpBridgeRequestCallback okHttpBridgeRequestCallback, AnonymousClass1 anonymousClass1) {
            this();
        }
    }
}
