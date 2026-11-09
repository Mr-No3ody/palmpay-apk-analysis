package Zd;

import Pa.C0525w;
import android.text.TextUtils;
import android.view.View;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.google.gson.Gson;
import com.transsnet.palmpay.teller.bean.TvListByCategoryIdResp;
import com.transsnet.palmpay.teller.ui.fragment.TvPaymentListFragment;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class F implements OnItemClickListener, OnItemChildClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TvPaymentListFragment f11644a;

    public /* synthetic */ F(TvPaymentListFragment tvPaymentListFragment) {
        this.f11644a = tvPaymentListFragment;
    }

    @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
    public void onItemChildClick(M1.j jVar, View view, int i7) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "view");
        int id2 = view.getId();
        if (id2 == Pd.c.ll_data_bundle_name || id2 == Pd.c.data_bundle_name_iv || id2 == Pd.c.data_bundle_name_tv) {
            TvPaymentListFragment tvPaymentListFragment = this.f11644a;
            tvPaymentListFragment.t().getViewByPosition(i7, Pd.c.data_bundle_name_iv);
            String description = ((TvListByCategoryIdResp.TvItemChildBean) tvPaymentListFragment.t().getItem(i7)).getDescription();
            if (description != null) {
                TextUtils.isEmpty(description);
            }
        }
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j jVar, View view, int i7) {
        String billerId;
        String billerName;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        TvPaymentListFragment tvPaymentListFragment = this.f11644a;
        Pair pair = new Pair("DATA_KEY_PAYMENT_ITEM", ((Gson) C0525w.f().f7166b).toJson((TvListByCategoryIdResp.TvItemChildBean) tvPaymentListFragment.t().getItem(i7)));
        p355xf.t tVar = tvPaymentListFragment.f34318v;
        TvListByCategoryIdResp.TvCategoryBean tvCategoryBean = (TvListByCategoryIdResp.TvCategoryBean) tVar.getValue();
        String str = "";
        if (tvCategoryBean == null || (billerId = tvCategoryBean.getBillerId()) == null) {
            billerId = "";
        }
        Pair pair2 = new Pair("DATA_KEY_BILLER_ID", billerId);
        TvListByCategoryIdResp.TvCategoryBean tvCategoryBean2 = (TvListByCategoryIdResp.TvCategoryBean) tVar.getValue();
        if (tvCategoryBean2 != null && (billerName = tvCategoryBean2.getBillerName()) != null) {
            str = billerName;
        }
        tvPaymentListFragment.getParentFragmentManager().setFragmentResult("REQUEST_CODE_CLICK_PAYMENT_ITEM", p002a.a.e(pair, pair2, new Pair("DATA_KEY_BILLER_NAME", str)));
    }
}
