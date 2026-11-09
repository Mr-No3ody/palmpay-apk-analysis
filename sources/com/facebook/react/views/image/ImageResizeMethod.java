package com.facebook.react.views.image;

import com.facebook.imagepipeline.nativecode.b;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/views/image/ImageResizeMethod;", "", "<init>", "(Ljava/lang/String;I)V", "AUTO", "RESIZE", "SCALE", "NONE", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum ImageResizeMethod {
    AUTO,
    RESIZE,
    SCALE,
    NONE;

    private static final /* synthetic */ EnumEntries $ENTRIES = b.n(values());

    @NotNull
    public static EnumEntries<ImageResizeMethod> getEntries() {
        return $ENTRIES;
    }
}
