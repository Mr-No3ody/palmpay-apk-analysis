package p135j0;

import Ff.c;
import java.io.FileOutputStream;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FileOutputStream f38007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileOutputStream f38008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f38009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Z f38010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38011e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(Z z3, Continuation continuation) {
        super(continuation);
        this.f38010d = z3;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f38009c = obj;
        this.f38011e |= Integer.MIN_VALUE;
        return this.f38010d.writeData(null, this);
    }
}
