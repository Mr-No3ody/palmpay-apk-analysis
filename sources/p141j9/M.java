package p141j9;

import Ab.r;
import Pa.i0;
import android.content.Intent;
import android.view.View;
import com.transsnet.palmpay.airtime.ui.TopupResultActivityV2;
import com.transsnet.palmpay.common.export.dialog.EnableTouchIdDialog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class M implements EnableTouchIdDialog.OnEnableTouchIdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TopupResultActivityV2 f38382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EnableTouchIdDialog f38383b;

    public M(TopupResultActivityV2 topupResultActivityV2, EnableTouchIdDialog enableTouchIdDialog) {
        this.f38382a = topupResultActivityV2;
        this.f38383b = enableTouchIdDialog;
    }

    @Override // com.transsnet.palmpay.common.export.dialog.EnableTouchIdDialog.OnEnableTouchIdListener
    public final void onEnableClick(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TopupResultActivityV2 topupResultActivityV2 = this.f38382a;
        Intent intentQ = i0.q(topupResultActivityV2);
        intentQ.putExtra("_encrypt", true);
        intentQ.putExtra("extra_mode", 1);
        topupResultActivityV2.getF28604i().f(intentQ, new r(this.f38383b, 19));
    }
}
