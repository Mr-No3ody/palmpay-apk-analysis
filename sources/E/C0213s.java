package E;

import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.internal.TargetConfig;
import java.util.UUID;

/* JADX INFO: renamed from: E.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0213s implements TargetConfig.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0992m0 f2108a;

    public C0213s() {
        Object objRetrieveOption;
        C0992m0 c0992m0B = C0992m0.b();
        this.f2108a = c0992m0B;
        try {
            objRetrieveOption = c0992m0B.retrieveOption(TargetConfig.f14307d0);
        } catch (IllegalArgumentException unused) {
            objRetrieveOption = null;
        }
        Class cls = (Class) objRetrieveOption;
        if (cls == null || cls.equals(androidx.camera.core.c.class)) {
            a(androidx.camera.core.c.class);
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }

    public final void a(Class cls) {
        Object objRetrieveOption;
        C0971c c0971c = TargetConfig.f14307d0;
        C0992m0 c0992m0 = this.f2108a;
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

    @Override // androidx.camera.core.internal.TargetConfig.Builder
    public final /* bridge */ /* synthetic */ Object setTargetClass(Class cls) {
        a(cls);
        return this;
    }

    @Override // androidx.camera.core.internal.TargetConfig.Builder
    public final Object setTargetName(String str) {
        this.f2108a.insertOption(TargetConfig.c0, str);
        return this;
    }
}
