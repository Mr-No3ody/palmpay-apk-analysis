package M7;

import com.swmansion.rnscreens.NativeProxy;
import com.swmansion.rnscreens.Screen;

/* JADX INFO: renamed from: M7.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0447g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Screen f5818b;

    public /* synthetic */ RunnableC0447g(Screen screen, int i7) {
        this.f5817a = i7;
        this.f5818b = screen;
    }

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
    @Override // java.lang.Runnable
    public final void run() {
        Screen screen = this.f5818b;
        switch (this.f5817a) {
            case 0:
                NativeProxy.a aVar = NativeProxy.f25273a;
                if (!screen.f25278C) {
                    screen.f25278C = true;
                    screen.g(screen);
                }
                break;
            default:
                int i7 = Screen.f25275A0;
                screen.getParent().requestLayout();
                screen.e();
                break;
        }
    }
}
