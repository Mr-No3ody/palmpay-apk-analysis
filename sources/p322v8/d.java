package p322v8;

import Ff.c;
import com.transsnet.analysis.data.local.dao.EventsDao;
import com.transsnet.analysis.utils.AnalysisEventUtils;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f43114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f43115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Mutex f43116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EventsDao f43117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f43118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f43120g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f43121i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AnalysisEventUtils f43122j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f43123o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AnalysisEventUtils analysisEventUtils, Continuation continuation) {
        super(continuation);
        this.f43122j = analysisEventUtils;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        this.f43121i = obj;
        this.f43123o |= Integer.MIN_VALUE;
        return this.f43122j.uploadAnalysisEventInternal(null, null, 0, this);
    }
}
