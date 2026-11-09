package p270rd;

import android.view.View;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.send_money.ui.activity.TransferResultActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class T implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f41705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferResultActivity f41706b;

    public T(boolean z3, TransferResultActivity transferResultActivity) {
        this.f41705a = z3;
        this.f41706b = transferResultActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f41705a) {
            d.x(null, "NotificationSettings");
        } else {
            Oe.d.h(this.f41706b);
        }
    }
}
