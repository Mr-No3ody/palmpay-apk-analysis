package p339wb;

import M1.j;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.credit.bean.rsp.SysConfigValue;
import kotlin.jvm.internal.Intrinsics;
import p116hb.b;
import p116hb.c;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SysConfigValue f43387a;

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        SysConfigValue item = (SysConfigValue) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        holder.setText(c.tv_language, item.getKeyText());
        if (Intrinsics.c(this.f43387a, item)) {
            holder.setBackgroundResource(c.tv_language, b.cs_selected_language);
        } else {
            holder.setBackgroundResource(c.tv_language, b.cs_unselected_language);
        }
    }
}
