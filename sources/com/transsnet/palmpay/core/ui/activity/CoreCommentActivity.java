package com.transsnet.palmpay.core.ui.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.adapter.CommentRvAdapter$GrabShareInterface;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.CommentImgItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/coreImpl/comment_add")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/core/ui/activity/CoreCommentActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "Lcom/transsnet/palmpay/core/adapter/CommentRvAdapter$GrabShareInterface;", "<init>", "()V", "a", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCoreCommentActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreCommentActivity.kt\ncom/transsnet/palmpay/core/ui/activity/CoreCommentActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,198:1\n1#2:199\n32#3,2:200\n*S KotlinDebug\n*F\n+ 1 CoreCommentActivity.kt\ncom/transsnet/palmpay/core/ui/activity/CoreCommentActivity\n*L\n137#1:200,2\n*E\n"})
public final class CoreCommentActivity extends BaseActivity implements CommentRvAdapter$GrabShareInterface {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f27529j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p355xf.t f27530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p355xf.t f27531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p355xf.t f27532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p355xf.t f27533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p355xf.t f27534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f27535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f27536g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p052da.D f27537i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public CoreCommentActivity() {
        final int i7 = 0;
        this.f27530a = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreCommentActivity f27630b;

            {
                this.f27630b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoreCommentActivity coreCommentActivity = this.f27630b;
                switch (i7) {
                    case 0:
                        int i10 = CoreCommentActivity.f27529j;
                        return (CheckBox) coreCommentActivity.findViewById(L9.a.cbAnonymous);
                    case 1:
                        int i11 = CoreCommentActivity.f27529j;
                        return (PpButton) coreCommentActivity.findViewById(L9.a.btnPublish);
                    case 2:
                        int i12 = CoreCommentActivity.f27529j;
                        return (RecyclerView) coreCommentActivity.findViewById(L9.a.rvGrabShareImg);
                    case 3:
                        int i13 = CoreCommentActivity.f27529j;
                        return (TextView) coreCommentActivity.findViewById(L9.a.tvCount);
                    default:
                        int i14 = CoreCommentActivity.f27529j;
                        return (EditText) coreCommentActivity.findViewById(L9.a.editComment);
                }
            }
        });
        final int i10 = 1;
        this.f27531b = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreCommentActivity f27630b;

            {
                this.f27630b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoreCommentActivity coreCommentActivity = this.f27630b;
                switch (i10) {
                    case 0:
                        int i11 = CoreCommentActivity.f27529j;
                        return (CheckBox) coreCommentActivity.findViewById(L9.a.cbAnonymous);
                    case 1:
                        int i12 = CoreCommentActivity.f27529j;
                        return (PpButton) coreCommentActivity.findViewById(L9.a.btnPublish);
                    case 2:
                        int i13 = CoreCommentActivity.f27529j;
                        return (RecyclerView) coreCommentActivity.findViewById(L9.a.rvGrabShareImg);
                    case 3:
                        int i14 = CoreCommentActivity.f27529j;
                        return (TextView) coreCommentActivity.findViewById(L9.a.tvCount);
                    default:
                        int i15 = CoreCommentActivity.f27529j;
                        return (EditText) coreCommentActivity.findViewById(L9.a.editComment);
                }
            }
        });
        final int i11 = 2;
        this.f27532c = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreCommentActivity f27630b;

            {
                this.f27630b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoreCommentActivity coreCommentActivity = this.f27630b;
                switch (i11) {
                    case 0:
                        int i12 = CoreCommentActivity.f27529j;
                        return (CheckBox) coreCommentActivity.findViewById(L9.a.cbAnonymous);
                    case 1:
                        int i13 = CoreCommentActivity.f27529j;
                        return (PpButton) coreCommentActivity.findViewById(L9.a.btnPublish);
                    case 2:
                        int i14 = CoreCommentActivity.f27529j;
                        return (RecyclerView) coreCommentActivity.findViewById(L9.a.rvGrabShareImg);
                    case 3:
                        int i15 = CoreCommentActivity.f27529j;
                        return (TextView) coreCommentActivity.findViewById(L9.a.tvCount);
                    default:
                        int i16 = CoreCommentActivity.f27529j;
                        return (EditText) coreCommentActivity.findViewById(L9.a.editComment);
                }
            }
        });
        final int i12 = 3;
        this.f27533d = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreCommentActivity f27630b;

            {
                this.f27630b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoreCommentActivity coreCommentActivity = this.f27630b;
                switch (i12) {
                    case 0:
                        int i13 = CoreCommentActivity.f27529j;
                        return (CheckBox) coreCommentActivity.findViewById(L9.a.cbAnonymous);
                    case 1:
                        int i14 = CoreCommentActivity.f27529j;
                        return (PpButton) coreCommentActivity.findViewById(L9.a.btnPublish);
                    case 2:
                        int i15 = CoreCommentActivity.f27529j;
                        return (RecyclerView) coreCommentActivity.findViewById(L9.a.rvGrabShareImg);
                    case 3:
                        int i16 = CoreCommentActivity.f27529j;
                        return (TextView) coreCommentActivity.findViewById(L9.a.tvCount);
                    default:
                        int i17 = CoreCommentActivity.f27529j;
                        return (EditText) coreCommentActivity.findViewById(L9.a.editComment);
                }
            }
        });
        final int i13 = 4;
        this.f27534e = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CoreCommentActivity f27630b;

            {
                this.f27630b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoreCommentActivity coreCommentActivity = this.f27630b;
                switch (i13) {
                    case 0:
                        int i14 = CoreCommentActivity.f27529j;
                        return (CheckBox) coreCommentActivity.findViewById(L9.a.cbAnonymous);
                    case 1:
                        int i15 = CoreCommentActivity.f27529j;
                        return (PpButton) coreCommentActivity.findViewById(L9.a.btnPublish);
                    case 2:
                        int i16 = CoreCommentActivity.f27529j;
                        return (RecyclerView) coreCommentActivity.findViewById(L9.a.rvGrabShareImg);
                    case 3:
                        int i17 = CoreCommentActivity.f27529j;
                        return (TextView) coreCommentActivity.findViewById(L9.a.tvCount);
                    default:
                        int i18 = CoreCommentActivity.f27529j;
                        return (EditText) coreCommentActivity.findViewById(L9.a.editComment);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.adapter.CommentRvAdapter$GrabShareInterface
    public final void chooseImg() {
        ARouter.getInstance().build("/account/setUserPhoto").withBoolean("photoBig", true).withBoolean("crop_photo", false).withBoolean("private_photo", false).navigation(this, 16);
    }

    @Override // com.transsnet.palmpay.core.adapter.CommentRvAdapter$GrabShareInterface
    public final void closeShareImg(int i7) {
        p052da.D d2 = this.f27537i;
        if (d2 == null) {
            Intrinsics.n("mAdapter");
            throw null;
        }
        d2.f35677c.remove(i7);
        p052da.D d10 = this.f27537i;
        if (d10 != null) {
            d10.notifyDataSetChanged();
        } else {
            Intrinsics.n("mAdapter");
            throw null;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return L9.b.core_activity_comment;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        ((EditText) this.f27534e.getValue()).addTextChangedListener(new R3.e(this, 11));
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (16 == i7 && i10 == -1) {
            if (intent != null) {
                String stringExtra = intent.getStringExtra("photoUrl");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                Uri data = intent.getData();
                if (data != null && data.getPath() != null) {
                    p052da.D d2 = this.f27537i;
                    if (d2 == null) {
                        Intrinsics.n("mAdapter");
                        throw null;
                    }
                    d2.f35677c.add(new CommentImgItem(data, stringExtra));
                }
            }
            p052da.D d10 = this.f27537i;
            if (d10 != null) {
                d10.notifyDataSetChanged();
            } else {
                Intrinsics.n("mAdapter");
                throw null;
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        this.f27537i = new p052da.D(this, this);
        p355xf.t tVar = this.f27532c;
        ((RecyclerView) tVar.getValue()).setLayoutManager(new GridLayoutManager(this, 3));
        RecyclerView recyclerView = (RecyclerView) tVar.getValue();
        p052da.D d2 = this.f27537i;
        if (d2 == null) {
            Intrinsics.n("mAdapter");
            throw null;
        }
        recyclerView.setAdapter(d2);
        ((PpButton) this.f27531b.getValue()).setOnClickListener(new Yd.i(this, 24));
    }
}
