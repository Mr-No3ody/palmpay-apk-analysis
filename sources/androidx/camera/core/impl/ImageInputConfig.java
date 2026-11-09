package androidx.camera.core.impl;

import E.C0216v;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface ImageInputConfig extends ReadableConfig {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0971c f13897r = new C0971c("camerax.core.imageInput.inputFormat", Integer.TYPE, null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0971c f13898s = new C0971c("camerax.core.imageInput.inputDynamicRange", C0216v.class, null);

    public interface Builder<B> {
        @NonNull
        B setDynamicRange(@NonNull C0216v c0216v);
    }

    @NonNull
    default C0216v getDynamicRange() {
        C0216v c0216v = (C0216v) retrieveOption(f13898s, C0216v.f2121c);
        c0216v.getClass();
        return c0216v;
    }

    default int getInputFormat() {
        return ((Integer) retrieveOption(f13897r)).intValue();
    }

    default boolean hasDynamicRange() {
        return containsOption(f13898s);
    }
}
