package Yf;

import Pa.a0;
import face.security.device.api.FaceSecCode;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f11422a = new w(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f11423b = p015ag.a.k(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f11424c = p015ag.a.k(FaceSecCode.SC_SUCCESS, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0 f11425d = new a0("BUFFERED", 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a0 f11426e = new a0("SHOULD_BUFFER", 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a0 f11427f = new a0("S_RESUMING_BY_RCV", 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a0 f11428g = new a0("RESUMING_BY_EB", 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a0 f11429h = new a0("POISONED", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a0 f11430i = new a0("DONE_RCV", 1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a0 f11431j = new a0("INTERRUPTED_SEND", 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a0 f11432k = new a0("INTERRUPTED_RCV", 1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a0 f11433l = new a0("CHANNEL_CLOSED", 1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a0 f11434m = new a0("SUSPEND", 1);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a0 f11435n = new a0("SUSPEND_NO_WAITER", 1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a0 f11436o = new a0("FAILED", 1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a0 f11437p = new a0("NO_RECEIVE_RESULT", 1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a0 f11438q = new a0("CLOSE_HANDLER_CLOSED", 1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a0 f11439r = new a0("CLOSE_HANDLER_INVOKED", 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a0 f11440s = new a0("NO_CLOSE_CAUSE", 1);

    public static final boolean a(CancellableContinuation cancellableContinuation, Object obj, Function3 function3) {
        Object objTryResume = cancellableContinuation.tryResume(obj, null, function3);
        if (objTryResume == null) {
            return false;
        }
        cancellableContinuation.completeResume(objTryResume);
        return true;
    }
}
