package E;

import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C0982h0;
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
import androidx.camera.core.internal.IoConfig;
import androidx.camera.core.internal.TargetConfig;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class L implements UseCaseConfig.Builder, ImageOutputConfig.Builder, IoConfig.Builder, ImageInputConfig.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0992m0 f1935a;

    public L() {
        this(C0992m0.b());
    }

    @Override // androidx.camera.core.ExtendableBuilder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P build() {
        Object objRetrieveOption;
        Object objRetrieveOption2;
        C0971c c0971c = C0982h0.f14072e;
        C0992m0 c0992m0 = this.f1935a;
        c0992m0.getClass();
        Object objRetrieveOption3 = null;
        try {
            objRetrieveOption = c0992m0.retrieveOption(c0971c);
        } catch (IllegalArgumentException unused) {
            objRetrieveOption = null;
        }
        Integer num = (Integer) objRetrieveOption;
        if (num != null) {
            c0992m0.insertOption(ImageInputConfig.f13897r, num);
        } else {
            M m7 = P.f1940z;
            if (Objects.equals(c0992m0.retrieveOption(C0982h0.f14073f, null), 1)) {
                c0992m0.insertOption(ImageInputConfig.f13897r, 4101);
                c0992m0.insertOption(ImageInputConfig.f13898s, C0216v.f2121c);
            } else {
                c0992m0.insertOption(ImageInputConfig.f13897r, Integer.valueOf(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER));
            }
        }
        C0982h0 c0982h0 = new C0982h0(C1000q0.a(c0992m0));
        ImageOutputConfig.validateConfig(c0982h0);
        P p3 = new P(c0982h0);
        try {
            objRetrieveOption2 = c0992m0.retrieveOption(ImageOutputConfig.f13899D);
        } catch (IllegalArgumentException unused2) {
            objRetrieveOption2 = null;
        }
        Size size = (Size) objRetrieveOption2;
        if (size != null) {
            p3.f1945s = new Rational(size.getWidth(), size.getHeight());
        }
        C0971c c0971c2 = IoConfig.b0;
        Object objM = org.chromium.support_lib_boundary.util.b.M();
        try {
            objM = c0992m0.retrieveOption(c0971c2);
        } catch (IllegalArgumentException unused3) {
        }
        p118hf.a.j((Executor) objM, "The IO executor can't be null");
        C0971c c0971c3 = C0982h0.f14070c;
        if (c0992m0.f14126a.containsKey(c0971c3)) {
            Integer num2 = (Integer) c0992m0.retrieveOption(c0971c3);
            if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
            }
            if (num2.intValue() == 3) {
                try {
                    objRetrieveOption3 = c0992m0.retrieveOption(C0982h0.f14078p);
                } catch (IllegalArgumentException unused4) {
                }
                if (objRetrieveOption3 == null) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                }
            }
        }
        return p3;
    }

    public final void b(int i7) {
        if (i7 == -1) {
            i7 = 0;
        }
        this.f1935a.insertOption(ImageOutputConfig.f13905u, Integer.valueOf(i7));
    }

    public final void c(Class cls) {
        Object objRetrieveOption;
        C0971c c0971c = TargetConfig.f14307d0;
        C0992m0 c0992m0 = this.f1935a;
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
        return this.f1935a;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final UseCaseConfig getUseCaseConfig() {
        return new C0982h0(C1000q0.a(this.f1935a));
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setCaptureOptionUnpacker(CaptureConfig$OptionUnpacker captureConfig$OptionUnpacker) {
        this.f1935a.insertOption(UseCaseConfig.f13985P, captureConfig$OptionUnpacker);
        return this;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setCaptureType(T0 t1) {
        this.f1935a.insertOption(UseCaseConfig.f13990V, t1);
        return this;
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
    public final Object setCustomOrderedResolutions(List list) {
        this.f1935a.insertOption(ImageOutputConfig.f13904J, list);
        return this;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setDefaultCaptureConfig(androidx.camera.core.impl.T t) {
        this.f1935a.insertOption(UseCaseConfig.f13983N, t);
        return this;
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
    public final Object setDefaultResolution(Size size) {
        this.f1935a.insertOption(ImageOutputConfig.f13900E, size);
        return this;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setDefaultSessionConfig(H0 h7) {
        this.f1935a.insertOption(UseCaseConfig.f13982K, h7);
        return this;
    }

    @Override // androidx.camera.core.impl.ImageInputConfig.Builder
    public final Object setDynamicRange(C0216v c0216v) {
        this.f1935a.insertOption(ImageInputConfig.f13898s, c0216v);
        return this;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setHighResolutionDisabled(boolean z3) {
        this.f1935a.insertOption(UseCaseConfig.f13989U, Boolean.valueOf(z3));
        return this;
    }

    @Override // androidx.camera.core.internal.IoConfig.Builder
    public final Object setIoExecutor(Executor executor) {
        this.f1935a.insertOption(IoConfig.b0, executor);
        return this;
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
    public final Object setMaxResolution(Size size) {
        this.f1935a.insertOption(ImageOutputConfig.f13901F, size);
        return this;
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
    public final Object setMirrorMode(int i7) {
        throw new UnsupportedOperationException("setMirrorMode is not supported.");
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
    public final Object setResolutionSelector(I.b bVar) {
        this.f1935a.insertOption(ImageOutputConfig.f13903I, bVar);
        return this;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setSessionOptionUnpacker(SessionConfig$OptionUnpacker sessionConfig$OptionUnpacker) {
        this.f1935a.insertOption(UseCaseConfig.f13984O, sessionConfig$OptionUnpacker);
        return this;
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
    public final Object setSupportedResolutions(List list) {
        this.f1935a.insertOption(ImageOutputConfig.f13902G, list);
        return this;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setSurfaceOccupancyPriority(int i7) {
        this.f1935a.insertOption(UseCaseConfig.f13986R, Integer.valueOf(i7));
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
        this.f1935a.insertOption(TargetConfig.c0, str);
        return this;
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
    public final Object setTargetResolution(Size size) {
        this.f1935a.insertOption(ImageOutputConfig.f13899D, size);
        return this;
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
    public final Object setTargetRotation(int i7) {
        this.f1935a.insertOption(ImageOutputConfig.f13906x, Integer.valueOf(i7));
        return this;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public final Object setZslDisabled(boolean z3) {
        this.f1935a.insertOption(UseCaseConfig.f13988T, Boolean.valueOf(z3));
        return this;
    }

    public L(C0992m0 c0992m0) {
        Object objRetrieveOption;
        this.f1935a = c0992m0;
        try {
            objRetrieveOption = c0992m0.retrieveOption(TargetConfig.f14307d0);
        } catch (IllegalArgumentException unused) {
            objRetrieveOption = null;
        }
        Class cls = (Class) objRetrieveOption;
        if (cls == null || cls.equals(P.class)) {
            this.f1935a.insertOption(UseCaseConfig.f13990V, T0.f13974a);
            c(P.class);
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }
}
