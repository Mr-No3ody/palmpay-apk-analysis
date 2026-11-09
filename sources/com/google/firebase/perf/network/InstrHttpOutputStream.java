package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class InstrHttpOutputStream extends OutputStream {
    long bytesWritten = -1;
    NetworkRequestMetricBuilder networkMetricBuilder;
    private final OutputStream outputStream;
    private final Timer timer;

    public InstrHttpOutputStream(OutputStream outputStream, NetworkRequestMetricBuilder networkRequestMetricBuilder, Timer timer) {
        this.outputStream = outputStream;
        this.networkMetricBuilder = networkRequestMetricBuilder;
        this.timer = timer;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long j6 = this.bytesWritten;
        if (j6 != -1) {
            this.networkMetricBuilder.setRequestPayloadBytes(j6);
        }
        this.networkMetricBuilder.setTimeToRequestCompletedMicros(this.timer.getDurationMicros());
        try {
            this.outputStream.close();
        } catch (IOException e10) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e10;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            this.outputStream.flush();
        } catch (IOException e10) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i7) throws IOException {
        try {
            this.outputStream.write(i7);
            long j6 = this.bytesWritten + 1;
            this.bytesWritten = j6;
            this.networkMetricBuilder.setRequestPayloadBytes(j6);
        } catch (IOException e10) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            this.outputStream.write(bArr);
            long length = this.bytesWritten + ((long) bArr.length);
            this.bytesWritten = length;
            this.networkMetricBuilder.setRequestPayloadBytes(length);
        } catch (IOException e10) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e10;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i7, int i10) throws IOException {
        try {
            this.outputStream.write(bArr, i7, i10);
            long j6 = this.bytesWritten + ((long) i10);
            this.bytesWritten = j6;
            this.networkMetricBuilder.setRequestPayloadBytes(j6);
        } catch (IOException e10) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e10;
        }
    }
}
