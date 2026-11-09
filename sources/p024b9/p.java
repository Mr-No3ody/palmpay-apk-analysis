package p024b9;

import Ff.h;
import android.content.Context;
import com.transsnet.palmpay.account.ui.fragment.upgrade.UpgradeTier3StepLoadingFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UpgradeTier3StepLoadingFragment f18826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f18827d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(UpgradeTier3StepLoadingFragment upgradeTier3StepLoadingFragment, Context context, Continuation continuation) {
        super(2, continuation);
        this.f18826c = upgradeTier3StepLoadingFragment;
        this.f18827d = context;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new p(this.f18826c, this.f18827d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022  */
    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:33:0x0101  */
    /* JADX WARN: Code duplicated, block: B:35:0x0107  */
    /* JADX WARN: Code duplicated, block: B:36:0x010f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0112  */
    /* JADX WARN: Code duplicated, block: B:40:0x0116  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0133  */
    /* JADX WARN: Code duplicated, block: B:48:0x013d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x013b -> B:49:0x013e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0072
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // Ff.a
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p024b9.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
