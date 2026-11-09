package androidx.transition;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class J implements Slide.CalculateSlide {
    @Override // androidx.transition.Slide.CalculateSlide
    public final float getGoneX(ViewGroup viewGroup, View view) {
        return view.getTranslationX();
    }
}
