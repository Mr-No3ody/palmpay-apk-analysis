package Lb;

import Ad.c0;
import J1.g;
import M1.j;
import android.content.Context;
import android.os.Handler;
import android.os.Trace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.B;
import androidx.core.app.M;
import androidx.recyclerview.widget.DiffUtil;
import com.bumptech.glide.m;
import com.facebook.react.devsupport.DevSupportManagerBase;
import com.facebook.react.devsupport.interfaces.ErrorType;
import com.facebook.react.devsupport.interfaces.StackFrame;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5618f;

    public /* synthetic */ b(O1.c cVar, int i7, List list, DiffUtil.DiffResult diffResult, Runnable runnable) {
        this.f5613a = 3;
        this.f5614b = cVar;
        this.f5616d = i7;
        this.f5615c = list;
        this.f5618f = diffResult;
        this.f5617e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        int i7 = this.f5616d;
        Object obj = this.f5617e;
        Object obj2 = this.f5618f;
        Object obj3 = this.f5615c;
        Object obj4 = this.f5614b;
        switch (this.f5613a) {
            case 0:
                String str = (String) obj3;
                LayoutInflater layoutInflater = (LayoutInflater) obj2;
                int i10 = this.f5616d;
                Handler handler = d.f5620a;
                Context context = (Context) obj4;
                if (d.a(context)) {
                    try {
                        Trace.beginSection(str);
                        try {
                            View viewInflate = layoutInflater.inflate(i10, (ViewGroup) null, false);
                            Trace.endSection();
                            view = viewInflate;
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } catch (RuntimeException e10) {
                        F6.d.c("PpAsyncInflateQueue", "inflate in background failed, retry on main thread: " + e10);
                        view = null;
                    }
                    d.f5620a.post(new b(context, view, str, i10, (c0) obj));
                    return;
                }
                return;
            case 1:
                Handler handler2 = d.f5620a;
                Context context2 = (Context) obj4;
                if (d.a(context2)) {
                    View viewInflate2 = (View) obj2;
                    if (viewInflate2 == null) {
                        Trace.beginSection(((String) obj3) + "_main");
                        try {
                            viewInflate2 = LayoutInflater.from(context2).inflate(i7, (ViewGroup) null, false);
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                    Intrinsics.e(viewInflate2);
                    ((c0) obj).onInflateFinished(viewInflate2);
                    return;
                }
                return;
            case 2:
                O1.c this$0 = (O1.c) obj4;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                List oldList = (List) obj3;
                Intrinsics.checkNotNullParameter(oldList, "$oldList");
                List list = (List) obj2;
                DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new O1.b(oldList, list, this$0));
                Intrinsics.checkNotNullExpressionValue(diffResultCalculateDiff, "@JvmOverloads\n    fun su…        }\n        }\n    }");
                this$0.f6545d.execute(new b(this$0, this.f5616d, list, diffResultCalculateDiff, (Runnable) obj));
                return;
            case 3:
                O1.c this$1 = (O1.c) obj4;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                DiffUtil.DiffResult result = (DiffUtil.DiffResult) obj2;
                Intrinsics.checkNotNullParameter(result, "$result");
                if (this$1.f6547f == i7) {
                    j jVar = this$1.f6542a;
                    List<Object> data = jVar.getData();
                    jVar.setData$com_github_CymChad_brvah((List) obj3);
                    result.dispatchUpdatesTo(this$1.f6544c);
                    this$1.a(data, (Runnable) obj);
                    return;
                }
                return;
            case 4:
                m mVarLoad = com.bumptech.glide.b.e((Context) obj4).b().load((String) obj3);
                mVarLoad.T(new Oe.c((B) obj2, (M) obj, i7), null, mVarLoad, g.f4461a);
                return;
            default:
                DevSupportManagerBase.showNewError$lambda$6((DevSupportManagerBase) obj4, (String) obj3, (StackFrame[]) obj2, i7, (ErrorType) obj);
                return;
        }
    }

    public /* synthetic */ b(Context context, View view, String str, int i7, c0 c0Var) {
        this.f5613a = 1;
        this.f5614b = context;
        this.f5618f = view;
        this.f5615c = str;
        this.f5616d = i7;
        this.f5617e = c0Var;
    }

    public /* synthetic */ b(Context context, String str, B b7, M m7, int i7) {
        this.f5613a = 4;
        this.f5614b = context;
        this.f5615c = str;
        this.f5618f = b7;
        this.f5617e = m7;
        this.f5616d = i7;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i7, Object obj4, int i10) {
        this.f5613a = i10;
        this.f5614b = obj;
        this.f5615c = obj2;
        this.f5618f = obj3;
        this.f5616d = i7;
        this.f5617e = obj4;
    }
}
