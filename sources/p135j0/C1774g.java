package p135j0;

import Ef.a;
import androidx.camera.core.impl.utils.executor.g;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.InitializerApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p355xf.C2126e;

/* JADX INFO: renamed from: j0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1774g {
    public /* synthetic */ C1774g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x0096  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0067->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0084 -> B:25:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0087 -> B:25:0x0067). Please report as a decompilation issue!!! */
    public final <T> Object runMigrations(List<? extends DataMigration<T>> list, InitializerApi<T> initializerApi, Continuation<? super Unit> continuation) throws Throwable {
        C1771d c1771d;
        List list2;
        F f10;
        Iterator<T> it;
        Throwable th;
        Function1 function1;
        if (continuation instanceof C1771d) {
            c1771d = (C1771d) continuation;
            int i7 = c1771d.f38031e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c1771d.f38031e = i7 - Integer.MIN_VALUE;
            } else {
                c1771d = new C1771d(this, continuation);
            }
        } else {
            c1771d = new C1771d(this, continuation);
        }
        Object obj = c1771d.f38029c;
        a aVar = a.f2423a;
        int i10 = c1771d.f38031e;
        if (i10 == 0) {
            g.M(obj);
            ArrayList arrayList = new ArrayList();
            Function2<? super T, ? super Continuation<? super T>, ? extends Object> c1773f = new C1773f(list, arrayList, null);
            c1771d.f38027a = arrayList;
            c1771d.f38031e = 1;
            if (initializerApi.updateData(c1773f, c1771d) != aVar) {
                list2 = arrayList;
            }
            return aVar;
        }
        if (i10 == 1) {
            list2 = (List) c1771d.f38027a;
            g.M(obj);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c1771d.f38028b;
            f10 = (F) c1771d.f38027a;
            try {
                g.M(obj);
            } catch (Throwable th2) {
                Object obj2 = f10.f38951a;
                if (obj2 == null) {
                    f10.f38951a = th2;
                } else {
                    C2126e.a((Throwable) obj2, th2);
                }
            }
        }
        while (it.hasNext()) {
            function1 = (Function1) it.next();
            c1771d.f38027a = f10;
            c1771d.f38028b = it;
            c1771d.f38031e = 2;
            if (function1.invoke(c1771d) == aVar) {
                return aVar;
            }
        }
        th = (Throwable) f10.f38951a;
        if (th == null) {
            return Unit.f38893a;
        }
        throw th;
        f10 = new F();
        it = list2.iterator();
        while (it.hasNext()) {
            function1 = (Function1) it.next();
            c1771d.f38027a = f10;
            c1771d.f38028b = it;
            c1771d.f38031e = 2;
            if (function1.invoke(c1771d) == aVar) {
                return aVar;
            }
        }
        th = (Throwable) f10.f38951a;
        if (th == null) {
            return Unit.f38893a;
        }
        throw th;
    }

    @NotNull
    public final <T> Function2<InitializerApi<T>, Continuation<? super Unit>, Object> getInitializer(@NotNull List<? extends DataMigration<T>> migrations) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        return new C1770c(migrations, null);
    }

    private C1774g() {
    }
}
