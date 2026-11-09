package D;

import Ad.c0;
import androidx.camera.core.ExtendableBuilder;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableConfig;
import org.greenrobot.eventbus.f;

/* JADX INFO: loaded from: classes.dex */
public final class e implements ExtendableBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0992m0 f1584a = C0992m0.b();

    public static e b(Config config) {
        e eVar = new e();
        config.findOptions("camera2.captureRequest.option.", new c0(2, eVar, config));
        return eVar;
    }

    @Override // androidx.camera.core.ExtendableBuilder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f build() {
        return new f(C1000q0.a(this.f1584a), 2);
    }

    @Override // androidx.camera.core.ExtendableBuilder
    public final MutableConfig getMutableConfig() {
        return this.f1584a;
    }
}
