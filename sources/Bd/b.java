package Bd;

import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends Ff.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KkCarPayResultDialog f895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f896c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(KkCarPayResultDialog kkCarPayResultDialog, Continuation continuation) {
        super(continuation);
        this.f895b = kkCarPayResultDialog;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f894a = obj;
        this.f896c |= Integer.MIN_VALUE;
        return this.f895b.pollOrderOnce(this);
    }
}
