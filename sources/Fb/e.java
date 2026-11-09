package Fb;

import com.transsnet.palmpay.core.bean.PalmPayContact;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        PalmPayContact palmPayContact = (PalmPayContact) obj;
        PalmPayContact palmPayContact2 = (PalmPayContact) obj2;
        if (palmPayContact == null) {
            return -1;
        }
        if (palmPayContact2 == null) {
            return 1;
        }
        if (p059e1.a.t(palmPayContact.getAlias()).equals("#") && !p059e1.a.t(palmPayContact.getAlias()).equals("#")) {
            return 1;
        }
        if (p059e1.a.t(palmPayContact.getAlias()).equals("#") || !p059e1.a.t(palmPayContact.getAlias()).equals("#")) {
            return palmPayContact.getAlias().compareToIgnoreCase(palmPayContact2.getAlias());
        }
        return -1;
    }
}
