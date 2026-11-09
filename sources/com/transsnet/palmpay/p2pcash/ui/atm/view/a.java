package com.transsnet.palmpay.p2pcash.ui.atm.view;

import L6.b;
import Pa.r0;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P2PInputAmountView f33070a;

    public a(P2PInputAmountView p2PInputAmountView) {
        this.f33070a = p2PInputAmountView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        long j6;
        String strReplaceAll = editable.toString().replaceAll(",", "");
        int length = editable.length();
        P2PInputAmountView p2PInputAmountView = this.f33070a;
        if (length != 0 && p2PInputAmountView.f33007c.isFocused()) {
            p2PInputAmountView.f33010f.setVisibility(0);
        } else {
            p2PInputAmountView.f33010f.setVisibility(8);
        }
        if (p2PInputAmountView.f33013j != null) {
            if (strReplaceAll.length() > 0) {
                j6 = Long.parseLong(strReplaceAll);
                long j10 = p2PInputAmountView.f33015p;
                if (j6 > j10 / 100) {
                    j6 = j10 / 100;
                }
            } else {
                j6 = 0;
            }
            p2PInputAmountView.f33013j.onNumChanged(j6 * 100);
        }
        p2PInputAmountView.f33009e.setVisibility(8);
        if (p2PInputAmountView.f33007c.isFocused()) {
            p2PInputAmountView.f33008d.setBackgroundColor(Color.parseColor("#C0C3C8"));
        } else {
            p2PInputAmountView.f33008d.setBackgroundColor(p2PInputAmountView.getContext().getColor(b.ppColorBackgroundDark));
        }
        if (TextUtils.isEmpty(strReplaceAll)) {
            return;
        }
        long j11 = Long.parseLong(strReplaceAll);
        long j12 = p2PInputAmountView.f33015p;
        if (j11 > j12 / 100) {
            j11 = j12 / 100;
        }
        String strE = r0.E(j11 * 100);
        p2PInputAmountView.f33007c.removeTextChangedListener(this);
        p2PInputAmountView.f33007c.setText(strE);
        p2PInputAmountView.f33007c.addTextChangedListener(this);
        p2PInputAmountView.f33007c.setSelection(strE.length());
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
