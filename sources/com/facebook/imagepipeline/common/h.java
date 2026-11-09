package com.facebook.imagepipeline.common;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public final i autoRotate() {
        return i.f21435d;
    }

    @JvmStatic
    @NotNull
    public final i autoRotateAtRenderTime() {
        return i.f21437f;
    }

    @JvmStatic
    @NotNull
    public final i disableRotation() {
        return i.f21436e;
    }

    @JvmStatic
    @NotNull
    public final i forceRotation(int i7) {
        return new i(i7, false);
    }

    private h() {
    }
}
