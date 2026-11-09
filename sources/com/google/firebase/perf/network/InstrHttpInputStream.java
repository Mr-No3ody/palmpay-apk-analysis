package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class InstrHttpInputStream extends InputStream {
    private final InputStream inputStream;
    private final NetworkRequestMetricBuilder networkMetricBuilder;
    private long timeToResponseInitiated;
    private final Timer timer;
    private long bytesRead = -1;
    private long timeToResponseLastRead = -1;

    public InstrHttpInputStream(InputStream inputStream, NetworkRequestMetricBuilder networkRequestMetricBuilder, Timer timer) {
        this.timer = timer;
        this.inputStream = inputStream;
        this.networkMetricBuilder = networkRequestMetricBuilder;
        this.timeToResponseInitiated = networkRequestMetricBuilder.getTimeToResponseInitiatedMicros();
    }

    private void incrementBytesRead(long j6) {
        long j10 = this.bytesRead;
        if (j10 == -1) {
            this.bytesRead = j6;
        } else {
            this.bytesRead = j10 + j6;
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        try {
            return this.inputStream.available();
        } catch (IOException e10) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e10;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long durationMicros = this.timer.getDurationMicros();
        if (this.timeToResponseLastRead == -1) {
            this.timeToResponseLastRead = durationMicros;
        }
        try {
            this.inputStream.close();
            long j6 = this.bytesRead;
            if (j6 != -1) {
                this.networkMetricBuilder.setResponsePayloadBytes(j6);
            }
            long j10 = this.timeToResponseInitiated;
            if (j10 != -1) {
                this.networkMetricBuilder.setTimeToResponseInitiatedMicros(j10);
            }
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timeToResponseLastRead);
            this.networkMetricBuilder.build();
        } catch (IOException e10) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i7) {
        this.inputStream.mark(i7);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.inputStream.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            int i7 = this.inputStream.read();
            long durationMicros = this.timer.getDurationMicros();
            if (this.timeToResponseInitiated == -1) {
                this.timeToResponseInitiated = durationMicros;
            }
            if (i7 != -1 || this.timeToResponseLastRead != -1) {
                incrementBytesRead(1L);
                this.networkMetricBuilder.setResponsePayloadBytes(this.bytesRead);
                return i7;
            }
            this.timeToResponseLastRead = durationMicros;
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(durationMicros);
            this.networkMetricBuilder.build();
            return i7;
        } catch (IOException e10) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        try {
            this.inputStream.reset();
        } catch (IOException e10) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j6) throws IOException {
        try {
            long jSkip = this.inputStream.skip(j6);
            long durationMicros = this.timer.getDurationMicros();
            if (this.timeToResponseInitiated == -1) {
                this.timeToResponseInitiated = durationMicros;
            }
            if (jSkip == 0 && j6 != 0 && this.timeToResponseLastRead == -1) {
                this.timeToResponseLastRead = durationMicros;
                this.networkMetricBuilder.setTimeToResponseCompletedMicros(durationMicros);
                return jSkip;
            }
            incrementBytesRead(jSkip);
            this.networkMetricBuilder.setResponsePayloadBytes(this.bytesRead);
            return jSkip;
        } catch (IOException e10) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i7, int i10) throws IOException {
        try {
            int i11 = this.inputStream.read(bArr, i7, i10);
            long durationMicros = this.timer.getDurationMicros();
            if (this.timeToResponseInitiated == -1) {
                this.timeToResponseInitiated = durationMicros;
            }
            if (i11 == -1 && this.timeToResponseLastRead == -1) {
                this.timeToResponseLastRead = durationMicros;
                this.networkMetricBuilder.setTimeToResponseCompletedMicros(durationMicros);
                this.networkMetricBuilder.build();
                return i11;
            }
            incrementBytesRead(i11);
            this.networkMetricBuilder.setResponsePayloadBytes(this.bytesRead);
            return i11;
        } catch (IOException e10) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            int i7 = this.inputStream.read(bArr);
            long durationMicros = this.timer.getDurationMicros();
            if (this.timeToResponseInitiated == -1) {
                this.timeToResponseInitiated = durationMicros;
            }
            if (i7 == -1 && this.timeToResponseLastRead == -1) {
                this.timeToResponseLastRead = durationMicros;
                this.networkMetricBuilder.setTimeToResponseCompletedMicros(durationMicros);
                this.networkMetricBuilder.build();
                return i7;
            }
            incrementBytesRead(i7);
            this.networkMetricBuilder.setResponsePayloadBytes(this.bytesRead);
            return i7;
        } catch (IOException e10) {
            this.networkMetricBuilder.setTimeToResponseCompletedMicros(this.timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(this.networkMetricBuilder);
            throw e10;
        }
    }
}
