package com.transsnet.palmpay.jara_packet.ui.model.comments;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import com.transsnet.palmpay.jara_packet.bean.resp.CommentResp;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p236pc.d;
import p236pc.e;
import yc.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/ui/model/comments/ReferEarnCommentsView;", "Lcom/transsnet/palmpay/custom_view/model/BaseModel;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/transsnet/palmpay/jara_packet/ui/model/comments/AutoPollRecyclerView;", "c", "Lcom/transsnet/palmpay/jara_packet/ui/model/comments/AutoPollRecyclerView;", "getMRecyclerView", "()Lcom/transsnet/palmpay/jara_packet/ui/model/comments/AutoPollRecyclerView;", "setMRecyclerView", "(Lcom/transsnet/palmpay/jara_packet/ui/model/comments/AutoPollRecyclerView;)V", "mRecyclerView", "Lyc/b;", "d", "Lyc/b;", "getMAdapter", "()Lyc/b;", "setMAdapter", "(Lyc/b;)V", "mAdapter", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReferEarnCommentsView extends BaseModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f31984e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public AutoPollRecyclerView mRecyclerView;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public b mAdapter;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ReferEarnCommentsView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View viewInflate = View.inflate(context, e.jp_re_comments_view, this);
        setMRecyclerView((AutoPollRecyclerView) viewInflate.findViewById(d.rvComments));
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(CommonBeanResult resp) {
        Intrinsics.checkNotNullParameter(resp, "resp");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        setMAdapter(new b(context));
        getMAdapter().f4986c = new p184m8.b(23);
        WrapContentGridLayoutManager wrapContentGridLayoutManager = new WrapContentGridLayoutManager(2, 0);
        wrapContentGridLayoutManager.setAutoMeasureEnabled(true);
        getMRecyclerView().setLayoutManager(wrapContentGridLayoutManager);
        getMRecyclerView().setAdapter(getMAdapter());
        getMAdapter().b();
        getMAdapter().a(((CommentResp) resp.data).list);
        AutoPollRecyclerView mRecyclerView = getMRecyclerView();
        if (mRecyclerView.f31982b) {
            mRecyclerView.f31982b = false;
            mRecyclerView.removeCallbacks(mRecyclerView.f31981a);
        }
        mRecyclerView.f31983c = true;
        mRecyclerView.f31982b = true;
        mRecyclerView.postDelayed(mRecyclerView.f31981a, 16L);
        if (getMAdapter().f4985b.size() < 5) {
            setVisibility(8);
        }
    }

    @NotNull
    public final b getMAdapter() {
        b bVar = this.mAdapter;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.n("mAdapter");
        throw null;
    }

    @NotNull
    public final AutoPollRecyclerView getMRecyclerView() {
        AutoPollRecyclerView autoPollRecyclerView = this.mRecyclerView;
        if (autoPollRecyclerView != null) {
            return autoPollRecyclerView;
        }
        Intrinsics.n("mRecyclerView");
        throw null;
    }

    public final void setMAdapter(@NotNull b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.mAdapter = bVar;
    }

    public final void setMRecyclerView(@NotNull AutoPollRecyclerView autoPollRecyclerView) {
        Intrinsics.checkNotNullParameter(autoPollRecyclerView, "<set-?>");
        this.mRecyclerView = autoPollRecyclerView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ReferEarnCommentsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ReferEarnCommentsView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ReferEarnCommentsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
