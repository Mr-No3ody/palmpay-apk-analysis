package Ce;

import Pa.C0525w;
import Wf.AbstractC0780y;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.google.gson.Gson;
import com.transsnet.analysis.utils.StringUtil;
import com.transsnet.palmpay.main.export.bean.rsp.SlideMenuListRsp;
import com.transsnet.palmpay.ui.fragment.HomeMeFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class M extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SlideMenuListRsp f1436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HomeMeFragment f1437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SlideMenuListRsp f1438d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(SlideMenuListRsp slideMenuListRsp, HomeMeFragment homeMeFragment, SlideMenuListRsp slideMenuListRsp2, Continuation continuation) {
        super(2, continuation);
        this.f1436b = slideMenuListRsp;
        this.f1437c = homeMeFragment;
        this.f1438d = slideMenuListRsp2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new M(this.f1436b, this.f1437c, this.f1438d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        boolean z3;
        LinearLayout linearLayout;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f1435a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            String strEncryptMD5String = StringUtil.encryptMD5String(((Gson) C0525w.f().f7166b).toJson(this.f1436b.menuList));
            HomeMeFragment homeMeFragment = this.f1437c;
            if (!TextUtils.isEmpty(homeMeFragment.f35129j)) {
                Ke.d dVar = homeMeFragment.f35123C;
                z3 = ((dVar == null || (linearLayout = dVar.f5434a) == null) ? 0 : linearLayout.getChildCount()) <= 0 || !kotlin.text.y.h(homeMeFragment.f35129j, strEncryptMD5String, false);
            }
            homeMeFragment.f35129j = strEncryptMD5String;
            if (z3) {
                p042cg.f fVar = Wf.I.f10809a;
                Wf.p0 p0Var = p015ag.o.f11960a;
                L l5 = new L(homeMeFragment, this.f1438d, null);
                this.f1435a = 1;
                if (AbstractC0780y.s(p0Var, l5, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        return Unit.f38893a;
    }
}
