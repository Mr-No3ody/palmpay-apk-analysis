package V8;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.transsnet.palmpay.account.bean.SignUpRetainDialogConfig;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationUserProfileFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class C extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationUserProfileFragment f10108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignUpRetainDialogConfig f10109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Drawable f10110c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(IdentityVerificationUserProfileFragment identityVerificationUserProfileFragment, SignUpRetainDialogConfig signUpRetainDialogConfig, Drawable drawable, Continuation continuation) {
        super(2, continuation);
        this.f10108a = identityVerificationUserProfileFragment;
        this.f10109b = signUpRetainDialogConfig;
        this.f10110c = drawable;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C(this.f10108a, this.f10109b, this.f10110c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IdentityVerificationUserProfileFragment identityVerificationUserProfileFragment = this.f10108a;
        Context context = identityVerificationUserProfileFragment.getContext();
        String str2 = null;
        SignUpRetainDialogConfig signUpRetainDialogConfig = this.f10109b;
        if (TextUtils.isEmpty(signUpRetainDialogConfig != null ? signUpRetainDialogConfig.title : null)) {
            str = "Stay with us to complete this important step!";
        } else {
            str = signUpRetainDialogConfig != null ? signUpRetainDialogConfig.title : null;
        }
        if (TextUtils.isEmpty(signUpRetainDialogConfig != null ? signUpRetainDialogConfig.content : null)) {
            str2 = "We value your participation! By providing your PEP information, you help us enhance security and ensure compliance.";
        } else if (signUpRetainDialogConfig != null) {
            str2 = signUpRetainDialogConfig.content;
        }
        L8.a.d(context, str, null, this.f10110c, str2, new Integer(p025ba.k.core_continue), null, null, new Integer(F8.h.ac_quit), new x(identityVerificationUserProfileFragment, 7), null, 6852);
        return Unit.f38893a;
    }
}
