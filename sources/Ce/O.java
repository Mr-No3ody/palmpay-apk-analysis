package Ce;

import android.content.res.ColorStateList;
import com.mikepenz.iconics.IconicsDrawable;
import com.transsnet.palmpay.credit.view.PhoneInstallmentDailyLoanView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankAddBankAccountFragment;
import com.transsnet.palmpay.send_money.ui.view.SearchRecipientAccountToBankView;
import com.transsnet.palmpay.ui.fragment.HomePalmZoneTabV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class O implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1441b;

    public /* synthetic */ O(int i7, int i10) {
        this.f1440a = i10;
        this.f1441b = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i7 = this.f1441b;
        IconicsDrawable apply = (IconicsDrawable) obj;
        switch (this.f1440a) {
            case 0:
                int i10 = HomePalmZoneTabV2.f35134Z;
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                apply.i(S6.a.pay_Menu);
                p118hf.a.I(apply, 24);
                D3.a.E(apply, H5.e.f3702a.colorInt(i7));
                apply.f23602z = CommonViewExtKt.getDp(-6);
                apply.d();
                break;
            case 1:
                TransferToBankAddBankAccountFragment.a aVar = TransferToBankAddBankAccountFragment.f33758M;
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                p118hf.a.I(apply, 16);
                D3.a.F(apply, i7);
                break;
            case 2:
                TransferToBankAddBankAccountFragment.a aVar2 = TransferToBankAddBankAccountFragment.f33758M;
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                p118hf.a.I(apply, 16);
                D3.a.F(apply, i7);
                break;
            case 3:
                PhoneInstallmentDailyLoanView.a aVar3 = PhoneInstallmentDailyLoanView.f30860i;
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                p118hf.a.I(apply, 16);
                D3.a.F(apply, i7);
                break;
            case 4:
                PhoneInstallmentDailyLoanView.a aVar4 = PhoneInstallmentDailyLoanView.f30860i;
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                p118hf.a.I(apply, 12);
                D3.a.F(apply, i7);
                break;
            case 5:
                int i11 = SearchRecipientAccountToBankView.f33834f;
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                p118hf.a.I(apply, 16);
                D3.a.F(apply, i7);
                break;
            case 6:
                int i12 = SearchRecipientAccountToBankView.f33834f;
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                p118hf.a.I(apply, 16);
                D3.a.F(apply, i7);
                break;
            case 7:
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                p118hf.a.I(apply, 16);
                apply.g(ColorStateList.valueOf(i7));
                break;
            default:
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                p118hf.a.I(apply, 16);
                apply.g(ColorStateList.valueOf(i7));
                break;
        }
        return Unit.f38893a;
    }
}
