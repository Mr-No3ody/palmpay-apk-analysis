package Za;

import Pa.i0;
import W8.o;
import android.os.Handler;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.custom_view.dialog.LoadingDialog;
import com.transsnet.palmpay.custom_view.dialog.n;
import kotlin.jvm.internal.Intrinsics;
import p116hb.e;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f11600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f11602c = new o(this, 6);

    static {
        new a(null);
    }

    public static void l(b bVar) {
        bVar.getClass();
        try {
            LoadingDialog loadingDialog = bVar.mLoadingDialog;
            if (loadingDialog == null || !loadingDialog.isShowing()) {
                return;
            }
            bVar.mLoadingDialog.dismiss();
            bVar.mLoadingDialog.setOnCancelListener(null);
            bVar.mLoadingDialog = null;
        } catch (Exception unused) {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    /* JADX INFO: renamed from: showLoadingDialog */
    public final void lambda$checkAndShowLoadingDialog$1(boolean z3, boolean z8, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (i0.W(this)) {
            o oVar = this.f11602c;
            if (!z3) {
                Handler uIHandler = getUIHandler();
                Intrinsics.checkNotNullExpressionValue(uIHandler, "getUIHandler(...)");
                uIHandler.postDelayed(oVar, 100L);
                return;
            }
            getUIHandler().removeCallbacks(oVar);
            LoadingDialog loadingDialog = this.mLoadingDialog;
            if (loadingDialog != null && loadingDialog.isShowing()) {
                if ((this.f11600a == null || Boolean.valueOf(z8).equals(this.f11600a)) && Intrinsics.c(message, this.f11601b)) {
                    return;
                }
                this.mLoadingDialog.dismiss();
                this.mLoadingDialog = null;
            }
            Intrinsics.checkNotNullParameter(this, "context");
            n nVar = new n(this);
            nVar.f31290d = Integer.valueOf(e.cs_cash_loading);
            LoadingDialog loadingDialogA = nVar.a();
            Intrinsics.checkNotNullExpressionValue(loadingDialogA, "buildFlexiLoadingDialog(...)");
            loadingDialogA.show();
            this.mLoadingDialog = loadingDialogA;
            loadingDialogA.setCanceledOnTouchOutside(false);
            LoadingDialog loadingDialog2 = this.mLoadingDialog;
            loadingDialog2.isCancelable = z8;
            loadingDialog2.setOnCancelListener(this);
            this.f11600a = Boolean.valueOf(z8);
            this.f11601b = message;
        }
    }
}
