package Oa;

import C0.G;
import com.transsnet.palmpay.core.ui.widget.BrowseCountdownView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ long f6693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BrowseCountdownView f6694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6695c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BrowseCountdownView browseCountdownView, int i7, Continuation continuation) {
        super(2, continuation);
        this.f6694b = browseCountdownView;
        this.f6695c = i7;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        g gVar = new g(this.f6694b, this.f6695c, continuation);
        gVar.f6693a = ((Number) obj).longValue();
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create(Long.valueOf(((Number) obj).longValue()), (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        int i7 = (int) (this.f6693a / ((long) 1000));
        BrowseCountdownView browseCountdownView = this.f6694b;
        browseCountdownView.getProgress_bar_second().setProgress(this.f6695c - i7);
        browseCountdownView.getTv_browse_second().setText(G.i("Browse for ").append(i7 + "s").setForegroundColor(browseCountdownView.getContext().getColor(L6.b.ppColorTextPrimary)).setFontFamily("sans-serif-medium").create());
        return Unit.f38893a;
    }
}
