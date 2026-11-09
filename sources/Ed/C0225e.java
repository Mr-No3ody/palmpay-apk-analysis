package Ed;

import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.send_money.bean.event.AddRecipientEvent;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountBeneficiaryFragment;
import com.transsnet.palmpay.send_money.viewmodel.TransferToBankHomeViewModel;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ed.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0225e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BankAccountBeneficiaryFragment f2366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BankAccountBeneficiaryFragment f2367c;

    public /* synthetic */ C0225e(BankAccountBeneficiaryFragment bankAccountBeneficiaryFragment, BankAccountBeneficiaryFragment bankAccountBeneficiaryFragment2, int i7) {
        this.f2365a = i7;
        this.f2366b = bankAccountBeneficiaryFragment;
        this.f2367c = bankAccountBeneficiaryFragment2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2365a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
                BankAccountBeneficiaryFragment bankAccountBeneficiaryFragment = this.f2366b;
                if (z3) {
                    bankAccountBeneficiaryFragment.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    bankAccountBeneficiaryFragment.showLoadingDialog(false, true);
                    CommonResult commonResult = (CommonResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                    boolean zIsSuccess = commonResult.isSuccess();
                    BankAccountBeneficiaryFragment bankAccountBeneficiaryFragment2 = this.f2367c;
                    if (zIsSuccess) {
                        p220oa.h.y(bankAccountBeneficiaryFragment2, "Successfully delete beneficiary");
                        org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(2));
                    } else {
                        p220oa.h.y(bankAccountBeneficiaryFragment2, commonResult.getRespMsg());
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    bankAccountBeneficiaryFragment.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    bankAccountBeneficiaryFragment.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                    ((com.transsnet.palmpay.core.base.n) it).getClass();
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z8 = it2 instanceof com.transsnet.palmpay.core.base.o;
                BankAccountBeneficiaryFragment bankAccountBeneficiaryFragment3 = this.f2366b;
                if (z8) {
                    bankAccountBeneficiaryFragment3.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    bankAccountBeneficiaryFragment3.showLoadingDialog(false, true);
                    CommonResult commonResult2 = (CommonResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                    boolean zIsSuccess2 = commonResult2.isSuccess();
                    BankAccountBeneficiaryFragment bankAccountBeneficiaryFragment4 = this.f2367c;
                    if (zIsSuccess2) {
                        TransferToBankHomeViewModel transferToBankHomeViewModel = (TransferToBankHomeViewModel) bankAccountBeneficiaryFragment4.f27333i;
                        if (transferToBankHomeViewModel != null) {
                            transferToBankHomeViewModel.g();
                        }
                    } else {
                        p220oa.h.y(bankAccountBeneficiaryFragment4, commonResult2.getRespMsg());
                    }
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    bankAccountBeneficiaryFragment3.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    bankAccountBeneficiaryFragment3.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}
