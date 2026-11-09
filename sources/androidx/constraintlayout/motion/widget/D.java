package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.widget.SharedValues$SharedValuesListener;

/* JADX INFO: loaded from: classes.dex */
public final class D implements SharedValues$SharedValuesListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C f15251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ E2.a f15255e;

    public D(E2.a aVar, C c6, int i7, boolean z3, int i10) {
        this.f15255e = aVar;
        this.f15251a = c6;
        this.f15252b = i7;
        this.f15253c = z3;
        this.f15254d = i10;
    }

    @Override // androidx.constraintlayout.widget.SharedValues$SharedValuesListener
    public final void onNewValue(int i7, int i10, int i11) {
        C c6 = this.f15251a;
        int i12 = c6.f15250v;
        c6.f15250v = i10;
        if (this.f15252b != i7 || i12 == i10) {
            return;
        }
        E2.a aVar = this.f15255e;
        boolean z3 = this.f15253c;
        int i13 = 0;
        int i14 = this.f15254d;
        if (z3) {
            if (i14 == i10) {
                int childCount = ((MotionLayout) aVar.f2183b).getChildCount();
                while (i13 < childCount) {
                    MotionLayout motionLayout = (MotionLayout) aVar.f2183b;
                    View childAt = motionLayout.getChildAt(i13);
                    if (c6.b(childAt)) {
                        int currentState = motionLayout.getCurrentState();
                        c6.a(aVar, (MotionLayout) aVar.f2183b, currentState, motionLayout.n(currentState), childAt);
                    }
                    i13++;
                }
                return;
            }
            return;
        }
        if (i14 != i10) {
            int childCount2 = ((MotionLayout) aVar.f2183b).getChildCount();
            while (i13 < childCount2) {
                MotionLayout motionLayout2 = (MotionLayout) aVar.f2183b;
                View childAt2 = motionLayout2.getChildAt(i13);
                if (c6.b(childAt2)) {
                    int currentState2 = motionLayout2.getCurrentState();
                    c6.a(aVar, (MotionLayout) aVar.f2183b, currentState2, motionLayout2.n(currentState2), childAt2);
                }
                i13++;
            }
        }
    }
}
