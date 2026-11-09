package N8;

import Wf.AbstractC0780y;
import android.text.TextUtils;
import com.transsnet.palmpay.account.bean.SignUpRetainDialogConfig;
import com.transsnet.palmpay.account.bean.rsp.UploadAppsFlyerRsp;
import com.transsnet.palmpay.account.business.IApiAccountService;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: N8.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0464h extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IdentityVerificationActivity f6216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationActivity f6218c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0464h(IdentityVerificationActivity identityVerificationActivity, Continuation continuation) {
        super(2, continuation);
        this.f6218c = identityVerificationActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0464h(this.f6218c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0464h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        IdentityVerificationActivity identityVerificationActivity;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f6217b;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                String strH = p059e1.a.H("firebase_sp_appsflyer_campaign");
                if (TextUtils.isEmpty(strH)) {
                    strH = null;
                }
                if (strH != null) {
                    IdentityVerificationActivity identityVerificationActivity2 = this.f6218c;
                    IApiAccountService iApiAccountServiceT = G8.a.t();
                    this.f6216a = identityVerificationActivity2;
                    this.f6217b = 1;
                    obj = iApiAccountServiceT.getPopupDialogConfig(strH, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    identityVerificationActivity = identityVerificationActivity2;
                }
                return Unit.f38893a;
            }
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            identityVerificationActivity = this.f6216a;
            androidx.camera.core.impl.utils.executor.g.M(obj);
            CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
            if (commonBeanResult != null && commonBeanResult.isSuccess()) {
                UploadAppsFlyerRsp uploadAppsFlyerRsp = (UploadAppsFlyerRsp) commonBeanResult.data;
                List<SignUpRetainDialogConfig> list = uploadAppsFlyerRsp != null ? uploadAppsFlyerRsp.popupContents : null;
                int i10 = IdentityVerificationActivity.f25861A;
                identityVerificationActivity.getClass();
                List<SignUpRetainDialogConfig> list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    if (identityVerificationActivity.f25874w == null) {
                        identityVerificationActivity.f25874w = new ArrayList();
                    }
                    List list3 = identityVerificationActivity.f25874w;
                    if (list3 != null) {
                        list3.addAll(list2);
                    }
                    AbstractC0780y.m(androidx.lifecycle.V.f(identityVerificationActivity), null, null, new C0466j(null, list, identityVerificationActivity), 3);
                }
            }
        } catch (Exception unused) {
        }
        return Unit.f38893a;
    }
}
