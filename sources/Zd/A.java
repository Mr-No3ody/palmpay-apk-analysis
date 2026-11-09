package Zd;

import Pa.n0;
import androidx.viewpager2.widget.ViewPager2;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.teller.bean.TvListByCategoryIdResp;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentTvHomeFragment;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BillPaymentTvHomeFragment f11635a;

    public A(BillPaymentTvHomeFragment billPaymentTvHomeFragment) {
        this.f11635a = billPaymentTvHomeFragment;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i7) {
        String businessCategoryName;
        super.onPageSelected(i7);
        TvListByCategoryIdResp.TvCategoryBean tvCategoryBean = (TvListByCategoryIdResp.TvCategoryBean) CollectionsKt.G(i7, this.f11635a.f34297B);
        if (tvCategoryBean == null || (businessCategoryName = tvCategoryBean.getBusinessCategoryName()) == null) {
            businessCategoryName = "";
        }
        n0.g().k((ClickEvent) C0.G.f("PPay_TV_Btn_Category_Click", "element_name", businessCategoryName));
    }
}
