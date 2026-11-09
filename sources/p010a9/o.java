package p010a9;

import Ef.a;
import Ff.h;
import W8.d;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.account.bean.SignUpRetainDialogConfig;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStepInputPinV2Fragment;
import com.transsnet.palmpay.core.viewmodel.c;
import com.transsnet.palmpay.util.KeyboardUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SignUpStepInputPinV2Fragment f11854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignUpRetainDialogConfig f11855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Drawable f11856c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(SignUpStepInputPinV2Fragment signUpStepInputPinV2Fragment, SignUpRetainDialogConfig signUpRetainDialogConfig, Drawable drawable, Continuation continuation) {
        super(2, continuation);
        this.f11854a = signUpStepInputPinV2Fragment;
        this.f11855b = signUpRetainDialogConfig;
        this.f11856c = drawable;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new o(this.f11854a, this.f11855b, this.f11856c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        String str;
        a aVar = a.f2423a;
        g.M(obj);
        SignUpStepInputPinV2Fragment signUpStepInputPinV2Fragment = this.f11854a;
        KeyboardUtils.hideSoftInput(signUpStepInputPinV2Fragment.getActivity());
        c cVar = signUpStepInputPinV2Fragment.t;
        if (cVar != null) {
            cVar.d();
        }
        Context context = signUpStepInputPinV2Fragment.getContext();
        String str2 = null;
        SignUpRetainDialogConfig signUpRetainDialogConfig = this.f11855b;
        if (TextUtils.isEmpty(signUpRetainDialogConfig != null ? signUpRetainDialogConfig.title : null)) {
            str = "Set PIN for Your Profile";
        } else {
            str = signUpRetainDialogConfig != null ? signUpRetainDialogConfig.title : null;
        }
        String str3 = str;
        Integer num = new Integer(F8.c.ac_quit_icon_1);
        if (TextUtils.isEmpty(signUpRetainDialogConfig != null ? signUpRetainDialogConfig.content : null)) {
            str2 = "Your profile is about to be created. Setting a PIN enhances security.";
        } else if (signUpRetainDialogConfig != null) {
            str2 = signUpRetainDialogConfig.content;
        }
        L8.a.d(context, str3, num, this.f11856c, str2, new Integer(F8.h.ac_continue), null, new d(19), new Integer(F8.h.ac_quit), new n(signUpStepInputPinV2Fragment, 4), null, 6720);
        return Unit.f38893a;
    }
}
