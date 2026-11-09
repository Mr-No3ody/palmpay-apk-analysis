package p222oc;

import Cc.a;
import android.text.TextUtils;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.model.Headers;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.l;
import com.bumptech.glide.load.model.q;
import com.bumptech.glide.load.model.r;
import com.bumptech.glide.load.model.s;
import com.bumptech.glide.load.model.t;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.MerchantLogo;
import com.transsnet.palmpay.core.bean.req.GetS3PreSignedUrlForDownload;
import com.transsnet.palmpay.core.bean.rsp.CommonStringResult;
import com.transsnet.palmpay.core.manager.FileUploadManager;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.main.export.bean.rsp.MerchantLogoRsp;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import df.d;
import df.i;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p298tf.f;
import p324va.c;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements ModelLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModelLoader f40275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f40276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f40277c;

    public e(ModelLoader modelLoader, s sVar, int i7) {
        this.f40277c = i7;
        this.f40275a = modelLoader;
        this.f40276b = sVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.model.ModelLoader
    public final t buildLoadData(Object obj, int i7, int i10, h hVar) {
        l lVar;
        String str;
        s sVar = this.f40276b;
        if (sVar != null) {
            r rVarA = r.a(i7, i10, obj);
            Object objA = ((q) sVar.f20866a).a(rVarA);
            ArrayDeque arrayDeque = r.f20862d;
            synchronized (arrayDeque) {
                arrayDeque.offer(rVarA);
            }
            lVar = (l) objA;
        } else {
            lVar = null;
        }
        if (lVar == null) {
            switch (this.f40277c) {
                case 0:
                    try {
                        d<CommonBeanResult<MerchantLogoRsp>> merchantLogo = ((IApiMainService) a.f1353a.f39520b).getMerchantLogo(((MerchantLogo) obj).merchantNo);
                        i iVar = f.f42629b;
                        CommonBeanResult commonBeanResult = (CommonBeanResult) merchantLogo.k(iVar).i(iVar).b();
                        str = !commonBeanResult.isSuccess() ? null : ((MerchantLogoRsp) commonBeanResult.data).businessLogoUrl;
                    } catch (Exception e10) {
                        F6.d.c("MerchantLogoUrlLoader", "getUrl: ", e10);
                    }
                    break;
                default:
                    Rb.a aVar = (Rb.a) obj;
                    try {
                        String str2 = aVar.f7966a;
                        if (!FileUploadManager.isPrivateS3ImageUrl(str2)) {
                            str = aVar.f7966a;
                        } else {
                            GetS3PreSignedUrlForDownload getS3PreSignedUrlForDownload = new GetS3PreSignedUrlForDownload();
                            getS3PreSignedUrlForDownload.bucketName = FileUploadManager.parseBucketName(str2);
                            getS3PreSignedUrlForDownload.expiration = 3600000L;
                            String strSubstring = new URL(str2).getPath().substring(1);
                            getS3PreSignedUrlForDownload.filePath = strSubstring;
                            if (strSubstring.contains(getS3PreSignedUrlForDownload.bucketName)) {
                                getS3PreSignedUrlForDownload.filePath = getS3PreSignedUrlForDownload.filePath.replace(getS3PreSignedUrlForDownload.bucketName + "/", "");
                            }
                            d<CommonStringResult> dVarGeneratePreSignedUrlForDownload = ((PayApiService) c.f43141a.f14621b).generatePreSignedUrlForDownload(getS3PreSignedUrlForDownload);
                            i iVar2 = f.f42629b;
                            CommonStringResult commonStringResult = (CommonStringResult) dVarGeneratePreSignedUrlForDownload.k(iVar2).i(iVar2).b();
                            if (!commonStringResult.isSuccess()) {
                                str = aVar.f7966a;
                            } else {
                                str = commonStringResult.data;
                            }
                        }
                    } catch (Exception e11) {
                        F6.d.c("ImageUrlV2Loader", "getUrl: ", e11);
                    }
                    break;
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            lVar = new l(str, Headers.f20819a);
            if (sVar != null) {
                ((q) sVar.f20866a).d(r.a(i7, i10, obj), lVar);
            }
        }
        List list = Collections.EMPTY_LIST;
        t tVarBuildLoadData = this.f40275a.buildLoadData(lVar, i7, i10, hVar);
        if (tVarBuildLoadData == null || list.isEmpty()) {
            return tVarBuildLoadData;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new l((String) it.next()));
        }
        return new t(tVarBuildLoadData.f20867a, arrayList, tVarBuildLoadData.f20869c);
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final /* bridge */ /* synthetic */ boolean handles(Object obj) {
        switch (this.f40277c) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
