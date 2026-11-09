package Wd;

import android.widget.ImageView;
import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.ui.activity.EditBeneficiaryActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class J implements ModelNumberInputLayout.OnErrorViewVisibleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EditBeneficiaryActivity f10721a;

    public J(EditBeneficiaryActivity editBeneficiaryActivity) {
        this.f10721a = editBeneficiaryActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout.OnErrorViewVisibleListener
    public final void onErrorViewVisible(boolean z3) {
        int i7 = EditBeneficiaryActivity.f34202M;
        EditBeneficiaryActivity editBeneficiaryActivity = this.f10721a;
        ImageView dividerIv = editBeneficiaryActivity.r().getDividerIv();
        if (dividerIv != null) {
            dividerIv.setVisibility(z3 ? 0 : 8);
        }
        editBeneficiaryActivity.r().setPadding(0, CommonViewExtKt.getDp(12), 0, z3 ? 0 : CommonViewExtKt.getDp(12));
    }
}
