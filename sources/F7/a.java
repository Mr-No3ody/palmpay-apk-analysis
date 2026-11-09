package F7;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.shencoder.pagergridlayoutmanager.PagerGridLayoutManager;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends RecyclerView.SimpleOnItemTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PagerGridLayoutManager f2609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f2610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2613e;

    public a(RecyclerView recyclerView, PagerGridLayoutManager pagerGridLayoutManager) {
        this.f2609a = pagerGridLayoutManager;
        this.f2610b = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    @Override // androidx.recyclerview.widget.RecyclerView.SimpleOnItemTouchListener, androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        RecyclerView recyclerView2 = this.f2610b;
        if (actionMasked == 0) {
            this.f2611c = motionEvent.getPointerId(actionIndex);
            this.f2612d = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f2613e = (int) (motionEvent.getY(actionIndex) + 0.5f);
            recyclerView2.getParent().requestDisallowInterceptTouchEvent(true);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f2611c);
            if (iFindPointerIndex < 0) {
                return false;
            }
            int x3 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y8 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            int i7 = x3 - this.f2612d;
            int i10 = y8 - this.f2613e;
            PagerGridLayoutManager pagerGridLayoutManager = this.f2609a;
            if (pagerGridLayoutManager.canScrollHorizontally()) {
                recyclerView2.getParent().requestDisallowInterceptTouchEvent(recyclerView2.canScrollHorizontally(-i7));
            }
            if (pagerGridLayoutManager.canScrollVertically()) {
                recyclerView2.getParent().requestDisallowInterceptTouchEvent(recyclerView2.canScrollVertically(-i10));
            }
        } else if (actionMasked == 5) {
            this.f2611c = motionEvent.getPointerId(actionIndex);
            this.f2612d = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f2613e = (int) (motionEvent.getY(actionIndex) + 0.5f);
            recyclerView2.getParent().requestDisallowInterceptTouchEvent(true);
        } else if (actionMasked == 6) {
            int actionIndex2 = motionEvent.getActionIndex();
            if (motionEvent.getPointerId(actionIndex2) == this.f2611c) {
                int i11 = actionIndex2 != 0 ? 0 : 1;
                this.f2611c = motionEvent.getPointerId(i11);
                this.f2612d = (int) (motionEvent.getX(i11) + 0.5f);
                this.f2613e = (int) (motionEvent.getY(i11) + 0.5f);
            }
        }
        return false;
    }
}
