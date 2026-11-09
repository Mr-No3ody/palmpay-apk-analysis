package Fd;

import N8.q0;
import Pa.r0;
import android.widget.ImageView;
import com.bumptech.glide.request.target.Target;
import com.google.android.flexbox.FlexboxLayout;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.AddRecipientResp;
import com.transsnet.palmpay.send_money.bean.resp.AddFavoriteRelationshipBean;
import com.transsnet.palmpay.send_money.bean.resp.LabelBean;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayAddMobileAccountFragment;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Fd.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0247b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayAddMobileAccountFragment f2663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayAddMobileAccountFragment f2664c;

    public /* synthetic */ C0247b(TransferToPalmPayAddMobileAccountFragment transferToPalmPayAddMobileAccountFragment, TransferToPalmPayAddMobileAccountFragment transferToPalmPayAddMobileAccountFragment2, int i7) {
        this.f2662a = i7;
        this.f2663b = transferToPalmPayAddMobileAccountFragment;
        this.f2664c = transferToPalmPayAddMobileAccountFragment2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TransferToPalmPayAddMobileAccountFragment transferToPalmPayAddMobileAccountFragment = this.f2664c;
        TransferToPalmPayAddMobileAccountFragment transferToPalmPayAddMobileAccountFragment2 = this.f2663b;
        switch (this.f2662a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof com.transsnet.palmpay.core.base.o) {
                    transferToPalmPayAddMobileAccountFragment2.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    transferToPalmPayAddMobileAccountFragment2.showLoadingDialog(false, true);
                    AddRecipientResp addRecipientResp = (AddRecipientResp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                    if (addRecipientResp.isSuccess()) {
                        LabelBean labelBean = transferToPalmPayAddMobileAccountFragment.f33792o;
                        ToastUtils.showLong(q0.k("Successfully add Favorites as '", labelBean != null ? labelBean.getLabel() : null, "'"), new Object[0]);
                        transferToPalmPayAddMobileAccountFragment.requireActivity().finish();
                    } else {
                        String respMsg = addRecipientResp.getRespMsg();
                        Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
                        TransferToPalmPayAddMobileAccountFragment.a aVar = TransferToPalmPayAddMobileAccountFragment.f33787L;
                        O6.c cVar = new O6.c(transferToPalmPayAddMobileAccountFragment.requireContext());
                        cVar.e(p025ba.k.core_title_attention);
                        cVar.f6605k = true;
                        cVar.f6598d = respMsg;
                        cVar.d(p025ba.k.core_payment_confirm, null);
                        O6.d dVarA = cVar.a();
                        if (!transferToPalmPayAddMobileAccountFragment.requireActivity().isFinishing() && !transferToPalmPayAddMobileAccountFragment.requireActivity().isDestroyed()) {
                            dVarA.setCanceledOnTouchOutside(false);
                            dVarA.setCancelable(false);
                            dVarA.show();
                        }
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    transferToPalmPayAddMobileAccountFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    transferToPalmPayAddMobileAccountFragment2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                    ((com.transsnet.palmpay.core.base.n) it).getClass();
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof com.transsnet.palmpay.core.base.o) {
                    transferToPalmPayAddMobileAccountFragment2.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    transferToPalmPayAddMobileAccountFragment2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                    if (commonBeanResult.isSuccess()) {
                        AddFavoriteRelationshipBean addFavoriteRelationshipBean = (AddFavoriteRelationshipBean) commonBeanResult.data;
                        TransferToPalmPayAddMobileAccountFragment.a aVar2 = TransferToPalmPayAddMobileAccountFragment.f33787L;
                        if (addFavoriteRelationshipBean != null) {
                            p223od.m mVar = (p223od.m) transferToPalmPayAddMobileAccountFragment.f27335j;
                            if (mVar != null) {
                                mVar.f40427e.setText(addFavoriteRelationshipBean.getTagDesc());
                            }
                            List<LabelBean> labelDetails = addFavoriteRelationshipBean.getLabelDetails();
                            if (labelDetails != null) {
                                if (labelDetails.isEmpty()) {
                                    labelDetails = null;
                                }
                                if (labelDetails != null) {
                                    p223od.m mVar2 = (p223od.m) transferToPalmPayAddMobileAccountFragment.f27335j;
                                    if (mVar2 != null) {
                                        mVar2.f40424b.removeAllViews();
                                    }
                                    transferToPalmPayAddMobileAccountFragment.f33795w = addFavoriteRelationshipBean.getLabelDetails();
                                    int size = labelDetails.size();
                                    for (int i7 = 0; i7 < size; i7++) {
                                        LabelBean labelBean2 = labelDetails.get(i7);
                                        if (Intrinsics.c(labelBean2.getDefaultSelectedLabel(), Boolean.TRUE)) {
                                            transferToPalmPayAddMobileAccountFragment.f33792o = labelBean2;
                                        }
                                        ImageView imageView = new ImageView(transferToPalmPayAddMobileAccountFragment.f27319c);
                                        imageView.setLayoutParams(new FlexboxLayout.LayoutParams(-2, CommonViewExtKt.getDp(28)));
                                        imageView.setOnClickListener(new A8.c(20, transferToPalmPayAddMobileAccountFragment, labelBean2));
                                        String unselectedDarkUrl = transferToPalmPayAddMobileAccountFragment.m() ? labelBean2.getUnselectedDarkUrl() : labelBean2.getUnselectedUrl();
                                        Target d2 = new Ed.D(imageView, 1);
                                        if (r0.n(imageView)) {
                                            com.bumptech.glide.m mVarLoad = com.bumptech.glide.b.f(imageView).b().load(new Rb.a(unselectedDarkUrl));
                                            mVarLoad.T(d2, null, mVarLoad, J1.g.f4461a);
                                        }
                                        p223od.m mVar3 = (p223od.m) transferToPalmPayAddMobileAccountFragment.f27335j;
                                        if (mVar3 != null) {
                                            mVar3.f40424b.addView(imageView);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        p220oa.h.y(transferToPalmPayAddMobileAccountFragment, commonBeanResult.getRespMsg());
                    }
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    transferToPalmPayAddMobileAccountFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    transferToPalmPayAddMobileAccountFragment2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}
