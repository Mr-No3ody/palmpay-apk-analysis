package com.daimajia.swipe;

import C9.ViewOnClickListenerC0146m;
import Y1.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import androidx.core.view.N;
import androidx.customview.widget.g;
import com.transsnet.palmpay.custom_view.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SwipeLayout extends FrameLayout {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ int f21093u0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean[] f21094A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f21095B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f21096C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f21097H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f21098L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ArrayList f21099M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f21100Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Y1.b f21102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f21103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f21105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Y1.c f21106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f21107g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f21108i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f21109j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public float f21110k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final HashMap f21111o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HashMap f21112p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f21113p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public View.OnClickListener f21114q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public View.OnLongClickListener f21115r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Rect f21116s0;
    public final HashMap t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final GestureDetector f21117t0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public DoubleClickListener f21118v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f21119w;

    public interface DoubleClickListener {
        void onDoubleClick(SwipeLayout swipeLayout, boolean z3);
    }

    public interface OnLayout {
        void onLayout(SwipeLayout swipeLayout);
    }

    public interface OnRevealListener {
        void onReveal(View view, Y1.b bVar, float f10, int i7);
    }

    public interface SwipeDenier {
        boolean shouldDenySwipe(MotionEvent motionEvent);
    }

    public interface SwipeListener {
        void onClose(SwipeLayout swipeLayout);

        void onHandRelease(SwipeLayout swipeLayout, float f10, float f11);

        void onOpen(SwipeLayout swipeLayout);

        void onStartClose(SwipeLayout swipeLayout);

        void onStartOpen(SwipeLayout swipeLayout);

        void onUpdate(SwipeLayout swipeLayout, int i7, int i10);
    }

    public SwipeLayout(Context context) {
        this(context, null);
    }

    private AdapterView getAdapterView() {
        ViewParent parent = getParent();
        if (parent instanceof AdapterView) {
            return (AdapterView) parent;
        }
        return null;
    }

    private float getCurrentOffset() {
        Y1.b bVar = this.f21102b;
        if (bVar == null) {
            return 0.0f;
        }
        return this.f21107g[bVar.ordinal()];
    }

    private void setCurrentDragEdge(Y1.b bVar) {
        this.f21102b = bVar;
        k();
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0102  */
    public final void a(MotionEvent motionEvent) {
        boolean z3;
        boolean z8;
        View view;
        Y1.b bVar;
        View view2;
        View view3;
        View view4;
        if (this.f21100Q) {
            return;
        }
        d openStatus = getOpenStatus();
        d dVar = d.f11280a;
        if (openStatus == dVar) {
            this.f21100Q = true;
            return;
        }
        d openStatus2 = getOpenStatus();
        float rawX = motionEvent.getRawX() - this.f21110k0;
        float rawY = motionEvent.getRawY() - this.f21113p0;
        float degrees = (float) Math.toDegrees(Math.atan(Math.abs(rawY / rawX)));
        d openStatus3 = getOpenStatus();
        d dVar2 = d.f11282c;
        Y1.b bVar2 = Y1.b.f11275d;
        Y1.b bVar3 = Y1.b.f11273b;
        Y1.b bVar4 = Y1.b.f11274c;
        Y1.b bVar5 = Y1.b.f11272a;
        if (openStatus3 == dVar2) {
            LinkedHashMap linkedHashMap = this.f21105e;
            boolean[] zArr = this.f21094A;
            if (degrees < 45.0f) {
                if (rawX <= 0.0f || (view4 = (View) linkedHashMap.get(bVar5)) == null) {
                    z3 = true;
                } else {
                    z3 = true;
                    if (view4.getParent() == this && view4 != getSurfaceView() && zArr[0]) {
                        bVar = bVar5;
                    }
                }
                if (rawX >= 0.0f || (view3 = (View) linkedHashMap.get(bVar4)) == null || view3.getParent() != this || view3 == getSurfaceView() || !zArr[2]) {
                    return;
                } else {
                    bVar = bVar4;
                }
            } else {
                z3 = true;
                if (rawY > 0.0f && (view2 = (View) linkedHashMap.get(bVar3)) != null && view2.getParent() == this && view2 != getSurfaceView() && zArr[1]) {
                    bVar = bVar3;
                } else if (rawY >= 0.0f || (view = (View) linkedHashMap.get(bVar2)) == null || view.getParent() != this || view == getSurfaceView() || !zArr[3]) {
                    return;
                } else {
                    bVar = bVar2;
                }
            }
            setCurrentDragEdge(bVar);
        } else {
            z3 = true;
        }
        Y1.b bVar6 = this.f21102b;
        int i7 = this.f21101a;
        d dVar3 = d.f11281b;
        if (bVar6 != bVar4) {
            z8 = false;
        } else {
            boolean z10 = ((openStatus2 != dVar3 || rawX <= ((float) i7)) && (openStatus2 != dVar2 || rawX >= ((float) (-i7))) && openStatus2 != dVar) ? false : z3;
            if (degrees > 30.0f || !z10) {
                z8 = z3;
            } else {
                z8 = false;
            }
        }
        if (bVar6 == bVar5) {
            boolean z11 = ((openStatus2 != dVar3 || rawX >= ((float) (-i7))) && (openStatus2 != dVar2 || rawX <= ((float) i7)) && openStatus2 != dVar) ? false : z3;
            if (degrees > 30.0f || !z11) {
                z8 = z3;
            }
        }
        if (bVar6 == bVar3) {
            boolean z12 = ((openStatus2 != dVar3 || rawY >= ((float) (-i7))) && (openStatus2 != dVar2 || rawY <= ((float) i7)) && openStatus2 != dVar) ? false : z3;
            if (degrees < 60.0f || !z12) {
                z8 = z3;
            }
        }
        if (bVar6 == bVar2) {
            boolean z13 = ((openStatus2 == dVar3 && rawY > ((float) i7)) || (openStatus2 == dVar2 && rawY < ((float) (-i7))) || openStatus2 == dVar) ? z3 : false;
            if (degrees < 60.0f || !z13) {
                z8 = z3;
            }
        }
        this.f21100Q = !z8;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        int iIntValue;
        if (view == null) {
            return;
        }
        try {
            iIntValue = ((Integer) layoutParams.getClass().getField("gravity").get(layoutParams)).intValue();
        } catch (Exception e10) {
            F6.d.c("SwipeLayout", e10.getMessage());
            iIntValue = 0;
        }
        LinkedHashMap linkedHashMap = this.f21105e;
        if (iIntValue <= 0) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (entry.getValue() == null) {
                    linkedHashMap.put((Y1.b) entry.getKey(), view);
                    break;
                }
            }
        } else {
            WeakHashMap weakHashMap = N.f16168a;
            int absoluteGravity = Gravity.getAbsoluteGravity(iIntValue, getLayoutDirection());
            if ((absoluteGravity & 3) == 3) {
                linkedHashMap.put(Y1.b.f11272a, view);
            }
            if ((absoluteGravity & 5) == 5) {
                linkedHashMap.put(Y1.b.f11274c, view);
            }
            if ((absoluteGravity & 48) == 48) {
                linkedHashMap.put(Y1.b.f11273b, view);
            }
            if ((absoluteGravity & 80) == 80) {
                linkedHashMap.put(Y1.b.f11275d, view);
            }
        }
        if (view.getParent() == this) {
            return;
        }
        super.addView(view, i7, layoutParams);
    }

    public final void b(boolean z3, boolean z8) {
        View surfaceView = getSurfaceView();
        if (surfaceView == null) {
            return;
        }
        if (z3) {
            this.f21103c.v(getSurfaceView(), getPaddingLeft(), getPaddingTop());
        } else {
            Rect rectD = d(false);
            int left = rectD.left - surfaceView.getLeft();
            int top2 = rectD.top - surfaceView.getTop();
            surfaceView.layout(rectD.left, rectD.top, rectD.right, rectD.bottom);
            if (z8) {
                e(rectD.left, rectD.top, rectD.right, rectD.bottom);
                f(rectD.left, rectD.top, left, top2);
            } else {
                j();
            }
        }
        invalidate();
    }

    public final Rect c(Y1.c cVar, Rect rect) {
        View currentBottomView = getCurrentBottomView();
        int i7 = rect.left;
        int i10 = rect.top;
        int measuredWidth = rect.right;
        int measuredHeight = rect.bottom;
        Y1.c cVar2 = Y1.c.f11278b;
        Y1.b bVar = Y1.b.f11273b;
        Y1.b bVar2 = Y1.b.f11272a;
        Y1.b bVar3 = Y1.b.f11274c;
        if (cVar == cVar2) {
            Y1.b bVar4 = this.f21102b;
            if (bVar4 == bVar2) {
                i7 -= this.f21104d;
            } else if (bVar4 == bVar3) {
                i7 = measuredWidth;
            } else {
                i10 = bVar4 == bVar ? i10 - this.f21104d : measuredHeight;
            }
            if (bVar4 == bVar2 || bVar4 == bVar3) {
                measuredWidth = (currentBottomView != null ? currentBottomView.getMeasuredWidth() : 0) + i7;
            } else {
                measuredHeight = i10 + (currentBottomView != null ? currentBottomView.getMeasuredHeight() : 0);
                measuredWidth = rect.right;
            }
        } else if (cVar == Y1.c.f11277a) {
            Y1.b bVar5 = this.f21102b;
            if (bVar5 == bVar2) {
                measuredWidth = i7 + this.f21104d;
            } else if (bVar5 == bVar3) {
                i7 = measuredWidth - this.f21104d;
            } else if (bVar5 == bVar) {
                measuredHeight = i10 + this.f21104d;
            } else {
                i10 = measuredHeight - this.f21104d;
            }
        }
        return new Rect(i7, i10, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    public final void computeScroll() {
        super.computeScroll();
        if (this.f21103c.h()) {
            WeakHashMap weakHashMap = N.f16168a;
            postInvalidateOnAnimation();
        }
    }

    public final Rect d(boolean z3) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        if (z3) {
            Y1.b bVar = this.f21102b;
            if (bVar == Y1.b.f11272a) {
                paddingLeft = this.f21104d + getPaddingLeft();
            } else if (bVar == Y1.b.f11274c) {
                paddingLeft = getPaddingLeft() - this.f21104d;
            } else if (bVar == Y1.b.f11273b) {
                paddingTop = this.f21104d + getPaddingTop();
            } else {
                paddingTop = getPaddingTop() - this.f21104d;
            }
        }
        return new Rect(paddingLeft, paddingTop, getMeasuredWidth() + paddingLeft, getMeasuredHeight() + paddingTop);
    }

    public final void e(int i7, int i10, int i11, int i12) {
        int iOrdinal;
        SwipeLayout swipeLayout;
        float f10;
        int paddingLeft;
        float f11;
        int width;
        float f12;
        int iOrdinal2;
        SwipeLayout swipeLayout2 = this;
        HashMap map = swipeLayout2.f21111o;
        if (!map.isEmpty()) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                View view = (View) entry.getKey();
                Rect rect = new Rect(view.getLeft(), view.getTop(), 0, 0);
                View view2 = view;
                while (view2.getParent() != null && view2 != swipeLayout2.getRootView() && (view2 = (View) view2.getParent()) != swipeLayout2) {
                    rect.left = view2.getLeft() + rect.left;
                    rect.top = view2.getTop() + rect.top;
                }
                rect.right = view.getMeasuredWidth() + rect.left;
                int measuredHeight = view.getMeasuredHeight() + rect.top;
                rect.bottom = measuredHeight;
                Y1.b bVar = swipeLayout2.f21102b;
                int i13 = rect.left;
                int i14 = rect.right;
                int i15 = rect.top;
                Y1.c showMode = swipeLayout2.getShowMode();
                Y1.c cVar = Y1.c.f11277a;
                Iterator it2 = it;
                Y1.c cVar2 = Y1.c.f11278b;
                HashMap map2 = swipeLayout2.f21112p;
                float f13 = 1.0f;
                if (showMode != cVar ? !(swipeLayout2.getShowMode() != cVar2 || ((iOrdinal = bVar.ordinal()) == 0 ? i14 < swipeLayout2.getPaddingLeft() || i13 >= swipeLayout2.getPaddingLeft() : iOrdinal == 1 ? i15 >= swipeLayout2.getPaddingTop() || measuredHeight < swipeLayout2.getPaddingTop() : iOrdinal == 2 ? i13 > swipeLayout2.getWidth() || i14 <= swipeLayout2.getWidth() : iOrdinal != 3 || i15 >= swipeLayout2.getHeight() || i15 < swipeLayout2.getPaddingTop())) : !((iOrdinal2 = bVar.ordinal()) == 0 ? i7 >= i14 || i7 < i13 : iOrdinal2 == 1 ? i10 < i15 || i10 >= measuredHeight : iOrdinal2 == 2 ? i11 <= i13 || i11 > i14 : iOrdinal2 != 3 || i12 <= i15 || i12 > measuredHeight)) {
                    map2.put(view, Boolean.FALSE);
                    if (swipeLayout2.getShowMode() == cVar) {
                        int iOrdinal3 = swipeLayout2.f21102b.ordinal();
                        if (iOrdinal3 == 0) {
                            paddingLeft = rect.left - i7;
                            f11 = paddingLeft;
                            width = view.getWidth();
                        } else if (iOrdinal3 == 1) {
                            paddingLeft = rect.top - i10;
                            f11 = paddingLeft;
                            width = view.getHeight();
                        } else if (iOrdinal3 == 2) {
                            paddingLeft = rect.right - i11;
                            f11 = paddingLeft;
                            width = view.getWidth();
                        } else if (iOrdinal3 != 3) {
                            f12 = 0.0f;
                            paddingLeft = 0;
                        } else {
                            paddingLeft = rect.bottom - i12;
                            f11 = paddingLeft;
                            width = view.getHeight();
                        }
                        f12 = f11 / width;
                    } else {
                        if (swipeLayout2.getShowMode() == cVar2) {
                            int iOrdinal4 = swipeLayout2.f21102b.ordinal();
                            if (iOrdinal4 == 0) {
                                paddingLeft = rect.right - swipeLayout2.getPaddingLeft();
                                f11 = paddingLeft;
                                width = view.getWidth();
                            } else if (iOrdinal4 == 1) {
                                paddingLeft = rect.bottom - swipeLayout2.getPaddingTop();
                                f11 = paddingLeft;
                                width = view.getHeight();
                            } else if (iOrdinal4 == 2) {
                                paddingLeft = rect.left - swipeLayout2.getWidth();
                                f11 = paddingLeft;
                                width = view.getWidth();
                            } else if (iOrdinal4 == 3) {
                                paddingLeft = rect.top - swipeLayout2.getHeight();
                                f11 = paddingLeft;
                                width = view.getHeight();
                            }
                            f12 = f11 / width;
                        }
                        f12 = 0.0f;
                        paddingLeft = 0;
                    }
                    Iterator it3 = ((ArrayList) entry.getValue()).iterator();
                    while (it3.hasNext()) {
                        ((OnRevealListener) it3.next()).onReveal(view, swipeLayout2.f21102b, Math.abs(f12), paddingLeft);
                        if (Math.abs(f12) == 1.0f) {
                            map2.put(view, Boolean.TRUE);
                        }
                    }
                }
                Y1.b bVar2 = swipeLayout2.f21102b;
                if (((Boolean) map2.get(view)).booleanValue()) {
                    swipeLayout = swipeLayout2;
                } else {
                    int i16 = rect.left;
                    int i17 = rect.right;
                    int i18 = rect.top;
                    int i19 = rect.bottom;
                    Y1.c showMode2 = swipeLayout2.getShowMode();
                    Y1.b bVar3 = Y1.b.f11275d;
                    Y1.b bVar4 = Y1.b.f11273b;
                    Y1.b bVar5 = Y1.b.f11272a;
                    Y1.b bVar6 = Y1.b.f11274c;
                    if (showMode2 != cVar ? !(getShowMode() != cVar2 || ((bVar2 != bVar6 || i17 > getWidth()) && ((bVar2 != bVar5 || i16 < getPaddingLeft()) && ((bVar2 != bVar4 || i18 < getPaddingTop()) && (bVar2 != bVar3 || i19 > getHeight()))))) : !((bVar2 != bVar6 || i11 > i16) && ((bVar2 != bVar5 || i7 < i17) && ((bVar2 != bVar4 || i10 < i19) && (bVar2 != bVar3 || i12 > i18))))) {
                        map2.put(view, Boolean.TRUE);
                        for (OnRevealListener onRevealListener : (ArrayList) entry.getValue()) {
                            Y1.b bVar7 = this.f21102b;
                            if (bVar7 == bVar5 || bVar7 == bVar6) {
                                f10 = f13;
                                onRevealListener.onReveal(view, bVar7, f10, view.getWidth());
                            } else {
                                f10 = f13;
                                onRevealListener.onReveal(view, bVar7, f10, view.getHeight());
                            }
                            f13 = f10;
                        }
                    }
                    swipeLayout = this;
                }
                swipeLayout2 = swipeLayout;
                it = it2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:5:0x000c  */
    public final void f(int i7, int i10, int i11, int i12) {
        boolean z3;
        Y1.b dragEdge = getDragEdge();
        if (dragEdge == Y1.b.f11272a) {
            if (i11 < 0) {
                z3 = false;
            } else {
                z3 = true;
            }
        } else if (dragEdge != Y1.b.f11274c) {
            if (dragEdge == Y1.b.f11273b) {
                if (i12 < 0) {
                    z3 = false;
                }
            } else if (dragEdge == Y1.b.f11275d) {
                z3 = i12 <= 0;
                F6.d.h("SwipeLayout", 3, "for fucking sonar");
            }
            z3 = true;
        } else if (i11 > 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        j();
        d openStatus = getOpenStatus();
        ArrayList<SwipeListener> arrayList = this.f21108i;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f21098L++;
        for (SwipeListener swipeListener : arrayList) {
            if (this.f21098L == 1) {
                if (z3) {
                    swipeListener.onStartOpen(this);
                } else {
                    swipeListener.onStartClose(this);
                }
            }
            swipeListener.onUpdate(this, i7 - getPaddingLeft(), i10 - getPaddingTop());
        }
        if (openStatus == d.f11282c) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((SwipeListener) it.next()).onClose(this);
            }
            this.f21098L = 0;
        }
        if (openStatus == d.f11281b) {
            View currentBottomView = getCurrentBottomView();
            if (currentBottomView != null) {
                currentBottomView.setEnabled(true);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((SwipeListener) it2.next()).onOpen(this);
            }
            this.f21098L = 0;
        }
    }

    public final int g(float f10) {
        return (int) ((f10 * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public List<View> getBottomViews() {
        ArrayList arrayList = new ArrayList();
        for (Y1.b bVar : Y1.b.values()) {
            arrayList.add((View) this.f21105e.get(bVar));
        }
        return arrayList;
    }

    public View getCurrentBottomView() {
        List<View> bottomViews = getBottomViews();
        if (this.f21102b.ordinal() < bottomViews.size()) {
            return bottomViews.get(this.f21102b.ordinal());
        }
        return null;
    }

    public int getDragDistance() {
        return this.f21104d;
    }

    public Y1.b getDragEdge() {
        return this.f21102b;
    }

    public Map<Y1.b, View> getDragEdgeMap() {
        return this.f21105e;
    }

    @Deprecated
    public List<Y1.b> getDragEdges() {
        return new ArrayList(this.f21105e.keySet());
    }

    public d getOpenStatus() {
        View surfaceView = getSurfaceView();
        d dVar = d.f11282c;
        if (surfaceView == null) {
            return dVar;
        }
        int left = surfaceView.getLeft();
        int top2 = surfaceView.getTop();
        if (left == getPaddingLeft() && top2 == getPaddingTop()) {
            return dVar;
        }
        return (left == getPaddingLeft() - this.f21104d || left == getPaddingLeft() + this.f21104d || top2 == getPaddingTop() - this.f21104d || top2 == getPaddingTop() + this.f21104d) ? d.f11281b : d.f11280a;
    }

    public Y1.c getShowMode() {
        return this.f21106f;
    }

    public View getSurfaceView() {
        if (getChildCount() == 0) {
            return null;
        }
        return getChildAt(getChildCount() - 1);
    }

    public float getWillOpenPercentAfterClose() {
        return this.f21097H;
    }

    public float getWillOpenPercentAfterOpen() {
        return this.f21096C;
    }

    public final boolean h(MotionEvent motionEvent) {
        View surfaceView = getSurfaceView();
        if (surfaceView == null) {
            return false;
        }
        if (this.f21116s0 == null) {
            this.f21116s0 = new Rect();
        }
        surfaceView.getHitRect(this.f21116s0);
        return this.f21116s0.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public final void i(boolean z3, boolean z8) {
        View surfaceView = getSurfaceView();
        View currentBottomView = getCurrentBottomView();
        if (surfaceView == null) {
            return;
        }
        Rect rectD = d(true);
        if (z3) {
            this.f21103c.v(surfaceView, rectD.left, rectD.top);
        } else {
            int left = rectD.left - surfaceView.getLeft();
            int top2 = rectD.top - surfaceView.getTop();
            surfaceView.layout(rectD.left, rectD.top, rectD.right, rectD.bottom);
            Y1.c showMode = getShowMode();
            Y1.c cVar = Y1.c.f11278b;
            if (showMode == cVar) {
                Rect rectC = c(cVar, rectD);
                if (currentBottomView != null) {
                    currentBottomView.layout(rectC.left, rectC.top, rectC.right, rectC.bottom);
                }
            }
            if (z8) {
                e(rectD.left, rectD.top, rectD.right, rectD.bottom);
                f(rectD.left, rectD.top, left, top2);
            } else {
                j();
            }
        }
        invalidate();
    }

    public final void j() {
        d openStatus = getOpenStatus();
        List<View> bottomViews = getBottomViews();
        if (openStatus != d.f11282c) {
            View currentBottomView = getCurrentBottomView();
            if (currentBottomView == null || currentBottomView.getVisibility() == 0) {
                return;
            }
            currentBottomView.setVisibility(0);
            return;
        }
        for (View view : bottomViews) {
            if (view != null && view.getVisibility() != 4) {
                if (getShowMode() == Y1.c.f11278b) {
                    F6.d.h("SwipeLayout", 3, "safeBottomView: bottom.getLeft() = " + view.getLeft());
                    view.offsetLeftAndRight(getMeasuredWidth() - view.getLeft());
                }
                view.setVisibility(4);
            }
        }
    }

    public final void k() {
        View currentBottomView = getCurrentBottomView();
        if (currentBottomView != null) {
            Y1.b bVar = this.f21102b;
            if (bVar == Y1.b.f11272a || bVar == Y1.b.f11274c) {
                this.f21104d = currentBottomView.getMeasuredWidth() - g(getCurrentOffset());
            } else {
                this.f21104d = currentBottomView.getMeasuredHeight() - g(getCurrentOffset());
            }
        }
        Y1.c cVar = this.f21106f;
        Y1.c cVar2 = Y1.c.f11278b;
        HashMap map = this.t;
        if (cVar == cVar2) {
            View surfaceView = getSurfaceView();
            Rect rectD = (Rect) map.get(surfaceView);
            if (rectD == null) {
                rectD = d(false);
            }
            if (surfaceView != null) {
                surfaceView.layout(rectD.left, rectD.top, rectD.right, rectD.bottom);
                bringChildToFront(surfaceView);
            }
            View currentBottomView2 = getCurrentBottomView();
            Rect rectC = (Rect) map.get(currentBottomView2);
            if (rectC == null) {
                rectC = c(cVar2, rectD);
            }
            if (currentBottomView2 != null) {
                currentBottomView2.layout(rectC.left, rectC.top, rectC.right, rectC.bottom);
            }
        } else {
            Y1.c cVar3 = Y1.c.f11277a;
            if (cVar == cVar3) {
                View surfaceView2 = getSurfaceView();
                Rect rectD2 = (Rect) map.get(surfaceView2);
                if (rectD2 == null) {
                    rectD2 = d(false);
                }
                if (surfaceView2 != null) {
                    surfaceView2.layout(rectD2.left, rectD2.top, rectD2.right, rectD2.bottom);
                    bringChildToFront(surfaceView2);
                }
                View currentBottomView3 = getCurrentBottomView();
                Rect rectC2 = (Rect) map.get(currentBottomView3);
                if (rectC2 == null) {
                    rectC2 = c(cVar3, rectD2);
                }
                if (currentBottomView3 != null) {
                    currentBottomView3.layout(rectC2.left, rectC2.top, rectC2.right, rectC2.bottom);
                }
            }
        }
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getAdapterView() != null) {
            if (this.f21114q0 == null) {
                setOnClickListener(new ViewOnClickListenerC0146m(this, 14));
            }
            if (this.f21115r0 == null) {
                setOnLongClickListener(new Y1.a(this));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005f, code lost:
    
        if (r5.f21100Q != false) goto L36;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.f21119w
            r1 = 0
            if (r0 != 0) goto L6
            goto L61
        L6:
            boolean r0 = r5.f21095B
            r2 = 1
            if (r0 == 0) goto L1a
            Y1.d r0 = r5.getOpenStatus()
            Y1.d r3 = Y1.d.f11281b
            if (r0 != r3) goto L1a
            boolean r0 = r5.h(r6)
            if (r0 == 0) goto L1a
            return r2
        L1a:
            java.util.ArrayList r0 = r5.f21109j
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L35
            java.lang.Object r3 = r0.next()
            com.daimajia.swipe.SwipeLayout$SwipeDenier r3 = (com.daimajia.swipe.SwipeLayout.SwipeDenier) r3
            if (r3 == 0) goto L20
            boolean r3 = r3.shouldDenySwipe(r6)
            if (r3 == 0) goto L20
            goto L61
        L35:
            int r0 = r6.getAction()
            androidx.customview.widget.g r3 = r5.f21103c
            if (r0 == 0) goto L68
            if (r0 == r2) goto L62
            r4 = 2
            if (r0 == r4) goto L49
            r2 = 3
            if (r0 == r2) goto L62
            r3.n(r6)
            goto L83
        L49:
            boolean r0 = r5.f21100Q
            r5.a(r6)
            boolean r6 = r5.f21100Q
            if (r6 == 0) goto L5b
            android.view.ViewParent r6 = r5.getParent()
            if (r6 == 0) goto L5b
            r6.requestDisallowInterceptTouchEvent(r2)
        L5b:
            if (r0 != 0) goto L83
            boolean r6 = r5.f21100Q
            if (r6 == 0) goto L83
        L61:
            return r1
        L62:
            r5.f21100Q = r1
            r3.n(r6)
            goto L83
        L68:
            r3.n(r6)
            r5.f21100Q = r1
            float r0 = r6.getRawX()
            r5.f21110k0 = r0
            float r6 = r6.getRawY()
            r5.f21113p0 = r6
            Y1.d r6 = r5.getOpenStatus()
            Y1.d r0 = Y1.d.f11280a
            if (r6 != r0) goto L83
            r5.f21100Q = r2
        L83:
            boolean r6 = r5.f21100Q
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daimajia.swipe.SwipeLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        k();
        if (this.f21099M != null) {
            for (int i13 = 0; i13 < this.f21099M.size(); i13++) {
                ((OnLayout) this.f21099M.get(i13)).onLayout(this);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f21119w) {
            return super.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        this.f21117t0.onTouchEvent(motionEvent);
        g gVar = this.f21103c;
        if (actionMasked == 0) {
            gVar.n(motionEvent);
            this.f21110k0 = motionEvent.getRawX();
            this.f21113p0 = motionEvent.getRawY();
            a(motionEvent);
            if (this.f21100Q) {
                getParent().requestDisallowInterceptTouchEvent(true);
                gVar.n(motionEvent);
            }
        } else if (actionMasked == 1) {
            this.f21100Q = false;
            gVar.n(motionEvent);
        } else if (actionMasked == 2) {
            a(motionEvent);
            if (this.f21100Q) {
                getParent().requestDisallowInterceptTouchEvent(true);
                gVar.n(motionEvent);
            }
        } else if (actionMasked != 3) {
            gVar.n(motionEvent);
        } else {
            this.f21100Q = false;
            gVar.n(motionEvent);
        }
        return super.onTouchEvent(motionEvent) || this.f21100Q || actionMasked == 0;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        LinkedHashMap linkedHashMap = this.f21105e;
        for (Map.Entry entry : new HashMap(linkedHashMap).entrySet()) {
            if (entry.getValue() == view) {
                linkedHashMap.remove(entry.getKey());
            }
        }
    }

    public void setBottomSwipeEnabled(boolean z3) {
        this.f21094A[3] = z3;
    }

    public void setClickToClose(boolean z3) {
        this.f21095B = z3;
    }

    public void setDragDistance(int i7) {
        if (i7 < 0) {
            i7 = 0;
        }
        this.f21104d = g(i7);
        requestLayout();
    }

    @Deprecated
    public void setDragEdge(Y1.b bVar) {
        this.f21105e.clear();
        if (getChildCount() >= 2) {
            this.f21105e.put(bVar, getChildAt(getChildCount() - 2));
        }
        setCurrentDragEdge(bVar);
    }

    @Deprecated
    public void setDragEdges(List<Y1.b> list) {
        this.f21105e.clear();
        int iMin = Math.min(list.size(), getChildCount() - 1);
        for (int i7 = 0; i7 < iMin; i7++) {
            this.f21105e.put(list.get(i7), getChildAt(i7));
        }
        boolean zIsEmpty = list.isEmpty();
        Y1.b bVar = Y1.b.f11274c;
        if (zIsEmpty || list.contains(bVar)) {
            setCurrentDragEdge(bVar);
        } else {
            setCurrentDragEdge(list.get(0));
        }
    }

    public void setLeftSwipeEnabled(boolean z3) {
        this.f21094A[0] = z3;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f21114q0 = onClickListener;
    }

    public void setOnDoubleClickListener(DoubleClickListener doubleClickListener) {
        this.f21118v = doubleClickListener;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        this.f21115r0 = onLongClickListener;
    }

    public void setRightSwipeEnabled(boolean z3) {
        this.f21094A[2] = z3;
    }

    public void setShowMode(Y1.c cVar) {
        this.f21106f = cVar;
        requestLayout();
    }

    public void setSwipeEnabled(boolean z3) {
        this.f21119w = z3;
    }

    public void setTopSwipeEnabled(boolean z3) {
        this.f21094A[1] = z3;
    }

    public void setWillOpenPercentAfterClose(float f10) {
        this.f21097H = f10;
    }

    public void setWillOpenPercentAfterOpen(float f10) {
        this.f21096C = f10;
    }

    public SwipeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Y1.b bVar = Y1.b.f11274c;
        this.f21102b = bVar;
        this.f21104d = 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f21105e = linkedHashMap;
        this.f21107g = new float[]{typedArrayObtainStyledAttributes.getDimension(x.SwipeLayout_leftEdgeSwipeOffset, 0.0f), typedArrayObtainStyledAttributes.getDimension(x.SwipeLayout_topEdgeSwipeOffset, 0.0f), typedArrayObtainStyledAttributes.getDimension(x.SwipeLayout_rightEdgeSwipeOffset, 0.0f), typedArrayObtainStyledAttributes.getDimension(x.SwipeLayout_bottomEdgeSwipeOffset, 0.0f)};
        this.f21108i = new ArrayList();
        this.f21109j = new ArrayList();
        this.f21111o = new HashMap();
        this.f21112p = new HashMap();
        this.t = new HashMap();
        this.f21119w = true;
        this.f21094A = new boolean[]{true, true, true, true};
        this.f21095B = false;
        this.f21096C = 0.75f;
        this.f21097H = 0.25f;
        b bVar2 = new b(this);
        this.f21098L = 0;
        this.f21110k0 = -1.0f;
        this.f21113p0 = -1.0f;
        this.f21117t0 = new GestureDetector(getContext(), new c(this));
        this.f21103c = new g(getContext(), this, bVar2);
        this.f21101a = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.SwipeLayout);
        int i10 = typedArrayObtainStyledAttributes.getInt(x.SwipeLayout_drag_edge, 2);
        setClickToClose(typedArrayObtainStyledAttributes.getBoolean(x.SwipeLayout_clickToClose, this.f21095B));
        if ((i10 & 1) == 1) {
            linkedHashMap.put(Y1.b.f11272a, null);
        }
        if ((i10 & 4) == 4) {
            linkedHashMap.put(Y1.b.f11273b, null);
        }
        if ((i10 & 2) == 2) {
            linkedHashMap.put(bVar, null);
        }
        if ((i10 & 8) == 8) {
            linkedHashMap.put(Y1.b.f11275d, null);
        }
        this.f21106f = Y1.c.values()[typedArrayObtainStyledAttributes.getInt(x.SwipeLayout_show_mode, 1)];
        typedArrayObtainStyledAttributes.recycle();
    }

    @Deprecated
    public void setDragEdges(Y1.b... bVarArr) {
        this.f21105e.clear();
        setDragEdges(Arrays.asList(bVarArr));
    }
}
