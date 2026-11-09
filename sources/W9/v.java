package W9;

import Uc.I0;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends Kb.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B f10651d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(B b7, View view) {
        super(b7, view);
        this.f10651d = b7;
        view.setOnClickListener(new I0(this, 10));
    }
}
