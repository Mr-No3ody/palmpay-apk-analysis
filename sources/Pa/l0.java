package Pa;

import B6.RunnableC0085g;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends Z4.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f7101b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, String str) {
        super(str);
        this.f7101b = n0Var;
    }

    @Override // Z4.d, com.growingio.android.sdk.track.events.EventBuildInterceptor
    public final void eventDidBuild(p216o5.d dVar) {
        n0 n0Var = this.f7101b;
        n0Var.getClass();
        if (dVar instanceof p094g5.d) {
            p094g5.d dVar2 = (p094g5.d) dVar;
            String strB = p111h5.d.b(dVar2.f36853q0);
            if ("click_notification_message".equals(strB) || "receive_push_message".equals(strB)) {
                T.b(-4).execute(new RunnableC0085g(19, n0Var, dVar2.c()));
            }
        }
    }
}
