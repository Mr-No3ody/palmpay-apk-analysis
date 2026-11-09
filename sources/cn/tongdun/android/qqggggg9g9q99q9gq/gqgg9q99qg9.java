package cn.tongdun.android.qqggggg9g9q99q9gq;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class gqgg9q99qg9 {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private List f19238q999ggg99999qqggqqg9qg = new ArrayList();
    private boolean qgq9qg99 = false;

    public final void q999ggg99999qqggqqg9qg(qgqq999g qgqq999gVar) {
        if (qgqq999gVar == null || qgqq999gVar.q999ggg99999qqggqqg9qg()) {
            return;
        }
        if (qgqq999gVar.qgq9qg99()) {
            this.f19238q999ggg99999qqggqqg9qg.add(0, qgqq999gVar);
        } else {
            this.f19238q999ggg99999qqggqqg9qg.add(qgqq999gVar);
        }
        this.qgq9qg99 = qgqq999gVar.qgq9qg99() | this.qgq9qg99;
    }

    public final JSONObject q999ggg99999qqggqqg9qg() {
        boolean z3;
        qgqq999g qgqq999gVar = null;
        if (this.f19238q999ggg99999qqggqqg9qg.isEmpty()) {
            return null;
        }
        for (qgqq999g qgqq999gVar2 : this.f19238q999ggg99999qqggqqg9qg) {
            if (qgqq999gVar2 != null && (((z3 = this.qgq9qg99) && qgqq999gVar2.f19248q999ggg99999qqggqqg9qg != null) || (!z3 && qgqq999gVar2.qgq9qg99 != null))) {
                qgqq999gVar = qgqq999gVar2;
                break;
            }
        }
        return qgqq999gVar != null ? qgqq999gVar.qqggggg9g9q99q9gq() : new JSONObject();
    }
}
