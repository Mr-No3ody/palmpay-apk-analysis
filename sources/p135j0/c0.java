package p135j0;

import Ff.c;
import java.io.FileOutputStream;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FileOutputStream f38022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f38023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f38024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f38025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38026e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, Continuation continuation) {
        super(continuation);
        this.f38025d = d0Var;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f38024c = obj;
        this.f38026e |= Integer.MIN_VALUE;
        return this.f38025d.getExclusiveFileLockWithRetryIfDeadlock(null, this);
    }
}
