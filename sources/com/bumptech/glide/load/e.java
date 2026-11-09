package com.bumptech.glide.load;

import com.bumptech.glide.load.resource.bitmap.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static int a(ArrayList arrayList, InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.f fVar) throws IOException {
        if (inputStream != null) {
            if (!inputStream.markSupported()) {
                inputStream = new y(inputStream, fVar);
            }
            inputStream.mark(5242880);
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                try {
                    int orientation = ((ImageHeaderParser) arrayList.get(i7)).getOrientation(inputStream, fVar);
                    inputStream.reset();
                    if (orientation != -1) {
                        return orientation;
                    }
                } catch (Throwable th) {
                    inputStream.reset();
                    throw th;
                }
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType b(ArrayList arrayList, InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.f fVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new y(inputStream, fVar);
        }
        inputStream.mark(5242880);
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ImageHeaderParser.ImageType type = ((ImageHeaderParser) arrayList.get(i7)).getType(inputStream);
                inputStream.reset();
                if (type != ImageHeaderParser.ImageType.UNKNOWN) {
                    return type;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static ImageHeaderParser.ImageType c(ArrayList arrayList, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            try {
                ImageHeaderParser.ImageType type = ((ImageHeaderParser) arrayList.get(i7)).getType(byteBuffer);
                AtomicReference atomicReference = J1.c.f4454a;
                if (type != ImageHeaderParser.ImageType.UNKNOWN) {
                    return type;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = J1.c.f4454a;
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
