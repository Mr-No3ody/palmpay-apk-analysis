package com.facebook.soloader;

import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public abstract class C implements Closeable {
    public static void a(n nVar, byte[] bArr, File file) {
        RandomAccessFile randomAccessFile;
        int i7;
        InputStream inputStream = (InputStream) nVar.f21902c;
        o.e(4, "fb-UnpackingSoSource");
        File file2 = new File(file, ((B) nVar.f21901b).f21850a);
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                try {
                    int iAvailable = inputStream.available();
                    if (iAvailable > 1) {
                        randomAccessFile = randomAccessFile2;
                        try {
                            SysUtil$LollipopSysdeps.fallocateIfSupported(randomAccessFile2.getFD(), iAvailable);
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            try {
                                randomAccessFile.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } else {
                        randomAccessFile = randomAccessFile2;
                    }
                    int i10 = 0;
                    while (i10 < Integer.MAX_VALUE && (i7 = inputStream.read(bArr, 0, Math.min(bArr.length, Integer.MAX_VALUE - i10))) != -1) {
                        randomAccessFile.write(bArr, 0, i7);
                        i10 += i7;
                    }
                    randomAccessFile.setLength(randomAccessFile.getFilePointer());
                    if (!file2.setExecutable(true, false)) {
                        throw new IOException("cannot make file executable: " + file2);
                    }
                    randomAccessFile.close();
                    if (!file2.exists() || file2.setWritable(false)) {
                        return;
                    }
                    Log.e("SoLoader", "Error removing " + file2 + " write permission from directory " + file + " (writable: " + file.canWrite() + ")");
                } catch (Throwable th4) {
                    th = th4;
                    randomAccessFile = randomAccessFile2;
                }
            } catch (IOException e10) {
                Log.e("fb-UnpackingSoSource", "error extracting dso  " + file2 + " due to: " + e10);
                y.b(file2);
                throw e10;
            }
        } catch (Throwable th5) {
            if (file2.exists() && !file2.setWritable(false)) {
                Log.e("SoLoader", "Error removing " + file2 + " write permission from directory " + file + " (writable: " + file.canWrite() + ")");
            }
            throw th5;
        }
    }

    public abstract B[] b();

    public abstract void c(File file);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
