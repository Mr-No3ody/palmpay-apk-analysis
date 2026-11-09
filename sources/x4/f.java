package x4;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.flexibank.sdk.customview.model.FlexiBankModelSendSms;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f43595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f43596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IconicsImageView f43597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FlexiBankModelSendSms f43598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PpButton f43599e;

    public f(LinearLayout linearLayout, TextView textView, IconicsImageView iconicsImageView, FlexiBankModelSendSms flexiBankModelSendSms, PpButton ppButton) {
        this.f43595a = linearLayout;
        this.f43596b = textView;
        this.f43597c = iconicsImageView;
        this.f43598d = flexiBankModelSendSms;
        this.f43599e = ppButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f43595a;
    }
}
