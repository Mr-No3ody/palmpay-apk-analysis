package androidx.transition;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class I implements Slide.CalculateSlide {
    @Override // androidx.transition.Slide.CalculateSlide
    public final float getGoneY(ViewGroup viewGroup, View view) {
        return view.getTranslationY();
    }
}
