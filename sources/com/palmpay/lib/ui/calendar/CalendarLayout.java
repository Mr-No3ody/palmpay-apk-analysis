package com.palmpay.lib.ui.calendar;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class CalendarLayout extends LinearLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f24094A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f24095B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f24096C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final VelocityTracker f24097H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f24098L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f24099M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public p f24100Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MonthViewPager f24104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CalendarView f24105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeekViewPager f24106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public YearViewPager f24107g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ViewGroup f24108i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f24109j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f24110o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f24111p;
    public int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f24112v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f24113w;

    public interface CalendarScrollView {
        boolean isScrollToTop();
    }

    public CalendarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.t = 0;
        this.f24095B = false;
        setOrientation(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, L6.j.PpCalendarLayout);
        this.f24096C = typedArrayObtainStyledAttributes.getResourceId(L6.j.PpCalendarLayout_calendar_content_view_id, 0);
        this.f24102b = typedArrayObtainStyledAttributes.getInt(L6.j.PpCalendarLayout_default_status, 0);
        this.f24110o = typedArrayObtainStyledAttributes.getInt(L6.j.PpCalendarLayout_calendar_show_mode, 0);
        this.f24109j = typedArrayObtainStyledAttributes.getInt(L6.j.PpCalendarLayout_gesture_mode, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f24097H = VelocityTracker.obtain();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        viewConfiguration.getScaledTouchSlop();
        this.f24098L = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public static void a(CalendarLayout calendarLayout) {
        p pVar;
        CalendarView.OnViewChangeListener onViewChangeListener;
        if (calendarLayout.f24106f.getVisibility() != 0 && (pVar = calendarLayout.f24100Q) != null && (onViewChangeListener = pVar.f24306z0) != null && !calendarLayout.f24103c) {
            onViewChangeListener.onViewChange(false);
        }
        WeekViewPager weekViewPager = calendarLayout.f24106f;
        if (weekViewPager != null && weekViewPager.getAdapter() != null) {
            calendarLayout.f24106f.getAdapter().i();
            calendarLayout.f24106f.setVisibility(0);
        }
        calendarLayout.f24104d.setVisibility(4);
    }

    private int getCalendarViewHeight() {
        if (this.f24104d.getVisibility() == 0) {
            return this.f24104d.getHeight() + this.f24100Q.i0;
        }
        p pVar = this.f24100Q;
        return pVar.i0 + pVar.f24270g0;
    }

    public final boolean b(int i7) {
        p pVar;
        CalendarView.OnViewChangeListener onViewChangeListener;
        int i10 = 0;
        if (this.f24095B || this.f24110o == 1 || this.f24108i == null) {
            return false;
        }
        if (this.f24104d.getVisibility() != 0) {
            this.f24106f.setVisibility(8);
            if (this.f24104d.getVisibility() != 0 && (pVar = this.f24100Q) != null && (onViewChangeListener = pVar.f24306z0) != null && this.f24103c) {
                onViewChangeListener.onViewChange(true);
            }
            this.f24103c = false;
            this.f24104d.setVisibility(0);
        }
        ViewGroup viewGroup = this.f24108i;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, "translationY", viewGroup.getTranslationY(), 0.0f);
        objectAnimatorOfFloat.setDuration(i7);
        objectAnimatorOfFloat.addUpdateListener(new C1438h(this, i10));
        objectAnimatorOfFloat.addListener(new C1439i(this));
        objectAnimatorOfFloat.start();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        ViewGroup viewGroup = this.f24108i;
        if (viewGroup instanceof CalendarScrollView) {
            return ((CalendarScrollView) viewGroup).isScrollToTop();
        }
        if (viewGroup instanceof RecyclerView) {
            return ((RecyclerView) viewGroup).computeVerticalScrollOffset() == 0;
        }
        if (!(viewGroup instanceof AbsListView)) {
            return viewGroup.getScrollY() == 0;
        }
        AbsListView absListView = (AbsListView) viewGroup;
        return absListView.getFirstVisiblePosition() == 0 && absListView.getChildAt(0).getTop() == 0;
    }

    public final void d() {
        ViewGroup viewGroup = this.f24108i;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setTranslationY(getHeight() - this.f24104d.getHeight());
        this.f24108i.setVisibility(0);
        this.f24108i.animate().translationY(0.0f).setDuration(180L).setInterpolator(new LinearInterpolator()).setListener(new C1436f());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        CalendarView calendarView;
        ViewGroup viewGroup;
        if (this.f24095B) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (this.f24109j == 2) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (this.f24107g == null || (calendarView = this.f24105e) == null || calendarView.getVisibility() == 8 || (viewGroup = this.f24108i) == null || viewGroup.getVisibility() != 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int i7 = this.f24110o;
        if (i7 == 2 || i7 == 1) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (this.f24107g.getVisibility() == 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.f24100Q.getClass();
        int action = motionEvent.getAction();
        float y8 = motionEvent.getY();
        if (action != 2 || y8 - this.f24113w <= 0.0f || this.f24108i.getTranslationY() != (-this.f24111p) || !c()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        requestDisallowInterceptTouchEvent(false);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean e(int i7) {
        ViewGroup viewGroup;
        int i10 = 1;
        if (this.f24109j == 2) {
            requestLayout();
        }
        if (this.f24095B || (viewGroup = this.f24108i) == null) {
            return false;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, "translationY", viewGroup.getTranslationY(), -this.f24111p);
        objectAnimatorOfFloat.setDuration(i7);
        objectAnimatorOfFloat.addUpdateListener(new C1438h(this, i10));
        objectAnimatorOfFloat.addListener(new G7.j(this, 7));
        objectAnimatorOfFloat.start();
        return true;
    }

    public final void f() {
        this.f24104d.setTranslationY(this.t * ((this.f24108i.getTranslationY() * 1.0f) / this.f24111p));
    }

    public final void g() {
        ViewGroup viewGroup;
        p pVar = this.f24100Q;
        C1435e c1435e = pVar.f24228E0;
        if (pVar.f24262c == 0) {
            this.f24111p = this.f24099M * 5;
        } else {
            this.f24111p = s.d(c1435e.f24201a, c1435e.f24202b, this.f24099M, pVar) - this.f24099M;
        }
        if (this.f24106f.getVisibility() != 0 || (viewGroup = this.f24108i) == null) {
            return;
        }
        viewGroup.setTranslationY(-this.f24111p);
    }

    public final void h(int i7) {
        this.t = (((i7 + 7) / 7) - 1) * this.f24099M;
    }

    public final void i(int i7) {
        this.t = (i7 - 1) * this.f24099M;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f24104d = (MonthViewPager) findViewById(L6.f.vp_month);
        this.f24106f = (WeekViewPager) findViewById(L6.f.vp_week);
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof CalendarView) {
                this.f24105e = (CalendarView) childAt;
            }
        }
        this.f24108i = (ViewGroup) findViewById(this.f24096C);
        this.f24107g = (YearViewPager) findViewById(L6.f.selectLayout);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        CalendarView calendarView;
        ViewGroup viewGroup;
        if (this.f24095B) {
            return true;
        }
        if (this.f24109j == 2) {
            return false;
        }
        if (this.f24107g == null || (calendarView = this.f24105e) == null || calendarView.getVisibility() == 8 || (viewGroup = this.f24108i) == null || viewGroup.getVisibility() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int i7 = this.f24110o;
        if (i7 == 2 || i7 == 1) {
            return false;
        }
        if (this.f24107g.getVisibility() == 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        this.f24100Q.getClass();
        int action = motionEvent.getAction();
        float y8 = motionEvent.getY();
        float x3 = motionEvent.getX();
        MonthViewPager monthViewPager = this.f24105e.getMonthViewPager();
        if (monthViewPager.getOrientation() == 1 && !this.f24103c && x3 >= monthViewPager.getLeft() && x3 <= monthViewPager.getRight() && y8 >= monthViewPager.getTop() && y8 <= monthViewPager.getBottom()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (action == 0) {
            this.f24101a = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.f24112v = y8;
            this.f24113w = y8;
            this.f24094A = x3;
        } else if (action == 2) {
            float f10 = y8 - this.f24113w;
            float f11 = x3 - this.f24094A;
            if (f10 < 0.0f && this.f24108i.getTranslationY() == (-this.f24111p)) {
                return false;
            }
            if (f10 > 0.0f && this.f24108i.getTranslationY() == (-this.f24111p)) {
                p pVar = this.f24100Q;
                if (y8 >= pVar.f24270g0 + pVar.i0 && !c()) {
                    return false;
                }
            }
            if (f10 > 0.0f && this.f24108i.getTranslationY() == 0.0f && y8 >= s.e(getContext(), 98.0f)) {
                return false;
            }
            if (Math.abs(f10) > Math.abs(f11) && ((f10 > 0.0f && this.f24108i.getTranslationY() <= 0.0f) || (f10 < 0.0f && this.f24108i.getTranslationY() >= (-this.f24111p)))) {
                this.f24113w = y8;
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (this.f24108i == null || this.f24105e == null) {
            super.onMeasure(i7, i10);
            return;
        }
        C1435e c1435e = this.f24100Q.f24228E0;
        int i11 = c1435e.f24201a;
        int i12 = c1435e.f24202b;
        int iE = s.e(getContext(), 1.0f);
        p pVar = this.f24100Q;
        int i13 = iE + pVar.i0;
        int iM = s.m(i11, i12, pVar.f24270g0, pVar) + i13;
        int size = View.MeasureSpec.getSize(i10);
        if (this.f24100Q.f24272h0) {
            super.onMeasure(i7, i10);
            this.f24108i.measure(i7, View.MeasureSpec.makeMeasureSpec((size - i13) - this.f24100Q.f24270g0, 1073741824));
            ViewGroup viewGroup = this.f24108i;
            viewGroup.layout(viewGroup.getLeft(), this.f24108i.getTop(), this.f24108i.getRight(), this.f24108i.getBottom());
            return;
        }
        if (iM >= size && this.f24104d.getHeight() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(iM + i13 + this.f24100Q.i0, 1073741824);
            size = iM;
        } else if (iM < size && this.f24104d.getHeight() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        }
        if (this.f24110o == 2 || this.f24105e.getVisibility() == 8) {
            iM = this.f24105e.getVisibility() == 8 ? 0 : this.f24105e.getHeight();
        } else if (this.f24109j != 2 || this.f24095B || this.f24104d.getVisibility() != 0) {
            size -= i13;
            iM = this.f24099M;
        }
        int i14 = size - iM;
        super.onMeasure(i7, i10);
        this.f24108i.measure(i7, View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
        ViewGroup viewGroup2 = this.f24108i;
        viewGroup2.layout(viewGroup2.getLeft(), this.f24108i.getTop(), this.f24108i.getRight(), this.f24108i.getBottom());
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        Parcelable parcelable2 = bundle.getParcelable("super");
        if (bundle.getBoolean("isExpand")) {
            post(new RunnableC1437g(this, 0));
        } else {
            post(new RunnableC1437g(this, 1));
        }
        super.onRestoreInstanceState(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putBoolean("isExpand", this.f24104d.getVisibility() == 0);
        return bundle;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        CalendarView calendarView;
        CalendarView.OnViewChangeListener onViewChangeListener;
        int iFindPointerIndex;
        if (this.f24109j == 2 || (i7 = this.f24110o) == 2 || i7 == 1 || this.f24100Q == null || this.f24108i == null || (calendarView = this.f24105e) == null || calendarView.getVisibility() == 8) {
            return false;
        }
        int action = motionEvent.getAction();
        float y8 = motionEvent.getY();
        VelocityTracker velocityTracker = this.f24097H;
        velocityTracker.addMovement(motionEvent);
        if (action == 0) {
            this.f24101a = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.f24112v = y8;
            this.f24113w = y8;
            return true;
        }
        if (action == 1) {
            velocityTracker.computeCurrentVelocity(1000, this.f24098L);
            float yVelocity = velocityTracker.getYVelocity();
            if (this.f24108i.getTranslationY() == 0.0f || this.f24108i.getTranslationY() == this.f24111p) {
                b(240);
            } else {
                if (Math.abs(yVelocity) >= 800.0f) {
                    if (yVelocity < 0.0f) {
                        e(240);
                    } else {
                        b(240);
                    }
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getY() - this.f24112v > 0.0f) {
                    b(240);
                } else {
                    e(240);
                }
            }
        } else if (action == 2) {
            if (motionEvent.findPointerIndex(this.f24101a) == -1) {
                this.f24101a = -1;
            }
            if (this.f24101a == -1) {
                this.f24113w = y8;
                this.f24101a = 1;
            }
            float f10 = y8 - this.f24113w;
            if (f10 < 0.0f && this.f24108i.getTranslationY() == (-this.f24111p)) {
                this.f24113w = y8;
                motionEvent.setAction(0);
                dispatchTouchEvent(motionEvent);
                this.f24106f.setVisibility(0);
                this.f24104d.setVisibility(4);
                if (!this.f24103c && (onViewChangeListener = this.f24100Q.f24306z0) != null) {
                    onViewChangeListener.onViewChange(false);
                }
                this.f24103c = true;
                return true;
            }
            this.f24106f.setVisibility(8);
            this.f24104d.setVisibility(0);
            if (f10 > 0.0f && this.f24108i.getTranslationY() + f10 >= 0.0f) {
                this.f24108i.setTranslationY(0.0f);
                f();
                this.f24113w = y8;
                return super.onTouchEvent(motionEvent);
            }
            if (f10 < 0.0f) {
                float translationY = this.f24108i.getTranslationY() + f10;
                float f11 = -this.f24111p;
                if (translationY <= f11) {
                    this.f24108i.setTranslationY(f11);
                    f();
                    this.f24113w = y8;
                    return super.onTouchEvent(motionEvent);
                }
            }
            ViewGroup viewGroup = this.f24108i;
            viewGroup.setTranslationY(viewGroup.getTranslationY() + f10);
            f();
            this.f24113w = y8;
        } else if (action == 3) {
            iFindPointerIndex = motionEvent.findPointerIndex(this.f24101a);
            if (iFindPointerIndex == -1) {
                this.f24101a = -1;
            }
            if (this.f24101a != -1) {
                this.f24113w = motionEvent.getY(iFindPointerIndex);
            }
        } else if (action == 5) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.f24101a = pointerId;
            if (pointerId == 0) {
                this.f24113w = motionEvent.getY(pointerId);
            }
        } else if (action == 6) {
            iFindPointerIndex = motionEvent.findPointerIndex(this.f24101a);
            if (iFindPointerIndex == -1) {
                this.f24101a = -1;
            }
            if (this.f24101a != -1) {
                this.f24113w = motionEvent.getY(iFindPointerIndex);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setup(p pVar) {
        this.f24100Q = pVar;
        this.f24099M = pVar.f24270g0;
        C1435e c1435eB = pVar.f24226D0.b() ? pVar.f24226D0 : pVar.b();
        h((s.o(c1435eB, this.f24100Q.f24261b) + c1435eB.f24203c) - 1);
        g();
    }
}
