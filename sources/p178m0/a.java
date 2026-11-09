package p178m0;

import E0.h;
import android.content.Context;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import p015ag.c;
import p193n0.d;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ReadOnlyProperty {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p149k0.a f39411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f39412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f39413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f39414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile d f39415f;

    public a(String name, p149k0.a aVar, Function1 produceMigrations, c scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f39410a = name;
        this.f39411b = aVar;
        this.f39412c = produceMigrations;
        this.f39413d = scope;
        this.f39414e = new Object();
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object obj, KProperty property) {
        d dVar;
        Context thisRef = (Context) obj;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        d dVar2 = this.f39415f;
        if (dVar2 != null) {
            return dVar2;
        }
        synchronized (this.f39414e) {
            try {
                if (this.f39415f == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    p149k0.a aVar = this.f39411b;
                    Function1 function1 = this.f39412c;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    this.f39415f = p264r5.a.h(aVar, (List) function1.invoke(applicationContext), this.f39413d, new h(5, applicationContext, this));
                }
                dVar = this.f39415f;
                Intrinsics.e(dVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }
}
