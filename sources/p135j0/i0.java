package p135j0;

import Ff.c;
import java.io.FileInputStream;
import java.nio.channels.FileLock;
import kotlin.coroutines.Continuation;
import p072eg.e;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f38052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileInputStream f38053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FileLock f38054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f38055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f38056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j0 f38057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38058g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, Continuation continuation) {
        super(continuation);
        this.f38057f = j0Var;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f38056e = obj;
        this.f38058g |= Integer.MIN_VALUE;
        return this.f38057f.tryLock(null, this);
    }
}
