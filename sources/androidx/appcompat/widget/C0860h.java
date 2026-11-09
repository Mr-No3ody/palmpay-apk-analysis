package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.ShowableListMenu;

/* JADX INFO: renamed from: androidx.appcompat.widget.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0860h extends AbstractViewOnTouchListenerC0875o0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12909o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ View f12910p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0860h(View view, View view2, int i7) {
        super(view2);
        this.f12909o = i7;
        this.f12910p = view;
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0875o0
    public final ShowableListMenu b() {
        switch (this.f12909o) {
            case 0:
                C0862i c0862i = ((ActionMenuPresenter$OverflowMenuButton) this.f12910p).f12571a.f12947M;
                if (c0862i == null) {
                    return null;
                }
                return c0862i.a();
            default:
                return ((ActivityChooserView) this.f12910p).getListPopupWindow();
        }
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0875o0
    public final boolean c() {
        switch (this.f12909o) {
            case 0:
                ((ActionMenuPresenter$OverflowMenuButton) this.f12910p).f12571a.d();
                return true;
            default:
                ActivityChooserView activityChooserView = (ActivityChooserView) this.f12910p;
                if (activityChooserView.b() || !activityChooserView.f12600p) {
                    return true;
                }
                activityChooserView.f12590a.getClass();
                throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
    }

    @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0875o0
    public final boolean d() {
        switch (this.f12909o) {
            case 0:
                C0868l c0868l = ((ActionMenuPresenter$OverflowMenuButton) this.f12910p).f12571a;
                if (c0868l.f12949X != null) {
                    return false;
                }
                c0868l.b();
                return true;
            default:
                ((ActivityChooserView) this.f12910p).a();
                return true;
        }
    }
}
