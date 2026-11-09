package V5;

import com.nimbusds.jose.shaded.gson.TypeAdapterFactory;
import com.nimbusds.jose.shaded.gson.y;
import com.nimbusds.jose.shaded.gson.z;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements TypeAdapterFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10022b;

    public /* synthetic */ k(Object obj, int i7) {
        this.f10021a = i7;
        this.f10022b = obj;
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
    public final z create(com.nimbusds.jose.shaded.gson.m mVar, com.nimbusds.jose.shaded.gson.reflect.a aVar) {
        switch (this.f10021a) {
            case 0:
                if (aVar.f23689a == Number.class) {
                    return (l) this.f10022b;
                }
                return null;
            case 1:
                if (aVar.f23689a == Object.class) {
                    return new m(mVar, (y) this.f10022b);
                }
                return null;
            default:
                Class cls = aVar.f23689a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (l) this.f10022b;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f10021a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((l) this.f10022b) + "]";
            default:
                return super.toString();
        }
    }
}
