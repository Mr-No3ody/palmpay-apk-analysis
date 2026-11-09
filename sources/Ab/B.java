package Ab;

import com.google.api.Service;
import com.mikepenz.iconics.IconicsDrawable;
import com.transsnet.palmpay.cash_in.ui.activity.RechargeActivity;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.credit.bean.resp.Reason;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentUpGradeSuccFragment;
import com.transsnet.palmpay.credit.ui.viewmodel.FlexiCashUnfreezeItem;
import com.transsnet.palmpay.send_money.bean.RecipientBeanV2;
import com.transsnet.palmpay.send_money.ui.fragment.AddBankAccountFragment;
import com.transsnet.palmpay.ui.fragment.BankCardFragment;
import com.transsnet.palmpay.util.ToastUtils;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class B implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103a;

    public /* synthetic */ B(int i7) {
        this.f103a = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f103a) {
            case 0:
                Long it = (Long) obj;
                CLInstallmentUpGradeSuccFragment.a aVar = CLInstallmentUpGradeSuccFragment.f30601q0;
                Intrinsics.checkNotNullParameter(it, "it");
                return Long.valueOf(((long) 3) - it.longValue());
            case 1:
                CLInstallmentUpGradeSuccFragment.a aVar2 = CLInstallmentUpGradeSuccFragment.f30601q0;
                return Unit.f38893a;
            case 2:
                return Boolean.valueOf(((File) obj).delete());
            case 3:
                String error = (String) obj;
                String str = RechargeActivity.f26858r0;
                Intrinsics.checkNotNullParameter(error, "error");
                ToastUtils.showLong(error, new Object[0]);
                return Unit.f38893a;
            case 4:
                String error2 = (String) obj;
                String str2 = RechargeActivity.f26858r0;
                Intrinsics.checkNotNullParameter(error2, "error");
                ToastUtils.showLong(error2, new Object[0]);
                return Unit.f38893a;
            case 5:
                String it2 = (String) obj;
                int i7 = AddBankAccountFragment.f33648M;
                Intrinsics.checkNotNullParameter(it2, "it");
                ToastUtils.showLong(it2, new Object[0]);
                return Unit.f38893a;
            case 6:
                IconicsDrawable apply = (IconicsDrawable) obj;
                int i10 = BankCardFragment.f35064B;
                Intrinsics.checkNotNullParameter(apply, "$this$apply");
                p118hf.a.I(apply, 20);
                D3.a.F(apply, -1);
                return Unit.f38893a;
            case 7:
                return Boolean.valueOf(((File) obj).delete());
            case 8:
                int i11 = FlexiCashUnfreezeItem.f30673v;
                return Unit.f38893a;
            case 9:
                String it3 = (String) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                ToastUtils.showLong(it3, new Object[0]);
                return Unit.f38893a;
            case 10:
                String it4 = (String) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                ToastUtils.showLong(it4, new Object[0]);
                return Unit.f38893a;
            case 11:
                String letter = (String) obj;
                Intrinsics.checkNotNullParameter(letter, "letter");
                RecipientBeanV2 recipientBeanV2 = new RecipientBeanV2();
                recipientBeanV2.setHeader(letter);
                return recipientBeanV2;
            case 12:
                String it5 = (String) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                ToastUtils.showLong(it5, new Object[0]);
                return Unit.f38893a;
            case 13:
                Reason it6 = (Reason) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                return it6.getSecondReasonDesc();
            case 14:
                String it7 = (String) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                return Boolean.valueOf(!StringsKt.F(it7));
            case 15:
                String letter2 = (String) obj;
                Intrinsics.checkNotNullParameter(letter2, "letter");
                RecipientBeanV2 recipientBeanV3 = new RecipientBeanV2();
                recipientBeanV3.setHeader(letter2);
                return recipientBeanV3;
            case 16:
                String it8 = (String) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                ToastUtils.showLong(it8, new Object[0]);
                return Unit.f38893a;
            case 17:
                String it9 = (String) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                ToastUtils.showLong(it9, new Object[0]);
                return Unit.f38893a;
            case 18:
                String it10 = (String) obj;
                Intrinsics.checkNotNullParameter(it10, "it");
                ToastUtils.showLong(it10, new Object[0]);
                return Unit.f38893a;
            case 19:
                String it11 = (String) obj;
                Intrinsics.checkNotNullParameter(it11, "it");
                ToastUtils.showLong(it11, new Object[0]);
                return Unit.f38893a;
            case 20:
                return Unit.f38893a;
            case 21:
                Intrinsics.checkNotNullParameter((CommonResult) obj, "it");
                return Unit.f38893a;
            case 22:
                return Unit.f38893a;
            case 23:
                return Unit.f38893a;
            case 24:
                ToastUtils.showLong((String) obj, new Object[0]);
                return Unit.f38893a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ToastUtils.showLong((String) obj, new Object[0]);
                return Unit.f38893a;
            case 26:
                ToastUtils.showLong((String) obj, new Object[0]);
                return Unit.f38893a;
            case 27:
                ToastUtils.showLong((String) obj, new Object[0]);
                return Unit.f38893a;
            case 28:
                ToastUtils.showLong((String) obj, new Object[0]);
                return Unit.f38893a;
            default:
                return Unit.f38893a;
        }
    }
}
