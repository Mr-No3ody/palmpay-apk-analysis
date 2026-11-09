package Ae;

import Bc.D;
import Bc.E;
import E.J;
import E.b0;
import Hb.x;
import Hb.z;
import Pa.AbstractC0508e;
import Pa.i0;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.text.InputFilter;
import android.util.Size;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.camera.core.ImageProxy;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1204n;
import com.flexibank.sdk.base.FlexiBankBaseFragment;
import com.google.api.Service;
import com.palmpay.lib.liveness.video.VideoActivity;
import com.palmpay.lib.scanplus.view.CodePointView;
import com.palmpay.lib.scanplus.view.ScanLineView;
import com.transsnet.mtn.sdk.ui.view.InputView;
import com.transsnet.palmpay.cash_in.ui.activity.FundResultActivity;
import com.transsnet.palmpay.cash_in.ui.activity.RechargeActivity;
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawResultActivity;
import com.transsnet.palmpay.cash_in.ui.fragment.WithdrawHomeFragment;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import com.transsnet.palmpay.credit.view.MultiLoanCtaLightView;
import com.transsnet.palmpay.credit.view.ProductContentListView;
import com.transsnet.palmpay.send_money.ui.fragment.MoneyTransferHistoryFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeFragment;
import com.transsnet.palmpay.send_money.ui.view.ClipboardAccountPromptView;
import com.transsnet.palmpay.send_money.viewmodel.ClipboardMatchInfoViewModel;
import com.transsnet.palmpay.service.PushMainService;
import com.transsnet.palmpay.service.PushSubService;
import com.transsnet.palmpay.ui.fragment.TransactionHistoryFragment;
import com.transsnet.palmpay.ui.view.ModelPremiumScrollNotice;
import com.wang.avi.AVLoadingIndicatorView;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f290b;

    public /* synthetic */ n(Object obj, int i7) {
        this.f289a = i7;
        this.f290b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strC;
        E e10;
        D d2;
        String strC2 = null;
        int i7 = 1;
        switch (this.f289a) {
            case 0:
                int i10 = p.f293o;
                p pVar = (p) this.f290b;
                ((AVLoadingIndicatorView) pVar.f297g.getValue()).setVisibility(8);
                ((TextView) pVar.f295e.getValue()).setEnabled(true);
                return;
            case 1:
                int i11 = InputView.f25702B;
                B8.b bVar = new B8.b(i7);
                InputView inputView = (InputView) this.f290b;
                int i12 = inputView.f25710g;
                InputFilter[] inputFilterArr = new InputFilter[i12 > 0 ? 2 : 1];
                inputFilterArr[0] = bVar;
                if (i12 > 0) {
                    inputFilterArr[1] = new InputFilter.LengthFilter(inputView.f25710g);
                }
                inputView.f25704a.getEditableText().setFilters(inputFilterArr);
                return;
            case 2:
                Size size = VideoActivity.f23949B;
                ((VideoActivity) this.f290b).getWindow().getDecorView().setBackgroundColor(-1);
                return;
            case 3:
                String[] strArr = FundResultActivity.f26846v;
                ((FundResultActivity) this.f290b).l();
                return;
            case 4:
                RechargeActivity rechargeActivity = (RechargeActivity) this.f290b;
                Object value = rechargeActivity.f26862B.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((ScrollView) value).fullScroll(130);
                rechargeActivity.p().requestFocus();
                return;
            case 5:
                String[] strArr2 = WithdrawResultActivity.f26959A;
                ((WithdrawResultActivity) this.f290b).l();
                return;
            case 6:
                int i13 = MoneyTransferHistoryFragment.f33669X;
                ((MoneyTransferHistoryFragment) this.f290b).w().notifyDataSetChanged();
                return;
            case 7:
                int i14 = TransactionHistoryFragment.f35248k0;
                ((TransactionHistoryFragment) this.f290b).v().notifyDataSetChanged();
                return;
            case 8:
                D.d dVar = (D.d) this.f290b;
                androidx.concurrent.futures.k kVar = (androidx.concurrent.futures.k) dVar.f1583g;
                if (kVar != null) {
                    kVar.b(null);
                    dVar.f1583g = null;
                    return;
                }
                return;
            case 9:
                PPRNBridge.goToNotificationSettingPage$lambda$34((PPRNBridge) this.f290b);
                return;
            case 10:
                J j6 = (J) this.f290b;
                synchronized (j6.f1931Q) {
                    try {
                        j6.f1933Y = null;
                        ImageProxy imageProxy = j6.f1932X;
                        if (imageProxy != null) {
                            j6.f1932X = null;
                            j6.e(imageProxy);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 11:
                ((b0) this.f290b).o();
                return;
            case 12:
                TransferToBankHomeFragment transferToBankHomeFragment = (TransferToBankHomeFragment) this.f290b;
                p223od.q qVar = (p223od.q) transferToBankHomeFragment.f27335j;
                if (qVar != null && (e10 = qVar.f40465i.f33900c) != null) {
                    ClipboardAccountPromptView clipboardAccountPromptView = (ClipboardAccountPromptView) e10.f647v;
                    ((TextView) clipboardAccountPromptView.f33833a.f813d).setOnClickListener(null);
                    p220oa.h.c(clipboardAccountPromptView);
                }
                boolean zD = AbstractC0508e.d();
                p355xf.t tVar = transferToBankHomeFragment.f33780v;
                if (!zD || !BaseApplication.hasLogin() || !transferToBankHomeFragment.isVisible() || !((C1212w) transferToBankHomeFragment.getViewLifecycleOwner().getLifecycle()).f17478d.a(EnumC1204n.f17464e)) {
                    ((ClipboardMatchInfoViewModel) tVar.getValue()).d();
                    return;
                }
                Context context = transferToBankHomeFragment.getContext();
                if (context != null && (strC = AbstractC0508e.c(context)) != null && strC.length() == 10) {
                    strC2 = strC;
                }
                if (strC2 == null) {
                    ((ClipboardMatchInfoViewModel) tVar.getValue()).d();
                    return;
                } else {
                    ((ClipboardMatchInfoViewModel) tVar.getValue()).e(strC2);
                    return;
                }
            case 13:
                TransferToPalmPayHomeFragment transferToPalmPayHomeFragment = (TransferToPalmPayHomeFragment) this.f290b;
                if (!transferToPalmPayHomeFragment.isAdded() || transferToPalmPayHomeFragment.getView() == null) {
                    return;
                }
                transferToPalmPayHomeFragment.y();
                p223od.r rVar = (p223od.r) transferToPalmPayHomeFragment.f27335j;
                if (rVar != null && (d2 = rVar.t.f33930c) != null) {
                    ClipboardAccountPromptView clipboardAccountPromptView2 = (ClipboardAccountPromptView) d2.f625p;
                    ((TextView) clipboardAccountPromptView2.f33833a.f813d).setOnClickListener(null);
                    p220oa.h.c(clipboardAccountPromptView2);
                }
                View view = transferToPalmPayHomeFragment.getView();
                p355xf.t tVar2 = transferToPalmPayHomeFragment.f33818L;
                if (view == null) {
                    ((ClipboardMatchInfoViewModel) tVar2.getValue()).d();
                    return;
                }
                if (!AbstractC0508e.d() || !BaseApplication.hasLogin() || !transferToPalmPayHomeFragment.isVisible() || !((C1212w) transferToPalmPayHomeFragment.getViewLifecycleOwner().getLifecycle()).f17478d.a(EnumC1204n.f17464e)) {
                    ((ClipboardMatchInfoViewModel) tVar2.getValue()).d();
                    return;
                }
                Context context2 = transferToPalmPayHomeFragment.getContext();
                strC2 = context2 != null ? AbstractC0508e.c(context2) : null;
                if (strC2 == null) {
                    ((ClipboardMatchInfoViewModel) tVar2.getValue()).d();
                    return;
                } else {
                    ((ClipboardMatchInfoViewModel) tVar2.getValue()).e(strC2);
                    return;
                }
            case 14:
                G.f fVar = (G.f) this.f290b;
                fVar.f2875f = true;
                fVar.a();
                return;
            case 15:
                G.h hVar = (G.h) ((E2.a) this.f290b).f2186e;
                if (hVar != null) {
                    Iterator it = hVar.values().iterator();
                    while (it.hasNext()) {
                        ((androidx.camera.core.processing.m) it.next()).c();
                    }
                    return;
                }
                return;
            case 16:
                int i15 = WithdrawHomeFragment.f27021t0;
                WithdrawHomeFragment withdrawHomeFragment = (WithdrawHomeFragment) this.f290b;
                if (i0.W(withdrawHomeFragment.getActivity())) {
                    withdrawHomeFragment.u();
                    return;
                }
                return;
            case 17:
                int i16 = MultiLoanCtaLightView.f30800p;
                ((MultiLoanCtaLightView) this.f290b).b();
                return;
            case 18:
                ProductContentListView.e((ProductContentListView) this.f290b);
                return;
            case 19:
                AnimatorSet animatorSet = ((x) this.f290b).f3855e;
                if (animatorSet != null) {
                    animatorSet.start();
                    return;
                }
                return;
            case 20:
                AnimatorSet animatorSet2 = ((z) this.f290b).f3858e;
                if (animatorSet2 != null) {
                    animatorSet2.start();
                    return;
                }
                return;
            case 21:
                ModelPremiumScrollNotice modelPremiumScrollNotice = (ModelPremiumScrollNotice) this.f290b;
                modelPremiumScrollNotice.f35315e = 0;
                modelPremiumScrollNotice.scrollToPosition(0);
                return;
            case 22:
                ((Ie.m) this.f290b).a();
                return;
            case 23:
                ViewFlipper viewFlipper = ((Je.j) this.f290b).f4811d;
                if (viewFlipper != null) {
                    viewFlipper.startFlipping();
                    return;
                }
                return;
            case 24:
                ((K3.d) this.f290b).loadingDismiss();
                return;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                int i17 = FlexiBankBaseFragment.f21938j;
                FlexiBankBaseFragment flexiBankBaseFragment = (FlexiBankBaseFragment) this.f290b;
                P6.a aVar = flexiBankBaseFragment.f21942d;
                if (aVar != null) {
                    if (!aVar.isShowing()) {
                        aVar = null;
                    }
                    if (aVar != null) {
                        aVar.dismiss();
                        aVar.setOnCancelListener(null);
                    }
                }
                flexiBankBaseFragment.f21942d = null;
                return;
            case 26:
                int i18 = CodePointView.f24008A;
                CodePointView this$0 = (CodePointView) this.f290b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.measure(View.MeasureSpec.makeMeasureSpec(this$0.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this$0.getHeight(), 1073741824));
                this$0.layout(this$0.getLeft(), this$0.getTop(), this$0.getRight(), this$0.getBottom());
                return;
            case 27:
                int i19 = ScanLineView.f24022Q;
                ScanLineView this$1 = (ScanLineView) this.f290b;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.measure(View.MeasureSpec.makeMeasureSpec(this$1.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this$1.getHeight(), 1073741824));
                this$1.layout(this$1.getLeft(), this$1.getTop(), this$1.getRight(), this$1.getBottom());
                return;
            case 28:
                Process.setThreadPriority(0);
                ((Runnable) this.f290b).run();
                return;
            default:
                PushMainService.a aVar2 = PushMainService.f34093f;
                F6.d.h("aidl-service-main", 5, "main service bind sub push service");
                PushMainService pushMainService = (PushMainService) this.f290b;
                pushMainService.f34095a = true;
                pushMainService.bindService(new Intent(pushMainService, (Class<?>) PushSubService.class), (Ld.c) pushMainService.f34096b.getValue(), 1);
                return;
        }
    }
}
