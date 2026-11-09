package C9;

import Ua.E0;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.preference.CheckBoxPreference;
import androidx.preference.SwitchPreference;
import androidx.preference.SwitchPreferenceCompat;
import com.transsnet.palmpay.cash_in.ui.activity.ConfirmAndPayWithdrawOrderActivity;
import com.transsnet.palmpay.core.viewmodel.TimeRemindViewHandler$CallBack1;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferCreateActivity;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferCreateV2Activity;
import com.transsnet.palmpay.ui.activity.qr.PayMoneyToPalmPayBusinessPreviewActivity;
import com.transsnet.palmpay.ui.activity.qr.PayMoneyToPartnerPreviewActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: C9.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0145l implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1316b;

    public /* synthetic */ C0145l(Object obj, int i7) {
        this.f1315a = i7;
        this.f1316b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton buttonView, boolean z3) {
        Object obj = this.f1316b;
        switch (this.f1315a) {
            case 0:
                int i7 = ConfirmAndPayWithdrawOrderActivity.f26830Y;
                ((ConfirmAndPayWithdrawOrderActivity) obj).o();
                break;
            case 1:
                Intrinsics.checkNotNullParameter(buttonView, "buttonView");
                E0 e10 = (E0) obj;
                if (z3) {
                    LinearLayout linearLayout = (LinearLayout) e10.f9312b.getValue();
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                    }
                } else {
                    LinearLayout linearLayout2 = (LinearLayout) e10.f9312b.getValue();
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(8);
                    }
                }
                TimeRemindViewHandler$CallBack1 timeRemindViewHandler$CallBack1 = e10.f9330u;
                if (timeRemindViewHandler$CallBack1 != null) {
                    timeRemindViewHandler$CallBack1.isChecked(z3);
                }
                e10.c();
                break;
            case 2:
                CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
                checkBoxPreference.getClass();
                checkBoxPreference.x(z3);
                break;
            case 3:
                SwitchPreference switchPreference = (SwitchPreference) obj;
                switchPreference.getClass();
                switchPreference.x(z3);
                break;
            case 4:
                SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj;
                switchPreferenceCompat.getClass();
                switchPreferenceCompat.x(z3);
                break;
            case 5:
                PayMoneyToPalmPayBusinessPreviewActivity payMoneyToPalmPayBusinessPreviewActivity = (PayMoneyToPalmPayBusinessPreviewActivity) obj;
                if (z3) {
                    int i10 = PayMoneyToPalmPayBusinessPreviewActivity.f34816C0;
                    payMoneyToPalmPayBusinessPreviewActivity.f27790e = null;
                    payMoneyToPalmPayBusinessPreviewActivity.f34829w0.setCoupon(null);
                    payMoneyToPalmPayBusinessPreviewActivity.f34829w0.d();
                } else {
                    payMoneyToPalmPayBusinessPreviewActivity.f34829w0.d();
                }
                int i11 = PayMoneyToPalmPayBusinessPreviewActivity.f34816C0;
                payMoneyToPalmPayBusinessPreviewActivity.S();
                break;
            case 6:
                PayMoneyToPartnerPreviewActivity payMoneyToPartnerPreviewActivity = (PayMoneyToPartnerPreviewActivity) obj;
                if (z3) {
                    int i12 = PayMoneyToPartnerPreviewActivity.f34852B0;
                    payMoneyToPartnerPreviewActivity.f27790e = null;
                    payMoneyToPartnerPreviewActivity.f34864w0.setCoupon(null);
                    payMoneyToPartnerPreviewActivity.f34864w0.d();
                } else {
                    payMoneyToPartnerPreviewActivity.f34864w0.d();
                }
                int i13 = PayMoneyToPartnerPreviewActivity.f34852B0;
                payMoneyToPartnerPreviewActivity.S();
                break;
            case 7:
                Intrinsics.checkNotNullParameter(buttonView, "<unused var>");
                ScheduleTransferCreateActivity.m((ScheduleTransferCreateActivity) obj);
                break;
            default:
                Intrinsics.checkNotNullParameter(buttonView, "<unused var>");
                int i14 = ScheduleTransferCreateV2Activity.f33373C0;
                ((ScheduleTransferCreateV2Activity) obj).z();
                break;
        }
    }
}
