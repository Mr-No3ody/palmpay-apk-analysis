package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ShowableListMenu;

/* JADX INFO: renamed from: androidx.appcompat.widget.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0875o0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f12982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f12985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RunnableC0873n0 f12986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RunnableC0873n0 f12987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12988g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f12990j = new int[2];

    public AbstractViewOnTouchListenerC0875o0(View view) {
        this.f12985d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f12982a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f12983b = tapTimeout;
        this.f12984c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0873n0 runnableC0873n0 = this.f12987f;
        View view = this.f12985d;
        if (runnableC0873n0 != null) {
            view.removeCallbacks(runnableC0873n0);
        }
        RunnableC0873n0 runnableC0873n1 = this.f12986e;
        if (runnableC0873n1 != null) {
            view.removeCallbacks(runnableC0873n1);
        }
    }

    public abstract ShowableListMenu b();

    public abstract boolean c();

    public boolean d() {
        ShowableListMenu showableListMenuB = b();
        if (showableListMenuB == null || !showableListMenuB.isShowing()) {
            return true;
        }
        showableListMenuB.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cd  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z3;
        DropDownListView dropDownListView;
        boolean z8 = this.f12988g;
        View view2 = this.f12985d;
        if (z8) {
            ShowableListMenu showableListMenuB = b();
            if (showableListMenuB != null && showableListMenuB.isShowing() && (dropDownListView = (DropDownListView) showableListMenuB.getListView()) != null && dropDownListView.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f12990j;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                dropDownListView.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = dropDownListView.b(motionEventObtainNoHistory, this.f12989i);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z10 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z10) {
                    z3 = true;
                } else if (d()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else if (d()) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f12989i = motionEvent.getPointerId(0);
                    if (this.f12986e == null) {
                        this.f12986e = new RunnableC0873n0(this, 0);
                    }
                    view2.postDelayed(this.f12986e, this.f12983b);
                    if (this.f12987f == null) {
                        this.f12987f = new RunnableC0873n0(this, 1);
                    }
                    view2.postDelayed(this.f12987f, this.f12984c);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f12989i);
                    if (iFindPointerIndex >= 0) {
                        float x3 = motionEvent.getX(iFindPointerIndex);
                        float y8 = motionEvent.getY(iFindPointerIndex);
                        float f10 = this.f12982a;
                        float f11 = -f10;
                        if (x3 < f11 || y8 < f11 || x3 >= (view2.getRight() - view2.getLeft()) + f10 || y8 >= (view2.getBottom() - view2.getTop()) + f10) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (c()) {
                                z3 = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
                z3 = false;
            } else {
                z3 = false;
            }
            if (z3) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f12988g = z3;
        return z3 || z8;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f12988g = false;
        this.f12989i = -1;
        RunnableC0873n0 runnableC0873n0 = this.f12986e;
        if (runnableC0873n0 != null) {
            this.f12985d.removeCallbacks(runnableC0873n0);
        }
    }
}
