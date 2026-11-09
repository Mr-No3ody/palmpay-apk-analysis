package androidx.drawerlayout.widget;

import android.view.View;
import androidx.customview.widget.g;

/* JADX INFO: loaded from: classes.dex */
public final class f extends androidx.customview.widget.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f16830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.customview.widget.e f16831c = new androidx.customview.widget.e(this, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f16832d;

    public f(DrawerLayout drawerLayout, int i7) {
        this.f16832d = drawerLayout;
        this.f16829a = i7;
    }

    @Override // androidx.customview.widget.f
    public final int clampViewPositionHorizontal(View view, int i7, int i10) {
        DrawerLayout drawerLayout = this.f16832d;
        if (drawerLayout.checkDrawerViewAbsoluteGravity(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i7, 0));
        }
        int width = drawerLayout.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i7, width));
    }

    @Override // androidx.customview.widget.f
    public final int clampViewPositionVertical(View view, int i7, int i10) {
        return view.getTop();
    }

    @Override // androidx.customview.widget.f
    public final int getViewHorizontalDragRange(View view) {
        if (this.f16832d.isDrawerView(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // androidx.customview.widget.f
    public final void onEdgeDragStarted(int i7, int i10) {
        int i11 = i7 & 1;
        DrawerLayout drawerLayout = this.f16832d;
        View viewFindDrawerWithGravity = i11 == 1 ? drawerLayout.findDrawerWithGravity(3) : drawerLayout.findDrawerWithGravity(5);
        if (viewFindDrawerWithGravity == null || drawerLayout.getDrawerLockMode(viewFindDrawerWithGravity) != 0) {
            return;
        }
        this.f16830b.c(i10, viewFindDrawerWithGravity);
    }

    @Override // androidx.customview.widget.f
    public final boolean onEdgeLock(int i7) {
        return false;
    }

    @Override // androidx.customview.widget.f
    public final void onEdgeTouched(int i7, int i10) {
        this.f16832d.postDelayed(this.f16831c, 160L);
    }

    @Override // androidx.customview.widget.f
    public final void onViewCaptured(View view, int i7) {
        ((DrawerLayout.LayoutParams) view.getLayoutParams()).f16820c = false;
        int i10 = this.f16829a == 3 ? 5 : 3;
        DrawerLayout drawerLayout = this.f16832d;
        View viewFindDrawerWithGravity = drawerLayout.findDrawerWithGravity(i10);
        if (viewFindDrawerWithGravity != null) {
            drawerLayout.closeDrawer(viewFindDrawerWithGravity);
        }
    }

    @Override // androidx.customview.widget.f
    public final void onViewDragStateChanged(int i7) {
        this.f16832d.updateDrawerState(i7, this.f16830b.t);
    }

    @Override // androidx.customview.widget.f
    public final void onViewPositionChanged(View view, int i7, int i10, int i11, int i12) {
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.f16832d;
        float width2 = (drawerLayout.checkDrawerViewAbsoluteGravity(view, 3) ? i7 + width : drawerLayout.getWidth() - i7) / width;
        drawerLayout.setDrawerViewOffset(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        drawerLayout.invalidate();
    }

    @Override // androidx.customview.widget.f
    public final void onViewReleased(View view, float f10, float f11) {
        int i7;
        DrawerLayout drawerLayout = this.f16832d;
        float drawerViewOffset = drawerLayout.getDrawerViewOffset(view);
        int width = view.getWidth();
        if (drawerLayout.checkDrawerViewAbsoluteGravity(view, 3)) {
            i7 = (f10 > 0.0f || (f10 == 0.0f && drawerViewOffset > 0.5f)) ? 0 : -width;
        } else {
            int width2 = drawerLayout.getWidth();
            if (f10 < 0.0f || (f10 == 0.0f && drawerViewOffset > 0.5f)) {
                width2 -= width;
            }
            i7 = width2;
        }
        this.f16830b.t(i7, view.getTop());
        drawerLayout.invalidate();
    }

    @Override // androidx.customview.widget.f
    public final boolean tryCaptureView(View view, int i7) {
        DrawerLayout drawerLayout = this.f16832d;
        return drawerLayout.isDrawerView(view) && drawerLayout.checkDrawerViewAbsoluteGravity(view, this.f16829a) && drawerLayout.getDrawerLockMode(view) == 0;
    }
}
