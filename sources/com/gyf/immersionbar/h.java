package com.gyf.immersionbar;

import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f23237e;

    public /* synthetic */ h(p152k5.d dVar, Object obj, int i7, Object obj2, int i10) {
        this.f23233a = i10;
        this.f23237e = dVar;
        this.f23235c = obj;
        this.f23234b = i7;
        this.f23236d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23233a) {
            case 0:
                View view = (View) this.f23236d;
                int height = view.getHeight();
                int i7 = this.f23234b;
                Integer num = (Integer) this.f23237e;
                int iIntValue = (height + i7) - num.intValue();
                ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) this.f23235c;
                layoutParams.height = iIntValue;
                view.setPadding(view.getPaddingLeft(), (view.getPaddingTop() + i7) - num.intValue(), view.getPaddingRight(), view.getPaddingBottom());
                view.setLayoutParams(layoutParams);
                break;
            case 1:
                p152k5.d dVar = (p152k5.d) this.f23237e;
                dVar.c();
                HashMap map = dVar.f38685g;
                String str = (String) this.f23235c;
                p152k5.g gVar = (p152k5.g) map.get(str);
                if (gVar == null) {
                    gVar = new p152k5.g(dVar.f38683e, dVar.f38686h, str);
                    map.put(str, gVar);
                }
                gVar.c(dVar.f38683e, this.f23234b, this.f23236d);
                break;
            default:
                ((p152k5.g) this.f23235c).c(((p152k5.d) this.f23237e).f38683e, this.f23234b, this.f23236d);
                break;
        }
    }

    public h(ViewGroup.LayoutParams layoutParams, View view, int i7, Integer num) {
        this.f23233a = 0;
        this.f23235c = layoutParams;
        this.f23236d = view;
        this.f23234b = i7;
        this.f23237e = num;
    }
}
