package com.google.net.cronet.okhttptransport;

import Pg.F;
import Pg.k;
import android.util.Pair;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okio.Sink;

/* JADX INFO: loaded from: classes3.dex */
final class UploadBodyDataBroker implements Sink {
    private final BlockingQueue<Pair<ByteBuffer, SettableFuture<ReadResult>>> pendingRead = new ArrayBlockingQueue(1);
    private final AtomicBoolean isClosed = new AtomicBoolean();
    private final AtomicReference<Throwable> backgroundReadThrowable = new AtomicReference<>();

    public enum ReadResult {
        SUCCESS,
        END_OF_BODY
    }

    private Pair<ByteBuffer, SettableFuture<ReadResult>> getPendingCronetRead() throws IOException {
        try {
            return this.pendingRead.take();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new IOException("Interrupted while waiting for a read to finish!");
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.isClosed.set(true);
    }

    public Future<ReadResult> enqueueBodyRead(ByteBuffer byteBuffer) {
        Throwable th = this.backgroundReadThrowable.get();
        if (th != null) {
            return Futures.immediateFailedFuture(th);
        }
        SettableFuture settableFutureCreate = SettableFuture.create();
        this.pendingRead.add(Pair.create(byteBuffer, settableFutureCreate));
        Throwable th2 = this.backgroundReadThrowable.get();
        if (th2 != null) {
            settableFutureCreate.setException(th2);
        }
        return settableFutureCreate;
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
    }

    public void handleEndOfStreamSignal() throws IOException {
        if (this.isClosed.getAndSet(true)) {
            throw new IllegalStateException("Already closed");
        }
        ((SettableFuture) getPendingCronetRead().second).set(ReadResult.END_OF_BODY);
    }

    public void setBackgroundReadError(Throwable th) {
        this.backgroundReadThrowable.set(th);
        Pair<ByteBuffer, SettableFuture<ReadResult>> pairPoll = this.pendingRead.poll();
        if (pairPoll != null) {
            ((SettableFuture) pairPoll.second).setException(th);
        }
    }

    @Override // okio.Sink
    public F timeout() {
        return F.NONE;
    }

    @Override // okio.Sink
    public void write(k kVar, long j6) throws IOException {
        Preconditions.checkState(!this.isClosed.get());
        while (j6 != 0) {
            Pair<ByteBuffer, SettableFuture<ReadResult>> pendingCronetRead = getPendingCronetRead();
            ByteBuffer byteBuffer = (ByteBuffer) pendingCronetRead.first;
            SettableFuture settableFuture = (SettableFuture) pendingCronetRead.second;
            int iLimit = byteBuffer.limit();
            byteBuffer.limit((int) Math.min(iLimit, j6));
            try {
                long j10 = kVar.read(byteBuffer);
                if (j10 == -1) {
                    IOException iOException = new IOException("The source has been exhausted but we expected more!");
                    settableFuture.setException(iOException);
                    throw iOException;
                }
                j6 -= j10;
                byteBuffer.limit(iLimit);
                settableFuture.set(ReadResult.SUCCESS);
            } catch (IOException e10) {
                settableFuture.setException(e10);
                throw e10;
            }
        }
    }
}
