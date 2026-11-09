package Wf;

import E.AbstractC0198c;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DelayWithTimeoutDiagnostics;

/* JADX INFO: loaded from: classes4.dex */
public final class z0 extends p015ag.r implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10922e;

    public z0(long j6, Ff.c cVar) {
        super(cVar, cVar.getContext());
        this.f10922e = j6;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Instruction removed from duplicated block: B:10:0x0020, please report this as an issue */
    @Override // java.lang.Runnable
    public final void run() {
        String strM125timeoutMessageLRDsOJo;
        Delay delayC = D.c(this.f10835c);
        DelayWithTimeoutDiagnostics delayWithTimeoutDiagnostics = delayC instanceof DelayWithTimeoutDiagnostics ? (DelayWithTimeoutDiagnostics) delayC : null;
        long j6 = this.f10922e;
        if (delayWithTimeoutDiagnostics != null) {
            Tf.b bVar = Tf.c.f9078b;
            strM125timeoutMessageLRDsOJo = delayWithTimeoutDiagnostics.m125timeoutMessageLRDsOJo(AbstractC0198c.i0(j6, Tf.e.MILLISECONDS));
            if (strM125timeoutMessageLRDsOJo == null) {
                strM125timeoutMessageLRDsOJo = "Timed out waiting for " + j6 + " ms";
            }
        } else {
            strM125timeoutMessageLRDsOJo = "Timed out waiting for " + j6 + " ms";
        }
        d(new y0(strM125timeoutMessageLRDsOJo, this));
    }

    @Override // Wf.n0
    public final String x() {
        return super.x() + "(timeMillis=" + this.f10922e + ')';
    }
}
