package androidx.appcompat.widget;

import androidx.appcompat.view.menu.MenuPresenter;

/* JADX INFO: renamed from: androidx.appcompat.widget.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0864j implements MenuPresenter.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0868l f12938a;

    public C0864j(C0868l c0868l) {
        this.f12938a = c0868l;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public final void onCloseMenu(androidx.appcompat.view.menu.k kVar, boolean z3) {
        if (kVar instanceof androidx.appcompat.view.menu.w) {
            kVar.getRootMenu().close(false);
        }
        MenuPresenter.Callback callback = this.f12938a.f12382e;
        if (callback != null) {
            callback.onCloseMenu(kVar, z3);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public final boolean onOpenSubMenu(androidx.appcompat.view.menu.k kVar) {
        C0868l c0868l = this.f12938a;
        if (kVar == c0868l.f12380c) {
            return false;
        }
        c0868l.f12952k0 = ((androidx.appcompat.view.menu.w) kVar).getItem().getItemId();
        MenuPresenter.Callback callback = c0868l.f12382e;
        if (callback != null) {
            return callback.onOpenSubMenu(kVar);
        }
        return false;
    }
}
