package p143jb;

import C0.G;
import F6.d;
import Z4.e;
import android.text.TextUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f38532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f38533g;

    public /* synthetic */ l(o oVar, int i7) {
        this.f38532f = i7;
        this.f38533g = oVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f38532f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f38533g.i().add(d2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f38533g.i().add(d2);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f38533g.i().add(d2);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f38533g.i().add(d2);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f38533g.i().add(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f38533g.i().add(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f38532f) {
            case 0:
                o oVar = this.f38533g;
                oVar.o();
                if (message != null) {
                    if ((!TextUtils.isEmpty(message) ? message : null) != null) {
                        ToastUtils.showLong(message, new Object[0]);
                    }
                }
                if (TextUtils.equals(oVar.f38553k, "PALMPAY_CARD")) {
                    oVar.f38555m--;
                }
                break;
            case 1:
                this.f38533g.B();
                if (message != null) {
                    if ((!TextUtils.isEmpty(message) ? message : null) != null) {
                        ToastUtils.showLong(message, new Object[0]);
                    }
                }
                break;
            case 2:
                this.f38533g.B();
                if (message != null) {
                    if ((!TextUtils.isEmpty(message) ? message : null) != null) {
                        ToastUtils.showShort(message, new Object[0]);
                    }
                }
                break;
            case 3:
                d.c("CreditRouterManager", G.o("loanRoute onFail >>> ", message));
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 4:
                this.f38533g.o();
                ToastUtils.showLong(message, new Object[0]);
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017a, code lost:
    
        if (android.text.TextUtils.equals((r13 == null || (r13 = (com.transsnet.palmpay.credit.bean.req.OcRouterDetail) r13.get(0)) == null) ? null : r13.getRoutePath(), "oc_permission_router") != false) goto L116;
     */
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
    @Override // Z4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.lang.Object r13) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p143jb.l.y(java.lang.Object):void");
    }
}
