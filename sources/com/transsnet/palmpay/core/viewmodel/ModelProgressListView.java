package com.transsnet.palmpay.core.viewmodel;

import Gd.n;
import M3.f;
import Ua.g0;
import Ua.h0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.microsoft.codepush.react.CodePushConstants;
import com.transsnet.palmpay.custom_view.model.BaseLinearLayout;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.e;
import p025ba.g;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001&B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000f\u001a\u00020\u000e2\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\f¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010*\u001a\u00060&R\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/transsnet/palmpay/core/viewmodel/ModelProgressListView;", "Lcom/transsnet/palmpay/custom_view/model/BaseLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "list", "", "setData", "(Ljava/util/ArrayList;)V", "c", "I", "getProgress", "()I", "setProgress", "(I)V", ReactProgressBarViewManager.PROP_PROGRESS, "", "d", "J", "getTime", "()J", "setTime", "(J)V", CodePushConstants.LATEST_ROLLBACK_TIME_KEY, "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "e", "Lkotlin/Lazy;", "getLayoutManager", "()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "layoutManager", "LUa/h0;", "f", "getAdapter", "()LUa/h0;", "adapter", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModelProgressListView extends BaseLinearLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f28419g = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int progress;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public long time;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f28422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f28423f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelProgressListView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final h0 getAdapter() {
        return (h0) this.f28423f.getValue();
    }

    private final RecyclerView.LayoutManager getLayoutManager() {
        return (RecyclerView.LayoutManager) this.f28422e.getValue();
    }

    public final int getProgress() {
        return this.progress;
    }

    public final long getTime() {
        return this.time;
    }

    public final void setData(@Nullable ArrayList<String> list) {
        getAdapter().setList(list);
    }

    public final void setProgress(int i7) {
        this.progress = i7;
    }

    public final void setTime(long j6) {
        this.time = j6;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelProgressListView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelProgressListView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelProgressListView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.time = 1000L;
        this.f28422e = C2131j.b(new n(context, 5));
        this.f28423f = C2131j.b(new f(this, 21));
        View.inflate(context, g.core_layout_progress_list_view, this);
        setOrientation(1);
        RecyclerView recyclerView = (RecyclerView) findViewById(e.rv_progress);
        recyclerView.setLayoutManager(getLayoutManager());
        recyclerView.addItemDecoration(new g0());
        recyclerView.setAdapter(getAdapter());
    }
}
