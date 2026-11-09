package p322v8;

import Ff.c;
import com.transsnet.analysis.utils.AnalysisEventUtils;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f43094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalysisEventUtils f43095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43096c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AnalysisEventUtils analysisEventUtils, Continuation continuation) {
        super(continuation);
        this.f43095b = analysisEventUtils;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f43094a = obj;
        this.f43096c |= Integer.MIN_VALUE;
        return this.f43095b.sendData(null, null, null, this);
    }
}
