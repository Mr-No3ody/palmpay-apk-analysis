package p136j2;

import com.facebook.common.internal.Supplier;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f38178a;

    public a(b bVar) {
        this.f38178a = bVar;
    }

    @Override // com.facebook.common.internal.Supplier
    public final Object get() {
        b bVar = this.f38178a;
        bVar.f38189k.getClass();
        return bVar.f38189k.getApplicationContext().getCacheDir();
    }
}
