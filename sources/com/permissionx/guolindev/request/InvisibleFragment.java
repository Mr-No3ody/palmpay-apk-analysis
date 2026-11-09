package com.permissionx.guolindev.request;

import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.a;
import androidx.fragment.app.Fragment;
import com.permissionx.guolindev.request.ChainTask;
import com.permissionx.guolindev.request.InvisibleFragment;
import com.transsnet.adsdk.widgets.banner.bannerview.b;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p177m.j;
import p177m.l;
import p218o7.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/permissionx/guolindev/request/InvisibleFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "permissionx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class InvisibleFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f24645a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f24646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ChainTask f24647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f24648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f24649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f24650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f24651g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f24652i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f24653j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a f24654o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f24655p;

    public InvisibleFragment() {
        final int i7 = 0;
        a aVarRegisterForActivityResult = registerForActivityResult(new j(), new ActivityResultCallback(this) { // from class: o7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvisibleFragment f40067b;

            {
                this.f40067b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                switch (i7) {
                    case 0:
                        InvisibleFragment this$0 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h(new E0.h(7, this$0, (Map) obj));
                        return;
                    case 1:
                        InvisibleFragment this$1 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        this$1.h(new f(this$1, (Boolean) obj, 0));
                        return;
                    case 2:
                        InvisibleFragment this$2 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        this$2.h(new e(this$2, 7));
                        return;
                    case 3:
                        InvisibleFragment this$3 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        this$3.h(new e(this$3, 8));
                        return;
                    case 4:
                        InvisibleFragment this$4 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        this$4.h(new e(this$4, 5));
                        return;
                    case 5:
                        InvisibleFragment this$5 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        this$5.h(new e(this$5, 4));
                        return;
                    case 6:
                        InvisibleFragment this$6 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        this$6.h(new e(this$6, 6));
                        return;
                    case 7:
                        InvisibleFragment this$7 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        this$7.h(new f(this$7, (Boolean) obj, 1));
                        return;
                    default:
                        InvisibleFragment this$8 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        if (this$8.f()) {
                            ChainTask chainTask = this$8.f24647c;
                            if (chainTask == null) {
                                Intrinsics.n("task");
                                throw null;
                            }
                            h hVar = this$8.f24646b;
                            if (hVar != null) {
                                chainTask.requestAgain(new ArrayList(hVar.f40084i));
                                return;
                            } else {
                                Intrinsics.n("pb");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(aVarRegisterForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.f24648d = aVarRegisterForActivityResult;
        final int i10 = 1;
        a aVarRegisterForActivityResult2 = registerForActivityResult(new V3.a(4), new ActivityResultCallback(this) { // from class: o7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvisibleFragment f40067b;

            {
                this.f40067b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                switch (i10) {
                    case 0:
                        InvisibleFragment this$0 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h(new E0.h(7, this$0, (Map) obj));
                        return;
                    case 1:
                        InvisibleFragment this$1 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        this$1.h(new f(this$1, (Boolean) obj, 0));
                        return;
                    case 2:
                        InvisibleFragment this$2 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        this$2.h(new e(this$2, 7));
                        return;
                    case 3:
                        InvisibleFragment this$3 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        this$3.h(new e(this$3, 8));
                        return;
                    case 4:
                        InvisibleFragment this$4 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        this$4.h(new e(this$4, 5));
                        return;
                    case 5:
                        InvisibleFragment this$5 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        this$5.h(new e(this$5, 4));
                        return;
                    case 6:
                        InvisibleFragment this$6 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        this$6.h(new e(this$6, 6));
                        return;
                    case 7:
                        InvisibleFragment this$7 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        this$7.h(new f(this$7, (Boolean) obj, 1));
                        return;
                    default:
                        InvisibleFragment this$8 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        if (this$8.f()) {
                            ChainTask chainTask = this$8.f24647c;
                            if (chainTask == null) {
                                Intrinsics.n("task");
                                throw null;
                            }
                            h hVar = this$8.f24646b;
                            if (hVar != null) {
                                chainTask.requestAgain(new ArrayList(hVar.f40084i));
                                return;
                            } else {
                                Intrinsics.n("pb");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(aVarRegisterForActivityResult2, "registerForActivityResul…)\n            }\n        }");
        this.f24649e = aVarRegisterForActivityResult2;
        final int i11 = 2;
        a aVarRegisterForActivityResult3 = registerForActivityResult(new l(), new ActivityResultCallback(this) { // from class: o7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvisibleFragment f40067b;

            {
                this.f40067b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                switch (i11) {
                    case 0:
                        InvisibleFragment this$0 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h(new E0.h(7, this$0, (Map) obj));
                        return;
                    case 1:
                        InvisibleFragment this$1 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        this$1.h(new f(this$1, (Boolean) obj, 0));
                        return;
                    case 2:
                        InvisibleFragment this$2 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        this$2.h(new e(this$2, 7));
                        return;
                    case 3:
                        InvisibleFragment this$3 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        this$3.h(new e(this$3, 8));
                        return;
                    case 4:
                        InvisibleFragment this$4 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        this$4.h(new e(this$4, 5));
                        return;
                    case 5:
                        InvisibleFragment this$5 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        this$5.h(new e(this$5, 4));
                        return;
                    case 6:
                        InvisibleFragment this$6 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        this$6.h(new e(this$6, 6));
                        return;
                    case 7:
                        InvisibleFragment this$7 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        this$7.h(new f(this$7, (Boolean) obj, 1));
                        return;
                    default:
                        InvisibleFragment this$8 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        if (this$8.f()) {
                            ChainTask chainTask = this$8.f24647c;
                            if (chainTask == null) {
                                Intrinsics.n("task");
                                throw null;
                            }
                            h hVar = this$8.f24646b;
                            if (hVar != null) {
                                chainTask.requestAgain(new ArrayList(hVar.f40084i));
                                return;
                            } else {
                                Intrinsics.n("pb");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(aVarRegisterForActivityResult3, "registerForActivityResul…)\n            }\n        }");
        this.f24650f = aVarRegisterForActivityResult3;
        final int i12 = 3;
        a aVarRegisterForActivityResult4 = registerForActivityResult(new l(), new ActivityResultCallback(this) { // from class: o7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvisibleFragment f40067b;

            {
                this.f40067b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                switch (i12) {
                    case 0:
                        InvisibleFragment this$0 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h(new E0.h(7, this$0, (Map) obj));
                        return;
                    case 1:
                        InvisibleFragment this$1 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        this$1.h(new f(this$1, (Boolean) obj, 0));
                        return;
                    case 2:
                        InvisibleFragment this$2 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        this$2.h(new e(this$2, 7));
                        return;
                    case 3:
                        InvisibleFragment this$3 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        this$3.h(new e(this$3, 8));
                        return;
                    case 4:
                        InvisibleFragment this$4 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        this$4.h(new e(this$4, 5));
                        return;
                    case 5:
                        InvisibleFragment this$5 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        this$5.h(new e(this$5, 4));
                        return;
                    case 6:
                        InvisibleFragment this$6 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        this$6.h(new e(this$6, 6));
                        return;
                    case 7:
                        InvisibleFragment this$7 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        this$7.h(new f(this$7, (Boolean) obj, 1));
                        return;
                    default:
                        InvisibleFragment this$8 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        if (this$8.f()) {
                            ChainTask chainTask = this$8.f24647c;
                            if (chainTask == null) {
                                Intrinsics.n("task");
                                throw null;
                            }
                            h hVar = this$8.f24646b;
                            if (hVar != null) {
                                chainTask.requestAgain(new ArrayList(hVar.f40084i));
                                return;
                            } else {
                                Intrinsics.n("pb");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(aVarRegisterForActivityResult4, "registerForActivityResul…)\n            }\n        }");
        this.f24651g = aVarRegisterForActivityResult4;
        final int i13 = 4;
        a aVarRegisterForActivityResult5 = registerForActivityResult(new l(), new ActivityResultCallback(this) { // from class: o7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvisibleFragment f40067b;

            {
                this.f40067b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                switch (i13) {
                    case 0:
                        InvisibleFragment this$0 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h(new E0.h(7, this$0, (Map) obj));
                        return;
                    case 1:
                        InvisibleFragment this$1 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        this$1.h(new f(this$1, (Boolean) obj, 0));
                        return;
                    case 2:
                        InvisibleFragment this$2 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        this$2.h(new e(this$2, 7));
                        return;
                    case 3:
                        InvisibleFragment this$3 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        this$3.h(new e(this$3, 8));
                        return;
                    case 4:
                        InvisibleFragment this$4 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        this$4.h(new e(this$4, 5));
                        return;
                    case 5:
                        InvisibleFragment this$5 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        this$5.h(new e(this$5, 4));
                        return;
                    case 6:
                        InvisibleFragment this$6 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        this$6.h(new e(this$6, 6));
                        return;
                    case 7:
                        InvisibleFragment this$7 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        this$7.h(new f(this$7, (Boolean) obj, 1));
                        return;
                    default:
                        InvisibleFragment this$8 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        if (this$8.f()) {
                            ChainTask chainTask = this$8.f24647c;
                            if (chainTask == null) {
                                Intrinsics.n("task");
                                throw null;
                            }
                            h hVar = this$8.f24646b;
                            if (hVar != null) {
                                chainTask.requestAgain(new ArrayList(hVar.f40084i));
                                return;
                            } else {
                                Intrinsics.n("pb");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(aVarRegisterForActivityResult5, "registerForActivityResul…)\n            }\n        }");
        this.f24652i = aVarRegisterForActivityResult5;
        final int i14 = 5;
        a aVarRegisterForActivityResult6 = registerForActivityResult(new l(), new ActivityResultCallback(this) { // from class: o7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvisibleFragment f40067b;

            {
                this.f40067b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                switch (i14) {
                    case 0:
                        InvisibleFragment this$0 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h(new E0.h(7, this$0, (Map) obj));
                        return;
                    case 1:
                        InvisibleFragment this$1 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        this$1.h(new f(this$1, (Boolean) obj, 0));
                        return;
                    case 2:
                        InvisibleFragment this$2 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        this$2.h(new e(this$2, 7));
                        return;
                    case 3:
                        InvisibleFragment this$3 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        this$3.h(new e(this$3, 8));
                        return;
                    case 4:
                        InvisibleFragment this$4 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        this$4.h(new e(this$4, 5));
                        return;
                    case 5:
                        InvisibleFragment this$5 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        this$5.h(new e(this$5, 4));
                        return;
                    case 6:
                        InvisibleFragment this$6 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        this$6.h(new e(this$6, 6));
                        return;
                    case 7:
                        InvisibleFragment this$7 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        this$7.h(new f(this$7, (Boolean) obj, 1));
                        return;
                    default:
                        InvisibleFragment this$8 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        if (this$8.f()) {
                            ChainTask chainTask = this$8.f24647c;
                            if (chainTask == null) {
                                Intrinsics.n("task");
                                throw null;
                            }
                            h hVar = this$8.f24646b;
                            if (hVar != null) {
                                chainTask.requestAgain(new ArrayList(hVar.f40084i));
                                return;
                            } else {
                                Intrinsics.n("pb");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(aVarRegisterForActivityResult6, "registerForActivityResul…)\n            }\n        }");
        this.f24653j = aVarRegisterForActivityResult6;
        final int i15 = 6;
        a aVarRegisterForActivityResult7 = registerForActivityResult(new l(), new ActivityResultCallback(this) { // from class: o7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvisibleFragment f40067b;

            {
                this.f40067b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                switch (i15) {
                    case 0:
                        InvisibleFragment this$0 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h(new E0.h(7, this$0, (Map) obj));
                        return;
                    case 1:
                        InvisibleFragment this$1 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        this$1.h(new f(this$1, (Boolean) obj, 0));
                        return;
                    case 2:
                        InvisibleFragment this$2 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        this$2.h(new e(this$2, 7));
                        return;
                    case 3:
                        InvisibleFragment this$3 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        this$3.h(new e(this$3, 8));
                        return;
                    case 4:
                        InvisibleFragment this$4 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        this$4.h(new e(this$4, 5));
                        return;
                    case 5:
                        InvisibleFragment this$5 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        this$5.h(new e(this$5, 4));
                        return;
                    case 6:
                        InvisibleFragment this$6 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        this$6.h(new e(this$6, 6));
                        return;
                    case 7:
                        InvisibleFragment this$7 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        this$7.h(new f(this$7, (Boolean) obj, 1));
                        return;
                    default:
                        InvisibleFragment this$8 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        if (this$8.f()) {
                            ChainTask chainTask = this$8.f24647c;
                            if (chainTask == null) {
                                Intrinsics.n("task");
                                throw null;
                            }
                            h hVar = this$8.f24646b;
                            if (hVar != null) {
                                chainTask.requestAgain(new ArrayList(hVar.f40084i));
                                return;
                            } else {
                                Intrinsics.n("pb");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(aVarRegisterForActivityResult7, "registerForActivityResul…)\n            }\n        }");
        this.f24654o = aVarRegisterForActivityResult7;
        final int i16 = 7;
        a aVarRegisterForActivityResult8 = registerForActivityResult(new V3.a(4), new ActivityResultCallback(this) { // from class: o7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvisibleFragment f40067b;

            {
                this.f40067b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                switch (i16) {
                    case 0:
                        InvisibleFragment this$0 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h(new E0.h(7, this$0, (Map) obj));
                        return;
                    case 1:
                        InvisibleFragment this$1 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        this$1.h(new f(this$1, (Boolean) obj, 0));
                        return;
                    case 2:
                        InvisibleFragment this$2 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        this$2.h(new e(this$2, 7));
                        return;
                    case 3:
                        InvisibleFragment this$3 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        this$3.h(new e(this$3, 8));
                        return;
                    case 4:
                        InvisibleFragment this$4 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        this$4.h(new e(this$4, 5));
                        return;
                    case 5:
                        InvisibleFragment this$5 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        this$5.h(new e(this$5, 4));
                        return;
                    case 6:
                        InvisibleFragment this$6 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        this$6.h(new e(this$6, 6));
                        return;
                    case 7:
                        InvisibleFragment this$7 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        this$7.h(new f(this$7, (Boolean) obj, 1));
                        return;
                    default:
                        InvisibleFragment this$8 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        if (this$8.f()) {
                            ChainTask chainTask = this$8.f24647c;
                            if (chainTask == null) {
                                Intrinsics.n("task");
                                throw null;
                            }
                            h hVar = this$8.f24646b;
                            if (hVar != null) {
                                chainTask.requestAgain(new ArrayList(hVar.f40084i));
                                return;
                            } else {
                                Intrinsics.n("pb");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(aVarRegisterForActivityResult8, "registerForActivityResul…)\n            }\n        }");
        this.f24655p = aVarRegisterForActivityResult8;
        final int i17 = 8;
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult(new l(), new ActivityResultCallback(this) { // from class: o7.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvisibleFragment f40067b;

            {
                this.f40067b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                switch (i17) {
                    case 0:
                        InvisibleFragment this$0 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.h(new E0.h(7, this$0, (Map) obj));
                        return;
                    case 1:
                        InvisibleFragment this$1 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        this$1.h(new f(this$1, (Boolean) obj, 0));
                        return;
                    case 2:
                        InvisibleFragment this$2 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        this$2.h(new e(this$2, 7));
                        return;
                    case 3:
                        InvisibleFragment this$3 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$3, "this$0");
                        this$3.h(new e(this$3, 8));
                        return;
                    case 4:
                        InvisibleFragment this$4 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$4, "this$0");
                        this$4.h(new e(this$4, 5));
                        return;
                    case 5:
                        InvisibleFragment this$5 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$5, "this$0");
                        this$5.h(new e(this$5, 4));
                        return;
                    case 6:
                        InvisibleFragment this$6 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$6, "this$0");
                        this$6.h(new e(this$6, 6));
                        return;
                    case 7:
                        InvisibleFragment this$7 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$7, "this$0");
                        this$7.h(new f(this$7, (Boolean) obj, 1));
                        return;
                    default:
                        InvisibleFragment this$8 = this.f40067b;
                        Intrinsics.checkNotNullParameter(this$8, "this$0");
                        if (this$8.f()) {
                            ChainTask chainTask = this$8.f24647c;
                            if (chainTask == null) {
                                Intrinsics.n("task");
                                throw null;
                            }
                            h hVar = this$8.f24646b;
                            if (hVar != null) {
                                chainTask.requestAgain(new ArrayList(hVar.f40084i));
                                return;
                            } else {
                                Intrinsics.n("pb");
                                throw null;
                            }
                        }
                        return;
                }
            }
        }), "registerForActivityResul…)\n            }\n        }");
    }

    public final boolean f() {
        return (this.f24646b == null || this.f24647c == null) ? false : true;
    }

    public final void g() {
        if (f()) {
            if (Settings.canDrawOverlays(requireContext())) {
                ChainTask chainTask = this.f24647c;
                if (chainTask != null) {
                    chainTask.finish();
                    return;
                } else {
                    Intrinsics.n("task");
                    throw null;
                }
            }
            if (this.f24646b == null) {
                Intrinsics.n("pb");
                throw null;
            }
            if (this.f24646b != null) {
                return;
            }
            Intrinsics.n("pb");
            throw null;
        }
    }

    public final void h(Function0 function0) {
        this.f24645a.post(new b(function0));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (f() && this.f24646b == null) {
            Intrinsics.n("pb");
            throw null;
        }
    }
}
