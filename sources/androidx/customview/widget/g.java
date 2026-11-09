package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.core.view.N;
import com.google.logging.type.LogSeverity;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final d f16390x = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16392b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f16394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f16395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f16396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f16397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f16398h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f16399i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f16400j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16401k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VelocityTracker f16402l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f16403m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f16404n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16405o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f16406p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16407q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final OverScroller f16408r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f16409s;
    public View t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f16410u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ViewGroup f16411v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16393c = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f16412w = new e(this, 0);

    public g(Context context, ViewGroup viewGroup, f fVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (fVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f16411v = viewGroup;
        this.f16409s = fVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i7 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f16406p = i7;
        this.f16405o = i7;
        this.f16392b = viewConfiguration.getScaledTouchSlop();
        this.f16403m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f16404n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f16408r = new OverScroller(context, f16390x);
    }

    public static g i(ViewGroup viewGroup, float f10, f fVar) {
        g gVar = new g(viewGroup.getContext(), viewGroup, fVar);
        gVar.f16392b = (int) ((1.0f / f10) * gVar.f16392b);
        return gVar;
    }

    public static boolean m(View view, int i7, int i10) {
        return view != null && i7 >= view.getLeft() && i7 < view.getRight() && i10 >= view.getTop() && i10 < view.getBottom();
    }

    public final void a() {
        b();
        if (this.f16391a == 2) {
            OverScroller overScroller = this.f16408r;
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            overScroller.abortAnimation();
            int currX2 = overScroller.getCurrX();
            int currY2 = overScroller.getCurrY();
            this.f16409s.onViewPositionChanged(this.t, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        s(0);
    }

    public final void b() {
        this.f16393c = -1;
        float[] fArr = this.f16394d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f16395e, 0.0f);
            Arrays.fill(this.f16396f, 0.0f);
            Arrays.fill(this.f16397g, 0.0f);
            Arrays.fill(this.f16398h, 0);
            Arrays.fill(this.f16399i, 0);
            Arrays.fill(this.f16400j, 0);
            this.f16401k = 0;
        }
        VelocityTracker velocityTracker = this.f16402l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f16402l = null;
        }
    }

    public final void c(int i7, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f16411v;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.t = view;
        this.f16393c = i7;
        this.f16409s.onViewCaptured(view, i7);
        s(1);
    }

    public final boolean d(float f10, float f11, int i7, int i10) {
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        if ((this.f16398h[i7] & i10) == i10 && (this.f16407q & i10) != 0 && (this.f16400j[i7] & i10) != i10 && (this.f16399i[i7] & i10) != i10) {
            float f12 = this.f16392b;
            if (fAbs > f12 || fAbs2 > f12) {
                if (fAbs < fAbs2 * 0.5f && this.f16409s.onEdgeLock(i10)) {
                    int[] iArr = this.f16400j;
                    iArr[i7] = iArr[i7] | i10;
                    return false;
                }
                if ((this.f16399i[i7] & i10) == 0 && fAbs > this.f16392b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean e(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        f fVar = this.f16409s;
        boolean z3 = fVar.getViewHorizontalDragRange(view) > 0;
        boolean z8 = fVar.getViewVerticalDragRange(view) > 0;
        if (z3 && z8) {
            float f12 = (f11 * f11) + (f10 * f10);
            int i7 = this.f16392b;
            return f12 > ((float) (i7 * i7));
        }
        if (z3) {
            return Math.abs(f10) > ((float) this.f16392b);
        }
        return z8 && Math.abs(f11) > ((float) this.f16392b);
    }

    public final void f(int i7) {
        float[] fArr = this.f16394d;
        if (fArr != null) {
            int i10 = this.f16401k;
            int i11 = 1 << i7;
            if ((i10 & i11) != 0) {
                fArr[i7] = 0.0f;
                this.f16395e[i7] = 0.0f;
                this.f16396f[i7] = 0.0f;
                this.f16397g[i7] = 0.0f;
                this.f16398h[i7] = 0;
                this.f16399i[i7] = 0;
                this.f16400j[i7] = 0;
                this.f16401k = (~i11) & i10;
            }
        }
    }

    public final int g(int i7, int i10, int i11) {
        if (i7 == 0) {
            return 0;
        }
        int width = this.f16411v.getWidth();
        float f10 = width / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i7) / width) - 0.5f) * 0.47123894f)) * f10) + f10;
        int iAbs = Math.abs(i10);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i7) / i11) + 1.0f) * 256.0f), LogSeverity.CRITICAL_VALUE);
    }

    public final boolean h() {
        if (this.f16391a == 2) {
            OverScroller overScroller = this.f16408r;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.t.getLeft();
            int top2 = currY - this.t.getTop();
            if (left != 0) {
                View view = this.t;
                WeakHashMap weakHashMap = N.f16168a;
                view.offsetLeftAndRight(left);
            }
            if (top2 != 0) {
                View view2 = this.t;
                WeakHashMap weakHashMap2 = N.f16168a;
                view2.offsetTopAndBottom(top2);
            }
            if (left != 0 || top2 != 0) {
                this.f16409s.onViewPositionChanged(this.t, currX, currY, left, top2);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f16411v.post(this.f16412w);
            }
        }
        return this.f16391a == 2;
    }

    public final View j(int i7, int i10) {
        ViewGroup viewGroup = this.f16411v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(this.f16409s.getOrderedChildIndex(childCount));
            if (i7 >= childAt.getLeft() && i7 < childAt.getRight() && i10 >= childAt.getTop() && i10 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean k(int i7, int i10, int i11, int i12) {
        float f10;
        float f11;
        float f12;
        float f13;
        int left = this.t.getLeft();
        int top2 = this.t.getTop();
        int i13 = i7 - left;
        int i14 = i10 - top2;
        OverScroller overScroller = this.f16408r;
        if (i13 == 0 && i14 == 0) {
            overScroller.abortAnimation();
            s(0);
            return false;
        }
        View view = this.t;
        int i15 = (int) this.f16404n;
        int i16 = (int) this.f16403m;
        int iAbs = Math.abs(i11);
        if (iAbs < i15) {
            i11 = 0;
        } else if (iAbs > i16) {
            i11 = i11 > 0 ? i16 : -i16;
        }
        int i17 = (int) this.f16404n;
        int iAbs2 = Math.abs(i12);
        if (iAbs2 < i17) {
            i12 = 0;
        } else if (iAbs2 > i16) {
            i12 = i12 > 0 ? i16 : -i16;
        }
        int iAbs3 = Math.abs(i13);
        int iAbs4 = Math.abs(i14);
        int iAbs5 = Math.abs(i11);
        int iAbs6 = Math.abs(i12);
        int i18 = iAbs5 + iAbs6;
        int i19 = iAbs3 + iAbs4;
        if (i11 != 0) {
            f10 = iAbs5;
            f11 = i18;
        } else {
            f10 = iAbs3;
            f11 = i19;
        }
        float f14 = f10 / f11;
        if (i12 != 0) {
            f12 = iAbs6;
            f13 = i18;
        } else {
            f12 = iAbs4;
            f13 = i19;
        }
        float f15 = f12 / f13;
        f fVar = this.f16409s;
        overScroller.startScroll(left, top2, i13, i14, (int) ((g(i14, i12, fVar.getViewVerticalDragRange(view)) * f15) + (g(i13, i11, fVar.getViewHorizontalDragRange(view)) * f14)));
        s(2);
        return true;
    }

    public final boolean l(int i7) {
        if ((this.f16401k & (1 << i7)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i7 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void n(MotionEvent motionEvent) {
        int i7;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.f16402l == null) {
            this.f16402l = VelocityTracker.obtain();
        }
        this.f16402l.addMovement(motionEvent);
        int i10 = 0;
        f fVar = this.f16409s;
        if (actionMasked == 0) {
            float x3 = motionEvent.getX();
            float y8 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewJ = j((int) x3, (int) y8);
            q(x3, y8, pointerId);
            w(pointerId, viewJ);
            int i11 = this.f16398h[pointerId] & this.f16407q;
            if (i11 != 0) {
                fVar.onEdgeTouched(i11, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f16391a == 1) {
                o();
            }
            b();
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f16391a == 1) {
                    this.f16410u = true;
                    fVar.onViewReleased(this.t, 0.0f, 0.0f);
                    this.f16410u = false;
                    if (this.f16391a == 1) {
                        s(0);
                    }
                }
                b();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x7 = motionEvent.getX(actionIndex);
                float y10 = motionEvent.getY(actionIndex);
                q(x7, y10, pointerId2);
                if (this.f16391a != 0) {
                    if (m(this.t, (int) x7, (int) y10)) {
                        w(pointerId2, this.t);
                        return;
                    }
                    return;
                }
                w(pointerId2, j((int) x7, (int) y10));
                int i12 = this.f16398h[pointerId2] & this.f16407q;
                if (i12 != 0) {
                    fVar.onEdgeTouched(i12, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f16391a == 1 && pointerId3 == this.f16393c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i10 >= pointerCount) {
                        i7 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i10);
                    if (pointerId4 != this.f16393c) {
                        View viewJ2 = j((int) motionEvent.getX(i10), (int) motionEvent.getY(i10));
                        View view = this.t;
                        if (viewJ2 == view && w(pointerId4, view)) {
                            i7 = this.f16393c;
                            break;
                        }
                    }
                    i10++;
                }
                if (i7 == -1) {
                    o();
                }
            }
            f(pointerId3);
            return;
        }
        if (this.f16391a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i10 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i10);
                if (l(pointerId5)) {
                    float x10 = motionEvent.getX(i10);
                    float y11 = motionEvent.getY(i10);
                    float f10 = x10 - this.f16394d[pointerId5];
                    float f11 = y11 - this.f16395e[pointerId5];
                    p(f10, f11, pointerId5);
                    if (this.f16391a != 1) {
                        View viewJ3 = j((int) x10, (int) y11);
                        if (e(viewJ3, f10, f11) && w(pointerId5, viewJ3)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i10++;
            }
            r(motionEvent);
            return;
        }
        if (l(this.f16393c)) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f16393c);
            float x11 = motionEvent.getX(iFindPointerIndex);
            float y12 = motionEvent.getY(iFindPointerIndex);
            float[] fArr = this.f16396f;
            int i13 = this.f16393c;
            int i14 = (int) (x11 - fArr[i13]);
            int i15 = (int) (y12 - this.f16397g[i13]);
            int left = this.t.getLeft() + i14;
            int top2 = this.t.getTop() + i15;
            int left2 = this.t.getLeft();
            int top3 = this.t.getTop();
            if (i14 != 0) {
                left = fVar.clampViewPositionHorizontal(this.t, left, i14);
                WeakHashMap weakHashMap = N.f16168a;
                this.t.offsetLeftAndRight(left - left2);
            }
            int i16 = left;
            if (i15 != 0) {
                top2 = fVar.clampViewPositionVertical(this.t, top2, i15);
                WeakHashMap weakHashMap2 = N.f16168a;
                this.t.offsetTopAndBottom(top2 - top3);
            }
            int i17 = top2;
            if (i14 != 0 || i15 != 0) {
                this.f16409s.onViewPositionChanged(this.t, i16, i17, i16 - left2, i17 - top3);
            }
            r(motionEvent);
        }
    }

    public final void o() {
        VelocityTracker velocityTracker = this.f16402l;
        float f10 = this.f16403m;
        velocityTracker.computeCurrentVelocity(1000, f10);
        float xVelocity = this.f16402l.getXVelocity(this.f16393c);
        float f11 = this.f16404n;
        float fAbs = Math.abs(xVelocity);
        if (fAbs < f11) {
            xVelocity = 0.0f;
        } else if (fAbs > f10) {
            xVelocity = xVelocity > 0.0f ? f10 : -f10;
        }
        float yVelocity = this.f16402l.getYVelocity(this.f16393c);
        float f12 = this.f16404n;
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f12) {
            f10 = 0.0f;
        } else if (fAbs2 <= f10) {
            f10 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f10 = -f10;
        }
        this.f16410u = true;
        this.f16409s.onViewReleased(this.t, xVelocity, f10);
        this.f16410u = false;
        if (this.f16391a == 1) {
            s(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.customview.widget.f] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void p(float f10, float f11, int i7) {
        int i10;
        boolean zD = d(f10, f11, i7, 1);
        ?? r3 = zD;
        if (d(f11, f10, i7, 4)) {
            r3 = (zD ? 1 : 0) | 4;
        }
        ?? r10 = r3;
        if (d(f10, f11, i7, 2)) {
            r10 = (r3 == true ? 1 : 0) | 2;
        }
        ?? r11 = r10;
        if (d(f11, f10, i7, 8)) {
            i10 = (r10 == true ? 1 : 0) | 8;
        }
        if (r11 == 0) {
            r11 = i10;
            return;
        }
        r11 = i10;
        int[] iArr = this.f16399i;
        iArr[i7] = (iArr[i7] | r11) == true ? 1 : 0;
        this.f16409s.onEdgeDragStarted(r11, i7);
    }

    public final void q(float f10, float f11, int i7) {
        float[] fArr = this.f16394d;
        if (fArr == null || fArr.length <= i7) {
            int i10 = i7 + 1;
            float[] fArr2 = new float[i10];
            float[] fArr3 = new float[i10];
            float[] fArr4 = new float[i10];
            float[] fArr5 = new float[i10];
            int[] iArr = new int[i10];
            int[] iArr2 = new int[i10];
            int[] iArr3 = new int[i10];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f16395e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f16396f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f16397g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f16398h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f16399i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f16400j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f16394d = fArr2;
            this.f16395e = fArr3;
            this.f16396f = fArr4;
            this.f16397g = fArr5;
            this.f16398h = iArr;
            this.f16399i = iArr2;
            this.f16400j = iArr3;
        }
        float[] fArr9 = this.f16394d;
        this.f16396f[i7] = f10;
        fArr9[i7] = f10;
        float[] fArr10 = this.f16395e;
        this.f16397g[i7] = f11;
        fArr10[i7] = f11;
        int[] iArr7 = this.f16398h;
        int i11 = (int) f10;
        int i12 = (int) f11;
        ViewGroup viewGroup = this.f16411v;
        int i13 = i11 < viewGroup.getLeft() + this.f16405o ? 1 : 0;
        if (i12 < viewGroup.getTop() + this.f16405o) {
            i13 |= 4;
        }
        if (i11 > viewGroup.getRight() - this.f16405o) {
            i13 |= 2;
        }
        if (i12 > viewGroup.getBottom() - this.f16405o) {
            i13 |= 8;
        }
        iArr7[i7] = i13;
        this.f16401k |= 1 << i7;
    }

    public final void r(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i7 = 0; i7 < pointerCount; i7++) {
            int pointerId = motionEvent.getPointerId(i7);
            if (l(pointerId)) {
                float x3 = motionEvent.getX(i7);
                float y8 = motionEvent.getY(i7);
                this.f16396f[pointerId] = x3;
                this.f16397g[pointerId] = y8;
            }
        }
    }

    public final void s(int i7) {
        this.f16411v.removeCallbacks(this.f16412w);
        if (this.f16391a != i7) {
            this.f16391a = i7;
            this.f16409s.onViewDragStateChanged(i7);
            if (this.f16391a == 0) {
                this.t = null;
            }
        }
    }

    public final boolean t(int i7, int i10) {
        if (this.f16410u) {
            return k(i7, i10, (int) this.f16402l.getXVelocity(this.f16393c), (int) this.f16402l.getYVelocity(this.f16393c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00de  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f6  */
    public final boolean u(MotionEvent motionEvent) {
        View viewJ;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        if (this.f16402l == null) {
            this.f16402l = VelocityTracker.obtain();
        }
        this.f16402l.addMovement(motionEvent);
        f fVar = this.f16409s;
        if (actionMasked == 0) {
            float x3 = motionEvent.getX();
            float y8 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            q(x3, y8, pointerId);
            View viewJ2 = j((int) x3, (int) y8);
            if (viewJ2 == this.t && this.f16391a == 2) {
                w(pointerId, viewJ2);
            }
            int i7 = this.f16398h[pointerId] & this.f16407q;
            if (i7 != 0) {
                fVar.onEdgeTouched(i7, pointerId);
            }
        } else if (actionMasked == 1) {
            b();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                b();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x7 = motionEvent.getX(actionIndex);
                float y10 = motionEvent.getY(actionIndex);
                q(x7, y10, pointerId2);
                int i10 = this.f16391a;
                if (i10 == 0) {
                    int i11 = this.f16398h[pointerId2] & this.f16407q;
                    if (i11 != 0) {
                        fVar.onEdgeTouched(i11, pointerId2);
                    }
                } else if (i10 == 2 && (viewJ = j((int) x7, (int) y10)) == this.t) {
                    w(pointerId2, viewJ);
                }
            } else if (actionMasked == 6) {
                f(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f16394d != null && this.f16395e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i12 = 0; i12 < pointerCount; i12++) {
                int pointerId3 = motionEvent.getPointerId(i12);
                if (l(pointerId3)) {
                    float x10 = motionEvent.getX(i12);
                    float y11 = motionEvent.getY(i12);
                    float f10 = x10 - this.f16394d[pointerId3];
                    float f11 = y11 - this.f16395e[pointerId3];
                    View viewJ3 = j((int) x10, (int) y11);
                    boolean z3 = viewJ3 != null && e(viewJ3, f10, f11);
                    if (!z3) {
                        p(f10, f11, pointerId3);
                        if (this.f16391a != 1) {
                            break;
                        }
                    } else {
                        int left = viewJ3.getLeft();
                        int i13 = (int) f10;
                        int iClampViewPositionHorizontal = fVar.clampViewPositionHorizontal(viewJ3, left + i13, i13);
                        int top2 = viewJ3.getTop();
                        int i14 = (int) f11;
                        int iClampViewPositionVertical = fVar.clampViewPositionVertical(viewJ3, top2 + i14, i14);
                        int viewHorizontalDragRange = fVar.getViewHorizontalDragRange(viewJ3);
                        int viewVerticalDragRange = fVar.getViewVerticalDragRange(viewJ3);
                        if ((viewHorizontalDragRange == 0 || (viewHorizontalDragRange > 0 && iClampViewPositionHorizontal == left)) && (viewVerticalDragRange == 0 || (viewVerticalDragRange > 0 && iClampViewPositionVertical == top2))) {
                            break;
                        }
                        p(f10, f11, pointerId3);
                        if (this.f16391a != 1 || (z3 && w(pointerId3, viewJ3))) {
                            break;
                        }
                    }
                }
            }
            r(motionEvent);
        }
        return this.f16391a == 1;
    }

    public final boolean v(View view, int i7, int i10) {
        this.t = view;
        this.f16393c = -1;
        boolean zK = k(i7, i10, 0, 0);
        if (!zK && this.f16391a == 0 && this.t != null) {
            this.t = null;
        }
        return zK;
    }

    public final boolean w(int i7, View view) {
        if (view == this.t && this.f16393c == i7) {
            return true;
        }
        if (view == null || !this.f16409s.tryCaptureView(view, i7)) {
            return false;
        }
        this.f16393c = i7;
        c(i7, view);
        return true;
    }
}
