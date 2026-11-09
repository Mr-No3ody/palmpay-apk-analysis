package com.transsnet.palmpay.core.ui.dialog;

import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UssdDialingDialog f27822a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(UssdDialingDialog ussdDialingDialog, Continuation continuation) {
        super(2, continuation);
        this.f27822a = ussdDialingDialog;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f27822a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((a) create(bool, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        g.M(obj);
        UssdDialingDialog ussdDialingDialog = this.f27822a;
        if (!ussdDialingDialog.initiativeCancel) {
            ussdDialingDialog.getTv_second().setText("0s");
            ussdDialingDialog.dismiss();
            UssdDialingDialog.OnUssdDialingListener onUssdDialingListener = ussdDialingDialog.listener;
            if (onUssdDialingListener != null) {
                onUssdDialingListener.onCountdownCompleted();
            }
        }
        return Unit.f38893a;
    }
}
