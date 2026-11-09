package androidx.camera.video;

import E.C0216v;
import E.K;
import android.util.Range;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.UseCaseConfig;

/* JADX INFO: loaded from: classes.dex */
public final class A implements ConfigProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.camera.video.impl.a f14537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Range f14538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0216v f14539c;

    static {
        z zVar = new z();
        K k2 = androidx.camera.video.internal.encoder.A.f14644d;
        f14538b = new Range(30, 30);
        C0216v c0216v = C0216v.f2122d;
        f14539c = c0216v;
        y yVar = new y(zVar);
        C0971c c0971c = UseCaseConfig.f13986R;
        C0992m0 c0992m0 = yVar.f14871a;
        c0992m0.insertOption(c0971c, 5);
        c0992m0.insertOption(androidx.camera.video.impl.a.f14608c, k2);
        c0992m0.insertOption(ImageInputConfig.f13898s, c0216v);
        f14537a = new androidx.camera.video.impl.a(C1000q0.a(c0992m0));
    }

    @Override // androidx.camera.core.impl.ConfigProvider
    public final Config getConfig() {
        return f14537a;
    }
}
