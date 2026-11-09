package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.navigation.NavigationBarView;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39802c})
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RunnableC0858g f12755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayoutCompat f12756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AppCompatSpinner f12757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12761g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12762i;

    public class TabView extends LinearLayout {
        public TabView(Context context) {
            super(context, null, p241q.a.actionBarTabStyle);
            Z0 z0F = Z0.f(context, null, new int[]{R.attr.background}, p241q.a.actionBarTabStyle, 0);
            if (z0F.f12863b.hasValue(0)) {
                setBackgroundDrawable(z0F.b(0));
            }
            z0F.g();
            setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
            throw null;
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i7, int i10) {
            super.onMeasure(i7, i10);
            ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
            if (scrollingTabContainerView.f12759e > 0) {
                int measuredWidth = getMeasuredWidth();
                int i11 = scrollingTabContainerView.f12759e;
                if (measuredWidth > i11) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i10);
                }
            }
        }

        @Override // android.view.View
        public final void setSelected(boolean z3) {
            boolean z8 = isSelected() != z3;
            super.setSelected(z3);
            if (z8 && z3) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    public ScrollingTabContainerView(@NonNull Context context) {
        super(context);
        new F0(this);
        setHorizontalScrollBarEnabled(false);
        p382zb.H hA = p382zb.H.a(context);
        setContentHeight(hA.c());
        this.f12760f = ((Context) hA.f44527a).getResources().getDimensionPixelSize(p241q.d.abc_action_bar_stacked_tab_max_width);
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, p241q.a.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        this.f12756b = linearLayoutCompat;
        addView(linearLayoutCompat, new ViewGroup.LayoutParams(-2, -1));
    }

    public final void a() {
        AppCompatSpinner appCompatSpinner = this.f12757c;
        if (appCompatSpinner != null && appCompatSpinner.getParent() == this) {
            removeView(this.f12757c);
            addView(this.f12756b, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.f12757c.getSelectedItemPosition());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        RunnableC0858g runnableC0858g = this.f12755a;
        if (runnableC0858g != null) {
            post(runnableC0858g);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p382zb.H hA = p382zb.H.a(getContext());
        setContentHeight(hA.c());
        this.f12760f = ((Context) hA.f44527a).getResources().getDimensionPixelSize(p241q.d.abc_action_bar_stacked_tab_max_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        RunnableC0858g runnableC0858g = this.f12755a;
        if (runnableC0858g != null) {
            removeCallbacks(runnableC0858g);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i7, long j6) {
        ((TabView) view).getClass();
        throw null;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int mode = View.MeasureSpec.getMode(i7);
        boolean z3 = mode == 1073741824;
        setFillViewport(z3);
        LinearLayoutCompat linearLayoutCompat = this.f12756b;
        int childCount = linearLayoutCompat.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f12759e = -1;
        } else {
            if (childCount > 2) {
                this.f12759e = (int) (View.MeasureSpec.getSize(i7) * 0.4f);
            } else {
                this.f12759e = View.MeasureSpec.getSize(i7) / 2;
            }
            this.f12759e = Math.min(this.f12759e, this.f12760f);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f12761g, 1073741824);
        if (z3 || !this.f12758d) {
            a();
        } else {
            linearLayoutCompat.measure(0, iMakeMeasureSpec);
            if (linearLayoutCompat.getMeasuredWidth() > View.MeasureSpec.getSize(i7)) {
                AppCompatSpinner appCompatSpinner = this.f12757c;
                if (appCompatSpinner == null || appCompatSpinner.getParent() != this) {
                    if (this.f12757c == null) {
                        AppCompatSpinner appCompatSpinner2 = new AppCompatSpinner(getContext(), null, p241q.a.actionDropDownStyle);
                        appCompatSpinner2.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
                        appCompatSpinner2.setOnItemSelectedListener(this);
                        this.f12757c = appCompatSpinner2;
                    }
                    removeView(linearLayoutCompat);
                    addView(this.f12757c, new ViewGroup.LayoutParams(-2, -1));
                    if (this.f12757c.getAdapter() == null) {
                        this.f12757c.setAdapter((SpinnerAdapter) new E0(this));
                    }
                    Runnable runnable = this.f12755a;
                    if (runnable != null) {
                        removeCallbacks(runnable);
                        this.f12755a = null;
                    }
                    this.f12757c.setSelection(this.f12762i);
                }
            } else {
                a();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i7, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z3 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f12762i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public void setAllowCollapse(boolean z3) {
        this.f12758d = z3;
    }

    public void setContentHeight(int i7) {
        this.f12761g = i7;
        requestLayout();
    }

    public void setTabSelected(int i7) {
        this.f12762i = i7;
        LinearLayoutCompat linearLayoutCompat = this.f12756b;
        int childCount = linearLayoutCompat.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = linearLayoutCompat.getChildAt(i10);
            boolean z3 = i10 == i7;
            childAt.setSelected(z3);
            if (z3) {
                View childAt2 = linearLayoutCompat.getChildAt(i7);
                Runnable runnable = this.f12755a;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                RunnableC0858g runnableC0858g = new RunnableC0858g(1, this, childAt2);
                this.f12755a = runnableC0858g;
                post(runnableC0858g);
            }
            i10++;
        }
        AppCompatSpinner appCompatSpinner = this.f12757c;
        if (appCompatSpinner == null || i7 < 0) {
            return;
        }
        appCompatSpinner.setSelection(i7);
    }
}
