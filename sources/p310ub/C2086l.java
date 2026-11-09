package p310ub;

import C0.G;
import Db.C0195l;
import Ya.g;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.credit.bean.req.OcApplyReq;
import com.transsnet.palmpay.credit.bean.resp.CLInitData;
import com.transsnet.palmpay.credit.bean.resp.CLInitResp;
import com.transsnet.palmpay.credit.bean.resp.OcApplyResultData;
import com.transsnet.palmpay.credit.bean.resp.OcApplyResultResp;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyLiteActivity;
import com.transsnet.palmpay.credit.ui.viewmodel.OcApplyLiteViewModel;
import df.d;
import io.reactivex.internal.operators.observable.C1765q;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.c;
import p071ef.b;
import p147jf.a;
import p161kf.e;
import p220oa.h;
import p298tf.f;
import p355xf.l;

/* JADX INFO: renamed from: ub.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2086l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OcApplyLiteActivity f42883b;

    public /* synthetic */ C2086l(OcApplyLiteActivity ocApplyLiteActivity, int i7) {
        this.f42882a = i7;
        this.f42883b = ocApplyLiteActivity;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int size;
        switch (this.f42882a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof o)) {
                    boolean z3 = it instanceof p;
                    OcApplyLiteActivity ocApplyLiteActivity = this.f42883b;
                    if (z3) {
                        OcApplyResultResp ocApplyResultResp = (OcApplyResultResp) ((p) it).f27360a;
                        if (ocApplyResultResp.isSuccess()) {
                            OcApplyResultData data = ocApplyResultResp.getData();
                            Integer applyStatus = data != null ? data.getApplyStatus() : null;
                            if (applyStatus != null && applyStatus.intValue() == 1) {
                                c.b().f(new MessageEvent(MessageEvent.EVENT_OC_ACTIVE_FINISH));
                                ocApplyLiteActivity.finish();
                            } else if (applyStatus != null && applyStatus.intValue() == 2) {
                                h.x(ocApplyLiteActivity, ocApplyLiteActivity.getString(g.cs_msg_apply_okcard_fail));
                                ocApplyLiteActivity.finish();
                            } else {
                                C1765q c1765qI = d.h(Boolean.TRUE).e(10L, TimeUnit.SECONDS, f.f42629b).i(b.a());
                                e eVar = new e(new org.greenrobot.eventbus.f(new C2086l(ocApplyLiteActivity, 2)), a.f38601e, a.f38599c);
                                c1765qI.subscribe(eVar);
                                ocApplyLiteActivity.addSubscription(eVar);
                            }
                        } else {
                            ocApplyLiteActivity.showLoadingDialog(false);
                            String respMsg = ocApplyResultResp.getRespMsg();
                            ocApplyLiteActivity.showLoadingDialog(false);
                            h.x(ocApplyLiteActivity, respMsg);
                            ocApplyLiteActivity.finish();
                        }
                    } else if (!(it instanceof m)) {
                        if (!(it instanceof n)) {
                            throw new l();
                        }
                        String str = ((n) it).f27358a;
                        ocApplyLiteActivity.showLoadingDialog(false);
                        h.x(ocApplyLiteActivity, str);
                    }
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof o)) {
                    boolean z8 = it2 instanceof p;
                    OcApplyLiteActivity context = this.f42883b;
                    if (z8) {
                        CLInitResp cLInitResp = (CLInitResp) ((p) it2).f27360a;
                        if (cLInitResp.isSuccess()) {
                            Integer numValueOf = Integer.valueOf(context.f29264B);
                            Intrinsics.checkNotNullParameter(context, "context");
                            try {
                                PackageManager packageManager = context.getPackageManager();
                                List<PackageInfo> installedPackages = packageManager != null ? packageManager.getInstalledPackages(0) : null;
                                List<PackageInfo> list = installedPackages;
                                size = (list != null && !list.isEmpty()) ? installedPackages.size() : 0;
                                break;
                            } catch (Exception unused) {
                            }
                            Integer numValueOf2 = Integer.valueOf(size);
                            CLInitData data2 = cLInitResp.getData();
                            OcApplyReq req = new OcApplyReq("CASHIER_PAGE", numValueOf, "", numValueOf2, false, false, data2 != null ? data2.getApplyId() : null, null, null, null, null, null, null, null, null, 32640, null);
                            OcApplyLiteViewModel ocApplyLiteViewModel = (OcApplyLiteViewModel) context.l();
                            ocApplyLiteViewModel.getClass();
                            Intrinsics.checkNotNullParameter(req, "req");
                            p140j8.f.s(ocApplyLiteViewModel, new C0195l(req, null), ocApplyLiteViewModel.f30688e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        } else {
                            h.x(context, cLInitResp.getRespMsg());
                        }
                    } else if (!(it2 instanceof m)) {
                        if (!(it2 instanceof n)) {
                            throw new l();
                        }
                        h.x(context, ((n) it2).f27358a);
                        context.showLoadingDialog(false);
                    }
                }
                return Unit.f38893a;
            default:
                G.u(MessageEvent.EVENT_OC_ACTIVE_FINISH, c.b());
                this.f42883b.finish();
                return Unit.f38893a;
        }
    }

    public C2086l(OcApplyLiteActivity ocApplyLiteActivity, OcApplyLiteActivity ocApplyLiteActivity2) {
        this.f42882a = 0;
        this.f42883b = ocApplyLiteActivity2;
    }
}
