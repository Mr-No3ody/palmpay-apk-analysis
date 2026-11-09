package com.transsnet.adsdk.widgets.banner;

import android.text.TextUtils;
import android.widget.ImageView;
import androidx.camera.camera2.internal.F;
import com.bumptech.glide.load.engine.k;
import com.bumptech.glide.load.resource.bitmap.z;
import com.bumptech.glide.m;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.R;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.utils.AdSdkUtils;
import com.transsnet.adsdk.utils.AppUtils;
import com.transsnet.adsdk.widgets.banner.bannerview.BaseBannerAdapter;
import com.transsnet.adsdk.widgets.banner.bannerview.BaseViewHolder;
import com.transsnet.adsdk.widgets.banner.bannerview.utils.BannerUtils;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BannerAdAdapter extends BaseBannerAdapter<AdEntity> {
    private int mBannerType;
    private int mRounderCorner;
    private int mDefaultRes = -1;
    private boolean bDarkMode = AdManager.get().isUseDarkMode();

    public BannerAdAdapter(int rounderCorner, int bannerType) {
        this.mBannerType = 0;
        this.mRounderCorner = rounderCorner;
        this.mBannerType = bannerType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadImage, reason: merged with bridge method [inline-methods] */
    public void lambda$bindData$0(ImageView imageView, AdEntity data, int position) {
        if (AdManager.isDebug()) {
            StringBuilder sbE = F.e(position, "BannerAd-", "-");
            sbE.append(data.adSlotId);
            imageView.setContentDescription(sbE.toString());
        }
        if (this.mBannerType == 1) {
            imageView.setPadding(0, 0, 0, BannerUtils.dp2px(28.0f));
        }
        G1.d dVar = new G1.d();
        com.bumptech.glide.load.b bVar = com.bumptech.glide.load.b.f20515b;
        G1.d dVar2 = (G1.d) dVar.m(bVar);
        int width = imageView == null ? 0 : imageView.getWidth();
        int height = imageView == null ? 0 : imageView.getHeight();
        if (width > 0) {
            dVar2 = (G1.d) dVar2.w(width, Integer.MIN_VALUE);
        } else if (height > 0) {
            dVar2 = (G1.d) dVar2.w(Integer.MIN_VALUE, height);
        }
        int i7 = this.mDefaultRes;
        if (i7 != -1) {
            dVar2 = (G1.d) ((G1.d) dVar2.x(i7)).j(this.mDefaultRes);
        }
        if (this.mRounderCorner > 0) {
            dVar2 = (G1.d) ((G1.d) dVar2.a((G1.d) new G1.d().I(new z(this.mRounderCorner), true))).m(bVar);
        }
        if (data == null || !AppUtils.isActivityAlive(imageView.getContext())) {
            return;
        }
        String str = data.imageUrl;
        if (this.bDarkMode && !TextUtils.isEmpty(data.imageUrlDark)) {
            str = data.imageUrlDark;
        }
        imageView.setImageAlpha((this.bDarkMode && TextUtils.isEmpty(data.imageUrlDark) && AdSdkUtils.isInDarkMode(imageView)) ? data.getAlpha() : 255);
        if (TextUtils.isEmpty(str)) {
            if (data.defaultImgRes != -1) {
                com.bumptech.glide.b.f(imageView).load(Integer.valueOf(data.defaultImgRes)).S(imageView);
            }
        } else {
            if (AdManager.isDebug()) {
                imageView.setTag(R.id.ad_image_url, str);
            }
            m mVar = (m) ((m) com.bumptech.glide.b.f(imageView).load(str).a(dVar2).g(k.f20703b)).F(false);
            C1.c cVar = new C1.c();
            cVar.f21077a = new org.greenrobot.eventbus.f(12);
            mVar.g0(cVar).S(imageView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        List<T> list = this.mList;
        int size = list != 0 ? list.size() : 0;
        int realPosition = BannerUtils.getRealPosition(position, size);
        if (realPosition < size) {
            try {
                return ((AdEntity) this.mList.get(realPosition)).displayOrder;
            } catch (Exception unused) {
            }
        }
        return position;
    }

    @Override // com.transsnet.adsdk.widgets.banner.bannerview.BaseBannerAdapter
    public int getLayoutId(int viewType) {
        return R.layout.lib_ad_item_slide_mode;
    }

    public void setDefaultRes(int mDefaultRes) {
        this.mDefaultRes = mDefaultRes;
    }

    public void switchDarkMode(boolean dark) {
        this.bDarkMode = dark;
    }

    @Override // com.transsnet.adsdk.widgets.banner.bannerview.BaseBannerAdapter
    public void bindData(BaseViewHolder<AdEntity> holder, AdEntity data, int position, int pageSize) {
        ImageView imageView = (ImageView) holder.findViewById(R.id.banner_image);
        int width = imageView == null ? 0 : imageView.getWidth();
        int height = imageView != null ? imageView.getHeight() : 0;
        if (imageView != null) {
            if (width > 0 || height > 0) {
                lambda$bindData$0(imageView, data, position);
            } else {
                imageView.post(new androidx.camera.video.internal.encoder.m(this, imageView, data, position, 3));
            }
        }
    }
}
