package Za;

import Pa.i0;
import W8.o;
import android.os.Handler;
import com.transsnet.palmpay.core.base.h;
import com.transsnet.palmpay.custom_view.dialog.LoadingDialog;
import com.transsnet.palmpay.custom_view.dialog.n;
import kotlin.jvm.internal.Intrinsics;
import p116hb.e;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f11603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f11605c = new o(this, 7);

    static {
        new c(null);
    }

    public static void m(d dVar) {
        dVar.getClass();
        try {
            LoadingDialog loadingDialog = dVar.mLoadingDialog;
            if (loadingDialog == null || !loadingDialog.isShowing()) {
                return;
            }
            dVar.mLoadingDialog.dismiss();
            dVar.mLoadingDialog.setOnCancelListener(null);
            dVar.mLoadingDialog = null;
        } catch (Exception unused) {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    /* JADX INFO: renamed from: showLoadingDialog */
    public final void lambda$checkAndShowLoadingDialog$1(boolean z3, boolean z8, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (i0.W(this)) {
            o oVar = this.f11605c;
            if (!z3) {
                Handler uIHandler = getUIHandler();
                Intrinsics.checkNotNullExpressionValue(uIHandler, "getUIHandler(...)");
                uIHandler.postDelayed(oVar, 100L);
                return;
            }
            getUIHandler().removeCallbacks(oVar);
            LoadingDialog loadingDialog = this.mLoadingDialog;
            if (loadingDialog != null && loadingDialog.isShowing()) {
                if ((this.f11603a == null || Boolean.valueOf(z8).equals(this.f11603a)) && Intrinsics.c(message, this.f11604b)) {
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
            this.f11603a = Boolean.valueOf(z8);
            this.f11604b = message;
        }
    }
}
