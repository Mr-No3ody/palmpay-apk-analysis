package Ed;

import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.send_money.bean.event.AddRecipientEvent;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountFavoriteFragment;
import com.transsnet.palmpay.send_money.viewmodel.TransferToBankHomeViewModel;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ed.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0231k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BankAccountFavoriteFragment f2379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BankAccountFavoriteFragment f2380c;

    public /* synthetic */ C0231k(BankAccountFavoriteFragment bankAccountFavoriteFragment, BankAccountFavoriteFragment bankAccountFavoriteFragment2, int i7) {
        this.f2378a = i7;
        this.f2379b = bankAccountFavoriteFragment;
        this.f2380c = bankAccountFavoriteFragment2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2378a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z3 = it instanceof com.transsnet.palmpay.core.base.o;
                BankAccountFavoriteFragment bankAccountFavoriteFragment = this.f2379b;
                if (z3) {
                    bankAccountFavoriteFragment.showLoadingDialog(true, true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    bankAccountFavoriteFragment.showLoadingDialog(false, true);
                    CommonResult commonResult = (CommonResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                    boolean zIsSuccess = commonResult.isSuccess();
                    BankAccountFavoriteFragment bankAccountFavoriteFragment2 = this.f2380c;
                    if (zIsSuccess) {
                        p220oa.h.y(bankAccountFavoriteFragment2, "Successfully delete beneficiary");
                        org.greenrobot.eventbus.c.b().f(new AddRecipientEvent(2));
                    } else {
                        p220oa.h.y(bankAccountFavoriteFragment2, commonResult.getRespMsg());
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    bankAccountFavoriteFragment.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    bankAccountFavoriteFragment.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                    ((com.transsnet.palmpay.core.base.n) it).getClass();
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z8 = it2 instanceof com.transsnet.palmpay.core.base.o;
                BankAccountFavoriteFragment bankAccountFavoriteFragment3 = this.f2379b;
                if (z8) {
                    bankAccountFavoriteFragment3.showLoadingDialog(true, true);
                } else if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                    bankAccountFavoriteFragment3.showLoadingDialog(false, true);
                    CommonResult commonResult2 = (CommonResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                    boolean zIsSuccess2 = commonResult2.isSuccess();
                    BankAccountFavoriteFragment bankAccountFavoriteFragment4 = this.f2380c;
                    if (zIsSuccess2) {
                        TransferToBankHomeViewModel transferToBankHomeViewModel = (TransferToBankHomeViewModel) bankAccountFavoriteFragment4.f27333i;
                        if (transferToBankHomeViewModel != null) {
                            transferToBankHomeViewModel.h();
                        }
                    } else {
                        p220oa.h.y(bankAccountFavoriteFragment4, commonResult2.getRespMsg());
                    }
                } else if (it2 instanceof com.transsnet.palmpay.core.base.m) {
                    bankAccountFavoriteFragment3.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    bankAccountFavoriteFragment3.showLoadingDialog(false, true);
                    ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}
