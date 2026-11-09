package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229p2.a;
import p229p2.b;
import p242q0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/imageutils/HeifExifUtil;", "", "Ljava/io/InputStream;", "inputStream", "", "getOrientation", "(Ljava/io/InputStream;)I", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HeifExifUtil {

    @NotNull
    public static final HeifExifUtil INSTANCE = new HeifExifUtil();

    @JvmStatic
    public static final int getOrientation(@Nullable InputStream inputStream) {
        if (inputStream == null) {
            a.a("HeifExifUtil", "Trying to read Heif Exif from null inputStream -> ignoring");
            return 0;
        }
        try {
            return new g(inputStream).e(1, "Orientation");
        } catch (IOException e10) {
            if (a.f41180a.isLoggable(3)) {
                b.b(3, "HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", e10);
            }
            return 0;
        }
    }
}
