package E;

import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C0982h0;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.UseCaseConfig;

/* JADX INFO: loaded from: classes.dex */
public final class M implements ConfigProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0982h0 f1936a;

    static {
        I.b bVar = new I.b(I.a.f3952b, I.c.f3957c, null);
        C0216v c0216v = C0216v.f2122d;
        L l5 = new L();
        C0971c c0971c = UseCaseConfig.f13986R;
        C0992m0 c0992m0 = l5.f1935a;
        c0992m0.insertOption(c0971c, 4);
        l5.b(0);
        c0992m0.insertOption(ImageOutputConfig.f13903I, bVar);
        c0992m0.insertOption(C0982h0.f14073f, 0);
        c0992m0.insertOption(ImageInputConfig.f13898s, c0216v);
        f1936a = new C0982h0(C1000q0.a(c0992m0));
    }

    @Override // androidx.camera.core.impl.ConfigProvider
    public final Config getConfig() {
        return f1936a;
    }
}
