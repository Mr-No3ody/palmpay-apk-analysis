package p191mg;

import C4.a;
import Ff.c;
import java.util.LinkedHashMap;
import p355xf.AbstractC2123b;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC2123b f39736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f39737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinkedHashMap f39738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f39739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f39740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f39741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39742g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(a aVar, Ff.a aVar2) {
        super(aVar2);
        this.f39741f = aVar;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f39740e = obj;
        this.f39742g |= Integer.MIN_VALUE;
        return a.a(this.f39741f, null, this);
    }
}
