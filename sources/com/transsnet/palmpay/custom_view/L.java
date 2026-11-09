package com.transsnet.palmpay.custom_view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class L extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TitleEditView f31031b;

    public /* synthetic */ L(TitleEditView titleEditView, int i7) {
        this.f31030a = i7;
        this.f31031b = titleEditView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f31030a) {
            case 1:
                super.onAnimationEnd(animator);
                int i7 = TitleEditView.f31151y0;
                TitleEditView titleEditView = this.f31031b;
                titleEditView.e(0);
                titleEditView.f31166i.setVisibility(4);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f31030a) {
            case 0:
                super.onAnimationStart(animator);
                int i7 = TitleEditView.f31151y0;
                TitleEditView titleEditView = this.f31031b;
                titleEditView.e(8);
                titleEditView.f31166i.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
