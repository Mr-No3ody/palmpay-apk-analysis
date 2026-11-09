package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.webp.WebpBitmapFactory;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import com.facebook.infer.annotation.Nullsafe;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import p245q3.a;
import p262r2.e;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
@Nullsafe(a.f41451a)
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f21458d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WebpBitmapFactory f21459c;

    @DoNotStrip
    public GingerbreadPurgeableDecoder() {
        WebpBitmapFactory webpBitmapFactory;
        if (p346x2.a.f43563b) {
            webpBitmapFactory = p346x2.a.f43562a;
        } else {
            try {
                webpBitmapFactory = (WebpBitmapFactory) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
            } catch (Throwable unused) {
                webpBitmapFactory = null;
            }
            p346x2.a.f43563b = true;
        }
        this.f21459c = webpBitmapFactory;
    }

    public static MemoryFile e(CloseableReference closeableReference, int i7, byte[] bArr) throws Throwable {
        OutputStream outputStream;
        p302u2.a aVar;
        e eVar = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i7);
        memoryFile.allowPurging(false);
        try {
            e eVar2 = new e((PooledByteBuffer) closeableReference.f());
            try {
                aVar = new p302u2.a(eVar2, i7);
                try {
                    outputStream2 = memoryFile.getOutputStream();
                    p213o2.e.g(aVar, outputStream2);
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i7, bArr.length);
                    }
                    closeableReference.close();
                    p213o2.a.b(eVar2);
                    p213o2.a.b(aVar);
                    p213o2.a.a(outputStream2);
                    return memoryFile;
                } catch (Throwable th) {
                    th = th;
                    outputStream = outputStream2;
                    eVar = eVar2;
                    closeableReference.close();
                    p213o2.a.b(eVar);
                    p213o2.a.b(aVar);
                    p213o2.a.a(outputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
                aVar = null;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
            aVar = null;
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap a(CloseableReference closeableReference, BitmapFactory.Options options) {
        return f(closeableReference, ((PooledByteBuffer) closeableReference.f()).size(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap b(CloseableReference closeableReference, int i7, BitmapFactory.Options options) {
        return f(closeableReference, i7, DalvikPurgeableDecoder.c(closeableReference, i7) ? null : DalvikPurgeableDecoder.f21444b, options);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0032  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Bitmap f(CloseableReference closeableReference, int i7, byte[] bArr, BitmapFactory.Options options) throws Throwable {
        MemoryFile memoryFile = 0;
        try {
            try {
                MemoryFile memoryFileE = e(closeableReference, i7, bArr);
                try {
                    FileDescriptor fileDescriptorG = g(memoryFileE);
                    WebpBitmapFactory webpBitmapFactory = this.f21459c;
                    if (webpBitmapFactory == null) {
                        throw new IllegalStateException("WebpBitmapFactory is null");
                    }
                    Bitmap bitmapDecodeFileDescriptor = webpBitmapFactory.decodeFileDescriptor(fileDescriptorG, null, options);
                    p213o2.e.e(bitmapDecodeFileDescriptor, "BitmapFactory returned null");
                    memoryFileE.close();
                    return bitmapDecodeFileDescriptor;
                } catch (IOException e10) {
                    e = e10;
                    p213o2.e.j(e);
                    throw null;
                }
            } catch (Throwable th) {
                th = th;
                memoryFile = closeableReference;
                if (memoryFile != 0) {
                    memoryFile.close();
                }
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
        } catch (Throwable th2) {
            th = th2;
            if (memoryFile != 0) {
                memoryFile.close();
            }
            throw th;
        }
    }

    public final FileDescriptor g(MemoryFile memoryFile) throws Throwable {
        Method method;
        try {
            synchronized (this) {
                if (f21458d == null) {
                    try {
                        f21458d = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
                    } catch (Exception e10) {
                        p213o2.e.j(e10);
                        throw null;
                    }
                }
                method = f21458d;
            }
            Object objInvoke = method.invoke(memoryFile, new Object[0]);
            objInvoke.getClass();
            return (FileDescriptor) objInvoke;
        } catch (Exception e11) {
            p213o2.e.j(e11);
            throw null;
        }
    }
}
