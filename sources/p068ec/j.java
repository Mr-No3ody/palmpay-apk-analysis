package p068ec;

import Pa.n0;
import androidx.viewpager2.widget.ViewPager2;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;
import com.transsnet.palmpay.teller.bean.DataBundleListByCategoryIdResp;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BuyBundleHomePageActivity f36263a;

    public j(BuyBundleHomePageActivity buyBundleHomePageActivity) {
        this.f36263a = buyBundleHomePageActivity;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i7) {
        DataBundleListByCategoryIdResp.DataBundleWalletCategoryBean dataBundleWalletCategoryBean;
        DataBundleListByCategoryIdResp.DataBundleWalletCategoryBean dataBundleWalletCategoryBean2;
        BuyBundleHomePageActivity buyBundleHomePageActivity = this.f36263a;
        super.onPageSelected(i7);
        try {
            n0 n0VarG = n0.g();
            ClickEvent clickEvent = new ClickEvent("DataBundle_Homepage_Tab_Click");
            ArrayList arrayList = buyBundleHomePageActivity.f31759s0;
            String bundleCategoryName = null;
            ClickEvent clickEventAdd = clickEvent.add("billerName", (arrayList == null || (dataBundleWalletCategoryBean2 = (DataBundleListByCategoryIdResp.DataBundleWalletCategoryBean) arrayList.get(i7)) == null) ? null : dataBundleWalletCategoryBean2.getBillerName());
            ArrayList arrayList2 = buyBundleHomePageActivity.f31759s0;
            if (arrayList2 != null && (dataBundleWalletCategoryBean = (DataBundleListByCategoryIdResp.DataBundleWalletCategoryBean) arrayList2.get(i7)) != null) {
                bundleCategoryName = dataBundleWalletCategoryBean.getBundleCategoryName();
            }
            n0VarG.k(clickEventAdd.add("categoryName", bundleCategoryName));
        } catch (Exception unused) {
        }
    }
}
