package p047d5;

import android.view.View;
import p140j8.f;
import p291t5.a;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f35531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f35532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f35533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f35534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f35535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f35536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f35537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f35538h;

    public final b a(int i7, View view) {
        boolean z3 = this.f35536f || a.d(view);
        a aVar = new a();
        aVar.f35529i = false;
        aVar.f35521a = view;
        aVar.f35528h = z3 ? this.f35538h : -1;
        aVar.f35522b = this.f35532b;
        aVar.f35523c = this.f35533c;
        aVar.f35524d = f.a(this.f35531a) ? this.f35532b : this.f35534d;
        aVar.f35526f = z3;
        aVar.f35527g = this.f35537g;
        aVar.f35530j = i7;
        aVar.f35529i = true;
        return aVar.a();
    }
}
