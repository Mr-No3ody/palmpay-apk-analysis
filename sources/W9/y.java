package W9;

import Uc.I0;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends Kb.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f10655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A f10656e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(A a3, View view) {
        super(a3, view);
        this.f10656e = a3;
        this.f10655d = (ImageView) view.findViewById(R9.d.contact_tag);
        view.setOnClickListener(new I0(this, 11));
    }
}
