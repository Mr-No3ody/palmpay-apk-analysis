package p310ub;

import Ya.d;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcContactActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class G implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OcContactActivity f42757b;

    public /* synthetic */ G(OcContactActivity ocContactActivity, int i7) {
        this.f42756a = i7;
        this.f42757b = ocContactActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        OcContactActivity ocContactActivity = this.f42757b;
        switch (this.f42756a) {
            case 0:
                int i7 = OcContactActivity.f29378l1;
                ocContactActivity.K().setVisibility(8);
                ocContactActivity.I().setBackgroundResource(d.cs_oc_contact_et_bg);
                if (!TextUtils.isEmpty(editable)) {
                    ocContactActivity.B().setVisibility(0);
                } else {
                    ocContactActivity.B().setVisibility(8);
                }
                break;
            case 1:
                int i10 = OcContactActivity.f29378l1;
                ocContactActivity.U().setVisibility(8);
                ocContactActivity.O().setBackgroundResource(d.cs_oc_contact_et_bg);
                if (!TextUtils.isEmpty(editable)) {
                    ocContactActivity.C().setVisibility(0);
                } else {
                    ocContactActivity.C().setVisibility(8);
                }
                break;
            case 2:
                int i11 = OcContactActivity.f29378l1;
                ocContactActivity.T().setVisibility(8);
                ocContactActivity.R().setBackgroundResource(d.cs_oc_contact_et_bg);
                if (!TextUtils.isEmpty(editable)) {
                    ocContactActivity.D().setVisibility(0);
                } else {
                    ocContactActivity.D().setVisibility(8);
                }
                break;
            case 3:
                int i12 = OcContactActivity.f29378l1;
                ocContactActivity.X().setVisibility(8);
                if (!TextUtils.isEmpty(editable)) {
                    ocContactActivity.E().setVisibility(0);
                } else {
                    ocContactActivity.E().setVisibility(8);
                }
                break;
            default:
                int i13 = OcContactActivity.f29378l1;
                ocContactActivity.L().setVisibility(8);
                ocContactActivity.F().setBackgroundResource(d.cs_oc_contact_et_bg);
                if (!TextUtils.isEmpty(editable)) {
                    ocContactActivity.A().setVisibility(0);
                } else {
                    ocContactActivity.A().setVisibility(8);
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f42756a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f42756a;
    }

    private final void a(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void b(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void c(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void d(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void e(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void f(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void g(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void h(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void i(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void j(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
