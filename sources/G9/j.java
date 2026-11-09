package G9;

import Gd.B;
import Gd.w;
import Hb.D;
import android.os.Handler;
import android.os.Looper;
import com.google.api.Service;
import com.transsnet.palmpay.cash_in.ui.fragment.WithdrawHomeFragment;
import com.transsnet.palmpay.cash_in.ui.view.BindBankCardProgressModel;
import com.transsnet.palmpay.core.network.api.AccountApiService;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckSafetyAssessmentQADialogFragment;
import com.transsnet.palmpay.send_money.ui.view.TransferDetailQuestionView;
import com.transsnet.palmpay.send_money.ui.view.TransferToBankProgressModel;
import com.transsnet.palmpay.send_money.ui.view.TransferToFastTransferSafeguardProgressModel;
import com.transsnet.palmpay.send_money.ui.view.TransferToPalmPayProgressView;
import com.transsnet.palmpay.ui.view.ModelPalmPrizeBanner;
import com.transsnet.palmpay.ui.view.ModelPremiumBenefits;
import com.transsnet.palmpay.util.SizeUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3177a;

    public /* synthetic */ j(int i7) {
        this.f3177a = i7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3177a) {
            case 0:
                int i7 = WithdrawHomeFragment.f27021t0;
                return new E9.i();
            case 1:
                int i10 = WithdrawHomeFragment.f27021t0;
                return new E9.f(p366y9.c.cash_in_item_withdraw_menu, null);
            case 2:
                int i11 = WithdrawHomeFragment.f27021t0;
                return new E9.g();
            case 3:
                int i12 = TransferDetailQuestionView.f33871b;
                return new Gd.d(p159kd.f.sm_item_transfer_detail_question, null);
            case 4:
                int i13 = TransferToBankProgressModel.f33911i;
                Gd.t tVar = new Gd.t(p159kd.f.sm_item_transfer_header_progress, null);
                tVar.f3372a = true;
                return tVar;
            case 5:
                int i14 = TransferToFastTransferSafeguardProgressModel.t;
                return new w(p159kd.f.sm_item_transfer_fast_refund_progress, null);
            case 6:
                int i15 = TransferToPalmPayProgressView.f33939f;
                return new B(p159kd.f.sm_item_transfer_to_palmpay_progress, null);
            case 7:
                return new Handler(Looper.getMainLooper());
            case 8:
                return new Handler(Looper.getMainLooper());
            case 9:
                return new SimpleDateFormat("hh : mm : ss", Locale.ENGLISH);
            case 10:
                return new D();
            case 11:
                return new Handler(Looper.getMainLooper());
            case 12:
                int i16 = ModelPalmPrizeBanner.f35301e;
                return new p370ye.i(Ac.f.main_item_reward_palmprize, null);
            case 13:
                int i17 = ModelPremiumBenefits.f35304i;
                return new p370ye.f(Ac.f.main_item_premium_benefits_item, null);
            case 14:
                int i18 = BindBankCardProgressModel.f27070d;
                return new I9.b(p366y9.c.ci_item_bind_bank_card_progress, null);
            case 15:
                return new p354xe.a(Ac.f.main_new_user_coupon_item_layout, null);
            case 16:
                return new p385ze.d(0);
            case 17:
                return new p385ze.d(1);
            case 18:
                return new p385ze.e(Ac.f.main_item_saving_fund, null);
            case 19:
                return new p385ze.f(Ac.f.main_item_saving_insurance, null);
            case 20:
                return new p385ze.c(Ac.f.main_item_saving_comment, null);
            case 21:
                return new p385ze.i(Ac.f.main_item_saving_stock, null);
            case 22:
                return new p385ze.j(Ac.f.main_item_saving_target_h, null);
            case 23:
                return new p385ze.k(Ac.f.main_item_saving_target, null);
            case 24:
                return new CheckSafetyAssessmentQADialogFragment();
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return new CopyOnWriteArrayList();
            case 26:
                return Integer.valueOf(SizeUtils.dp2px(14.0f));
            case 27:
                return new ArrayList();
            case 28:
                return Boolean.TRUE;
            default:
                return ((AccountApiService) p324va.c.f43141a.f14623d).queryPaymentMethod();
        }
    }
}
