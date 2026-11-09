package androidx.camera.core.streamsharing;

import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.CaptureConfig$OptionUnpacker;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.SessionConfig$OptionUnpacker;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.internal.TargetConfig;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class e implements UseCaseConfig.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0992m0 f14484a;

    public e(C0992m0 c0992m0) {
        Object objRetrieveOption;
        this.f14484a = c0992m0;
        try {
            objRetrieveOption = c0992m0.retrieveOption(TargetConfig.f14307d0);
        } catch (IllegalArgumentException unused) {
            objRetrieveOption = null;
        }
        Class cls = (Class) objRetrieveOption;
        if (cls == null || cls.equals(d.class)) {
            this.f14484a.insertOption(UseCaseConfig.f13990V, T0.f13978e);
            a(d.class);
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }

    public final void a(Class cls) {
        Object objRetrieveOption;
        C0971c c0971c = TargetConfig.f14307d0;
        C0992m0 c0992m0 = this.f14484a;
        c0992m0.insertOption(c0971c, cls);
        try {
            objRetrieveOption = c0992m0.retrieveOption(TargetConfig.c0);
        } catch (IllegalArgumentException unused) {
            objRetrieveOption = null;
        }
        if (objRetrieveOption == null) {
            c0992m0.insertOption(TargetConfig.c0, cls.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    @Override // androidx.camera.core.ExtendableBuilder
    public final Object build() {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.ExtendableBuilder
    public final MutableConfig getMutableConfig() {
        return this.f14484a;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final UseCaseConfig getUseCaseConfig() {
        return new f(C1000q0.a(this.f14484a));
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setCaptureOptionUnpacker(CaptureConfig$OptionUnpacker captureConfig$OptionUnpacker) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setCaptureType(T0 t1) {
        this.f14484a.insertOption(UseCaseConfig.f13990V, t1);
        return this;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setDefaultCaptureConfig(T t) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setDefaultSessionConfig(H0 h7) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setHighResolutionDisabled(boolean z3) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setSessionOptionUnpacker(SessionConfig$OptionUnpacker sessionConfig$OptionUnpacker) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setSurfaceOccupancyPriority(int i7) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }

    @Override // androidx.camera.core.internal.TargetConfig.Builder
    public final /* bridge */ /* synthetic */ Object setTargetClass(Class cls) {
        a(cls);
        return this;
    }

    @Override // androidx.camera.core.internal.TargetConfig.Builder
    public final Object setTargetName(String str) {
        this.f14484a.insertOption(TargetConfig.c0, str);
        return this;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setZslDisabled(boolean z3) {
        throw new UnsupportedOperationException("Operation not supported by StreamSharingBuilder.");
    }
}
