package com.bumptech.glide.load.engine;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Appendable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Appendable f20764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20765b = true;

    public t(Appendable appendable) {
        this.f20764a = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c6) throws IOException {
        boolean z3 = this.f20765b;
        Appendable appendable = this.f20764a;
        if (z3) {
            this.f20765b = false;
            appendable.append("  ");
        }
        this.f20765b = c6 == '\n';
        appendable.append(c6);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i7, int i10) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z3 = this.f20765b;
        Appendable appendable = this.f20764a;
        boolean z8 = false;
        if (z3) {
            this.f20765b = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i10 - 1) == '\n') {
            z8 = true;
        }
        this.f20765b = z8;
        appendable.append(charSequence, i7, i10);
        return this;
    }
}
