package N8;

import android.content.Intent;
import android.text.TextUtils;
import com.transsnet.palmpay.account.ui.activity.PinSafeWithPatternActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class C extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PinSafeWithPatternActivity f6136a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(PinSafeWithPatternActivity pinSafeWithPatternActivity, Continuation continuation) {
        super(2, continuation);
        this.f6136a = pinSafeWithPatternActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C(this.f6136a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PinSafeWithPatternActivity pinSafeWithPatternActivity = this.f6136a;
        pinSafeWithPatternActivity.showLoadingDialog(false);
        ActivityUtils.finishAllActivitiesExceptNewest();
        Pa.A.a();
        try {
            Intent intent = new Intent();
            intent.setClassName(BaseApplication.getContext(), TextUtils.isEmpty(Pa.i0.y()) ? "com.transsnet.palmpay.account.ui.activity.SignUpActivity" : "com.transsnet.palmpay.account.ui.activity.LogInActivity");
            intent.putExtra("extra_data", BaseApplication.getCountryLocale());
            intent.addFlags(32768);
            ActivityUtils.startActivity(intent);
        } catch (Exception unused) {
        }
        pinSafeWithPatternActivity.finish();
        return Unit.f38893a;
    }
}
