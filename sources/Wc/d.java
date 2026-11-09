package Wc;

import android.os.Handler;
import android.os.Looper;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.PayByNoticeDialog;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10672a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f10673b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PayByNoticeDialog f10674c;

    public d(PayByNoticeDialog payByNoticeDialog) {
        this.f10674c = payByNoticeDialog;
    }
}
