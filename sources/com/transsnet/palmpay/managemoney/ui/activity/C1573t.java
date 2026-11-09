package com.transsnet.palmpay.managemoney.ui.activity;

import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.Group;
import com.transsnet.palmpay.custom_view.AmountEditText;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.managemoney.ui.SimpleTextWatcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.activity.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1573t implements SimpleTextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreatePlanActivity f32264b;

    public /* synthetic */ C1573t(CreatePlanActivity createPlanActivity, int i7) {
        this.f32263a = i7;
        this.f32264b = createPlanActivity;
    }

    @Override // com.transsnet.palmpay.managemoney.ui.SimpleTextWatcher, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i7 = this.f32263a;
    }

    @Override // com.transsnet.palmpay.managemoney.ui.SimpleTextWatcher, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f32263a;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    @Override // com.transsnet.palmpay.managemoney.ui.SimpleTextWatcher, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        boolean z3;
        switch (this.f32263a) {
            case 0:
                CreatePlanActivity createPlanActivity = this.f32264b;
                Lc.a aVar = createPlanActivity.f32071H;
                if (aVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                boolean z8 = false;
                aVar.f5637f.setTypeface(TextUtils.isEmpty(charSequence != null ? charSequence.toString() : null) ? Typeface.create("sans-serif", 0) : Typeface.create("sans-serif-medium", 0));
                Lc.a aVar2 = createPlanActivity.f32071H;
                if (aVar2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                if (aVar2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                if (!TextUtils.isEmpty(String.valueOf(aVar2.f5637f.getText()))) {
                    Lc.a aVar3 = createPlanActivity.f32071H;
                    if (aVar3 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    int length = String.valueOf(aVar3.f5638g.getText()).length();
                    if (length >= 0 && length < 31) {
                        z8 = true;
                    }
                }
                aVar2.f5649v.setEnabled(z8);
                createPlanActivity.w(null);
                Lc.a aVar4 = createPlanActivity.f32071H;
                if (aVar4 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                Group group = aVar4.f5622A;
                if (group != null) {
                    group.setVisibility(8);
                }
                CreatePlanActivity.o(createPlanActivity);
                return;
            default:
                CreatePlanActivity createPlanActivity2 = this.f32264b;
                Lc.a aVar5 = createPlanActivity2.f32071H;
                if (aVar5 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                aVar5.f5638g.setTypeface(TextUtils.isEmpty(charSequence != null ? charSequence.toString() : null) ? Typeface.create("sans-serif", 0) : Typeface.create("sans-serif-medium", 0));
                Lc.a aVar6 = createPlanActivity2.f32071H;
                if (aVar6 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                AppCompatEditText appCompatEditText = aVar6.f5638g;
                int length2 = String.valueOf(appCompatEditText != null ? appCompatEditText.getText() : null).length();
                Lc.a aVar7 = createPlanActivity2.f32071H;
                if (aVar7 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                RoundedTextView roundedTextView = aVar7.f5649v;
                if (roundedTextView != null) {
                    if (aVar7 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    AmountEditText amountEditText = aVar7.f5637f;
                    if (TextUtils.isEmpty(String.valueOf(amountEditText != null ? amountEditText.getText() : null))) {
                        z3 = false;
                    } else {
                        Lc.a aVar8 = createPlanActivity2.f32071H;
                        if (aVar8 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        AppCompatEditText appCompatEditText2 = aVar8.f5638g;
                        int length3 = String.valueOf(appCompatEditText2 != null ? appCompatEditText2.getText() : null).length();
                        if (length3 < 0 || length3 >= 31) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                    }
                    roundedTextView.setEnabled(z3);
                }
                String string = length2 > 30 ? createPlanActivity2.getResources().getString(Jc.f.mm_input_goal_limit) : "";
                Lc.a aVar9 = createPlanActivity2.f32071H;
                if (aVar9 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                TextView textView = aVar9.f5629X;
                if (textView != null) {
                    textView.setVisibility(TextUtils.isEmpty(string) ? 8 : 0);
                }
                Lc.a aVar10 = createPlanActivity2.f32071H;
                if (aVar10 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                TextView textView2 = aVar10.f5629X;
                if (textView2 != null) {
                    textView2.setText(string);
                    return;
                }
                return;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void d(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
