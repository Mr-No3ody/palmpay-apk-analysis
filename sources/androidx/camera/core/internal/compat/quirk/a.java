package androidx.camera.core.internal.compat.quirk;

import androidx.camera.core.impl.u0;
import androidx.camera.core.impl.v0;
import androidx.camera.core.impl.y0;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile y0 f14321a;

    static {
        v0 v0Var = v0.f14272c;
        androidx.camera.core.impl.utils.executor.a aVarU = b.u();
        J.a aVar = new J.a(2);
        v0Var.getClass();
        v0Var.f14273a.addObserver(aVarU, new u0(aVar));
    }
}
