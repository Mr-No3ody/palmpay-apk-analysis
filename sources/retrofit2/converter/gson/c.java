package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.transsnet.palmpay.core.bean.CommonResult;
import java.io.IOException;
import okhttp3.h0;
import retrofit2.Converter;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gson f41925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TypeAdapter f41926c;

    public /* synthetic */ c(Gson gson, TypeAdapter typeAdapter, int i7) {
        this.f41924a = i7;
        this.f41925b = gson;
        this.f41926c = typeAdapter;
    }

    @Override // retrofit2.Converter
    public final Object convert(Object obj) {
        switch (this.f41924a) {
            case 0:
                h0 h0Var = (h0) obj;
                JsonReader jsonReaderNewJsonReader = this.f41925b.newJsonReader(h0Var.charStream());
                try {
                    Object obj2 = this.f41926c.read2(jsonReaderNewJsonReader);
                    if (jsonReaderNewJsonReader.peek() != JsonToken.END_DOCUMENT) {
                        throw new JsonIOException("JSON document was not fully consumed.");
                    }
                    h0Var.close();
                    return obj2;
                } catch (Throwable th) {
                    h0Var.close();
                    throw th;
                }
            default:
                h0 h0Var2 = (h0) obj;
                JsonReader jsonReaderNewJsonReader2 = this.f41925b.newJsonReader(h0Var2.charStream());
                try {
                    if (h0Var2.contentLength() == 0) {
                        throw new IOException("response is null");
                    }
                    Object obj3 = this.f41926c.read2(jsonReaderNewJsonReader2);
                    if (jsonReaderNewJsonReader2.peek() != JsonToken.END_DOCUMENT) {
                        throw new JsonIOException("JSON document was not fully consumed.");
                    }
                    if (obj3 instanceof CommonResult) {
                        CommonResult commonResult = (CommonResult) obj3;
                        if (CommonResult.CODE_OTHER_DEVICE_ONLINE.equals(commonResult.getRespCode())) {
                            commonResult.setRespMsg("");
                        }
                    }
                    h0Var2.close();
                    return obj3;
                } catch (Throwable th2) {
                    h0Var2.close();
                    throw th2;
                }
        }
    }
}
