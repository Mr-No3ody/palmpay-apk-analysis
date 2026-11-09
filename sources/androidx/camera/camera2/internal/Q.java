package androidx.camera.camera2.internal;

import androidx.arch.core.util.Function;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Q implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13252a;

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        switch (this.f13252a) {
            case 0:
                return Boolean.TRUE;
            case 1:
                return null;
            case 2:
                return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
            case 3:
                int i7 = C0923d0.f13496g;
                return Boolean.FALSE;
            default:
                int i10 = C0927f0.f13515h;
                return Boolean.FALSE;
        }
    }
}
