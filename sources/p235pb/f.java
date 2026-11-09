package p235pb;

import Pa.r0;
import android.text.TextUtils;
import com.transsnet.palmpay.credit.bean.resp.RecipientListResp;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements ObservableOnSubscribe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f41282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f41283b;

    public f(List list, String str) {
        this.f41282a = list;
        this.f41283b = str;
    }

    @Override // io.reactivex.ObservableOnSubscribe
    public final void subscribe(ObservableEmitter observableEmitter) {
        ArrayList arrayList = new ArrayList();
        for (RecipientListResp.RecipientBean recipientBean : this.f41282a) {
            boolean zIsEmpty = TextUtils.isEmpty(recipientBean.getRecipientPhone());
            String str = this.f41283b;
            if (!zIsEmpty && recipientBean.getRecipientPhone().toUpperCase().contains(str.toUpperCase())) {
                arrayList.add(recipientBean);
            } else if (TextUtils.isEmpty(recipientBean.getRecipientNickname()) || !recipientBean.getRecipientNickname().toUpperCase().contains(str.toUpperCase())) {
                String strB0 = r0.b0(recipientBean.getRecipientFirstName(), null, recipientBean.getRecipientLastName());
                if (!TextUtils.isEmpty(strB0) && strB0.toUpperCase().contains(str.toUpperCase())) {
                    arrayList.add(recipientBean);
                }
            } else {
                arrayList.add(recipientBean);
            }
        }
        observableEmitter.onNext(arrayList);
        observableEmitter.onComplete();
    }
}
