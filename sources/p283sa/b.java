package p283sa;

import android.os.Handler;
import com.transsnet.palmpay.core.location.help.ContinuousTask$ContinuousTaskRunner;
import kotlin.jvm.internal.Intrinsics;
import ta.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Handler implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f42099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f42100c;

    /* JADX WARN: Multi-variable type inference failed */
    public b(String taskId, ContinuousTask$ContinuousTaskRunner continuousTaskRunner) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(continuousTaskRunner, "continuousTaskRunner");
        this.f42098a = taskId;
        this.f42099b = new d(this);
        this.f42100c = (o) continuousTaskRunner;
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
    public final void a(long j6) {
        d dVar = this.f42099b;
        dVar.getClass();
        b bVar = dVar.f42101a;
        bVar.getClass();
        System.currentTimeMillis();
        System.currentTimeMillis();
        if (dVar.f42102b) {
            return;
        }
        bVar.postDelayed(bVar, j6);
        dVar.f42102b = true;
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
    public final void b() {
        d dVar = this.f42099b;
        b bVar = dVar.f42101a;
        bVar.removeCallbacks(bVar);
        dVar.f42102b = false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.transsnet.palmpay.core.location.help.ContinuousTask$ContinuousTaskRunner, ta.o] */
    @Override // java.lang.Runnable
    public final void run() {
        this.f42100c.runScheduledTask(this.f42098a);
    }
}
