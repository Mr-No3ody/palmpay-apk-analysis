package V8;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.transsnet.palmpay.account.bean.SignUpRetainDialogConfig;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationAddressFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: V8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0711e extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationAddressFragment f10125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignUpRetainDialogConfig f10126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Drawable f10127c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0711e(IdentityVerificationAddressFragment identityVerificationAddressFragment, SignUpRetainDialogConfig signUpRetainDialogConfig, Drawable drawable, Continuation continuation) {
        super(2, continuation);
        this.f10125a = identityVerificationAddressFragment;
        this.f10126b = signUpRetainDialogConfig;
        this.f10127c = drawable;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0711e(this.f10125a, this.f10126b, this.f10127c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0711e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IdentityVerificationAddressFragment identityVerificationAddressFragment = this.f10125a;
        Context context = identityVerificationAddressFragment.getContext();
        String str2 = null;
        SignUpRetainDialogConfig signUpRetainDialogConfig = this.f10126b;
        if (TextUtils.isEmpty(signUpRetainDialogConfig != null ? signUpRetainDialogConfig.title : null)) {
            str = "Fill your address";
        } else {
            str = signUpRetainDialogConfig != null ? signUpRetainDialogConfig.title : null;
        }
        if (TextUtils.isEmpty(signUpRetainDialogConfig != null ? signUpRetainDialogConfig.content : null)) {
            str2 = "Final Step! Activate your PalmPay account now to use the bonuses!";
        } else if (signUpRetainDialogConfig != null) {
            str2 = signUpRetainDialogConfig.content;
        }
        L8.a.d(context, str, null, this.f10127c, str2, null, "Fill Now", null, new Integer(F8.h.ac_quit), new ViewOnClickListenerC0710d(identityVerificationAddressFragment, 5), null, 6820);
        return Unit.f38893a;
    }
}
