package p189me;

import android.content.DialogInterface;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.ui.activity.message.NotificationListV2Activity;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f39649a;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = NotificationListV2Activity.f34749i;
        if (this.f39649a) {
            d.y("NotificationSettings", "sceneCode", 5);
        }
    }
}
