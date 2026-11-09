package Wd;

import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;
import com.transsnet.palmpay.teller.ui.activity.WaecHomeActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class X implements ModelNumberInputLayout.OnNumberInputListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WaecHomeActivity f10743a;

    public X(WaecHomeActivity waecHomeActivity) {
        this.f10743a = waecHomeActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout.OnNumberInputListener
    public final void onNumberEditComplete(String str) {
        int i7 = WaecHomeActivity.f34237Q;
        this.f10743a.x();
    }

    @Override // com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout.OnNumberInputListener
    public final void onNumberEditing(String str) {
        int i7 = WaecHomeActivity.f34237Q;
        this.f10743a.x();
    }
}
