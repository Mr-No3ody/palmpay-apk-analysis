package C0;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.EnumC1204n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: C0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0118j extends kotlin.jvm.internal.o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0119k f1048b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0118j(C0119k c0119k, int i7) {
        super(0);
        this.f1047a = i7;
        this.f1048b = c0119k;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f1047a) {
            case 0:
                C0119k c0119k = this.f1048b;
                Context context = c0119k.f1050a;
                Context applicationContext = context != null ? context.getApplicationContext() : null;
                return new androidx.lifecycle.Y(applicationContext instanceof Application ? (Application) applicationContext : null, c0119k, c0119k.a());
            default:
                C0119k owner = this.f1048b;
                if (!owner.f1059o) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                if (owner.f1057i.f17478d == EnumC1204n.f17460a) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(owner, "owner");
                C0116h c0116h = new C0116h();
                c0116h.f17432b = owner.f1058j.f5524b;
                c0116h.f17433c = owner.f1057i;
                return ((C0117i) new androidx.camera.video.internal.c(owner, c0116h).h(C0117i.class)).f1046d;
        }
    }
}
