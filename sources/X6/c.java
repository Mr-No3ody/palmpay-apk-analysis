package X6;

import N8.q0;
import Xd.C0788g;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.TypedValue;
import androidx.fragment.app.E;
import androidx.work.impl.AbstractC1274g;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.s;
import com.google.api.Service;
import com.palmpay.lib.ui.picker.picker.HoursMinutesPickerView;
import com.palmpay.lib.ui.picker.picker.TimePickerView;
import com.transsnet.palmpay.account.bean.ApplyForTier3Req;
import com.transsnet.palmpay.account.bean.req.ResetPasswordReq;
import com.transsnet.palmpay.account.ui.fragment.upgrade.UpgradeTier3StepAddressEditFragment;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.BaseMvvmDialogFragment;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.ui.activity.CoreUssdListActivity;
import com.transsnet.palmpay.core.ui.activity.RNCorePreviewActivity;
import com.transsnet.palmpay.credit.ui.dialog.AvailableCouponListDialogFragment;
import com.transsnet.palmpay.credit.ui.dialog.OcREUnFreezeDialog;
import com.transsnet.palmpay.credit.ui.dialog.TransferByLoanSheet;
import com.transsnet.palmpay.credit.viewmodel.TransferByLoanViewModel;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.input.CustomAutoCompleteTextView;
import com.transsnet.palmpay.custom_view.input.ModelMobileInputAdapter;
import com.transsnet.palmpay.custom_view.input.OperatorSelectNewPopWindow;
import com.transsnet.palmpay.custom_view.utils.KeyBoardListenerHelper;
import com.transsnet.palmpay.managemoney.bean.CashBoxInterestDetail;
import com.transsnet.palmpay.managemoney.bean.resp.GetCashBoxOrderDetailResp;
import com.transsnet.palmpay.managemoney.ui.activity.CashBoxOrderDetailActivity;
import com.transsnet.palmpay.managemoney.ui.activity.UserFixedSavingActivity;
import com.transsnet.palmpay.managemoney.ui.dialog.CongratulationsDialogFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.OldUserFixedSavingFragment;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashHomeActivity;
import com.transsnet.palmpay.teller.ui.dialog.InputPaymentItemAmountDialog;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentHomeNGFragment;
import com.transsnet.palmpay.teller.ui.view.ModelActivityBannerWithCoupon;
import com.transsnet.palmpay.teller.ui.view.ModelAvailableCouponAndPointItem;
import com.transsnet.palmpay.teller.ui.view.SideBarView;
import com.transsnet.palmpay.teller.viewmodel.BillPaymentHomeNGViewModel;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p052da.I;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11007b;

    public /* synthetic */ c(CongratulationsDialogFragment congratulationsDialogFragment, OldUserFixedSavingFragment oldUserFixedSavingFragment) {
        this.f11006a = 26;
        this.f11007b = congratulationsDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i7 = 0;
        char c6 = 1;
        Object obj = this.f11007b;
        switch (this.f11006a) {
            case 0:
                return ((HoursMinutesPickerView) obj).f24480A;
            case 1:
                return TimePickerView.g((TimePickerView) obj);
            case 2:
                o oVar = (o) obj;
                Bc.l lVar = oVar.f11036d;
                if (lVar == null) {
                    Intrinsics.n("pickerBinding");
                    throw null;
                }
                long time = ((TimePickerView) lVar.f755c).getTime();
                Function2 function2 = oVar.f11041j;
                if (function2 != null) {
                    function2.invoke(Long.valueOf(time), null);
                }
                oVar.dismiss();
                return Unit.f38893a;
            case 3:
                return InputPaymentItemAmountDialog.mAmountItemClickListener_delegate$lambda$2((InputPaymentItemAmountDialog) obj);
            case 4:
                Z6.i iVar = (Z6.i) obj;
                iVar.getClass();
                iVar.dismiss();
                return Unit.f38893a;
            case 5:
                int i10 = BillPaymentHomeNGFragment.f34279r0;
                BillPaymentHomeNGFragment billPaymentHomeNGFragment = (BillPaymentHomeNGFragment) obj;
                BillPaymentHomeNGViewModel billPaymentHomeNGViewModel = (BillPaymentHomeNGViewModel) billPaymentHomeNGFragment.f27333i;
                if (billPaymentHomeNGViewModel != null) {
                    billPaymentHomeNGViewModel.e(billPaymentHomeNGFragment.f34294w, false, false);
                }
                return Unit.f38893a;
            case 6:
                androidx.work.impl.n nVar = (androidx.work.impl.n) obj;
                nVar.getClass();
                androidx.work.impl.utils.c.a(nVar);
                return Unit.f38893a;
            case 7:
                s sVar = (s) obj;
                sVar.getClass();
                int i11 = Build.VERSION.SDK_INT;
                String str = androidx.work.impl.background.systemjob.d.f18460f;
                Context context = sVar.f18675b;
                if (i11 >= 34) {
                    androidx.work.impl.background.systemjob.a.b(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList arrayListB = androidx.work.impl.background.systemjob.d.b(context, jobScheduler);
                if (arrayListB != null && !arrayListB.isEmpty()) {
                    Iterator it = arrayListB.iterator();
                    while (it.hasNext()) {
                        androidx.work.impl.background.systemjob.d.a(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
                WorkDatabase workDatabase = sVar.f18677d;
                workDatabase.h().resetScheduledState();
                AbstractC1274g.b(sVar.f18676c, workDatabase, sVar.f18679f);
                return Unit.f38893a;
            case 8:
                p024b9.d dVar = (p024b9.d) obj;
                dVar.f18800e.invoke(Boolean.FALSE);
                Context context2 = dVar.f18796a.getContext();
                if (context2 != null) {
                    ToastUtils.showLong(context2.getString(F8.h.ac_upload_receipt_failed), new Object[0]);
                }
                return Unit.f38893a;
            case 9:
                int i12 = UpgradeTier3StepAddressEditFragment.f26283C;
                return new KeyBoardListenerHelper(((UpgradeTier3StepAddressEditFragment) obj).getActivity());
            case 10:
                ModelActivityBannerWithCoupon.a aVar = ModelActivityBannerWithCoupon.f34320j;
                com.transsnet.palmpay.teller.ui.view.c cVar = new com.transsnet.palmpay.teller.ui.view.c();
                cVar.a(new com.transsnet.palmpay.teller.ui.view.d(new p041ce.i(cVar, i7), new p041ce.i(cVar, c6 == true ? 1 : 0)));
                cVar.a(new com.transsnet.palmpay.teller.ui.view.b((ModelActivityBannerWithCoupon) obj, new p041ce.i(cVar, 2), new p041ce.i(cVar, 3)));
                cVar.addChildClickViewIds(Pd.c.layoutCouponCL);
                return cVar;
            case 11:
                int i13 = ModelAvailableCouponAndPointItem.f34329i;
                return new C0788g(((ModelAvailableCouponAndPointItem) obj).f34333f);
            case 12:
                SideBarView sideBarView = (SideBarView) obj;
                return Integer.valueOf((int) TypedValue.applyDimension(1, sideBarView.f34363v, sideBarView.getResources().getDisplayMetrics()));
            case 13:
                return ((BaseApplication) obj).lambda$initFirebase$0();
            case 14:
                int i14 = BaseMvvmActivity.f27329b;
                BaseMvvmActivity baseMvvmActivity = (BaseMvvmActivity) obj;
                Class clsA = p002a.a.A(baseMvvmActivity);
                if (clsA != null) {
                    return (BaseViewModel) new androidx.camera.video.internal.c(baseMvvmActivity).h(clsA);
                }
                throw new IllegalStateException(q0.k("Cannot resolve ViewModel for ", baseMvvmActivity.getClass().getName(), ". Check R8 Signature keep for BaseMvvm* subclasses."));
            case 15:
                int i15 = BaseMvvmDialogFragment.f27331H;
                BaseMvvmDialogFragment baseMvvmDialogFragment = (BaseMvvmDialogFragment) obj;
                Class clsA2 = p002a.a.A(baseMvvmDialogFragment);
                if (clsA2 != null) {
                    return (BaseViewModel) new androidx.camera.video.internal.c(baseMvvmDialogFragment).h(clsA2);
                }
                throw new IllegalStateException(q0.k("Cannot resolve ViewModel for ", baseMvvmDialogFragment.getClass().getName(), ". Check R8 Signature keep for BaseMvvm* subclasses."));
            case 16:
                int i16 = CoreUssdListActivity.f27608d;
                return (SwipeRecyclerView) ((CoreUssdListActivity) obj).findViewById(L9.a.ussdList);
            case 17:
                int i17 = RNCorePreviewActivity.f27706a1;
                Intent intent = ((RNCorePreviewActivity) obj).getIntent();
                return Boolean.valueOf(intent != null ? intent.getBooleanExtra("mShowCashierPreview", true) : true);
            case 18:
                AvailableCouponListDialogFragment.a aVar2 = AvailableCouponListDialogFragment.f29932H;
                return new I(((AvailableCouponListDialogFragment) obj).requireContext());
            case 19:
                return OcREUnFreezeDialog.btnConfirm_delegate$lambda$0((OcREUnFreezeDialog) obj);
            case 20:
                int i18 = TransferByLoanSheet.f30032q0;
                E eRequireActivity = ((TransferByLoanSheet) obj).requireActivity();
                Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                return (TransferByLoanViewModel) new androidx.camera.video.internal.c(eRequireActivity).h(TransferByLoanViewModel.class);
            case 21:
                return Integer.valueOf(((CustomAutoCompleteTextView) obj).getWidth());
            case 22:
                return ModelMobileInputAdapter.getView$lambda$8$lambda$7$lambda$6((ModelMobileInputAdapter) obj);
            case 23:
                return OperatorSelectNewPopWindow.apw_rcv_delegate$lambda$0((OperatorSelectNewPopWindow) obj);
            case 24:
                int i19 = CashBoxOrderDetailActivity.f32043w;
                ClipboardUtils.copyText(((GetCashBoxOrderDetailResp.CashBoxOrderDetail) obj).getTransactionId());
                ToastUtils.showLong(p025ba.k.core_copy_success);
                return Unit.f38893a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                int i20 = CashBoxOrderDetailActivity.f32043w;
                ClipboardUtils.copyText(((CashBoxInterestDetail) obj).getOrgOrderNo());
                ToastUtils.showLong(p025ba.k.core_copy_success);
                return Unit.f38893a;
            case 26:
                OldUserFixedSavingFragment.a aVar3 = OldUserFixedSavingFragment.f32498Z;
                CongratulationsDialogFragment congratulationsDialogFragment = (CongratulationsDialogFragment) obj;
                if (congratulationsDialogFragment.getActivity() != null) {
                    E activity = congratulationsDialogFragment.getActivity();
                    Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.managemoney.ui.activity.UserFixedSavingActivity");
                    ((UserFixedSavingActivity) activity).n(1);
                }
                return Unit.f38893a;
            case 27:
                return G8.a.t().applyForTier3((ApplyForTier3Req) obj);
            case 28:
                ResetPasswordReq resetPasswordReq = (ResetPasswordReq) obj;
                return BaseApplication.hasLogin() ? G8.a.t().resetPassword(resetPasswordReq) : G8.a.t().resetPasswordNoToken(resetPasswordReq);
            default:
                ArrayList arrayList = Recharge2CashHomeActivity.f33117v;
                Recharge2CashHomeActivity recharge2CashHomeActivity = (Recharge2CashHomeActivity) obj;
                recharge2CashHomeActivity.getUIHandler().postDelayed(new com.transsnet.adsdk.widgets.banner.bannerview.b(recharge2CashHomeActivity, 11), 800L);
                return Unit.f38893a;
        }
    }

    public /* synthetic */ c(Object obj, int i7) {
        this.f11006a = i7;
        this.f11007b = obj;
    }
}
