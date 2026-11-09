package R8;

import Bc.C0105b;
import Wf.AbstractC0780y;
import Wf.I;
import android.content.Context;
import androidx.biometric.u;
import androidx.biometric.v;
import androidx.biometric.w;
import com.transsnet.palmpay.account.ui.fragment.auth.VerifyFingerPrintFragment;
import java.security.InvalidKeyException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public VerifyFingerPrintFragment f7956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v f7957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p145jd.a f7958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ VerifyFingerPrintFragment f7960e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(VerifyFingerPrintFragment verifyFingerPrintFragment, Continuation continuation) {
        super(2, continuation);
        this.f7960e = verifyFingerPrintFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.f7960e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a8 A[Catch: Exception -> 0x00ab, TryCatch #1 {Exception -> 0x00ab, blocks: (B:52:0x00c7, B:54:0x00cd, B:55:0x00d0, B:57:0x00d4, B:58:0x00d9, B:42:0x00a0, B:44:0x00a8, B:48:0x00ae), top: B:74:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ae A[Catch: Exception -> 0x00ab, TryCatch #1 {Exception -> 0x00ab, blocks: (B:52:0x00c7, B:54:0x00cd, B:55:0x00d0, B:57:0x00d4, B:58:0x00d9, B:42:0x00a0, B:44:0x00a8, B:48:0x00ae), top: B:74:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cd A[Catch: Exception -> 0x00ab, TryCatch #1 {Exception -> 0x00ab, blocks: (B:52:0x00c7, B:54:0x00cd, B:55:0x00d0, B:57:0x00d4, B:58:0x00d9, B:42:0x00a0, B:44:0x00a8, B:48:0x00ae), top: B:74:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00d4 A[Catch: Exception -> 0x00ab, TryCatch #1 {Exception -> 0x00ab, blocks: (B:52:0x00c7, B:54:0x00cd, B:55:0x00d0, B:57:0x00d4, B:58:0x00d9, B:42:0x00a0, B:44:0x00a8, B:48:0x00ae), top: B:74:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0039: MOVE (r3 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:58), block:B:18:0x0039 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0105b c0105b;
        Context context;
        Object obj2;
        v vVar;
        VerifyFingerPrintFragment verifyFingerPrintFragment;
        Object objS;
        p145jd.a aVar;
        VerifyFingerPrintFragment verifyFingerPrintFragment2;
        Object objS2;
        v vVar2;
        Object objS3;
        u uVar;
        w wVar;
        C0105b c0105b2;
        int i7 = 1;
        Ef.a aVar2 = Ef.a.f2423a;
        VerifyFingerPrintFragment verifyFingerPrintFragment3 = this.f7959d;
        try {
            if (verifyFingerPrintFragment3 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                verifyFingerPrintFragment = this.f7960e;
                if (!verifyFingerPrintFragment.isAdded() || verifyFingerPrintFragment.isDetached() || !verifyFingerPrintFragment.isResumed()) {
                    return Unit.f38893a;
                }
                vVar = verifyFingerPrintFragment.f26115j;
                if (vVar != null) {
                    p042cg.f fVar = I.f10809a;
                    p042cg.e eVar = p042cg.e.f19009c;
                    m mVar = new m(verifyFingerPrintFragment, null);
                    this.f7956a = verifyFingerPrintFragment;
                    this.f7957b = vVar;
                    this.f7959d = 1;
                    objS = AbstractC0780y.s(eVar, mVar, this);
                    if (objS == aVar2) {
                    }
                    return aVar2;
                }
                return Unit.f38893a;
            }
            try {
                if (verifyFingerPrintFragment3 == 1) {
                    v vVar3 = this.f7957b;
                    VerifyFingerPrintFragment verifyFingerPrintFragment4 = this.f7956a;
                    androidx.camera.core.impl.utils.executor.g.M(obj);
                    vVar = vVar3;
                    verifyFingerPrintFragment = verifyFingerPrintFragment4;
                    objS = obj;
                } else if (verifyFingerPrintFragment3 == 2) {
                    aVar = this.f7958c;
                    v vVar4 = this.f7957b;
                    VerifyFingerPrintFragment verifyFingerPrintFragment5 = this.f7956a;
                    androidx.camera.core.impl.utils.executor.g.M(obj);
                    verifyFingerPrintFragment2 = verifyFingerPrintFragment5;
                    vVar = vVar4;
                    objS2 = obj;
                    try {
                        if (!((Boolean) objS2).booleanValue()) {
                            return Unit.f38893a;
                        }
                        p042cg.f fVar2 = I.f10809a;
                        p042cg.e eVar2 = p042cg.e.f19009c;
                        l lVar = new l(aVar, null);
                        this.f7956a = verifyFingerPrintFragment2;
                        this.f7957b = vVar;
                        this.f7958c = null;
                        this.f7959d = 3;
                        objS3 = AbstractC0780y.s(eVar2, lVar, this);
                        if (objS3 != aVar2) {
                            vVar2 = vVar;
                        }
                        return aVar2;
                    } catch (Exception e10) {
                        e = e10;
                        verifyFingerPrintFragment3 = verifyFingerPrintFragment2;
                        c0105b = verifyFingerPrintFragment3.f26114B;
                        if (c0105b != null) {
                            p220oa.h.c(c0105b.f667g);
                        }
                        if ((e instanceof InvalidKeyException) && (context = verifyFingerPrintFragment3.getContext()) != null) {
                            io.fastkv.n.O(context, 0, new Integer(F8.h.ac_fingerprint_verifying_unavailable), null, null, null, null, "Your Fingerprint information has been changed recently. To ensure your account security, please use PIN to unlock", new Integer(p025ba.k.core_confirm), null, new e(verifyFingerPrintFragment3, i7), null, null, null, null, false, 0, 8387197);
                        }
                        F6.d.h(verifyFingerPrintFragment3.f27317a, 3, "startAuthentication error: " + e);
                    }
                } else {
                    if (verifyFingerPrintFragment3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vVar2 = this.f7957b;
                    VerifyFingerPrintFragment verifyFingerPrintFragment6 = this.f7956a;
                    androidx.camera.core.impl.utils.executor.g.M(obj);
                    verifyFingerPrintFragment2 = verifyFingerPrintFragment6;
                    objS3 = obj;
                }
                uVar = (u) objS3;
                wVar = verifyFingerPrintFragment2.f26116o;
                if (wVar != null) {
                    wVar.a(vVar2, uVar);
                }
                c0105b2 = verifyFingerPrintFragment2.f26114B;
                if (c0105b2 != null) {
                    p220oa.h.C(c0105b2.f667g);
                }
                verifyFingerPrintFragment2.f26117p = true;
            } catch (Exception e11) {
                e = e11;
                verifyFingerPrintFragment3 = obj2;
                c0105b = verifyFingerPrintFragment3.f26114B;
                if (c0105b != null) {
                    p220oa.h.c(c0105b.f667g);
                }
                if (e instanceof InvalidKeyException) {
                    io.fastkv.n.O(context, 0, new Integer(F8.h.ac_fingerprint_verifying_unavailable), null, null, null, null, "Your Fingerprint information has been changed recently. To ensure your account security, please use PIN to unlock", new Integer(p025ba.k.core_confirm), null, new e(verifyFingerPrintFragment3, i7), null, null, null, null, false, 0, 8387197);
                }
                F6.d.h(verifyFingerPrintFragment3.f27317a, 3, "startAuthentication error: " + e);
                return Unit.f38893a;
            }
            return Unit.f38893a;
            p145jd.a aVar3 = (p145jd.a) objS;
            if (aVar3 == null) {
                return Unit.f38893a;
            }
            p042cg.f fVar3 = I.f10809a;
            p042cg.e eVar3 = p042cg.e.f19009c;
            k kVar = new k(verifyFingerPrintFragment, null);
            this.f7956a = verifyFingerPrintFragment;
            this.f7957b = vVar;
            this.f7958c = aVar3;
            this.f7959d = 2;
            objS2 = AbstractC0780y.s(eVar3, kVar, this);
            if (objS2 != aVar2) {
                verifyFingerPrintFragment2 = verifyFingerPrintFragment;
                aVar = aVar3;
                if (!((Boolean) objS2).booleanValue()) {
                    return Unit.f38893a;
                }
                p042cg.f fVar4 = I.f10809a;
                p042cg.e eVar4 = p042cg.e.f19009c;
                l lVar2 = new l(aVar, null);
                this.f7956a = verifyFingerPrintFragment2;
                this.f7957b = vVar;
                this.f7958c = null;
                this.f7959d = 3;
                objS3 = AbstractC0780y.s(eVar4, lVar2, this);
                if (objS3 != aVar2) {
                    vVar2 = vVar;
                    uVar = (u) objS3;
                    wVar = verifyFingerPrintFragment2.f26116o;
                    if (wVar != null) {
                        wVar.a(vVar2, uVar);
                    }
                    c0105b2 = verifyFingerPrintFragment2.f26114B;
                    if (c0105b2 != null) {
                        p220oa.h.C(c0105b2.f667g);
                    }
                    verifyFingerPrintFragment2.f26117p = true;
                    return Unit.f38893a;
                }
            }
            return aVar2;
        } catch (Exception e12) {
            e = e12;
        }
    }
}
