package com.transsnet.palmpay.account.ui.dialog;

import Bc.C0107d;
import F8.c;
import F8.d;
import F8.e;
import F8.h;
import I8.f;
import Pa.r0;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.V;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.uimanager.ViewProps;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.credit.businessLoan.rnbridge.LocationServiceBridge;
import com.transsnet.palmpay.custom_view.dialog.b;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p015ag.o;
import p059e1.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\tJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0012\u0010\tJ\u0019\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/transsnet/palmpay/account/ui/dialog/AutoLogoutOptionDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "bindOptionTexts", "()V", "applyDialogCardBackground", "", "type", "setChooseOperate", "(I)V", "setChooseStyle", "options", "saveAutoLogoutOptions", "initViews", "Landroid/view/View;", "v", ViewProps.ON_CLICK, "(Landroid/view/View;)V", LocationServiceBridge.ACTION_CHECK_STATUS, "I", "LI8/f;", "binding", "LI8/f;", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AutoLogoutOptionDialog extends b implements View.OnClickListener {

    @Nullable
    private f binding;
    private int checkStatus;

    public AutoLogoutOptionDialog(@Nullable Context context) {
        super(context, e.ac_dialog_auto_logout_options);
    }

    private final void applyDialogCardBackground() {
        C0107d c0107d;
        ConstraintLayout constraintLayout;
        C0107d c0107d2;
        ConstraintLayout constraintLayout2;
        C0107d c0107d3;
        ConstraintLayout constraintLayout3;
        int i7 = c.ac_selector_auto_logout_option_dialog;
        f fVar = this.binding;
        if (fVar != null && (c0107d3 = fVar.f4070c) != null && (constraintLayout3 = (ConstraintLayout) c0107d3.f680b) != null) {
            constraintLayout3.setBackgroundResource(i7);
        }
        f fVar2 = this.binding;
        if (fVar2 != null && (c0107d2 = fVar2.f4072e) != null && (constraintLayout2 = (ConstraintLayout) c0107d2.f680b) != null) {
            constraintLayout2.setBackgroundResource(i7);
        }
        f fVar3 = this.binding;
        if (fVar3 == null || (c0107d = fVar3.f4071d) == null || (constraintLayout = (ConstraintLayout) c0107d.f680b) == null) {
            return;
        }
        constraintLayout.setBackgroundResource(i7);
    }

    private final void bindOptionTexts() {
        f fVar = this.binding;
        if (fVar != null) {
            C0107d c0107d = fVar.f4070c;
            int i7 = h.ac_password_free_login;
            int i10 = h.ac_password_free_login_desc;
            ((TextView) c0107d.f683e).setText(i7);
            ((TextView) c0107d.f682d).setText(i10);
        }
        f fVar2 = this.binding;
        if (fVar2 != null) {
            C0107d c0107d2 = fVar2.f4072e;
            int i11 = h.ac_no_password_login_5mins;
            int i12 = h.ac_no_password_login_5mins_desc;
            ((TextView) c0107d2.f683e).setText(i11);
            ((TextView) c0107d2.f682d).setText(i12);
        }
        f fVar3 = this.binding;
        if (fVar3 != null) {
            C0107d c0107d3 = fVar3.f4071d;
            int i13 = h.ac_password_on_each_login;
            int i14 = h.ac_password_on_each_login_desc;
            ((TextView) c0107d3.f683e).setText(i13);
            ((TextView) c0107d3.f682d).setText(i14);
        }
    }

    private final void saveAutoLogoutOptions(int options) {
        V v3 = V.f10828a;
        p042cg.f fVar = I.f10809a;
        AbstractC0780y.m(v3, o.f11960a, null, new Q8.b(options, this, null), 2);
    }

    private final void setChooseOperate(int type) {
        PpButton ppButton;
        if (this.checkStatus != type) {
            this.checkStatus = type;
            setChooseStyle();
            f fVar = this.binding;
            if (fVar == null || (ppButton = fVar.f4074g) == null) {
                return;
            }
            ppButton.setEnabled(this.checkStatus != 0);
        }
    }

    private final void setChooseStyle() {
        f fVar = this.binding;
        if (fVar != null) {
            C0107d c0107d = fVar.f4070c;
            boolean z3 = this.checkStatus == 3;
            ((ConstraintLayout) c0107d.f680b).setSelected(z3);
            ((IconicsCheckBox) c0107d.f681c).setChecked(z3);
        }
        f fVar2 = this.binding;
        if (fVar2 != null) {
            C0107d c0107d2 = fVar2.f4071d;
            boolean z8 = this.checkStatus == 2;
            ((ConstraintLayout) c0107d2.f680b).setSelected(z8);
            ((IconicsCheckBox) c0107d2.f681c).setChecked(z8);
        }
        f fVar3 = this.binding;
        if (fVar3 != null) {
            C0107d c0107d3 = fVar3.f4072e;
            boolean z10 = this.checkStatus == 1;
            ((ConstraintLayout) c0107d3.f680b).setSelected(z10);
            ((IconicsCheckBox) c0107d3.f681c).setChecked(z10);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        View viewM;
        View viewFindViewById = findViewById(d.rootView);
        int i7 = d.iv;
        if (((ImageView) a.m(i7, viewFindViewById)) != null) {
            i7 = d.ivClose;
            IconicsImageView iconicsImageView = (IconicsImageView) a.m(i7, viewFindViewById);
            if (iconicsImageView != null && (viewM = a.m((i7 = d.llClose), viewFindViewById)) != null) {
                C0107d c0107dB = C0107d.b(viewM);
                i7 = d.llEvery;
                View viewM2 = a.m(i7, viewFindViewById);
                if (viewM2 != null) {
                    C0107d c0107dB2 = C0107d.b(viewM2);
                    i7 = d.llHalf;
                    View viewM3 = a.m(i7, viewFindViewById);
                    if (viewM3 != null) {
                        C0107d c0107dB3 = C0107d.b(viewM3);
                        FrameLayout frameLayout = (FrameLayout) viewFindViewById;
                        i7 = d.tvConfirm;
                        PpButton ppButton = (PpButton) a.m(i7, viewFindViewById);
                        if (ppButton != null) {
                            i7 = d.tvProtectHint;
                            TextView textView = (TextView) a.m(i7, viewFindViewById);
                            if (textView != null) {
                                i7 = d.tvTitle;
                                TextView textView2 = (TextView) a.m(i7, viewFindViewById);
                                if (textView2 != null) {
                                    this.binding = new f(frameLayout, iconicsImageView, c0107dB, c0107dB2, c0107dB3, frameLayout, ppButton, textView, textView2);
                                    showAtBottom(getWindow());
                                    bindOptionTexts();
                                    applyDialogCardBackground();
                                    f fVar = this.binding;
                                    p220oa.h.q(this, fVar != null ? fVar.f4069b : null, fVar != null ? fVar.f4074g : null, fVar != null ? (ConstraintLayout) fVar.f4070c.f680b : null, fVar != null ? (ConstraintLayout) fVar.f4071d.f680b : null, fVar != null ? (ConstraintLayout) fVar.f4072e.f680b : null);
                                    setChooseStyle();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v3) {
        Integer numValueOf = v3 != null ? Integer.valueOf(v3.getId()) : null;
        int i7 = d.ivClose;
        if (numValueOf != null && numValueOf.intValue() == i7) {
            dismiss();
            return;
        }
        int i10 = d.tvConfirm;
        if (numValueOf != null && numValueOf.intValue() == i10) {
            if (r0.U0()) {
                return;
            }
            saveAutoLogoutOptions(this.checkStatus);
            return;
        }
        int i11 = d.llClose;
        if (numValueOf != null && numValueOf.intValue() == i11) {
            setChooseOperate(3);
            return;
        }
        int i12 = d.llEvery;
        if (numValueOf != null && numValueOf.intValue() == i12) {
            setChooseOperate(2);
            return;
        }
        int i13 = d.llHalf;
        if (numValueOf != null && numValueOf.intValue() == i13) {
            setChooseOperate(1);
        }
    }
}
