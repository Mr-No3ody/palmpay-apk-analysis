package com.scwang.smartrefresh.layout.api;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import com.scwang.smartrefresh.layout.constant.RefreshState;

/* JADX INFO: loaded from: classes3.dex */
public interface RefreshKernel {
    ValueAnimator animSpinner(int i7);

    RefreshKernel finishTwoLevel();

    @NonNull
    RefreshContent getRefreshContent();

    @NonNull
    RefreshLayout getRefreshLayout();

    RefreshKernel moveSpinner(int i7, boolean z3);

    RefreshKernel requestDefaultTranslationContentFor(@NonNull RefreshInternal refreshInternal, boolean z3);

    RefreshKernel requestDrawBackgroundFor(RefreshInternal refreshInternal, int i7);

    RefreshKernel requestFloorDuration(int i7);

    RefreshKernel requestNeedTouchEventFor(@NonNull RefreshInternal refreshInternal, boolean z3);

    RefreshKernel requestRemeasureHeightFor(@NonNull RefreshInternal refreshInternal);

    RefreshKernel setState(@NonNull RefreshState refreshState);

    RefreshKernel startTwoLevel(boolean z3);
}
