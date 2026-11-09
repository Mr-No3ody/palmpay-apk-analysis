package p135j0;

import C0.C0126s;
import C0.J;
import Pa.C0525w;
import Wf.C0753a0;
import Yf.n;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import p059e1.a;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f38126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f38127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f38128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0525w f38129d;

    public r0(CoroutineScope scope, J onComplete, L consumeMessage) {
        K onUndeliveredElement = K.f37945a;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        this.f38126a = scope;
        this.f38127b = consumeMessage;
        this.f38128c = a.a(Integer.MAX_VALUE, null, 6);
        this.f38129d = new C0525w(23);
        Job job = (Job) scope.getF17355b().get(C0753a0.f10836a);
        if (job != null) {
            job.invokeOnCompletion(new C0126s(8, onComplete, this));
        }
    }
}
