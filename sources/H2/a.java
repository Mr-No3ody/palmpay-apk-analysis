package H2;

import F2.g;
import android.graphics.drawable.Animatable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G2.a f3606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f3607c = -1;

    public a(G2.a aVar) {
        this.f3606b = aVar;
    }

    @Override // F2.g, com.facebook.drawee.controller.ControllerListener
    public final void onFinalImageSet(String id2, Object obj, Animatable animatable) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f3606b.onFinalImageSet(System.currentTimeMillis() - this.f3607c);
    }

    @Override // F2.g, com.facebook.drawee.controller.ControllerListener
    public final void onSubmit(String id2, Object obj) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f3607c = System.currentTimeMillis();
    }
}
