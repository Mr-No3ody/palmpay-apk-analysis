package p223od;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.google.android.flexbox.FlexboxLayout;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.palmpay.send_money.ui.view.SearchRecipientAccountToPalmPayView;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f40443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f40444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PpFormVertical f40445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PpAmountEditText f40446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FlexboxLayout f40447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SearchRecipientAccountToPalmPayView f40448f;

    public p(LinearLayout linearLayout, TextView textView, PpFormVertical ppFormVertical, PpAmountEditText ppAmountEditText, FlexboxLayout flexboxLayout, SearchRecipientAccountToPalmPayView searchRecipientAccountToPalmPayView) {
        this.f40443a = linearLayout;
        this.f40444b = textView;
        this.f40445c = ppFormVertical;
        this.f40446d = ppAmountEditText;
        this.f40447e = flexboxLayout;
        this.f40448f = searchRecipientAccountToPalmPayView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f40443a;
    }
}
