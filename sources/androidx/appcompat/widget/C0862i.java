package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: androidx.appcompat.widget.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0862i extends androidx.appcompat.view.menu.t {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0868l f12915l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0862i(C0868l c0868l, Context context, androidx.appcompat.view.menu.k kVar, View view) {
        super(p241q.a.actionOverflowMenuStyle, context, view, kVar, true);
        this.f12915l = c0868l;
        this.f12483f = 8388613;
        setPresenterCallback(c0868l.f12951Z);
    }

    @Override // androidx.appcompat.view.menu.t
    public final void c() {
        C0868l c0868l = this.f12915l;
        androidx.appcompat.view.menu.k kVar = c0868l.f12380c;
        if (kVar != null) {
            kVar.close();
        }
        c0868l.f12947M = null;
        super.c();
    }
}
