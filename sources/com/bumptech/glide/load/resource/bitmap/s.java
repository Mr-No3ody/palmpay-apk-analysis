package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class s implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int getOrientation(InputStream inputStream, ArrayPool arrayPool) {
        int iE = new p242q0.g(inputStream).e(1, "Orientation");
        if (iE == 0) {
            return -1;
        }
        return iE;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType getType(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType getType(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int getOrientation(ByteBuffer byteBuffer, ArrayPool arrayPool) {
        AtomicReference atomicReference = J1.c.f4454a;
        return getOrientation(new J1.a(byteBuffer), arrayPool);
    }
}
