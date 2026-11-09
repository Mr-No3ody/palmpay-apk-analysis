package p322v8;

import Ef.a;
import Ff.h;
import android.util.Log;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.analysis.utils.AnalysisEventUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f43111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f43112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f43113d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i7, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f43111b = str;
        this.f43112c = str2;
        this.f43113d = i7;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f43113d, this.f43111b, this.f43112c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f43110a;
        try {
            if (i7 == 0) {
                g.M(obj);
                AnalysisEventUtils analysisEventUtils = AnalysisEventUtils.INSTANCE;
                String str = this.f43111b;
                String str2 = this.f43112c;
                int i10 = this.f43113d;
                this.f43110a = 1;
                if (analysisEventUtils.uploadAnalysisEventInternal(str, str2, i10, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
            }
        } catch (Exception e10) {
            Log.e("AnalysisEventUtils", "uploadAnalysisEvent: ", e10);
        }
        return Unit.f38893a;
    }
}
