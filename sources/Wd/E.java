package Wd;

import Pa.i0;
import Pa.r0;
import V9.C0714c;
import android.view.View;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.device.SetDeviceNotificationReq;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.teller.bean.BillerListItemBean;
import com.transsnet.palmpay.teller.ui.activity.EditBeneficiaryActivity;
import com.transsnet.palmpay.teller.ui.dialog.PickBillerNewDialog;
import com.transsnet.palmpay.teller.viewmodel.EditBeneficiaryViewModel;
import com.transsnet.palmpay.util.AppUtils;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class E implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditBeneficiaryActivity f10712b;

    public /* synthetic */ E(EditBeneficiaryActivity editBeneficiaryActivity, int i7) {
        this.f10711a = i7;
        this.f10712b = editBeneficiaryActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EditBeneficiaryActivity editBeneficiaryActivity = this.f10712b;
        switch (this.f10711a) {
            case 0:
                if (!editBeneficiaryActivity.f34209e) {
                    AppUtils.gotoNotificationSettingPage(editBeneficiaryActivity);
                }
                if (!editBeneficiaryActivity.f34208d) {
                    ((PayApiService) p324va.c.f43141a.f14621b).enableDeviceNotification(new SetDeviceNotificationReq(true)).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0714c(editBeneficiaryActivity, 4));
                }
                break;
            case 1:
                EditBeneficiaryActivity editBeneficiaryActivity2 = this.f10712b;
                if (!editBeneficiaryActivity2.f34217w.isEmpty()) {
                    PickBillerNewDialog pickBillerNewDialog = new PickBillerNewDialog(editBeneficiaryActivity2, editBeneficiaryActivity2.f34212i, 0, false, 0, 20, null);
                    pickBillerNewDialog.setCallBack(editBeneficiaryActivity2);
                    pickBillerNewDialog.show();
                    pickBillerNewDialog.setBillers(editBeneficiaryActivity2.f34217w);
                } else {
                    ((EditBeneficiaryViewModel) editBeneficiaryActivity2.l()).d(editBeneficiaryActivity2.f34212i, true);
                }
                break;
            case 2:
                if (editBeneficiaryActivity.f34204B == null) {
                    editBeneficiaryActivity.p().e(editBeneficiaryActivity.getString(Pd.f.qt_msg_select_biller_first));
                } else if (!editBeneficiaryActivity.f34203A.isEmpty()) {
                    editBeneficiaryActivity.w();
                } else {
                    EditBeneficiaryViewModel editBeneficiaryViewModel = (EditBeneficiaryViewModel) editBeneficiaryActivity.l();
                    String str = editBeneficiaryActivity.f34212i;
                    BillerListItemBean billerListItemBean = editBeneficiaryActivity.f34204B;
                    editBeneficiaryViewModel.e(str, billerListItemBean != null ? billerListItemBean.getBillerId() : null, true);
                }
                break;
            default:
                int i7 = EditBeneficiaryActivity.f34202M;
                if (!BaseApplication.hasLogin()) {
                    i0.K(null, null);
                    break;
                } else if (!r0.U0()) {
                    editBeneficiaryActivity.f34209e = new androidx.core.app.M(editBeneficiaryActivity).f15943b.areNotificationsEnabled();
                    boolean z3 = p367ya.a.d().f44149a.getBoolean("key_notification", true);
                    editBeneficiaryActivity.f34208d = z3;
                    if ((editBeneficiaryActivity.f34209e && z3) || !editBeneficiaryActivity.s().d()) {
                        editBeneficiaryActivity.v();
                    } else {
                        O6.c cVar = new O6.c(editBeneficiaryActivity);
                        cVar.f6596b = O6.d.f(editBeneficiaryActivity.getString(p025ba.k.core_notification_permission));
                        cVar.f6598d = editBeneficiaryActivity.getString(p025ba.k.core_notification_permission_tips);
                        String string = editBeneficiaryActivity.getString(p025ba.k.core_allow_now);
                        E e10 = new E(editBeneficiaryActivity, 0);
                        cVar.f6600f = string;
                        cVar.f6602h = e10;
                        cVar.f6601g = editBeneficiaryActivity.getString(p025ba.k.core_no_thanks);
                        cVar.f6603i = null;
                        cVar.g();
                    }
                    break;
                }
                break;
        }
    }
}
