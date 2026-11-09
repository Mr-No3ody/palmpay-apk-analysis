package com.transsnet.palmpay.credit.ui.dialog;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.credit.ui.dialog.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1505g0 extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CLVerifyPalmPayAccountDialog f30116b;

    public /* synthetic */ C1505g0(CLVerifyPalmPayAccountDialog cLVerifyPalmPayAccountDialog, int i7) {
        this.f30115a = i7;
        this.f30116b = cLVerifyPalmPayAccountDialog;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.f30115a) {
            case 0:
                Intrinsics.checkNotNullParameter(view, "view");
                Eb.a.p();
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                Eb.a.o();
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        switch (this.f30115a) {
            case 0:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setColor(this.f30116b.requireContext().getColor(L6.b.ppColorLink));
                break;
            default:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setColor(this.f30116b.requireContext().getColor(L6.b.ppColorLink));
                break;
        }
    }
}
