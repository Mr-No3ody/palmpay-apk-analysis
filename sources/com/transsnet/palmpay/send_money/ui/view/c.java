package com.transsnet.palmpay.send_money.ui.view;

import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferToFastTransferSafeguardProgressModel f33947a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TransferToFastTransferSafeguardProgressModel transferToFastTransferSafeguardProgressModel, Continuation continuation) {
        super(2, continuation);
        this.f33947a = transferToFastTransferSafeguardProgressModel;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f33947a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((c) create(bool, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        TransferToFastTransferSafeguardProgressModel.OnFastTransferSafeguardListener onFastTransferSafeguardListener;
        Ef.a aVar = Ef.a.f2423a;
        g.M(obj);
        TransferToFastTransferSafeguardProgressModel transferToFastTransferSafeguardProgressModel = this.f33947a;
        if (!transferToFastTransferSafeguardProgressModel.f33927j && (onFastTransferSafeguardListener = transferToFastTransferSafeguardProgressModel.f33928o) != null) {
            onFastTransferSafeguardListener.onCountdownFinish();
        }
        return Unit.f38893a;
    }
}
