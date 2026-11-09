package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends Transition.EpicenterCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rect f17184b;

    public /* synthetic */ m0(int i7, Rect rect) {
        this.f17183a = i7;
        this.f17184b = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        switch (this.f17183a) {
            case 0:
                return this.f17184b;
            default:
                Rect rect = this.f17184b;
                if (rect == null || rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
