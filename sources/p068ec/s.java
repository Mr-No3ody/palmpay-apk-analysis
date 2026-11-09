package p068ec;

import Pa.n0;
import Rd.k0;
import android.view.View;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.transsnet.palmpay.airtime.ui.AutoTopupOverlayActivity;
import com.transsnet.palmpay.databundle.ui.activity.DataBundleAutoTopupOverlayActivity;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f36282b;

    public /* synthetic */ s(k0 k0Var, int i7) {
        this.f36281a = i7;
        this.f36282b = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k0 k0Var = this.f36282b;
        switch (this.f36281a) {
            case 0:
                int i7 = DataBundleAutoTopupOverlayActivity.f31768f;
                IconicsCheckBox iconicsCheckBox = (IconicsCheckBox) k0Var.f8376j;
                iconicsCheckBox.setChecked(!iconicsCheckBox.isChecked());
                n0.g().l("DataResultPage_AutoNewPopUp_CheckboxButton");
                break;
            default:
                int i10 = AutoTopupOverlayActivity.f26463f;
                IconicsCheckBox iconicsCheckBox2 = (IconicsCheckBox) k0Var.f8376j;
                iconicsCheckBox2.setChecked(!iconicsCheckBox2.isChecked());
                break;
        }
    }
}
