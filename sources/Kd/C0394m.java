package Kd;

import com.transsnet.palmpay.send_money.viewmodel.KkCarPassengerViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: Kd.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0394m extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.B f5312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f5315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ KkCarPassengerViewModel f5316e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0394m(KkCarPassengerViewModel kkCarPassengerViewModel, Continuation continuation) {
        super(2, continuation);
        this.f5316e = kkCarPassengerViewModel;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C0394m c0394m = new C0394m(this.f5316e, continuation);
        c0394m.f5315d = obj;
        return c0394m;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0394m) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004c A[Catch: all -> 0x001f, PHI: r6 r7 r8
      0x004c: PHI (r6v8 int) = (r6v1 int), (r6v4 int), (r6v11 int) binds: [B:19:0x0042, B:70:0x0113, B:8:0x001b] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r7v4 kotlin.jvm.internal.B) = (r7v0 kotlin.jvm.internal.B), (r7v2 kotlin.jvm.internal.B), (r7v8 kotlin.jvm.internal.B) binds: [B:19:0x0042, B:70:0x0113, B:8:0x001b] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r8v4 kotlinx.coroutines.CoroutineScope) = 
      (r8v0 kotlinx.coroutines.CoroutineScope)
      (r8v2 kotlinx.coroutines.CoroutineScope)
      (r8v7 kotlinx.coroutines.CoroutineScope)
     binds: [B:19:0x0042, B:70:0x0113, B:8:0x001b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x001f, blocks: (B:7:0x0018, B:20:0x004c, B:28:0x007e, B:30:0x0084, B:32:0x0089, B:33:0x0091, B:35:0x0097, B:38:0x00a1, B:40:0x00ac, B:42:0x00b2, B:44:0x00be, B:46:0x00c4, B:48:0x00ca, B:50:0x00d0, B:53:0x00d9, B:55:0x00df, B:59:0x00e9, B:63:0x00f8, B:69:0x0107, B:72:0x0116, B:27:0x0078, B:19:0x0042, B:22:0x0052, B:25:0x0073, B:14:0x0033), top: B:81:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0052 A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #0 {all -> 0x0039, blocks: (B:22:0x0052, B:25:0x0073, B:14:0x0033), top: B:79:0x0033, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code duplicated, block: B:25:0x0073 A[Catch: all -> 0x0039, PHI: r0 r6 r7 r8
      0x0073: PHI (r0v22 java.lang.Object) = (r0v29 java.lang.Object), (r0v31 java.lang.Object) binds: [B:23:0x006f, B:15:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x0073: PHI (r6v7 int) = (r6v8 int), (r6v9 int) binds: [B:23:0x006f, B:15:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x0073: PHI (r7v3 kotlin.jvm.internal.B) = (r7v4 kotlin.jvm.internal.B), (r7v5 kotlin.jvm.internal.B) binds: [B:23:0x006f, B:15:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x0073: PHI (r8v3 kotlinx.coroutines.CoroutineScope) = (r8v4 kotlinx.coroutines.CoroutineScope), (r8v6 kotlinx.coroutines.CoroutineScope) binds: [B:23:0x006f, B:15:0x0036] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:22:0x0052, B:25:0x0073, B:14:0x0033), top: B:79:0x0033, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0084 A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:7:0x0018, B:20:0x004c, B:28:0x007e, B:30:0x0084, B:32:0x0089, B:33:0x0091, B:35:0x0097, B:38:0x00a1, B:40:0x00ac, B:42:0x00b2, B:44:0x00be, B:46:0x00c4, B:48:0x00ca, B:50:0x00d0, B:53:0x00d9, B:55:0x00df, B:59:0x00e9, B:63:0x00f8, B:69:0x0107, B:72:0x0116, B:27:0x0078, B:19:0x0042, B:22:0x0052, B:25:0x0073, B:14:0x0033), top: B:81:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0089 A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:7:0x0018, B:20:0x004c, B:28:0x007e, B:30:0x0084, B:32:0x0089, B:33:0x0091, B:35:0x0097, B:38:0x00a1, B:40:0x00ac, B:42:0x00b2, B:44:0x00be, B:46:0x00c4, B:48:0x00ca, B:50:0x00d0, B:53:0x00d9, B:55:0x00df, B:59:0x00e9, B:63:0x00f8, B:69:0x0107, B:72:0x0116, B:27:0x0078, B:19:0x0042, B:22:0x0052, B:25:0x0073, B:14:0x0033), top: B:81:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0097 A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #1 {all -> 0x001f, blocks: (B:7:0x0018, B:20:0x004c, B:28:0x007e, B:30:0x0084, B:32:0x0089, B:33:0x0091, B:35:0x0097, B:38:0x00a1, B:40:0x00ac, B:42:0x00b2, B:44:0x00be, B:46:0x00c4, B:48:0x00ca, B:50:0x00d0, B:53:0x00d9, B:55:0x00df, B:59:0x00e9, B:63:0x00f8, B:69:0x0107, B:72:0x0116, B:27:0x0078, B:19:0x0042, B:22:0x0052, B:25:0x0073, B:14:0x0033), top: B:81:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a1 A[Catch: all -> 0x001f, TRY_ENTER, TryCatch #1 {all -> 0x001f, blocks: (B:7:0x0018, B:20:0x004c, B:28:0x007e, B:30:0x0084, B:32:0x0089, B:33:0x0091, B:35:0x0097, B:38:0x00a1, B:40:0x00ac, B:42:0x00b2, B:44:0x00be, B:46:0x00c4, B:48:0x00ca, B:50:0x00d0, B:53:0x00d9, B:55:0x00df, B:59:0x00e9, B:63:0x00f8, B:69:0x0107, B:72:0x0116, B:27:0x0078, B:19:0x0042, B:22:0x0052, B:25:0x0073, B:14:0x0033), top: B:81:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:7:0x0018, B:20:0x004c, B:28:0x007e, B:30:0x0084, B:32:0x0089, B:33:0x0091, B:35:0x0097, B:38:0x00a1, B:40:0x00ac, B:42:0x00b2, B:44:0x00be, B:46:0x00c4, B:48:0x00ca, B:50:0x00d0, B:53:0x00d9, B:55:0x00df, B:59:0x00e9, B:63:0x00f8, B:69:0x0107, B:72:0x0116, B:27:0x0078, B:19:0x0042, B:22:0x0052, B:25:0x0073, B:14:0x0033), top: B:81:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00be A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:7:0x0018, B:20:0x004c, B:28:0x007e, B:30:0x0084, B:32:0x0089, B:33:0x0091, B:35:0x0097, B:38:0x00a1, B:40:0x00ac, B:42:0x00b2, B:44:0x00be, B:46:0x00c4, B:48:0x00ca, B:50:0x00d0, B:53:0x00d9, B:55:0x00df, B:59:0x00e9, B:63:0x00f8, B:69:0x0107, B:72:0x0116, B:27:0x0078, B:19:0x0042, B:22:0x0052, B:25:0x0073, B:14:0x0033), top: B:81:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4 A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:7:0x0018, B:20:0x004c, B:28:0x007e, B:30:0x0084, B:32:0x0089, B:33:0x0091, B:35:0x0097, B:38:0x00a1, B:40:0x00ac, B:42:0x00b2, B:44:0x00be, B:46:0x00c4, B:48:0x00ca, B:50:0x00d0, B:53:0x00d9, B:55:0x00df, B:59:0x00e9, B:63:0x00f8, B:69:0x0107, B:72:0x0116, B:27:0x0078, B:19:0x0042, B:22:0x0052, B:25:0x0073, B:14:0x0033), top: B:81:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d9 A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:7:0x0018, B:20:0x004c, B:28:0x007e, B:30:0x0084, B:32:0x0089, B:33:0x0091, B:35:0x0097, B:38:0x00a1, B:40:0x00ac, B:42:0x00b2, B:44:0x00be, B:46:0x00c4, B:48:0x00ca, B:50:0x00d0, B:53:0x00d9, B:55:0x00df, B:59:0x00e9, B:63:0x00f8, B:69:0x0107, B:72:0x0116, B:27:0x0078, B:19:0x0042, B:22:0x0052, B:25:0x0073, B:14:0x0033), top: B:81:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e9 A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:7:0x0018, B:20:0x004c, B:28:0x007e, B:30:0x0084, B:32:0x0089, B:33:0x0091, B:35:0x0097, B:38:0x00a1, B:40:0x00ac, B:42:0x00b2, B:44:0x00be, B:46:0x00c4, B:48:0x00ca, B:50:0x00d0, B:53:0x00d9, B:55:0x00df, B:59:0x00e9, B:63:0x00f8, B:69:0x0107, B:72:0x0116, B:27:0x0078, B:19:0x0042, B:22:0x0052, B:25:0x0073, B:14:0x0033), top: B:81:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0113 -> B:20:0x004c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // Ff.a
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Kd.C0394m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
