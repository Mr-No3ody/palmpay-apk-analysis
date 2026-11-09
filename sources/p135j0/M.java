package p135j0;

import Ff.c;
import kotlin.jvm.internal.D;

/* JADX INFO: loaded from: classes.dex */
public final class M extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public D f37949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f37950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f37951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37952d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(O o10, c cVar) {
        super(cVar);
        this.f37951c = o10;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f37950b = obj;
        this.f37952d |= Integer.MIN_VALUE;
        return this.f37951c.i(null, false, this);
    }
}
