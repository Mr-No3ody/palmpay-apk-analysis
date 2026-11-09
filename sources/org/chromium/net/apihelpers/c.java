package org.chromium.net.apihelpers;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends UploadDataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile FileChannel f41017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UploadDataProviders$FileChannelProvider f41018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f41019c = new Object();

    public c(UploadDataProviders$FileChannelProvider uploadDataProviders$FileChannelProvider) {
        this.f41018b = uploadDataProviders$FileChannelProvider;
    }

    public final FileChannel a() {
        if (this.f41017a == null) {
            synchronized (this.f41019c) {
                try {
                    if (this.f41017a == null) {
                        this.f41017a = this.f41018b.getChannel();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f41017a;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileChannel fileChannel = this.f41017a;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return a().size();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
        FileChannel fileChannelA = a();
        int i7 = 0;
        while (i7 == 0) {
            int i10 = fileChannelA.read(byteBuffer);
            if (i10 == -1) {
                break;
            } else {
                i7 += i10;
            }
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) throws IOException {
        a().position(0L);
        uploadDataSink.onRewindSucceeded();
    }
}
