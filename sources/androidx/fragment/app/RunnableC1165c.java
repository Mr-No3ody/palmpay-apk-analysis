package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1165c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17099d;

    public /* synthetic */ RunnableC1165c(C1176k c1176k, View view, C1171f c1171f) {
        this.f17096a = 2;
        this.f17099d = c1176k;
        this.f17097b = view;
        this.f17098c = c1171f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17096a) {
            case 0:
                ArrayList awaitingContainerChanges = (ArrayList) this.f17097b;
                Intrinsics.checkNotNullParameter(awaitingContainerChanges, "$awaitingContainerChanges");
                x0 operation = (x0) this.f17098c;
                Intrinsics.checkNotNullParameter(operation, "$operation");
                C1176k this$0 = (C1176k) this.f17099d;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (awaitingContainerChanges.contains(operation)) {
                    awaitingContainerChanges.remove(operation);
                    this$0.getClass();
                    View view = operation.f17248c.mView;
                    B0 b0 = operation.f17246a;
                    Intrinsics.checkNotNullExpressionValue(view, "view");
                    b0.a(view);
                }
                break;
            case 1:
                s0 impl = (s0) this.f17097b;
                Intrinsics.checkNotNullParameter(impl, "$impl");
                Rect lastInEpicenterRect = (Rect) this.f17099d;
                Intrinsics.checkNotNullParameter(lastInEpicenterRect, "$lastInEpicenterRect");
                s0.g((View) this.f17098c, lastInEpicenterRect);
                break;
            default:
                C1176k this$1 = (C1176k) this.f17099d;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                C1171f animationInfo = (C1171f) this.f17098c;
                Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
                this$1.f16974a.endViewTransition((View) this.f17097b);
                animationInfo.a();
                break;
        }
    }

    public /* synthetic */ RunnableC1165c(Object obj, int i7, Object obj2, Object obj3) {
        this.f17096a = i7;
        this.f17097b = obj;
        this.f17098c = obj2;
        this.f17099d = obj3;
    }
}
