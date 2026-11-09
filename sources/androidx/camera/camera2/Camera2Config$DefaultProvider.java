package androidx.camera.camera2;

import B.a;
import B.b;
import E.C0213s;
import E.C0214t;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraXConfig$Provider;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C1000q0;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({c.f39800a})
public final class Camera2Config$DefaultProvider implements CameraXConfig$Provider {
    @Override // androidx.camera.core.CameraXConfig$Provider
    @NonNull
    public C0214t getCameraXConfig() {
        a aVar = new a();
        b bVar = new b();
        B.c cVar = new B.c();
        C0213s c0213s = new C0213s();
        C0971c c0971c = C0214t.f2109b;
        C0992m0 c0992m0 = c0213s.f2108a;
        c0992m0.insertOption(c0971c, aVar);
        c0992m0.insertOption(C0214t.f2110c, bVar);
        c0992m0.insertOption(C0214t.f2111d, cVar);
        return new C0214t(C1000q0.a(c0992m0));
    }
}
