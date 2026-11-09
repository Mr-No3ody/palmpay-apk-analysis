package D9;

import Pa.AbstractC0511h;
import Pa.C0510g;
import Pa.n0;
import Pa.r0;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.transsnet.palmpay.cash_in.bean.response.CashInGuidanceConfigBean;
import com.transsnet.palmpay.cash_in.bean.response.FundMethodListResp;
import com.transsnet.palmpay.cash_in.bean.response.FundViewBean;
import com.transsnet.palmpay.cash_in.bean.response.QueryFundActivityIconRsp;
import com.transsnet.palmpay.cash_in.ui.activity.instruction.AddMoneyHomeActivity;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.rsp.CashBoxTrialCashEntryResp;
import com.transsnet.palmpay.core.ui.widget.CashBoxTrialCashEntryLayout;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.main.export.bean.rsp.MeTabTotalAssetInfo;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p355xf.l;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddMoneyHomeActivity f1719b;

    public /* synthetic */ d(AddMoneyHomeActivity addMoneyHomeActivity, int i7) {
        this.f1718a = i7;
        this.f1719b = addMoneyHomeActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<String> list;
        c cVar;
        MeTabTotalAssetInfo meTabTotalAssetInfo;
        c cVar2;
        CashBoxTrialCashEntryResp cashBoxTrialCashEntryResp;
        ViewStub viewStub;
        T t;
        Bc.f fVar;
        AddMoneyHomeActivity addMoneyHomeActivity = this.f1719b;
        int i7 = 0;
        switch (this.f1718a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof o)) {
                    if (it instanceof p) {
                        QueryFundActivityIconRsp queryFundActivityIconRsp = (QueryFundActivityIconRsp) ((p) it).f27360a;
                        if (queryFundActivityIconRsp.isSuccess() && (list = queryFundActivityIconRsp.data) != null && (cVar = addMoneyHomeActivity.f26974c) != null) {
                            String str = list.size() > 2 ? list.get(2) : null;
                            boolean zIsEmpty = TextUtils.isEmpty(str);
                            ImageView imageView = cVar.f1707c;
                            if (zIsEmpty) {
                                imageView.setVisibility(8);
                            } else {
                                imageView.setVisibility(0);
                            }
                            r0.l1(str, imageView);
                        }
                    } else if (!(it instanceof m)) {
                        if (!(it instanceof n)) {
                            throw new l();
                        }
                        n nVar = (n) it;
                        ToastUtils.showLong(nVar.f27358a, new Object[0]);
                        nVar.getClass();
                    }
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof o)) {
                    if (it2 instanceof p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it2).f27360a;
                        if (commonBeanResult.isSuccess()) {
                            FundMethodListResp fundMethodListResp = (FundMethodListResp) commonBeanResult.data;
                            if (fundMethodListResp != null) {
                                int i10 = AddMoneyHomeActivity.f26973o;
                                b bVar = (b) addMoneyHomeActivity.f26975d.getValue();
                                ArrayList arrayList = new ArrayList();
                                ArrayList<FundViewBean> arrayList2 = fundMethodListResp.cashBoxMethods;
                                arrayList.addAll(arrayList2 != null ? CollectionsKt.Z(arrayList2) : z.f38935a);
                                ArrayList<FundViewBean> arrayList3 = fundMethodListResp.bankMethods;
                                arrayList.addAll(arrayList3 != null ? CollectionsKt.Z(arrayList3) : z.f38935a);
                                ArrayList<FundViewBean> arrayList4 = fundMethodListResp.ppMethods;
                                arrayList.addAll(arrayList4 != null ? CollectionsKt.Z(arrayList4) : z.f38935a);
                                bVar.setList(arrayList);
                                AddMoneyHomeActivity.m(addMoneyHomeActivity, fundMethodListResp.rewardDTO);
                            } else {
                                AddMoneyHomeActivity.m(addMoneyHomeActivity, null);
                                Unit unit = Unit.f38893a;
                            }
                        }
                    } else if (!(it2 instanceof m)) {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            case 2:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof o)) {
                    if (it3 instanceof p) {
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((p) it3).f27360a;
                        if (commonBeanResult2.isSuccess() && (meTabTotalAssetInfo = (MeTabTotalAssetInfo) commonBeanResult2.data) != null && (cVar2 = addMoneyHomeActivity.f26974c) != null) {
                            cVar2.f1712h.setOnClickListener(new A8.c(13, meTabTotalAssetInfo, cVar2.f1717m));
                        }
                    } else if (!(it3 instanceof m)) {
                        if (!(it3 instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it3).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            case 3:
                q it4 = (q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (!(it4 instanceof o)) {
                    if (it4 instanceof p) {
                        CommonBeanResult commonBeanResult3 = (CommonBeanResult) ((p) it4).f27360a;
                        if (commonBeanResult3.isSuccess() && (cashBoxTrialCashEntryResp = (CashBoxTrialCashEntryResp) commonBeanResult3.data) != null) {
                            if (addMoneyHomeActivity.f26977f == null) {
                                Bc.f fVar2 = addMoneyHomeActivity.f26980j;
                                View viewInflate = (fVar2 == null || (viewStub = (ViewStub) fVar2.f696b) == null) ? null : viewStub.inflate();
                                addMoneyHomeActivity.f26977f = viewInflate != null ? (CashBoxTrialCashEntryLayout) viewInflate.findViewById(p366y9.b.layout_cashbox_trial_cash) : null;
                            }
                            Integer num = cashBoxTrialCashEntryResp.showType;
                            if ((num != null ? num.intValue() : 0) > 0) {
                                CashBoxTrialCashEntryLayout cashBoxTrialCashEntryLayout = addMoneyHomeActivity.f26977f;
                                if (cashBoxTrialCashEntryLayout != null) {
                                    cashBoxTrialCashEntryLayout.c(cashBoxTrialCashEntryResp, "Fund", addMoneyHomeActivity.isDarkMode());
                                }
                                CashBoxTrialCashEntryLayout cashBoxTrialCashEntryLayout2 = addMoneyHomeActivity.f26977f;
                                if (cashBoxTrialCashEntryLayout2 != null) {
                                    p220oa.h.C(cashBoxTrialCashEntryLayout2);
                                }
                            } else {
                                CashBoxTrialCashEntryLayout cashBoxTrialCashEntryLayout3 = addMoneyHomeActivity.f26977f;
                                if (cashBoxTrialCashEntryLayout3 != null) {
                                    p220oa.h.c(cashBoxTrialCashEntryLayout3);
                                }
                            }
                        }
                    } else if (!(it4 instanceof m)) {
                        if (!(it4 instanceof n)) {
                            throw new l();
                        }
                        n nVar2 = (n) it4;
                        ToastUtils.showLong(nVar2.f27358a, new Object[0]);
                        nVar2.getClass();
                    }
                }
                return Unit.f38893a;
            default:
                q it5 = (q) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                if (!(it5 instanceof o)) {
                    if (it5 instanceof p) {
                        CommonBeanResult commonBeanResult4 = (CommonBeanResult) ((p) it5).f27360a;
                        if (!commonBeanResult4.isSuccess() || (t = commonBeanResult4.data) == 0 || TextUtils.isEmpty(((CashInGuidanceConfigBean) t).text)) {
                            Bc.f fVar3 = addMoneyHomeActivity.f26980j;
                            if (fVar3 != null) {
                                ((LinearLayout) ((Bc.f) fVar3.f699e).f697c).setVisibility(8);
                            }
                        } else {
                            CashInGuidanceConfigBean cashInGuidanceConfigBean = (CashInGuidanceConfigBean) commonBeanResult4.data;
                            String str2 = (String) addMoneyHomeActivity.f26976e.getValue();
                            if (str2 != null) {
                                n0.g().u(new ViewEvent("AddMoney_Tips_View").add("element_name", str2));
                            }
                            if (cashInGuidanceConfigBean != null) {
                                CashInGuidanceConfigBean cashInGuidanceConfigBean2 = TextUtils.isEmpty(cashInGuidanceConfigBean.text) ? null : cashInGuidanceConfigBean;
                                if (cashInGuidanceConfigBean2 != null && (fVar = addMoneyHomeActivity.f26980j) != null) {
                                    Bc.f fVar4 = (Bc.f) fVar.f699e;
                                    LinearLayout linearLayout = (LinearLayout) fVar4.f697c;
                                    linearLayout.setVisibility(0);
                                    r0.k1((AppCompatImageView) fVar4.f699e, cashInGuidanceConfigBean2.icon, cashInGuidanceConfigBean2.darkIcon);
                                    String str3 = cashInGuidanceConfigBean2.text;
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    C0510g c0510g = AbstractC0511h.f7089a;
                                    TextView tvContent = (TextView) fVar4.f701g;
                                    Intrinsics.checkNotNullExpressionValue(tvContent, "tvContent");
                                    c0510g.highlightText(tvContent, str3, cashInGuidanceConfigBean2.specialText, addMoneyHomeActivity.getResources().getColor(L6.b.ppColorSuccess));
                                    linearLayout.setOnClickListener(new a(addMoneyHomeActivity, i7));
                                }
                            }
                        }
                    } else if (!(it5 instanceof m)) {
                        if (!(it5 instanceof n)) {
                            throw new l();
                        }
                        ToastUtils.showLong(((n) it5).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
        }
    }
}
