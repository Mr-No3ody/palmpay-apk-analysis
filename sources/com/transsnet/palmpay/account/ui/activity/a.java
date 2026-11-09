package com.transsnet.palmpay.account.ui.activity;

import Ff.h;
import Pa.F;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.account.bean.SignUpRsp;
import com.transsnet.palmpay.custom_view.m;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LogInActivity f26088a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LogInActivity logInActivity, Continuation continuation) {
        super(2, continuation);
        this.f26088a = logInActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f26088a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        g.M(obj);
        ActivityUtils.finishAllActivitiesExceptNewest();
        LogInActivity logInActivity = this.f26088a;
        SignUpRsp signUpRsp = logInActivity.f25887Z;
        if (!TextUtils.isEmpty(signUpRsp != null ? signUpRsp.jumpPath : null)) {
            SignUpRsp signUpRsp2 = logInActivity.f25887Z;
            if (!"/account/sign_up_success".equals(signUpRsp2 != null ? signUpRsp2.jumpPath : null)) {
                SignUpRsp signUpRsp3 = logInActivity.f25887Z;
                if ("/account/enableAutoSave".equals(signUpRsp3 != null ? signUpRsp3.jumpPath : null)) {
                    EnableCashBoxAutoSaveActivity.a aVar2 = EnableCashBoxAutoSaveActivity.f25851j;
                    SignUpRsp signUpRsp4 = logInActivity.f25887Z;
                    aVar2.launch(logInActivity, signUpRsp4 != null ? signUpRsp4.urlStep2 : null, null);
                } else {
                    SignUpRsp signUpRsp5 = logInActivity.f25887Z;
                    F.f(signUpRsp5 != null ? signUpRsp5.jumpPath : null, signUpRsp5 != null ? signUpRsp5.jumpType : null, signUpRsp5 != null ? signUpRsp5.jumpParams : null);
                }
            } else if (TextUtils.isEmpty(logInActivity.f25899v)) {
                logInActivity.r();
            } else {
                logInActivity.finish();
                logInActivity.overridePendingTransition(0, m.cv_anim_keep_activity_500ms);
            }
        } else if (TextUtils.isEmpty(logInActivity.f25899v) && F.g(logInActivity, logInActivity.f25899v)) {
            logInActivity.finish();
            logInActivity.overridePendingTransition(0, m.cv_anim_keep_activity_500ms);
        } else {
            logInActivity.r();
        }
        return Unit.f38893a;
    }
}
