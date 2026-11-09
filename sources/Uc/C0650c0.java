package Uc;

import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.LatLng;
import com.transsnet.palmpay.p2pcash.bean.rsp.ShopHomeByMemberIdResp;
import com.transsnet.palmpay.p2pcash.ui.atm.MapPage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Uc.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0650c0 implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapPage f9623a;

    public C0650c0(MapPage mapPage) {
        this.f9623a = mapPage;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i7) {
        int i10 = MapPage.f32859u0;
        MapPage mapPage = this.f9623a;
        mapPage.r().f9600f = false;
        Object obj = mapPage.r().c().get(i7);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        ShopHomeByMemberIdResp.NearbyShopListBean nearbyShopListBean = (ShopHomeByMemberIdResp.NearbyShopListBean) obj;
        Y yS = mapPage.s();
        double d2 = nearbyShopListBean.latitude;
        double d10 = nearbyShopListBean.longitude;
        yS.getClass();
        try {
            yS.b().animateCamera(CameraUpdateFactory.newLatLng(new LatLng(d2, d10)));
        } catch (Exception unused) {
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i7) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i7, float f10, int i10) {
    }
}
