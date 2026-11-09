package p270rd;

import Pa.i0;
import android.content.Intent;
import android.view.View;
import com.transsnet.palmpay.common.export.dialog.EnableTouchIdDialog;
import com.transsnet.palmpay.send_money.ui.activity.TransferResultActivity;
import kotlin.jvm.internal.Intrinsics;
import p1.c;

/* JADX INFO: loaded from: classes4.dex */
public final class U implements EnableTouchIdDialog.OnEnableTouchIdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferResultActivity f41707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EnableTouchIdDialog f41708b;

    public U(TransferResultActivity transferResultActivity, EnableTouchIdDialog enableTouchIdDialog) {
        this.f41707a = transferResultActivity;
        this.f41708b = enableTouchIdDialog;
    }

    @Override // com.transsnet.palmpay.common.export.dialog.EnableTouchIdDialog.OnEnableTouchIdListener
    public final void onEnableClick(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TransferResultActivity transferResultActivity = this.f41707a;
        Intent intentQ = i0.q(transferResultActivity);
        intentQ.putExtra("_encrypt", true);
        intentQ.putExtra("extra_mode", 1);
        transferResultActivity.getF28604i().f(intentQ, new c(this.f41708b, 26));
    }
}
