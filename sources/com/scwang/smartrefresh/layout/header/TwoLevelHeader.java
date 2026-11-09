package com.scwang.smartrefresh.layout.header;

import D7.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.scwang.smartrefresh.layout.R;
import com.scwang.smartrefresh.layout.api.OnTwoLevelListener;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.impl.RefreshHeaderWrapper;
import com.scwang.smartrefresh.layout.internal.InternalAbstract;

/* JADX INFO: loaded from: classes3.dex */
public class TwoLevelHeader extends InternalAbstract implements RefreshHeader {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f25149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f25150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f25151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f25152g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f25153i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f25154j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f25155o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f25156p;
    public RefreshHeader t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RefreshKernel f25157v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public OnTwoLevelListener f25158w;

    public TwoLevelHeader(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f25149d = 0.0f;
        this.f25150e = 2.5f;
        this.f25151f = 1.9f;
        this.f25152g = 1.0f;
        this.f25153i = true;
        this.f25154j = true;
        this.f25155o = 1000;
        this.f25172b = SpinnerStyle.FixedBehind;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TwoLevelHeader);
        this.f25150e = typedArrayObtainStyledAttributes.getFloat(R.styleable.TwoLevelHeader_srlMaxRage, this.f25150e);
        this.f25151f = typedArrayObtainStyledAttributes.getFloat(R.styleable.TwoLevelHeader_srlFloorRage, this.f25151f);
        this.f25152g = typedArrayObtainStyledAttributes.getFloat(R.styleable.TwoLevelHeader_srlRefreshRage, this.f25152g);
        this.f25155o = typedArrayObtainStyledAttributes.getInt(R.styleable.TwoLevelHeader_srlFloorDuration, this.f25155o);
        this.f25153i = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TwoLevelHeader_srlEnableTwoLevel, this.f25153i);
        this.f25154j = typedArrayObtainStyledAttributes.getBoolean(R.styleable.TwoLevelHeader_srlEnablePullToCloseTwoLevel, this.f25154j);
        typedArrayObtainStyledAttributes.recycle();
    }

    public TwoLevelHeader finishTwoLevel() {
        this.f25157v.finishTwoLevel();
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.api.RefreshInternal
    @NonNull
    public View getView() {
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25172b = SpinnerStyle.MatchLayout;
        if (this.t == null) {
            this.t = new RefreshHeaderWrapper(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25172b = SpinnerStyle.FixedBehind;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof RefreshHeader) {
                this.f25171a = childAt;
                this.t = (RefreshHeader) childAt;
                bringChildToFront(childAt);
                break;
            }
        }
        if (this.t == null) {
            this.t = new RefreshHeaderWrapper(this);
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onInitialized(@NonNull RefreshKernel refreshKernel, int i7, int i10) {
        if (((i10 + i7) * 1.0f) / i7 != this.f25150e && this.f25156p == 0) {
            this.f25156p = i7;
            refreshKernel.getRefreshLayout().setHeaderMaxDragRate(this.f25150e);
            return;
        }
        if (!isInEditMode() && this.t.getSpinnerStyle() == SpinnerStyle.Translate && this.f25157v == null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.t.getView().getLayoutParams();
            marginLayoutParams.topMargin -= i7;
            this.t.getView().setLayoutParams(marginLayoutParams);
        }
        this.f25156p = i7;
        this.f25157v = refreshKernel;
        refreshKernel.requestFloorDuration(this.f25155o);
        this.t.onInitialized(this.f25157v, i7, i10);
        this.f25157v.requestNeedTouchEventFor(this, !this.f25154j);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.t.getView() == this) {
            super.onMeasure(i7, i10);
        } else {
            if (View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
                super.onMeasure(i7, i10);
                return;
            }
            this.t.getView().measure(i7, i10);
            super.setMeasuredDimension(View.resolveSize(super.getSuggestedMinimumWidth(), i7), this.t.getView().getMeasuredHeight());
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onMoving(boolean z3, float f10, int i7, int i10, int i11) {
        if (this.f25148c != i7 && this.t.getView() != this) {
            this.f25148c = i7;
            int i12 = c.f1690b[this.t.getSpinnerStyle().ordinal()];
            if (i12 == 1) {
                this.t.getView().setTranslationY(i7);
            } else if (i12 == 2) {
                View view = this.t.getView();
                view.layout(view.getLeft(), view.getTop(), view.getRight(), Math.max(0, i7) + view.getTop());
            }
        }
        this.t.onMoving(z3, f10, i7, i10, i11);
        if (z3) {
            float f11 = this.f25149d;
            float f12 = this.f25151f;
            if (f11 < f12 && f10 >= f12 && this.f25153i) {
                this.f25157v.setState(RefreshState.ReleaseToTwoLevel);
            } else if (f11 >= f12 && f10 < this.f25152g) {
                this.f25157v.setState(RefreshState.PullDownToRefresh);
            } else if (f11 >= f12 && f10 < f12) {
                this.f25157v.setState(RefreshState.ReleaseToRefresh);
            }
            this.f25149d = f10;
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.listener.OnStateChangedListener
    public void onStateChanged(@NonNull RefreshLayout refreshLayout, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        this.t.onStateChanged(refreshLayout, refreshState, refreshState2);
        int i7 = c.f1689a[refreshState2.ordinal()];
        boolean z3 = true;
        if (i7 == 1) {
            if (this.t.getView() != this) {
                this.t.getView().animate().alpha(0.0f).setDuration(this.f25155o / 2);
            }
            RefreshKernel refreshKernel = this.f25157v;
            OnTwoLevelListener onTwoLevelListener = this.f25158w;
            if (onTwoLevelListener != null && !onTwoLevelListener.onTwoLevel(refreshLayout)) {
                z3 = false;
            }
            refreshKernel.startTwoLevel(z3);
            return;
        }
        if (i7 == 3) {
            if (this.t.getView() != this) {
                this.t.getView().animate().alpha(1.0f).setDuration(this.f25155o / 2);
            }
        } else if (i7 == 4 && this.t.getView().getAlpha() == 0.0f && this.t.getView() != this) {
            this.t.getView().setAlpha(1.0f);
        }
    }

    public TwoLevelHeader setEnablePullToCloseTwoLevel(boolean z3) {
        this.f25154j = z3;
        RefreshKernel refreshKernel = this.f25157v;
        if (refreshKernel != null) {
            refreshKernel.requestNeedTouchEventFor(this, !z3);
        }
        return this;
    }

    public TwoLevelHeader setEnableTwoLevel(boolean z3) {
        this.f25153i = z3;
        return this;
    }

    public TwoLevelHeader setFloorDuration(int i7) {
        this.f25155o = i7;
        return this;
    }

    public TwoLevelHeader setFloorRage(float f10) {
        this.f25151f = f10;
        return this;
    }

    public TwoLevelHeader setMaxRage(float f10) {
        if (this.f25150e != f10) {
            this.f25150e = f10;
            RefreshKernel refreshKernel = this.f25157v;
            if (refreshKernel != null) {
                this.f25156p = 0;
                refreshKernel.getRefreshLayout().setHeaderMaxDragRate(this.f25150e);
            }
        }
        return this;
    }

    public TwoLevelHeader setOnTwoLevelListener(OnTwoLevelListener onTwoLevelListener) {
        this.f25158w = onTwoLevelListener;
        return this;
    }

    public TwoLevelHeader setRefreshHeader(RefreshHeader refreshHeader) {
        return setRefreshHeader(refreshHeader, -1, -2);
    }

    public TwoLevelHeader setRefreshRage(float f10) {
        this.f25152g = f10;
        return this;
    }

    public TwoLevelHeader setRefreshHeader(RefreshHeader refreshHeader, int i7, int i10) {
        if (refreshHeader != null) {
            RefreshHeader refreshHeader2 = this.t;
            if (refreshHeader2 != null) {
                removeView(refreshHeader2.getView());
            }
            this.t = refreshHeader;
            if (refreshHeader.getSpinnerStyle() == SpinnerStyle.FixedBehind) {
                addView(this.t.getView(), 0, new RelativeLayout.LayoutParams(i7, i10));
                return this;
            }
            addView(this.t.getView(), i7, i10);
        }
        return this;
    }

    public TwoLevelHeader(@NonNull Context context) {
        this(context, null);
    }

    public TwoLevelHeader(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
