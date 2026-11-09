package p323v9;

import com.transsnet.palmpay.betting.ui.fragment.BettingWithdrawHomeFragment;
import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements ModelNumberInputLayout.OnNumberInputListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BettingWithdrawHomeFragment f43132a;

    public g(BettingWithdrawHomeFragment bettingWithdrawHomeFragment) {
        this.f43132a = bettingWithdrawHomeFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout.OnNumberInputListener
    public final void onNumberEditComplete(String str) {
        this.f43132a.C();
    }

    @Override // com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout.OnNumberInputListener
    public final void onNumberEditing(String str) {
        this.f43132a.C();
    }
}
