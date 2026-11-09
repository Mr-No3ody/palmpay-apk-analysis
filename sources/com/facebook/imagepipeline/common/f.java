package com.facebook.imagepipeline.common;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @Nullable
    public final g forDimensions(int i7, int i10) {
        if (i7 <= 0 || i10 <= 0) {
            return null;
        }
        return new g(i7, i10);
    }

    @JvmStatic
    @Nullable
    public final g forSquareSize(int i7) {
        if (i7 <= 0) {
            return null;
        }
        return new g(i7, i7);
    }

    private f() {
    }
}
