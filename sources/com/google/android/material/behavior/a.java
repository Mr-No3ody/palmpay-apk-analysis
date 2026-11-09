package com.google.android.material.behavior;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f22488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout.Behavior f22489c;

    public /* synthetic */ a(CoordinatorLayout.Behavior behavior, View view, int i7) {
        this.f22487a = i7;
        this.f22489c = behavior;
        this.f22488b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z3) {
        switch (this.f22487a) {
            case 0:
                ((HideBottomViewOnScrollBehavior) this.f22489c).lambda$disableIfTouchExplorationEnabled$0(this.f22488b, z3);
                break;
            default:
                ((HideViewOnScrollBehavior) this.f22489c).lambda$disableIfTouchExplorationEnabled$0(this.f22488b, z3);
                break;
        }
    }
}
