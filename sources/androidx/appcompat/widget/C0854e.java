package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: androidx.appcompat.widget.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0854e extends androidx.appcompat.view.menu.t {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0868l f12890l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0854e(C0868l c0868l, Context context, androidx.appcompat.view.menu.w wVar, View view) {
        super(p241q.a.actionOverflowMenuStyle, context, view, wVar, false);
        this.f12890l = c0868l;
        if ((((androidx.appcompat.view.menu.m) wVar.getItem()).f12464x & 32) != 32) {
            View view2 = c0868l.f12953o;
            this.f12482e = view2 == null ? (View) c0868l.f12385i : view2;
        }
        setPresenterCallback(c0868l.f12951Z);
    }

    @Override // androidx.appcompat.view.menu.t
    public final void c() {
        C0868l c0868l = this.f12890l;
        c0868l.f12948Q = null;
        c0868l.f12952k0 = 0;
        super.c();
    }
}
