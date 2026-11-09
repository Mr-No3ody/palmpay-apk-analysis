package E;

import android.util.Size;
import androidx.camera.core.impl.C0980g0;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.UseCaseConfig;

/* JADX INFO: loaded from: classes.dex */
public final class B implements ConfigProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0980g0 f1887a;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    static {
        Object size = new Size(640, 480);
        C0216v c0216v = C0216v.f2122d;
        Object bVar = new I.b(I.a.f3952b, new I.c(androidx.camera.core.internal.utils.d.f14363c), null);
        A a3 = new A();
        androidx.camera.core.impl.V v3 = ImageOutputConfig.f13900E;
        C0992m0 c0992m0 = a3.f1886a;
        c0992m0.insertOption(v3, size);
        c0992m0.insertOption(UseCaseConfig.f13986R, 1);
        a3.b(0);
        c0992m0.insertOption(ImageOutputConfig.f13903I, bVar);
        if (!c0216v.equals(c0216v)) {
            throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
        }
        c0992m0.insertOption(ImageInputConfig.f13898s, c0216v);
        f1887a = new C0980g0(C1000q0.a(c0992m0));
    }

    @Override // androidx.camera.core.impl.ConfigProvider
    public final Config getConfig() {
        return f1887a;
    }
}
