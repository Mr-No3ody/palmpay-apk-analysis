package T;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class b extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8913d;

    public /* synthetic */ b(int i7) {
        this.f8913d = i7;
    }

    @Override // T.f
    public final void e(View view, float f10) {
        switch (this.f8913d) {
            case 0:
                view.setAlpha(a(f10));
                break;
            case 1:
                view.setElevation(a(f10));
                break;
            case 2:
                view.setRotation(a(f10));
                break;
            case 3:
                view.setRotationX(a(f10));
                break;
            case 4:
                view.setRotationY(a(f10));
                break;
            case 5:
                view.setScaleX(a(f10));
                break;
            case 6:
                view.setScaleY(a(f10));
                break;
            case 7:
                view.setTranslationX(a(f10));
                break;
            case 8:
                view.setTranslationY(a(f10));
                break;
            default:
                view.setTranslationZ(a(f10));
                break;
        }
    }
}
