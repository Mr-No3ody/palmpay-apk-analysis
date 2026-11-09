package Ua;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.firebase.perf.util.Constants;
import com.transsnet.palmpay.core.bean.rsp.SmsChannelRsp;
import com.transsnet.palmpay.core.ui.activity.CoreUssdListActivity;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV3View;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV4View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f9433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f9434c;

    public /* synthetic */ m0(KeyEvent.Callback callback, ArrayList arrayList, int i7) {
        this.f9432a = i7;
        this.f9434c = callback;
        this.f9433b = arrayList;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        ArrayList arrayList = this.f9433b;
        KeyEvent.Callback callback = this.f9434c;
        switch (this.f9432a) {
            case 0:
                OneTimeCodeV3View oneTimeCodeV3View = (OneTimeCodeV3View) callback;
                if (dialogInterface != null) {
                    int i10 = OneTimeCodeV3View.f28465B;
                    oneTimeCodeV3View.getClass();
                    dialogInterface.dismiss();
                }
                if (oneTimeCodeV3View.f28475j != null) {
                    int iIntValue = ((Integer) arrayList.get(i7)).intValue();
                    if (iIntValue >= 2000) {
                        SmsChannelRsp smsChannelRspB = oneTimeCodeV3View.b(4);
                        oneTimeCodeV3View.f28475j.onSend(4, iIntValue - Constants.MAX_URL_LENGTH, smsChannelRspB != null ? smsChannelRspB.sender : null);
                    } else if (iIntValue != 3) {
                        oneTimeCodeV3View.e();
                        oneTimeCodeV3View.f28475j.onSend(iIntValue, 0, null);
                    } else {
                        SmsChannelRsp smsChannelRspB2 = oneTimeCodeV3View.b(3);
                        oneTimeCodeV3View.f28475j.onSend(3, iIntValue - Constants.MAX_URL_LENGTH, smsChannelRspB2 != null ? smsChannelRspB2.sender : null);
                    }
                }
                break;
            case 1:
                OneTimeCodeV4View oneTimeCodeV4View = (OneTimeCodeV4View) callback;
                if (dialogInterface != null) {
                    int i11 = OneTimeCodeV4View.f28480B;
                    oneTimeCodeV4View.getClass();
                    dialogInterface.dismiss();
                }
                if (oneTimeCodeV4View.f28489i != null) {
                    int iIntValue2 = ((Integer) arrayList.get(i7)).intValue();
                    if (iIntValue2 >= 2000) {
                        SmsChannelRsp smsChannelRspE = oneTimeCodeV4View.e(4);
                        oneTimeCodeV4View.f28489i.onSend(4, iIntValue2 - Constants.MAX_URL_LENGTH, smsChannelRspE != null ? smsChannelRspE.sender : null);
                    } else if (iIntValue2 != 3) {
                        oneTimeCodeV4View.h();
                        oneTimeCodeV4View.f28489i.onSend(iIntValue2, 0, null);
                    } else {
                        SmsChannelRsp smsChannelRspE2 = oneTimeCodeV4View.e(3);
                        oneTimeCodeV4View.f28489i.onSend(3, iIntValue2 - Constants.MAX_URL_LENGTH, smsChannelRspE2 != null ? smsChannelRspE2.sender : null);
                    }
                }
                break;
            default:
                if (dialogInterface != null) {
                    int i12 = CoreUssdListActivity.f27608d;
                    dialogInterface.dismiss();
                }
                CoreUssdListActivity coreUssdListActivity = (CoreUssdListActivity) callback;
                String str = coreUssdListActivity.f27610b;
                int iIntValue3 = ((Number) arrayList.get(i7)).intValue();
                if (str != null) {
                    TextUtils.isEmpty(str);
                }
                coreUssdListActivity.showLoadingDialog(true);
                Pa.r0.j(coreUssdListActivity, iIntValue3, coreUssdListActivity.f27610b, 740, coreUssdListActivity);
                break;
        }
    }
}
