package androidx.appcompat.widget;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class Q0 extends TouchDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f12744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f12745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f12746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f12747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12749f;

    public Q0(View view, Rect rect, Rect rect2) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f12748e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f12745b = rect3;
        Rect rect4 = new Rect();
        this.f12747d = rect4;
        Rect rect5 = new Rect();
        this.f12746c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i7 = -scaledTouchSlop;
        rect4.inset(i7, i7);
        rect5.set(rect2);
        this.f12744a = view;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean z8;
        int x3 = (int) motionEvent.getX();
        int y8 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z8 = this.f12749f;
                if (z8 && !this.f12747d.contains(x3, y8)) {
                    z10 = z8;
                    z3 = false;
                }
            } else if (action != 3) {
                z3 = true;
                z10 = false;
            } else {
                z8 = this.f12749f;
                this.f12749f = false;
            }
            z10 = z8;
            z3 = true;
        } else if (this.f12745b.contains(x3, y8)) {
            this.f12749f = true;
            z3 = true;
        } else {
            z3 = true;
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        Rect rect = this.f12746c;
        View view = this.f12744a;
        if (!z3 || rect.contains(x3, y8)) {
            motionEvent.setLocation(x3 - rect.left, y8 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
