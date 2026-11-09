package Wd;

import Pa.C0525w;
import Pa.i0;
import android.content.Intent;
import android.view.View;
import com.transsnet.palmpay.common.export.dialog.EnableTouchIdDialog;
import com.transsnet.palmpay.teller.ui.activity.BillerTransactionResultActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Wd.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0747v implements EnableTouchIdDialog.OnEnableTouchIdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BillerTransactionResultActivity f10787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EnableTouchIdDialog f10788b;

    public C0747v(BillerTransactionResultActivity billerTransactionResultActivity, EnableTouchIdDialog enableTouchIdDialog) {
        this.f10787a = billerTransactionResultActivity;
        this.f10788b = enableTouchIdDialog;
    }

    @Override // com.transsnet.palmpay.common.export.dialog.EnableTouchIdDialog.OnEnableTouchIdListener
    public final void onEnableClick(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BillerTransactionResultActivity billerTransactionResultActivity = this.f10787a;
        Intent intentQ = i0.q(billerTransactionResultActivity);
        intentQ.putExtra("_encrypt", true);
        intentQ.putExtra("extra_mode", 1);
        billerTransactionResultActivity.getF28604i().f(intentQ, new C0525w(this.f10788b, 11));
    }
}
