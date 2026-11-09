package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21900a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AutoCloseable f21902c;

    public n(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.f21901b = fileOutputStream;
        try {
            FileLock fileLockLock = fileOutputStream.getChannel().lock();
            if (fileLockLock == null) {
                fileOutputStream.close();
            }
            this.f21902c = fileLockLock;
        } catch (Throwable th) {
            ((FileOutputStream) this.f21901b).close();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f21900a) {
            case 0:
                FileOutputStream fileOutputStream = (FileOutputStream) this.f21901b;
                try {
                    FileLock fileLock = (FileLock) this.f21902c;
                    if (fileLock != null) {
                        fileLock.release();
                        break;
                    }
                    return;
                } finally {
                    fileOutputStream.close();
                }
            default:
                ((InputStream) this.f21902c).close();
                return;
        }
    }

    public n(B b7, InputStream inputStream) {
        this.f21901b = b7;
        this.f21902c = inputStream;
    }
}
