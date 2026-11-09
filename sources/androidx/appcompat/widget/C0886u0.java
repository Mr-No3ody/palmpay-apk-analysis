package androidx.appcompat.widget;

import android.os.Handler;
import android.widget.AbsListView;

/* JADX INFO: renamed from: androidx.appcompat.widget.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0886u0 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ListPopupWindow f13012a;

    public C0886u0(ListPopupWindow listPopupWindow) {
        this.f13012a = listPopupWindow;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i7, int i10, int i11) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i7) {
        if (i7 == 1) {
            ListPopupWindow listPopupWindow = this.f13012a;
            if (listPopupWindow.f12724p0.getInputMethodMode() == 2 || listPopupWindow.f12724p0.getContentView() == null) {
                return;
            }
            Handler handler = listPopupWindow.f12709X;
            RunnableC0882s0 runnableC0882s0 = listPopupWindow.f12705H;
            handler.removeCallbacks(runnableC0882s0);
            runnableC0882s0.run();
        }
    }
}
