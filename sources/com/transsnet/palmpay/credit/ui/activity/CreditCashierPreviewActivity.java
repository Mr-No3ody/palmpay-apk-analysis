package com.transsnet.palmpay.credit.ui.activity;

import Pa.i0;
import android.os.Handler;
import com.transsnet.adsdk.widgets.banner.bannerview.b;
import com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity;
import com.transsnet.palmpay.custom_view.dialog.LoadingDialog;
import com.transsnet.palmpay.custom_view.dialog.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p116hb.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/CreditCashierPreviewActivity;", "Lcom/transsnet/palmpay/core/ui/activity/CoreCashierPreviewActivity;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCreditCashierPreviewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreditCashierPreviewActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/CreditCashierPreviewActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1#2:73\n*E\n"})
public abstract class CreditCashierPreviewActivity extends CoreCashierPreviewActivity {
    public Boolean Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public String f28654a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final b f28655b1 = new b(this, 22);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public static void q0(CreditCashierPreviewActivity creditCashierPreviewActivity) {
        try {
            LoadingDialog loadingDialog = creditCashierPreviewActivity.mLoadingDialog;
            if (loadingDialog == null || !loadingDialog.isShowing()) {
                return;
            }
            creditCashierPreviewActivity.mLoadingDialog.dismiss();
            creditCashierPreviewActivity.mLoadingDialog.setOnCancelListener(null);
            creditCashierPreviewActivity.mLoadingDialog = null;
        } catch (Exception unused) {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    /* JADX INFO: renamed from: showLoadingDialog */
    public final void lambda$checkAndShowLoadingDialog$1(boolean z3, boolean z8, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (i0.W(this)) {
            b bVar = this.f28655b1;
            if (!z3) {
                Handler uIHandler = getUIHandler();
                Intrinsics.checkNotNullExpressionValue(uIHandler, "getUIHandler(...)");
                uIHandler.postDelayed(bVar, 100L);
                return;
            }
            getUIHandler().removeCallbacks(bVar);
            LoadingDialog loadingDialog = this.mLoadingDialog;
            if (loadingDialog != null && loadingDialog.isShowing()) {
                if ((this.Z0 == null || Boolean.valueOf(z8).equals(this.Z0)) && Intrinsics.c(message, this.f28654a1)) {
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
            this.Z0 = Boolean.valueOf(z8);
            this.f28654a1 = message;
        }
    }
}
