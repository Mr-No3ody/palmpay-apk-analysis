package p010a9;

import Bc.C0105b;
import Ef.a;
import F8.c;
import Ff.h;
import W8.d;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.account.bean.SignUpRetainDialogConfig;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStepOtcFragment;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV5View;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.KeyboardUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SignUpStepOtcFragment f11862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignUpRetainDialogConfig f11863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Drawable f11864c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(SignUpStepOtcFragment signUpStepOtcFragment, SignUpRetainDialogConfig signUpRetainDialogConfig, Drawable drawable, Continuation continuation) {
        super(2, continuation);
        this.f11862a = signUpStepOtcFragment;
        this.f11863b = signUpRetainDialogConfig;
        this.f11864c = drawable;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new s(this.f11862a, this.f11863b, this.f11864c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        String strString;
        a aVar = a.f2423a;
        g.M(obj);
        SignUpStepOtcFragment signUpStepOtcFragment = this.f11862a;
        C0105b c0105b = signUpStepOtcFragment.f26280j;
        if (c0105b != null) {
            ((OneTimeCodeV5View) c0105b.f667g).h();
        }
        KeyboardUtils.hideSoftInput(signUpStepOtcFragment.getActivity());
        Context context = signUpStepOtcFragment.getContext();
        int i7 = c.ac_quit_icon_2;
        String string = null;
        SignUpRetainDialogConfig signUpRetainDialogConfig = this.f11863b;
        if (TextUtils.isEmpty(signUpRetainDialogConfig != null ? signUpRetainDialogConfig.title : null)) {
            strString = CommonViewExtKt.string(F8.h.ac_otp_may_be_delayed, signUpStepOtcFragment.getContext());
        } else {
            strString = signUpRetainDialogConfig != null ? signUpRetainDialogConfig.title : null;
        }
        if (TextUtils.isEmpty(signUpRetainDialogConfig != null ? signUpRetainDialogConfig.content : null)) {
            string = signUpStepOtcFragment.getString(F8.h.ac_confirm_quit_otp);
        } else if (signUpRetainDialogConfig != null) {
            string = signUpRetainDialogConfig.content;
        }
        String str = string;
        d dVar = new d(21);
        int i10 = F8.h.ac_cancel;
        L8.a.d(context, strString, new Integer(i7), this.f11864c, str, null, "Try Other Methods", dVar, new Integer(i10), new r(signUpStepOtcFragment, 1), null, 2592);
        return Unit.f38893a;
    }
}
