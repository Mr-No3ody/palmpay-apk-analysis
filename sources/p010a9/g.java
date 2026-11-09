package p010a9;

import Ef.a;
import F8.c;
import Ff.h;
import W8.d;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.TextUtils;
import com.transsnet.palmpay.account.bean.SignUpRetainDialogConfig;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStep1Fragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SignUpStep1Fragment f11841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignUpRetainDialogConfig f11842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Drawable f11843c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SignUpStep1Fragment signUpStep1Fragment, SignUpRetainDialogConfig signUpRetainDialogConfig, Drawable drawable, Continuation continuation) {
        super(2, continuation);
        this.f11841a = signUpStep1Fragment;
        this.f11842b = signUpRetainDialogConfig;
        this.f11843c = drawable;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f11841a, this.f11842b, this.f11843c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        String str;
        a aVar = a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        SignUpStep1Fragment signUpStep1Fragment = this.f11841a;
        Context context = signUpStep1Fragment.getContext();
        CharSequence charSequenceFromHtml = null;
        SignUpRetainDialogConfig signUpRetainDialogConfig = this.f11842b;
        if (TextUtils.isEmpty(signUpRetainDialogConfig != null ? signUpRetainDialogConfig.title : null)) {
            str = "Join PalmPay";
        } else {
            str = signUpRetainDialogConfig != null ? signUpRetainDialogConfig.title : null;
        }
        Integer num = new Integer(c.ac_quit_icon_4);
        if (TextUtils.isEmpty(signUpRetainDialogConfig != null ? signUpRetainDialogConfig.content : null)) {
            charSequenceFromHtml = Html.fromHtml(signUpStep1Fragment.getString(F8.h.ac_msg_quit_sign_up_1), 0);
        } else if (signUpRetainDialogConfig != null) {
            charSequenceFromHtml = signUpRetainDialogConfig.content;
        }
        L8.a.d(context, str, num, this.f11843c, charSequenceFromHtml, new Integer(F8.h.ac_continue), null, new d(17), new Integer(F8.h.ac_cancel), new a(signUpStep1Fragment, 7), null, 6720);
        return Unit.f38893a;
    }
}
