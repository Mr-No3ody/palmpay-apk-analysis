package com.facebook.react.bridge;

import com.facebook.infer.annotation.Nullsafe;
import com.facebook.proguard.annotations.DoNotStrip;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes.dex */
@DoNotStrip
@Nullsafe(p245q3.a.f41451a)
public interface NativeModule {
    @Deprecated
    default boolean canOverrideExistingModule() {
        return false;
    }

    @Nonnull
    String getName();

    void initialize();

    void invalidate();

    @Deprecated(forRemoval = true, since = "Use invalidate method instead")
    default void onCatalystInstanceDestroy() {
    }
}
