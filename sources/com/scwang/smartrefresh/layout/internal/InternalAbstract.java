package com.scwang.smartrefresh.layout.internal;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshInternal;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;

/* JADX INFO: loaded from: classes3.dex */
public abstract class InternalAbstract extends RelativeLayout implements RefreshInternal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f25171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SpinnerStyle f25172b;

    public InternalAbstract(View view) {
        super(view.getContext(), null, 0);
        this.f25171a = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    @NonNull
    public SpinnerStyle getSpinnerStyle() {
        int i7;
        SpinnerStyle spinnerStyle = this.f25172b;
        if (spinnerStyle != null) {
            return spinnerStyle;
        }
        View view = this.f25171a;
        if (view instanceof RefreshInternal) {
            return ((RefreshInternal) view).getSpinnerStyle();
        }
        if (view != 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.LayoutParams) {
                SpinnerStyle spinnerStyle2 = ((SmartRefreshLayout.LayoutParams) layoutParams).spinnerStyle;
                this.f25172b = spinnerStyle2;
                if (spinnerStyle2 != null) {
                    return spinnerStyle2;
                }
            }
            if (layoutParams != null && ((i7 = layoutParams.height) == 0 || i7 == -1)) {
                SpinnerStyle spinnerStyle3 = SpinnerStyle.Scale;
                this.f25172b = spinnerStyle3;
                return spinnerStyle3;
            }
        }
        SpinnerStyle spinnerStyle4 = SpinnerStyle.Translate;
        this.f25172b = spinnerStyle4;
        return spinnerStyle4;
    }

    @NonNull
    public View getView() {
        View view = this.f25171a;
        return view == null ? this : view;
    }

    public boolean isSupportHorizontalDrag() {
        KeyEvent.Callback callback = this.f25171a;
        return (callback instanceof RefreshInternal) && ((RefreshInternal) callback).isSupportHorizontalDrag();
    }

    public int onFinish(@NonNull RefreshLayout refreshLayout, boolean z3) {
        KeyEvent.Callback callback = this.f25171a;
        if (callback instanceof RefreshInternal) {
            return ((RefreshInternal) callback).onFinish(refreshLayout, z3);
        }
        return 0;
    }

    public void onHorizontalDrag(float f10, int i7, int i10) {
        KeyEvent.Callback callback = this.f25171a;
        if (callback instanceof RefreshInternal) {
            ((RefreshInternal) callback).onHorizontalDrag(f10, i7, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onInitialized(@NonNull RefreshKernel refreshKernel, int i7, int i10) {
        View view = this.f25171a;
        if (view instanceof RefreshInternal) {
            ((RefreshInternal) view).onInitialized(refreshKernel, i7, i10);
        } else if (view != 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.LayoutParams) {
                refreshKernel.requestDrawBackgroundFor(this, ((SmartRefreshLayout.LayoutParams) layoutParams).backgroundColor);
            }
        }
    }

    public void onMoving(boolean z3, float f10, int i7, int i10, int i11) {
        KeyEvent.Callback callback = this.f25171a;
        if (callback instanceof RefreshInternal) {
            ((RefreshInternal) callback).onMoving(z3, f10, i7, i10, i11);
        }
    }

    public void onReleased(@NonNull RefreshLayout refreshLayout, int i7, int i10) {
        KeyEvent.Callback callback = this.f25171a;
        if (callback instanceof RefreshInternal) {
            ((RefreshInternal) callback).onReleased(refreshLayout, i7, i10);
        }
    }

    public void onStartAnimator(@NonNull RefreshLayout refreshLayout, int i7, int i10) {
        KeyEvent.Callback callback = this.f25171a;
        if (callback instanceof RefreshInternal) {
            ((RefreshInternal) callback).onStartAnimator(refreshLayout, i7, i10);
        }
    }

    public void onStateChanged(@NonNull RefreshLayout refreshLayout, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        KeyEvent.Callback callback = this.f25171a;
        if (callback instanceof RefreshInternal) {
            ((RefreshInternal) callback).onStateChanged(refreshLayout, refreshState, refreshState2);
        }
    }

    @Deprecated
    public void setPrimaryColors(@ColorInt int... iArr) {
        KeyEvent.Callback callback = this.f25171a;
        if (callback instanceof RefreshInternal) {
            ((RefreshInternal) callback).setPrimaryColors(iArr);
        }
    }
}
