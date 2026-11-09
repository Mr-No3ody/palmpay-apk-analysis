package p074f0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f36341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36342c;

    public a(int i7, d dVar, int i10) {
        this.f36340a = i7;
        this.f36341b = dVar;
        this.f36342c = i10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f36340a);
        this.f36341b.f36360a.performAction(this.f36342c, bundle);
    }
}
