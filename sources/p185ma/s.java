package p185ma;

import Pa.i0;
import Z4.e;
import android.content.Context;
import com.facebook.imagepipeline.nativecode.b;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.req.CommonShareReq;
import com.transsnet.palmpay.core.bean.rsp.CommonShareNewRsp;
import com.transsnet.palmpay.core.bean.rsp.CommonStringResult;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import p103gf.a;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f39622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CommonShareReq f39623g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f39624i;

    public /* synthetic */ s(t tVar, CommonShareReq commonShareReq, int i7) {
        this.f39622f = i7;
        this.f39624i = tVar;
        this.f39623g = commonShareReq;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        switch (this.f39622f) {
            case 0:
                t tVar = this.f39624i;
                if (((a) tVar.f39629e) == null) {
                    tVar.f39629e = new a();
                }
                ((a) tVar.f39629e).add(disposable);
                break;
            default:
                t tVar2 = this.f39624i;
                if (((a) tVar2.f39629e) == null) {
                    tVar2.f39629e = new a();
                }
                ((a) tVar2.f39629e).add(disposable);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String str) {
        switch (this.f39622f) {
            case 0:
                ToastUtils.showShort(str);
                t tVar = this.f39624i;
                a aVar = (a) tVar.f39629e;
                if (aVar != null) {
                    aVar.dispose();
                    tVar.f39629e = null;
                }
                break;
            default:
                ToastUtils.showShort(str);
                t tVar2 = this.f39624i;
                a aVar2 = (a) tVar2.f39629e;
                if (aVar2 != null) {
                    aVar2.dispose();
                    tVar2.f39629e = null;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z4.e
    public final void y(Object obj) {
        switch (this.f39622f) {
            case 0:
                CommonStringResult commonStringResult = (CommonStringResult) obj;
                boolean zIsSuccess = commonStringResult.isSuccess();
                t tVar = this.f39624i;
                if (zIsSuccess) {
                    int i7 = CommonShareReq.TYPE_RETURN_WEB_PAGE_PATH_AND_SHARE_TEXT;
                    CommonShareReq commonShareReq = this.f39623g;
                    if (i7 == commonShareReq.type) {
                        String str = commonStringResult.data;
                        tVar.getClass();
                        b.E((Context) tVar.f39630f, (String) tVar.f39627c, str);
                    }
                    if (CommonShareReq.TYPE_SEND_NOTIFICATION == commonShareReq.type) {
                        ToastUtils.showShort(commonStringResult.getRespMsg());
                        i0.f0(commonShareReq.businessType, commonShareReq.memberId);
                    }
                } else {
                    ToastUtils.showShort(commonStringResult.getRespMsg());
                }
                a aVar = (a) tVar.f39629e;
                if (aVar != null) {
                    aVar.dispose();
                    tVar.f39629e = null;
                }
                break;
            default:
                CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
                boolean zIsSuccess2 = commonBeanResult.isSuccess();
                t tVar2 = this.f39624i;
                if (zIsSuccess2) {
                    int i10 = CommonShareReq.TYPE_RETURN_WEB_PAGE_PATH_AND_SHARE_TEXT;
                    CommonShareReq commonShareReq2 = this.f39623g;
                    if (i10 == commonShareReq2.type) {
                        String str2 = ((CommonShareNewRsp) commonBeanResult.data).url;
                        tVar2.getClass();
                        b.E((Context) tVar2.f39630f, (String) tVar2.f39627c, str2);
                    }
                    if (CommonShareReq.TYPE_SEND_NOTIFICATION == commonShareReq2.type) {
                        ToastUtils.showShort(commonBeanResult.getRespMsg());
                        i0.f0(commonShareReq2.businessType, commonShareReq2.memberId);
                    }
                } else {
                    ToastUtils.showShort(commonBeanResult.getRespMsg());
                }
                a aVar2 = (a) tVar2.f39629e;
                if (aVar2 != null) {
                    aVar2.dispose();
                    tVar2.f39629e = null;
                }
                break;
        }
    }
}
