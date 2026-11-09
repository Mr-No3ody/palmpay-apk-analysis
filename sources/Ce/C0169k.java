package Ce;

import android.app.Dialog;
import androidx.core.view.KeyEventDispatcher$Component;
import com.transsnet.adsdk.widgets.interfaces.AdShowCallback;
import com.transsnet.palmpay.core.callback.HomeAcCallback;
import com.transsnet.palmpay.ui.fragment.HomeFinanceFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ce.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0169k implements AdShowCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HomeFinanceFragment f1494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.E f1495b;

    public C0169k(HomeFinanceFragment homeFinanceFragment, androidx.fragment.app.E e10) {
        this.f1494a = homeFinanceFragment;
        this.f1495b = e10;
    }

    @Override // com.transsnet.adsdk.widgets.interfaces.AdShowCallback
    public final void showCallback(Dialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        HomeFinanceFragment homeFinanceFragment = this.f1494a;
        if (homeFinanceFragment.f35074C) {
            return;
        }
        homeFinanceFragment.f35074C = true;
        F6.d.h(homeFinanceFragment.f27317a, 5, "showAdDialog >>> shown");
        KeyEventDispatcher$Component keyEventDispatcher$Component = this.f1495b;
        Intrinsics.f(keyEventDispatcher$Component, "null cannot be cast to non-null type com.transsnet.palmpay.core.callback.HomeAcCallback");
        ((HomeAcCallback) keyEventDispatcher$Component).showDialog(dialog, 93);
        dialog.setOnDismissListener(new DialogInterfaceOnDismissListenerC0168j(0));
    }
}
