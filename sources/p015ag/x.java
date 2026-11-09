package p015ag;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.ThreadContextElement;

/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f11973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f11974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreadContextElement[] f11975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11976d;

    public x(int i7, CoroutineContext coroutineContext) {
        this.f11973a = coroutineContext;
        this.f11974b = new Object[i7];
        this.f11975c = new ThreadContextElement[i7];
    }
}
