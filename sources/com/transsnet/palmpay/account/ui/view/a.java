package com.transsnet.palmpay.account.ui.view;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements KeyboardView.OnKeyboardActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ KeyboardView f26406a;

    public a(KeyboardView keyboardView) {
        this.f26406a = keyboardView;
    }

    @Override // com.transsnet.palmpay.account.ui.view.KeyboardView.OnKeyboardActionListener
    public final void onKey(int i7, int[] iArr) {
        KeyboardView keyboardView = this.f26406a;
        keyboardView.f26385q0.onKey(i7, iArr);
        keyboardView.c();
    }

    @Override // com.transsnet.palmpay.account.ui.view.KeyboardView.OnKeyboardActionListener
    public final void onPress(int i7) {
        this.f26406a.f26385q0.onPress(i7);
    }

    @Override // com.transsnet.palmpay.account.ui.view.KeyboardView.OnKeyboardActionListener
    public final void onRelease(int i7) {
        this.f26406a.f26385q0.onRelease(i7);
    }

    @Override // com.transsnet.palmpay.account.ui.view.KeyboardView.OnKeyboardActionListener
    public final void onText(CharSequence charSequence) {
        KeyboardView keyboardView = this.f26406a;
        keyboardView.f26385q0.onText(charSequence);
        keyboardView.c();
    }

    @Override // com.transsnet.palmpay.account.ui.view.KeyboardView.OnKeyboardActionListener
    public final void swipeDown() {
    }

    @Override // com.transsnet.palmpay.account.ui.view.KeyboardView.OnKeyboardActionListener
    public final void swipeLeft() {
    }

    @Override // com.transsnet.palmpay.account.ui.view.KeyboardView.OnKeyboardActionListener
    public final void swipeRight() {
    }

    @Override // com.transsnet.palmpay.account.ui.view.KeyboardView.OnKeyboardActionListener
    public final void swipeUp() {
    }
}
