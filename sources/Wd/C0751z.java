package Wd;

import android.content.Context;
import android.content.Intent;
import com.transsnet.palmpay.airtime.ui.CashierAirtimePreviewActivity;
import com.transsnet.palmpay.betting.ui.activity.CashierBettingPreviewActivity;
import com.transsnet.palmpay.core.ui.activity.FinancialWithdrawalPreviewActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLBorrowPreviewActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentPreviewActivity;
import com.transsnet.palmpay.databundle.ui.activity.CashierDataBundlePreviewActivity;
import com.transsnet.palmpay.managemoney.ui.activity.CashBoxPreviewActivity;
import com.transsnet.palmpay.managemoney.ui.activity.FixedSavingPreviewActivity;
import com.transsnet.palmpay.managemoney.ui.activity.SavingAdvancePreviewActivity;
import com.transsnet.palmpay.r2c.ui.activity.CashierRecharge2CashPreviewActivity;
import com.transsnet.palmpay.send_money.ui.activity.CashierPayShopPreviewActivity;
import com.transsnet.palmpay.send_money.ui.activity.CashierWithdrawAgentPreviewActivity;
import com.transsnet.palmpay.teller.ui.activity.CashierBillPaymentPreviewActivity;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.MerchantPaymentPreviewActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Wd.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0751z extends Ka.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10796k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f10797l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0751z(Context context, int i7) {
        super(context);
        this.f10796k = i7;
        switch (i7) {
            case 1:
                Intrinsics.checkNotNullParameter(context, "context");
                super(context);
                this.f10797l = context;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(context, "context");
                super(context);
                this.f10797l = context;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(context, "context");
                super(context);
                this.f10797l = context;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(context, "context");
                super(context);
                this.f10797l = context;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(context, "context");
                super(context);
                this.f10797l = context;
                break;
            case 6:
                Intrinsics.checkNotNullParameter(context, "context");
                super(context);
                this.f10797l = context;
                break;
            case 7:
                Intrinsics.checkNotNullParameter(context, "context");
                super(context);
                this.f10797l = context;
                break;
            case 8:
                Intrinsics.checkNotNullParameter(context, "context");
                super(context);
                this.f10797l = context;
                break;
            case 9:
                Intrinsics.checkNotNullParameter(context, "context");
                super(context);
                this.f10797l = context;
                break;
            case 10:
                Intrinsics.checkNotNullParameter(context, "context");
                super(context);
                this.f10797l = context;
                break;
            case 11:
                Intrinsics.checkNotNullParameter(context, "context");
                super(context);
                this.f10797l = context;
                break;
            case 12:
                Intrinsics.checkNotNullParameter(context, "context");
                super(context);
                this.f10797l = context;
                break;
            case 13:
                Intrinsics.checkNotNullParameter(context, "context");
                super(context);
                this.f10797l = context;
                break;
            case 14:
                Intrinsics.checkNotNullParameter(context, "context");
                super(context);
                this.f10797l = context;
                break;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                this.f10797l = context;
                break;
        }
    }

    @Override // Ka.b
    public final Intent a() {
        switch (this.f10796k) {
            case 0:
                return new Intent(this.f10797l, (Class<?>) CashierBillPaymentPreviewActivity.class);
            case 1:
                Intent intent = new Intent(this.f10797l, (Class<?>) FinancialWithdrawalPreviewActivity.class);
                intent.putExtra("mPayeeAccountType", this.f4976g);
                intent.putExtra("mPayerAccountType", this.f4977h);
                return intent;
            case 2:
                return new Intent(this.f10797l, (Class<?>) CashBoxPreviewActivity.class);
            case 3:
                return new Intent(this.f10797l, (Class<?>) FixedSavingPreviewActivity.class);
            case 4:
                return new Intent(this.f10797l, (Class<?>) CashBoxPreviewActivity.class);
            case 5:
                return new Intent(this.f10797l, (Class<?>) SavingAdvancePreviewActivity.class);
            case 6:
                return new Intent(this.f10797l, (Class<?>) CashierRecharge2CashPreviewActivity.class);
            case 7:
                return new Intent(this.f10797l, (Class<?>) CashierDataBundlePreviewActivity.class);
            case 8:
                return new Intent(this.f10797l, (Class<?>) CashierAirtimePreviewActivity.class);
            case 9:
                Intent intent2 = new Intent(this.f10797l, (Class<?>) CashierPayShopPreviewActivity.class);
                intent2.putExtra("payee_account_type", this.f4976g);
                return intent2;
            case 10:
                Intent intent3 = new Intent(this.f10797l, (Class<?>) CashierWithdrawAgentPreviewActivity.class);
                intent3.putExtra("payee_account_type", this.f4976g);
                return intent3;
            case 11:
                return new Intent(this.f10797l, (Class<?>) CashierBettingPreviewActivity.class);
            case 12:
                return new Intent(this.f10797l, (Class<?>) CLBorrowPreviewActivity.class);
            case 13:
                return new Intent(this.f10797l, (Class<?>) CLRepaymentPreviewActivity.class);
            default:
                return new Intent(this.f10797l, (Class<?>) MerchantPaymentPreviewActivity.class);
        }
    }
}
