package E4;

import G4.i;
import N8.q0;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public G4.d f2240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f2241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f2242g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f2243i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f2244j;

    public final void b(float f10, float f11) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        ArrayList arrayList = this.f2242g;
        float fE = ((PieRadarChartBase) this.f2237d).e(f10, f11);
        d dVar = new d();
        dVar.f2238a = jCurrentAnimationTimeMillis;
        dVar.f2239b = fE;
        arrayList.add(dVar);
        for (int size = arrayList.size(); size - 2 > 0 && jCurrentAnimationTimeMillis - ((d) arrayList.get(0)).f2238a > 1000; size--) {
            arrayList.remove(0);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.f2234a = b.f2231j;
        OnChartGestureListener onChartGestureListener = ((PieRadarChartBase) this.f2237d).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartLongPressed(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f2234a = b.f2229g;
        PieRadarChartBase pieRadarChartBase = (PieRadarChartBase) this.f2237d;
        OnChartGestureListener onChartGestureListener = pieRadarChartBase.getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartSingleTapped(motionEvent);
        }
        if (!pieRadarChartBase.f22402b) {
            return false;
        }
        motionEvent.getX();
        motionEvent.getY();
        pieRadarChartBase.a();
        this.f2237d.b(null);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float fAbs;
        Chart chart = this.f2237d;
        if (!this.f2236c.onTouchEvent(motionEvent)) {
            PieRadarChartBase pieRadarChartBase = (PieRadarChartBase) chart;
            if (pieRadarChartBase.f22436w0) {
                float x3 = motionEvent.getX();
                float y8 = motionEvent.getY();
                int action = motionEvent.getAction();
                ArrayList arrayList = this.f2242g;
                G4.d dVar = this.f2240e;
                if (action == 0) {
                    OnChartGestureListener onChartGestureListener = chart.getOnChartGestureListener();
                    if (onChartGestureListener != null) {
                        onChartGestureListener.onChartGestureStart(motionEvent, this.f2234a);
                    }
                    this.f2244j = 0.0f;
                    arrayList.clear();
                    if (pieRadarChartBase.f22403c) {
                        b(x3, y8);
                    }
                    this.f2241f = pieRadarChartBase.e(x3, y8) - pieRadarChartBase.getRawRotationAngle();
                    dVar.f2987b = x3;
                    dVar.f2988c = y8;
                } else {
                    if (action == 1) {
                        if (pieRadarChartBase.f22403c) {
                            this.f2244j = 0.0f;
                            b(x3, y8);
                            if (arrayList.isEmpty()) {
                                fAbs = 0.0f;
                            } else {
                                d dVar2 = (d) arrayList.get(0);
                                d dVar3 = (d) q0.i(1, arrayList);
                                d dVar4 = dVar2;
                                for (int size = arrayList.size() - 1; size >= 0; size--) {
                                    dVar4 = (d) arrayList.get(size);
                                    if (dVar4.f2239b != dVar3.f2239b) {
                                        break;
                                    }
                                }
                                float f10 = (dVar3.f2238a - dVar2.f2238a) / 1000.0f;
                                if (f10 == 0.0f) {
                                    f10 = 0.1f;
                                }
                                float f11 = dVar3.f2239b;
                                float f12 = dVar4.f2239b;
                                boolean z3 = f11 >= f12;
                                if (Math.abs(f11 - f12) > 270.0d) {
                                    z3 = !z3;
                                }
                                float f13 = dVar3.f2239b;
                                float f14 = dVar2.f2239b;
                                if (f13 - f14 > 180.0d) {
                                    dVar2.f2239b = (float) (((double) f14) + 360.0d);
                                } else if (f14 - f13 > 180.0d) {
                                    dVar3.f2239b = (float) (((double) f13) + 360.0d);
                                }
                                fAbs = Math.abs((dVar3.f2239b - dVar2.f2239b) / f10);
                                if (!z3) {
                                    fAbs = -fAbs;
                                }
                            }
                            this.f2244j = fAbs;
                            if (fAbs != 0.0f) {
                                this.f2243i = AnimationUtils.currentAnimationTimeMillis();
                                DisplayMetrics displayMetrics = i.f3002a;
                                chart.postInvalidateOnAnimation();
                            }
                        }
                        ViewParent parent = pieRadarChartBase.getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(false);
                        }
                        this.f2235b = 0;
                        a(motionEvent);
                        return true;
                    }
                    if (action == 2) {
                        if (pieRadarChartBase.f22403c) {
                            b(x3, y8);
                        }
                        if (this.f2235b == 0) {
                            float f15 = x3 - dVar.f2987b;
                            float f16 = y8 - dVar.f2988c;
                            if (((float) Math.sqrt((f16 * f16) + (f15 * f15))) > i.b(8.0f)) {
                                this.f2234a = b.f2228f;
                                this.f2235b = 6;
                                ViewParent parent2 = pieRadarChartBase.getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                            } else if (this.f2235b == 6) {
                                pieRadarChartBase.setRotationAngle(pieRadarChartBase.e(x3, y8) - this.f2241f);
                                pieRadarChartBase.invalidate();
                            }
                        } else if (this.f2235b == 6) {
                            pieRadarChartBase.setRotationAngle(pieRadarChartBase.e(x3, y8) - this.f2241f);
                            pieRadarChartBase.invalidate();
                        }
                        a(motionEvent);
                        return true;
                    }
                }
            }
        }
        return true;
    }
}
