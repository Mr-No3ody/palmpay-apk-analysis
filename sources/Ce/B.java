package Ce;

import android.content.Context;
import com.transsnet.palmpay.ui.activity.HomeActivity;
import com.transsnet.palmpay.ui.dialog.HomepageClipboardTransferDialog;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomepageClipboardTransferDialog f1403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HomeFragmentHomeTab f1404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f1405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f1406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f1407f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(HomepageClipboardTransferDialog homepageClipboardTransferDialog, HomeFragmentHomeTab homeFragmentHomeTab, HomeActivity homeActivity, Context context, String str, Continuation continuation) {
        super(2, continuation);
        this.f1403b = homepageClipboardTransferDialog;
        this.f1404c = homeFragmentHomeTab;
        this.f1405d = homeActivity;
        this.f1406e = context;
        this.f1407f = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new B(this.f1403b, this.f1404c, this.f1405d, this.f1406e, this.f1407f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((B) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (Wf.AbstractC0780y.s(r11, r1, r10) == r0) goto L17;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r10.f1402a
            java.lang.String r6 = r10.f1407f
            r8 = 2
            r9 = 1
            if (r1 == 0) goto L1e
            if (r1 == r9) goto L1a
            if (r1 != r8) goto L12
            androidx.camera.core.impl.utils.executor.g.M(r11)
            goto L62
        L12:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1a:
            androidx.camera.core.impl.utils.executor.g.M(r11)
            goto L3a
        L1e:
            androidx.camera.core.impl.utils.executor.g.M(r11)
            cg.f r11 = Wf.I.f10809a
            cg.e r11 = p042cg.e.f19009c
            Ce.A r2 = new Ce.A
            com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab r3 = r10.f1404c
            com.transsnet.palmpay.ui.activity.HomeActivity r4 = r10.f1405d
            android.content.Context r5 = r10.f1406e
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            r10.f1402a = r9
            java.lang.Object r11 = Wf.AbstractC0780y.s(r11, r2, r10)
            if (r11 != r0) goto L3a
            goto L56
        L3a:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L57
            cg.f r11 = Wf.I.f10809a
            cg.e r11 = p042cg.e.f19009c
            Ce.z r1 = new Ce.z
            r2 = 0
            android.content.Context r3 = r10.f1406e
            r1.<init>(r3, r6, r2)
            r10.f1402a = r8
            java.lang.Object r11 = Wf.AbstractC0780y.s(r11, r1, r10)
            if (r11 != r0) goto L62
        L56:
            return r0
        L57:
            com.transsnet.palmpay.ui.dialog.HomepageClipboardTransferDialog r11 = r10.f1403b
            boolean r0 = r11.isShowing()
            if (r0 == 0) goto L62
            r11.dismiss()
        L62:
            kotlin.Unit r11 = kotlin.Unit.f38893a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Ce.B.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
