package p056dg;

import kotlin.Function;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.DisposableHandle;
import p015ag.s;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f35942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function3 f35943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function3 f35944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f35945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function f35946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function3 f35947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f35948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f35949h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f35950i;

    public e(g gVar, Object obj, Function3 function3, Function3 function4, Object obj2, Function function, Function3 function5) {
        this.f35950i = gVar;
        this.f35942a = obj;
        this.f35943b = function3;
        this.f35944c = function4;
        this.f35945d = obj2;
        this.f35946e = function;
        this.f35947f = function5;
    }

    public final void a() {
        Object obj = this.f35948g;
        if (obj instanceof s) {
            ((s) obj).g(this.f35949h, this.f35950i.f35956a);
            return;
        }
        DisposableHandle disposableHandle = obj instanceof DisposableHandle ? (DisposableHandle) obj : null;
        if (disposableHandle != null) {
            disposableHandle.dispose();
        }
    }
}
