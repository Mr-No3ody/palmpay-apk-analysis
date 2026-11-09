package Ga;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f3205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f3207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3208d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, Ff.c cVar) {
        super(cVar);
        this.f3207c = kVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f3206b = obj;
        this.f3208d |= Integer.MIN_VALUE;
        return k.c(this.f3207c, this);
    }
}
