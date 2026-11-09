package androidx.camera.core.impl;

import E.C0216v;
import android.util.Size;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class C0 extends B0 {
    public static C0 e(UseCaseConfig useCaseConfig, Size size) {
        SessionConfig$OptionUnpacker sessionOptionUnpacker = useCaseConfig.getSessionOptionUnpacker(null);
        if (sessionOptionUnpacker != null) {
            C0 c0 = new C0();
            sessionOptionUnpacker.unpack(size, useCaseConfig, c0);
            return c0;
        }
        throw new IllegalStateException("Implementation is missing option unpacker for " + useCaseConfig.getTargetName(useCaseConfig.toString()));
    }

    public final void a(AbstractC0999q abstractC0999q) {
        this.f13839b.b(abstractC0999q);
        ArrayList arrayList = this.f13842e;
        if (arrayList.contains(abstractC0999q)) {
            return;
        }
        arrayList.add(abstractC0999q);
    }

    public final void b(Config config) {
        this.f13839b.c(config);
    }

    public final void c(AbstractC0970b0 abstractC0970b0, C0216v c0216v, int i7) {
        C0985j c0985jA = C0987k.a(abstractC0970b0);
        if (c0216v == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        c0985jA.f14090e = c0216v;
        c0985jA.f14088c = Integer.valueOf(i7);
        this.f13838a.add(c0985jA.a());
        this.f13839b.f13955a.add(abstractC0970b0);
    }

    public final H0 d() {
        return new H0(new ArrayList(this.f13838a), new ArrayList(this.f13840c), new ArrayList(this.f13841d), new ArrayList(this.f13842e), this.f13839b.d(), this.f13843f, this.f13844g, this.f13845h);
    }
}
