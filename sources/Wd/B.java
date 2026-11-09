package Wd;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.transsnet.palmpay.core.bean.req.AddFamilyAccontReq;
import com.transsnet.palmpay.teller.bean.CheckCustomerIdReq;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderReq;
import com.transsnet.palmpay.teller.bean.resp.BillerHistoryItemBean;
import com.transsnet.palmpay.teller.ui.activity.CommomHistoryFragment;
import com.transsnet.palmpay.teller.viewmodel.CommonHistoryViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p086fe.L0;
import p086fe.M0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class B implements OnItemClickListener, OnItemChildClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Xd.p f10705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CommomHistoryFragment f10706b;

    public /* synthetic */ B(Xd.p pVar, CommomHistoryFragment commomHistoryFragment) {
        this.f10705a = pVar;
        this.f10706b = commomHistoryFragment;
    }

    @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
    public void onItemChildClick(M1.j jVar, View view, int i7) {
        String string;
        String string2;
        CommomHistoryFragment.a aVar = CommomHistoryFragment.f34200A;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        BillerHistoryItemBean bean = (BillerHistoryItemBean) this.f10705a.getData().get(i7);
        Integer itemType = bean.getItemType();
        if (itemType != null && itemType.intValue() == 1) {
            CommomHistoryFragment commomHistoryFragment = this.f10706b;
            Intrinsics.checkNotNullParameter(bean, "bean");
            if (AddFamilyAccontReq.BILLER_CATEGORY_ID_BUNDLE.equalsIgnoreCase(commomHistoryFragment.v())) {
                ARouter.getInstance().build("/quick_teller/buy_bundle_ng").withString("phone_number", bean.getCustomerId()).navigation();
                return;
            }
            if ("2".equalsIgnoreCase(commomHistoryFragment.v())) {
                CommonHistoryViewModel commonHistoryViewModel = (CommonHistoryViewModel) commomHistoryFragment.f27333i;
                if (commonHistoryViewModel != null) {
                    CheckCustomerIdReq checkCustomerIdReq = new CheckCustomerIdReq();
                    checkCustomerIdReq.billerId = bean.getBillerId();
                    checkCustomerIdReq.billerName = bean.getBillerName();
                    Long businessAmount = bean.getBusinessAmount();
                    checkCustomerIdReq.businessAmount = businessAmount != null ? businessAmount.longValue() : 0L;
                    checkCustomerIdReq.customerId = bean.getCustomerId();
                    checkCustomerIdReq.paymentItemId = bean.getPaymentItemId();
                    checkCustomerIdReq.paymentItemName = bean.getPaymentItemName();
                    checkCustomerIdReq.icon = bean.getIcon();
                    checkCustomerIdReq.categoryId = commomHistoryFragment.v();
                    checkCustomerIdReq.itemId = bean.getPaymentItemId();
                    if (TextUtils.isEmpty(bean.getCustomerDisplayName())) {
                        String str = p070ee.c.f36289a;
                        string2 = commomHistoryFragment.getString(p070ee.c.e(commomHistoryFragment.v()));
                    } else {
                        string2 = bean.getCustomerDisplayName();
                    }
                    checkCustomerIdReq.customerDisplayName = string2;
                    L0 l5 = new L0(checkCustomerIdReq, null);
                    com.transsnet.palmpay.core.base.l lVar = commonHistoryViewModel.f34425g;
                    lVar.f27356m = checkCustomerIdReq;
                    Unit unit = Unit.f38893a;
                    p140j8.f.v(commonHistoryViewModel, l5, lVar, 0L);
                    return;
                }
                return;
            }
            CommonHistoryViewModel commonHistoryViewModel2 = (CommonHistoryViewModel) commomHistoryFragment.f27333i;
            if (commonHistoryViewModel2 != null) {
                CreateTellerOrderReq req = new CreateTellerOrderReq();
                Long businessAmount2 = bean.getBusinessAmount();
                req.businessAmount = businessAmount2 != null ? businessAmount2.longValue() : 0L;
                req.customerId = bean.getCustomerId();
                Object obj = p070ee.b.f36288a;
                req.transType = p070ee.b.b(commomHistoryFragment.v());
                req.businessType = p070ee.b.a(commomHistoryFragment.v());
                req.billerName = bean.getBillerName();
                req.billerId = bean.getBillerId();
                req.categoryId = commomHistoryFragment.v();
                if (TextUtils.isEmpty(bean.getCustomerDisplayName())) {
                    String str2 = p070ee.c.f36289a;
                    string = commomHistoryFragment.getString(p070ee.c.e(commomHistoryFragment.v()));
                } else {
                    string = bean.getCustomerDisplayName();
                }
                req.customerDisplayName = string;
                req.paymentItemId = bean.getPaymentItemId();
                req.icon = bean.getIcon();
                req.paymentItemName = bean.getPaymentItemName();
                req.verifyNetwork = false;
                Intrinsics.checkNotNullParameter(req, "req");
                M0 m7 = new M0(req, null);
                com.transsnet.palmpay.core.base.l lVar2 = commonHistoryViewModel2.f34424f;
                lVar2.f27356m = req;
                Unit unit2 = Unit.f38893a;
                p140j8.f.v(commonHistoryViewModel2, m7, lVar2, 0L);
            }
        }
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j jVar, View view, int i7) {
        CommomHistoryFragment.a aVar = CommomHistoryFragment.f34200A;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Postcard postcardWithString = ARouter.getInstance().build("/quick_teller/bill_detail").withString("orderNo", ((BillerHistoryItemBean) ((Xd.p) this.f10706b.f34201w.getValue()).getData().get(i7)).getOrderNo());
        Object obj = p070ee.b.f36288a;
        postcardWithString.withString("extra_type", p070ee.b.b(this.f10705a.f11150b)).navigation();
    }

    public /* synthetic */ B(CommomHistoryFragment commomHistoryFragment, Xd.p pVar) {
        this.f10706b = commomHistoryFragment;
        this.f10705a = pVar;
    }
}
