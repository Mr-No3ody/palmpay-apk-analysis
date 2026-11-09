package com.scwang.smartrefresh.layout;

import B7.c;
import B7.f;
import B7.g;
import B7.h;
import B7.i;
import B7.j;
import B7.k;
import B7.l;
import B7.m;
import B7.n;
import B7.o;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.C1066s;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.r;
import com.google.firebase.perf.util.Constants;
import com.scwang.smartrefresh.layout.api.DefaultRefreshFooterCreator;
import com.scwang.smartrefresh.layout.api.DefaultRefreshHeaderCreator;
import com.scwang.smartrefresh.layout.api.RefreshContent;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshInternal;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.api.ScrollBoundaryDecider;
import com.scwang.smartrefresh.layout.constant.DimensionStatus;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.impl.RefreshContentWrapper;
import com.scwang.smartrefresh.layout.impl.RefreshFooterWrapper;
import com.scwang.smartrefresh.layout.impl.RefreshHeaderWrapper;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnMultiPurposeListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;
import com.scwang.smartrefresh.layout.util.DelayedRunnable;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.scwang.smartrefresh.layout.util.ScrollBoundaryUtil;
import com.scwang.smartrefresh.layout.util.SmartUtil;
import com.scwang.smartrefresh.layout.util.ViscousFluidInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"RestrictedApi"})
public class SmartRefreshLayout extends ViewGroup implements RefreshLayout, NestedScrollingParent, NestedScrollingChild {

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public static DefaultRefreshFooterCreator f25011B1 = new h();

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public static DefaultRefreshHeaderCreator f25012C1 = new i();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f25013A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final boolean f25014A0;

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    public ValueAnimator f25015A1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f25016B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public boolean f25017B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f25018C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public boolean f25019C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public boolean f25020D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public boolean f25021E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public boolean f25022F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public boolean f25023G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f25024H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public boolean f25025H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public boolean f25026I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public boolean f25027J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public boolean f25028K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f25029L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public boolean f25030L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f25031M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public boolean f25032M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public boolean f25033N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public boolean f25034O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public OnRefreshListener f25035P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final int f25036Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public OnLoadMoreListener f25037Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public OnMultiPurposeListener f25038R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public ScrollBoundaryDecider f25039S0;
    public int T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public boolean f25040U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public final int[] f25041V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public final r f25042W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public final C1066s f25043X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public int f25044Y0;
    public DimensionStatus Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25045a;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f25046a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25047b;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public DimensionStatus f25048b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25049c;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public int f25050c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25051d;
    public int d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25052e;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public float f25053e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25054f;
    public float f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f25055g;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public float f25056g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public float f25057h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f25058i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public RefreshHeader f25059i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f25060j;
    public RefreshFooter j1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f25061k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public RefreshContentWrapper f25062k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public Paint f25063l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public Handler f25064m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public final RefreshKernelImpl f25065n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f25066o;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public List f25067o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f25068p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Scroller f25069p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public RefreshState f25070p1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final VelocityTracker f25071q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public RefreshState f25072q1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Interpolator f25073r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public long f25074r1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int[] f25075s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public int f25076s1;
    public float t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f25077t0;
    public int t1;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f25078u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public boolean f25079u1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public char f25080v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f25081v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public boolean f25082v1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f25083w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f25084w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public boolean f25085w1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f25086x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public boolean f25087x1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f25088y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public MotionEvent f25089y1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f25090z0;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public Runnable f25091z1;

    public class BounceRunnable implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25093b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f25096e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f25092a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f25095d = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f25094c = AnimationUtils.currentAnimationTimeMillis();

        public BounceRunnable(float f10, int i7) {
            this.f25096e = f10;
            this.f25093b = i7;
            SmartRefreshLayout.this.postDelayed(this, 10);
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f25091z1 != this || smartRefreshLayout.f25070p1.isFinishing) {
                return;
            }
            int iAbs = Math.abs(smartRefreshLayout.f25047b);
            int i7 = this.f25093b;
            if (iAbs < Math.abs(i7)) {
                double d2 = this.f25096e;
                int i10 = this.f25092a + 1;
                this.f25092a = i10;
                this.f25096e = (float) (Math.pow(0.949999988079071d, i10) * d2);
            } else if (i7 != 0) {
                double d10 = this.f25096e;
                int i11 = this.f25092a + 1;
                this.f25092a = i11;
                this.f25096e = (float) (Math.pow(0.44999998807907104d, i11) * d10);
            } else {
                double d11 = this.f25096e;
                int i12 = this.f25092a + 1;
                this.f25092a = i12;
                this.f25096e = (float) (Math.pow(0.8500000238418579d, i12) * d11);
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f10 = this.f25096e * (((jCurrentAnimationTimeMillis - this.f25094c) * 1.0f) / 1000.0f);
            if (Math.abs(f10) >= 1.0f) {
                this.f25094c = jCurrentAnimationTimeMillis;
                float f11 = this.f25095d + f10;
                this.f25095d = f11;
                smartRefreshLayout.f(f11);
                smartRefreshLayout.postDelayed(this, 10);
                return;
            }
            smartRefreshLayout.f25091z1 = null;
            if (Math.abs(smartRefreshLayout.f25047b) >= Math.abs(i7)) {
                smartRefreshLayout.e(i7, 0, smartRefreshLayout.f25073r0, Math.min(Math.max((int) DensityUtil.px2dp(Math.abs(smartRefreshLayout.f25047b - i7)), 30), 100) * 10);
            }
        }
    }

    public class FlingRunnable implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f25098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f25099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f25100c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f25101d = AnimationUtils.currentAnimationTimeMillis();

        public FlingRunnable(float f10) {
            this.f25099b = f10;
            this.f25098a = SmartRefreshLayout.this.f25047b;
        }

        @Override // java.lang.Runnable
        public void run() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f25091z1 != this || smartRefreshLayout.f25070p1.isFinishing) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j6 = jCurrentAnimationTimeMillis - this.f25101d;
            float fPow = (float) (Math.pow(0.98f, (jCurrentAnimationTimeMillis - this.f25100c) / ((long) 100)) * ((double) this.f25099b));
            this.f25099b = fPow;
            float f10 = ((j6 * 1.0f) / 1000.0f) * fPow;
            if (Math.abs(f10) <= 1.0f) {
                smartRefreshLayout.f25091z1 = null;
                return;
            }
            this.f25101d = jCurrentAnimationTimeMillis;
            int i7 = (int) (this.f25098a + f10);
            this.f25098a = i7;
            if (smartRefreshLayout.f25047b * i7 > 0) {
                smartRefreshLayout.f25065n1.moveSpinner(i7, true);
                smartRefreshLayout.postDelayed(this, 10);
                return;
            }
            smartRefreshLayout.f25091z1 = null;
            smartRefreshLayout.f25065n1.moveSpinner(0, true);
            SmartUtil.fling(smartRefreshLayout.f25062k1.getScrollableView(), (int) (-this.f25099b));
            if (!smartRefreshLayout.f25085w1 || f10 <= 0.0f) {
                return;
            }
            smartRefreshLayout.f25085w1 = false;
        }

        public Runnable start() {
            RefreshState refreshState;
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            RefreshState refreshState2 = smartRefreshLayout.f25070p1;
            if (refreshState2.isFinishing) {
                return null;
            }
            if (smartRefreshLayout.f25047b != 0 && ((!refreshState2.isOpening && (!smartRefreshLayout.f25028K0 || !smartRefreshLayout.f25090z0 || !smartRefreshLayout.isEnableLoadMore())) || (((smartRefreshLayout.f25070p1 == RefreshState.Loading || (smartRefreshLayout.f25028K0 && smartRefreshLayout.f25090z0 && smartRefreshLayout.isEnableLoadMore())) && smartRefreshLayout.f25047b < (-smartRefreshLayout.f25046a1)) || (smartRefreshLayout.f25070p1 == RefreshState.Refreshing && smartRefreshLayout.f25047b > smartRefreshLayout.f25044Y0)))) {
                int i7 = smartRefreshLayout.f25047b;
                float fPow = this.f25099b;
                int i10 = 0;
                int i11 = i7;
                while (i7 * i11 > 0) {
                    i10++;
                    fPow = (float) (Math.pow(0.98f, (i10 * 10) / 10) * ((double) fPow));
                    float f10 = ((10 * 1.0f) / 1000.0f) * fPow;
                    if (Math.abs(f10) < 1.0f) {
                        RefreshState refreshState3 = smartRefreshLayout.f25070p1;
                        if (refreshState3.isOpening && ((refreshState3 != (refreshState = RefreshState.Refreshing) || i11 <= smartRefreshLayout.f25044Y0) && (refreshState3 == refreshState || i11 >= (-smartRefreshLayout.f25046a1)))) {
                            break;
                            break;
                        }
                        return null;
                    }
                    i11 = (int) (i11 + f10);
                }
            }
            this.f25100c = AnimationUtils.currentAnimationTimeMillis();
            smartRefreshLayout.postDelayed(this, 10);
            return this;
        }
    }

    public class RefreshKernelImpl implements RefreshKernel {
        public RefreshKernelImpl() {
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public ValueAnimator animSpinner(int i7) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            return smartRefreshLayout.e(i7, 0, smartRefreshLayout.f25073r0, smartRefreshLayout.f25054f);
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel finishTwoLevel() {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f25070p1 == RefreshState.TwoLevel) {
                smartRefreshLayout.f25065n1.setState(RefreshState.TwoLevelFinish);
                if (smartRefreshLayout.f25047b == 0) {
                    moveSpinner(0, false);
                    smartRefreshLayout.g(RefreshState.None);
                    return this;
                }
                animSpinner(0).setDuration(smartRefreshLayout.f25052e);
            }
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        @NonNull
        public RefreshContent getRefreshContent() {
            return SmartRefreshLayout.this.f25062k1;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        @NonNull
        public RefreshLayout getRefreshLayout() {
            return SmartRefreshLayout.this;
        }

        /* JADX WARN: Code duplicated, block: B:46:0x0099  */
        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel moveSpinner(int i7, boolean z3) {
            OnMultiPurposeListener onMultiPurposeListener;
            RefreshHeader refreshHeader;
            OnMultiPurposeListener onMultiPurposeListener2;
            RefreshFooter refreshFooter;
            Integer numValueOf;
            RefreshFooter refreshFooter2;
            RefreshHeader refreshHeader2;
            RefreshHeader refreshHeader3;
            RefreshFooter refreshFooter3;
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f25047b != i7 || (((refreshHeader3 = smartRefreshLayout.f25059i1) != null && refreshHeader3.isSupportHorizontalDrag()) || ((refreshFooter3 = smartRefreshLayout.j1) != null && refreshFooter3.isSupportHorizontalDrag()))) {
                int i10 = smartRefreshLayout.f25047b;
                smartRefreshLayout.f25047b = i7;
                if (z3 && smartRefreshLayout.f25072q1.isDragging) {
                    if (i7 > smartRefreshLayout.f25044Y0 * smartRefreshLayout.f25056g1) {
                        if (smartRefreshLayout.f25070p1 != RefreshState.ReleaseToTwoLevel) {
                            smartRefreshLayout.f25065n1.setState(RefreshState.ReleaseToRefresh);
                        }
                    } else if ((-i7) > smartRefreshLayout.f25046a1 * smartRefreshLayout.f25057h1 && !smartRefreshLayout.f25028K0) {
                        smartRefreshLayout.f25065n1.setState(RefreshState.ReleaseToLoad);
                    } else if (i7 < 0 && !smartRefreshLayout.f25028K0) {
                        smartRefreshLayout.f25065n1.setState(RefreshState.PullUpToLoad);
                    } else if (i7 > 0) {
                        smartRefreshLayout.f25065n1.setState(RefreshState.PullDownToRefresh);
                    }
                }
                if (smartRefreshLayout.f25062k1 != null) {
                    if (i7 < 0 || (refreshHeader2 = smartRefreshLayout.f25059i1) == null) {
                        numValueOf = null;
                    } else if (smartRefreshLayout.f25086x0 || refreshHeader2.getSpinnerStyle() == SpinnerStyle.FixedBehind) {
                        numValueOf = Integer.valueOf(i7);
                    } else if (i10 < 0) {
                        numValueOf = 0;
                    } else {
                        numValueOf = null;
                    }
                    if (i7 <= 0 && (refreshFooter2 = smartRefreshLayout.j1) != null) {
                        if (smartRefreshLayout.f25088y0 || refreshFooter2.getSpinnerStyle() == SpinnerStyle.FixedBehind) {
                            numValueOf = Integer.valueOf(i7);
                        } else if (i10 > 0) {
                            numValueOf = 0;
                        }
                    }
                    if (numValueOf != null) {
                        smartRefreshLayout.f25062k1.moveSpinner(numValueOf.intValue(), smartRefreshLayout.f25024H, smartRefreshLayout.f25029L);
                        boolean z8 = (smartRefreshLayout.f25081v0 && smartRefreshLayout.f25059i1.getSpinnerStyle() == SpinnerStyle.FixedBehind) || smartRefreshLayout.f25076s1 != 0;
                        boolean z10 = (smartRefreshLayout.f25084w0 && smartRefreshLayout.j1.getSpinnerStyle() == SpinnerStyle.FixedBehind) || smartRefreshLayout.t1 != 0;
                        if ((z8 && (numValueOf.intValue() >= 0 || i10 > 0)) || (z10 && (numValueOf.intValue() <= 0 || i10 < 0))) {
                            smartRefreshLayout.invalidate();
                        }
                    }
                }
                if ((i7 >= 0 || i10 > 0) && smartRefreshLayout.f25059i1 != null) {
                    int iMax = Math.max(i7, 0);
                    int i11 = smartRefreshLayout.f25044Y0;
                    int i12 = (int) (i11 * smartRefreshLayout.f25053e1);
                    float f10 = (iMax * 1.0f) / (i11 == 0 ? 1 : i11);
                    if (smartRefreshLayout.isEnableRefresh() || (smartRefreshLayout.f25070p1 == RefreshState.RefreshFinish && !z3)) {
                        if (i10 != smartRefreshLayout.f25047b) {
                            if (smartRefreshLayout.f25059i1.getSpinnerStyle() == SpinnerStyle.Translate) {
                                smartRefreshLayout.f25059i1.getView().setTranslationY(smartRefreshLayout.f25047b);
                                if (smartRefreshLayout.f25076s1 != 0 && smartRefreshLayout.f25063l1 != null && !smartRefreshLayout.f25086x0) {
                                    smartRefreshLayout.invalidate();
                                }
                            } else if (smartRefreshLayout.f25059i1.getSpinnerStyle() == SpinnerStyle.Scale) {
                                smartRefreshLayout.f25059i1.getView().requestLayout();
                            }
                            if (!z3) {
                                smartRefreshLayout.f25059i1.onMoving(false, f10, iMax, i11, i12);
                            }
                        }
                        if (z3) {
                            if (smartRefreshLayout.f25059i1.isSupportHorizontalDrag()) {
                                int i13 = (int) smartRefreshLayout.f25066o;
                                int width = smartRefreshLayout.getWidth();
                                smartRefreshLayout.f25059i1.onHorizontalDrag(smartRefreshLayout.f25066o / (width == 0 ? 1 : width), i13, width);
                                smartRefreshLayout.f25059i1.onMoving(true, f10, iMax, i11, i12);
                            } else if (i10 != smartRefreshLayout.f25047b) {
                                smartRefreshLayout.f25059i1.onMoving(true, f10, iMax, i11, i12);
                            }
                        }
                    }
                    if (i10 != smartRefreshLayout.f25047b && (onMultiPurposeListener = smartRefreshLayout.f25038R0) != null && (refreshHeader = smartRefreshLayout.f25059i1) != null) {
                        onMultiPurposeListener.onHeaderMoving(refreshHeader, z3, f10, iMax, i11, i12);
                    }
                }
                if ((i7 <= 0 || i10 < 0) && smartRefreshLayout.j1 != null) {
                    int i14 = -Math.min(i7, 0);
                    int i15 = smartRefreshLayout.f25046a1;
                    int i16 = (int) (i15 * smartRefreshLayout.f1);
                    float f11 = (i14 * 1.0f) / (i15 == 0 ? 1 : i15);
                    if (smartRefreshLayout.isEnableLoadMore() || (smartRefreshLayout.f25070p1 == RefreshState.LoadFinish && !z3)) {
                        if (i10 != smartRefreshLayout.f25047b) {
                            if (smartRefreshLayout.j1.getSpinnerStyle() == SpinnerStyle.Translate) {
                                smartRefreshLayout.j1.getView().setTranslationY(smartRefreshLayout.f25047b);
                                if (smartRefreshLayout.t1 != 0 && smartRefreshLayout.f25063l1 != null && !smartRefreshLayout.f25088y0) {
                                    smartRefreshLayout.invalidate();
                                }
                            } else if (smartRefreshLayout.j1.getSpinnerStyle() == SpinnerStyle.Scale) {
                                smartRefreshLayout.j1.getView().requestLayout();
                            }
                            if (!z3) {
                                smartRefreshLayout.j1.onMoving(false, f11, i14, i15, i16);
                            }
                        }
                        if (z3) {
                            if (smartRefreshLayout.j1.isSupportHorizontalDrag()) {
                                int i17 = (int) smartRefreshLayout.f25066o;
                                int width2 = smartRefreshLayout.getWidth();
                                smartRefreshLayout.j1.onHorizontalDrag(smartRefreshLayout.f25066o / (width2 != 0 ? width2 : 1), i17, width2);
                                smartRefreshLayout.j1.onMoving(true, f11, i14, i15, i16);
                            } else if (i10 != smartRefreshLayout.f25047b) {
                                smartRefreshLayout.j1.onMoving(true, f11, i14, i15, i16);
                            }
                        }
                    }
                    if (i10 != smartRefreshLayout.f25047b && (onMultiPurposeListener2 = smartRefreshLayout.f25038R0) != null && (refreshFooter = smartRefreshLayout.j1) != null) {
                        onMultiPurposeListener2.onFooterMoving(refreshFooter, z3, f11, i14, i15, i16);
                    }
                }
            }
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel requestDefaultTranslationContentFor(@NonNull RefreshInternal refreshInternal, boolean z3) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            RefreshHeader refreshHeader = smartRefreshLayout.f25059i1;
            if (refreshHeader == null || refreshHeader.getView() != refreshInternal.getView()) {
                RefreshFooter refreshFooter = smartRefreshLayout.j1;
                if (refreshFooter != null && refreshFooter.getView() == refreshInternal.getView() && !smartRefreshLayout.f25034O0) {
                    smartRefreshLayout.f25034O0 = true;
                    smartRefreshLayout.f25088y0 = z3;
                }
            } else if (!smartRefreshLayout.f25033N0) {
                smartRefreshLayout.f25033N0 = true;
                smartRefreshLayout.f25086x0 = z3;
                return this;
            }
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel requestDrawBackgroundFor(RefreshInternal refreshInternal, int i7) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (smartRefreshLayout.f25063l1 == null && i7 != 0) {
                smartRefreshLayout.f25063l1 = new Paint();
            }
            RefreshHeader refreshHeader = smartRefreshLayout.f25059i1;
            if (refreshHeader != null && refreshHeader.getView() == refreshInternal.getView()) {
                smartRefreshLayout.f25076s1 = i7;
                return this;
            }
            RefreshFooter refreshFooter = smartRefreshLayout.j1;
            if (refreshFooter != null && refreshFooter.getView() == refreshInternal.getView()) {
                smartRefreshLayout.t1 = i7;
            }
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel requestFloorDuration(int i7) {
            SmartRefreshLayout.this.f25052e = i7;
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel requestNeedTouchEventFor(@NonNull RefreshInternal refreshInternal, boolean z3) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            RefreshHeader refreshHeader = smartRefreshLayout.f25059i1;
            if (refreshHeader != null && refreshHeader.getView() == refreshInternal.getView()) {
                smartRefreshLayout.f25079u1 = z3;
                return this;
            }
            RefreshFooter refreshFooter = smartRefreshLayout.j1;
            if (refreshFooter != null && refreshFooter.getView() == refreshInternal.getView()) {
                smartRefreshLayout.f25082v1 = z3;
            }
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel requestRemeasureHeightFor(@NonNull RefreshInternal refreshInternal) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            RefreshHeader refreshHeader = smartRefreshLayout.f25059i1;
            if (refreshHeader == null || refreshHeader.getView() != refreshInternal.getView()) {
                RefreshFooter refreshFooter = smartRefreshLayout.j1;
                if (refreshFooter != null && refreshFooter.getView() == refreshInternal.getView()) {
                    DimensionStatus dimensionStatus = smartRefreshLayout.f25048b1;
                    if (dimensionStatus.notified) {
                        smartRefreshLayout.f25048b1 = dimensionStatus.unNotify();
                    }
                }
            } else {
                DimensionStatus dimensionStatus2 = smartRefreshLayout.Z0;
                if (dimensionStatus2.notified) {
                    smartRefreshLayout.Z0 = dimensionStatus2.unNotify();
                    return this;
                }
            }
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel setState(@NonNull RefreshState refreshState) {
            int i7 = g.f548a[refreshState.ordinal()];
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            switch (i7) {
                case 1:
                    smartRefreshLayout.i();
                    break;
                case 2:
                    if (!smartRefreshLayout.f25070p1.isOpening && smartRefreshLayout.isEnableRefresh()) {
                        smartRefreshLayout.g(RefreshState.PullDownToRefresh);
                    } else {
                        smartRefreshLayout.setViceState(RefreshState.PullDownToRefresh);
                    }
                    break;
                case 3:
                    if (smartRefreshLayout.isEnableLoadMore()) {
                        RefreshState refreshState2 = smartRefreshLayout.f25070p1;
                        if (!refreshState2.isOpening && !refreshState2.isFinishing && (!smartRefreshLayout.f25028K0 || !smartRefreshLayout.f25090z0)) {
                            smartRefreshLayout.g(RefreshState.PullUpToLoad);
                        }
                    }
                    smartRefreshLayout.setViceState(RefreshState.PullUpToLoad);
                    break;
                case 4:
                    if (!smartRefreshLayout.f25070p1.isOpening && smartRefreshLayout.isEnableRefresh()) {
                        smartRefreshLayout.g(RefreshState.PullDownCanceled);
                        smartRefreshLayout.i();
                    } else {
                        smartRefreshLayout.setViceState(RefreshState.PullDownCanceled);
                    }
                    break;
                case 5:
                    if (!smartRefreshLayout.isEnableLoadMore() || smartRefreshLayout.f25070p1.isOpening || (smartRefreshLayout.f25028K0 && smartRefreshLayout.f25090z0)) {
                        smartRefreshLayout.setViceState(RefreshState.PullUpCanceled);
                    } else {
                        smartRefreshLayout.g(RefreshState.PullUpCanceled);
                        smartRefreshLayout.i();
                    }
                    break;
                case 6:
                    if (!smartRefreshLayout.f25070p1.isOpening && smartRefreshLayout.isEnableRefresh()) {
                        smartRefreshLayout.g(RefreshState.ReleaseToRefresh);
                    } else {
                        smartRefreshLayout.setViceState(RefreshState.ReleaseToRefresh);
                    }
                    break;
                case 7:
                    if (smartRefreshLayout.isEnableLoadMore()) {
                        RefreshState refreshState3 = smartRefreshLayout.f25070p1;
                        if (!refreshState3.isOpening && !refreshState3.isFinishing && (!smartRefreshLayout.f25028K0 || !smartRefreshLayout.f25090z0)) {
                            smartRefreshLayout.g(RefreshState.ReleaseToLoad);
                        }
                    }
                    smartRefreshLayout.setViceState(RefreshState.ReleaseToLoad);
                    break;
                case 8:
                    if (!smartRefreshLayout.f25070p1.isOpening && smartRefreshLayout.isEnableRefresh()) {
                        smartRefreshLayout.g(RefreshState.ReleaseToTwoLevel);
                    } else {
                        smartRefreshLayout.setViceState(RefreshState.ReleaseToTwoLevel);
                    }
                    break;
                case 9:
                    if (!smartRefreshLayout.f25070p1.isOpening && smartRefreshLayout.isEnableRefresh()) {
                        smartRefreshLayout.g(RefreshState.RefreshReleased);
                    } else {
                        smartRefreshLayout.setViceState(RefreshState.RefreshReleased);
                    }
                    break;
                case 10:
                    if (!smartRefreshLayout.f25070p1.isOpening && smartRefreshLayout.isEnableLoadMore()) {
                        smartRefreshLayout.g(RefreshState.LoadReleased);
                    } else {
                        smartRefreshLayout.setViceState(RefreshState.LoadReleased);
                    }
                    break;
                case 11:
                    smartRefreshLayout.l();
                    break;
                case 12:
                    smartRefreshLayout.k();
                    break;
                case 13:
                    if (smartRefreshLayout.f25070p1 == RefreshState.Refreshing) {
                        smartRefreshLayout.g(RefreshState.RefreshFinish);
                    }
                    break;
                case 14:
                    if (smartRefreshLayout.f25070p1 == RefreshState.Loading) {
                        smartRefreshLayout.g(RefreshState.LoadFinish);
                    }
                    break;
                case 15:
                    smartRefreshLayout.g(RefreshState.TwoLevelReleased);
                    break;
                case 16:
                    smartRefreshLayout.g(RefreshState.TwoLevelFinish);
                    break;
                case 17:
                    smartRefreshLayout.g(RefreshState.TwoLevel);
                    break;
            }
            return null;
        }

        @Override // com.scwang.smartrefresh.layout.api.RefreshKernel
        public RefreshKernel startTwoLevel(boolean z3) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            if (!z3) {
                if (animSpinner(0) == null) {
                    smartRefreshLayout.g(RefreshState.None);
                }
                return this;
            }
            a aVar = new a(this);
            ValueAnimator valueAnimatorAnimSpinner = animSpinner(smartRefreshLayout.getMeasuredHeight());
            if (valueAnimatorAnimSpinner == null || valueAnimatorAnimSpinner != smartRefreshLayout.f25015A1) {
                aVar.onAnimationEnd(null);
                return this;
            }
            valueAnimatorAnimSpinner.setDuration(smartRefreshLayout.f25052e);
            valueAnimatorAnimSpinner.addListener(aVar);
            return this;
        }
    }

    public SmartRefreshLayout(Context context) {
        this(context, null);
    }

    public static void setDefaultRefreshFooterCreator(@NonNull DefaultRefreshFooterCreator defaultRefreshFooterCreator) {
        f25011B1 = defaultRefreshFooterCreator;
    }

    public static void setDefaultRefreshHeaderCreator(@NonNull DefaultRefreshHeaderCreator defaultRefreshHeaderCreator) {
        f25012C1 = defaultRefreshHeaderCreator;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public boolean autoLoadMore() {
        int i7 = this.f25054f;
        int i10 = this.f25046a1;
        float f10 = ((this.f1 / 2.0f) + 0.5f) * i10 * 1.0f;
        if (i10 == 0) {
            i10 = 1;
        }
        return autoLoadMore(0, i7, f10 / i10);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public boolean autoRefresh() {
        int i7 = this.f25064m1 == null ? 400 : 0;
        int i10 = this.f25054f;
        float f10 = (this.f25053e1 / 2.0f) + 0.5f;
        int i11 = this.f25044Y0;
        float f11 = f10 * i11 * 1.0f;
        if (i11 == 0) {
            i11 = 1;
        }
        return autoRefresh(i7, i10, f11 / i11);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i7) {
        View scrollableView = this.f25062k1.getScrollableView();
        if (i7 < 0) {
            return this.f25019C0 || isEnableRefresh() || ScrollBoundaryUtil.canScrollUp(scrollableView);
        }
        return i7 <= 0 || this.f25019C0 || isEnableLoadMore() || ScrollBoundaryUtil.canScrollDown(scrollableView);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public void computeScroll() {
        RefreshState refreshState;
        Scroller scroller = this.f25069p0;
        scroller.getCurrY();
        if (scroller.computeScrollOffset()) {
            int finalY = scroller.getFinalY();
            if ((finalY >= 0 || !((this.f25019C0 || isEnableRefresh()) && this.f25062k1.canRefresh())) && (finalY <= 0 || !((this.f25019C0 || isEnableLoadMore()) && this.f25062k1.canLoadMore()))) {
                this.f25087x1 = true;
                invalidate();
                return;
            }
            if (this.f25087x1) {
                float currVelocity = finalY > 0 ? -scroller.getCurrVelocity() : scroller.getCurrVelocity();
                if (this.f25015A1 == null) {
                    if (currVelocity > 0.0f && ((refreshState = this.f25070p1) == RefreshState.Refreshing || refreshState == RefreshState.TwoLevel)) {
                        this.f25091z1 = new BounceRunnable(currVelocity, this.f25044Y0);
                    } else if (currVelocity < 0.0f && (this.f25070p1 == RefreshState.Loading || ((this.f25090z0 && this.f25028K0 && isEnableLoadMore()) || (this.f25020D0 && !this.f25028K0 && isEnableLoadMore() && this.f25070p1 != RefreshState.Refreshing)))) {
                        this.f25091z1 = new BounceRunnable(currVelocity, -this.f25046a1);
                    } else if (this.f25047b == 0 && this.f25017B0) {
                        this.f25091z1 = new BounceRunnable(currVelocity, 0);
                    }
                }
            }
            scroller.forceFinished(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0131 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0133  */
    /* JADX WARN: Code duplicated, block: B:111:0x0136 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x013a  */
    /* JADX WARN: Code duplicated, block: B:114:0x013d  */
    /* JADX WARN: Code duplicated, block: B:116:0x014d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0159  */
    /* JADX WARN: Code duplicated, block: B:124:0x0162  */
    /* JADX WARN: Code duplicated, block: B:129:0x0177  */
    /* JADX WARN: Code duplicated, block: B:134:0x018b  */
    /* JADX WARN: Code duplicated, block: B:136:0x0191  */
    /* JADX WARN: Code duplicated, block: B:145:0x01af  */
    /* JADX WARN: Code duplicated, block: B:147:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:162:0x01db  */
    /* JADX WARN: Code duplicated, block: B:164:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:167:0x01ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:172:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:176:0x020a  */
    /* JADX WARN: Code duplicated, block: B:178:0x0214 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:181:0x021a  */
    /* JADX WARN: Code duplicated, block: B:188:0x022e  */
    /* JADX WARN: Code duplicated, block: B:191:0x025f  */
    /* JADX WARN: Code duplicated, block: B:197:0x026c  */
    /* JADX WARN: Code duplicated, block: B:204:0x028a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:205:0x028c  */
    /* JADX WARN: Code duplicated, block: B:212:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:215:0x02b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:216:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:221:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:225:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:229:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:231:0x02db  */
    /* JADX WARN: Code duplicated, block: B:236:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:239:0x0308  */
    /* JADX WARN: Code duplicated, block: B:242:0x0326  */
    /* JADX WARN: Code duplicated, block: B:246:0x032e  */
    /* JADX WARN: Code duplicated, block: B:248:0x0350  */
    /* JADX WARN: Code duplicated, block: B:254:0x0366  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:92:0x010d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0113  */
    /* JADX WARN: Code duplicated, block: B:97:0x0119  */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00dc, code lost:
    
        if (r4.isFooter != false) goto L257;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:236:0x02e7, please report this as an issue */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instruction units count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scwang.smartrefresh.layout.SmartRefreshLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j6) {
        Paint paint;
        Paint paint2;
        RefreshContentWrapper refreshContentWrapper = this.f25062k1;
        View view2 = refreshContentWrapper != null ? refreshContentWrapper.getView() : null;
        RefreshHeader refreshHeader = this.f25059i1;
        boolean z3 = this.f25014A0;
        if (refreshHeader != null && refreshHeader.getView() == view) {
            if (!isEnableRefresh()) {
                return true;
            }
            if (!z3 && isInEditMode()) {
                return true;
            }
            if (view2 != null) {
                int iMax = Math.max(view2.getPaddingTop() + view2.getTop() + this.f25047b, view.getTop());
                int i7 = this.f25076s1;
                if (i7 != 0 && (paint2 = this.f25063l1) != null) {
                    paint2.setColor(i7);
                    if (this.f25059i1.getSpinnerStyle() == SpinnerStyle.Scale) {
                        iMax = view.getBottom();
                    } else if (this.f25059i1.getSpinnerStyle() == SpinnerStyle.Translate) {
                        iMax = view.getBottom() + this.f25047b;
                    }
                    int i10 = iMax;
                    canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), i10, this.f25063l1);
                    iMax = i10;
                }
                if (this.f25081v0 && this.f25059i1.getSpinnerStyle() == SpinnerStyle.FixedBehind) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), iMax);
                    boolean zDrawChild = super.drawChild(canvas, view, j6);
                    canvas.restore();
                    return zDrawChild;
                }
            }
        }
        RefreshFooter refreshFooter = this.j1;
        if (refreshFooter != null && refreshFooter.getView() == view) {
            if (!isEnableLoadMore()) {
                return true;
            }
            if (!z3 && isInEditMode()) {
                return true;
            }
            if (view2 != null) {
                int iMin = Math.min((view2.getBottom() - view2.getPaddingBottom()) + this.f25047b, view.getBottom());
                int i11 = this.t1;
                if (i11 != 0 && (paint = this.f25063l1) != null) {
                    paint.setColor(i11);
                    if (this.j1.getSpinnerStyle() == SpinnerStyle.Scale) {
                        iMin = view.getTop();
                    } else if (this.j1.getSpinnerStyle() == SpinnerStyle.Translate) {
                        iMin = view.getTop() + this.f25047b;
                    }
                    int i12 = iMin;
                    canvas.drawRect(view.getLeft(), i12, view.getRight(), view.getBottom(), this.f25063l1);
                    iMin = i12;
                }
                if (this.f25084w0 && this.j1.getSpinnerStyle() == SpinnerStyle.FixedBehind) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), iMin, view.getRight(), view.getBottom());
                    boolean zDrawChild2 = super.drawChild(canvas, view, j6);
                    canvas.restore();
                    return zDrawChild2;
                }
            }
        }
        return super.drawChild(canvas, view, j6);
    }

    public final ValueAnimator e(int i7, int i10, Interpolator interpolator, int i11) {
        if (this.f25047b == i7) {
            return null;
        }
        ValueAnimator valueAnimator = this.f25015A1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f25091z1 = null;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f25047b, i7);
        this.f25015A1 = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(i11);
        this.f25015A1.setInterpolator(interpolator);
        this.f25015A1.addListener(new m(this));
        this.f25015A1.addUpdateListener(new n(this));
        this.f25015A1.setStartDelay(i10);
        this.f25015A1.start();
        return this.f25015A1;
    }

    public final void f(float f10) {
        RefreshState refreshState;
        RefreshState refreshState2 = this.f25070p1;
        RefreshState refreshState3 = RefreshState.TwoLevel;
        RefreshKernelImpl refreshKernelImpl = this.f25065n1;
        if (refreshState2 != refreshState3 || f10 <= 0.0f) {
            RefreshState refreshState4 = RefreshState.Refreshing;
            int i7 = this.f25055g;
            if (refreshState2 == refreshState4 && f10 >= 0.0f) {
                float f11 = this.f25044Y0;
                if (f10 < f11) {
                    refreshKernelImpl.moveSpinner((int) f10, true);
                } else {
                    double d2 = (this.f25053e1 - 1.0f) * f11;
                    int iMax = Math.max((i7 * 4) / 3, getHeight());
                    int i10 = this.f25044Y0;
                    double d10 = iMax - i10;
                    double dMax = Math.max(0.0f, (f10 - i10) * this.t);
                    double d11 = -dMax;
                    if (d10 == 0.0d) {
                        d10 = 1.0d;
                    }
                    refreshKernelImpl.moveSpinner(((int) Math.min((1.0d - Math.pow(100.0d, d11 / d10)) * d2, dMax)) + this.f25044Y0, true);
                }
            } else if (f10 < 0.0f && (refreshState2 == RefreshState.Loading || ((this.f25090z0 && this.f25028K0 && isEnableLoadMore()) || (this.f25020D0 && !this.f25028K0 && isEnableLoadMore())))) {
                int i11 = this.f25046a1;
                if (f10 > (-i11)) {
                    refreshKernelImpl.moveSpinner((int) f10, true);
                } else {
                    double d12 = (this.f1 - 1.0f) * i11;
                    int iMax2 = Math.max((i7 * 4) / 3, getHeight());
                    int i12 = this.f25046a1;
                    double d13 = iMax2 - i12;
                    double d14 = -Math.min(0.0f, (i12 + f10) * this.t);
                    double d15 = -d14;
                    if (d13 == 0.0d) {
                        d13 = 1.0d;
                    }
                    refreshKernelImpl.moveSpinner(((int) (-Math.min((1.0d - Math.pow(100.0d, d15 / d13)) * d12, d14))) - this.f25046a1, true);
                }
            } else if (f10 >= 0.0f) {
                double d16 = this.f25053e1 * this.f25044Y0;
                double dMax2 = Math.max(i7 / 2, getHeight());
                double dMax3 = Math.max(0.0f, this.t * f10);
                double d17 = -dMax3;
                if (dMax2 == 0.0d) {
                    dMax2 = 1.0d;
                }
                refreshKernelImpl.moveSpinner((int) Math.min((1.0d - Math.pow(100.0d, d17 / dMax2)) * d16, dMax3), true);
            } else {
                double d18 = this.f1 * this.f25046a1;
                double dMax4 = Math.max(i7 / 2, getHeight());
                double d19 = -Math.min(0.0f, this.t * f10);
                double d20 = -d19;
                if (dMax4 == 0.0d) {
                    dMax4 = 1.0d;
                }
                refreshKernelImpl.moveSpinner((int) (-Math.min((1.0d - Math.pow(100.0d, d20 / dMax4)) * d18, d19)), true);
            }
        } else {
            refreshKernelImpl.moveSpinner(Math.min((int) f10, getMeasuredHeight()), true);
        }
        if (!this.f25020D0 || this.f25028K0 || !isEnableLoadMore() || f10 >= 0.0f || (refreshState = this.f25070p1) == RefreshState.Refreshing || refreshState == RefreshState.Loading || refreshState == RefreshState.LoadFinish) {
            return;
        }
        j();
        if (this.f25027J0) {
            this.f25091z1 = null;
            refreshKernelImpl.animSpinner(-this.f25046a1);
        }
    }

    public final void g(RefreshState refreshState) {
        RefreshState refreshState2 = this.f25070p1;
        if (refreshState2 != refreshState) {
            this.f25070p1 = refreshState;
            this.f25072q1 = refreshState;
            RefreshHeader refreshHeader = this.f25059i1;
            RefreshFooter refreshFooter = this.j1;
            OnMultiPurposeListener onMultiPurposeListener = this.f25038R0;
            if (refreshHeader != null) {
                refreshHeader.onStateChanged(this, refreshState2, refreshState);
            }
            if (refreshFooter != null) {
                refreshFooter.onStateChanged(this, refreshState2, refreshState);
            }
            if (onMultiPurposeListener != null) {
                onMultiPurposeListener.onStateChanged(this, refreshState2, refreshState);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout getLayout() {
        return this;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f25043X0.a();
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    @Nullable
    public RefreshFooter getRefreshFooter() {
        RefreshFooter refreshFooter = this.j1;
        if (refreshFooter != null) {
            return refreshFooter;
        }
        return null;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    @Nullable
    public RefreshHeader getRefreshHeader() {
        RefreshHeader refreshHeader = this.f25059i1;
        if (refreshHeader != null) {
            return refreshHeader;
        }
        return null;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshState getState() {
        return this.f25070p1;
    }

    public final void h() {
        RefreshState refreshState = this.f25070p1;
        RefreshState refreshState2 = RefreshState.TwoLevel;
        RefreshKernelImpl refreshKernelImpl = this.f25065n1;
        if (refreshState == refreshState2) {
            if (this.f25061k0 <= -1000 || this.f25047b <= getMeasuredHeight() / 2) {
                if (this.f25083w) {
                    refreshKernelImpl.finishTwoLevel();
                    return;
                }
                return;
            } else {
                ValueAnimator valueAnimatorAnimSpinner = refreshKernelImpl.animSpinner(getMeasuredHeight());
                if (valueAnimatorAnimSpinner != null) {
                    valueAnimatorAnimSpinner.setDuration(this.f25052e);
                    return;
                }
                return;
            }
        }
        if (refreshState == RefreshState.Loading || (this.f25090z0 && this.f25028K0 && this.f25047b < 0 && isEnableLoadMore())) {
            int i7 = this.f25047b;
            int i10 = -this.f25046a1;
            if (i7 < i10) {
                refreshKernelImpl.animSpinner(i10);
                return;
            } else {
                if (i7 > 0) {
                    refreshKernelImpl.animSpinner(0);
                    return;
                }
                return;
            }
        }
        RefreshState refreshState3 = this.f25070p1;
        if (refreshState3 == RefreshState.Refreshing) {
            int i11 = this.f25047b;
            int i12 = this.f25044Y0;
            if (i11 > i12) {
                refreshKernelImpl.animSpinner(i12);
                return;
            } else {
                if (i11 < 0) {
                    refreshKernelImpl.animSpinner(0);
                    return;
                }
                return;
            }
        }
        if (refreshState3 == RefreshState.PullDownToRefresh) {
            refreshKernelImpl.setState(RefreshState.PullDownCanceled);
            return;
        }
        if (refreshState3 == RefreshState.PullUpToLoad) {
            refreshKernelImpl.setState(RefreshState.PullUpCanceled);
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToRefresh) {
            l();
            return;
        }
        if (refreshState3 == RefreshState.ReleaseToLoad) {
            k();
        } else if (refreshState3 == RefreshState.ReleaseToTwoLevel) {
            refreshKernelImpl.setState(RefreshState.TwoLevelReleased);
        } else if (this.f25047b != 0) {
            refreshKernelImpl.animSpinner(0);
        }
    }

    public final void i() {
        RefreshState refreshState = this.f25070p1;
        RefreshState refreshState2 = RefreshState.None;
        if (refreshState != refreshState2 && this.f25047b == 0) {
            g(refreshState2);
        }
        if (this.f25047b != 0) {
            this.f25065n1.animSpinner(0);
        }
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public boolean isEnableLoadMore() {
        return this.f25078u0 && !this.f25021E0;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public boolean isEnableRefresh() {
        return this.f25077t0 && !this.f25021E0;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.f25042W0.f16281d;
    }

    public final void j() {
        RefreshState refreshState = this.f25070p1;
        RefreshState refreshState2 = RefreshState.Loading;
        if (refreshState != refreshState2) {
            this.f25074r1 = System.currentTimeMillis();
            this.f25085w1 = true;
            g(refreshState2);
            OnLoadMoreListener onLoadMoreListener = this.f25037Q0;
            if (onLoadMoreListener != null) {
                onLoadMoreListener.onLoadMore(this);
            } else if (this.f25038R0 == null) {
                finishLoadMore(Constants.MAX_URL_LENGTH);
            }
            RefreshFooter refreshFooter = this.j1;
            if (refreshFooter != null) {
                int i7 = this.f25046a1;
                refreshFooter.onStartAnimator(this, i7, (int) (this.f1 * i7));
            }
            OnMultiPurposeListener onMultiPurposeListener = this.f25038R0;
            if (onMultiPurposeListener == null || this.j1 == null) {
                return;
            }
            onMultiPurposeListener.onLoadMore(this);
            OnMultiPurposeListener onMultiPurposeListener2 = this.f25038R0;
            RefreshFooter refreshFooter2 = this.j1;
            int i10 = this.f25046a1;
            onMultiPurposeListener2.onFooterStartAnimator(refreshFooter2, i10, (int) (this.f1 * i10));
        }
    }

    public final void k() {
        RefreshFooter refreshFooter;
        k kVar = new k(this);
        g(RefreshState.LoadReleased);
        ValueAnimator valueAnimatorAnimSpinner = this.f25065n1.animSpinner(-this.f25046a1);
        if (valueAnimatorAnimSpinner != null) {
            valueAnimatorAnimSpinner.addListener(kVar);
        }
        RefreshFooter refreshFooter2 = this.j1;
        if (refreshFooter2 != null) {
            int i7 = this.f25046a1;
            refreshFooter2.onReleased(this, i7, (int) (this.f1 * i7));
        }
        OnMultiPurposeListener onMultiPurposeListener = this.f25038R0;
        if (onMultiPurposeListener != null && (refreshFooter = this.j1) != null) {
            int i10 = this.f25046a1;
            onMultiPurposeListener.onFooterReleased(refreshFooter, i10, (int) (this.f1 * i10));
        }
        if (valueAnimatorAnimSpinner == null) {
            kVar.onAnimationEnd(null);
        }
    }

    public final void l() {
        RefreshHeader refreshHeader;
        l lVar = new l(this);
        g(RefreshState.RefreshReleased);
        ValueAnimator valueAnimatorAnimSpinner = this.f25065n1.animSpinner(this.f25044Y0);
        if (valueAnimatorAnimSpinner != null) {
            valueAnimatorAnimSpinner.addListener(lVar);
        }
        RefreshHeader refreshHeader2 = this.f25059i1;
        if (refreshHeader2 != null) {
            int i7 = this.f25044Y0;
            refreshHeader2.onReleased(this, i7, (int) (this.f25053e1 * i7));
        }
        OnMultiPurposeListener onMultiPurposeListener = this.f25038R0;
        if (onMultiPurposeListener != null && (refreshHeader = this.f25059i1) != null) {
            int i10 = this.f25044Y0;
            onMultiPurposeListener.onHeaderReleased(refreshHeader, i10, (int) (this.f25053e1 * i10));
        }
        if (valueAnimatorAnimSpinner == null) {
            lVar.onAnimationEnd(null);
        }
    }

    public final boolean m(Float f10) {
        float fFloatValue = f10 == null ? this.f25061k0 : f10.floatValue();
        if (Math.abs(fFloatValue) > this.f25031M) {
            int i7 = this.f25047b;
            float f11 = i7;
            if (fFloatValue * f11 < 0.0f) {
                RefreshState refreshState = this.f25070p1;
                if (refreshState.isOpening) {
                    if (refreshState != RefreshState.TwoLevel && refreshState != this.f25072q1) {
                        this.f25091z1 = new FlingRunnable(fFloatValue).start();
                        return true;
                    }
                } else if (f11 > this.f25044Y0 * this.f25056g1 || (-i7) > this.f25046a1 * this.f25057h1) {
                    return true;
                }
            }
            if ((fFloatValue < 0.0f && ((this.f25017B0 && (this.f25019C0 || isEnableLoadMore())) || ((this.f25070p1 == RefreshState.Loading && this.f25047b >= 0) || (this.f25020D0 && isEnableLoadMore())))) || (fFloatValue > 0.0f && ((this.f25017B0 && (this.f25019C0 || isEnableRefresh())) || (this.f25070p1 == RefreshState.Refreshing && this.f25047b <= 0)))) {
                this.f25087x1 = false;
                Scroller scroller = this.f25069p0;
                scroller.fling(0, 0, 0, (int) (-fFloatValue), 0, 0, -2147483647, Integer.MAX_VALUE);
                scroller.computeScrollOffset();
                invalidate();
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        RefreshFooter refreshFooter;
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            if (this.f25064m1 == null) {
                this.f25064m1 = new Handler();
            }
            List<DelayedRunnable> list = this.f25067o1;
            if (list != null) {
                for (DelayedRunnable delayedRunnable : list) {
                    this.f25064m1.postDelayed(delayedRunnable, delayedRunnable.delayMillis);
                }
                this.f25067o1.clear();
                this.f25067o1 = null;
            }
            if (this.f25059i1 == null) {
                setRefreshHeader(f25012C1.createRefreshHeader(getContext(), this));
            }
            if (this.j1 == null) {
                setRefreshFooter(f25011B1.createRefreshFooter(getContext(), this));
            } else {
                this.f25078u0 = this.f25078u0 || !this.f25030L0;
            }
            if (this.f25062k1 == null) {
                int childCount = getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = getChildAt(i7);
                    RefreshHeader refreshHeader = this.f25059i1;
                    if ((refreshHeader == null || childAt != refreshHeader.getView()) && ((refreshFooter = this.j1) == null || childAt != refreshFooter.getView())) {
                        this.f25062k1 = new RefreshContentWrapper(childAt);
                    }
                }
            }
            if (this.f25062k1 == null) {
                int iDp2px = DensityUtil.dp2px(20.0f);
                TextView textView = new TextView(getContext());
                textView.setTextColor(-39424);
                textView.setGravity(17);
                textView.setTextSize(20.0f);
                textView.setText(R.string.srl_content_empty);
                super.addView(textView, -1, -1);
                RefreshContentWrapper refreshContentWrapper = new RefreshContentWrapper(textView);
                this.f25062k1 = refreshContentWrapper;
                refreshContentWrapper.getView().setPadding(iDp2px, iDp2px, iDp2px, iDp2px);
            }
            int i10 = this.f25016B;
            View viewFindViewById = i10 > 0 ? findViewById(i10) : null;
            int i11 = this.f25018C;
            View viewFindViewById2 = i11 > 0 ? findViewById(i11) : null;
            this.f25062k1.setScrollBoundaryDecider(this.f25039S0);
            this.f25062k1.setEnableLoadMoreWhenContentNotFull(this.f25025H0);
            this.f25062k1.setUpComponent(this.f25065n1, viewFindViewById, viewFindViewById2);
            if (this.f25047b != 0) {
                g(RefreshState.None);
                RefreshContentWrapper refreshContentWrapper2 = this.f25062k1;
                this.f25047b = 0;
                refreshContentWrapper2.moveSpinner(0, this.f25024H, this.f25029L);
            }
            if (!this.f25032M0 && !isNestedScrollingEnabled()) {
                post(new j(this));
            }
        }
        int[] iArr = this.f25075s0;
        if (iArr != null) {
            RefreshHeader refreshHeader2 = this.f25059i1;
            if (refreshHeader2 != null) {
                refreshHeader2.setPrimaryColors(iArr);
            }
            RefreshFooter refreshFooter2 = this.j1;
            if (refreshFooter2 != null) {
                refreshFooter2.setPrimaryColors(this.f25075s0);
            }
        }
        RefreshContentWrapper refreshContentWrapper3 = this.f25062k1;
        if (refreshContentWrapper3 != null) {
            super.bringChildToFront(refreshContentWrapper3.getView());
        }
        RefreshHeader refreshHeader3 = this.f25059i1;
        if (refreshHeader3 != null && refreshHeader3.getSpinnerStyle() != SpinnerStyle.FixedBehind) {
            super.bringChildToFront(this.f25059i1.getView());
        }
        RefreshFooter refreshFooter3 = this.j1;
        if (refreshFooter3 == null || refreshFooter3.getSpinnerStyle() == SpinnerStyle.FixedBehind) {
            return;
        }
        super.bringChildToFront(this.j1.getView());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25065n1.moveSpinner(0, true);
        g(RefreshState.None);
        this.f25064m1.removeCallbacksAndMessages(null);
        this.f25064m1 = null;
        this.f25030L0 = true;
        this.f25032M0 = true;
        this.f25091z1 = null;
        ValueAnimator valueAnimator = this.f25015A1;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f25015A1.removeAllUpdateListeners();
            this.f25015A1.cancel();
            this.f25015A1 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onFinishInflate() {
        int i7;
        int i10;
        super.onFinishInflate();
        int childCount = super.getChildCount();
        if (childCount > 3) {
            throw new RuntimeException("最多只支持3个子View，Most only support three sub view");
        }
        int i11 = -1;
        int i12 = 0;
        char c6 = 0;
        while (true) {
            if (i12 >= childCount) {
                break;
            }
            View childAt = super.getChildAt(i12);
            if (SmartUtil.isScrollableView(childAt) && (c6 < 2 || i12 == 1)) {
                i11 = i12;
                c6 = 2;
            } else if (!(childAt instanceof RefreshInternal) && c6 < 1) {
                c6 = i12 > 0 ? (char) 1 : (char) 0;
                i11 = i12;
            }
            i12++;
        }
        if (i11 >= 0) {
            this.f25062k1 = new RefreshContentWrapper(super.getChildAt(i11));
            if (i11 == 1) {
                i10 = childCount != 3 ? -1 : 2;
                i7 = 0;
            } else if (childCount == 2) {
                i7 = -1;
                i10 = 1;
            } else {
                i7 = -1;
                i10 = -1;
            }
        } else {
            i7 = -1;
            i10 = -1;
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = super.getChildAt(i13);
            if (i13 == i7 || (i13 != i10 && i7 == -1 && this.f25059i1 == null && (childAt2 instanceof RefreshHeader))) {
                this.f25059i1 = childAt2 instanceof RefreshHeader ? (RefreshHeader) childAt2 : new RefreshHeaderWrapper(childAt2);
            } else if (i13 == i10 || (i10 == -1 && (childAt2 instanceof RefreshFooter))) {
                this.f25078u0 = this.f25078u0 || !this.f25030L0;
                this.j1 = childAt2 instanceof RefreshFooter ? (RefreshFooter) childAt2 : new RefreshFooterWrapper(childAt2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        int iMax;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        int childCount = super.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = super.getChildAt(i13);
            RefreshContentWrapper refreshContentWrapper = this.f25062k1;
            boolean z8 = this.f25014A0;
            if (refreshContentWrapper != null && refreshContentWrapper.getView() == childAt) {
                boolean z10 = isInEditMode() && z8 && isEnableRefresh() && this.f25059i1 != null;
                View view = this.f25062k1.getView();
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                int i14 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i15 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                int measuredWidth = view.getMeasuredWidth() + i14;
                int measuredHeight = view.getMeasuredHeight() + i15;
                if (z10 && (this.f25086x0 || this.f25059i1.getSpinnerStyle() == SpinnerStyle.FixedBehind)) {
                    int i16 = this.f25044Y0;
                    i15 += i16;
                    measuredHeight += i16;
                }
                view.layout(i14, i15, measuredWidth, measuredHeight);
            }
            RefreshHeader refreshHeader = this.f25059i1;
            if (refreshHeader != null && refreshHeader.getView() == childAt) {
                boolean z11 = isInEditMode() && z8 && isEnableRefresh();
                View view2 = this.f25059i1.getView();
                LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
                int i17 = ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                int i18 = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + this.f25050c1;
                int measuredWidth2 = view2.getMeasuredWidth() + i17;
                int measuredHeight2 = view2.getMeasuredHeight() + i18;
                if (!z11 && this.f25059i1.getSpinnerStyle() == SpinnerStyle.Translate) {
                    int i19 = this.f25044Y0;
                    i18 -= i19;
                    measuredHeight2 -= i19;
                }
                view2.layout(i17, i18, measuredWidth2, measuredHeight2);
            }
            RefreshFooter refreshFooter = this.j1;
            if (refreshFooter != null && refreshFooter.getView() == childAt) {
                boolean z12 = isInEditMode() && z8 && isEnableLoadMore();
                View view3 = this.j1.getView();
                LayoutParams layoutParams3 = (LayoutParams) view3.getLayoutParams();
                SpinnerStyle spinnerStyle = this.j1.getSpinnerStyle();
                int i20 = ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin;
                int measuredHeight3 = (getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin) - this.d1;
                if (z12 || spinnerStyle == SpinnerStyle.FixedFront || spinnerStyle == SpinnerStyle.FixedBehind) {
                    iMax = this.f25046a1;
                } else {
                    if (spinnerStyle == SpinnerStyle.Scale && this.f25047b < 0) {
                        iMax = Math.max(isEnableLoadMore() ? -this.f25047b : 0, 0);
                    }
                    view3.layout(i20, measuredHeight3, view3.getMeasuredWidth() + i20, view3.getMeasuredHeight() + measuredHeight3);
                }
                measuredHeight3 -= iMax;
                view3.layout(i20, measuredHeight3, view3.getMeasuredWidth() + i20, view3.getMeasuredHeight() + measuredHeight3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x011b  */
    /* JADX WARN: Code duplicated, block: B:93:0x028e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0290  */
    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        RefreshFooter refreshFooter;
        RefreshHeader refreshHeader;
        int measuredHeight;
        int measuredHeight2;
        boolean z3 = isInEditMode() && this.f25014A0;
        int childCount = super.getChildCount();
        int measuredHeight3 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = super.getChildAt(i11);
            RefreshHeader refreshHeader2 = this.f25059i1;
            RefreshKernelImpl refreshKernelImpl = this.f25065n1;
            if (refreshHeader2 != null && refreshHeader2.getView() == childAt) {
                View view = this.f25059i1.getView();
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width);
                if (this.Z0.gteReplaceWith(DimensionStatus.XmlLayoutUnNotify)) {
                    view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max((this.f25044Y0 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, 0), 1073741824));
                } else if (this.f25059i1.getSpinnerStyle() == SpinnerStyle.MatchLayout) {
                    if (this.Z0.notified) {
                        measuredHeight2 = 0;
                    } else {
                        super.measureChild(view, childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max((View.MeasureSpec.getSize(i10) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, 0), Integer.MIN_VALUE));
                        measuredHeight2 = view.getMeasuredHeight();
                    }
                    view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max((View.MeasureSpec.getSize(i10) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, 0), 1073741824));
                    if (measuredHeight2 > 0 && measuredHeight2 != view.getMeasuredHeight()) {
                        this.f25044Y0 = measuredHeight2 + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    }
                } else {
                    int i12 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                    if (i12 > 0) {
                        DimensionStatus dimensionStatus = this.Z0;
                        DimensionStatus dimensionStatus2 = DimensionStatus.XmlExactUnNotify;
                        if (dimensionStatus.canReplaceWith(dimensionStatus2)) {
                            this.f25044Y0 = ((ViewGroup.MarginLayoutParams) layoutParams).height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                            this.Z0 = dimensionStatus2;
                        }
                        view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(((ViewGroup.MarginLayoutParams) layoutParams).height, 1073741824));
                    } else if (i12 == -2) {
                        view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max((View.MeasureSpec.getSize(i10) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, 0), Integer.MIN_VALUE));
                        int measuredHeight4 = view.getMeasuredHeight();
                        if (measuredHeight4 > 0) {
                            DimensionStatus dimensionStatus3 = this.Z0;
                            DimensionStatus dimensionStatus4 = DimensionStatus.XmlWrapUnNotify;
                            if (dimensionStatus3.canReplaceWith(dimensionStatus4)) {
                                this.Z0 = dimensionStatus4;
                                this.f25044Y0 = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                            } else if (measuredHeight4 <= 0) {
                                view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max((this.f25044Y0 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, 0), 1073741824));
                            }
                        } else if (measuredHeight4 <= 0) {
                            view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max((this.f25044Y0 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, 0), 1073741824));
                        }
                    } else if (i12 == -1) {
                        view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max((this.f25044Y0 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, 0), 1073741824));
                    } else {
                        view.measure(childMeasureSpec, i10);
                    }
                }
                if (this.f25059i1.getSpinnerStyle() == SpinnerStyle.Scale && !z3) {
                    view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max((Math.max(0, isEnableRefresh() ? this.f25047b : 0) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, 0), 1073741824));
                }
                DimensionStatus dimensionStatus5 = this.Z0;
                if (!dimensionStatus5.notified) {
                    this.Z0 = dimensionStatus5.notified();
                    RefreshHeader refreshHeader3 = this.f25059i1;
                    int i13 = this.f25044Y0;
                    refreshHeader3.onInitialized(refreshKernelImpl, i13, (int) (this.f25053e1 * i13));
                }
                if (z3 && isEnableRefresh()) {
                    measuredHeight3 += view.getMeasuredHeight();
                }
            }
            RefreshFooter refreshFooter2 = this.j1;
            if (refreshFooter2 != null && refreshFooter2.getView() == childAt) {
                View view2 = this.j1.getView();
                LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
                int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i7, ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).width);
                if (this.f25048b1.gteReplaceWith(DimensionStatus.XmlLayoutUnNotify)) {
                    view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max((this.f25046a1 - ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, 0), 1073741824));
                } else if (this.j1.getSpinnerStyle() == SpinnerStyle.MatchLayout) {
                    if (this.f25048b1.notified) {
                        measuredHeight = 0;
                    } else {
                        super.measureChild(view2, childMeasureSpec2, View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i10) - ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, Integer.MIN_VALUE));
                        measuredHeight = view2.getMeasuredHeight();
                    }
                    view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i10) - ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, 1073741824));
                    if (measuredHeight > 0 && measuredHeight != view2.getMeasuredHeight()) {
                        this.f25044Y0 = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                    }
                } else {
                    int i14 = ((ViewGroup.MarginLayoutParams) layoutParams2).height;
                    if (i14 > 0) {
                        DimensionStatus dimensionStatus6 = this.f25048b1;
                        DimensionStatus dimensionStatus7 = DimensionStatus.XmlExactUnNotify;
                        if (dimensionStatus6.canReplaceWith(dimensionStatus7)) {
                            this.f25046a1 = ((ViewGroup.MarginLayoutParams) layoutParams2).height + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                            this.f25048b1 = dimensionStatus7;
                        }
                        view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(((ViewGroup.MarginLayoutParams) layoutParams2).height, 1073741824));
                    } else if (i14 == -2) {
                        view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max((View.MeasureSpec.getSize(i10) - ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, 0), Integer.MIN_VALUE));
                        int measuredHeight5 = view2.getMeasuredHeight();
                        if (measuredHeight5 > 0) {
                            DimensionStatus dimensionStatus8 = this.f25048b1;
                            DimensionStatus dimensionStatus9 = DimensionStatus.XmlWrapUnNotify;
                            if (dimensionStatus8.canReplaceWith(dimensionStatus9)) {
                                this.f25048b1 = dimensionStatus9;
                                this.f25046a1 = view2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                            } else if (measuredHeight5 <= 0) {
                                view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max((this.f25046a1 - ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, 0), 1073741824));
                            }
                        } else if (measuredHeight5 <= 0) {
                            view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max((this.f25046a1 - ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, 0), 1073741824));
                        }
                    } else if (i14 == -1) {
                        view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max((this.f25046a1 - ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, 0), 1073741824));
                    } else {
                        view2.measure(childMeasureSpec2, i10);
                    }
                }
                if (this.j1.getSpinnerStyle() == SpinnerStyle.Scale && !z3) {
                    view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max((Math.max(0, this.f25078u0 ? -this.f25047b : 0) - ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin, 0), 1073741824));
                }
                DimensionStatus dimensionStatus10 = this.f25048b1;
                if (!dimensionStatus10.notified) {
                    this.f25048b1 = dimensionStatus10.notified();
                    RefreshFooter refreshFooter3 = this.j1;
                    int i15 = this.f25046a1;
                    refreshFooter3.onInitialized(refreshKernelImpl, i15, (int) (this.f1 * i15));
                }
                if (z3 && isEnableLoadMore()) {
                    measuredHeight3 += view2.getMeasuredHeight();
                }
            }
            RefreshContentWrapper refreshContentWrapper = this.f25062k1;
            if (refreshContentWrapper != null && refreshContentWrapper.getView() == childAt) {
                View view3 = this.f25062k1.getView();
                LayoutParams layoutParams3 = (LayoutParams) view3.getLayoutParams();
                view3.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams3).width), ViewGroup.getChildMeasureSpec(i10, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin + ((z3 && isEnableRefresh() && (refreshHeader = this.f25059i1) != null && (this.f25086x0 || refreshHeader.getSpinnerStyle() == SpinnerStyle.FixedBehind)) ? this.f25044Y0 : 0) + ((z3 && isEnableLoadMore() && (refreshFooter = this.j1) != null && (this.f25088y0 || refreshFooter.getSpinnerStyle() == SpinnerStyle.FixedBehind)) ? this.f25046a1 : 0), ((ViewGroup.MarginLayoutParams) layoutParams3).height));
                measuredHeight3 = view3.getMeasuredHeight() + measuredHeight3;
            }
        }
        super.setMeasuredDimension(View.resolveSize(super.getSuggestedMinimumWidth(), i7), View.resolveSize(measuredHeight3, i10));
        this.f25066o = getMeasuredWidth() / 2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@NonNull View view, float f10, float f11, boolean z3) {
        return this.f25042W0.a(f10, f11, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@NonNull View view, float f10, float f11) {
        return (this.f25085w1 && f11 > 0.0f) || m(Float.valueOf(-f11)) || this.f25042W0.b(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(@NonNull View view, int i7, int i10, @NonNull int[] iArr) {
        int i11 = this.T0;
        int i12 = 0;
        if (i10 * i11 > 0) {
            if (Math.abs(i10) > Math.abs(this.T0)) {
                int i13 = this.T0;
                this.T0 = 0;
                i12 = i13;
            } else {
                this.T0 -= i10;
                i12 = i10;
            }
            f(this.T0);
            RefreshState refreshState = this.f25072q1;
            if (refreshState.isOpening || refreshState == RefreshState.None) {
                int i14 = this.f25047b;
                RefreshKernelImpl refreshKernelImpl = this.f25065n1;
                if (i14 > 0) {
                    refreshKernelImpl.setState(RefreshState.PullDownToRefresh);
                } else {
                    refreshKernelImpl.setState(RefreshState.PullUpToLoad);
                }
            }
        } else if (i10 > 0 && this.f25085w1) {
            int i15 = i11 - i10;
            this.T0 = i15;
            f(i15);
            i12 = i10;
        }
        this.f25042W0.c(i7, i10 - i12, iArr, null, 0);
        iArr[1] = iArr[1] + i12;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(@NonNull View view, int i7, int i10, int i11, int i12) {
        this.f25042W0.d(i7, i10, i11, i12, this.f25041V0, 0, null);
        int i13 = i12 + this.f25041V0[1];
        if (i13 != 0) {
            if (this.f25019C0 || ((i13 < 0 && isEnableRefresh()) || (i13 > 0 && isEnableLoadMore()))) {
                if (this.f25072q1 == RefreshState.None) {
                    this.f25065n1.setState(i13 > 0 ? RefreshState.PullUpToLoad : RefreshState.PullDownToRefresh);
                }
                int i14 = this.T0 - i13;
                this.T0 = i14;
                f(i14);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i7) {
        this.f25043X0.f16285a = i7;
        this.f25042W0.h(i7 & 2, 0);
        this.T0 = this.f25047b;
        this.f25040U0 = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i7) {
        if (isEnabled() && isNestedScrollingEnabled() && (i7 & 2) != 0) {
            return this.f25019C0 || isEnableRefresh() || isEnableLoadMore();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(@NonNull View view) {
        this.f25043X0.f16285a = 0;
        this.f25040U0 = false;
        this.T0 = 0;
        h();
        this.f25042W0.i(0);
    }

    @Override // android.view.View
    public boolean post(@NonNull Runnable runnable) {
        Handler handler = this.f25064m1;
        if (handler != null) {
            return handler.post(new DelayedRunnable(runnable, 0L));
        }
        List arrayList = this.f25067o1;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f25067o1 = arrayList;
        arrayList.add(new DelayedRunnable(runnable, 0L));
        return false;
    }

    @Override // android.view.View
    public boolean postDelayed(@NonNull Runnable runnable, long j6) {
        if (j6 == 0) {
            new DelayedRunnable(runnable, 0L).run();
            return true;
        }
        Handler handler = this.f25064m1;
        if (handler != null) {
            return handler.postDelayed(new DelayedRunnable(runnable, 0L), j6);
        }
        List arrayList = this.f25067o1;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.f25067o1 = arrayList;
        arrayList.add(new DelayedRunnable(runnable, j6));
        return false;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setEnableNestedScroll(boolean z3) {
        setNestedScrollingEnabled(z3);
        return this;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z3) {
        this.f25032M0 = true;
        this.f25042W0.g(z3);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setRefreshContent(@NonNull View view) {
        return setRefreshContent(view, -1, -1);
    }

    public void setViceState(RefreshState refreshState) {
        RefreshState refreshState2 = this.f25070p1;
        if (refreshState2.isDragging && refreshState2.isHeader != refreshState.isHeader) {
            g(RefreshState.None);
        }
        if (this.f25072q1 != refreshState) {
            this.f25072q1 = refreshState;
        }
    }

    public SmartRefreshLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public boolean autoLoadMore(int i7, int i10, float f10) {
        if (this.f25070p1 != RefreshState.None || !isEnableLoadMore() || this.f25028K0) {
            return false;
        }
        ValueAnimator valueAnimator = this.f25015A1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        f fVar = new f(this, f10, i10);
        if (i7 <= 0) {
            fVar.run();
            return true;
        }
        this.f25015A1 = new ValueAnimator();
        postDelayed(fVar, i7);
        return true;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public boolean autoRefresh(int i7, int i10, float f10) {
        if (this.f25070p1 != RefreshState.None || !isEnableRefresh()) {
            return false;
        }
        ValueAnimator valueAnimator = this.f25015A1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c cVar = new c(this, f10, i10);
        if (i7 <= 0) {
            cVar.run();
            return true;
        }
        this.f25015A1 = new ValueAnimator();
        postDelayed(cVar, i7);
        return true;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout finishLoadMoreWithNoMoreData() {
        return finishLoadMore(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f25074r1))), true, true);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setDisableContentWhenLoading(boolean z3) {
        this.f25027J0 = z3;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setDisableContentWhenRefresh(boolean z3) {
        this.f25026I0 = z3;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setDragRate(float f10) {
        this.t = f10;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setEnableAutoLoadMore(boolean z3) {
        this.f25020D0 = z3;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setEnableClipFooterWhenFixedBehind(boolean z3) {
        this.f25084w0 = z3;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setEnableClipHeaderWhenFixedBehind(boolean z3) {
        this.f25081v0 = z3;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setEnableFooterFollowWhenLoadFinished(boolean z3) {
        this.f25090z0 = z3;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setEnableFooterTranslationContent(boolean z3) {
        this.f25088y0 = z3;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setEnableHeaderTranslationContent(boolean z3) {
        this.f25086x0 = z3;
        this.f25033N0 = true;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setEnableLoadMore(boolean z3) {
        this.f25030L0 = true;
        this.f25078u0 = z3;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setEnableLoadMoreWhenContentNotFull(boolean z3) {
        this.f25025H0 = z3;
        RefreshContentWrapper refreshContentWrapper = this.f25062k1;
        if (refreshContentWrapper != null) {
            refreshContentWrapper.setEnableLoadMoreWhenContentNotFull(z3);
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setEnableOverScrollBounce(boolean z3) {
        this.f25017B0 = z3;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setEnableOverScrollDrag(boolean z3) {
        this.f25019C0 = z3;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setEnablePureScrollMode(boolean z3) {
        this.f25021E0 = z3;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setEnableRefresh(boolean z3) {
        this.f25077t0 = z3;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setEnableScrollContentWhenLoaded(boolean z3) {
        this.f25022F0 = z3;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setEnableScrollContentWhenRefreshed(boolean z3) {
        this.f25023G0 = z3;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setFooterHeight(float f10) {
        if (this.f25048b1.canReplaceWith(DimensionStatus.CodeExact)) {
            this.f25046a1 = DensityUtil.dp2px(f10);
            this.f25048b1 = DimensionStatus.CodeExactUnNotify;
            RefreshFooter refreshFooter = this.j1;
            if (refreshFooter != null) {
                refreshFooter.getView().requestLayout();
            }
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setFooterInsetStart(float f10) {
        this.d1 = DensityUtil.dp2px(f10);
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setFooterMaxDragRate(float f10) {
        this.f1 = f10;
        RefreshFooter refreshFooter = this.j1;
        if (refreshFooter == null || this.f25064m1 == null) {
            this.f25048b1 = this.f25048b1.unNotify();
            return this;
        }
        RefreshKernelImpl refreshKernelImpl = this.f25065n1;
        int i7 = this.f25046a1;
        refreshFooter.onInitialized(refreshKernelImpl, i7, (int) (i7 * f10));
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setFooterTriggerRate(float f10) {
        this.f25057h1 = f10;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setHeaderHeight(float f10) {
        if (this.Z0.canReplaceWith(DimensionStatus.CodeExact)) {
            this.f25044Y0 = DensityUtil.dp2px(f10);
            this.Z0 = DimensionStatus.CodeExactUnNotify;
            RefreshHeader refreshHeader = this.f25059i1;
            if (refreshHeader != null) {
                refreshHeader.getView().requestLayout();
            }
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setHeaderInsetStart(float f10) {
        this.f25050c1 = DensityUtil.dp2px(f10);
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setHeaderMaxDragRate(float f10) {
        this.f25053e1 = f10;
        RefreshHeader refreshHeader = this.f25059i1;
        if (refreshHeader == null || this.f25064m1 == null) {
            this.Z0 = this.Z0.unNotify();
            return this;
        }
        RefreshKernelImpl refreshKernelImpl = this.f25065n1;
        int i7 = this.f25044Y0;
        refreshHeader.onInitialized(refreshKernelImpl, i7, (int) (f10 * i7));
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setHeaderTriggerRate(float f10) {
        this.f25056g1 = f10;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setNoMoreData(boolean z3) {
        this.f25028K0 = z3;
        RefreshFooter refreshFooter = this.j1;
        if (refreshFooter != null && !refreshFooter.setNoMoreData(z3)) {
            System.out.println("Footer:" + this.j1 + " Prompt completion is not supported.(不支持提示完成)");
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setOnLoadMoreListener(OnLoadMoreListener onLoadMoreListener) {
        this.f25037Q0 = onLoadMoreListener;
        this.f25078u0 = this.f25078u0 || !(this.f25030L0 || onLoadMoreListener == null);
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setOnMultiPurposeListener(OnMultiPurposeListener onMultiPurposeListener) {
        this.f25038R0 = onMultiPurposeListener;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setOnRefreshListener(OnRefreshListener onRefreshListener) {
        this.f25035P0 = onRefreshListener;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setOnRefreshLoadMoreListener(OnRefreshLoadMoreListener onRefreshLoadMoreListener) {
        this.f25035P0 = onRefreshLoadMoreListener;
        this.f25037Q0 = onRefreshLoadMoreListener;
        this.f25078u0 = this.f25078u0 || !(this.f25030L0 || onRefreshLoadMoreListener == null);
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setPrimaryColors(@ColorInt int... iArr) {
        RefreshHeader refreshHeader = this.f25059i1;
        if (refreshHeader != null) {
            refreshHeader.setPrimaryColors(iArr);
        }
        RefreshFooter refreshFooter = this.j1;
        if (refreshFooter != null) {
            refreshFooter.setPrimaryColors(iArr);
        }
        this.f25075s0 = iArr;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setPrimaryColorsId(@ColorRes int... iArr) {
        int[] iArr2 = new int[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            iArr2[i7] = SmartUtil.getColor(getContext(), iArr[i7]);
        }
        setPrimaryColors(iArr2);
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setReboundDuration(int i7) {
        this.f25054f = i7;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setReboundInterpolator(@NonNull Interpolator interpolator) {
        this.f25073r0 = interpolator;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public RefreshLayout setRefreshContent(@NonNull View view, int i7, int i10) {
        RefreshFooter refreshFooter;
        SpinnerStyle spinnerStyle;
        SpinnerStyle spinnerStyle2;
        RefreshHeader refreshHeader;
        RefreshContentWrapper refreshContentWrapper = this.f25062k1;
        if (refreshContentWrapper != null) {
            super.removeView(refreshContentWrapper.getView());
        }
        super.addView(view, 0, new LayoutParams(i7, i10));
        RefreshHeader refreshHeader2 = this.f25059i1;
        if (refreshHeader2 != null) {
            SpinnerStyle spinnerStyle3 = refreshHeader2.getSpinnerStyle();
            SpinnerStyle spinnerStyle4 = SpinnerStyle.FixedBehind;
            if (spinnerStyle3 == spinnerStyle4) {
                super.bringChildToFront(view);
                RefreshFooter refreshFooter2 = this.j1;
                if (refreshFooter2 != null && refreshFooter2.getSpinnerStyle() != spinnerStyle4) {
                    super.bringChildToFront(this.j1.getView());
                }
            } else {
                refreshFooter = this.j1;
                if (refreshFooter != null) {
                    spinnerStyle = refreshFooter.getSpinnerStyle();
                    spinnerStyle2 = SpinnerStyle.FixedBehind;
                    if (spinnerStyle == spinnerStyle2) {
                        super.bringChildToFront(view);
                        refreshHeader = this.f25059i1;
                        if (refreshHeader != null && refreshHeader.getSpinnerStyle() == spinnerStyle2) {
                            super.bringChildToFront(this.f25059i1.getView());
                        }
                    }
                }
            }
        } else {
            refreshFooter = this.j1;
            if (refreshFooter != null) {
                spinnerStyle = refreshFooter.getSpinnerStyle();
                spinnerStyle2 = SpinnerStyle.FixedBehind;
                if (spinnerStyle == spinnerStyle2) {
                    super.bringChildToFront(view);
                    refreshHeader = this.f25059i1;
                    if (refreshHeader != null) {
                        super.bringChildToFront(this.f25059i1.getView());
                    }
                }
            }
        }
        this.f25062k1 = new RefreshContentWrapper(view);
        if (this.f25064m1 != null) {
            int i11 = this.f25016B;
            View viewFindViewById = i11 > 0 ? findViewById(i11) : null;
            int i12 = this.f25018C;
            View viewFindViewById2 = i12 > 0 ? findViewById(i12) : null;
            this.f25062k1.setScrollBoundaryDecider(this.f25039S0);
            this.f25062k1.setEnableLoadMoreWhenContentNotFull(this.f25025H0);
            this.f25062k1.setUpComponent(this.f25065n1, viewFindViewById, viewFindViewById2);
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setScrollBoundaryDecider(ScrollBoundaryDecider scrollBoundaryDecider) {
        this.f25039S0 = scrollBoundaryDecider;
        RefreshContentWrapper refreshContentWrapper = this.f25062k1;
        if (refreshContentWrapper != null) {
            refreshContentWrapper.setScrollBoundaryDecider(scrollBoundaryDecider);
        }
        return this;
    }

    public SmartRefreshLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f25052e = 250;
        this.f25054f = 250;
        this.t = 0.5f;
        this.f25080v = 'n';
        this.f25077t0 = true;
        this.f25078u0 = false;
        this.f25081v0 = true;
        this.f25084w0 = true;
        this.f25086x0 = true;
        this.f25088y0 = true;
        this.f25090z0 = false;
        this.f25014A0 = true;
        this.f25017B0 = true;
        this.f25019C0 = false;
        this.f25020D0 = true;
        this.f25021E0 = false;
        this.f25022F0 = true;
        this.f25023G0 = true;
        this.f25025H0 = true;
        this.f25026I0 = false;
        this.f25027J0 = false;
        this.f25028K0 = false;
        this.f25030L0 = false;
        this.f25032M0 = false;
        this.f25033N0 = false;
        this.f25034O0 = false;
        this.f25041V0 = new int[2];
        this.f25042W0 = new r(this);
        this.f25043X0 = new C1066s();
        DimensionStatus dimensionStatus = DimensionStatus.DefaultUnNotify;
        this.Z0 = dimensionStatus;
        this.f25048b1 = dimensionStatus;
        this.f25053e1 = 2.5f;
        this.f1 = 2.5f;
        this.f25056g1 = 1.0f;
        this.f25057h1 = 1.0f;
        this.f25065n1 = new RefreshKernelImpl();
        RefreshState refreshState = RefreshState.None;
        this.f25070p1 = refreshState;
        this.f25072q1 = refreshState;
        this.f25074r1 = 0L;
        this.f25076s1 = 0;
        this.t1 = 0;
        this.f25085w1 = false;
        this.f25087x1 = false;
        this.f25089y1 = null;
        super.setClipToPadding(false);
        DensityUtil densityUtil = new DensityUtil();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f25069p0 = new Scroller(context);
        this.f25071q0 = VelocityTracker.obtain();
        this.f25055g = context.getResources().getDisplayMetrics().heightPixels;
        this.f25073r0 = new ViscousFluidInterpolator();
        this.f25045a = viewConfiguration.getScaledTouchSlop();
        this.f25031M = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f25036Q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SmartRefreshLayout);
        setNestedScrollingEnabled(typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableNestedScrolling, false));
        this.t = typedArrayObtainStyledAttributes.getFloat(R.styleable.SmartRefreshLayout_srlDragRate, this.t);
        this.f25053e1 = typedArrayObtainStyledAttributes.getFloat(R.styleable.SmartRefreshLayout_srlHeaderMaxDragRate, this.f25053e1);
        this.f1 = typedArrayObtainStyledAttributes.getFloat(R.styleable.SmartRefreshLayout_srlFooterMaxDragRate, this.f1);
        this.f25056g1 = typedArrayObtainStyledAttributes.getFloat(R.styleable.SmartRefreshLayout_srlHeaderTriggerRate, this.f25056g1);
        this.f25057h1 = typedArrayObtainStyledAttributes.getFloat(R.styleable.SmartRefreshLayout_srlFooterTriggerRate, this.f25057h1);
        this.f25077t0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableRefresh, this.f25077t0);
        this.f25054f = typedArrayObtainStyledAttributes.getInt(R.styleable.SmartRefreshLayout_srlReboundDuration, this.f25054f);
        this.f25078u0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableLoadMore, this.f25078u0);
        this.f25044Y0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.SmartRefreshLayout_srlHeaderHeight, densityUtil.dip2px(100.0f));
        this.f25046a1 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.SmartRefreshLayout_srlFooterHeight, densityUtil.dip2px(60.0f));
        this.f25050c1 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.SmartRefreshLayout_srlHeaderInsetStart, 0);
        this.d1 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.SmartRefreshLayout_srlFooterInsetStart, 0);
        this.f25026I0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlDisableContentWhenRefresh, this.f25026I0);
        this.f25027J0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlDisableContentWhenLoading, this.f25027J0);
        this.f25086x0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableHeaderTranslationContent, this.f25086x0);
        this.f25088y0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableFooterTranslationContent, this.f25088y0);
        this.f25014A0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnablePreviewInEditMode, true);
        this.f25020D0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableAutoLoadMore, this.f25020D0);
        this.f25017B0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableOverScrollBounce, this.f25017B0);
        this.f25021E0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnablePureScrollMode, this.f25021E0);
        this.f25022F0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableScrollContentWhenLoaded, this.f25022F0);
        this.f25023G0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableScrollContentWhenRefreshed, this.f25023G0);
        this.f25025H0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableLoadMoreWhenContentNotFull, this.f25025H0);
        this.f25090z0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableFooterFollowWhenLoadFinished, this.f25090z0);
        this.f25081v0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableClipHeaderWhenFixedBehind, this.f25081v0);
        this.f25084w0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableClipFooterWhenFixedBehind, this.f25084w0);
        this.f25019C0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.SmartRefreshLayout_srlEnableOverScrollDrag, this.f25019C0);
        this.f25016B = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SmartRefreshLayout_srlFixedHeaderViewId, -1);
        this.f25018C = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SmartRefreshLayout_srlFixedFooterViewId, -1);
        this.f25024H = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SmartRefreshLayout_srlHeaderTranslationViewId, -1);
        this.f25029L = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SmartRefreshLayout_srlFooterTranslationViewId, -1);
        if (this.f25021E0 && !typedArrayObtainStyledAttributes.hasValue(R.styleable.SmartRefreshLayout_srlEnableOverScrollDrag)) {
            this.f25019C0 = true;
        }
        this.f25030L0 = typedArrayObtainStyledAttributes.hasValue(R.styleable.SmartRefreshLayout_srlEnableLoadMore);
        this.f25032M0 = typedArrayObtainStyledAttributes.hasValue(R.styleable.SmartRefreshLayout_srlEnableNestedScrolling);
        this.f25033N0 = typedArrayObtainStyledAttributes.hasValue(R.styleable.SmartRefreshLayout_srlEnableHeaderTranslationContent);
        this.Z0 = typedArrayObtainStyledAttributes.hasValue(R.styleable.SmartRefreshLayout_srlHeaderHeight) ? DimensionStatus.XmlLayoutUnNotify : this.Z0;
        this.f25048b1 = typedArrayObtainStyledAttributes.hasValue(R.styleable.SmartRefreshLayout_srlFooterHeight) ? DimensionStatus.XmlLayoutUnNotify : this.f25048b1;
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.SmartRefreshLayout_srlAccentColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R.styleable.SmartRefreshLayout_srlPrimaryColor, 0);
        if (color2 != 0) {
            if (color != 0) {
                this.f25075s0 = new int[]{color2, color};
            } else {
                this.f25075s0 = new int[]{color2};
            }
        } else if (color != 0) {
            this.f25075s0 = new int[]{0, color};
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setRefreshFooter(@NonNull RefreshFooter refreshFooter) {
        return setRefreshFooter(refreshFooter, -1, -2);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setRefreshHeader(@NonNull RefreshHeader refreshHeader) {
        return setRefreshHeader(refreshHeader, -1, -2);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setRefreshFooter(@NonNull RefreshFooter refreshFooter, int i7, int i10) {
        RefreshFooter refreshFooter2 = this.j1;
        if (refreshFooter2 != null) {
            super.removeView(refreshFooter2.getView());
        }
        this.j1 = refreshFooter;
        this.t1 = 0;
        this.f25082v1 = false;
        this.f25048b1 = this.f25048b1.unNotify();
        this.f25078u0 = !this.f25030L0 || this.f25078u0;
        if (this.j1.getSpinnerStyle() == SpinnerStyle.FixedBehind) {
            super.addView(this.j1.getView(), 0, new LayoutParams(i7, i10));
            return this;
        }
        super.addView(this.j1.getView(), i7, i10);
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout setRefreshHeader(@NonNull RefreshHeader refreshHeader, int i7, int i10) {
        RefreshHeader refreshHeader2 = this.f25059i1;
        if (refreshHeader2 != null) {
            super.removeView(refreshHeader2.getView());
        }
        this.f25059i1 = refreshHeader;
        this.f25076s1 = 0;
        this.f25079u1 = false;
        this.Z0 = this.Z0.unNotify();
        if (refreshHeader.getSpinnerStyle() == SpinnerStyle.FixedBehind) {
            super.addView(this.f25059i1.getView(), 0, new LayoutParams(i7, i10));
            return this;
        }
        super.addView(this.f25059i1.getView(), i7, i10);
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout finishLoadMore() {
        return finishLoadMore(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f25074r1))));
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout finishRefresh() {
        return finishRefresh(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f25074r1))));
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout finishLoadMore(int i7) {
        return finishLoadMore(i7, true, false);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout finishRefresh(int i7) {
        return finishRefresh(i7, true);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int backgroundColor;
        public SpinnerStyle spinnerStyle;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.backgroundColor = 0;
            this.spinnerStyle = null;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SmartRefreshLayout_Layout);
            this.backgroundColor = typedArrayObtainStyledAttributes.getColor(R.styleable.SmartRefreshLayout_Layout_layout_srlBackgroundColor, this.backgroundColor);
            if (typedArrayObtainStyledAttributes.hasValue(R.styleable.SmartRefreshLayout_Layout_layout_srlSpinnerStyle)) {
                this.spinnerStyle = SpinnerStyle.values()[typedArrayObtainStyledAttributes.getInt(R.styleable.SmartRefreshLayout_Layout_layout_srlSpinnerStyle, SpinnerStyle.Translate.ordinal())];
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i7, int i10) {
            super(i7, i10);
            this.backgroundColor = 0;
            this.spinnerStyle = null;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.backgroundColor = 0;
            this.spinnerStyle = null;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.backgroundColor = 0;
            this.spinnerStyle = null;
        }
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout finishLoadMore(boolean z3) {
        return finishLoadMore(z3 ? Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f25074r1))) : 0, z3, false);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout finishRefresh(boolean z3) {
        return finishRefresh(z3 ? Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.f25074r1))) : 0, z3);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout finishLoadMore(int i7, boolean z3, boolean z8) {
        postDelayed(new B7.r(this, z3, z8), i7 <= 0 ? 1L : i7);
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshLayout
    public SmartRefreshLayout finishRefresh(int i7, boolean z3) {
        postDelayed(new o(this, z3), i7 <= 0 ? 1L : i7);
        return this;
    }
}
