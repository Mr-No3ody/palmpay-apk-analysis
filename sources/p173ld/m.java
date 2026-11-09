package p173ld;

import Jd.c;
import M1.k;
import com.chad.library.adapter.base.entity.SectionEntity;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.BankInfo;
import p159kd.e;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends k {
    @Override // M1.k
    public final void b(BaseViewHolder baseViewHolder, SectionEntity sectionEntity) {
        baseViewHolder.setText(e.title_tv, c.c(((BankInfo) sectionEntity).bankName));
    }

    @Override // M1.j
    public final void convert(BaseViewHolder baseViewHolder, Object obj) {
        baseViewHolder.setText(e.bank_name, ((BankInfo) obj).bankName);
    }
}
