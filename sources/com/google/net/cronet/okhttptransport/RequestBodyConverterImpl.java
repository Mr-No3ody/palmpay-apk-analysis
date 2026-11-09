package com.google.net.cronet.okhttptransport;

import Pg.AbstractC0555b;
import Pg.k;
import Pg.w;
import androidx.annotation.VisibleForTesting;
import androidx.camera.video.u;
import com.google.common.base.Verify;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.Uninterruptibles;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import okhttp3.c0;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: loaded from: classes3.dex */
final class RequestBodyConverterImpl implements RequestBodyConverter {
    private static final long IN_MEMORY_BODY_LENGTH_THRESHOLD_BYTES = 1048576;
    private final InMemoryRequestBodyConverter inMemoryRequestBodyConverter;
    private final StreamingRequestBodyConverter streamingRequestBodyConverter;

    /* JADX INFO: renamed from: com.google.net.cronet.okhttptransport.RequestBodyConverterImpl$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$net$cronet$okhttptransport$UploadBodyDataBroker$ReadResult;

        static {
            int[] iArr = new int[UploadBodyDataBroker.ReadResult.values().length];
            $SwitchMap$com$google$net$cronet$okhttptransport$UploadBodyDataBroker$ReadResult = iArr;
            try {
                iArr[UploadBodyDataBroker.ReadResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$net$cronet$okhttptransport$UploadBodyDataBroker$ReadResult[UploadBodyDataBroker.ReadResult.END_OF_BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @VisibleForTesting
    public static final class InMemoryRequestBodyConverter implements RequestBodyConverter {
        @Override // com.google.net.cronet.okhttptransport.RequestBodyConverter
        public UploadDataProvider convertRequestBody(final c0 c0Var, int i7) throws IOException {
            final long jContentLength = c0Var.contentLength();
            if (jContentLength < 0 || jContentLength > 1048576) {
                throw new IOException(u.i(jContentLength, "Expected definite length less than 1048576but got "));
            }
            return new UploadDataProvider() { // from class: com.google.net.cronet.okhttptransport.RequestBodyConverterImpl.InMemoryRequestBodyConverter.1
                private volatile boolean isMaterialized = false;
                private final k materializedBody = new k();

                @Override // org.chromium.net.UploadDataProvider
                public long getLength() {
                    return jContentLength;
                }

                @Override // org.chromium.net.UploadDataProvider
                public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
                    if (!this.isMaterialized) {
                        c0Var.writeTo(this.materializedBody);
                        this.materializedBody.getClass();
                        this.isMaterialized = true;
                        long length = getLength();
                        long j6 = this.materializedBody.f7358b;
                        if (j6 != length) {
                            StringBuilder sbR = u.r(length, "Expected ", " bytes but got ");
                            sbR.append(j6);
                            throw new IOException(sbR.toString());
                        }
                    }
                    if (this.materializedBody.read(byteBuffer) == -1) {
                        throw new IllegalStateException("The source has been exhausted but we expected more!");
                    }
                    uploadDataSink.onReadSucceeded(false);
                }

                @Override // org.chromium.net.UploadDataProvider
                public void rewind(UploadDataSink uploadDataSink) {
                    uploadDataSink.onRewindError(new UnsupportedOperationException());
                }
            };
        }
    }

    @VisibleForTesting
    public static final class StreamingRequestBodyConverter implements RequestBodyConverter {
        private final ExecutorService readerExecutor;

        public static class StreamingUploadDataProvider extends UploadDataProvider {
            private final UploadBodyDataBroker broker;
            private final c0 okHttpRequestBody;
            private final ListeningExecutorService readTaskExecutor;
            private ListenableFuture<?> readTaskFuture;
            private long totalBytesReadFromOkHttp;
            private final long writeTimeoutMillis;

            public /* synthetic */ StreamingUploadDataProvider(c0 c0Var, UploadBodyDataBroker uploadBodyDataBroker, ExecutorService executorService, long j6, AnonymousClass1 anonymousClass1) {
                this(c0Var, uploadBodyDataBroker, executorService, j6);
            }

            private void ensureReadTaskStarted() {
                if (this.readTaskFuture == null) {
                    ListenableFuture<?> listenableFutureSubmit = this.readTaskExecutor.submit(new Callable() { // from class: com.google.net.cronet.okhttptransport.b
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.f23096a.lambda$ensureReadTaskStarted$0();
                        }
                    });
                    this.readTaskFuture = listenableFutureSubmit;
                    Futures.addCallback(listenableFutureSubmit, new FutureCallback<Object>() { // from class: com.google.net.cronet.okhttptransport.RequestBodyConverterImpl.StreamingRequestBodyConverter.StreamingUploadDataProvider.1
                        @Override // com.google.common.util.concurrent.FutureCallback
                        public void onFailure(Throwable th) {
                            StreamingUploadDataProvider.this.broker.setBackgroundReadError(th);
                        }

                        @Override // com.google.common.util.concurrent.FutureCallback
                        public void onSuccess(Object obj) {
                        }
                    }, MoreExecutors.directExecutor());
                }
            }

            private void handleLastBodyRead(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws ExecutionException, TimeoutException, IOException {
                int iPosition = byteBuffer.position();
                byteBuffer.position(0);
                if (!readFromOkHttp(byteBuffer).equals(UploadBodyDataBroker.ReadResult.END_OF_BODY)) {
                    throw prepareBodyTooLongException(getLength(), this.totalBytesReadFromOkHttp);
                }
                Verify.verify(byteBuffer.position() == 0, "END_OF_BODY reads shouldn't write anything to the buffer", new Object[0]);
                byteBuffer.position(iPosition);
                uploadDataSink.onReadSucceeded(false);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ Void lambda$ensureReadTaskStarted$0() throws Exception {
                w wVarB = AbstractC0555b.b(this.broker);
                this.okHttpRequestBody.writeTo(wVarB);
                wVarB.flush();
                this.broker.handleEndOfStreamSignal();
                return null;
            }

            private static IOException prepareBodyTooLongException(long j6, long j10) {
                StringBuilder sbR = u.r(j6, "Expected ", " bytes but got at least ");
                sbR.append(j10);
                return new IOException(sbR.toString());
            }

            private UploadBodyDataBroker.ReadResult readFromOkHttp(ByteBuffer byteBuffer) throws ExecutionException, TimeoutException {
                int iPosition = byteBuffer.position();
                UploadBodyDataBroker.ReadResult readResult = (UploadBodyDataBroker.ReadResult) Uninterruptibles.getUninterruptibly(this.broker.enqueueBodyRead(byteBuffer), this.writeTimeoutMillis, TimeUnit.MILLISECONDS);
                this.totalBytesReadFromOkHttp += (long) (byteBuffer.position() - iPosition);
                return readResult;
            }

            private void readKnownBodyLength(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
                try {
                    UploadBodyDataBroker.ReadResult fromOkHttp = readFromOkHttp(byteBuffer);
                    if (this.totalBytesReadFromOkHttp > getLength()) {
                        throw prepareBodyTooLongException(getLength(), this.totalBytesReadFromOkHttp);
                    }
                    if (this.totalBytesReadFromOkHttp >= getLength()) {
                        handleLastBodyRead(uploadDataSink, byteBuffer);
                        return;
                    }
                    int i7 = AnonymousClass1.$SwitchMap$com$google$net$cronet$okhttptransport$UploadBodyDataBroker$ReadResult[fromOkHttp.ordinal()];
                    if (i7 == 1) {
                        uploadDataSink.onReadSucceeded(false);
                    } else if (i7 == 2) {
                        throw new IOException("The source has been exhausted but we expected more data!");
                    }
                } catch (ExecutionException e10) {
                    e = e10;
                    this.readTaskFuture.cancel(true);
                    uploadDataSink.onReadError(new IOException(e));
                } catch (TimeoutException e11) {
                    e = e11;
                    this.readTaskFuture.cancel(true);
                    uploadDataSink.onReadError(new IOException(e));
                }
            }

            private void readUnknownBodyLength(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
                try {
                    uploadDataSink.onReadSucceeded(readFromOkHttp(byteBuffer).equals(UploadBodyDataBroker.ReadResult.END_OF_BODY));
                } catch (ExecutionException | TimeoutException e10) {
                    this.readTaskFuture.cancel(true);
                    uploadDataSink.onReadError(new IOException(e10));
                }
            }

            @Override // org.chromium.net.UploadDataProvider
            public long getLength() throws IOException {
                return this.okHttpRequestBody.contentLength();
            }

            @Override // org.chromium.net.UploadDataProvider
            public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
                ensureReadTaskStarted();
                if (getLength() == -1) {
                    readUnknownBodyLength(uploadDataSink, byteBuffer);
                } else {
                    readKnownBodyLength(uploadDataSink, byteBuffer);
                }
            }

            @Override // org.chromium.net.UploadDataProvider
            public void rewind(UploadDataSink uploadDataSink) {
                uploadDataSink.onRewindError(new UnsupportedOperationException("Rewind is not supported!"));
            }

            private StreamingUploadDataProvider(c0 c0Var, UploadBodyDataBroker uploadBodyDataBroker, ExecutorService executorService, long j6) {
                this.okHttpRequestBody = c0Var;
                this.broker = uploadBodyDataBroker;
                if (executorService instanceof ListeningExecutorService) {
                    this.readTaskExecutor = (ListeningExecutorService) executorService;
                } else {
                    this.readTaskExecutor = MoreExecutors.listeningDecorator(executorService);
                }
                this.writeTimeoutMillis = j6 == 0 ? 2147483647L : j6;
            }
        }

        public StreamingRequestBodyConverter(ExecutorService executorService) {
            this.readerExecutor = executorService;
        }

        @Override // com.google.net.cronet.okhttptransport.RequestBodyConverter
        public UploadDataProvider convertRequestBody(c0 c0Var, int i7) {
            return new StreamingUploadDataProvider(c0Var, new UploadBodyDataBroker(), this.readerExecutor, i7, null);
        }
    }

    public RequestBodyConverterImpl(InMemoryRequestBodyConverter inMemoryRequestBodyConverter, StreamingRequestBodyConverter streamingRequestBodyConverter) {
        this.inMemoryRequestBodyConverter = inMemoryRequestBodyConverter;
        this.streamingRequestBodyConverter = streamingRequestBodyConverter;
    }

    public static RequestBodyConverterImpl create(ExecutorService executorService) {
        return new RequestBodyConverterImpl(new InMemoryRequestBodyConverter(), new StreamingRequestBodyConverter(executorService));
    }

    @Override // com.google.net.cronet.okhttptransport.RequestBodyConverter
    public UploadDataProvider convertRequestBody(c0 c0Var, int i7) throws IOException {
        long jContentLength = c0Var.contentLength();
        return (jContentLength == -1 || jContentLength > 1048576) ? this.streamingRequestBodyConverter.convertRequestBody(c0Var, i7) : this.inMemoryRequestBodyConverter.convertRequestBody(c0Var, i7);
    }
}
