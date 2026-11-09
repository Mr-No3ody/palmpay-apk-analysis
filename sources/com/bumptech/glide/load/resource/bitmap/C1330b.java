package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1330b implements ResourceEncoder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.bumptech.glide.load.g f20908b = com.bumptech.glide.load.g.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.bumptech.glide.load.g f20909c = new com.bumptech.glide.load.g("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, com.bumptech.glide.load.g.f20802e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.f f20910a;

    public C1330b(com.bumptech.glide.load.engine.bitmap_recycle.f fVar) {
        this.f20910a = fVar;
    }

    @Override // com.bumptech.glide.load.Encoder
    public final boolean encode(Object obj, File file, com.bumptech.glide.load.h hVar) throws Throwable {
        boolean z3;
        Bitmap bitmap = (Bitmap) ((Resource) obj).get();
        com.bumptech.glide.load.g gVar = f20909c;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) hVar.a(gVar);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i7 = J1.i.f4465a;
        SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) hVar.a(f20908b)).intValue();
        OutputStream cVar = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                com.bumptech.glide.load.engine.bitmap_recycle.f fVar = this.f20910a;
                if (fVar != null) {
                    try {
                        cVar = new com.bumptech.glide.load.data.c(fileOutputStream, fVar);
                    } catch (IOException unused) {
                        cVar = fileOutputStream;
                        if (cVar != null) {
                            try {
                                cVar.close();
                            } catch (IOException unused2) {
                            }
                        }
                        z3 = false;
                    } catch (Throwable th) {
                        th = th;
                        cVar = fileOutputStream;
                        if (cVar != null) {
                            try {
                                cVar.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } else {
                    cVar = fileOutputStream;
                }
                bitmap.compress(compressFormat, iIntValue, cVar);
                cVar.close();
                try {
                    cVar.close();
                } catch (IOException unused4) {
                }
                z3 = true;
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (IOException unused5) {
        } catch (Throwable th3) {
            th = th3;
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            Objects.toString(compressFormat);
            J1.o.c(bitmap);
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(hVar.a(gVar));
            bitmap.hasAlpha();
        }
        return z3;
    }

    @Override // com.bumptech.glide.load.ResourceEncoder
    public final com.bumptech.glide.load.c getEncodeStrategy(com.bumptech.glide.load.h hVar) {
        return com.bumptech.glide.load.c.f20519b;
    }
}
