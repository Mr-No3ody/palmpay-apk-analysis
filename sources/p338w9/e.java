package p338w9;

import com.transsnet.palmpay.betting.ui.view.ModelBettingRootView;
import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements ModelNumberInputLayout.OnNumberInputListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModelBettingRootView f43344a;

    public e(ModelBettingRootView modelBettingRootView) {
        this.f43344a = modelBettingRootView;
    }

    @Override // com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout.OnNumberInputListener
    public final void onNumberEditing(String str) {
        this.f43344a.f();
    }

    @Override // com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout.OnNumberInputListener
    public final void onNumberEditComplete(String str) {
    }
}
