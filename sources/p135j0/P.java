package p135j0;

import Ff.c;
import java.io.FileInputStream;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class P extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f37973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileInputStream f37974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f37975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f37976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37977e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Q q10, Continuation continuation) {
        super(continuation);
        this.f37976d = q10;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f37975c = obj;
        this.f37977e |= Integer.MIN_VALUE;
        return Q.a(this.f37976d, this);
    }
}
