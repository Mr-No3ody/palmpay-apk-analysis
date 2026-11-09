package p135j0;

import Ff.c;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: j0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1771d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Serializable f38027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f38028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f38029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1774g f38030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38031e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1771d(C1774g c1774g, Continuation continuation) {
        super(continuation);
        this.f38030d = c1774g;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f38029c = obj;
        this.f38031e |= Integer.MIN_VALUE;
        return this.f38030d.runMigrations(null, null, this);
    }
}
