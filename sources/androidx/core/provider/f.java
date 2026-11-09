package androidx.core.provider;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f16117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16119e;

    public /* synthetic */ f(String str, Context context, Object obj, int i7, int i10) {
        this.f16115a = i10;
        this.f16116b = str;
        this.f16117c = context;
        this.f16119e = obj;
        this.f16118d = i7;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f16115a) {
            case 0:
                Object[] objArr = {(e) this.f16119e};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return i.b(this.f16116b, this.f16117c, Collections.unmodifiableList(arrayList), this.f16118d);
            default:
                try {
                    return i.b(this.f16116b, this.f16117c, (List) this.f16119e, this.f16118d);
                } catch (Throwable unused) {
                    return new h(-3);
                }
        }
    }
}
