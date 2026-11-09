package J;

import androidx.core.util.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4447a;

    public /* synthetic */ a(int i7) {
        this.f4447a = i7;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v54 androidx.camera.core.impl.y0, still in use, count: 3, list:
          (r1v54 androidx.camera.core.impl.y0) from 0x007c: MOVE (r18v1 androidx.camera.core.impl.y0) = (r1v54 androidx.camera.core.impl.y0) (LINE:125)
          (r1v54 androidx.camera.core.impl.y0) from 0x0071: MOVE (r18v3 androidx.camera.core.impl.y0) = (r1v54 androidx.camera.core.impl.y0) (LINE:114)
          (r1v54 androidx.camera.core.impl.y0) from 0x0054: MOVE (r18v6 androidx.camera.core.impl.y0) = (r1v54 androidx.camera.core.impl.y0) (LINE:85)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // androidx.core.util.Consumer
    public final void accept(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 2436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J.a.accept(java.lang.Object):void");
    }
}
