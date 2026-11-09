package F7;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import com.shencoder.pagergridlayoutmanager.PagerGridLayoutManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends SnapHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f2625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2626b = new ArrayList(2);

    public static int a(PagerGridLayoutManager pagerGridLayoutManager) {
        int height;
        int paddingBottom;
        int paddingStart = pagerGridLayoutManager.canScrollHorizontally() ? pagerGridLayoutManager.getPaddingStart() : pagerGridLayoutManager.getPaddingTop();
        if (pagerGridLayoutManager.canScrollHorizontally()) {
            height = pagerGridLayoutManager.getWidth() - pagerGridLayoutManager.getPaddingStart();
            paddingBottom = pagerGridLayoutManager.getPaddingEnd();
        } else {
            height = pagerGridLayoutManager.getHeight() - pagerGridLayoutManager.getPaddingTop();
            paddingBottom = pagerGridLayoutManager.getPaddingBottom();
        }
        return ((height - paddingBottom) / 2) + paddingStart;
    }

    public static int b(PagerGridLayoutManager pagerGridLayoutManager, View view) {
        int decoratedBottom;
        int i7;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (pagerGridLayoutManager.canScrollHorizontally()) {
            decoratedBottom = pagerGridLayoutManager.getDecoratedRight(view);
            i7 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            decoratedBottom = pagerGridLayoutManager.getDecoratedBottom(view);
            i7 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return decoratedBottom - i7;
    }

    public static int c(PagerGridLayoutManager pagerGridLayoutManager, View view) {
        int decoratedTop;
        int i7;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (pagerGridLayoutManager.canScrollHorizontally()) {
            decoratedTop = pagerGridLayoutManager.getDecoratedLeft(view);
            i7 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        } else {
            decoratedTop = pagerGridLayoutManager.getDecoratedTop(view);
            i7 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        }
        return decoratedTop - i7;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final void attachToRecyclerView(RecyclerView recyclerView) {
        super.attachToRecyclerView(recyclerView);
        this.f2625a = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c A[PHI: r8
      0x003c: PHI (r8v24 int) = (r8v16 int), (r8v39 int) binds: [B:42:0x00a7, B:13:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00da A[PHI: r8
      0x00da: PHI (r8v18 int) = (r8v11 int), (r8v34 int) binds: [B:55:0x00d8, B:27:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x0100 A[ADDED_TO_REGION] */
    @Override // androidx.recyclerview.widget.SnapHelper
    public final int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        int height;
        int paddingBottom;
        int i7;
        int i10;
        int height2;
        int paddingBottom2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int height3;
        int paddingBottom3;
        int i17;
        int height4;
        int paddingBottom4;
        int[] iArr = new int[2];
        int position = layoutManager.getPosition(view);
        if (layoutManager instanceof PagerGridLayoutManager) {
            PagerGridLayoutManager pagerGridLayoutManager = (PagerGridLayoutManager) layoutManager;
            int iA = a(pagerGridLayoutManager);
            Rect rect = new Rect();
            layoutManager.getDecoratedBoundsWithMargins(view, rect);
            boolean zP = pagerGridLayoutManager.p();
            Rect rect2 = pagerGridLayoutManager.f25217w;
            if (zP) {
                if (b(pagerGridLayoutManager, view) >= iA) {
                    i10 = !pagerGridLayoutManager.canScrollHorizontally() ? 0 : rect.left - rect2.left;
                    if (pagerGridLayoutManager.canScrollVertically()) {
                        i13 = rect.top;
                        i14 = rect2.top;
                        i16 = i13 - i14;
                    } else {
                        i16 = 0;
                    }
                    iArr[0] = i10;
                    iArr[1] = i16;
                    if (i10 == 0 && i16 == 0) {
                        pagerGridLayoutManager.o(position / pagerGridLayoutManager.f25208e);
                    }
                } else {
                    if (pagerGridLayoutManager.canScrollHorizontally()) {
                        if (pagerGridLayoutManager.canScrollHorizontally()) {
                            height3 = pagerGridLayoutManager.getWidth();
                            paddingBottom3 = pagerGridLayoutManager.getPaddingEnd();
                        } else {
                            height3 = pagerGridLayoutManager.getHeight();
                            paddingBottom3 = pagerGridLayoutManager.getPaddingBottom();
                        }
                        i17 = (height3 - paddingBottom3) - rect.left;
                    } else {
                        i17 = 0;
                    }
                    i10 = -i17;
                    if (pagerGridLayoutManager.canScrollVertically()) {
                        if (pagerGridLayoutManager.canScrollHorizontally()) {
                            height4 = pagerGridLayoutManager.getWidth();
                            paddingBottom4 = pagerGridLayoutManager.getPaddingEnd();
                        } else {
                            height4 = pagerGridLayoutManager.getHeight();
                            paddingBottom4 = pagerGridLayoutManager.getPaddingBottom();
                        }
                        i11 = height4 - paddingBottom4;
                        i12 = rect.top;
                        i15 = i11 - i12;
                    } else {
                        i15 = 0;
                    }
                    i16 = -i15;
                    iArr[0] = i10;
                    iArr[1] = i16;
                    if (i10 == 0) {
                        pagerGridLayoutManager.o(position / pagerGridLayoutManager.f25208e);
                    }
                }
            } else if (c(pagerGridLayoutManager, view) <= iA) {
                i10 = !pagerGridLayoutManager.canScrollHorizontally() ? 0 : rect.left - rect2.left;
                if (pagerGridLayoutManager.canScrollVertically()) {
                    i13 = rect.top;
                    i14 = rect2.top;
                    i16 = i13 - i14;
                } else {
                    i16 = 0;
                }
                iArr[0] = i10;
                iArr[1] = i16;
                if (i10 == 0) {
                    pagerGridLayoutManager.o(position / pagerGridLayoutManager.f25208e);
                }
            } else {
                if (pagerGridLayoutManager.canScrollHorizontally()) {
                    if (pagerGridLayoutManager.canScrollHorizontally()) {
                        height = pagerGridLayoutManager.getWidth();
                        paddingBottom = pagerGridLayoutManager.getPaddingEnd();
                    } else {
                        height = pagerGridLayoutManager.getHeight();
                        paddingBottom = pagerGridLayoutManager.getPaddingBottom();
                    }
                    i7 = (height - paddingBottom) - rect.left;
                } else {
                    i7 = 0;
                }
                i10 = -i7;
                if (pagerGridLayoutManager.canScrollVertically()) {
                    if (pagerGridLayoutManager.canScrollHorizontally()) {
                        height2 = pagerGridLayoutManager.getWidth();
                        paddingBottom2 = pagerGridLayoutManager.getPaddingEnd();
                    } else {
                        height2 = pagerGridLayoutManager.getHeight();
                        paddingBottom2 = pagerGridLayoutManager.getPaddingBottom();
                    }
                    i11 = height2 - paddingBottom2;
                    i12 = rect.top;
                    i15 = i11 - i12;
                } else {
                    i15 = 0;
                }
                i16 = -i15;
                iArr[0] = i10;
                iArr[1] = i16;
                if (i10 == 0) {
                    pagerGridLayoutManager.o(position / pagerGridLayoutManager.f25208e);
                }
            }
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final RecyclerView.SmoothScroller createScroller(RecyclerView.LayoutManager layoutManager) {
        RecyclerView recyclerView;
        if ((layoutManager instanceof PagerGridLayoutManager) && (recyclerView = this.f2625a) != null) {
            return new d(recyclerView, (PagerGridLayoutManager) layoutManager);
        }
        return null;
    }

    public final void d(PagerGridLayoutManager pagerGridLayoutManager) {
        ArrayList arrayList = this.f2626b;
        if (!arrayList.isEmpty()) {
            arrayList.clear();
        }
        int childCount = pagerGridLayoutManager.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = pagerGridLayoutManager.getChildAt(i7);
            if (childAt != null && pagerGridLayoutManager.getPosition(childAt) % pagerGridLayoutManager.f25208e == 0) {
                arrayList.add(childAt);
            }
        }
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final View findSnapView(RecyclerView.LayoutManager layoutManager) {
        View view = null;
        if (layoutManager instanceof PagerGridLayoutManager) {
            PagerGridLayoutManager pagerGridLayoutManager = (PagerGridLayoutManager) layoutManager;
            d(pagerGridLayoutManager);
            ArrayList arrayList = this.f2626b;
            int size = arrayList.size();
            if (size == 1) {
                view = (View) arrayList.get(0);
            } else if (size == 2) {
                int iA = a(pagerGridLayoutManager);
                View view2 = (View) arrayList.get(0);
                View view3 = (View) arrayList.get(1);
                pagerGridLayoutManager.getDecoratedBoundsWithMargins(view3, new Rect());
                if (pagerGridLayoutManager.p()) {
                    if (b(pagerGridLayoutManager, view3) > iA) {
                        view2 = view3;
                    }
                } else if (c(pagerGridLayoutManager, view3) <= iA) {
                    view = view3;
                }
                view = view2;
            } else if (size == 3) {
                view = (View) arrayList.get(1);
            }
            arrayList.clear();
        }
        return view;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0093 A[PHI: r5
      0x0093: PHI (r5v5 int) = 
      (r5v1 int)
      (r5v2 int)
      (r5v3 int)
      (r5v1 int)
      (r5v1 int)
      (r5v4 int)
      (r5v1 int)
      (r5v6 int)
      (r5v7 int)
      (r5v1 int)
      (r5v1 int)
      (r5v8 int)
     binds: [B:76:0x00e1, B:78:0x00e5, B:73:0x00d4, B:62:0x00bb, B:65:0x00c3, B:68:0x00c8, B:57:0x00b1, B:59:0x00b5, B:54:0x00a4, B:43:0x0089, B:46:0x0091, B:49:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0105 A[PHI: r4
      0x0105: PHI (r4v5 int) = (r4v1 int), (r4v2 int), (r4v1 int), (r4v3 int), (r4v4 int), (r4v1 int), (r4v1 int), (r4v6 int), (r4v1 int), (r4v7 int) binds: [B:111:0x0143, B:113:0x0147, B:106:0x0133, B:108:0x0137, B:101:0x0121, B:82:0x00f5, B:93:0x0111, B:96:0x0116, B:87:0x0103, B:90:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.recyclerview.widget.SnapHelper
    public final int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i7, int i10) {
        int position = -1;
        if (layoutManager.getItemCount() != 0 && layoutManager.getChildCount() != 0 && (layoutManager instanceof PagerGridLayoutManager)) {
            PagerGridLayoutManager pagerGridLayoutManager = (PagerGridLayoutManager) layoutManager;
            if (pagerGridLayoutManager.t.f2619f != 0) {
                int[] iArrCalculateScrollDistance = calculateScrollDistance(i7, i10);
                int i11 = pagerGridLayoutManager.canScrollHorizontally() ? iArrCalculateScrollDistance[0] : iArrCalculateScrollDistance[1];
                if (pagerGridLayoutManager.p()) {
                    i11 = -i11;
                }
                boolean z3 = !pagerGridLayoutManager.canScrollHorizontally() ? i10 <= 0 : !pagerGridLayoutManager.f25196C ? i7 > 0 : i7 < 0;
                int iA = a(pagerGridLayoutManager);
                d(pagerGridLayoutManager);
                ArrayList arrayList = this.f2626b;
                int size = arrayList.size();
                if (size == 1) {
                    View view = (View) arrayList.get(0);
                    int position2 = pagerGridLayoutManager.getPosition(view);
                    if (z3) {
                        if (i11 >= iA) {
                            position = position2;
                        } else if (pagerGridLayoutManager.p()) {
                        }
                    } else if (Math.abs(i11) >= iA) {
                        position2--;
                        if (position2 >= 0) {
                            position = position2;
                        }
                    } else if (pagerGridLayoutManager.p()) {
                        if (c(pagerGridLayoutManager, view) - Math.abs(i11) >= iA || (position2 = position2 - 1) >= 0) {
                            position = position2;
                        }
                    } else if (Math.abs(i11) + b(pagerGridLayoutManager, view) <= iA || (position2 = position2 - 1) >= 0) {
                        position = position2;
                    }
                } else if (size == 2) {
                    View view2 = (View) arrayList.get(0);
                    pagerGridLayoutManager.getPosition(view2);
                    View view3 = (View) arrayList.get(1);
                    int position3 = pagerGridLayoutManager.getPosition(view3);
                    if (pagerGridLayoutManager.p()) {
                        if (z3) {
                            position = position3;
                        } else {
                            position = position3;
                        }
                    } else if (z3) {
                        if (i11 >= iA || c(pagerGridLayoutManager, view3) - i11 <= iA || (position3 = position3 - 1) >= 0) {
                            position = position3;
                        }
                    } else if (Math.abs(i11) >= iA) {
                        position3--;
                        if (position3 >= 0) {
                            position = position3;
                        }
                    } else if (Math.abs(i11) + b(pagerGridLayoutManager, view2) < iA || (position3 = position3 - 1) >= 0) {
                        position = position3;
                    }
                } else if (size == 3) {
                    position = pagerGridLayoutManager.getPosition((View) arrayList.get(1));
                }
                arrayList.clear();
                return position;
            }
        }
        return -1;
    }
}
