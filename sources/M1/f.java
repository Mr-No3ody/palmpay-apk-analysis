package M1;

import android.util.SparseArray;
import android.view.View;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseViewHolder f5732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f5733c;

    public /* synthetic */ f(BaseViewHolder baseViewHolder, j jVar, int i7) {
        this.f5731a = i7;
        this.f5732b = baseViewHolder;
        this.f5733c = jVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View v3) {
        switch (this.f5731a) {
            case 0:
                BaseViewHolder viewHolder = this.f5732b;
                Intrinsics.checkNotNullParameter(viewHolder, "$viewHolder");
                j this$0 = this.f5733c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
                if (bindingAdapterPosition == -1) {
                    return false;
                }
                int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
                Intrinsics.checkNotNullExpressionValue(v3, "v");
                return this$0.setOnItemLongClick(v3, headerLayoutCount);
            case 1:
                BaseViewHolder viewHolder2 = this.f5732b;
                Intrinsics.checkNotNullParameter(viewHolder2, "$viewHolder");
                j this$1 = this.f5733c;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                int bindingAdapterPosition2 = viewHolder2.getBindingAdapterPosition();
                if (bindingAdapterPosition2 == -1) {
                    return false;
                }
                int headerLayoutCount2 = bindingAdapterPosition2 - this$1.getHeaderLayoutCount();
                Intrinsics.checkNotNullExpressionValue(v3, "v");
                return this$1.setOnItemChildLongClick(v3, headerLayoutCount2);
            default:
                BaseViewHolder helper = this.f5732b;
                Intrinsics.checkNotNullParameter(helper, "$viewHolder");
                d this$2 = (d) this.f5733c;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                int bindingAdapterPosition3 = helper.getBindingAdapterPosition();
                if (bindingAdapterPosition3 == -1) {
                    return false;
                }
                int headerLayoutCount3 = bindingAdapterPosition3 - this$2.getHeaderLayoutCount();
                T1.b bVar = (T1.b) ((SparseArray) this$2.f5727a.getValue()).get(helper.getItemViewType());
                Intrinsics.checkNotNullExpressionValue(v3, "it");
                this$2.getData().get(headerLayoutCount3);
                bVar.getClass();
                Intrinsics.checkNotNullParameter(helper, "helper");
                Intrinsics.checkNotNullParameter(v3, "view");
                return false;
        }
    }
}
