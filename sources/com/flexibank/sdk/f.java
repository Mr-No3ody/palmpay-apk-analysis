package com.flexibank.sdk;

import androidx.activity.result.ActivityResultCallback;
import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements ActivityResultCallback, FunctionAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlexiBankSdk$CashierLaunchSession f22302a;

    public f(FlexiBankSdk$CashierLaunchSession flexiBankSdk$CashierLaunchSession) {
        this.f22302a = flexiBankSdk$CashierLaunchSession;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ActivityResultCallback) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.c(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return new kotlin.jvm.internal.m(1, this.f22302a, FlexiBankSdk$CashierLaunchSession.class, "onCashierResult", "onCashierResult(Lcom/flexibank/sdk/api/FlexiBankCashierResult;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) throws JSONException {
        J3.e p3 = (J3.e) obj;
        Intrinsics.checkNotNullParameter(p3, "p0");
        FlexiBankSdk$CashierLaunchSession flexiBankSdk$CashierLaunchSession = this.f22302a;
        if (flexiBankSdk$CashierLaunchSession.f21928d) {
            return;
        }
        flexiBankSdk$CashierLaunchSession.a();
        flexiBankSdk$CashierLaunchSession.f21926b.onActivityResult(p3);
    }
}
