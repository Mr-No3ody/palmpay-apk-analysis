package com.daimajia.swipe;

import Y1.d;
import android.graphics.Rect;
import android.view.View;
import androidx.customview.widget.f;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21120a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeLayout f21121b;

    public b(SwipeLayout swipeLayout) {
        this.f21121b = swipeLayout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
    
        if (r5 != 3) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r5 != 3) goto L50;
     */
    @Override // androidx.customview.widget.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int clampViewPositionHorizontal(android.view.View r5, int r6, int r7) {
        /*
            r4 = this;
            com.daimajia.swipe.SwipeLayout r7 = r4.f21121b
            android.view.View r0 = r7.getSurfaceView()
            r1 = 3
            r2 = 2
            r3 = 1
            if (r5 != r0) goto L58
            Y1.b r5 = r7.f21102b
            int r5 = r5.ordinal()
            if (r5 == 0) goto L3c
            if (r5 == r3) goto L37
            if (r5 == r2) goto L1b
            if (r5 == r1) goto L37
            goto L98
        L1b:
            int r5 = r7.getPaddingLeft()
            if (r6 <= r5) goto L26
            int r5 = r7.getPaddingLeft()
            return r5
        L26:
            int r5 = r7.getPaddingLeft()
            int r0 = r7.f21104d
            int r5 = r5 - r0
            if (r6 >= r5) goto L98
            int r5 = r7.getPaddingLeft()
            int r6 = r7.f21104d
            int r5 = r5 - r6
            return r5
        L37:
            int r5 = r7.getPaddingLeft()
            return r5
        L3c:
            int r5 = r7.getPaddingLeft()
            if (r6 >= r5) goto L47
            int r5 = r7.getPaddingLeft()
            return r5
        L47:
            int r5 = r7.getPaddingLeft()
            int r0 = r7.f21104d
            int r5 = r5 + r0
            if (r6 <= r5) goto L98
            int r5 = r7.getPaddingLeft()
            int r6 = r7.f21104d
            int r5 = r5 + r6
            return r5
        L58:
            android.view.View r0 = r7.getCurrentBottomView()
            if (r0 != r5) goto L98
            Y1.b r5 = r7.f21102b
            int r5 = r5.ordinal()
            Y1.c r0 = Y1.c.f11278b
            if (r5 == 0) goto L89
            if (r5 == r3) goto L84
            if (r5 == r2) goto L6f
            if (r5 == r1) goto L84
            goto L98
        L6f:
            Y1.c r5 = r7.f21106f
            if (r5 != r0) goto L98
            int r5 = r7.getMeasuredWidth()
            int r0 = r7.f21104d
            int r5 = r5 - r0
            if (r6 >= r5) goto L98
            int r5 = r7.getMeasuredWidth()
            int r6 = r7.f21104d
            int r5 = r5 - r6
            return r5
        L84:
            int r5 = r7.getPaddingLeft()
            return r5
        L89:
            Y1.c r5 = r7.f21106f
            if (r5 != r0) goto L98
            int r5 = r7.getPaddingLeft()
            if (r6 <= r5) goto L98
            int r5 = r7.getPaddingLeft()
            return r5
        L98:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daimajia.swipe.b.clampViewPositionHorizontal(android.view.View, int, int):int");
    }

    @Override // androidx.customview.widget.f
    public final int clampViewPositionVertical(View view, int i7, int i10) {
        SwipeLayout swipeLayout = this.f21121b;
        if (view == swipeLayout.getSurfaceView()) {
            int iOrdinal = swipeLayout.f21102b.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            if (i7 < swipeLayout.getPaddingTop() - swipeLayout.f21104d) {
                                return swipeLayout.getPaddingTop() - swipeLayout.f21104d;
                            }
                            if (i7 > swipeLayout.getPaddingTop()) {
                                return swipeLayout.getPaddingTop();
                            }
                        }
                    }
                } else {
                    if (i7 < swipeLayout.getPaddingTop()) {
                        return swipeLayout.getPaddingTop();
                    }
                    if (i7 > swipeLayout.getPaddingTop() + swipeLayout.f21104d) {
                        return swipeLayout.getPaddingTop() + swipeLayout.f21104d;
                    }
                }
            }
            return swipeLayout.getPaddingTop();
        }
        View surfaceView = swipeLayout.getSurfaceView();
        int top2 = surfaceView == null ? 0 : surfaceView.getTop();
        int iOrdinal2 = swipeLayout.f21102b.ordinal();
        if (iOrdinal2 != 0) {
            Y1.c cVar = Y1.c.f11278b;
            if (iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    if (iOrdinal2 == 3) {
                        if (swipeLayout.f21106f != cVar) {
                            int i11 = top2 + i10;
                            if (i11 >= swipeLayout.getPaddingTop()) {
                                return swipeLayout.getPaddingTop();
                            }
                            if (i11 <= swipeLayout.getPaddingTop() - swipeLayout.f21104d) {
                                return swipeLayout.getPaddingTop() - swipeLayout.f21104d;
                            }
                        } else if (i7 < swipeLayout.getMeasuredHeight() - swipeLayout.f21104d) {
                            return swipeLayout.getMeasuredHeight() - swipeLayout.f21104d;
                        }
                    }
                }
            } else if (swipeLayout.f21106f != cVar) {
                int i12 = top2 + i10;
                if (i12 < swipeLayout.getPaddingTop()) {
                    return swipeLayout.getPaddingTop();
                }
                if (i12 > swipeLayout.getPaddingTop() + swipeLayout.f21104d) {
                    return swipeLayout.getPaddingTop() + swipeLayout.f21104d;
                }
            } else if (i7 > swipeLayout.getPaddingTop()) {
                return swipeLayout.getPaddingTop();
            }
        }
        return swipeLayout.getPaddingTop();
        return i7;
    }

    @Override // androidx.customview.widget.f
    public final int getViewHorizontalDragRange(View view) {
        return this.f21121b.f21104d;
    }

    @Override // androidx.customview.widget.f
    public final int getViewVerticalDragRange(View view) {
        return this.f21121b.f21104d;
    }

    @Override // androidx.customview.widget.f
    public final void onViewPositionChanged(View view, int i7, int i10, int i11, int i12) {
        int measuredWidth;
        int measuredHeight;
        SwipeLayout swipeLayout = this.f21121b;
        View surfaceView = swipeLayout.getSurfaceView();
        if (surfaceView == null) {
            return;
        }
        View currentBottomView = swipeLayout.getCurrentBottomView();
        int left = surfaceView.getLeft();
        int right = surfaceView.getRight();
        int top2 = surfaceView.getTop();
        int bottom = surfaceView.getBottom();
        Y1.b bVar = Y1.b.f11274c;
        Y1.b bVar2 = Y1.b.f11272a;
        Y1.c cVar = Y1.c.f11278b;
        if (view == surfaceView) {
            if (swipeLayout.f21106f == cVar && currentBottomView != null) {
                Y1.b bVar3 = swipeLayout.f21102b;
                if (bVar3 == bVar2 || bVar3 == bVar) {
                    currentBottomView.offsetLeftAndRight(i11);
                } else {
                    currentBottomView.offsetTopAndBottom(i12);
                }
            }
        } else if (swipeLayout.getBottomViews().contains(view)) {
            if (swipeLayout.f21106f == cVar) {
                surfaceView.offsetLeftAndRight(i11);
                surfaceView.offsetTopAndBottom(i12);
            } else {
                Y1.b bVar4 = swipeLayout.f21102b;
                int paddingLeft = swipeLayout.getPaddingLeft();
                int paddingTop = swipeLayout.getPaddingTop();
                Y1.b bVar5 = Y1.b.f11275d;
                if (bVar4 == bVar) {
                    paddingLeft = swipeLayout.getMeasuredWidth() - swipeLayout.f21104d;
                } else if (bVar4 == bVar5) {
                    paddingTop = swipeLayout.getMeasuredHeight() - swipeLayout.f21104d;
                }
                if (bVar4 == bVar2 || bVar4 == bVar) {
                    measuredWidth = swipeLayout.f21104d + paddingLeft;
                    measuredHeight = swipeLayout.getMeasuredHeight() + paddingTop;
                } else {
                    measuredWidth = swipeLayout.getMeasuredWidth() + paddingLeft;
                    measuredHeight = swipeLayout.f21104d + paddingTop;
                }
                Rect rect = new Rect(paddingLeft, paddingTop, measuredWidth, measuredHeight);
                if (currentBottomView != null) {
                    currentBottomView.layout(rect.left, rect.top, rect.right, rect.bottom);
                }
                int left2 = surfaceView.getLeft() + i11;
                int top3 = surfaceView.getTop() + i12;
                if (swipeLayout.f21102b == bVar2 && left2 < swipeLayout.getPaddingLeft()) {
                    left2 = swipeLayout.getPaddingLeft();
                } else if (swipeLayout.f21102b == bVar && left2 > swipeLayout.getPaddingLeft()) {
                    left2 = swipeLayout.getPaddingLeft();
                } else if (swipeLayout.f21102b == Y1.b.f11273b && top3 < swipeLayout.getPaddingTop()) {
                    top3 = swipeLayout.getPaddingTop();
                } else if (swipeLayout.f21102b == bVar5 && top3 > swipeLayout.getPaddingTop()) {
                    top3 = swipeLayout.getPaddingTop();
                }
                surfaceView.layout(left2, top3, swipeLayout.getMeasuredWidth() + left2, swipeLayout.getMeasuredHeight() + top3);
            }
        }
        swipeLayout.e(left, top2, right, bottom);
        swipeLayout.f(left, top2, i11, i12);
        swipeLayout.invalidate();
        View currentBottomView2 = swipeLayout.getCurrentBottomView();
        d openStatus = swipeLayout.getOpenStatus();
        d dVar = d.f11282c;
        HashMap map = swipeLayout.t;
        if (openStatus == dVar) {
            map.remove(currentBottomView2);
            return;
        }
        View[] viewArr = {swipeLayout.getSurfaceView(), currentBottomView2};
        for (int i13 = 0; i13 < 2; i13++) {
            View view2 = viewArr[i13];
            Rect rect2 = (Rect) map.get(view2);
            if (rect2 == null) {
                rect2 = new Rect();
                map.put(view2, rect2);
            }
            rect2.left = view2.getLeft();
            rect2.top = view2.getTop();
            rect2.right = view2.getRight();
            rect2.bottom = view2.getBottom();
        }
    }

    @Override // androidx.customview.widget.f
    public final void onViewReleased(View view, float f10, float f11) {
        boolean z3 = this.f21120a;
        SwipeLayout swipeLayout = this.f21121b;
        float f12 = swipeLayout.f21103c.f16404n;
        View surfaceView = swipeLayout.getSurfaceView();
        Y1.b bVar = swipeLayout.f21102b;
        if (bVar != null && surfaceView != null) {
            float f13 = z3 ? swipeLayout.f21097H : swipeLayout.f21096C;
            if (bVar == Y1.b.f11272a) {
                if (f10 > f12) {
                    swipeLayout.i(true, true);
                } else if (f10 >= (-f12) && (swipeLayout.getSurfaceView().getLeft() * 1.0f) / swipeLayout.f21104d > f13) {
                    swipeLayout.i(true, true);
                } else {
                    swipeLayout.b(true, true);
                }
            } else if (bVar == Y1.b.f11274c) {
                if (f10 > f12) {
                    swipeLayout.b(true, true);
                } else if (f10 >= (-f12) && ((-swipeLayout.getSurfaceView().getLeft()) * 1.0f) / swipeLayout.f21104d <= f13) {
                    swipeLayout.b(true, true);
                } else {
                    swipeLayout.i(true, true);
                }
            } else if (bVar == Y1.b.f11273b) {
                if (f11 > f12) {
                    swipeLayout.i(true, true);
                } else if (f11 >= (-f12) && (swipeLayout.getSurfaceView().getTop() * 1.0f) / swipeLayout.f21104d > f13) {
                    swipeLayout.i(true, true);
                } else {
                    swipeLayout.b(true, true);
                }
            } else if (bVar == Y1.b.f11275d) {
                if (f11 > f12) {
                    swipeLayout.b(true, true);
                } else if (f11 >= (-f12) && ((-swipeLayout.getSurfaceView().getTop()) * 1.0f) / swipeLayout.f21104d <= f13) {
                    swipeLayout.b(true, true);
                } else {
                    swipeLayout.i(true, true);
                }
            }
        }
        Iterator it = swipeLayout.f21108i.iterator();
        while (it.hasNext()) {
            ((SwipeLayout.SwipeListener) it.next()).onHandRelease(swipeLayout, f10, f11);
        }
        swipeLayout.invalidate();
    }

    @Override // androidx.customview.widget.f
    public final boolean tryCaptureView(View view, int i7) {
        SwipeLayout swipeLayout = this.f21121b;
        boolean z3 = view == swipeLayout.getSurfaceView() || swipeLayout.getBottomViews().contains(view);
        if (z3) {
            this.f21120a = swipeLayout.getOpenStatus() == d.f11282c;
        }
        return z3;
    }
}
