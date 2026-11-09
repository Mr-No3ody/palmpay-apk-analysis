package com.transsnet.palmpay.core.ui.fragment;

import Pa.n0;
import android.content.Context;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.dialog.MonthPickDialog;
import com.transsnet.palmpay.core.ui.fragment.AddBankCardFragmentV2.CheckCvvDialog;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddBankCardFragmentV2 f27878b;

    public /* synthetic */ b(AddBankCardFragmentV2 addBankCardFragmentV2, int i7) {
        this.f27877a = i7;
        this.f27878b = addBankCardFragmentV2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AddBankCardFragmentV2 addBankCardFragmentV2 = this.f27878b;
        switch (this.f27877a) {
            case 0:
                O6.d dVar = addBankCardFragmentV2.f27840k0;
                if (dVar != null) {
                    SPUtils.getInstance("draft_record").remove("_key_bank_draft");
                    dVar.dismiss();
                }
                break;
            case 1:
                addBankCardFragmentV2.f27848u0 = !addBankCardFragmentV2.f27848u0;
                EditText editTextW = addBankCardFragmentV2.w();
                if (editTextW != null) {
                    editTextW.setTransformationMethod(addBankCardFragmentV2.f27848u0 ? HideReturnsTransformationMethod.getInstance() : PasswordTransformationMethod.getInstance());
                }
                IconicsImageView iconicsImageView = (IconicsImageView) addBankCardFragmentV2.t.getValue();
                if (iconicsImageView != null) {
                    Context contextRequireContext = addBankCardFragmentV2.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    IconicsDrawable iconicsDrawable = new IconicsDrawable(contextRequireContext, addBankCardFragmentV2.f27848u0 ? S6.a.pay_Show : S6.a.pay_Hide);
                    iconicsDrawable.a(new com.facebook.react.packagerconnection.a(9));
                    iconicsImageView.setIcon(iconicsDrawable);
                }
                break;
            case 2:
                int i7 = AddBankCardFragmentV2.f27826C0;
                addBankCardFragmentV2.new CheckCvvDialog(addBankCardFragmentV2.requireContext()).show();
                break;
            case 3:
                int i10 = AddBankCardFragmentV2.f27826C0;
                n0.g().q(new ClickEvent("addnewcardPagenextClick"));
                if (addBankCardFragmentV2.u()) {
                    addBankCardFragmentV2.t();
                    break;
                }
                break;
            case 4:
                int i11 = AddBankCardFragmentV2.f27826C0;
                O6.c cVar = new O6.c(addBankCardFragmentV2.requireContext());
                cVar.b(k.core_please_enter_your_card_details_tips);
                cVar.d(k.core_confirm, null);
                cVar.g();
                break;
            default:
                int i12 = AddBankCardFragmentV2.f27826C0;
                t tVar = addBankCardFragmentV2.f27838Z;
                ((MonthPickDialog) tVar.getValue()).show();
                if (addBankCardFragmentV2.f27843p0 > 0 && addBankCardFragmentV2.f27844q0 > 0) {
                    ((MonthPickDialog) tVar.getValue()).setNowPickDate(addBankCardFragmentV2.f27843p0, addBankCardFragmentV2.f27844q0);
                    break;
                }
                break;
        }
    }
}
