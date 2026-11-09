package Ed;

import Pa.r0;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.request.target.Target;
import com.google.android.flexbox.FlexboxLayout;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.QueryBankListRsp;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.VerifyPaymentInfoRsp;
import com.transsnet.palmpay.send_money.bean.resp.AddFavoriteRelationshipBean;
import com.transsnet.palmpay.send_money.bean.resp.LabelBean;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankAddBankAccountFragment;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class B implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToBankAddBankAccountFragment f2307b;

    public /* synthetic */ B(TransferToBankAddBankAccountFragment transferToBankAddBankAccountFragment, int i7) {
        this.f2306a = i7;
        this.f2307b = transferToBankAddBankAccountFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<BankInfo> list;
        TransferToBankAddBankAccountFragment transferToBankAddBankAccountFragment = this.f2307b;
        switch (this.f2306a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        if (commonBeanResult.isSuccess()) {
                            AddFavoriteRelationshipBean addFavoriteRelationshipBean = (AddFavoriteRelationshipBean) commonBeanResult.data;
                            List<LabelBean> labelDetails = addFavoriteRelationshipBean != null ? addFavoriteRelationshipBean.getLabelDetails() : null;
                            TransferToBankAddBankAccountFragment.a aVar = TransferToBankAddBankAccountFragment.f33758M;
                            if (labelDetails != null) {
                                for (LabelBean labelBean : labelDetails) {
                                    com.bumptech.glide.b.e(transferToBankAddBankAccountFragment.requireContext()).g().load((!transferToBankAddBankAccountFragment.m() || TextUtils.isEmpty(labelBean.getUnselectedDarkUrl())) ? labelBean.getUnselectedUrl() : labelBean.getUnselectedDarkUrl()).f0(Integer.MIN_VALUE, Integer.MIN_VALUE);
                                    com.bumptech.glide.b.e(transferToBankAddBankAccountFragment.requireContext()).g().load((!transferToBankAddBankAccountFragment.m() || TextUtils.isEmpty(labelBean.getSelectedDarkUrl())) ? labelBean.getSelectedUrl() : labelBean.getSelectedDarkUrl()).f0(Integer.MIN_VALUE, Integer.MIN_VALUE);
                                }
                            }
                            AddFavoriteRelationshipBean addFavoriteRelationshipBean2 = (AddFavoriteRelationshipBean) commonBeanResult.data;
                            if (addFavoriteRelationshipBean2 != null) {
                                p223od.k kVar = (p223od.k) transferToBankAddBankAccountFragment.f27335j;
                                if (kVar != null) {
                                    kVar.f40410e.setText(addFavoriteRelationshipBean2.getTagDesc());
                                }
                                List<LabelBean> labelDetails2 = addFavoriteRelationshipBean2.getLabelDetails();
                                if (labelDetails2 != null) {
                                    if (labelDetails2.isEmpty()) {
                                        labelDetails2 = null;
                                    }
                                    if (labelDetails2 != null) {
                                        transferToBankAddBankAccountFragment.f33764o = null;
                                        p223od.k kVar2 = (p223od.k) transferToBankAddBankAccountFragment.f27335j;
                                        if (kVar2 != null) {
                                            kVar2.f40407b.removeAllViews();
                                        }
                                        transferToBankAddBankAccountFragment.f33767w = addFavoriteRelationshipBean2.getLabelDetails();
                                        int size = labelDetails2.size();
                                        for (int i7 = 0; i7 < size; i7++) {
                                            LabelBean labelBean2 = labelDetails2.get(i7);
                                            if (Intrinsics.c(labelBean2.getDefaultSelectedLabel(), Boolean.TRUE)) {
                                                transferToBankAddBankAccountFragment.f33764o = labelBean2;
                                            }
                                            ImageView imageView = new ImageView(transferToBankAddBankAccountFragment.f27319c);
                                            imageView.setLayoutParams(new FlexboxLayout.LayoutParams(-2, CommonViewExtKt.getDp(28)));
                                            imageView.setOnClickListener(new A8.c(18, transferToBankAddBankAccountFragment, labelBean2));
                                            String unselectedDarkUrl = transferToBankAddBankAccountFragment.m() ? labelBean2.getUnselectedDarkUrl() : labelBean2.getUnselectedUrl();
                                            Target d2 = new D(imageView, 0);
                                            if (r0.n(imageView)) {
                                                com.bumptech.glide.m mVarLoad = com.bumptech.glide.b.f(imageView).b().load(new Rb.a(unselectedDarkUrl));
                                                mVarLoad.T(d2, null, mVarLoad, J1.g.f4461a);
                                            }
                                            p223od.k kVar3 = (p223od.k) transferToBankAddBankAccountFragment.f27335j;
                                            if (kVar3 != null) {
                                                kVar3.f40407b.addView(imageView);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            String respMsg = commonBeanResult.getRespMsg();
                            Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
                            TransferToBankAddBankAccountFragment.u(transferToBankAddBankAccountFragment, respMsg);
                        }
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        QueryBankListRsp queryBankListRsp = (QueryBankListRsp) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        TransferToBankAddBankAccountFragment.a aVar2 = TransferToBankAddBankAccountFragment.f33758M;
                        transferToBankAddBankAccountFragment.z();
                        if (queryBankListRsp.isSuccess() && (list = queryBankListRsp.data) != null && !list.isEmpty()) {
                            Bc.j jVar = transferToBankAddBankAccountFragment.f33763L;
                            if (jVar != null) {
                                p220oa.h.C((RecyclerView) jVar.f744p);
                            }
                            ((p173ld.w) transferToBankAddBankAccountFragment.f33760B.getValue()).setList(list);
                        }
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it2).getClass();
                        TransferToBankAddBankAccountFragment.a aVar3 = TransferToBankAddBankAccountFragment.f33758M;
                        transferToBankAddBankAccountFragment.z();
                    }
                }
                return Unit.f38893a;
            case 2:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                        VerifyPaymentInfoRsp verifyPaymentInfoRsp = (VerifyPaymentInfoRsp) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                        TransferToBankAddBankAccountFragment.a aVar4 = TransferToBankAddBankAccountFragment.f33758M;
                        transferToBankAddBankAccountFragment.B(verifyPaymentInfoRsp, false);
                    } else if (!(it3 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        String str = ((com.transsnet.palmpay.core.base.n) it3).f27358a;
                        TransferToBankAddBankAccountFragment.a aVar5 = TransferToBankAddBankAccountFragment.f33758M;
                        transferToBankAddBankAccountFragment.z();
                        Bc.j jVar2 = transferToBankAddBankAccountFragment.f33763L;
                        if (jVar2 != null) {
                            p220oa.h.C((LinearLayout) jVar2.f741i);
                        }
                        transferToBankAddBankAccountFragment.f33766v = null;
                        transferToBankAddBankAccountFragment.C(str, true);
                    }
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it4 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (!(it4 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it4 instanceof com.transsnet.palmpay.core.base.p) {
                        VerifyPaymentInfoRsp verifyPaymentInfoRsp2 = (VerifyPaymentInfoRsp) ((com.transsnet.palmpay.core.base.p) it4).f27360a;
                        TransferToBankAddBankAccountFragment.a aVar6 = TransferToBankAddBankAccountFragment.f33758M;
                        transferToBankAddBankAccountFragment.B(verifyPaymentInfoRsp2, true);
                    } else if (!(it4 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it4 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        String str2 = ((com.transsnet.palmpay.core.base.n) it4).f27358a;
                        TransferToBankAddBankAccountFragment.a aVar7 = TransferToBankAddBankAccountFragment.f33758M;
                        transferToBankAddBankAccountFragment.z();
                        Bc.j jVar3 = transferToBankAddBankAccountFragment.f33763L;
                        if (jVar3 != null) {
                            p220oa.h.C((LinearLayout) jVar3.f741i);
                        }
                        transferToBankAddBankAccountFragment.f33766v = null;
                        transferToBankAddBankAccountFragment.C(str2, true);
                    }
                }
                return Unit.f38893a;
        }
    }
}
