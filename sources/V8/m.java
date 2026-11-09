package V8;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.transsnet.palmpay.account.bean.SignUpRetainDialogConfig;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStep1Fragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationStep1Fragment f10144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignUpRetainDialogConfig f10145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Drawable f10146c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(IdentityVerificationStep1Fragment identityVerificationStep1Fragment, SignUpRetainDialogConfig signUpRetainDialogConfig, Drawable drawable, Continuation continuation) {
        super(2, continuation);
        this.f10144a = identityVerificationStep1Fragment;
        this.f10145b = signUpRetainDialogConfig;
        this.f10146c = drawable;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new m(this.f10144a, this.f10145b, this.f10146c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        PreCheckPhoneRsp preCheckPhoneRsp;
        String str;
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IdentityVerificationStep1Fragment identityVerificationStep1Fragment = this.f10144a;
        Context context = identityVerificationStep1Fragment.getContext();
        int i7 = F8.c.ac_quit_icon_6;
        SignUpRetainDialogConfig signUpRetainDialogConfig = this.f10145b;
        String str2 = null;
        if (TextUtils.isEmpty(signUpRetainDialogConfig != null ? signUpRetainDialogConfig.title : null)) {
            int i10 = IdentityVerificationStep1Fragment.f26173w;
            IdentityVerificationActivity identityVerificationActivityA = identityVerificationStep1Fragment.A();
            if (identityVerificationActivityA == null || (preCheckPhoneRsp = identityVerificationActivityA.f25869i) == null) {
                str = null;
            } else {
                str = preCheckPhoneRsp.idBonusTitle;
            }
        } else if (signUpRetainDialogConfig != null) {
            str = signUpRetainDialogConfig.title;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(signUpRetainDialogConfig != null ? signUpRetainDialogConfig.content : null)) {
            str2 = "Today only!\nVerify your ID to get it.";
        } else if (signUpRetainDialogConfig != null) {
            str2 = signUpRetainDialogConfig.content;
        }
        return L8.a.d(context, str, new Integer(i7), this.f10146c, str2, new Integer(F8.h.ac_continue), null, new l(identityVerificationStep1Fragment, 6), null, null, new l(identityVerificationStep1Fragment, 7), 5952);
    }
}
