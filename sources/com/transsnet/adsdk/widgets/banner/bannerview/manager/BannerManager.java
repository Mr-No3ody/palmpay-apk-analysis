package com.transsnet.adsdk.widgets.banner.bannerview.manager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;
import com.transsnet.adsdk.widgets.banner.bannerview.transform.OverlapPageTransformer;
import com.transsnet.adsdk.widgets.banner.bannerview.transform.ScaleInTransformer;

/* JADX INFO: loaded from: classes3.dex */
public class BannerManager {
    private final AttributeController mAttributeController;
    private BannerOptions mBannerOptions;
    private final CompositePageTransformer mCompositePageTransformer;
    private ViewPager2.PageTransformer mDefaultPageTransformer;
    private MarginPageTransformer mMarginPageTransformer;

    public BannerManager() {
        BannerOptions bannerOptions = new BannerOptions();
        this.mBannerOptions = bannerOptions;
        this.mAttributeController = new AttributeController(bannerOptions);
        this.mCompositePageTransformer = new CompositePageTransformer();
    }

    public void addTransformer(@NonNull ViewPager2.PageTransformer transformer) {
        this.mCompositePageTransformer.addTransformer(transformer);
    }

    public void createMarginTransformer() {
        removeMarginPageTransformer();
        MarginPageTransformer marginPageTransformer = new MarginPageTransformer(this.mBannerOptions.getPageMargin());
        this.mMarginPageTransformer = marginPageTransformer;
        this.mCompositePageTransformer.addTransformer(marginPageTransformer);
    }

    public BannerOptions getBannerOptions() {
        if (this.mBannerOptions == null) {
            this.mBannerOptions = new BannerOptions();
        }
        return this.mBannerOptions;
    }

    public CompositePageTransformer getCompositePageTransformer() {
        return this.mCompositePageTransformer;
    }

    public void initAttrs(Context context, AttributeSet attrs) {
        this.mAttributeController.init(context, attrs);
    }

    public void removeDefaultPageTransformer() {
        ViewPager2.PageTransformer pageTransformer = this.mDefaultPageTransformer;
        if (pageTransformer != null) {
            this.mCompositePageTransformer.removeTransformer(pageTransformer);
        }
    }

    public void removeMarginPageTransformer() {
        MarginPageTransformer marginPageTransformer = this.mMarginPageTransformer;
        if (marginPageTransformer != null) {
            this.mCompositePageTransformer.removeTransformer(marginPageTransformer);
        }
    }

    public void removeTransformer(@NonNull ViewPager2.PageTransformer transformer) {
        this.mCompositePageTransformer.removeTransformer(transformer);
    }

    public void setMultiPageStyle(boolean overlap, float scale) {
        removeDefaultPageTransformer();
        if (overlap) {
            this.mDefaultPageTransformer = new OverlapPageTransformer(this.mBannerOptions.getOrientation(), scale, 0.0f, 1.0f, 0.0f);
        } else {
            this.mDefaultPageTransformer = new ScaleInTransformer(scale, this.mBannerOptions.isRtl());
        }
        this.mCompositePageTransformer.addTransformer(this.mDefaultPageTransformer);
    }

    public void setPageMargin(int pageMargin) {
        this.mBannerOptions.setPageMargin(pageMargin);
    }
}
