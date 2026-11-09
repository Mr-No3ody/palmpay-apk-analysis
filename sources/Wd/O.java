package Wd;

import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;
import com.transsnet.palmpay.teller.ui.activity.JambHomeActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class O implements ModelNumberInputLayout.OnNumberInputListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JambHomeActivity f10729a;

    public O(JambHomeActivity jambHomeActivity) {
        this.f10729a = jambHomeActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout.OnNumberInputListener
    public final void onNumberEditComplete(String str) {
        int i7 = JambHomeActivity.f34222B;
        this.f10729a.u();
    }

    @Override // com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout.OnNumberInputListener
    public final void onNumberEditing(String str) {
        int i7 = JambHomeActivity.f34222B;
        this.f10729a.u();
    }
}
