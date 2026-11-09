package p310ub;

import Ya.g;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcFeedbackActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class M implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OcFeedbackActivity f42773b;

    public /* synthetic */ M(OcFeedbackActivity ocFeedbackActivity, int i7) {
        this.f42772a = i7;
        this.f42773b = ocFeedbackActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        OcFeedbackActivity ocFeedbackActivity = this.f42773b;
        switch (this.f42772a) {
            case 0:
                OcFeedbackActivity.m(ocFeedbackActivity);
                break;
            default:
                int i7 = OcFeedbackActivity.f29425H;
                Object value = ocFeedbackActivity.f29432g.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((TextView) value).setText(ocFeedbackActivity.getString(g.cs_max_letters, Integer.valueOf(String.valueOf(editable).length())));
                OcFeedbackActivity.m(ocFeedbackActivity);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f42772a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f42772a;
    }

    private final void a(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void b(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void c(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void d(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
