package Wd;

import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;
import com.transsnet.palmpay.teller.ui.activity.EditBeneficiaryActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class K implements ModelNumberInputLayout.OnNumberInputListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EditBeneficiaryActivity f10722a;

    public K(EditBeneficiaryActivity editBeneficiaryActivity) {
        this.f10722a = editBeneficiaryActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout.OnNumberInputListener
    public final void onNumberEditComplete(String str) {
        int i7 = EditBeneficiaryActivity.f34202M;
        this.f10722a.x();
    }

    @Override // com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout.OnNumberInputListener
    public final void onNumberEditing(String str) {
        int i7 = EditBeneficiaryActivity.f34202M;
        this.f10722a.x();
    }
}
