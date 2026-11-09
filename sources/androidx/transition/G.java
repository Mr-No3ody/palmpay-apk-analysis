package androidx.transition;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class G extends I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17936a;

    public /* synthetic */ G(int i7) {
        this.f17936a = i7;
    }

    @Override // androidx.transition.Slide.CalculateSlide
    public final float getGoneX(ViewGroup viewGroup, View view) {
        switch (this.f17936a) {
            case 0:
                return view.getTranslationX() - viewGroup.getWidth();
            case 1:
                return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
            case 2:
                return view.getTranslationX() + viewGroup.getWidth();
            default:
                return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }
}
