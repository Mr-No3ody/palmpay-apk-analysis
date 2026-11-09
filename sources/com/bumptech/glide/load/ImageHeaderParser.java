package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f20506a;

        ImageType(boolean z3) {
            this.f20506a = z3;
        }

        public boolean hasAlpha() {
            return this.f20506a;
        }

        public boolean isWebp() {
            int i7 = d.f20522a[ordinal()];
            return i7 == 1 || i7 == 2 || i7 == 3;
        }
    }

    int getOrientation(@NonNull InputStream inputStream, @NonNull ArrayPool arrayPool) throws IOException;

    int getOrientation(@NonNull ByteBuffer byteBuffer, @NonNull ArrayPool arrayPool) throws IOException;

    @NonNull
    ImageType getType(@NonNull InputStream inputStream) throws IOException;

    @NonNull
    ImageType getType(@NonNull ByteBuffer byteBuffer) throws IOException;
}
