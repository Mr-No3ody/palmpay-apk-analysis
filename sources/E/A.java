package E;

import android.util.Size;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C0980g0;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.CaptureConfig$OptionUnpacker;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.SessionConfig$OptionUnpacker;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.ThreadConfig;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class A implements ImageOutputConfig.Builder, ThreadConfig.Builder, UseCaseConfig.Builder, ImageInputConfig.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0992m0 f1886a;

    public A() {
        this(C0992m0.b());
    }

    @Override // androidx.camera.core.ExtendableBuilder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C build() {
        C0980g0 c0980g0 = new C0980g0(C1000q0.a(this.f1886a));
        ImageOutputConfig.validateConfig(c0980g0);
        return new C(c0980g0);
    }

    public final void b(int i7) {
        if (i7 == -1) {
            i7 = 0;
        }
        this.f1886a.insertOption(ImageOutputConfig.f13905u, Integer.valueOf(i7));
    }

    public final void c(Class cls) {
        Object objRetrieveOption;
        C0971c c0971c = TargetConfig.f14307d0;
        C0992m0 c0992m0 = this.f1886a;
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
    public final MutableConfig getMutableConfig() {
        return this.f1886a;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final UseCaseConfig getUseCaseConfig() {
        return new C0980g0(C1000q0.a(this.f1886a));
    }

    @Override // androidx.camera.core.internal.ThreadConfig.Builder
    public final Object setBackgroundExecutor(Executor executor) {
        this.f1886a.insertOption(ThreadConfig.f14308e0, executor);
        return this;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setCaptureOptionUnpacker(CaptureConfig$OptionUnpacker captureConfig$OptionUnpacker) {
        this.f1886a.insertOption(UseCaseConfig.f13985P, captureConfig$OptionUnpacker);
        return this;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setCaptureType(T0 t1) {
        this.f1886a.insertOption(UseCaseConfig.f13990V, t1);
        return this;
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
    public final Object setCustomOrderedResolutions(List list) {
        this.f1886a.insertOption(ImageOutputConfig.f13904J, list);
        return this;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setDefaultCaptureConfig(androidx.camera.core.impl.T t) {
        this.f1886a.insertOption(UseCaseConfig.f13983N, t);
        return this;
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
    public final Object setDefaultResolution(Size size) {
        this.f1886a.insertOption(ImageOutputConfig.f13900E, size);
        return this;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setDefaultSessionConfig(H0 h7) {
        this.f1886a.insertOption(UseCaseConfig.f13982K, h7);
        return this;
    }

    @Override // androidx.camera.core.impl.ImageInputConfig.Builder
    public final Object setDynamicRange(C0216v c0216v) {
        if (!C0216v.f2122d.equals(c0216v)) {
            throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
        }
        this.f1886a.insertOption(ImageInputConfig.f13898s, c0216v);
        return this;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setHighResolutionDisabled(boolean z3) {
        this.f1886a.insertOption(UseCaseConfig.f13989U, Boolean.valueOf(z3));
        return this;
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
    public final Object setMaxResolution(Size size) {
        this.f1886a.insertOption(ImageOutputConfig.f13901F, size);
        return this;
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
    public final Object setMirrorMode(int i7) {
        throw new UnsupportedOperationException("setMirrorMode is not supported.");
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
    public final Object setResolutionSelector(I.b bVar) {
        this.f1886a.insertOption(ImageOutputConfig.f13903I, bVar);
        return this;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setSessionOptionUnpacker(SessionConfig$OptionUnpacker sessionConfig$OptionUnpacker) {
        this.f1886a.insertOption(UseCaseConfig.f13984O, sessionConfig$OptionUnpacker);
        return this;
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
    public final Object setSupportedResolutions(List list) {
        this.f1886a.insertOption(ImageOutputConfig.f13902G, list);
        return this;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setSurfaceOccupancyPriority(int i7) {
        this.f1886a.insertOption(UseCaseConfig.f13986R, Integer.valueOf(i7));
        return this;
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
    public final /* bridge */ /* synthetic */ Object setTargetAspectRatio(int i7) {
        b(i7);
        return this;
    }

    @Override // androidx.camera.core.internal.TargetConfig.Builder
    public final /* bridge */ /* synthetic */ Object setTargetClass(Class cls) {
        c(cls);
        return this;
    }

    @Override // androidx.camera.core.internal.TargetConfig.Builder
    public final Object setTargetName(String str) {
        this.f1886a.insertOption(TargetConfig.c0, str);
        return this;
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
    public final Object setTargetResolution(Size size) {
        this.f1886a.insertOption(ImageOutputConfig.f13899D, size);
        return this;
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
    public final Object setTargetRotation(int i7) {
        this.f1886a.insertOption(ImageOutputConfig.f13906x, Integer.valueOf(i7));
        return this;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setZslDisabled(boolean z3) {
        this.f1886a.insertOption(UseCaseConfig.f13988T, Boolean.valueOf(z3));
        return this;
    }

    public A(C0992m0 c0992m0) {
        Object objRetrieveOption;
        this.f1886a = c0992m0;
        try {
            objRetrieveOption = c0992m0.retrieveOption(TargetConfig.f14307d0);
        } catch (IllegalArgumentException unused) {
            objRetrieveOption = null;
        }
        Class cls = (Class) objRetrieveOption;
        if (cls == null || cls.equals(C.class)) {
            this.f1886a.insertOption(UseCaseConfig.f13990V, T0.f13976c);
            c(C.class);
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }
}
