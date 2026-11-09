package Ua;

import Wf.AbstractC0777v;
import android.os.SystemClock;
import android.widget.TextView;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV5View;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f9469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ OneTimeCodeV5View f9470d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(long j6, OneTimeCodeV5View oneTimeCodeV5View, Continuation continuation) {
        super(2, continuation);
        this.f9469c = j6;
        this.f9470d = oneTimeCodeV5View;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        r0 r0Var = new r0(this.f9469c, this.f9470d, continuation);
        r0Var.f9468b = obj;
        return r0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f9467a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            coroutineScope = (CoroutineScope) this.f9468b;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.f9468b;
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        while (AbstractC0777v.e(coroutineScope)) {
            long jElapsedRealtime = (((long) OneTimeCodeV5View.f28495A) + this.f9469c) - SystemClock.elapsedRealtime();
            OneTimeCodeV5View oneTimeCodeV5View = this.f9470d;
            if (jElapsedRealtime <= 0) {
                p142ja.f fVar = oneTimeCodeV5View.f28496c;
                if (fVar != null && (textView3 = fVar.tvTime) != null) {
                    textView3.setText("");
                }
                p142ja.f fVar2 = oneTimeCodeV5View.f28496c;
                if (fVar2 != null && (textView2 = fVar2.tvTime) != null) {
                    textView2.setVisibility(8);
                }
                oneTimeCodeV5View.setSendOtcButtonState(true);
                p142ja.f fVar3 = oneTimeCodeV5View.f28496c;
                if (fVar3 != null && (textView = fVar3.textViewSendSms) != null) {
                    textView.setText(oneTimeCodeV5View.getContext().getString(p025ba.k.core_resend));
                    break;
                }
                break;
                break;
            }
            if (oneTimeCodeV5View.f28499f && jElapsedRealtime <= 50000) {
                oneTimeCodeV5View.o();
                oneTimeCodeV5View.f28499f = false;
            }
            p142ja.f fVar4 = oneTimeCodeV5View.f28496c;
            if (fVar4 != null && (textView5 = fVar4.tvTime) != null) {
                textView5.setEnabled(false);
            }
            p142ja.f fVar5 = oneTimeCodeV5View.f28496c;
            if (fVar5 != null && (textView4 = fVar5.tvTime) != null) {
                textView4.setText("Resend (" + (jElapsedRealtime / ((long) 1000)) + "s)");
            }
            this.f9468b = coroutineScope;
            this.f9467a = 1;
            if (Wf.D.b(1000L, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f38893a;
    }
}
