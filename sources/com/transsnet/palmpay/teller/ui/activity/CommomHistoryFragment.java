package com.transsnet.palmpay.teller.ui.activity;

import Fe.h0;
import M1.d;
import M3.f;
import Xd.p;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.E;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.cashier.CoreCashierPaymentExtra;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.teller.bean.CheckCustomerIdReq;
import com.transsnet.palmpay.teller.bean.CheckTvItemRsp;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderReq;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderRsp;
import com.transsnet.palmpay.teller.bean.TvListByCategoryIdResp;
import com.transsnet.palmpay.teller.bean.TvRenewDataInfoBean;
import com.transsnet.palmpay.teller.ui.activity.CommomHistoryFragment;
import com.transsnet.palmpay.teller.ui.fragment.BaseBillerHistoryFragment;
import com.transsnet.palmpay.teller.viewmodel.CommonHistoryViewModel;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.fastkv.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.G;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p070ee.b;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/activity/CommomHistoryFragment;", "Lcom/transsnet/palmpay/teller/ui/fragment/BaseBillerHistoryFragment;", "Lcom/transsnet/palmpay/teller/viewmodel/CommonHistoryViewModel;", "<init>", "()V", "a", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCommomHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommomHistoryFragment.kt\ncom/transsnet/palmpay/teller/ui/activity/CommomHistoryFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,335:1\n1869#2,2:336\n*S KotlinDebug\n*F\n+ 1 CommomHistoryFragment.kt\ncom/transsnet/palmpay/teller/ui/activity/CommomHistoryFragment\n*L\n260#1:336,2\n*E\n"})
public final class CommomHistoryFragment extends BaseBillerHistoryFragment<CommonHistoryViewModel> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final a f34200A = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f34201w = C2131j.b(new f(this, 27));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CommomHistoryFragment newInstance(@NotNull String categoryId) {
            Intrinsics.checkNotNullParameter(categoryId, "categoryId");
            CommomHistoryFragment commomHistoryFragment = new CommomHistoryFragment();
            Bundle bundle = new Bundle();
            bundle.putString("key_history_category_id", categoryId);
            commomHistoryFragment.setArguments(bundle);
            return commomHistoryFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.teller.ui.fragment.BaseBillerHistoryFragment, com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        super.n();
        CommonHistoryViewModel commonHistoryViewModel = (CommonHistoryViewModel) this.f27333i;
        final int i7 = 0;
        n.B(this, commonHistoryViewModel != null ? commonHistoryViewModel.f34425g : null, this, new Function2(this) { // from class: Wd.A

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommomHistoryFragment f10704b;

            {
                this.f10704b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                String str8;
                CreateTellerOrderRsp.DataBean dataBean;
                String strB;
                String str9 = "";
                CommomHistoryFragment commomHistoryFragment = this.f10704b;
                switch (i7) {
                    case 0:
                        CheckCustomerIdReq checkCustomerIdReq = (CheckCustomerIdReq) obj;
                        CheckTvItemRsp rsp = (CheckTvItemRsp) obj2;
                        CommomHistoryFragment.a aVar = CommomHistoryFragment.f34200A;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        if (ActivityUtils.isValidActivityContext(commomHistoryFragment.f27319c)) {
                            if (rsp.isSuccess()) {
                                CheckTvItemRsp.DataBean data = rsp.getData();
                                if (data != null) {
                                    Boolean available = data.getAvailable();
                                    Boolean bool = Boolean.TRUE;
                                    String string = null;
                                    if (Intrinsics.c(available, bool)) {
                                        TvRenewDataInfoBean tvRenewDataInfoBean = new TvRenewDataInfoBean();
                                        if (checkCustomerIdReq == null || (str2 = checkCustomerIdReq.billerName) == null) {
                                            str2 = "";
                                        }
                                        tvRenewDataInfoBean.setBillerName(str2);
                                        if (checkCustomerIdReq == null || (str3 = checkCustomerIdReq.billerId) == null) {
                                            str3 = "";
                                        }
                                        tvRenewDataInfoBean.setBillerId(str3);
                                        if (checkCustomerIdReq == null || (str4 = checkCustomerIdReq.customerId) == null) {
                                            str4 = "";
                                        }
                                        tvRenewDataInfoBean.setAccountNumber(str4);
                                        if (checkCustomerIdReq == null || (str5 = checkCustomerIdReq.paymentItemName) == null) {
                                            str5 = "";
                                        }
                                        tvRenewDataInfoBean.setPaymentItemName(str5);
                                        if (checkCustomerIdReq == null || (str6 = checkCustomerIdReq.paymentItemId) == null) {
                                            str6 = "";
                                        }
                                        tvRenewDataInfoBean.setPaymentItemId(str6);
                                        if (checkCustomerIdReq == null || (str7 = checkCustomerIdReq.customerDisplayName) == null) {
                                            str7 = "";
                                        }
                                        tvRenewDataInfoBean.setAccountNmberTitleName(str7);
                                        if (checkCustomerIdReq == null || (str8 = checkCustomerIdReq.icon) == null) {
                                            str8 = "";
                                        }
                                        tvRenewDataInfoBean.setBillerIcon(str8);
                                        tvRenewDataInfoBean.setAccountAmount(checkCustomerIdReq != null ? Long.valueOf(checkCustomerIdReq.businessAmount) : 0L);
                                        tvRenewDataInfoBean.setAvailable(Boolean.valueOf(Intrinsics.c(data.getAvailable(), bool)));
                                        tvRenewDataInfoBean.setFullName(data.getFullName());
                                        tvRenewDataInfoBean.setReferenceId(data.getReferenceId());
                                        tvRenewDataInfoBean.setAddress(data.getAddress());
                                        long minAmount = data.getMinAmount();
                                        if (minAmount == null) {
                                            minAmount = 0L;
                                        }
                                        tvRenewDataInfoBean.setMinAmount(minAmount);
                                        long renewalAmount = data.getRenewalAmount();
                                        if (renewalAmount == null) {
                                            renewalAmount = 0L;
                                        }
                                        tvRenewDataInfoBean.setRenewalAmount(renewalAmount);
                                        TvListByCategoryIdResp.TvItemChildBean item = data.getItem();
                                        tvRenewDataInfoBean.setViewDoc(item != null ? item.getViewDoc() : null);
                                        TvListByCategoryIdResp.TvItemChildBean item2 = data.getItem();
                                        tvRenewDataInfoBean.setViewPic(item2 != null ? item2.getViewPic() : null);
                                        tvRenewDataInfoBean.setItems(new ArrayList<>());
                                        List<CheckTvItemRsp.Item> items = data.getItems();
                                        if (items != null) {
                                            for (CheckTvItemRsp.Item item3 : items) {
                                                ArrayList<TvRenewDataInfoBean.Item> items2 = tvRenewDataInfoBean.getItems();
                                                if (items2 != null) {
                                                    String key = item3.getKey();
                                                    if (key == null) {
                                                        key = "";
                                                    }
                                                    String value = item3.getValue();
                                                    if (value == null) {
                                                        value = "";
                                                    }
                                                    items2.add(new TvRenewDataInfoBean.Item(key, value));
                                                }
                                            }
                                        }
                                        ARouter.getInstance().build("/quick_teller/tv_home_pre").withSerializable("extra_renew_data", tvRenewDataInfoBean).navigation();
                                    } else {
                                        if (checkCustomerIdReq != null && (str = checkCustomerIdReq.customerDisplayName) != null) {
                                            str9 = str;
                                        }
                                        if (TextUtils.isEmpty(str9)) {
                                            string = commomHistoryFragment.getString(Vd.a.qt_meter_number);
                                        } else if (checkCustomerIdReq != null) {
                                            string = checkCustomerIdReq.customerDisplayName;
                                        }
                                        commomHistoryFragment.p(commomHistoryFragment.getString(Pd.f.qt_msg_customer_id_invalid, string));
                                    }
                                }
                            } else {
                                commomHistoryFragment.p(rsp.getRespMsg());
                            }
                        }
                        break;
                    default:
                        CreateTellerOrderReq createTellerOrderReq = (CreateTellerOrderReq) obj;
                        CreateTellerOrderRsp rsp2 = (CreateTellerOrderRsp) obj2;
                        CommomHistoryFragment.a aVar2 = CommomHistoryFragment.f34200A;
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        if (!rsp2.isSuccess()) {
                            commomHistoryFragment.p(rsp2.getRespMsg());
                        } else if (createTellerOrderReq != null && (dataBean = rsp2.data) != null) {
                            if (TextUtils.isEmpty(dataBean.orderNo)) {
                                if (!TextUtils.isEmpty(dataBean.outstandingTips)) {
                                    commomHistoryFragment.p(dataBean.outstandingTips);
                                }
                            } else if (ActivityUtils.isValidActivityContext(commomHistoryFragment.f27319c)) {
                                if (rsp2.isSuccess()) {
                                    CreateTellerOrderRsp.DataBean dataBean2 = rsp2.data;
                                    if (dataBean2 != null) {
                                        androidx.fragment.app.E mActivity = commomHistoryFragment.f27319c;
                                        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
                                        C0751z c0751z = new C0751z(mActivity, 0);
                                        c0751z.f4978i = dataBean2.calculationExtInfo;
                                        c0751z.f4971b = rsp2.data.orderNo;
                                        c0751z.c(Long.valueOf(createTellerOrderReq.businessAmount));
                                        Object obj3 = p070ee.b.f36288a;
                                        c0751z.f4972c = p070ee.b.b(commomHistoryFragment.v());
                                        c0751z.f4974e = "5";
                                        ArrayList arrayList = new ArrayList();
                                        String string2 = commomHistoryFragment.getString(Pd.f.qt_biller_name);
                                        String str10 = createTellerOrderReq.billerName;
                                        if (str10 == null) {
                                            str10 = "";
                                        }
                                        arrayList.add(new CoreCashierPaymentExtra(string2, str10));
                                        if (!TextUtils.isEmpty(dataBean2.fullName)) {
                                            String string3 = commomHistoryFragment.getString(Vd.a.qt_account_name);
                                            String str11 = dataBean2.fullName;
                                            if (str11 == null) {
                                                str11 = "";
                                            }
                                            arrayList.add(new CoreCashierPaymentExtra(string3, str11));
                                        }
                                        String strB2 = createTellerOrderReq.customerDisplayName;
                                        if (strB2 == null) {
                                            String str12 = p070ee.c.f36289a;
                                            strB2 = p070ee.c.b(commomHistoryFragment.getContext(), commomHistoryFragment.v());
                                        }
                                        String str13 = createTellerOrderReq.customerId;
                                        if (str13 == null) {
                                            str13 = "";
                                        }
                                        arrayList.add(new CoreCashierPaymentExtra(strB2, str13));
                                        if (!TextUtils.isEmpty(dataBean2.address)) {
                                            String string4 = commomHistoryFragment.getString(p025ba.k.core_address);
                                            String str14 = dataBean2.address;
                                            arrayList.add(new CoreCashierPaymentExtra(string4, str14 != null ? str14 : ""));
                                        }
                                        c0751z.b(arrayList);
                                        c0751z.d();
                                    }
                                } else if ("QK000009".equals(rsp2.getRespCode())) {
                                    String str15 = createTellerOrderReq.customerDisplayName;
                                    if (TextUtils.isEmpty(str15 != null ? str15 : "")) {
                                        String str16 = p070ee.c.f36289a;
                                        strB = p070ee.c.b(commomHistoryFragment.f27319c, commomHistoryFragment.v());
                                    } else {
                                        strB = createTellerOrderReq.customerDisplayName;
                                    }
                                    commomHistoryFragment.p(commomHistoryFragment.getString(Pd.f.qt_msg_customer_id_invalid, strB));
                                } else {
                                    String respMsg = rsp2.getRespMsg();
                                    ToastUtils.showLong(respMsg != null ? respMsg : "", new Object[0]);
                                }
                            }
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new h0(28), false, null, 240);
        CommonHistoryViewModel commonHistoryViewModel2 = (CommonHistoryViewModel) this.f27333i;
        final int i10 = 1;
        n.B(this, commonHistoryViewModel2 != null ? commonHistoryViewModel2.f34424f : null, this, new Function2(this) { // from class: Wd.A

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommomHistoryFragment f10704b;

            {
                this.f10704b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                String str8;
                CreateTellerOrderRsp.DataBean dataBean;
                String strB;
                String str9 = "";
                CommomHistoryFragment commomHistoryFragment = this.f10704b;
                switch (i10) {
                    case 0:
                        CheckCustomerIdReq checkCustomerIdReq = (CheckCustomerIdReq) obj;
                        CheckTvItemRsp rsp = (CheckTvItemRsp) obj2;
                        CommomHistoryFragment.a aVar = CommomHistoryFragment.f34200A;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        if (ActivityUtils.isValidActivityContext(commomHistoryFragment.f27319c)) {
                            if (rsp.isSuccess()) {
                                CheckTvItemRsp.DataBean data = rsp.getData();
                                if (data != null) {
                                    Boolean available = data.getAvailable();
                                    Boolean bool = Boolean.TRUE;
                                    String string = null;
                                    if (Intrinsics.c(available, bool)) {
                                        TvRenewDataInfoBean tvRenewDataInfoBean = new TvRenewDataInfoBean();
                                        if (checkCustomerIdReq == null || (str2 = checkCustomerIdReq.billerName) == null) {
                                            str2 = "";
                                        }
                                        tvRenewDataInfoBean.setBillerName(str2);
                                        if (checkCustomerIdReq == null || (str3 = checkCustomerIdReq.billerId) == null) {
                                            str3 = "";
                                        }
                                        tvRenewDataInfoBean.setBillerId(str3);
                                        if (checkCustomerIdReq == null || (str4 = checkCustomerIdReq.customerId) == null) {
                                            str4 = "";
                                        }
                                        tvRenewDataInfoBean.setAccountNumber(str4);
                                        if (checkCustomerIdReq == null || (str5 = checkCustomerIdReq.paymentItemName) == null) {
                                            str5 = "";
                                        }
                                        tvRenewDataInfoBean.setPaymentItemName(str5);
                                        if (checkCustomerIdReq == null || (str6 = checkCustomerIdReq.paymentItemId) == null) {
                                            str6 = "";
                                        }
                                        tvRenewDataInfoBean.setPaymentItemId(str6);
                                        if (checkCustomerIdReq == null || (str7 = checkCustomerIdReq.customerDisplayName) == null) {
                                            str7 = "";
                                        }
                                        tvRenewDataInfoBean.setAccountNmberTitleName(str7);
                                        if (checkCustomerIdReq == null || (str8 = checkCustomerIdReq.icon) == null) {
                                            str8 = "";
                                        }
                                        tvRenewDataInfoBean.setBillerIcon(str8);
                                        tvRenewDataInfoBean.setAccountAmount(checkCustomerIdReq != null ? Long.valueOf(checkCustomerIdReq.businessAmount) : 0L);
                                        tvRenewDataInfoBean.setAvailable(Boolean.valueOf(Intrinsics.c(data.getAvailable(), bool)));
                                        tvRenewDataInfoBean.setFullName(data.getFullName());
                                        tvRenewDataInfoBean.setReferenceId(data.getReferenceId());
                                        tvRenewDataInfoBean.setAddress(data.getAddress());
                                        long minAmount = data.getMinAmount();
                                        if (minAmount == null) {
                                            minAmount = 0L;
                                        }
                                        tvRenewDataInfoBean.setMinAmount(minAmount);
                                        long renewalAmount = data.getRenewalAmount();
                                        if (renewalAmount == null) {
                                            renewalAmount = 0L;
                                        }
                                        tvRenewDataInfoBean.setRenewalAmount(renewalAmount);
                                        TvListByCategoryIdResp.TvItemChildBean item = data.getItem();
                                        tvRenewDataInfoBean.setViewDoc(item != null ? item.getViewDoc() : null);
                                        TvListByCategoryIdResp.TvItemChildBean item2 = data.getItem();
                                        tvRenewDataInfoBean.setViewPic(item2 != null ? item2.getViewPic() : null);
                                        tvRenewDataInfoBean.setItems(new ArrayList<>());
                                        List<CheckTvItemRsp.Item> items = data.getItems();
                                        if (items != null) {
                                            for (CheckTvItemRsp.Item item3 : items) {
                                                ArrayList<TvRenewDataInfoBean.Item> items2 = tvRenewDataInfoBean.getItems();
                                                if (items2 != null) {
                                                    String key = item3.getKey();
                                                    if (key == null) {
                                                        key = "";
                                                    }
                                                    String value = item3.getValue();
                                                    if (value == null) {
                                                        value = "";
                                                    }
                                                    items2.add(new TvRenewDataInfoBean.Item(key, value));
                                                }
                                            }
                                        }
                                        ARouter.getInstance().build("/quick_teller/tv_home_pre").withSerializable("extra_renew_data", tvRenewDataInfoBean).navigation();
                                    } else {
                                        if (checkCustomerIdReq != null && (str = checkCustomerIdReq.customerDisplayName) != null) {
                                            str9 = str;
                                        }
                                        if (TextUtils.isEmpty(str9)) {
                                            string = commomHistoryFragment.getString(Vd.a.qt_meter_number);
                                        } else if (checkCustomerIdReq != null) {
                                            string = checkCustomerIdReq.customerDisplayName;
                                        }
                                        commomHistoryFragment.p(commomHistoryFragment.getString(Pd.f.qt_msg_customer_id_invalid, string));
                                    }
                                }
                            } else {
                                commomHistoryFragment.p(rsp.getRespMsg());
                            }
                        }
                        break;
                    default:
                        CreateTellerOrderReq createTellerOrderReq = (CreateTellerOrderReq) obj;
                        CreateTellerOrderRsp rsp2 = (CreateTellerOrderRsp) obj2;
                        CommomHistoryFragment.a aVar2 = CommomHistoryFragment.f34200A;
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        if (!rsp2.isSuccess()) {
                            commomHistoryFragment.p(rsp2.getRespMsg());
                        } else if (createTellerOrderReq != null && (dataBean = rsp2.data) != null) {
                            if (TextUtils.isEmpty(dataBean.orderNo)) {
                                if (!TextUtils.isEmpty(dataBean.outstandingTips)) {
                                    commomHistoryFragment.p(dataBean.outstandingTips);
                                }
                            } else if (ActivityUtils.isValidActivityContext(commomHistoryFragment.f27319c)) {
                                if (rsp2.isSuccess()) {
                                    CreateTellerOrderRsp.DataBean dataBean2 = rsp2.data;
                                    if (dataBean2 != null) {
                                        androidx.fragment.app.E mActivity = commomHistoryFragment.f27319c;
                                        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
                                        C0751z c0751z = new C0751z(mActivity, 0);
                                        c0751z.f4978i = dataBean2.calculationExtInfo;
                                        c0751z.f4971b = rsp2.data.orderNo;
                                        c0751z.c(Long.valueOf(createTellerOrderReq.businessAmount));
                                        Object obj3 = p070ee.b.f36288a;
                                        c0751z.f4972c = p070ee.b.b(commomHistoryFragment.v());
                                        c0751z.f4974e = "5";
                                        ArrayList arrayList = new ArrayList();
                                        String string2 = commomHistoryFragment.getString(Pd.f.qt_biller_name);
                                        String str10 = createTellerOrderReq.billerName;
                                        if (str10 == null) {
                                            str10 = "";
                                        }
                                        arrayList.add(new CoreCashierPaymentExtra(string2, str10));
                                        if (!TextUtils.isEmpty(dataBean2.fullName)) {
                                            String string3 = commomHistoryFragment.getString(Vd.a.qt_account_name);
                                            String str11 = dataBean2.fullName;
                                            if (str11 == null) {
                                                str11 = "";
                                            }
                                            arrayList.add(new CoreCashierPaymentExtra(string3, str11));
                                        }
                                        String strB2 = createTellerOrderReq.customerDisplayName;
                                        if (strB2 == null) {
                                            String str12 = p070ee.c.f36289a;
                                            strB2 = p070ee.c.b(commomHistoryFragment.getContext(), commomHistoryFragment.v());
                                        }
                                        String str13 = createTellerOrderReq.customerId;
                                        if (str13 == null) {
                                            str13 = "";
                                        }
                                        arrayList.add(new CoreCashierPaymentExtra(strB2, str13));
                                        if (!TextUtils.isEmpty(dataBean2.address)) {
                                            String string4 = commomHistoryFragment.getString(p025ba.k.core_address);
                                            String str14 = dataBean2.address;
                                            arrayList.add(new CoreCashierPaymentExtra(string4, str14 != null ? str14 : ""));
                                        }
                                        c0751z.b(arrayList);
                                        c0751z.d();
                                    }
                                } else if ("QK000009".equals(rsp2.getRespCode())) {
                                    String str15 = createTellerOrderReq.customerDisplayName;
                                    if (TextUtils.isEmpty(str15 != null ? str15 : "")) {
                                        String str16 = p070ee.c.f36289a;
                                        strB = p070ee.c.b(commomHistoryFragment.f27319c, commomHistoryFragment.v());
                                    } else {
                                        strB = createTellerOrderReq.customerDisplayName;
                                    }
                                    commomHistoryFragment.p(commomHistoryFragment.getString(Pd.f.qt_msg_customer_id_invalid, strB));
                                } else {
                                    String respMsg = rsp2.getRespMsg();
                                    ToastUtils.showLong(respMsg != null ? respMsg : "", new Object[0]);
                                }
                            }
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new h0(29), true, null, 224);
    }

    @Override // com.transsnet.palmpay.teller.ui.fragment.BaseBillerHistoryFragment, com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        Object obj = b.f36288a;
        HashMap mapE = G.e(new Pair(LogConstants.Autotrack.ELEMENT_TRANS_TYPE, b.b(v())));
        E e10 = this.f27319c;
        if (e10 == null) {
            return 0;
        }
        AutoTrackUtil.trackActivityProperties(e10, mapE);
        return 0;
    }

    @Override // com.transsnet.palmpay.teller.ui.fragment.BaseBillerHistoryFragment
    public final d u() {
        return (p) this.f34201w.getValue();
    }
}
