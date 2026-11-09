package T;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class g extends k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f8916f;

    @Override // T.k
    public final void d(View view, float f10) {
        switch (this.f8916f) {
            case 0:
                view.setAlpha(a(f10));
                break;
            case 1:
                view.setElevation(a(f10));
                break;
            case 2:
                view.setPivotX(a(f10));
                break;
            case 3:
                view.setPivotY(a(f10));
                break;
            case 4:
                view.setRotation(a(f10));
                break;
            case 5:
                view.setRotationX(a(f10));
                break;
            case 6:
                view.setRotationY(a(f10));
                break;
            case 7:
                view.setScaleX(a(f10));
                break;
            case 8:
                view.setScaleY(a(f10));
                break;
            case 9:
                view.setTranslationX(a(f10));
                break;
            case 10:
                view.setTranslationY(a(f10));
                break;
            default:
                view.setTranslationZ(a(f10));
                break;
        }
    }
}
