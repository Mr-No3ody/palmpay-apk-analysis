package com.bumptech.glide.request.transition;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Transition {
    @Override // com.bumptech.glide.request.transition.Transition
    public final boolean transition(Object obj, Transition.ViewAdapter viewAdapter) {
        Drawable drawable = (Drawable) obj;
        Drawable currentDrawable = viewAdapter.getCurrentDrawable();
        if (currentDrawable == null) {
            currentDrawable = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{currentDrawable, drawable});
        transitionDrawable.setCrossFadeEnabled(false);
        transitionDrawable.startTransition(200);
        viewAdapter.setDrawable(transitionDrawable);
        return true;
    }
}
