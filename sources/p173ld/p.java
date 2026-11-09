package p173ld;

import Kb.b;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f39335d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, View view) {
        super(qVar, view);
        this.f39335d = qVar;
        view.setOnClickListener(new o(this, 0));
    }
}
