package Yd;

import android.view.View;
import android.widget.EditText;
import com.transsnet.palmpay.teller.ui.dialog.PickBillerDialog;
import com.transsnet.palmpay.teller.ui.dialog.PickBillerNewDialog;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f11346b;

    public /* synthetic */ m(EditText editText, int i7) {
        this.f11345a = i7;
        this.f11346b = editText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f11345a) {
            case 0:
                PickBillerDialog.initViews$lambda$4(this.f11346b, view);
                break;
            default:
                PickBillerNewDialog.initViews$lambda$4(this.f11346b, view);
                break;
        }
    }
}
