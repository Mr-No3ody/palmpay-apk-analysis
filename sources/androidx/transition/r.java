package androidx.transition;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class r extends O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rect f18103b;

    public /* synthetic */ r(int i7, Rect rect) {
        this.f18102a = i7;
        this.f18103b = rect;
    }

    @Override // androidx.transition.O
    public final Rect a() {
        switch (this.f18102a) {
            case 0:
                return this.f18103b;
            default:
                Rect rect = this.f18103b;
                if (rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
