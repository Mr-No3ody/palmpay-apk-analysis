package V5;

import com.nimbusds.jose.shaded.gson.TypeAdapterFactory;
import com.nimbusds.jose.shaded.gson.z;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements TypeAdapterFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f10058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f10059c;

    public /* synthetic */ u(Class cls, z zVar, int i7) {
        this.f10057a = i7;
        this.f10058b = cls;
        this.f10059c = zVar;
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
    public final z create(com.nimbusds.jose.shaded.gson.m mVar, com.nimbusds.jose.shaded.gson.reflect.a aVar) {
        switch (this.f10057a) {
            case 0:
                if (aVar.f23689a == this.f10058b) {
                    return this.f10059c;
                }
                return null;
            default:
                Class<?> cls = aVar.f23689a;
                if (this.f10058b.isAssignableFrom(cls)) {
                    return new b(this, cls);
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.f10057a) {
            case 0:
                return "Factory[type=" + this.f10058b.getName() + ",adapter=" + this.f10059c + "]";
            default:
                return "Factory[typeHierarchy=" + this.f10058b.getName() + ",adapter=" + this.f10059c + "]";
        }
    }
}
