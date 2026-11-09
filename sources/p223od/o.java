package p223od;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.google.android.flexbox.FlexboxLayout;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.palmpay.send_money.ui.view.SearchRecipientAccountToBankView;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f40437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f40438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PpFormVertical f40439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PpAmountEditText f40440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FlexboxLayout f40441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SearchRecipientAccountToBankView f40442f;

    public o(LinearLayout linearLayout, TextView textView, PpFormVertical ppFormVertical, PpAmountEditText ppAmountEditText, FlexboxLayout flexboxLayout, SearchRecipientAccountToBankView searchRecipientAccountToBankView) {
        this.f40437a = linearLayout;
        this.f40438b = textView;
        this.f40439c = ppFormVertical;
        this.f40440d = ppAmountEditText;
        this.f40441e = flexboxLayout;
        this.f40442f = searchRecipientAccountToBankView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f40437a;
    }
}
