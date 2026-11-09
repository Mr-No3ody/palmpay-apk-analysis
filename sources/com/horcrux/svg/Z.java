package com.horcrux.svg;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import java.lang.invoke.MethodHandles;
import java.nio.file.attribute.BasicFileAttributes;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class Z {
    public static /* bridge */ /* synthetic */ Class D() {
        return MethodHandles.Lookup.class;
    }

    public static /* synthetic */ Typeface.Builder g(AssetManager assetManager, String str) {
        return new Typeface.Builder(assetManager, str);
    }

    public static /* bridge */ /* synthetic */ Class k() {
        return BasicFileAttributes.class;
    }

    public static /* bridge */ /* synthetic */ MethodHandles.Lookup p(Object obj) {
        return (MethodHandles.Lookup) obj;
    }

    public static /* synthetic */ void s() {
    }
}
