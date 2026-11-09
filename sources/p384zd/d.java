package p384zd;

import Ef.a;
import Ff.h;
import Jd.c;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.send_money.ui.activity.transfer_via_ussd.SelectBankForTransferViaUssdDialog;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import p173ld.m;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f44678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectBankForTransferViaUssdDialog f44679b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SelectBankForTransferViaUssdDialog selectBankForTransferViaUssdDialog, Continuation continuation) {
        super(2, continuation);
        this.f44679b = selectBankForTransferViaUssdDialog;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        d dVar = new d(this.f44679b, continuation);
        dVar.f44678a = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        List<BankInfo> list = (List) this.f44678a;
        SelectBankForTransferViaUssdDialog.a aVar2 = SelectBankForTransferViaUssdDialog.f33621Y;
        m mVarJ = this.f44679b.j();
        if (mVarJ != null) {
            ArrayList arrayList = new ArrayList();
            for (BankInfo bankInfo : list) {
                if (TextUtils.isEmpty(bankInfo.indexType)) {
                    arrayList.add(bankInfo);
                }
            }
            mVarJ.setList(c.g(arrayList));
        }
        return Unit.f38893a;
    }
}
