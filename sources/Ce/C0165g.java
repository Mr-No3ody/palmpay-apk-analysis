package Ce;

import Pa.C0525w;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.LinkBankCardResp;
import com.transsnet.palmpay.core.bean.payment.PayByOrderReq;
import com.transsnet.palmpay.core.bean.rsp.ViewBankCardResp;
import com.transsnet.palmpay.ui.fragment.BankCardFragment;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ce.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0165g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BankCardFragment f1484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BankCardFragment f1485c;

    public /* synthetic */ C0165g(BankCardFragment bankCardFragment, BankCardFragment bankCardFragment2, int i7) {
        this.f1483a = i7;
        this.f1484b = bankCardFragment;
        this.f1485c = bankCardFragment2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        BankCardFragment bankCardFragment = this.f1485c;
        BankCardFragment bankCardFragment2 = this.f1484b;
        switch (this.f1483a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof com.transsnet.palmpay.core.base.o) {
                    bankCardFragment2.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    bankCardFragment2.showLoadingDialog(false, true);
                    LinkBankCardResp linkBankCardResp = (LinkBankCardResp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                    int i7 = BankCardFragment.f35064B;
                    RecyclerView recyclerView = (RecyclerView) bankCardFragment.t.getValue();
                    if (recyclerView != null) {
                        p220oa.h.C(recyclerView);
                    }
                    if (!linkBankCardResp.isSuccess()) {
                        bankCardFragment.u().setList(null);
                    } else if (linkBankCardResp.getData() != null) {
                        bankCardFragment.u().setList(linkBankCardResp.getData());
                        BankCardFragment.t(bankCardFragment, linkBankCardResp.getData().size() <= 0);
                        List<LinkBankCardResp.LinkBankCard> data = linkBankCardResp.getData();
                        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                        try {
                            String string = SPUtils.getInstance("draft_record").getString("_key_bank_draft");
                            if (string != null && string.length() != 0) {
                                C0525w.f().getClass();
                                PayByOrderReq payByOrderReq = (PayByOrderReq) C0525w.d(string, PayByOrderReq.class);
                                if (payByOrderReq != null && (str = payByOrderReq.payerCardNo) != null && str.length() > 0) {
                                    Iterator<LinkBankCardResp.LinkBankCard> it2 = data.iterator();
                                    while (it2.hasNext()) {
                                        if (Intrinsics.c(it2.next().getCardNo(), kotlin.text.y.k(str, " ", ""))) {
                                            SPUtils.getInstance("draft_record").remove("_key_bank_draft");
                                            break;
                                        }
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    } else {
                        bankCardFragment.u().setList(null);
                        BankCardFragment.t(bankCardFragment, true);
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    bankCardFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    bankCardFragment2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3 instanceof com.transsnet.palmpay.core.base.o) {
                    bankCardFragment2.showLoadingDialog(true, true);
                } else if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                    bankCardFragment2.showLoadingDialog(false, true);
                    CommonResult commonResult = (CommonResult) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                    if (commonResult.isSuccess()) {
                        ToastUtils.showLong(bankCardFragment.getString(Ac.h.main_bank_card_set_as_default_success_text), new Object[0]);
                        bankCardFragment.v();
                    } else {
                        p220oa.h.y(bankCardFragment, commonResult.getRespMsg());
                    }
                } else if (it3 instanceof com.transsnet.palmpay.core.base.m) {
                    bankCardFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    bankCardFragment2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it3).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it4 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (it4 instanceof com.transsnet.palmpay.core.base.o) {
                    bankCardFragment2.showLoadingDialog(true, true);
                } else if (it4 instanceof com.transsnet.palmpay.core.base.p) {
                    bankCardFragment2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it4).f27360a;
                    if (commonBeanResult.isSuccess()) {
                        ViewBankCardResp viewBankCardResp = (ViewBankCardResp) commonBeanResult.data;
                        if (viewBankCardResp != null) {
                            if (Intrinsics.c(viewBankCardResp.getRiskResult(), Boolean.TRUE)) {
                                ARouter aRouter = ARouter.getInstance();
                                Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
                                Postcard postcardBuild = ARouter.getInstance().build("/account/authentication");
                                Intrinsics.checkNotNullExpressionValue(postcardBuild, "build(...)");
                                Pa.r0.x(aRouter, bankCardFragment, postcardBuild, 1);
                            } else {
                                ToastUtils.showLong(viewBankCardResp.getToast(), new Object[0]);
                            }
                        }
                    } else {
                        p220oa.h.y(bankCardFragment, commonBeanResult.getRespMsg());
                    }
                } else if (it4 instanceof com.transsnet.palmpay.core.base.m) {
                    bankCardFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it4 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    bankCardFragment2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it4).f27358a, new Object[0]);
                    ((com.transsnet.palmpay.core.base.n) it4).getClass();
                }
                return Unit.f38893a;
        }
    }
}
