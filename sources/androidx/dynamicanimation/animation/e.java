package androidx.dynamicanimation.animation;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class e extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16845a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(String str, int i7) {
        super(str);
        this.f16845a = i7;
    }

    @Override // androidx.dynamicanimation.animation.h
    public final float getValue(Object obj) {
        switch (this.f16845a) {
            case 0:
                return ((View) obj).getAlpha();
            case 1:
                return ((View) obj).getScaleX();
            case 2:
                return ((View) obj).getScaleY();
            case 3:
                return ((View) obj).getRotation();
            case 4:
                return ((View) obj).getRotationX();
            default:
                return ((View) obj).getRotationY();
        }
    }

    @Override // androidx.dynamicanimation.animation.h
    public final void setValue(Object obj, float f10) {
        switch (this.f16845a) {
            case 0:
                ((View) obj).setAlpha(f10);
                break;
            case 1:
                ((View) obj).setScaleX(f10);
                break;
            case 2:
                ((View) obj).setScaleY(f10);
                break;
            case 3:
                ((View) obj).setRotation(f10);
                break;
            case 4:
                ((View) obj).setRotationX(f10);
                break;
            default:
                ((View) obj).setRotationY(f10);
                break;
        }
    }
}
