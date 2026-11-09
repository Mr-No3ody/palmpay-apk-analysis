package F6;

import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import com.nimbusds.jose.shaded.gson.p;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ObjectConstructor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2600a;

    public /* synthetic */ c(String str) {
        this.f2600a = str;
    }

    @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
    public Object construct() {
        throw new p(this.f2600a, 10, false);
    }
}
