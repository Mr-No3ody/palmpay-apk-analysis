package Pa;

import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.internal.operators.observable.C1759k;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements ObservableTransformer, ObjectConstructor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7070b;

    public /* synthetic */ a0(String str, int i7) {
        this.f7069a = i7;
        this.f7070b = str;
    }

    @Override // io.reactivex.ObservableTransformer
    public ObservableSource apply(df.d dVar) {
        return new C1759k(dVar.k(p298tf.f.f42629b), new Ab.r(this, 4), p147jf.a.f38600d, p147jf.a.f38599c);
    }

    @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
    public Object construct() {
        throw new com.nimbusds.jose.shaded.gson.p(this.f7070b, 10, false);
    }

    public String toString() {
        switch (this.f7069a) {
            case 1:
                return androidx.camera.video.u.p(new StringBuilder("<"), this.f7070b, '>');
            default:
                return super.toString();
        }
    }
}
