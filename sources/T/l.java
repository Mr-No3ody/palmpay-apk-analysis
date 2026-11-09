package T;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class l extends p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8920g;

    @Override // T.p
    public final boolean b(float f10, long j6, O.e eVar, View view) {
        switch (this.f8920g) {
            case 0:
                view.setAlpha(a(f10, j6, eVar, view));
                break;
            case 1:
                view.setElevation(a(f10, j6, eVar, view));
                break;
            case 2:
                view.setRotation(a(f10, j6, eVar, view));
                break;
            case 3:
                view.setRotationX(a(f10, j6, eVar, view));
                break;
            case 4:
                view.setRotationY(a(f10, j6, eVar, view));
                break;
            case 5:
                view.setScaleX(a(f10, j6, eVar, view));
                break;
            case 6:
                view.setScaleY(a(f10, j6, eVar, view));
                break;
            case 7:
                view.setTranslationX(a(f10, j6, eVar, view));
                break;
            case 8:
                view.setTranslationY(a(f10, j6, eVar, view));
                break;
            default:
                view.setTranslationZ(a(f10, j6, eVar, view));
                break;
        }
        return this.f8930d;
    }
}
