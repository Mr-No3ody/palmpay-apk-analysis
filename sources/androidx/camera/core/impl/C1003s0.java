package androidx.camera.core.impl;

import androidx.camera.core.internal.ThreadConfig;

/* JADX INFO: renamed from: androidx.camera.core.impl.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1003s0 implements UseCaseConfig, ImageOutputConfig, ThreadConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1000q0 f14128a;

    public C1003s0(C1000q0 c1000q0) {
        this.f14128a = c1000q0;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public final Config getConfig() {
        return this.f14128a;
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    public final int getInputFormat() {
        return ((Integer) retrieveOption(ImageInputConfig.f13897r)).intValue();
    }
}
