package E4;

import G4.i;
import G4.j;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.listener.OnChartGestureListener;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public G4.d f2211A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f2212B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f2213C;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Matrix f2214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Matrix f2215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public G4.d f2216g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public G4.d f2217i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f2218j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f2219o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f2220p;
    public VelocityTracker t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f2221v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public G4.d f2222w;

    public static float d(MotionEvent motionEvent) {
        float x3 = motionEvent.getX(0) - motionEvent.getX(1);
        float y8 = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y8 * y8) + (x3 * x3));
    }

    public final void b(MotionEvent motionEvent, float f10, float f11) {
        this.f2234a = b.f2224b;
        this.f2214e.set(this.f2215f);
        OnChartGestureListener onChartGestureListener = ((BarLineChartBase) this.f2237d).getOnChartGestureListener();
        BarLineChartBase barLineChartBase = (BarLineChartBase) this.f2237d;
        barLineChartBase.f22377H0.getClass();
        barLineChartBase.f22378I0.getClass();
        this.f2214e.postTranslate(f10, f11);
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartTranslate(motionEvent, f10, f11);
        }
    }

    public final void c(MotionEvent motionEvent) {
        this.f2215f.set(this.f2214e);
        float x3 = motionEvent.getX();
        G4.d dVar = this.f2216g;
        dVar.f2987b = x3;
        dVar.f2988c = motionEvent.getY();
        BarLineChartBase barLineChartBase = (BarLineChartBase) this.f2237d;
        motionEvent.getX();
        motionEvent.getY();
        barLineChartBase.a();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.f2234a = b.f2230i;
        Chart chart = this.f2237d;
        OnChartGestureListener onChartGestureListener = ((BarLineChartBase) chart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartDoubleTapped(motionEvent);
        }
        if (!((BarLineChartBase) chart).f22390w0) {
            return super.onDoubleTap(motionEvent);
        }
        ((BarLineChartBase) chart).getData();
        throw null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.f2234a = b.f2232o;
        OnChartGestureListener onChartGestureListener = ((BarLineChartBase) this.f2237d).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartFling(motionEvent, motionEvent2, f10, f11);
        }
        return super.onFling(motionEvent, motionEvent2, f10, f11);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.f2234a = b.f2231j;
        OnChartGestureListener onChartGestureListener = ((BarLineChartBase) this.f2237d).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartLongPressed(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f2234a = b.f2229g;
        BarLineChartBase barLineChartBase = (BarLineChartBase) this.f2237d;
        OnChartGestureListener onChartGestureListener = barLineChartBase.getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartSingleTapped(motionEvent);
        }
        if (!barLineChartBase.f22402b) {
            return false;
        }
        motionEvent.getX();
        motionEvent.getY();
        barLineChartBase.a();
        this.f2237d.b(null);
        return super.onSingleTapUp(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01c4  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (this.t == null) {
            this.t = VelocityTracker.obtain();
        }
        this.t.addMovement(motionEvent);
        if (motionEvent.getActionMasked() == 3 && (velocityTracker = this.t) != null) {
            velocityTracker.recycle();
            this.t = null;
        }
        if (this.f2235b == 0) {
            this.f2236c.onTouchEvent(motionEvent);
        }
        Chart chart = this.f2237d;
        BarLineChartBase barLineChartBase = (BarLineChartBase) chart;
        int i7 = 0;
        if (!(barLineChartBase.f22392y0 || barLineChartBase.f22393z0) && !barLineChartBase.f22370A0 && !barLineChartBase.f22371B0) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            OnChartGestureListener onChartGestureListener = this.f2237d.getOnChartGestureListener();
            if (onChartGestureListener != null) {
                onChartGestureListener.onChartGestureStart(motionEvent, this.f2234a);
            }
            G4.d dVar = this.f2211A;
            dVar.f2987b = 0.0f;
            dVar.f2988c = 0.0f;
            c(motionEvent);
        } else if (action != 1) {
            G4.d dVar2 = this.f2217i;
            if (action == 2) {
                int i10 = this.f2235b;
                G4.d dVar3 = this.f2216g;
                if (i10 == 1) {
                    ViewParent parent = barLineChartBase.getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    b(motionEvent, barLineChartBase.f22392y0 ? motionEvent.getX() - dVar3.f2987b : 0.0f, barLineChartBase.f22393z0 ? motionEvent.getY() - dVar3.f2988c : 0.0f);
                } else if (i10 == 2 || i10 == 3 || i10 == 4) {
                    ViewParent parent2 = barLineChartBase.getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    if ((barLineChartBase.f22370A0 || barLineChartBase.f22371B0) && motionEvent.getPointerCount() >= 2) {
                        OnChartGestureListener onChartGestureListener2 = barLineChartBase.getOnChartGestureListener();
                        float fD = d(motionEvent);
                        if (fD > this.f2213C) {
                            float f10 = dVar2.f2987b;
                            float f11 = dVar2.f2988c;
                            BarLineChartBase barLineChartBase2 = (BarLineChartBase) this.f2237d;
                            j viewPortHandler = barLineChartBase2.getViewPortHandler();
                            float f12 = f10 - viewPortHandler.f3007b.left;
                            BarLineChartBase barLineChartBase3 = (BarLineChartBase) this.f2237d;
                            barLineChartBase3.f22377H0.getClass();
                            barLineChartBase3.f22378I0.getClass();
                            G4.d dVarB = G4.d.b(f12, -((barLineChartBase2.getMeasuredHeight() - f11) - viewPortHandler.b()));
                            j viewPortHandler2 = barLineChartBase.getViewPortHandler();
                            int i11 = this.f2235b;
                            Matrix matrix = this.f2215f;
                            if (i11 == 4) {
                                this.f2234a = b.f2227e;
                                float f13 = fD / this.f2220p;
                                boolean z3 = f13 < 1.0f;
                                boolean z8 = !z3 ? viewPortHandler2.f3014i >= viewPortHandler2.f3013h : viewPortHandler2.f3014i <= viewPortHandler2.f3012g;
                                if (!z3 ? viewPortHandler2.f3015j < viewPortHandler2.f3011f : viewPortHandler2.f3015j > viewPortHandler2.f3010e) {
                                    i7 = 1;
                                }
                                float f14 = barLineChartBase.f22370A0 ? f13 : 1.0f;
                                if (!barLineChartBase.f22371B0) {
                                    f13 = 1.0f;
                                }
                                if (i7 != 0 || z8) {
                                    this.f2214e.set(matrix);
                                    this.f2214e.postScale(f14, f13, dVarB.f2987b, dVarB.f2988c);
                                    if (onChartGestureListener2 != null) {
                                        onChartGestureListener2.onChartScale(motionEvent, f14, f13);
                                    }
                                }
                            } else if (i11 == 2 && barLineChartBase.f22370A0) {
                                this.f2234a = b.f2225c;
                                float fAbs = Math.abs(motionEvent.getX(0) - motionEvent.getX(1)) / this.f2218j;
                                if (fAbs >= 1.0f ? viewPortHandler2.f3014i < viewPortHandler2.f3013h : viewPortHandler2.f3014i > viewPortHandler2.f3012g) {
                                    this.f2214e.set(matrix);
                                    this.f2214e.postScale(fAbs, 1.0f, dVarB.f2987b, dVarB.f2988c);
                                    if (onChartGestureListener2 != null) {
                                        onChartGestureListener2.onChartScale(motionEvent, fAbs, 1.0f);
                                    }
                                }
                            } else if (i11 == 3 && barLineChartBase.f22371B0) {
                                this.f2234a = b.f2226d;
                                float fAbs2 = Math.abs(motionEvent.getY(0) - motionEvent.getY(1)) / this.f2219o;
                                if (fAbs2 >= 1.0f ? viewPortHandler2.f3015j < viewPortHandler2.f3011f : viewPortHandler2.f3015j > viewPortHandler2.f3010e) {
                                    this.f2214e.set(matrix);
                                    this.f2214e.postScale(1.0f, fAbs2, dVarB.f2987b, dVarB.f2988c);
                                    if (onChartGestureListener2 != null) {
                                        onChartGestureListener2.onChartScale(motionEvent, 1.0f, fAbs2);
                                    }
                                }
                            }
                            G4.d.c(dVarB);
                        }
                    }
                } else if (i10 == 0) {
                    float x3 = motionEvent.getX() - dVar3.f2987b;
                    float y8 = motionEvent.getY() - dVar3.f2988c;
                    if (Math.abs((float) Math.sqrt((y8 * y8) + (x3 * x3))) > this.f2212B && (barLineChartBase.f22392y0 || barLineChartBase.f22393z0)) {
                        j jVar = barLineChartBase.f22397H;
                        float f15 = jVar.f3014i;
                        float f16 = jVar.f3012g;
                        if (f15 <= f16 && f16 <= 1.0f) {
                            i7 = 1;
                        }
                        b bVar = b.f2224b;
                        if (i7 != 0) {
                            float f17 = jVar.f3015j;
                            float f18 = jVar.f3010e;
                            if (f17 > f18 || f18 > 1.0f || jVar.f3017l > 0.0f || jVar.f3018m > 0.0f) {
                                float fAbs3 = Math.abs(motionEvent.getX() - dVar3.f2987b);
                                float fAbs4 = Math.abs(motionEvent.getY() - dVar3.f2988c);
                                if ((barLineChartBase.f22392y0 || fAbs4 >= fAbs3) && (barLineChartBase.f22393z0 || fAbs4 <= fAbs3)) {
                                    this.f2234a = bVar;
                                    this.f2235b = 1;
                                }
                            } else {
                                boolean z10 = barLineChartBase.f22391x0;
                                if (z10) {
                                    this.f2234a = bVar;
                                    if (z10) {
                                        motionEvent.getX();
                                        motionEvent.getY();
                                        barLineChartBase.a();
                                    }
                                }
                            }
                        } else {
                            float fAbs5 = Math.abs(motionEvent.getX() - dVar3.f2987b);
                            float fAbs6 = Math.abs(motionEvent.getY() - dVar3.f2988c);
                            if (barLineChartBase.f22392y0) {
                                this.f2234a = bVar;
                                this.f2235b = 1;
                            } else {
                                this.f2234a = bVar;
                                this.f2235b = 1;
                            }
                        }
                    }
                }
            } else if (action == 3) {
                this.f2235b = 0;
                a(motionEvent);
            } else if (action != 5) {
                if (action == 6) {
                    VelocityTracker velocityTracker2 = this.t;
                    velocityTracker2.computeCurrentVelocity(1000, i.f3004c);
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    float xVelocity = velocityTracker2.getXVelocity(pointerId);
                    float yVelocity = velocityTracker2.getYVelocity(pointerId);
                    int pointerCount = motionEvent.getPointerCount();
                    while (i7 < pointerCount) {
                        if (i7 != actionIndex) {
                            int pointerId2 = motionEvent.getPointerId(i7);
                            if ((velocityTracker2.getYVelocity(pointerId2) * yVelocity) + (velocityTracker2.getXVelocity(pointerId2) * xVelocity) < 0.0f) {
                                velocityTracker2.clear();
                                break;
                            }
                        }
                        i7++;
                    }
                    this.f2235b = 5;
                }
            } else if (motionEvent.getPointerCount() >= 2) {
                ViewParent parent3 = barLineChartBase.getParent();
                if (parent3 != null) {
                    parent3.requestDisallowInterceptTouchEvent(true);
                }
                c(motionEvent);
                this.f2218j = Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
                this.f2219o = Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
                float fD2 = d(motionEvent);
                this.f2220p = fD2;
                if (fD2 > 10.0f) {
                    if (barLineChartBase.f22389v0) {
                        this.f2235b = 4;
                    } else {
                        boolean z11 = barLineChartBase.f22370A0;
                        if (z11 != barLineChartBase.f22371B0) {
                            this.f2235b = z11 ? 2 : 3;
                        } else {
                            this.f2235b = this.f2218j > this.f2219o ? 2 : 3;
                        }
                    }
                }
                float x7 = motionEvent.getX(1) + motionEvent.getX(0);
                float y10 = motionEvent.getY(1) + motionEvent.getY(0);
                dVar2.f2987b = x7 / 2.0f;
                dVar2.f2988c = y10 / 2.0f;
            }
        } else {
            VelocityTracker velocityTracker3 = this.t;
            int pointerId3 = motionEvent.getPointerId(0);
            velocityTracker3.computeCurrentVelocity(1000, i.f3004c);
            float yVelocity2 = velocityTracker3.getYVelocity(pointerId3);
            float xVelocity2 = velocityTracker3.getXVelocity(pointerId3);
            if ((Math.abs(xVelocity2) > i.f3003b || Math.abs(yVelocity2) > i.f3003b) && this.f2235b == 1 && barLineChartBase.f22403c) {
                G4.d dVar4 = this.f2211A;
                dVar4.f2987b = 0.0f;
                dVar4.f2988c = 0.0f;
                this.f2221v = AnimationUtils.currentAnimationTimeMillis();
                float x10 = motionEvent.getX();
                G4.d dVar5 = this.f2222w;
                dVar5.f2987b = x10;
                dVar5.f2988c = motionEvent.getY();
                G4.d dVar6 = this.f2211A;
                dVar6.f2987b = xVelocity2;
                dVar6.f2988c = yVelocity2;
                chart.postInvalidateOnAnimation();
            }
            int i12 = this.f2235b;
            if (i12 == 2 || i12 == 3 || i12 == 4 || i12 == 5) {
                barLineChartBase.f();
                barLineChartBase.postInvalidate();
            }
            this.f2235b = 0;
            ViewParent parent4 = barLineChartBase.getParent();
            if (parent4 != null) {
                parent4.requestDisallowInterceptTouchEvent(false);
            }
            VelocityTracker velocityTracker4 = this.t;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
                this.t = null;
            }
            a(motionEvent);
        }
        j viewPortHandler3 = barLineChartBase.getViewPortHandler();
        Matrix matrix2 = this.f2214e;
        viewPortHandler3.c(matrix2, chart, true);
        this.f2214e = matrix2;
        return true;
    }
}
