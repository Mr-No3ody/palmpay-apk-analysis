package com.scwang.smartrefresh.layout.api;

import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.listener.OnStateChangedListener;
import p192n.c;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({c.f39800a, c.f39801b, c.f39804e})
public interface RefreshInternal extends OnStateChangedListener {
    @NonNull
    SpinnerStyle getSpinnerStyle();

    @NonNull
    View getView();

    boolean isSupportHorizontalDrag();

    int onFinish(@NonNull RefreshLayout refreshLayout, boolean z3);

    void onHorizontalDrag(float f10, int i7, int i10);

    void onInitialized(@NonNull RefreshKernel refreshKernel, int i7, int i10);

    void onMoving(boolean z3, float f10, int i7, int i10, int i11);

    void onReleased(@NonNull RefreshLayout refreshLayout, int i7, int i10);

    void onStartAnimator(@NonNull RefreshLayout refreshLayout, int i7, int i10);

    void setPrimaryColors(@ColorInt int... iArr);
}
