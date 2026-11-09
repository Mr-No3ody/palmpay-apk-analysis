package p164l0;

import E0.h;
import Ef.a;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.camera.core.impl.utils.executor.g;
import androidx.datastore.core.DataMigration;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import p178m0.l;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes.dex */
public final class c implements DataMigration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f39254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ma.l f39255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f39256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f39258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f39259f;

    public c(Context context, String sharedPreferencesName, Set keysToMigrate, l shouldRunMigration, Ma.l migrate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
        h hVar = new h(4, context, sharedPreferencesName);
        this.f39254a = shouldRunMigration;
        this.f39255b = migrate;
        this.f39256c = context;
        this.f39257d = sharedPreferencesName;
        this.f39258e = C2131j.b(hVar);
        this.f39259f = keysToMigrate == d.f39260a ? null : CollectionsKt.a0(keysToMigrate);
    }

    @Override // androidx.datastore.core.DataMigration
    public final Object cleanUp(Continuation continuation) throws IOException {
        Context context;
        String str;
        t tVar = this.f39258e;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) tVar.getValue()).edit();
        LinkedHashSet linkedHashSet = this.f39259f;
        if (linkedHashSet == null) {
            editorEdit.clear();
        } else {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (((SharedPreferences) tVar.getValue()).getAll().isEmpty() && (context = this.f39256c) != null && (str = this.f39257d) != null) {
            a.a(context, str);
        }
        if (linkedHashSet != null) {
            linkedHashSet.clear();
        }
        return Unit.f38893a;
    }

    @Override // androidx.datastore.core.DataMigration
    public final Object migrate(Object obj, Continuation continuation) {
        return this.f39255b.invoke(new e((SharedPreferences) this.f39258e.getValue(), this.f39259f), obj, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.DataMigration
    public final Object shouldMigrate(Object obj, Continuation continuation) {
        b bVar;
        c cVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i7 = bVar.f39253d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                bVar.f39253d = i7 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, continuation);
            }
        } else {
            bVar = new b(this, continuation);
        }
        Object objInvoke = bVar.f39251b;
        a aVar = a.f2423a;
        int i10 = bVar.f39253d;
        boolean z3 = true;
        if (i10 == 0) {
            g.M(objInvoke);
            bVar.f39250a = this;
            bVar.f39253d = 1;
            objInvoke = this.f39254a.invoke(obj, bVar);
            if (objInvoke == aVar) {
                return aVar;
            }
            cVar = this;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = bVar.f39250a;
            g.M(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boolean.FALSE;
        }
        LinkedHashSet linkedHashSet = cVar.f39259f;
        t tVar = cVar.f39258e;
        if (linkedHashSet == null) {
            Map<String, ?> all = ((SharedPreferences) tVar.getValue()).getAll();
            Intrinsics.checkNotNullExpressionValue(all, "sharedPrefs.all");
            if (all.isEmpty()) {
                z3 = false;
            }
        } else {
            SharedPreferences sharedPreferences = (SharedPreferences) tVar.getValue();
            if (linkedHashSet.isEmpty()) {
                z3 = false;
            } else {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    if (sharedPreferences.contains((String) it.next())) {
                    }
                }
                z3 = false;
            }
        }
        return Boolean.valueOf(z3);
    }
}
