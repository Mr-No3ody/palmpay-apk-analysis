package Ed;

import N8.q0;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.send_money.bean.AddRecipientResp;
import com.transsnet.palmpay.send_money.bean.resp.LabelBean;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankAddBankAccountFragment;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class C implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToBankAddBankAccountFragment f2309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransferToBankAddBankAccountFragment f2310c;

    public /* synthetic */ C(TransferToBankAddBankAccountFragment transferToBankAddBankAccountFragment, TransferToBankAddBankAccountFragment transferToBankAddBankAccountFragment2, int i7) {
        this.f2308a = i7;
        this.f2309b = transferToBankAddBankAccountFragment;
        this.f2310c = transferToBankAddBankAccountFragment2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Collection collection;
        TransferToBankAddBankAccountFragment transferToBankAddBankAccountFragment = this.f2310c;
        TransferToBankAddBankAccountFragment transferToBankAddBankAccountFragment2 = this.f2309b;
        switch (this.f2308a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof com.transsnet.palmpay.core.base.o) {
                    transferToBankAddBankAccountFragment2.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    transferToBankAddBankAccountFragment2.showLoadingDialog(false, true);
                    AddRecipientResp addRecipientResp = (AddRecipientResp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                    if (addRecipientResp.isSuccess()) {
                        LabelBean labelBean = transferToBankAddBankAccountFragment.f33764o;
                        ToastUtils.showLong(q0.k("Successfully add Favorites as '", labelBean != null ? labelBean.getLabel() : null, "'"), new Object[0]);
                        transferToBankAddBankAccountFragment.requireActivity().finish();
                    } else {
                        String respMsg = addRecipientResp.getRespMsg();
                        Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
                        TransferToBankAddBankAccountFragment.u(transferToBankAddBankAccountFragment, respMsg);
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    transferToBankAddBankAccountFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    transferToBankAddBankAccountFragment2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                    ((com.transsnet.palmpay.core.base.n) it).getClass();
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof com.transsnet.palmpay.core.base.o) {
                    transferToBankAddBankAccountFragment2.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    transferToBankAddBankAccountFragment2.showLoadingDialog(false, true);
                    CommonListResultV2 commonListResultV2 = (CommonListResultV2) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                    if (commonListResultV2.isSuccess() && (collection = commonListResultV2.data) != null) {
                        TransferToBankAddBankAccountFragment.a aVar = TransferToBankAddBankAccountFragment.f33758M;
                        p355xf.t tVar = transferToBankAddBankAccountFragment.f33761C;
                        ((ArrayList) tVar.getValue()).clear();
                        ((ArrayList) tVar.getValue()).addAll(collection);
                    }
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    transferToBankAddBankAccountFragment2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    transferToBankAddBankAccountFragment2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}
