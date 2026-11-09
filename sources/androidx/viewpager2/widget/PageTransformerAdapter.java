package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class PageTransformerAdapter extends ViewPager2.OnPageChangeCallback {
    private final LinearLayoutManager mLayoutManager;
    private ViewPager2.PageTransformer mPageTransformer;

    public PageTransformerAdapter(LinearLayoutManager linearLayoutManager) {
        this.mLayoutManager = linearLayoutManager;
    }

    public ViewPager2.PageTransformer getPageTransformer() {
        return this.mPageTransformer;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrollStateChanged(int i7) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrolled(int i7, float f10, int i10) {
        if (this.mPageTransformer == null) {
            return;
        }
        float f11 = -f10;
        for (int i11 = 0; i11 < this.mLayoutManager.getChildCount(); i11++) {
            View childAt = this.mLayoutManager.getChildAt(i11);
            if (childAt == null) {
                Locale locale = Locale.US;
                throw new IllegalStateException("LayoutManager returned a null child at pos " + i11 + "/" + this.mLayoutManager.getChildCount() + " while transforming pages");
            }
            this.mPageTransformer.transformPage(childAt, (this.mLayoutManager.getPosition(childAt) - i7) + f11);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int i7) {
    }

    public void setPageTransformer(@Nullable ViewPager2.PageTransformer pageTransformer) {
        this.mPageTransformer = pageTransformer;
    }
}
