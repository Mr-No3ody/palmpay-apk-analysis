package p355xf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import p191mg.m;

/* JADX INFO: renamed from: xf.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2124c extends AbstractC2123b implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f43958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Unit f43959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Continuation f43960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f43961d;

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return f.f38943a;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.f43960c = null;
        this.f43961d = obj;
    }
}
