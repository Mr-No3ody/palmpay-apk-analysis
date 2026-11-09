package p382zb;

import F6.d;
import Ya.e;
import Ya.g;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.credit.bean.LoanHomeDataInfoV2;
import com.transsnet.palmpay.credit.bean.rsp.LoanHomeRepaymentAccount;
import com.transsnet.palmpay.credit.bean.rsp.LoanHomeRepaymentCardListData;
import com.transsnet.palmpay.credit.bean.rsp.LoanHomeRepaymentCardListResp;
import com.transsnet.palmpay.credit.bean.rsp.QueryDataInfoResp;
import com.transsnet.palmpay.credit.ui.fragment.LoanCreditFaceRecFragment;
import com.transsnet.palmpay.credit.ui.fragment.LoanHomeFragment;
import com.transsnet.palmpay.credit.ui.fragment.LoanRepaymentListFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcHomeFinanceFragment;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p099gb.j;
import p220oa.h;
import p339wb.i;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseMvvmFragment f44614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseMvvmFragment f44615c;

    public /* synthetic */ r(BaseMvvmFragment baseMvvmFragment, BaseMvvmFragment baseMvvmFragment2, int i7) {
        this.f44613a = i7;
        this.f44614b = baseMvvmFragment;
        this.f44615c = baseMvvmFragment2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BaseMvvmFragment baseMvvmFragment = this.f44615c;
        boolean z3 = true;
        BaseMvvmFragment baseMvvmFragment2 = this.f44614b;
        switch (this.f44613a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                LoanCreditFaceRecFragment loanCreditFaceRecFragment = (LoanCreditFaceRecFragment) baseMvvmFragment2;
                if (it instanceof o) {
                    loanCreditFaceRecFragment.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    loanCreditFaceRecFragment.showLoadingDialog(false, true);
                    if (((CommonResult) ((p) it).f27360a).isSuccess()) {
                        d.h("LoanCreditFaceRecManager", 3, "faceRecSuccess >>>");
                    } else {
                        d.c("LoanCreditFaceRecManager", "faceRecFailed >>>");
                    }
                } else if (it instanceof m) {
                    loanCreditFaceRecFragment.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof n)) {
                        throw new l();
                    }
                    loanCreditFaceRecFragment.showLoadingDialog(false, true);
                    h.y((LoanCreditFaceRecFragment) baseMvvmFragment, ((n) it).f27358a);
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                LoanHomeFragment loanHomeFragment = (LoanHomeFragment) baseMvvmFragment2;
                if (it2 instanceof o) {
                    loanHomeFragment.showLoadingDialog(true, true);
                } else {
                    LoanHomeFragment loanHomeFragment2 = (LoanHomeFragment) baseMvvmFragment;
                    if (it2 instanceof p) {
                        loanHomeFragment.showLoadingDialog(false, true);
                        LoanHomeDataInfoV2 loanHomeDataInfoV2 = (LoanHomeDataInfoV2) ((CommonBeanResult) ((p) it2).f27360a).data;
                        LoanHomeFragment.a aVar = LoanHomeFragment.f30338Z;
                        loanHomeFragment2.t(loanHomeDataInfoV2);
                    } else if (it2 instanceof m) {
                        loanHomeFragment.showLoadingDialog(false, true);
                    } else {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        loanHomeFragment.showLoadingDialog(false, true);
                        ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                        LoanHomeDataInfoV2 loanHomeDataInfoV3 = loanHomeFragment2.f30340B;
                        if (loanHomeDataInfoV3 != null) {
                            loanHomeFragment2.u(loanHomeDataInfoV3);
                        } else {
                            loanHomeFragment2.t(null);
                        }
                    }
                }
                return Unit.f38893a;
            case 2:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                LoanRepaymentListFragment loanRepaymentListFragment = (LoanRepaymentListFragment) baseMvvmFragment2;
                if (it3 instanceof o) {
                    loanRepaymentListFragment.showLoadingDialog(true, true);
                } else {
                    LoanRepaymentListFragment loanRepaymentListFragment2 = (LoanRepaymentListFragment) baseMvvmFragment;
                    if (it3 instanceof p) {
                        loanRepaymentListFragment.showLoadingDialog(false, true);
                        LoanHomeRepaymentCardListResp loanHomeRepaymentCardListResp = (LoanHomeRepaymentCardListResp) ((p) it3).f27360a;
                        LoanRepaymentListFragment.a aVar2 = LoanRepaymentListFragment.f30356w;
                        loanRepaymentListFragment2.x();
                        if (loanHomeRepaymentCardListResp.isSuccess()) {
                            View view = loanRepaymentListFragment2.t;
                            if (view != null) {
                                view.setVisibility(8);
                            }
                            ArrayList arrayList = loanRepaymentListFragment2.f30357o;
                            arrayList.clear();
                            LoanHomeRepaymentCardListData data = loanHomeRepaymentCardListResp.getData();
                            List<LoanHomeRepaymentAccount> repaymentList = data != null ? data.getRepaymentList() : null;
                            List<LoanHomeRepaymentAccount> list = repaymentList;
                            if (list != null && !list.isEmpty()) {
                                z3 = false;
                            }
                            if (z3) {
                                j jVar = (j) loanRepaymentListFragment2.f27335j;
                                if (jVar != null) {
                                    jVar.f37172d.setVisibility(8);
                                }
                                j jVar2 = (j) loanRepaymentListFragment2.f27335j;
                                if (jVar2 != null) {
                                    View view2 = jVar2.f37171c;
                                    view2.setBackgroundResource(com.transsnet.palmpay.custom_view.r.cv_shape_rect_corner_12_bg_white);
                                    h.j(view2, Integer.valueOf(CommonViewExtKt.getDp(16.0f)), Integer.valueOf(CommonViewExtKt.getDp(16.0f)), Integer.valueOf(CommonViewExtKt.getDp(16.0f)), Integer.valueOf(CommonViewExtKt.getDp(96.0f)));
                                    view2.setVisibility(0);
                                    TextView textView = (TextView) view2.findViewById(e.tvTips);
                                    if (textView != null) {
                                        textView.setText(g.cs_loan_home_repayment_empty);
                                    }
                                    ImageView imageView = (ImageView) view2.findViewById(e.ivIcon);
                                    if (imageView != null) {
                                        imageView.setImageResource(com.transsnet.palmpay.custom_view.r.cv_empty_no_transaction_history);
                                    }
                                }
                            } else {
                                Intrinsics.e(repaymentList);
                                arrayList.addAll(repaymentList);
                                j jVar3 = (j) loanRepaymentListFragment2.f27335j;
                                if (jVar3 != null) {
                                    jVar3.f37172d.setVisibility(0);
                                }
                                j jVar4 = (j) loanRepaymentListFragment2.f27335j;
                                if (jVar4 != null) {
                                    jVar4.f37171c.setVisibility(8);
                                }
                            }
                            i iVar = loanRepaymentListFragment2.f30358p;
                            if (iVar != null) {
                                iVar.setList(CollectionsKt.Z(arrayList));
                            }
                            loanRepaymentListFragment2.u(z3);
                        } else {
                            ToastUtils.showShort(loanHomeRepaymentCardListResp.getRespMsg(), new Object[0]);
                            loanRepaymentListFragment2.w();
                            loanRepaymentListFragment2.u(false);
                        }
                    } else if (it3 instanceof m) {
                        loanRepaymentListFragment.showLoadingDialog(false, true);
                    } else {
                        if (!(it3 instanceof n)) {
                            throw new l();
                        }
                        loanRepaymentListFragment.showLoadingDialog(false, true);
                        String str = ((n) it3).f27358a;
                        LoanRepaymentListFragment.a aVar3 = LoanRepaymentListFragment.f30356w;
                        loanRepaymentListFragment2.x();
                        ToastUtils.showShort(str, new Object[0]);
                        loanRepaymentListFragment2.w();
                        loanRepaymentListFragment2.u(false);
                    }
                }
                return Unit.f38893a;
            default:
                q it4 = (q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                OcHomeFinanceFragment ocHomeFinanceFragment = (OcHomeFinanceFragment) baseMvvmFragment2;
                if (it4 instanceof o) {
                    ocHomeFinanceFragment.showLoadingDialog(true, true);
                } else {
                    OcHomeFinanceFragment ocHomeFinanceFragment2 = (OcHomeFinanceFragment) baseMvvmFragment;
                    if (it4 instanceof p) {
                        ocHomeFinanceFragment.showLoadingDialog(false, true);
                        ocHomeFinanceFragment2.u(((QueryDataInfoResp) ((p) it4).f27360a).getData());
                    } else if (it4 instanceof m) {
                        ocHomeFinanceFragment.showLoadingDialog(false, true);
                    } else {
                        if (!(it4 instanceof n)) {
                            throw new l();
                        }
                        ocHomeFinanceFragment.showLoadingDialog(false, true);
                        ToastUtils.showLong(((n) it4).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
        }
    }
}
