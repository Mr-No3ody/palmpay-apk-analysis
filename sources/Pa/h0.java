package Pa;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.ui.activity.TransactionHistoryDownloadActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h0 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f7092c;

    public /* synthetic */ h0(Context context, int i7, boolean z3) {
        this.f7090a = i7;
        this.f7091b = z3;
        this.f7092c = context;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Context context = this.f7092c;
        boolean z3 = this.f7091b;
        switch (this.f7090a) {
            case 0:
                if (z3 && (context instanceof Activity)) {
                    ((Activity) context).finish();
                    break;
                }
                break;
            default:
                TransactionHistoryDownloadActivity.a aVar = TransactionHistoryDownloadActivity.f34576g;
                n0.g().m("TranscationHistoryDownload", "TXNHistoryDL_OkIknowIt", "");
                if (z3) {
                    ARouter.getInstance().build("/main/trans_history").withFlags(67108864).navigation();
                    ((TransactionHistoryDownloadActivity) context).finish();
                }
                break;
        }
    }
}
