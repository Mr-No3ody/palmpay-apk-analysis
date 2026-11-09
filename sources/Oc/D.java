package Oc;

import android.text.Editable;
import android.widget.TextView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.custom_view.SimpleTextWatcher;
import com.transsnet.palmpay.managemoney.ui.dialog.WhyTurnOffSaveDialogFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class D implements SimpleTextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextView f6747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WhyTurnOffSaveDialogFragment f6748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PpButton f6749c;

    public D(TextView textView, WhyTurnOffSaveDialogFragment whyTurnOffSaveDialogFragment, PpButton ppButton) {
        this.f6747a = textView;
        this.f6748b = whyTurnOffSaveDialogFragment;
        this.f6749c = ppButton;
    }

    @Override // com.transsnet.palmpay.custom_view.SimpleTextWatcher, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        Intrinsics.e(charSequence);
        int length = charSequence.length();
        this.f6747a.setText(androidx.camera.video.u.g(length, "/100"));
        WhyTurnOffSaveDialogFragment whyTurnOffSaveDialogFragment = this.f6748b;
        whyTurnOffSaveDialogFragment.f32332Q = 4;
        String string = charSequence.toString();
        Intrinsics.checkNotNullParameter(string, "<set-?>");
        whyTurnOffSaveDialogFragment.f32333X = string;
        this.f6749c.setEnabled(length > 0);
    }

    @Override // com.transsnet.palmpay.custom_view.SimpleTextWatcher, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // com.transsnet.palmpay.custom_view.SimpleTextWatcher, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
