package p135j0;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import androidx.datastore.core.InterProcessCoordinator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class C extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f37907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f37909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f37910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f37911e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(O o10, int i7, Continuation continuation) {
        super(2, continuation);
        this.f37910d = o10;
        this.f37911e = i7;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C c6 = new C(this.f37910d, this.f37911e, continuation);
        c6.f37909c = ((Boolean) obj).booleanValue();
        return c6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C) create(bool, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int iIntValue;
        ?? r3;
        ?? r10;
        w0 w0Var;
        ?? r11;
        a aVar = a.f2423a;
        ?? r12 = this.f37908b;
        O o10 = this.f37910d;
        try {
            if (r12 == 0) {
                g.M(obj);
                boolean z3 = this.f37909c;
                this.f37909c = z3;
                this.f37908b = 1;
                obj = O.e(o10, z3, this);
                r12 = z3;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (r12 != 1) {
                    if (r12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z8 = this.f37909c;
                    th = this.f37907a;
                    g.M(obj);
                    r10 = z8;
                    iIntValue = ((Number) obj).intValue();
                    r3 = r10;
                    n0 n0Var = new n0(iIntValue, th);
                    r11 = r3;
                    w0Var = n0Var;
                    return new Pair(w0Var, Boolean.valueOf((boolean) r11));
                }
                boolean z10 = this.f37909c;
                g.M(obj);
                r12 = z10;
            }
            w0Var = (w0) obj;
            r11 = r12;
        } catch (Throwable th2) {
            if (r12 != 0) {
                int i7 = O.f37960m;
                InterProcessCoordinator interProcessCoordinatorF = o10.f();
                this.f37907a = th2;
                this.f37909c = r12;
                this.f37908b = 2;
                Object version = interProcessCoordinatorF.getVersion(this);
                if (version != aVar) {
                    r10 = r12;
                    th = th2;
                    obj = version;
                }
                return aVar;
            }
            ?? r13 = r12;
            th = th2;
            iIntValue = this.f37911e;
            r3 = r13 == true ? 1 : 0;
        }
        return new Pair(w0Var, Boolean.valueOf((boolean) r11));
    }
}
