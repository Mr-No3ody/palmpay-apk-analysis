package androidx.transition;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class H extends J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17947a;

    public /* synthetic */ H(int i7) {
        this.f17947a = i7;
    }

    @Override // androidx.transition.Slide.CalculateSlide
    public final float getGoneY(ViewGroup viewGroup, View view) {
        switch (this.f17947a) {
            case 0:
                return view.getTranslationY() - viewGroup.getHeight();
            default:
                return view.getTranslationY() + viewGroup.getHeight();
        }
    }
}
