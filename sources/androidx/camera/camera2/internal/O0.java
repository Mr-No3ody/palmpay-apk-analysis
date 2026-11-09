package androidx.camera.camera2.internal;

import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.internal.TargetConfig;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class O0 implements UseCaseConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0992m0 f13244a;

    public O0() {
        C0992m0 c0992m0B = C0992m0.b();
        c0992m0B.insertOption(UseCaseConfig.f13984O, new C0939l0());
        c0992m0B.insertOption(ImageInputConfig.f13897r, 34);
        c0992m0B.insertOption(TargetConfig.f14307d0, P0.class);
        c0992m0B.insertOption(TargetConfig.c0, P0.class.getCanonicalName() + "-" + UUID.randomUUID());
        this.f13244a = c0992m0B;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final androidx.camera.core.impl.T0 getCaptureType() {
        return androidx.camera.core.impl.T0.f13979f;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public final Config getConfig() {
        return this.f13244a;
    }
}
