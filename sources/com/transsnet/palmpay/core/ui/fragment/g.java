package com.transsnet.palmpay.core.ui.fragment;

import C0.G;
import Pa.i0;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import com.transsnet.palmpay.custom_view.input.MaxLengthFilter;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.KeyboardUtils;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddBankCardFragmentV2 f27919b;

    public /* synthetic */ g(AddBankCardFragmentV2 addBankCardFragmentV2, int i7) {
        this.f27918a = i7;
        this.f27919b = addBankCardFragmentV2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        AddBankCardFragmentV2 addBankCardFragmentV2 = this.f27919b;
        switch (this.f27918a) {
            case 0:
                if (!TextUtils.isEmpty(editable)) {
                    if ((editable != null ? editable.length() : 0) >= 4) {
                        KeyboardUtils.hideSoftInput(addBankCardFragmentV2.requireActivity());
                    }
                }
                int i7 = AddBankCardFragmentV2.f27826C0;
                addBankCardFragmentV2.G();
                break;
            case 1:
                int i10 = AddBankCardFragmentV2.f27826C0;
                addBankCardFragmentV2.G();
                break;
            default:
                int i11 = AddBankCardFragmentV2.f27826C0;
                EditText editTextV = addBankCardFragmentV2.v();
                int iS = i0.s(String.valueOf(editTextV != null ? editTextV.getText() : null));
                MaxLengthFilter maxLengthFilter = addBankCardFragmentV2.f27847t0;
                if (maxLengthFilter == null || maxLengthFilter.getMaxLength() != iS) {
                    addBankCardFragmentV2.f27847t0 = new MaxLengthFilter(iS);
                    EditText editTextX = addBankCardFragmentV2.x();
                    if (editTextX != null) {
                        MaxLengthFilter maxLengthFilter2 = addBankCardFragmentV2.f27847t0;
                        Intrinsics.e(maxLengthFilter2);
                        editTextX.setFilters(new InputFilter[]{maxLengthFilter2});
                    }
                    EditText editTextX2 = addBankCardFragmentV2.x();
                    if (editTextX2 != null) {
                        editTextX2.setHint(G.i("").append(iS == 3 ? "000" : "0000").setFontFamily("sans-serif").create());
                    }
                }
                addBankCardFragmentV2.G();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f27918a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f27918a) {
            case 0:
            case 1:
                break;
            default:
                if (charSequence != null && charSequence.length() > 0) {
                    int i12 = AddBankCardFragmentV2.f27826C0;
                    EditText editTextV = this.f27919b.v();
                    if (editTextV != null) {
                        CommonViewExtKt.dealInputAccountWithSpace$default(editTextV, charSequence, i7, i10, C1850q.e(4, 4, 4, 4, 3), false, 16, null);
                    }
                    break;
                }
                break;
        }
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
}
