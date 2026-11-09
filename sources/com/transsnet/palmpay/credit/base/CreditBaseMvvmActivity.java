package com.transsnet.palmpay.credit.base;

import Pa.i0;
import W8.o;
import android.os.Handler;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.custom_view.dialog.LoadingDialog;
import com.transsnet.palmpay.custom_view.dialog.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p116hb.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/credit/base/CreditBaseMvvmActivity;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "VM", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "<init>", "()V", "a", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCreditBaseMvvmActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreditBaseMvvmActivity.kt\ncom/transsnet/palmpay/credit/base/CreditBaseMvvmActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
public abstract class CreditBaseMvvmActivity<VM extends BaseViewModel> extends BaseMvvmActivity<VM> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f28621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f28622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f28623e = new o(this, 8);

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

    public static void m(CreditBaseMvvmActivity creditBaseMvvmActivity) {
        try {
            LoadingDialog loadingDialog = creditBaseMvvmActivity.mLoadingDialog;
            if (loadingDialog == null || !loadingDialog.isShowing()) {
                return;
            }
            creditBaseMvvmActivity.mLoadingDialog.dismiss();
            creditBaseMvvmActivity.mLoadingDialog.setOnCancelListener(null);
            creditBaseMvvmActivity.mLoadingDialog = null;
        } catch (Exception unused) {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    /* JADX INFO: renamed from: showLoadingDialog */
    public final void lambda$checkAndShowLoadingDialog$1(boolean z3, boolean z8, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (i0.W(this)) {
            o oVar = this.f28623e;
            if (!z3) {
                Handler uIHandler = getUIHandler();
                Intrinsics.checkNotNullExpressionValue(uIHandler, "getUIHandler(...)");
                uIHandler.postDelayed(oVar, 100L);
                return;
            }
            getUIHandler().removeCallbacks(oVar);
            LoadingDialog loadingDialog = this.mLoadingDialog;
            if (loadingDialog != null && loadingDialog.isShowing()) {
                if ((this.f28621c == null || Boolean.valueOf(z8).equals(this.f28621c)) && Intrinsics.c(message, this.f28622d)) {
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
            this.f28621c = Boolean.valueOf(z8);
            this.f28622d = message;
        }
    }
}
