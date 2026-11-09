package Ad;

import com.transsnet.palmpay.send_money.ui.dialog.AddFromContactsDialog;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: Ad.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0062i extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AddFromContactsDialog f224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f225b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0062i(AddFromContactsDialog addFromContactsDialog, List list, Continuation continuation) {
        super(2, continuation);
        this.f224a = addFromContactsDialog;
        this.f225b = list;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0062i(this.f224a, this.f225b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0062i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        this.f224a.setList(this.f225b);
        return Unit.f38893a;
    }
}
