package Ce;

import android.content.DialogInterface;
import com.growingio.android.circler.ThreadSafeTipView$OnExitListener;
import com.transsnet.palmpay.account.bean.rsp.GetSecurityFlowRsp;
import com.transsnet.palmpay.account.ui.activity.AddUserExtraInfoEntryActivity;
import com.transsnet.palmpay.account.ui.activity.AddUserExtraInfoResultActivity;
import com.transsnet.palmpay.account.ui.activity.EnableCashBoxAutoSaveActivity;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelV2Activity;
import com.transsnet.palmpay.account.ui.fragment.history.VerifyAccountHistoryFragment;
import com.transsnet.palmpay.account.ui.viewmodel.VerifyAccountHistoryViewModel;
import com.transsnet.palmpay.contacts.ui.activity.LinkFavePersonalInfoActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity;
import com.transsnet.palmpay.ui.fragment.HomePalmZoneTabV2;
import com.transsnet.palmpay.viewmodule.PalmZoneViewModel;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class T implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1452b;

    public /* synthetic */ T(Object obj, int i7) {
        this.f1451a = i7;
        this.f1452b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Object obj = this.f1452b;
        switch (this.f1451a) {
            case 0:
                int i7 = HomePalmZoneTabV2.f35134Z;
                HomePalmZoneTabV2 homePalmZoneTabV2 = (HomePalmZoneTabV2) obj;
                PalmZoneViewModel palmZoneViewModel = (PalmZoneViewModel) homePalmZoneTabV2.f27333i;
                if (palmZoneViewModel != null) {
                    palmZoneViewModel.h();
                }
                homePalmZoneTabV2.x();
                break;
            case 1:
                ((AddUserExtraInfoEntryActivity) obj).finish();
                break;
            case 2:
                AddUserExtraInfoResultActivity.a aVar = AddUserExtraInfoResultActivity.f25822d;
                AddUserExtraInfoResultActivity addUserExtraInfoResultActivity = (AddUserExtraInfoResultActivity) obj;
                PalmPayLevelV2Activity.f25925p.navigateFromKycComplete(addUserExtraInfoResultActivity);
                addUserExtraInfoResultActivity.finish();
                break;
            case 3:
                EnableCashBoxAutoSaveActivity enableCashBoxAutoSaveActivity = (EnableCashBoxAutoSaveActivity) obj;
                enableCashBoxAutoSaveActivity.n(enableCashBoxAutoSaveActivity.f25854e);
                break;
            case 4:
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference.get() != null) {
                    ((DialogInterface.OnDismissListener) weakReference.get()).onDismiss(dialogInterface);
                }
                break;
            case 5:
                VerifyAccountHistoryFragment.a aVar2 = VerifyAccountHistoryFragment.f26150v;
                VerifyAccountHistoryFragment verifyAccountHistoryFragment = (VerifyAccountHistoryFragment) obj;
                VerifyAccountHistoryViewModel verifyAccountHistoryViewModel = (VerifyAccountHistoryViewModel) verifyAccountHistoryFragment.f27333i;
                if (verifyAccountHistoryViewModel != null) {
                    GetSecurityFlowRsp getSecurityFlowRsp = verifyAccountHistoryFragment.f26153p;
                    verifyAccountHistoryViewModel.d(getSecurityFlowRsp != null ? getSecurityFlowRsp.flowId : null, getSecurityFlowRsp != null ? getSecurityFlowRsp.mobile : null);
                }
                break;
            case 6:
                LinkFavePersonalInfoActivity linkFavePersonalInfoActivity = (LinkFavePersonalInfoActivity) obj;
                linkFavePersonalInfoActivity.setResult(-1);
                linkFavePersonalInfoActivity.finish();
                break;
            case 7:
                ((ThreadSafeTipView$OnExitListener) obj).onExitDebugger();
                break;
            case 8:
                ((com.growingio.android.debugger.ThreadSafeTipView$OnExitListener) obj).onExitDebugger();
                break;
            case 9:
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) obj;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(dialogInterface);
                }
                break;
            default:
                ((OcApplyBaseActivity) obj).r();
                break;
        }
    }

    public T(DialogInterface.OnDismissListener onDismissListener) {
        this.f1451a = 4;
        this.f1452b = new WeakReference(onDismissListener);
    }
}
