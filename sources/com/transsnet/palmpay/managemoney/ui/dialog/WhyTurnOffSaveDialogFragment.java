package com.transsnet.palmpay.managemoney.ui.dialog;

import C9.C0138e;
import Ce.S;
import Ed.ViewOnTouchListenerC0223c;
import Jc.c;
import Jc.d;
import La.i;
import M3.f;
import Nc.x;
import Oc.A;
import Oc.C;
import Oc.C0500c;
import Oc.D;
import Oc.j;
import Pa.AbstractC0511h;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.horcrux.svg.d0;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.base.BaseMvvmDialogFragment;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.managemoney.ui.dialog.WhyTurnOffSaveDialogFragment;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import com.transsnet.palmpay.util.KeyboardUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.collections.z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p025ba.l;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/dialog/WhyTurnOffSaveDialogFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmDialogFragment;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/CashBoxViewModel;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWhyTurnOffSaveDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhyTurnOffSaveDialogFragment.kt\ncom/transsnet/palmpay/managemoney/ui/dialog/WhyTurnOffSaveDialogFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,255:1\n115#2,8:256\n145#2:264\n1878#3,3:265\n*S KotlinDebug\n*F\n+ 1 WhyTurnOffSaveDialogFragment.kt\ncom/transsnet/palmpay/managemoney/ui/dialog/WhyTurnOffSaveDialogFragment\n*L\n201#1:256,8\n201#1:264\n223#1:265,3\n*E\n"})
public final class WhyTurnOffSaveDialogFragment extends BaseMvvmDialogFragment<CashBoxViewModel> {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final a f32329Z = new a(null);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f32330L = C2131j.b(new f(this, 10));

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public List f32331M = z.f38935a;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f32332Q = -1;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public String f32333X = "";

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Function0 f32334Y = new i(26);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ WhyTurnOffSaveDialogFragment newInstance$default(a aVar, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = "";
            }
            return aVar.newInstance(str);
        }

        @NotNull
        public final WhyTurnOffSaveDialogFragment newInstance(@NotNull String source) {
            Intrinsics.checkNotNullParameter(source, "source");
            WhyTurnOffSaveDialogFragment whyTurnOffSaveDialogFragment = new WhyTurnOffSaveDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("source", source);
            whyTurnOffSaveDialogFragment.setArguments(bundle);
            return whyTurnOffSaveDialogFragment;
        }

        private a() {
        }
    }

    public static final void k(EditText editText, TextView textView, PpButton ppButton) {
        editText.clearFocus();
        editText.setText("");
        textView.setText("0/100");
        KeyboardUtils.hideSoftInput(editText);
        ppButton.setEnabled(true);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(O6.f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = d0.f(LayoutInflater.from(getContext()), d.mm_why_turn_off_save_dialog_fragment, null, "inflate(...)", baseDialog);
        this.f31244j = true;
        this.f31245o = false;
        this.f31246p = true;
        this.f31243i = l.dialog_bottom_in_out;
        this.f31242g = 80;
        View viewFindViewById = viewF.findViewById(c.ivClose);
        View viewFindViewById2 = viewF.findViewById(c.layoutRoot);
        Intrinsics.f(viewFindViewById2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById2;
        View viewFindViewById3 = viewF.findViewById(c.rtvAgree);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        final PpButton ppButton = (PpButton) viewFindViewById3;
        ppButton.setEnabled(false);
        View viewFindViewById4 = viewF.findViewById(c.ivFirstCheck);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        IconicsImageView iconicsImageView = (IconicsImageView) viewFindViewById4;
        View viewFindViewById5 = viewF.findViewById(c.ivSecCheck);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        IconicsImageView iconicsImageView2 = (IconicsImageView) viewFindViewById5;
        View viewFindViewById6 = viewF.findViewById(c.ivThirdCheck);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        IconicsImageView iconicsImageView3 = (IconicsImageView) viewFindViewById6;
        this.f32331M = C1850q.h(iconicsImageView, iconicsImageView2, iconicsImageView3);
        View viewFindViewById7 = viewF.findViewById(c.editTextOtherReasons);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        final EditText editText = (EditText) viewFindViewById7;
        editText.clearFocus();
        View viewFindViewById8 = viewF.findViewById(c.textViewCharacterCount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById8;
        viewF.setOnTouchListener(new ViewOnTouchListenerC0223c(editText, 2));
        editText.addTextChangedListener(new D(textView, this, ppButton));
        editText.setOnEditorActionListener(new A(editText, 0));
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: Oc.B
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z3) {
                WhyTurnOffSaveDialogFragment.a aVar = WhyTurnOffSaveDialogFragment.f32329Z;
                if (z3) {
                    this.f6738a.l(null, true);
                    PpButton ppButton2 = ppButton;
                    if (ppButton2 != null) {
                        Editable text = editText.getText();
                        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                        ppButton2.setEnabled(text.length() > 0);
                    }
                }
            }
        });
        View viewFindViewById9 = viewF.findViewById(c.tvTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        AbstractC0511h.f7089a.richText((TextView) viewFindViewById9, "Why you want to turn off Auto Save?", "Auto Save?", new C0500c(this, 5));
        iconicsImageView.setOnClickListener(new C(this, iconicsImageView, editText, textView, ppButton, 0));
        iconicsImageView2.setOnClickListener(new C(this, iconicsImageView2, editText, textView, ppButton, 1));
        iconicsImageView3.setOnClickListener(new C(this, iconicsImageView3, editText, textView, ppButton, 2));
        ppButton.setOnClickListener(new j(1, this, ppButton));
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new x(this, 10));
        }
        com.transsnet.palmpay.core.base.l lVar = ((CashBoxViewModel) j()).f32748k0;
        if (lVar != null) {
            lVar.e(this, new C0138e(new S(this, 4, constraintLayout, ppButton), (char) 0));
        }
        return baseDialog;
    }

    public final void l(final IconicsImageView iconicsImageView, final boolean z3) {
        int i7 = 0;
        for (Object obj : this.f32331M) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                C1850q.k();
                throw null;
            }
            final IconicsImageView iconicsImageView2 = (IconicsImageView) obj;
            if (iconicsImageView2 != null) {
                Context contextG = g();
                S6.a aVar = (!z3 && Intrinsics.c(iconicsImageView, iconicsImageView2)) ? S6.a.pay_CircleFill : S6.a.pay_CircleOutline;
                IconicsDrawable iconicsDrawable = new IconicsDrawable(contextG, aVar);
                iconicsDrawable.a(new Function1() { // from class: Oc.z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int iColorInt;
                        IconicsDrawable apply = (IconicsDrawable) obj2;
                        WhyTurnOffSaveDialogFragment.a aVar2 = WhyTurnOffSaveDialogFragment.f32329Z;
                        Intrinsics.checkNotNullParameter(apply, "$this$apply");
                        p118hf.a.I(apply, 20);
                        boolean z8 = z3;
                        WhyTurnOffSaveDialogFragment whyTurnOffSaveDialogFragment = this;
                        if (z8) {
                            iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, whyTurnOffSaveDialogFragment.g());
                        } else {
                            iColorInt = Intrinsics.c(iconicsImageView, iconicsImageView2) ? CommonViewExtKt.colorInt(L6.b.ppColorPrimary, whyTurnOffSaveDialogFragment.g()) : CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, whyTurnOffSaveDialogFragment.g());
                        }
                        D3.a.F(apply, iColorInt);
                        return Unit.f38893a;
                    }
                });
                iconicsImageView2.setImageDrawable(iconicsDrawable);
            }
            i7 = i10;
        }
    }
}
