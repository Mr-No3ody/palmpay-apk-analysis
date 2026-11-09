package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class g1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.view.menu.a f12907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1 f12908b;

    public g1(i1 i1Var) {
        this.f12908b = i1Var;
        Context context = i1Var.f12920a.getContext();
        CharSequence charSequence = i1Var.f12929j;
        androidx.appcompat.view.menu.a aVar = new androidx.appcompat.view.menu.a();
        aVar.f12365e = 4096;
        aVar.f12367g = 4096;
        aVar.f12372l = null;
        aVar.f12373m = null;
        aVar.f12374n = false;
        aVar.f12375o = false;
        aVar.f12376p = 16;
        aVar.f12369i = context;
        aVar.f12361a = charSequence;
        this.f12907a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i1 i1Var = this.f12908b;
        Window.Callback callback = i1Var.f12932m;
        if (callback == null || !i1Var.f12933n) {
            return;
        }
        callback.onMenuItemSelected(0, this.f12907a);
    }
}
