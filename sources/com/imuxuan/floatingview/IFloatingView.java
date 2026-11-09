package com.imuxuan.floatingview;

import B5.d;
import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;

/* JADX INFO: loaded from: classes3.dex */
public interface IFloatingView {
    d add();

    d attach(Activity activity);

    d attach(FrameLayout frameLayout);

    d customView(@LayoutRes int i7);

    d customView(FloatingMagnetView floatingMagnetView);

    d detach(Activity activity);

    d detach(FrameLayout frameLayout);

    FloatingMagnetView getView();

    d icon(@DrawableRes int i7);

    d layoutParams(ViewGroup.LayoutParams layoutParams);

    d listener(MagnetViewListener magnetViewListener);

    d remove();
}
