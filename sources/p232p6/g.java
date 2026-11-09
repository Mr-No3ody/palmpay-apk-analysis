package p232p6;

import Ff.c;
import Pa.C0525w;
import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f41210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function0 f41211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0525w f41212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f41213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f41214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41215f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p pVar, c cVar) {
        super(cVar);
        this.f41214e = pVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f41213d = obj;
        this.f41215f |= Integer.MIN_VALUE;
        return this.f41214e.c(null, null, this);
    }
}
